#include<bits/stdc++.h>
#define ll long long
using namespace std;
int main(){
    ll test;
    cin>>test;
    while(test--){
        ll one, two;
        cin>>one>>two;
        two = two %2;
        if(one %2 == 1){
            cout<<"NO"<<endl;
        }else if(two== 0 || one >= 2){
            cout<<"YES"<<endl;
        }else{
            cout<<"NO"<<endl;
        }
    }
    return 0;
}
