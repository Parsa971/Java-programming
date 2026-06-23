
package com.mycompany.mavenproject1.printf;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Printf {

    public static void main(String[] args) {
     //   Scanner input = new Scanner(System.in);
       /* System.out.println("Enter three numbers: "); 
        int num1,num2,num3,max;
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        max = num1;
        if (num2>max)   max = num2;
        if (num3 >max)  max = num3;
        System.out.println("max: " + max);
        */
//        System.out.println("enter any number: ");
//       int num;
//       num = input.nextInt();
//       if (num>0) 
//            System.out.println("the square is: " + num*num);
//       
//       if (num<0)  
//            System.out.println("the cube is: " + num*num*num);
//          
//       else if (num == 0)   
//           System.out.println("it is zero");
//       
//        System.out.println("Enter three numbers:");
//        int A,B,C;
//        A = input.nextInt();
//        B = input.nextInt();
//        C = input.nextInt();
//        if (A+B>C && B+C>A && A+C>B)
//            System.out.println("mohit" +(A+B+C));
//        else
//            System.out.println("it is not tringle.");
//        
        
//         System.out.println("Enter a number:");
//         int num = input.nextInt();
//         int n1 = num%10;
//         num = num/10;
//         int n2 = num%10;
//         num = num/10;
//         int n3= num%10;
//         num= num/10;
//         int n4 = num%10;
//         
//        System.out.println(n1+n2+n3+n4);
       
//        DecimalFormat decimalFormat = new DecimalFormat("00/00/0000");
//        String str = decimalFormat.format(452007);
//        System.out.println(str);
//       
////        
//        for (int i =100; i<=200;i++){
//            if(i%7 == 0){
//               System.out.println(i);
//               break;
//            }
//                 
//        }
//            
//      first question:      
//        for(int i = 'A';i<='Z';i++){
//            System.out.print((char)i + ", ");
//            
//        }
//     second question:
//        DecimalFormat f = new DecimalFormat("#.##");
//        for(double i = 3.00;i<=3.50;i= Double.parseDouble(f.format(i+0.10))){
//            System.out.print(i + ",");
//        }
//       Third question:

//        for(int i = 0; i<=100; i++){
//            if(i%4 == 0){
//                continue;
//            }
//            System.out.println(i);
//                
//        }
//      Forth question:

//        for(int i = 100; i<1000;i++){
//            if(i%2==0){
//                System.out.print(i + ",");
//            }
//     fifth question:

//        for (int i= 10; i<=99; i++){
//            if(i%3==0 && i%7==0){
//                System.out.println(i);
//            }
//        }
//            
//      Sixth question;=جدول ضرب زبانی 

//        for (int i = 1; i<=10; i++){
//            for(int j = 1; j<=10; j++){
//                System.out.printf("%-5d", i*j);
//                
//            }
//            System.out.println();
//        }
//      Seventh question:
//
//       Scanner input = new Scanner(System.in);
//       System.out.print("enter a number: ");
//       int num = input.nextInt();
//       for(int i=1; i<=num; i++ ){
//           if(num%i == 0){
//               System.out.println(" qasim hai moshtarak "+ i);
//           }
//       }
//       
//      Eight question:
//        int counter = 0;
//        for (int x=0; x<=20; x++){
//            for(int y = 0; y<=10; y++){
//                for(int z =0; z<=5; z++){
//                    if(500*x + 1000*y + 2000*z == 10000){
//                        System.out.println("x: "+ x+" y: "+y+" z: "+z);
//                        counter++;
//                    }
//                       
//                }
//            }
//        }
//                System.out.println(counter);
//        
//      ninth question:
//        boolean prime;
//        for(int i=2;i<=1000; i++){
//            prime = true;
//            for(int j=2;j<i; j++){
//                if(i%j==0){
//                prime = false;
//                    
//                }
//                
//            }
//            if(prime)  System.out.println(i);
//        }
//      
//          tenth question:

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter ten numbers: ");
//        int num = input.nextInt();
//        int max =num, min = num;
//        for (int i=0;i<9;i++){
//           num = input.nextInt();
//           if(num>max)  max = num;
//           if(num<max)  min = num;
//           
//        }
//         
//        System.out.println("max: "+max+ " min: "+min);
//       Eleventh question:
//
//        Scanner input = new Scanner (System.in);
//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
//        int sum = 0;
//        for(int i=1;i<num;i++){
//            if(num%i == 0){
//            sum += i;    
//            }
//        }
//        if (sum == num) System.out.println(num);
//        
////      Twelfth question: 
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your numbers: ");
//        
//        int num = input.nextInt();
//        int sum = 0;
//        int counter = 0;
//        while(num!=0){
//            sum = sum+num;
//            counter++;
//            num = input.nextInt();
//        }
//          System.out.println(sum/counter);  
//      
//      thirteenth question:
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your numbers: ");
//        int num = input.nextInt();
//        int even=0,odd=0,positive=0,negative=0;
//        
//        while(num!=0){
//            if(num%2==0)    even++;
//            else    odd++;
//            if(num>0)  positive++;
//            else   negative++;
//            num = input.nextInt();
//            
//        }
//            System.out.println("even: "+even+" odd: "+odd+" positive: "+positive+" negative: "+ negative);

//      fourtenth question:
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int num = input.nextInt();
//        int f = 1 ;
//        for(int i=1;i<=num;i++){
//           f = f*i;
//            
//        }
//            System.out.println("factorial= "+ f);

//      fifteenth question:

        int firstnumber = 1, secondnumber=1, temp=0;
        System.out.print(firstnumber + " - ");
        
        while(secondnumber<=1000){
            System.out.print(secondnumber+" - ");
            temp = firstnumber+secondnumber;
            firstnumber = secondnumber;
            secondnumber = temp;
            
        }


    }
    
    
 }
