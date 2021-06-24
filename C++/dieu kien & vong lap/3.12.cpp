#include <cmath>
#include <iostream>
#include <string>
#include <fstream>
using namespace std;
main()
{
	int g, p, gi, ss;
	cout << " g la so gio. " << endl;
	cout << " p la so phut. "  << endl;
	cout << " gi la so giay. "  << endl;
	cout << " ss la so giay cong. "  << endl;
	cin >> g >> p >> gi >> ss;
	if (gi =gi + ss){
		cout << "so giay cong them la: " << gi << endl;;
	}
	if (gi >= 60){
		gi = p * 60 + gi/60;
		gi = gi * 60;
		cout << " so giay cong them la: " << gi << endl;; 
	}
	if (p * 60 >= 60){
		gi= (g*3600 + p*60)/60;
		gi= (p*60 * 60)/60;
		cout << " so giay cong them la: " << gi << endl;;
	}
}
