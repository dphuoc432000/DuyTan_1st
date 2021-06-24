#include<iostream>
using namespace std;
void run()  
{  
	int n1 = 0, n2 = 1 ,i ,n3, n;
	cout << "nhap vao n: ";
	cin >> n;
	for( i = 2; i < 100; i++){  
		n3 = n1 + n2;  
		n1 = n2;  
		n2 = n3;
		if(n == n3)
			cout << "Yes.";
	}  
}
main(){
	run();
}
