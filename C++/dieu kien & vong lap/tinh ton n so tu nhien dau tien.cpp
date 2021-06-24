#include <iostream>
#include <cmath>
#include <string>
#include <fstream>
using namespace std;
main()
{
	int n, s=0, i=0;
	cout << "Nhap so n: ";
	cin >> n;
	while (i<=n){
		s=s+i;
		i=i+1;
	}cout << "Tong n so tu nhien dau tien: " << s;
	
}	
