#include<stdio.h>
#include<math.h>
main()
{
    float a ,area;
    printf("Enter the lenth of traingle a=");
    scanf("%f",&a);
    area=(pow(a,2)*sqrt(3))/4;
    printf("a=%f and area=%f\n" ,a,area);
    getch();
}
