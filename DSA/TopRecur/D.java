import java.util.*;
import java.util.AbstractMap.SimpleEntry;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class D {
    public static void bottom(Node node) {
        // Map to store the bottom view
        HashMap<Integer, Integer> map = new HashMap<>();
        // Queue for level order traversal with vertical distance as a second value
        Queue<SimpleEntry<Node, Integer>> q = new LinkedList<>();
        q.add(new SimpleEntry<>(node, 0));

        while (!q.isEmpty()) {
            SimpleEntry<Node, Integer> curr = q.peek();
            q.poll();
            Node cur_node = curr.getKey();
            int line = curr.getValue();
            // Update the map with the current node's data
            map.put(line, cur_node.data);
            if (cur_node.left != null) {
                q.add(new SimpleEntry<>(cur_node.left, line - 1));
            }
            if (cur_node.right != null) {
                q.add(new SimpleEntry<>(cur_node.right, line + 1));
            }
        }

        // Print the bottom view from the map, sorted by the line number
        map.entrySet().stream()
           .sorted(Map.Entry.comparingByKey())
           .forEach(entry -> System.out.print(entry.getValue() + " "));
    }

    public static void main(String[] args) {
        Node root = new Node(21);
        root.left = new Node(9);
        root.right = new Node(23);
        root.left.left = new Node(6);
        root.left.right = new Node(10);
        root.left.right.left = new Node(9);
        root.left.right.right = new Node(14);
        root.right.left = new Node(21);
        root.right.right = new Node(25);

        bottom(root);
    }
}
