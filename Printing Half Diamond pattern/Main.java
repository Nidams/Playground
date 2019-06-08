#include <stdio.h>
int main() {
	// Type your code here
  int n,c=1;
  scanf("%d",&n);
  for(int i=1;i<=n*2-1;i+=2)
  {
    for(int j=1;j<=n-c;j++)
      printf(" ");
    for(int k=1;k<=i;k++)
      printf("*");
    printf("\n");
    c++;
  }
	return 0;
}