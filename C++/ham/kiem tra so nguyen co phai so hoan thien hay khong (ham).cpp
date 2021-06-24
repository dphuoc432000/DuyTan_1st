#include <iostream>
#include <cstring>
#include <cmath>
#include <fstream>
using namespace std;
int PERFECT(int n)
{
	for(int i=0; i <= n; i++){
		if (n%i==0){
			return true;
		}else {
			return false;
		}
	}
	return true;
}
main()
{
	int x;
	cout << "nhap so n: ";
	cin  >> x;
	if (PERFECT(x) == true ){
		cout << x << " la so perfect.";
	}else {
		cout << x << " khong phai la so perfect.";
	}
}
