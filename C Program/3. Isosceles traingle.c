#include<stdio.h>
#include<math.h>
main()
{
    float a,b,area;
    printf("The length of equal arms (meter)");
    scanf("%f",&a);
    printf("The lenth of other arms (meter)");
    scanf("%f",&b);
    area=(b*sqrt(a*a-b*b))/4;
    printf("Area of isoscles traingle =%f sq-meter",area);
    getchar();
}
