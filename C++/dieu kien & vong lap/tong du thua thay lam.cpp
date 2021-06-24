#include <iostream>
#include <cmath>
#include <string>
#include <fstream>
using namespace std;
main()
{
	int n, s=1, i= 1, s_tam;
	cout << "Nhap so n: ";
	cin >> n;
	for (i=1; i<=n; i++){
		int i_gt = 1;
		int j = 2;
		while (j <= i){
			i_gt = i_gt * j;
			j++;
		}
		double s_tam = 1.0/i_gt;
		s= s + s_tam;
	}
	cout << " Tong du thua: " << s;
}
