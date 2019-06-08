#include <stdio.h>
int main() {
	//Type your code
  int n,mul=1;
  scanf("%d",&n);
  while(n)
  {
    mul*=n;
    n--;
  }
  printf("%d",mul);
  
	return 0;
}