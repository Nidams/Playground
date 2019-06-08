#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n],i;
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  int sum=a[0],msum=a[0];
  for(i=1;i<n;i++)
  {
    if(a[i]>a[i-1])
      sum+=a[i];
    else
      sum=a[i];
    if(sum>msum)
      msum=sum;
  }
  printf("%d",msum);
  return 0;
}