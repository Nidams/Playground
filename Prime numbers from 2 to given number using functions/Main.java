#include<stdio.h>
int main(){
    // Type your code here
  int n;
  scanf("%d",&n);
  int i,j,c=0;
  for(i=2;i<=n;i++)
  {
    c=0;
    for(j=2;j<=i/2;j++)
      if(i%j==0)
      {
        c++;
        break;
      }
    if(c==0)
      printf("%d\n",i);
  }
    return 0;
}