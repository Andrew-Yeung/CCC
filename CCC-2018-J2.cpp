#include <bits/stdc++.h>
using namespace std;

int main(){
    int n;
    string a; string b;
    cin >> n >> a >> b;
    int count = 0;
    for(int i=0;i<a.length();i++){
        if(a[i]=='C' && a[i]==b[i]){
            count++;
        }
    }
    cout << count << "\n";
}
