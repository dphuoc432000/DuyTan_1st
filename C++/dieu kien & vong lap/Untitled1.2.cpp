#include <iostream>
#include <cmath>
#include <string>
#include <fstream>
using namespace std;
main()
{
	float a, b, c;
	cout << "Nhap ba so a b c: ";
	cin >> a >> b >> c;
	if(a + b < c && b + c < a && a + c < b){
		cout << " Khong tao thanh tam giac";
		}else {
			cout << " Tao thanh tam giac: ";
			if(a == b && b == c){
				cout << "Tao thanh tam giac deu";
			}else if(a == b || b == c || a == c){
				cout << "Tao thanh tam giac can";
			}else if(a * a + b * b == c * c || b * b + c * c == a * a || a * a + c * c == b * b){
				cout << "Tao thanh tam giac vuong";
			} 
		}
		
	 
}
