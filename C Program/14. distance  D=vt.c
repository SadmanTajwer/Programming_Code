
#include<stdio.h>
#include<math.h>
main()
{
    float v,t,d;
    printf("please insert velocity (v) in metere/second:");
    scanf("%f",&v);
    printf("Please insert time(t) in second:");
    scanf("%f",&t);
    d=v*t;
    printf("V=%f and T=%f and D=%f",v, t, d);
    getchar();
}
