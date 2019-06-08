#include <stdio.h>
int main() {
	//Type your code
  int n,sum=0;
  scanf("%d",&n);
  while(n)
  {
    sum+=n;
    n--;
  }
  printf("%d",sum);
	return 0;
}