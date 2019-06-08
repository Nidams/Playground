#include <stdio.h>
int main() {
	//Type your code
  int n,mul=1,r,sum=0;
  scanf("%d",&n);
  int n1=n;
  while(n>0)
  {
    mul=1;
    r=n%10;
     while(r)
  {
    mul*=r;
    r--;
  }
    sum+=mul;
    n=n/10;
  }
  if(n1==sum)
    printf("Yes");
  else
    printf("No");
	return 0;
}