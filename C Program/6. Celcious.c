#include<stdio.h>
#include<math.h>
main()
{
    float f, C;
    printf("Enter the value of farenheight:");
    scanf("%f",&f);
    C=5*(f-32)/9;
    printf("The value of centigrade is : %.3f/n",C);
}
