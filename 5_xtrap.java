// import java.util.*;
// public class xtrap{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int num1=sc.nextInt();
//         int num2=sc.nextInt();
//         int num3=sc.nextInt();
//         int average=(num1+num2+num3)/3;
//         System.out.println(average);
//     }
// }


// import java.util.*;
// public class xtrap{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         char ch=sc.next().charAt(0);
//         if(ch>='a' && ch<='z'){
//             System.out.println("Given character is not a digit");
//         }
//         else{
//             System.out.println("Given character is a digit");
//         }
//     }
// }


// import java.util.*;
// public class xtrap{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int number[]=new int[n];
       
//         for(int i=0;i<n;i++){
//             number[i]=sc.nextInt();
//         }
//         int small=number[0];
//         for(int i=1;i<n;i++){
//             if(number[i]<small){
//                 small=number[i];
//             }
//         }
//         System.out.println("Smallest number in the array is " + small);
     
//     }
// }

// import java.util.*;
// public class xtrap{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int marks=sc.nextInt();
//         if(marks>=30){
//             System.out.println("Student is passed");
//         }
//         else{
//             System.out.println("Student is failed");
//         }
//     }
// }


// import java.util.*;
// public class xtrap{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int marks=sc.nextInt();
//         if(marks>=90 && marks<=100){
//             System.out.println("Student grade is A+");
//         }
//         else if(marks>=70 && marks<90){
//             System.out.println("Student grade is A");
//         }
//         else if(marks>=30 && marks<70){
//             System.out.println("Student grade is B");
//         }
//         else{
//             System.out.println("Student grade is C");
//         }
//     }
// }


// import java.util.*;
// public class xtrap{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         char ch=sc.next().charAt(0);
//         if(ch>='A' && ch<='Z'){
//            System.out.println("Character entered by user is Uppercase");
//         }
//         else if(ch>='a'&&ch<='z'){
//             System.out.println("Character entered by user is not a Uppercase");
//         }
//         else{
//             System.out.println("Invalid input");
//         }

//     }
// }


//Armstrong number
//To print an armstrong number
// import java.util.*;
// public class xtrap{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int number[]=new int[n];
//         int armstrong=0;
//         for(int i=0;i<n;i++){
//             number[i]=sc.nextInt();
//             double pow_=Math.pow(number[i],3);
//             armstrong+=pow_;
//         }  
//         System.out.println(armstrong);    
//     }
// }

// //To check whether the number is an armstrong or not
// import java.util.*;
// public class xtrap{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int remainder;
//         double result=0;
//         int originalnumber=n;
//         while(originalnumber!=0){
//           remainder=originalnumber%10;
//           result=result+Math.pow(remainder,3);
//           originalnumber=originalnumber/10;
//         }
//         if(result==n){
//             System.out.println("It is an armstrong number");
//         }
//         else{
//             System.out.println("It is not an armstrong number");
//         }
//     }


////Program to find whether its a natural number or not
// import java.util.*;
// public class xtrap{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n=sc.nextInt();
//         if(n>=1){
//             System.out.println("It is a natural number");
//         }
//         else{
//         System.out.println("It is not a natural number");
//         }
//     }
// }

////Hollowed rectangle
// import java.util.*;
// public class xtrap{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number of rows");
//         int n=sc.nextInt();
//         System.out.println("Enter the number of columns");
//         int m=sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=m;j++){
//                 if(i==1||j==1||i==n||j==m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }

// // left half pyramid
// public class xtrap{
//     public static void main(String args[]){
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

////Inversed left half pyramid
// public class xtrap{
//     public static void main(String args[]){
//         int n=4;
//         for(int i=n;i>=1;i--){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

////Inversed right half pyramid
// public class xtrap{
//     public static void main(String args[]){
//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int j=n;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// //substring in a string
// public class xtrap{
//     public static void main(String args[]){
//         String sentence="My soul is my parents";
//         System.out.println(sentence.substring(3,7));
//     }
// }

////Print numbers from 1 to 5 by using recursion in java
// public class xtrap{
//     public static void printNumb(int n){
//         if(n==6){
//             return;
//         }
//         System.out.println(n);
//         printNumb(n+1);
//     }
//     public static void main(String args[]){
//         int n=1;
//        printNumb(n);

//     }
// }


////print sum of first n natural numbers
// public class xtrap{
//     public static void printSum(int n,int sum){
//         if(n==0){
//             System.out.println(sum);
//             return;
//         }
//         sum+=n;
//         printSum(n-1,sum);
//     }
//     public static void main(String args[]){
//         int n=6;
//         int sum=0;
//         printSum(n,sum);
//     }
// }


