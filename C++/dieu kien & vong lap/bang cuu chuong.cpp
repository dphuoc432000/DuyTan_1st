#include <iostream>
#include <cmath>
#include <cstring>
#include <fstream>
using namespace std;
main()
{
	int i=1,j;
	while (i<= 9){
		i++;
		cout << "bang cuu chuong " << i << endl;
		j=0;
		while (j <= 9){
			j++;
			cout << i << "x"<< j << "="<< i*j<< endl;
		}
	}
}
