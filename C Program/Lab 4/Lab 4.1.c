#include<stdio.h>
#include<math.h>
int main()
{
    int n, i, age, count=0;
    printf("Enter any number you want to know:\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        scanf("%d",&age);
    if(age>=13 && age<=19);
    {
        count++;
    }
}
printf("Teeneger = %d",count);


}