////print factorial of a given number
// public class xtrap{
//     public static void printFact(int n,int fact){
//         if(n==0){
//             System.out.println(fact);
//             return;
//         }
//         fact*=n;
//         printFact(n-1,fact);
//     }
//     public static void main(String args[]){
//         int n=5;
//         int fact=1;
//         printFact(n,fact);
//     }
// }

////print stack height n
// public class xtrap{
//     public static int calcPow(int x,int n){
//         if(n==0){
//             return 1;
//         }
//         int pow_=calcPow(x,n-1);
//         int xpow=x*pow_;
//         calcPow(x,n-1);
//         return xpow;
//     }
//     public static void main(String args[]){
//         int x=2;
//         int n=6;
//         int printPow=calcPow(x,n);
//         System.out.println(printPow);
//         calcPow(x,n);
//     }
// }


////tower of hanoi
// import java.util.*;
// public class xtrap3{
//     public static void towerHanoi(int n,String src,String helper,String desn){
//         if(n==1){
//             System.out.println("Desk " +n+ " is transferred from " + src + " to " + desn);
//             return;
//         }
//       towerHanoi(n-1,src,desn,helper);
//       System.out.println("Desk " +n+ " is transferred from " + src +" to " +  desn );
//       towerHanoi(n-1,helper,src,desn);
//     }
//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number of disks");
//         int n=sc.nextInt();
//         towerHanoi(n,"S","H","D");
//     }
// }


// ////check array is sorted in increasing order
// import java.util.*;
// public class xtrap{
//     public static void checkSort(int arr[],boolean isAscending,int i){
//         if(i==arr.length-1){
//             if(isAscending){
//                 System.out.println("Array is sorted in strictly increasing order");
//             }
//             else{
//                 System.out.println("Array is not sorted in strctly increasing order");
//             }
//         }
//         if(arr[i]>arr[i+1]){
//             isAscending=false;
//         }
//         checkSort(arr,isAscending,i+1);
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the size of an array");
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         boolean isAscending=true;
//         checkSort(arr,isAscending,0);

//     }
// }

// import java.util.*;
// public class xtrap{
//     public static void main(String args[]){
//         Scanner scanner=new Scanner(System.in);
//         int n=scanner.nextInt();
//         if(n%2!=0){
//             System.out.println("Weird");
//         } 
//         else if(n%2==0){
//             if(n>=2 && n<=5){
//                 System.out.println("Not Weird");  
//             }
//             else if(n>=6 && n<=20 ){
//                 System.out.println("Weird");
//             }
//             else{
//                 System.out.println("Not Weird");
//             }
//         }
//     }
// }

// class Solution{
//     public static void main(String []argh){
//         Scanner in = new Scanner(System.in);
//         int t=in.nextInt();
//         for(int i=0;i<t;i++){
//             int a = in.nextInt();
//             int b = in.nextInt();
//             int n = in.nextInt();
//             for( i=0;i<n;i++){
//                 double pow=Math.pow(2,i);
//                 double mul=pow*b;
//                 double mul_=0;
//                  mul_+=mul;
//                 double q1=a+mul_;
//                 double q2=a+mul_;
//                 System.out.print(q1 + " ");
//                 System.out.print(q2 + " ");
                
                
//             }
//         }
        
