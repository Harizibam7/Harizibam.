#include <bits/stdc++.h>
#define ll long long
using namespace std;

int main() {
    ll test;
    cin >> test;
    while (test--) {
        ll n;
        cin >> n;
        vector<vector<char>> arr(n, vector<char>(4));
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                cin >> arr[i][j];
            }
        }
        
     
        vector<ll> columns;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < 4; j++) {
                if (arr[i][j] == '#') {
                    columns.push_back(j + 1);
                }
            }
        }
        
 
        if (!columns.empty()) {
            for (ll col : columns) {
                cout << col << " ";
            }
        }
        cout << endl;
    }
}
