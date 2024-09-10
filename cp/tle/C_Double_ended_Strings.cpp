#include<bits/stdc++.h>
#define ll long long
using namespace std;

int maxCommStr(const string& s1, const string& s2) {
    int m = s1.length();
    int n = s2.length();
    int res = 0;
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            int curr = 0;
            while ((i + curr) < m && (j + curr) < n 
                   && s1[i + curr] == s2[j + curr]) {
                curr++;
            }
            res = max(res, curr);
        }
    }
    return res;
}

int main(){
    ll test;
    cin>>test;
    while(test--){
        string s1,s2;
        cin>>s1>>s2;
        int n = s1.length(), m = s2.length();
        int len = maxCommStr(s1,s2);
        cout<<(n-len)+(m-len)<<endl;
    }
}