// public class xtrap{
//     public static void main(String args[]){
//         int n=4;
//         int m=5;
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=5;j++){
//                 if(i==1||j==1||i==n||j==m){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }   

// public class xtrap{
//     public static void main(String args[]){
//         int n=4;
//         for(int i=1;i<=4;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


// public class xtrap{
//     public static void main(String[] args){
//         int n=5;
//         int num=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(num + " ");
//                 num++;
//             }
//             System.out.println();
//         }
//     }
// }

// public class xtrap{
//     public static void main(String args[]){
//           int i=10;
//           while(i<=20){
//               if(i%2!=0){
//                 System.out.println(i);
//               }
//               i++;

//           }
//     }
// }

// ////Prime number
// import java.util.*;
// public class xtrap{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int  n=sc.nextInt();
//         int count=0;
//         int i=1;
//         while(i<=n){
//             i++;
//             if(n%i==0){
//                 count++;
//             }
//         }
//         if(count==2){
//             System.out.println("yes");
//         }
//         else{
//             System.out.println("no");
//         }
//     }
// }

// import java.util.*;
// import bank;

// class Shape{
//     String area;
// }

// class Triangle extends Shape{
//     public void area(int l,int b){
//         System.out.println(1/2*b*l);
//     }
// }

// class Circle extends Shape{
//     public void area(int r){
//         System.out.println(3.14*r*r);
//     }
// }

// public class xtrap{
//     public static void main(String args[]){
//         bank.Account account1=new bank.Account();
//         account1.name="customer";
//     }
// }


// import java.util.*;/**
//  * xtrap
//  */
// public class xtrap {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
   
//         int array[]=new int[n];
//         for(int i=0;i<n;i++){
//           array[i]=sc.nextInt();
//         }

//       for(int i=0;i<n;i++){
//         if(array[i]%2==0){

//         }
//       }
//     }

// }


// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class Codechef
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc=new Scanner(System.in);
// 		int t=sc.nextInt();
//         int count=0;
//         int count_=0;
// 		for(int i=0;i<t;i++){
// 		    int b1=sc.nextInt();
// 		    int b2=sc.nextInt();
// 		    int b3=sc.nextInt();
		    
// 		   if((b1 | b2 | b3)==0){
// 		       count++;
// 		   }
		   
// 		   else {
// 		       count_++;
// 		   }
// 		}
		
// 		if(count>count_){
// 		    System.out.println("Water filling time");
// 		}
// 		else{
// 		    System.out.println("Not now");
// 		}
// 	}
// }

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// class xtrap
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
// 		// your code goes here
// 		Scanner sc=new Scanner(System.in);
// 		int t=sc.nextInt();
		
// 		for(int i=0;i<t;i++){
// 		   int n=sc.nextInt();
	
// 		   for(int j=0;j<n;j++){
// 		    int rem=n%10;
// 			System.out.println(rem);
// 		    n=n/10;
// 		   }
		    
// 		}
	

// 	}
// }

// import java.util.*;
// public class xtrap{
// 	public static void main(String args[]){
//      Scanner sc=new Scanner(System.in);
// 	 int n=sc.nextInt();
// 	 long fact=1;
// 	 for(int i=1;i<=n;i++){
// 		fact*=i;
// 	 }
// 	 System.out.println(fact);
// 	}
// }

// import java.util.*;
// public class xtrap{

// 	public static double findAverage(double number1,double number2,double number3){
//        double avg=(number1+number2+number3)/3;
// 	   //int avg_=(int)avg;
// 	   System.out.println(avg);
// 	   return avg;
// 	}
// 	public static void main(String args[]){
// 		Scanner sc=new Scanner(System.in);
// 		double number1=sc.nextInt();
// 		double number2=sc.nextInt();
// 	     double number3=sc.nextInt();

// 	    findAverage(number1, number2, number3);
// 	}
// }

// import java.util.*;

// public class xtrap{
// 	public static void  main(String args[]){
// 		Scanner sc=new Scanner(System.in);
// 		int n=sc.nextInt();
// 		int count=0;
// 		//int i=1;
// 		for(int i=1;i<=n;i++){
//          if(n%i==0){
//           count++;
// 		 }
// 		}
// 		if(count==2){
// 			System.out.println("It is a prime number");
// 		}
// 		else{
// 			System.out.println("It is not a prime number");
// 		}
	
// 	}
// 	}

// public class xtrap{
// 	// public static void printArray(int arr[]){
		
// 	// }
// 	public static void main(String args[]){
// 		int arr[]={7,8,3,1,2};
// 		for(int i=1;i<arr.length;i++){
// 			int j=i-1;
// 			int current=arr[i];
// 			while(j>=0 && current<arr[j]){
// 				arr[j+1]=arr[j];
// 				j--;
// 			}
// 			arr[j+1]=current;
// 		}
// 		for(int i=0;i<arr.length;i++){
// 			System.out.print(arr[i]+" ");
// 		  }
// 		//printArray(arr);
// 	}
// }

// public class xtrap{
//     public static void main(String[] args) {
//         long arr[]={1,3,5,2,2};
//         double mid_=arr.length/2;
//         Math.ceil(mid_);
//         int mid=(int)mid_;
        
//         int sum=0;
//         int sum_=0;
//         for(int i=0;i<mid;i++){
//             sum+=arr[i];
           
//     }
//     for(int j=arr.length-1;j>mid;j--){
//         sum_+=arr[j];
//     }
//     System.out.println(mid+1);
//     System.out.println(sum);
//     System.out.println(sum_);
// }
// }
public class xtrap{
    public static void main(String[] args) {
         String words[]={"This", "is", "an", "example", "of", "text", "justification."};
         String s=String.join(" ",words);
         String s1=" ";
         int maxwidth=16;
         for(int i=0;i<=s.length();i+=maxwidth){
            s1=s.substring(i,maxwidth);
            System.out.println(s1);
         }
    

    }
}