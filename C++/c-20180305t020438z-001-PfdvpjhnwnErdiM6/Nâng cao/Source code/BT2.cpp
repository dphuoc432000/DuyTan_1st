#include <stdio.h>
#include <conio.h>

int P (int n)
{
	if (n == 0) return 1;
	
	return P(n-1) * 2;
}

int main()
{
	//P(n) = 2^n
	
	printf("%d", P(4));
	getch(); return 0;
}