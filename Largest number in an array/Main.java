#include<stdio.h>
int main()
{
  //fill the code
  int n,max=0;
  scanf("%d",&n);
  int arr[n],i;
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
  for(i=0;i<n;i++)
    if(max<arr[i])
      max=arr[i];
  printf("%d",max);
  return 0;
}