#include<stdio.h>
#include<math.h>
main()
{
    int x, fx;
    printf("Enter the value of x=");
    scanf("%d",&x);
    fx = pow(x,4)+5*x-3;
    printf("x=%d and f(x)=%d\n",x,fx);
    getch();
}
