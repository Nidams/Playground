#include <stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int c=0;
  for(int i=1;i<=n;i++)
  {
    for(int j=n-c;j>=1;j--)
      printf("%d",j);
    printf("\n");
    c++;
  }
	return 0;
}