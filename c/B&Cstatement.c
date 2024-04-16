
#include<stdio.h>

int main()
{
    /*local varialbe defination*/
    int a=10;
    /*while loop execution*/
    while(a<20){
        printf("value of a:%d\n",a);
        a++;
        if(a>15){
            /*terminate the loop using break statement*/
            break;

        }
    }
    return 0;
}