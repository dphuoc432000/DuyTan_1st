#include<stdio.h>
main()
{
	char c;
	int i=0;
	while(i<256)
	{
		c=i++;
		printf("%c",c);
	}
}
