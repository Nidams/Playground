#include <stdio.h>
int main(){
	// Type your code here
  int a,b,c,k,i;
  scanf("%d %d %d",&a,&b,&c);
  if(a<b && a<c)
    k=a;
  else if(b<a && b<c)
    k=b;
  else 
   k=c;
  for(i=k;i>=1;i++)
    if(a%i==0 && b%i==0 && c%i==0)
    {
      printf("%d",i);
      break;
    }
  	return 0;
}