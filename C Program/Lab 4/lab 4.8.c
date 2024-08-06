/*#include<stdio.h>
#include<math.h>
int main()
{
    int

return 0;
}*/

#include<stdio.h>
int main()
{
    int n;
    printf("sample input:\n");
    float cgpa,max=0.0,min=4.0,difference;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%f",&cgpa);
        if(cgpa>max){
            max = cgpa;
        }
        if(cgpa<min){
            min = cgpa;
        }
    }
    difference = max - min;
    printf("sample output\n%0.1f",difference);
    return 0;
}
