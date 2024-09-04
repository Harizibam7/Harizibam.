#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int t;
    cin >> t;
    while (t--) {
        long long x, y, k;
        cin >> x >> y >> k;
        
        // Calculate the number of jumps required in each direction
        long long jumps_x = (x + k - 1) / k; // Ceiling of x / k
        long long jumps_y = (y + k - 1) / k; // Ceiling of y / k
        
        // The total number of jumps is determined by the maximum of jumps_x and jumps_y
        long long min_jumps = max(jumps_x, jumps_y);
        
        // We need to ensure we can accommodate both x and y jumps in the sequence of moves
        cout << min_jumps * 2 - (jumps_x == jumps_y) << endl;
    }
    return 0;
}
