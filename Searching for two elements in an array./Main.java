#include<stdio.h>
int main()
{
  //Type your code here
  int n,a,b;
  scanf("%d",&n);
  int arr[n],i;
  for(i=0;i<n;i++)
    scanf("%d",&arr[i]);
  int c=-1;
  scanf("%d%d",&a,&b);
   for(i=0;i<n;i++)
     if(arr[i]==a)
     {
       c=0;
       break;
     }
  if(c==0)
    printf("%d\n",i);
  else
    printf("-1");
  c=-1;
  for(i=0;i<n;i++)
     if(arr[i]==b)
     {
       c=0;
       break;
     }
  if(c==0)
    printf("%d\n",i);
  else
    printf("-1\n");
  return 0;
}