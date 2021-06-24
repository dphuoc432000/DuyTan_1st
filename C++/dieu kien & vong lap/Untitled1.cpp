#include <iostream>
#include <cmath>
#include <cstring>
#include <fstream>
using namespace std;
main()
{
	float a, b, c;
	cin >> a >> b >> c;
	if((a + b) > c && (b + c) > a && (a + c) > b) {
		cout << "Khong tao thanh tamm giac";
	} else {
		cout << "Tao thanh tam giac";
		if(a == b && b == c) {
			cout << "Tao thanh tam giac deu";
			} else if(a == b || b == c || c == a) {
				cout << "Tao thanh tam giac can";
			} else if(a * a + b * b == c * c && a * a + c * c == b * b && b * b + c * c == a * a ) {
				cout << "Tao thanh tam giac vuong";
			}
		}
}
