#include<stdio.h>
#include<math.h>
int main()
{
     int x,y,num1,num2;
    printf("Enter first number of find its factor:");
    scanf("%d",&num1);
    printf("Enter second number fo find its factor:");
    scanf("%d",&num2);
printf("All fectors of %d are:\n",num1);
    for(x=1;x<=num1;x++)
    {
        if(num1%x==0)
        {
            printf("%d,\n",x);
        }
    }
    printf("All fectors of %d are:\n",num2);
      for(y=1;y<=num2;y++)
    {
        if(num2%y==0)
        {
            printf("%d,\n",y);
        }
    }
return 0;
}

