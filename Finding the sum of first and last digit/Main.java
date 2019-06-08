#include <stdio.h>
#include <string.h>
int main() {
	//Type your code
  char ch[20];
  scanf("%s",ch);
  int num1 = ch[0]-'0';
  int num2 = ch[strlen(ch)-1]-'0';
  printf("%d",num1+num2);
  
	return 0;
}