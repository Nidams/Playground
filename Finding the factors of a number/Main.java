#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  printf("1\n");
  for(int i=2;i<=n/2;i++)
    if(n%i==0)
      printf("%d\n",i);
  printf("%d",n);
	return 0;
}