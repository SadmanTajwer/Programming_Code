#include <stdio.h>
#include<math.h>
int main ()

{
    int  n, c1=0,c2=0,c3=0, age,i;
    printf("Enter any number you want to know:");
    scanf("%d",&n);
    for(i=1;i<=n; i++){
        scanf("%d", &age);
        if(age <12){
            c1++;
        }
        else if ( age>= 13 && age <=19){
            c2++;
        }
        else if (age >= 65){
            c3++;
        }}
    if (c1 >c2&&c1>c3){
    printf("children are most");}

  else if (c2 >c1&&c2>c3){
    printf("children are most");}
  else  {
    printf("senior citizen are most");}
}
