#include<stdio.h>
#include<math.h>
main()
{
    int year;
    printf("Enter the year (4 digit) to cheak : ");
    scanf("%d",&year);
    if (year %400==0||(year%100!=0&&year%4==0))
    printf("This is a leap year %d\n",year);
    else
    printf("This is not a leap year %d\n",year);
    getchar();
}
