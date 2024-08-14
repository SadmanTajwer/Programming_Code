//1
#include<stdio.h>
#include<math.h>
main()
{
    int x,y,z;
    scanf("%d%d%d",&x,&y,&z);
    if((x==90||y==90||z==90))
            {printf("triangle is an right-angle triangle :");}

    else if(x==y&&y==z)
        {printf("triangle is an equilateral triangle :");}

    else {printf("not any of those two types");}
    getch();
}
