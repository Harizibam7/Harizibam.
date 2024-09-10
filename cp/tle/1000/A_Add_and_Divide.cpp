#include<bits/stdc++.h>
#define ll long long
using namespace std;

int main() {
    ll test;
    cin >> test;
    while(test--) {
        ll a, b;
        cin >> a >> b;
        
        if(b > a) {
            cout << 1 << endl;
        } else if(a == b) {
            cout << 1 << endl;
        } else {
            ll count = 0;
            double x = a;
            double base = b;  
            ll log_result = (ll)(log(x) / log(base));
            
        }
    }
    return 0;
}
