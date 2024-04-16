#include<stdio.h>
#include<conio.h>

void main()
{
    int a,b,c;
    clrscr();
    printf("enter two numbers to add\n");
    scanf("%d%d",&a,&b);
    c=a+b;
    printf("sum of entered numbers=%d\n",c);
    getch();
}