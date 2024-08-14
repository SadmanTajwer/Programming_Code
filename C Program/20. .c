
#include<stdio.h>
#include<math.h>
main()
{
    float x,y,z;
    scanf("%f%f%f",&x,&y,&z);
    if(x>90&&y>90&&z>90)
    {
        printf("obt");
    }
        else if(x<90&&y<90&&z<90)
            {printf("acute");}

    else {printf("right");}
}
