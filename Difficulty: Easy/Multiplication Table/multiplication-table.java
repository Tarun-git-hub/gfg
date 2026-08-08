import java.util.Scanner;

class GFG {
    
     static void multiplication(int n){
         for(int i=1;i<=10;i++){
             System.out.print(n*i + " ");
         }
     }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
     multiplication(n);
     sc.close();

     
      
    }
}