#include<bits/stdc++.h>
#define ll long long
using namespace std;
bool perfect_square(ll a){
    ll val = (ll)sqrt(a);
    return (val*val) == a;
}
int main(){
    ll test;
    cin>>test;
    while(test--){
        ll n;
        cin>>n;
        string str;
        cin>>str;
        if(!perfect_square(n)){
            cout<<"No"<<endl;
        
        }else{
            ll one = 0;
            ll zero = 0;
            for(ll i =0; i< n;i++){
                if(str[i] == '1'){
                    one++;
                }else{
                    zero++;
                }
            }
            if(!perfect_square(zero)){
                cout<<"No"<<endl;
            }else{
                ll val =  pow(((ll)sqrt(zero)) + 2,2);
                val -= zero;
                if(val == one){
                    cout<<"Yes"<<endl;
                }else{
                    cout<<"No"<<endl;
                }
            }
        }
    }
}
