#include <iostream>
#include <cstring>
#include <cmath>
#include <fstream>
using namespace std;
main()
{
	int h, ph, s, t;
	cout << "Nhap gio, phut , giay va so giay cong them: ";
	cin >> h >> ph >> s >> t;
	s = s + t;
	if (s >= 60){
		ph = ph + s/60;
		s = s%60;
	}
	if (ph >= 60){
		h = h + ph/60;
		ph = ph % 60;
	}
	if (h >= 24 ){
		h = h%24; 
	}
	cout << h << " : " << ph << " : " << s;
}
