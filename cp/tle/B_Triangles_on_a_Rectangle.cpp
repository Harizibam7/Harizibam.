#include<bits/stdc++.h>
#define ll long long
using namespace std;
int main(){
    ll test;
    cin>>test;
    while(test--){
        ll w,h;
        cin>>w>>h;
        ll size;
        cin>>size;
        vector<ll> x_left(size);       
        for(ll i =0; i<size;i++){
            cin>>x_left[i];
        }
        
        ll x_size ;
        cin>>x_size;
        vector<ll> x_right(x_size);       
        for(ll i =0; i<x_size;i++){
            cin>>x_right[i];
        }
        ll y_size ;
        cin>>y_size;
        vector<ll> y_left(y_size);       
        for(ll i =0; i<y_size;i++){
            cin>>y_left[i];
        }
        ll y1_size;
        cin>>y1_size;
        vector<ll> y_right(y1_size);       
        for(ll i =0; i<y1_size;i++){
            cin>>y_right[i];
        }
        ll x_value = max((x_left[size-1] - x_left[0]),x_right[x_size-1] - x_right[0]);
        ll y_value = max((y_left[y_size-1] - y_left[0]),y_right[y1_size-1] - y_right[0]);
        cout<< max(x_value*h, y_value*w)<<endl;
    }
}