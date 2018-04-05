#include<stdio.h>
int main() {
	int i,j;
	
	for (i = 0; i < 3; i++){
		//공백출력
		for (j =0; j < i; j++)
			printf(" ");
		// 별출력
		for (j = 0; j < 3-i; j++)
			printf("*");

		//뉴라인
		printf("\n");
	}
}
