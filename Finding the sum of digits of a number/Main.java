#include <stdio.h>
int main() {
	//Type your code
  int sum=0,n;
  scanf("%d",&n);
  while(n>0)
  {
    sum+=n%10;
    n=n/10;
  }
 
  printf("%d",sum);
	return 0;
}