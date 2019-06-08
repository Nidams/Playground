#include<stdio.h>
#include<string.h>
int main()
{
  //Type your code here
  char ch[20];
  scanf("%s",ch);
  int i,k=strlen(ch)-1;
  for(i=0;ch[i]!='\0';i++)
  {
    if(ch[i]!=ch[k--])
    {
      i=-1;break;
    }
   }
  if(i==-1)
    printf("%s is not a palindrome",ch);
  else
    printf("%s is a palindrome",ch);
  return 0;
}