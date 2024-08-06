#include<stdio.h>
int main (){
    int i,n,a,b,c,d;
    printf("sample input ");
    scanf("%d",&n);
    c=0;
    d=0;
    for(i=0; i<n; i++){
        scanf("%d %d",&a,&b);
        if(a>c && b>d){
            c = a;
            d = b;
        }
    }
    printf("Origin %d %d",c,d);
    return 0;
}
