#include<iostream>
using namespace std;
main(){
	int n = 500;
	for(int i = 1; i <= 500; i++){
		for(int j = 1; j <= 500; j++)
			for(int k = 1; k <= 500; k++){
				if(i*i + j*j == k*k || i*i + k*k == j*j || k*k + j*j == i*i)
					cout << " ( " <<  i << " ; " << j << " ; "<< k << " ) " << endl;
			}
	}
}
