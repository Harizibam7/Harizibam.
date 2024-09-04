#include <iostream>
#include <vector>
#include <unordered_map>
using namespace std;

long long countRightTriangles(const vector<pair<int, int>>& points) {
    unordered_map<int, int> x_count;
    unordered_map<int, int> y_count;
    
    // Count occurrences of x and y coordinates
    for (const auto& p : points) {
        x_count[p.first]++;
        y_count[p.second]++;
    }
    
    long long total_triangles = 0;

    // Calculate the number of right triangles
    for (const auto& p : points) {
        int x = p.first;
        int y = p.second;
        int vertical_points = x_count[x] - 1; // Exclude the point itself
        int horizontal_points = y_count[y] - 1; // Exclude the point itself
        total_triangles += static_cast<long long>(vertical_points) * horizontal_points;
    }
    
    return total_triangles;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int t;
    cin >> t;
    
    while (t--) {
        int n;
        cin >> n;
        
        vector<pair<int, int>> points(n);
        for (int i = 0; i < n; ++i) {
            int x, y;
            cin >> x >> y;
            points[i] = {x, y};
        }
        
        cout << countRightTriangles(points) << endl;
    }
    
    return 0;
}
