import java.util.Scanner;
 
class stackOprations{
  static int max = 5;
  static int stack[] = new int[max];
  static int top = -1;
 
  public static void main(String[] args){
    Scanner src = new Scanner(System.in);
 
 
    System.out.println("Stack Opration in Java Programing");
    System.out.println("1. Push");
    System.out.println("2. Pop");
    System.out.println("3. Pip or Display");
    System.out.println("4. Peek");
    System.out.println("5. GetSize");
    System.out.println("6. Exit");
 
    System.out.println("\nPlease choose your menu: ");
    int choice = src.nextInt();
    //int n = stack.length;
    //System.out.println(n);
 
 
    switch(choice){
      case 1: 
        push();
        break;
      case 2: 
        pop();
        break;
      case 3:
        pip();
        break;
      case 4:
        peek();
        break;
      case 5:
        gatSize();
        break;
      case 6:
        //exit();
        break;
      default:
        System.out.println("Invalid Choice");
    }
  }
 
   // Push Opration
   public static int push(){
     if(isFull() == false){
       System.out.println("Stack is Full");
       return top;
     }else{
       Scanner src = new Scanner(System.in);
       System.out.println("Please enter the stack item: ");
       int item = src.nextInt();
       top++;
       stack[top] = item;
       System.out.println(item+" was Pussed");
       return top;
     }
 
   }
 
   // POP Opration
   public static int pop(){
     if(isEmpty() == false){
       System.out.println("Stack is Empty");
       return top;
     }else{
         int item = stack[top];
         top--;
         System.out.println(item);
         return top;
       }
   }
 
   // PIP Opration
   public static void pip(){
     int temp=0;
     for(int i = top; i>=0; i--){
       temp = i+1;
       System.out.println(temp+". "+stack[i]);
     }
   }
 
   public static void peek(){
     System.out.println(stack[top]);
   }
 
   public static void gatSize(){
     System.out.println(top+1);
   }
 
   // Stack Empty
   public static boolean isEmpty(){
     if(top == -1){
       return false;
     }else{
       return true;
     } 
   }
   // Stack Full
   public static boolean isFull(){
     if(top == max-1){
       return false;
     }else{
       return true;
     } 
   }
}