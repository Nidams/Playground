#include<stdio.h>
int compare(void const* a,void const* b)
{
  return(*(int*)a - *(int*)b);
}
int main()
{
	//Try out your code here
  int n;
  scanf("%d",&n);
  int a[n],i;
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  qsort(a,n/2,sizeof(int),compare);
  for(i=0;i<n;i++)
    printf("%d ",a[i]);
	return 0;
}