#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  int a;
  scanf("%d",&a);
  int a1=a;
  int sum=0;
  while(a>0)
  {
    sum+=pow(a%10,3);
    a=a/10;
   }
  if(sum==a1)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
  
	return 0;
}