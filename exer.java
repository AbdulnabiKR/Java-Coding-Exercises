// //****Java exercise-1 qs ***/
// import java.util.*;
// public class exer{
//     public static void printAver(int num1,int num2,int num3){
//       int average=(num1+num2+num3)/3;
//       System.out.println("average of three numbers is "+ average);
//     }
//     public static void main(String[] args){
//      Scanner sc=new Scanner(System.in);
//      int num1=sc.nextInt();
//      int num2=sc.nextInt();
//      int num3=sc.nextInt();
//      printAver(num1,num2,num3);
     
//     }
// }

// import java.util.*;
// public class exer{
//     public static void sumOdd(int n){
//         int sum=0;
//         for(int i=1;i<=n;i++){
//             // int sum=0;
//             if(i%2!=0){
//                 sum=sum+i;
//             }
//         }
//         System.out.println("sum of all odd numbers is " + sum);
//     }
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         sumOdd(n);
//     }
// }

// import java.util.*;
// public class exer{
//     public static void greatNumber(int num1,int num2){
//       if(num1>num2){
//         System.out.println("Greater number is " + num1);
//       }
//       else{
//         System.out.println("Greater number is " + num2);
//       }
//     }
//     public static void  main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//         greatNumber(num1, num2);
//     }
// }

// import java.util.*;
// public class exer {
//     public static float circCircle(float radius){
//     double circ=2*radius*3.14;
//     System.out.println("Circumference of the circle is " + circ);


//         return radius;
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         float radius=sc.nextFloat();
//         circCircle(radius);
//     }
// }

// import java.util.*;
// public class exer {
//     public static void eligVote(int age){
//         if(age>18){
//           System.out.println("Person is eligible to vote");
//         }
//         else{
//             System.out.println("Person is not eligible to vote");
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int age=sc.nextInt();
//         eligVote(age);
//     }
// }

// public class exer{
//     public static void main(String[] args){
//      int n;
//      int i=1;
//      do{
//         System.out.println(i);
//      }while(i<=10);
//     }
// }

// import java.util.*;
// public class exer{
//     public static void main(String[] args) {
       
//         int i;
//         Scanner sc=new Scanner(System.in);
//             int n=sc.nextInt();
         
//         for( i=0;i<n;i++){
//             Scanner r=new Scanner(System.in);
//             i=r.nextInt();
//         }
//         for( i=0;i<n;i++){
        
//             if(i==0){
                
//                 System.out.println("Count of zeros is " + 1);
           
//             } 
//             if(i>0){
//                 System.out.println("Count of positive  is " + i);
//             }
//             else{
//                 System.out.println("Count of negative is "  + i);
//             }  
//             }
           

// import java.util.*;
// public class exer{
//     public static void powValue(int x,int n){
//      Math.pow(x, n);
//      System.out.println(Math.pow(x, n));
//     }

//     public static void main(String[] args){
//      Scanner sc=new Scanner(System.in);
//      int x=sc.nextInt();
//      int n=sc.nextInt();
//      powValue(x, n);
//     }      
//     }


// import java.util.*;
// public class exer{
//     public static void gcdNum(int num1,int num2){
//         if(num1<=0||num2<=0){
//             System.out.println("Invalid input");
//         }
//         else{
//             while(num1!=num2){
//               if(num1>num2){
//                 num1=num1-num2;
//               }
//               else{
//                 num2=num2-num1;
//               }
            
//             }
//             System.out.println( "GCD of two numbers is " + num1);
//         }
//     }
//     public static void main(String[] args){
//      Scanner sc=new Scanner(System.in);
//      int num1=sc.nextInt();
//      int num2=sc.nextInt();
//      gcdNum(num1, num2);
//     }
// }

// import java.util.*;
// public class exer{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//          int n1=0,n2=1,sum=0;
//          System.out.print(n1+" "+n2);//" "-->multiple values
        
//             for(int i=2;i<=n;i++){
//               sum=n1+n2;//0+1
//               n1=n2;//n1=1
//               n2=sum;//n2=1(sum value)
//               System.out.println(" "+sum);//1,2
//               /*
//                fib series->0,1,1,2,3,5,8,13,21,34....
//                1. sum=0+1=1
//                2.n1=1;
//                n2=1;
//                sum=1+1=2;
//                3.n1=1
//                n2=2
//                sum=1+2=3
//                3.n1=2
//                n2=3
//                sum=2+3=5.....
//                */   
//             }
          
        
//     }
// }
