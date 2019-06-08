#include <stdio.h>
int main(){
	// Type your code here
  int n,c=0;
  scanf("%d",&n);
  printf("*\n");
  for(int i=2;i<=n;i++)
  {
    if(c==4)
      c=0;
  for(int j=1;j<=i;j++)
  {
 if(j%2==1 && c<2)
   printf("#");
    else if(c<2)
      printf("*");
    if(j%2==1 && c>=2)
   printf("*");
    else if(c>=2)
      printf("#");
  }
    printf("\n");
    c++;
  }
  	
  return 0;
}