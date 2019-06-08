#include<stdio.h>
int compare(void const *a,void const *b)
{
  return (*(int *)a - *(int *)b);
}
int main()
{
//Type your code here
  int n;
  scanf("%d",&n);
  int a[n],i;
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  qsort(a,n,sizeof(int),compare);
  int k;
  scanf("%d",&k);
 
  printf("%d",a[n-k]);
return 0;
}