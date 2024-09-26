#include <bits/stdc++.h>
using namespace std;


#define ll long long
#define ff first
#define ss second
#define pll pair<ll, ll>

#define all(a) (a).begin(), (a).end()
#define rall(a) (a).rbegin(), (a).rend()
#define _test   int _TEST; cin>>_TEST; while(_TEST--)
 


string DecimalToBinary(ll num);

void SieveOfEratosthenes(ll n, set<ll> &v);

ll power(ll x, ll y, ll p);

unsigned long long modInverse(unsigned long long n, int p);

unsigned long long nCrModPFermat(unsigned long long n, int r, int p);

long long lcm(ll a, ll b);

// returns -1 if s1 is not a substring of s2
int isSubstring(string s1, string s2);

const ll N = 1e9 + 7;

struct prob
{
    int s, t, d;
};

struct pro
{
    // set<pair<ll, ll>, prob> s;
    // set heap, with maxlen -> y-x at top
    bool operator()(const pair<ll, ll> &a, const pair<ll, ll> &b) const
    {
        ll d_a = a.second - a.first - 1;
        ll d_b = b.second - b.first - 1;
        if (d_a == d_b)
        {
            return a.first < b.first;
        }
        return d_a > d_b;
    }
};


int main()
{
    _test
    {
        int n;
        cin>>n;
        string str;
        cin>>str;
        
        if(n==1){
            if(str[0] =='.'){
                cout<<1<<endl;
                
            }else{
                cout<<0<<endl;
            }
            continue;
        }else if(n==2){
            int cnt =0;
            if(str[0] =='.'){
                cnt++;
            }
            if(str[1] =='.'){
                cnt++;
            }
            cout<<cnt<<endl;
            continue;
        }else if(n==3){
            int cnt =0;
            if(str[0] =='.'){
                cnt++;
            }
            if(str[1] =='.'){
                cnt++;
            }
            if(str[2] =='.'){
                cnt++;
            }
            if(cnt==3){cout<<2<<endl;
            }else{
                cout<<cnt<<endl;
            }
            continue;
        }

        bool found = false;
        int cnt =0;
        int slice = 0;
        
        for(int i=0;i<str.length()-3;i++){
            if(str[i] == '.' && str[i+1] == '.' && str[i+2] =='.'){
                found = true;
                break;
            }
            if(str[i] =='.'){
                cnt++;
            }
        }
        if(str[n-1] =='.'){
            cnt++;
        }
        if(str[n-2] =='.'){
            cnt++;
        }
        if(found){
            cout<<2<<endl;
        }else{
            cout<<cnt<<endl;
        }
    }
}


ll power(ll x, ll y, ll p) // binaryExponentiation
{
    ll res = 1;

    while (y > 0)
    {

        if (y % 2 == 1)
            res = ((res % p) * (x % p)) % p;

        y = y >> 1;

        x = ((x % p) * (x % p)) % p;
    }
    return res % p;
}
unsigned long long modInverse(unsigned long long n, int p)
{
    return power(n, p - 2, p);
}

unsigned long long nCrModPFermat(unsigned long long n, int r, int p)
{
    if (n < r)
        return 0;

    if (r == 0)
        return 1;

    unsigned long long fac[n + 1];
    fac[0] = 1;
    for (int i = 1; i <= n; i++)
        fac[i] = (fac[i - 1] * i) % p;

    return (fac[n] * modInverse(fac[r], p) % p * modInverse(fac[n - r], p) % p) % p;
}

void SieveOfEratosthenes(ll n, set<ll> &v)
{
    bool prime[n + 1];
    memset(prime, true, sizeof(prime));

    for (ll p = 2; p * p <= n; p++)
    {
        if (prime[p] == true)
        {
            for (ll i = p * p; i <= n; i += p)
            {
                prime[i] = false;
            }
        }
    }

    for (ll p = 2; p <= n; p++)
    {
        if (prime[p])
        {
            v.insert(p);
        }
    }
}

string DecimalToBinary(ll num)
{
    string str;
    if (num == 0)
        return 0;
    while (num)
    {
        if (num & 1)
            str += '1';
        else
            str += '0';
        num >>= 1;
    }
    string s = str;
    reverse(all(s));
    return s;
}

int isSubstring1(char *s1, char *s2)
{
    int M = strlen(s1);
    int N = strlen(s2);

    for (int i = 0; i <= N - M; i++)
    {
        int j;
        for (j = 0; j < M; j++)
            if (s2[i + j] != s1[j])
                break;

        if (j == M)
            return i;
    }

    return -1;
}

// function to get the index of s2 in s1
int isSubstring(string s1, string s2)
{
    // using find method to check if s1 is
    // a substring of s2
    if (s2.find(s1) != string::npos)
        return s2.find(s1);
    return -1;
}

long long lcm(ll a, ll b)
{
    return (a / __gcd(a, b)) * b;
}
