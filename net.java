// //print sum,multiply,substract,divide and remainder
// public class net{
//     public static void main(String args[]){
//         int num1=125;
//         int num2=24;
//         int sum=num1+num2;
//         int substract=num1-num2;
//         int multiply=num1*num2;
//         int divide=num1/num2;
//         int remainder=num1%num2;
//         System.out.println(sum +"\n" + substract + "\n" + multiply +"\n" + divide + "\n"+ remainder );

//     }
// }

// //multiplication table upto 10
// import java.util.*;
// public class net{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n=sc.nextInt();
//         System.out.println("Multiplication of table number " + n + " is "); 
//         for(int i=1;i<=10;i++){
//             int mul=n*i;
//             System.out.println(mul);
//         }
//     }
// }

// //write a pattern 
// public class net{
//     public static void main(String args[]){
//         System.out.println("   j\n" +"   j\n" +"j  j\n"+" jj \n");
//         System.out.println("   a   \n" + "  a a  \n" +" aaaaa \n" +"a     a\n");
//         System.out.println("v     v\n" + " v   v \n" + "  v v  \n" + "   v   ");
//         System.out.println("   a   \n" + "  a a  \n" + " aaaaa \n" + "a     a\n");

//     }
// }

// //print o/p
// public class net{
//     public static void main(String args[]){
//         double data=((25.5*3.5)-(3.5*3.5))/(40.5-4.5);
//         System.out.println("output is " + data);

//     }
// }

// //area and perimeter of a circle
// import java.util.*;
// public class net{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         float radius=sc.nextFloat();
//         double area=3.14*radius*radius;
//         double perimeter=2*3.14*radius;
//         System.out.println("Area of a circle is " + area);
//         System.out.println("Perimeter of a circle is " + perimeter);
//     }
// }

// //area and perimeter of a rectangle
// import java.util.*;
// public class net{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         float length=sc.nextFloat();
//         float breadth=sc.nextFloat();
//         double area=length*breadth;
//         double perimeter=2*(length+breadth);
//         System.out.println("Area of the rectangle is " + area);
//         System.out.println("Perimeter of the rectangle is " + perimeter);
//     }
// }

////print american flag
// public class net{
//     public static void main(String args[]){
//         System.out.print("* * * * * * ====================================\n");
//         System.out.print(" * * * * *  ====================================\n");
//         System.out.print("* * * * * * ====================================\n");
//         System.out.print(" * * * * *  ====================================\n");
//         System.out.print("* * * * * * ====================================\n");
//         System.out.print(" * * * * *  ====================================\n");
//         System.out.print("* * * * * * ====================================\n");
//         System.out.print(" * * * * *  ====================================\n");
//         System.out.print("* * * * * * ====================================\n");
//     }
// }

// //swap two numbers
// import java.util.*;
// public class net{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//             int temp=num1;
//             num1=num2;
//             num2=temp;
//             System.out.println(num1 +"\n"+ num2);
    
//     }
// }

// //print a face
// public class net{
//     public static void main(String args[]){
//         System.out.println(" +\"\"\"\"\"+\n"+"[| o o |]\n"+" |  ^  | \n"+" | '-' | \n"+" +-----+ ");
//     }
// }

// //print binary numbers from decimal
// import java.util.*;
// public class net{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the first number");
//         int num1=sc.nextInt();
//         System.out.println("Enter the second number");
//         int num2=sc.nextInt();
//         int sum=0;
//         StringBuilder binarynumber1=new StringBuilder();
//         StringBuilder binarynumber2=new StringBuilder();
//        while(num1>0)
//        {
//         int remainder1=num1%2;
//         binarynumber1.append(remainder1);
//         num1/=2;
//        }
//       System.out.println(binarynumber1.reverse()); 
    
//        while(num2>0){
//           int remainder2=num2%2;
//           binarynumber2.append(remainder2);
//           num2/=2;
//        }
//        System.out.println(binarynumber2.reverse());

//     //    System.out.println(binarynumber1.reverse()+ "" +binarynumber2.reverse());
//       //System.out.println(binarynumber2.reverse());

//     }
// }


// //print the sum of two binary numbers
// import java.util.*;
// public class net{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the first binary number");
//         String x=sc.next();
//         System.out.println("Enter the second binary number");
//         String y=sc.next();
//         int n1=Integer.parseInt(x,2);
//         int n2=Integer.parseInt(y,2);
//         int n3=n1+n2;
//         System.out.println("n1 :" + Integer.toBinaryString(n1));
//         System.out.println("n2 :" + Integer.toBinaryString(n2));
//         System.out.println("n3=n1+n2 :" + Integer.toBinaryString(n3));
    
// }
// }


// import java.util.*;
// public class net{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         for(int i=0;i<t;i++){
//             long x=sc.nextLong();
//             System.out.println(x + "can be fitted in");
//             if(x>=-128 && x<=127)
//             System.out.println("*byte");
//             if(x>=-32768 && x<=32767)
//             System.out.println("*short");
//             if(x>=-2147483648 && x<=2147483647)
//             System.out.println("*int");
//             if(x>=-9223372036854775808L && x<=9223372036854775807L)
//             System.out.println("*long");
//         }
//     }
// }




















































































