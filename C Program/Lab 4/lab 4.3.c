
#include<stdio.h>
#include<math.h>
int main()
{
    int x,num;
    printf("Enter any number of find its factor:");
    scanf("%d",&num);
    printf("All fectors of %d are:\n",num);
    for(x=1;x<=num;x++)
    {
        if(num%x==0)
        {
            printf("%d,",x);
        }
    }

return 0;
}
