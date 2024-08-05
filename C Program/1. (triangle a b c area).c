#include<stdio.h>
#include<math.h>
main()
{
    float a, b, c, s, sum;
    printf("Enter value of triangle A = ");
    scanf("%f", &a);
    printf("Enter the value of triangle B = ");
    scanf("%f", &b);
    printf("Enter the value of triangle C = ");
    scanf("%f", &c);
    s = ((a+b+c)/2);
    sum = (sqrt(s*(s-a))*(s-b)*(s-c));
    printf("The result of the triangle is = %.10f\n", sum);
    getch();

}