// public class net {
//     public static void main(String[] args){
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=1;j++){
//                 for(j=1;j<=n-1;j++){
//                     if(i==1||i==2){
//                  System.out.print(" ");
//                     }
//                 }
//                if(i==3){
//                 System.out.print("j"+ " "+" ");
//                }
//                 if(i==4){
//                 System.out.print(" "+"j");
//                }
//                System.out.print("j"+" ");
//             }
//             System.out.println();
//         }
       
//     }
// }

// import java.util.*;
// public class net{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         String names[]=new String[n];
//         for(int i=0;i<n;i++){
//             names[i]=sc.next();
//         }
//         String max=names[0];
        
//         for( int i=0;i<n;i++){
//           if(names[i]>max){
//             max=names[i];
//           }
//         }

//     }
// }

//calculate n^x
// import java.util.*;
// public class net{
//     public static int calcPow(int n,int x){
//         if(x==0){
//             return 1;
//         }
    
//         int pow_=calcPow(n,x-1);
//         int npowx=n*pow_;
//         calcPow(n,x-1);
//         return npowx; 
//     }

//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int x=sc.nextInt();
//         int printpow=calcPow(n,x);
//         System.out.println(printpow);
//         calcPow(n,x);
//     }
// }

//recursion to find gcd
// import java.util.*;
// public class net{
//     public static void gcdNum(int i,int num1,int num2){
//         if(i==num2){
//             return;
//         }
//         if((num1%i==0) && (num2%i==0)){
//             System.out.println("GCD of two numbers is " + i);
//         }
//          gcdNum(i+1,num1,num2);
//     }
//     public static void main(String args[]){
//         int i=2;
//         Scanner sc=new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//         gcdNum(i, num1, num2);

//     }
// }

//or

// import java.util.*;/**
//  * net
//  */
// public class net {
//     public static int gcdNum(int num1,int num2){
//         if(num2==0){
//             return num1;
//         }
//         else{
//             return gcdNum(num2,num1%num2);
//         }
//     }
//      public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the num1 value");
//         int num1=sc.nextInt();
//         System.out.println("Enter the num2 value");
//         int num2=sc.nextInt();
//         int gcd=gcdNum(num1,num2);
//         System.out.println("GCD of two numbers is " + gcd);
//      }
// }

// //Recursion to calculate factorial of a number
// import java.util.*;
// public class net{
//     public static void factNum(int i,int fact,int n){
//         if(i==n){
//             fact*=i;
//             System.out.println("Factorial of the number is " + fact);
//             return;
//         }
//         fact*=i;
//         factNum(i+1,fact,n);
//     }
//     public static void main(String args[]){
//         int i=1;
//         int fact=1;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n=sc.nextInt();
//         factNum(i,fact,n);

//     }
// }

// //recursion sum of no from 1 to n
// import java.util.*;
// public class net{
//     public static void sumNum(int i,int sum,int n){
//         if(i==n){
//             sum+=i;
//             System.out.println("Sum of numbers from 1 to n is " + sum);
//             return;
//         }
//         sum+=i;
//         sumNum(i+1,sum,n);

//     }
//     public static void main(String args[]){
//         int i=1;
//         int sum=0;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n=sc.nextInt();
//         sumNum(i,sum,n);

//     }
// }

// //Recursion to calculate nth fibonacci
// import java.util.*;
// public class net{
//     public static void calcFib(int a,int b,int n){
//         if(n==0){
//             return;
//         }
//         int c=a+b;
//         System.out.print(c + " ");
//         calcFib(b,c,n-1);
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the nth number");
//         int n=sc.nextInt();
//         int a=0;
//         int b=1;
//         System.out.print(a + " " + b + " ");
//         calcFib(a,b,n-2);
//     }
// }


//Recursion to check palindrome
// import java.util.*;
// public class net{
//     public static void checkPal(int i,String name){
//         if(i==name.length()){
//             return;
//         }
//         name.length();
//         int front=i;
//         int back=name.length()-1-i;
//         char frontchar=name.charAt(front);
//         char backchar=name.charAt(back);
//         if(backchar==frontchar){
//             System.out.println("Given String is a palindrome");
//         }
//         else{
//             System.out.println("Given String is not a palindrome");
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String name=sc.nextLine();
//         int i=0;
//         checkPal(i,name);
//     }
// }

//or




// // //Recursion to reverse a string
// import java.util.*;
// public class net{
//     public static void printRev(int i,String str){
//         if(i==0){
//             System.out.print(str.charAt(i));
//             return;
//         }
//      System.out.print(str.charAt(i));
//      printRev(i-1,str);
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String str=sc.nextLine();
//         int i=str.length()-1;
//         printRev(i,str);
//     }
// }



//         }
//     public static void main(String args[]){
//      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter a String");
//      String name=sc.nextLine();
//      int i=0;
//     revStr(i,name);
//     }
// }

// //Recursion to print length of a string
// import java.util.*;
// public class net{
//     public static void printLength(String name){
//         int length= name.length();
//         System.out.println("length of a String is " + length);

//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a string ");
//         String name=sc.nextLine();
//         printLength(name);
//     }
// }


// //Recursion to print sum of odd numbers
// import java.util.*;
// public class net{
//     public static void printSum(int i,int sum,int n){
       
//         if(i==n)
//         {
//             sum+=i;
//             System.out.println("Sum of all odd numbers is " + sum);
//             return;
//         } 
//         if (i%2!=0) {
//             sum+=i;
//     }
   
//       printSum(i+1,sum,n);
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n=sc.nextInt();
//         int i=1;
//         int sum=0;
//         printSum(i,sum,n);

//     }
// }


// //Recursion to find maximum element in an array
// import java.util.*;
// public class net{
//     public static void maxEle(int i,int n,int arr[]){
//         if(i==n){
//             return;
//             }
//             int max=arr[0];
//         if(arr[i]>max){
//             max=arr[i];
//             System.out.println("Maximum number in the array is " + max);
//         }

//         maxEle(i+1,n,arr);
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//          int i=0;
//          //int max=arr[0];
//          maxEle(i,n, arr); 
//     }
// }



