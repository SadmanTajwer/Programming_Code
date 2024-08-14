#include<stdio.h>
#include<math.h>
main()
{
    int x,y,z;
    scanf("%d%d%d",&x,&y,&z);
    if(x!=y&&y!=z&&z!=x)
    {
        printf("scl");
    }
        else if(x==y&&y==z){printf(" equal");}

    else if(x==y||y==z||z==x ){ printf("iso");}
}
