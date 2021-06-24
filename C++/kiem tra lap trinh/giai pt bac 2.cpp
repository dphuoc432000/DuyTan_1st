#include <iostream>
#include <cmath>
using namespace std;
main()
{
	float a, b, c, x , x1, x2, denta;
	cout << "Giai phuong trinh bac 2 : ax2 + bx + c = 0." << endl;
	cout << "________________________" << endl;
	cout << "Nhap ba so a, b, c: ";
	cin >> a >> b >> c;
	if (a == 0)
	{
		x= -c/b;
		cout << "phuong trinh bac 1: bx + c = 0 . Nghiem: ";
		cout << "x = " << x;
	}
	else
	{
		denta = pow(b,2) - 4 * a * c;
		cout << "denta = " <<  denta << endl;
		cout << "==> ";
		if(denta < 0)
		{
			cout << "denta < 0" << endl;
			cout << "==> ";
			cout << "Phuong trinh vo nghiem." << endl;	
		}else{
			if(denta == 0) 
			{
				x = -b/(2*a);
				cout << "denta = 0" << endl;
				cout << "==> ";
				cout << "Phuong trinh co nghiem kep: ";
				cout << "x1 " << "= " << "x2 " << "= " << x << endl;
			}else{
				cout << "denta > 0." << endl;
				cout << "==> ";
				cout << "Phuong trinh co 2 nghiem phan biet: " << endl;
				x1= (-b + sqrt(denta))/(2*a);
				x2= (-b - sqrt(denta))/(2*a);
				cout << "x1 = " << x1 << endl;
				cout << "x2 = " << x2;
			}
		}
	}
}
