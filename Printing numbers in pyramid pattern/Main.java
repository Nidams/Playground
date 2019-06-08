#include <stdio.h>
int main() {
	// Type your code here
  int n,c=1,p=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    for(int j=1;j<=n-c;j++)
      printf(" ");
    for(int k=1;k<=i;k++)
      printf("%d ",p++);
    printf("\n");
    c++;
  }
	return 0;
}