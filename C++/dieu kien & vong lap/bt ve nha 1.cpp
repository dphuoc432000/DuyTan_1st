#include <iostream>
#include <cmath>
#include <string>
#include <fstream>
using namespace std;
main()
{
	int n, j=2, z=2, i=1, t , m=1, s_tam = 1, s = 1;
	cout << "Nhap so n: ";
	cin >> n;
	while (i <= n){
		while (j <= i){
			m= m * j;
			j= j++;
			cout << m;
			break;
		}
		while (z <= i){
			t= z * z;
			z= z + 1;
			cout << t;
			break;
		}
		s_tam = t / m;
		s = s + s_tam;
	}cout << "tong la: " << s;
}
