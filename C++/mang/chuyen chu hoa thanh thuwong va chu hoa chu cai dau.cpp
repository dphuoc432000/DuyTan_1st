#include <iostream>
#include <cstring>
using namespace std;
char thuongThanhHoa(char c)
{
	int x = (int) c;
	if(x >= 97 && x <= 122) {// Nghia la x nam trong trong a -> z
		x = x - 32;
		return (char) x;
	}
	return c;
}

int chuyenChuThanhSo(char c)
{
	int x = (int) c;
	if(x >= 48 && x <= 57)
	{
		return x - 48;
	}
	return -1;
}

char hoaThanhThuong(char c)
{
	int x = (int) c;
	if(x >= 65 && x <= 90) {// Nghia la x nam trong trong A -> Z
		x = x + 32;
		return (char) x;
	}
	return c;
}

void xuatChuoi(char A[])
{
	for(int i = 0; i < strlen(A); i++)
	{
		cout << A[i];
	}
	cout << endl;
}

void run()
{
	int tong = 0;
	char A[255];
	cin.getline(A, 255);
	for(int i = 0; i < strlen(A); i++)
	{
		if(chuyenChuThanhSo(A[i]) >= 0) {
			tong = tong + chuyenChuThanhSo(A[i]);
		}
	}
	cout << tong;
}

main()
{
	run();
}
