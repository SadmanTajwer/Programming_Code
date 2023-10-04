#include<stdio.h>
#include<math.h>
int main()
{
    int num1,num2,num3,num4;
    printf("Enter the value of Num 1 : \n");
    scanf("%d",&num1);
    printf("Enter the value of Num 2 : \n");
    scanf("%d",&num2);
    printf("Enter the value of Num 3 : \n");
    scanf("%d",&num3);
    printf("Enter the value of Num 4 : \n");
    scanf("%d",&num4);
    if(num1>num4)
    {
        if(num2>num4 && num3>num4)
        {
            printf("Num 1 is maximum value :%d \n",num1);
        }
        else
        {
            printf("Num 4 is maxmimum value :%d \n",num4);
        }
    }
    else if(num2>num4)
    {
        if(num2>num3)
        {
            printf("Num 2 in maximum value :%d \n",num2);
        }
        else
        {
            printf("Num 4 is maxmimum value :%d \n",num4);
        }

       }
    else {
        if(num3>num4)
        {
            printf("num 3 is maximum value of : %d \n");
        }
        else
        {
            printf("Num 4 is maxmimum value :%d \n",num4);
        }
    }
}



