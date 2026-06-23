package com.mycompany.mavenproject1.loops;
import java.util.Scanner;
public class Loops {

    public static void main(String[] args) {
        
//        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        
//        for (int i=0;i<num;i++){
//            int t = i;
//            while(t!=0){
//                if (t%10==7){
//                    System.out.println(i);
//                    break;
//            }  
//                t=t/10;
//           }
//        }
//       

//      second question:

//    Scanner input = new Scanner(System.in);
//    int num = input.nextInt();
//    for(int i=0;i<num;i++){
//        if(i%7==0){
//        int t=i;
//        while(t!=0){
//            if(t%10==7){
//                System.out.println(i);
//                break;
//            }
//            t=t/10;
//        }
//    }
//    }

//      Third number:

//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        for (int i=0;i<num;i++){
//            if(i%7==0){
//            int t = i;
//            while(t!=0){
//                if (i%10==7)
//                break;
//                t= t/7;
//            }
//            if(t==0)    System.out.println(i);
//            
//            }    
//        }
//      fourth question:

//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        int b;
//        boolean flag = true;
//        int a = num%10;
//        num= num/10;
//        
//            
//        while(num!=0){
//            b= num%10;
//            num/=10;
//            if(a-b != 2){
//                System.out.println("false.");
//                flag = false;
//                break;
//            }
//            a=b;
//            }
//        if(flag)
//        System.out.println("true.");
//      fifth question:

//    Scanner input = new Scanner(System.in);
//    int num = input.nextInt();
//    int sum=0;
//    while(num!=0){
//        sum+=num%10;
//        num=num/10;
//        
//    }
//        if(sum%3==0)    System.out.println("true");
//        else    System.out.println("false");
 
//    sixth question:

//       Scanner input = new Scanner(System.in);
//       double num = input.nextDouble();
//       int a=0,b=0;
//       
//       while((int)num != num){
//           num*=10;
//           a++;
//       }
//       double temp= 0;
//       while(num!=0){
//           temp = (temp*10)+(num%10);
//           num = (int)num/10;
//           b++;
//       }
//       for (int i=0;i<b-a;i++){
//           temp=temp/10.0;
//           
//       }
//        System.out.println(temp);
   //  seventh question:
   
        
//        Scanner input = new Scanner(System.in);
//        double num = input.nextDouble();
//        
//        while((int)num!=num){
//            num*=10;
//            
//        }
//        int b= (int)num;
//        int sum=0;
//        while(b!=0){
//            sum = sum+(b%10);
//            b = b/10;
//           
//            
//        }
//        System.out.println("the length: "+ sum);

//      eight question:

//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        for(int i=1; i<=num;i++){
//            for (int j=1; j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
 //     ninth question:
 
//        Scanner input = new Scanner(System.in);
//        int num = input.nextInt();
//        for(int i=num;i>=1;i-- ){
//            for(int j=i;j>=1;j--){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }

//      tenth question:

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
//        for(int i=1;i<=num;i++){
//            for(int j=num-i; j>=1;j--){
//                System.out.print(" ");
//            }
//            for(int k=1;k<=i;k++){
//                System.out.print("*");
//            }
//            System.out.println("\n");
//        }
//      eleventh question:

//        for(int i=1;i<=num;i++){
//            for(int j=num-i;j>=1;j--){
//                System.out.print(" ");
//            }
//            for(int k=(2*i)-1; k>=1;k--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
     //  twelfth question:
     
//        for(int i=1;i<=num/2+1;i++){
//            for(int j=i;j>=1;j--){
//                System.out.print("*");
//            }
//            System.out.println(); 
//        }
//        for(int i=num/2+2;i<=num;i++){
//            for(int j=1;j<=num-i+1;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//      thirteenth question:

//        for (int i=0;i<num;i++){
//            for(int j=0;j<i;j++){
//               System.out.print(" ");  
//            } 
//            for(int j=2*num-1-(2*i);j>=1;j--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
      //  fourteenth question:

//      for(int i=1;i<=num;i++){
//          for(int j=1;j<=num;j++){
//              System.out.print("*");
//          }
//          System.out.println();
//      }
      // fifteenth question:
      
//      for(int i=1;i<=num;i++){
//        for(int j=1;j<=num;j++){
//            if(i==1||j==1||i==num||j==num){
//              System.out.print("*");  
//            }
//            else
//                System.out.print(" ");
//        }
//            System.out.println();
//        }
     //  sixteenth question:
     
        for(int i=1;i<=num;i++){
        for(int j=1;j<=num;j++){
            if(i==num||j==num||i+j==num+1){
              System.out.print("*");  
            }
            else
                System.out.print(" ");
        }
            System.out.println();
        }
        
    }
}
