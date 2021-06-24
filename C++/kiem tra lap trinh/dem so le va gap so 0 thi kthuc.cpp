#include <iostream>
#include <cmath>
using namespace std;
main()
{
	int n, dem= 0;
	cout << "moi ban nhap vao so n: ";
	while (n< pow(10,6)){
		cin >> n;
		if(n == 0){
			cout << "chuong tirnh ket thuc!";
			break;
		}
		if (n % 2 != 0){
			dem = dem + 1;
		}
	}
			cout << "so le la: " << dem;
}
