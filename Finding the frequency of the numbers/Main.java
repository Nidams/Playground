#include<stdio.h>
int compare(void const *a,void const *b)
{
  return(*(int *)a - *(int *)b);
}
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int a[n],i,c=0;
  int k;
  scanf("%d",&k);
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  qsort(a,n,sizeof(int),compare);
  for(i=0;i<n;i++)
  {
    if(a[i]==a[i+1] && a[i]<=k)
    c++;
    else if(a[i]!=a[i+1] && a[i]<=k)
    {
      printf("%d %d\n",a[i],c+1);
      c=0;
      
    }
  }
  int dif=0;
  if(k>a[n-1])
   dif=k-a[n-1];
  if(dif>0)
    for(i=1;i<=dif;i++)
      printf("%d %d\n",a[n-1]+i,0); 
  
  return 0;
}