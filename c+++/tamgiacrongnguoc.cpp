#include <iostream>
using namespace std;
main(){
	int n;
	int k;
	cout << "Enter n: ";
	cin >> n;
	k  = n -1;
	for(int i = 0; i < 2 * n - 1; i++){
		cout << "*";
	}
	cout << endl;
	for(int i = n -1; i > 1; i--){
		for(int j =  2 * n -1; j >= 0; j--){
			if(j == k - i || j == k + i)
		 	 	cout << "*";
		 	else
		 		cout << " ";
		}
		cout << endl;
	}

}
