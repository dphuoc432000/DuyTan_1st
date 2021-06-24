	#include<iostream>
	using namespace std;
	main(){
		int n;
		cout << "Nhap n: ";
		cin >> n;
		for (int i=1;i<=n;i++){
			for(int j = 1; j <= n - i; j++ )
				cout << "   ";
			for(int k = 1; k < 2 * i - 1; k++){
				if(k == n - 1 - i || k == n - 1 + i)
					cout << " * ";
				else
					cout << "   "; 
			}
			cout <<endl;
		}
	}
