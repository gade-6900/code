#include<stdio.h>
#include<conio.h>

int totalThousand=1000;
int totalfiveThousand=1000;
int totalOneHundred=1000;
void main(){
    unsigned long withdwawAmount;
    unsigned long totalMoney;
    int Thousand=0,FiveHundred=0,OneHundred=0;
    clrscr();
    printf("Enter the amount in multiple of 100:");
    scanf("%lu",&withdrawAmount);
    if(withdrawamount%100!=0){
        printf("invalid amount;");
        getch();
        return 0; 
    }

}
