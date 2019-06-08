#include<stdio.h>
int nat(int n)
{
  int sum;
  for(int i=1;i<=n;i++)
    sum+=i;
  return sum;
}
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
int sum=nat(n);
  printf("%d",sum);
   return 0;
}