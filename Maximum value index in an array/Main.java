// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  // Type your code here 
  int n;
  scanf("%d",&n);
  int a[n],i;
  for(i=0;i<n;i++)
    scanf("%d",&a[i]);
  int max=0,max1=0;
  for(i=0;i<n;i++)
    if(a[i]>max)
    {
      max=a[i];
      max1=i;
    }
  printf("%d",max1);
  
   return 0;
}