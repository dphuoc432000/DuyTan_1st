#include <iostream>
#include <cmath>
#include <string>
#include <fstream>
using namespace std;
main()
{
	int n, i, j= 1, p=1,t=1, s=1;
	cout << "Nhap vao so n: ";
	cin >> n;
	while(i <= n){
		while(j <= i){
			t= j * j;
			j= j + 1;
		}while (j <= i){
			p = p * j;
			j = j + 1;
		}
		s=  t  / j;	
	} cout << "s= " << s;
}
