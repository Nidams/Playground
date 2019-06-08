#include<stdio.h>
int compare1(void const* a,void const* b)
{
  return (*(int *)a - *(int *)b);
}
int compare2(void const* a,void const* b)
{
  return (*(int *)b - *(int *)a);
}
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  int a[n],b[n],i;
  for(i=0;i<n/2;i++)
    scanf("%d",&a[i]);
  int s=n-n/2;
  for(i=0;i<s;i++)
    scanf("%d",&b[i]);
 qsort(a,n/2,sizeof(int),compare1);
  qsort(b,s,sizeof(int),compare2);
  for(i=0;i<n/2;i++)
    printf("%d ",a[i]);
  for(i=0;i<s;i++)
    printf("%d ",b[i]);
  
	return 0;
}