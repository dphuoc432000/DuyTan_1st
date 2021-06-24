#include <iostream>
using namespace std;
void nhapMang (int A[], int &n)
{
	cin >> n;
	for (int i = 0; i < n; i++)
	{
		cin >> A[i];
	}
}
int max(int A[], int n )
{
	max = A[1];
	for(int i = 0; i < n; i++){
	if (max < A[i])
	{
		return A[i]	;
	}
	else
	{
		return A[1];
	}
	}
}
int min(int A[], int n)
{
	min = A[1];
	for(int i = 0; i < n; i++){
	if (min > A[i])
	{ 
		return A[i];
	}
	else
	{
		return A[1];
	}
	}
}
void run()
{
	int A[255],n, max, min;
	nhapMang(A,n);
	cout << "so lon nhat: " << max(A,n) << endl;
	cout << "so be nhat: " << min(A,n);
}
main()
{
	run();
}
