#include <iostream>
using namespace std;
main()
{
	int i=0;
	while(i<100){
		i++;
		cout << i;
		if(i % 10==0){
			cout << endl;
		}
	}
}
