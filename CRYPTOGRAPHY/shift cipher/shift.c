#include<stdio.h>

main()
{
    int a,b,c;
    char x[1000],y[1000];

    printf("String:");
    gets(x);

    printf("\nShift:");
    scanf("%d", &a);

    b=0;
    printf("\n");

    while (b < strlen(x))
    {
        c=x[b] + a;
        printf("%c",c);
        b++;
    }
}
