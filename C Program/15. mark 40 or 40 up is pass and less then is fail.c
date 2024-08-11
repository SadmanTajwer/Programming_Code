#include<stdio.h>
#include<math.h>
main()
{
    int mark;
    printf("please enter your mark : ");
    scanf("%d",&mark);
    if (mark >= 40)
    printf("you have passed in this subject");
    if (mark < 40)
    printf("you have not passed in this subject");
    getchar();
}
