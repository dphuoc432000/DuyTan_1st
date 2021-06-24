#include <iostream>
#include <cmath>
#include <string>
#include <fstream>
#include <epsilon>
using namespace std;
main()
{
	int n, s=1, i= 1;
	cout << "Nhap so n: ";
	cin >> n;
	while (s_tam > epsilon){//(i<=n){
		int i_gt =1;
		int j=2;	
		i++;	
		while (j <= i){
			i_gt = i_gt * j;
			j++;
		}
		double s_tam = 1/i_gt;
		s = s + s_tam;
	}
	cout << "s = " << s;
}
