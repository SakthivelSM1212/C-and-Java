#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node*next;
}*head,*temp,*newnode,*last,*prev;
    //MAIN FUNCTION
void main()
{   for(;;)
{
    printf("\n1.create\n2.Display\n3.Insert at begining\n4.Insert at last\n5.Del at beginning\n6.Del at end\n7.Exit\n8.Insert middle\n9.Del at Middle\n");
    int option;
    printf("ENTER THE OPTION :");
    scanf("%d",&option);
    switch (option)
    {
    case 1:create();
        break;
    case 2:display();
        break;
    case 3:insert_beg();
        break;
    case 4:insert_last();
        break;
    case 5:del_beg();
        break;
    case 6:del_end();
        break;
    case 7:exit(0);
        break;
    case 8:insert_at_middle();
        break;
    case 9:del_middle();
        break;
    default:
        break;
    }
}
}

void create(){
    newnode = (struct node*)malloc(sizeof(struct node));
    printf("Enter the data :");
    scanf("%d",&newnode->data);
    newnode->next= NULL;
    if(head == NULL)
    {
        head = newnode;
        temp = newnode;
    }
    else
    {
        temp->next = newnode;
        temp = newnode;
        //  last = newnode;
    }    
}
void display()
{
    temp = head;
    while(temp->next!= head)
    {
         printf("%d\t",temp->data);
         temp = temp->next;
    }
    printf("%d",temp->data);
}
void insert_beg()
{
    newnode = (struct node*)malloc(sizeof(struct node));
    printf("Enter the data :");
    scanf("%d",&newnode->data);
    last->next = newnode;
    newnode->next = head;
    head = newnode;
}
void insert_last()
{
    newnode = (struct node*)malloc(sizeof(struct node));
    printf("Enter the data :");
    scanf("%d",&newnode->data);
    newnode->next = head;
    last->next = newnode;
    last = newnode;
}
void insert_at_middle()
{
    newnode = (struct node*)malloc(sizeof(struct node));
    int pos;
    printf("Enter the position :");
    scanf("%d",&pos);
    printf("Enter the data :");
    scanf("%d",&newnode->data);
    newnode->next=NULL;
    temp = head;
    for(int i=1;i<pos;i++)
    {                                                               
          prev = temp;                                             
          temp=temp->next ;                                                                                          
    }
    newnode->next = temp;
   prev->next = newnode;
}
void del_beg()
{
    temp = head;
    last->next = head->next;
    head = head->next;
    temp->next = NULL;
    free(temp);
}
void del_end(){
    temp = head;
    while(temp->next!=head){
        last = temp;
        temp = temp->next;
    }
    last->next = temp->next;
    free(temp);
} 
void del_middle(){
    int pos;
    printf("Enter the position :");
    scanf("%d",&pos);
     for(int i=1;i<pos;i++)
    {                                                              
          prev = temp;                                              
          temp=temp->next ;                                                                                                
    }
    prev->next = temp->next;
    free(temp);
}