#include<stdio.h>
int main()
{
  //Type your code here
  int a,b;
  scanf("%d",&a);
  int c=1;
  while(c--)
  {
    a=a/10;
    b=a%10;
  }
  printf("%d",b);
  return 0;
}