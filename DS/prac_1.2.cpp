#include <stdio.h>

int search(int ysl[], int n) {
  int ele;
  printf("\nEnter the data to search : ");
  scanf("%d", & ele);
  for (int i = 0; i < n; i++) {
    if (ysl[i] == ele) {
      printf("\n\tThe data is found at the order number %d ", i + 1);
      return 1;
    }
  }
  printf("\nData not found!!\n");
  return -1;
}
int Update(int ysl[], int size) {
  int ele, i, no;
  printf("\nEnter the data you want to update : ");
  scanf("%d", & ele);
  printf("\n\tEnter the new order : ");
  scanf("%d", & no);
  for (i = 0; i < size; i++) {
    if (ysl[i] == ele) {
      ysl[i] = no;
      printf("\nModified Data : ");
      for (i = 0; i < size; i++) {
        printf("%d ", ysl[i]);
      }
      return 1;
    }
  }
  printf("\nData not found!!\n");
  return -1;
}
int Delete(int ysl[], int size) {
  int i, ele;
  printf("\nEnter the order to delete : ");
  scanf("%d", & ele);
  for (i = 0; i < size; i++) {
    if (ysl[i] == ele) {
      for (int j = i; j < size; j++) {
        ysl[j] = ysl[j + 1];
      }
      size--;
      printf("\nModified Data : ");
      for (i = 0; i < size; i++) {
        printf("%d ", ysl[i]);
      }
      return 1;
    }
  }
  printf("\nData not found!!!");
  return 0;
}

int main() {
  int n, i;
  printf("-------------------------------------------------------------------------");
  printf("\n\t\tEnter the number of orders : ");
  scanf("%d", & n);
  printf("-------------------------------------------------------------------------");
  int ysl[n];
  printf("\n\t\tEnter data : ");
  for (i = 0; i < n; i++) {
    scanf("%d", & ysl[i]);
  }
  printf("-------------------------------------------------------------------------");
  int choice;
  while (1) {
    printf("\n\nPress : ");
    printf("\n\t1.To search in the data");
    printf("\n\t2.To update the data");
    printf("\n\t3.To delete the data");
    printf("\n\t4.To exit");
    printf("\n\nEnter your choice : ");
    scanf("%d", & choice);
    int index;
    switch (choice) {
    case 1:
      search(ysl, n);
      break;
    case 2:
      Update(ysl, n);
      break;
    case 3:
      Delete(ysl, n);
      break;
    case 4:
      return 0;
    default:
      printf("\nPlease enter some valid number");
    }
  }
}