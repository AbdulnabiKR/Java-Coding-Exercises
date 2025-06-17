// public class pract{
//     public static void main(String[] arg)
//     {
//         int age=43;
//         float naun=3.009f;
//         char c='a';
//         double v=123456.87860;
//         System.out.println(age);
//         System.out.println(naun);
//         System.out.println(c);
//         System.out.println(v);
        
//     }
// }

// import java.util.*;
// public class pract{
//     public static void main(String[] arg)
//     {
//         Scanner sc=new Scanner(System.in);
//         float radius =sc.nextFloat();
//         System.out.println( 3.14*radius*radius);
//     }
// }

// import java.util.*;
// public class pract{
//     public static void main(String[] arg)
//     {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=1;i<=10;i++)
//         {
//             System.out.println(n*i);
//         }
//     }
// }


//  import java.util.*;
// public class pract{
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//          int b=sc.nextInt();
//          int number=sc.nextInt();
//         switch(number)
//         {
//             case 1:
//             System.out.println(a+b);
//             break;
//             case 2:
//             System.out.println(a-b);
//             break;
//             case 3:
//             System.out.println(a*b);
//             break;
//             case 4:
//             if(b==0){
//             System.out.println("Invalid division");
//             }
//             else{
//                 System.out.println(a/b);
//             }
//             break;
//             case 5:
//             if(b==0)
//             {
//             System.out.println("Invalid");
//             }
//             else{
//                 System.out.println(a%b);
//             }
//             break;
//             default:
//             System.out.println("Invalid");
//         }
//     }
// }

// import java.util.*;
// public class pract{
//     public static void main(String[] args)
//     {
//         Scanner sc=new Scanner(System.in);
//         int number=sc.nextInt();

//         switch(number){
//          case 1:
//          System.out.println("January");
//          break;
//          case 2:
//          System.out.println("February");
//          break;
//          case 3:
//          System.out.println("March");
//          break;
//          case 4:
//          System.out.println("April");
//          break;
//          case 5:
//          System.out.println("May");
//          break;
//          case 6:
//          System.out.println("June");
//          break;
//          case 7:
//          System.out.println("July");
//          break;
//          case 8:
//          System.out.println("August");
//          break;
//          case 9:
//          System.out.println("September");
//          break;
//          case 10:
//          System.out.println("October");
//          break;
//          case 11:
//          System.out.println("November");
//          break;
//          case 12:
//          System.out.println("December");
//          break;
//          default:
//          System.out.println("Invalid");

//         }
//     }
// }

// import java.util.*;
// public class pract{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         for(int i=0;i<=n;i++)
//         {
//             if(i%2==0)
//             {
//                 System.out.println(i);
//             }
//         } 
//     }
// }


// import java.util.*;
// public class pract{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int marks=sc.nextInt();
//         int i=1;
//         do{
//             if(n==0)
//             {
//                 break;
//             }
//             else
//             {
//                 if(marks>=90){
//                     System.out.println("This is Good");
//                 }
//                 else if(marks<=89&&marks>=60)
//                 {
//                     System.out.println("This is also Good");
//                 }
//                 else{
//                     System.out.println("This is Good as well");
//                 }
//             }
//             i--;
//         }while(i>=n);
//     }
// }

// import java.util.*;
// public class pract{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int marks=sc.nextInt();
//         for( int i=1;i>=n;i--)
//         {
//             if(n==0)
//             {
//                 break;
//             }
//             else
//             {
//           if(marks>=90)
//               {
//                 System.out.println("This is good");
//               }
//               else if(marks<=89&&marks>=60)
//               {
//                 System.out.println("This is also good");
//               }
//               else{
//                 System.out.println("This is good as well");
//               }
//             }
            
//         }
//     }
// }

// //***prime number upto particular value */
// import java.util.*;
// public class pract {
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int i;
//     int j;
//     for( i=1;i<=n;i++){
//       int count=0;
//       for( j=1;j<=i;j++){
//         if(i%j==0){
//           count++;
//         }
//       }
//     if(count==2){
//       System.out.println(i);
//     }
//   }
//   }
// }

// //****Prime number check  */
// import java.util.*;
// public class pract {

//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int count=0;
  
//        for(int j=1;j<=n;j++){
//       if(n%j==0){
//         count++;
//       }
//     }
//     if(count==2){
//       System.out.println("Its a prime number");

//     }
//     else{
//       System.out.println("Its not a prime number");
//     }
//   }
// }

//***Rhombus printing****/
// public class pract {
//     public static void main(String[] args) {
//      int n=5;
  
//      int m=4;
//      for(int i=1;i<=m;i++){
//         for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//         }

//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//      }
//      for(int i=1;i<=n;i++){
//         for(int j=n;j>=i;j--)
//         {
//            System.out.print("*");
//         }
//         System.out.println();

//     }
//     }
     
//  }
//or
//**Rhombus printing type 2 */
// public class pract {
//    public static void main(String[] args) {
//     int n=5;
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       for(int j=1;j<=n;j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }

//    }
  
// }

// public class pract{
//     public static void main(String[] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.println();
//         }
//     }
// }

// public class pract{
//     public static void main(String[] args){
//         int n=4;
//        // int m=5;
//         for(int i=1;i<=n;i++){
//           for(int j=1;j<=n-i;j++){
//             System.out.print(" ");
//           }
//           for(int j=2;j<=i+1;j++){
//             System.out.print(j);
//           }
        
//         for(int j=2;j<=i+1;j++)
//         {
//            System.out.print(j);
//         }
//         System.out.println();
       
//       }
//     }
//}


//***Pyramid printing ***/
// public class pract {
// public static void main(String[] args){
//   int n=5;
//   for(int i=1;i<=n;i++){
//     for(int j=1;j<=n-i;j++){
//       System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//       System.out.print(i + " ");
//     }
   
//     System.out.println();
//   }
// }
// }

//***Palindromic Pyramid */
// public class pract {
//   public static void main(String[] args) {
//     int n=5;
//   //  int m=4;
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=n-i;j++)
//       {
//         System.out.print(" ");
//       }
//       for(int j=i;j>=1;j--){
//         System.out.print(j);
//       }
    
//       for(int j=2;j<=i;j++){
//         System.out.print(j);
//       }
    
      
    
//       System.out.println();
//     }
 
    
//   }  
  
  
// }

// public class pract {

//   public static void main(String[] args) {
//     int n=4;
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       for(int j=1;j<=i;j++){
//         System.out.print("*");
//       }
//       for(int j=2;j<=i;j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//     for(int i=n;i>=1;i--)
//     {
//       for(int j=1;j<=n-i;j++)
//       {
//         System.out.print(" ");
//       }
//       for(int j=1;j<=i;j++){
//         System.out.print("*");
//       }
//       for(int j=2;j<=i;j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }


// //**Hollow butteerfly print***/
// public class pract{
//   public static void main(String[] args) {
//     int n=5;
//    for(int i=1;i<=n;i++){
//     for(int j=1;j<=i;j++){
//       if(j==1||j==i){
//         System.out.print("*");
//       }
//       else{
//       System.out.print(" ");
//     }
//   }
//     for(int j=1;j<=2*(n-i);j++){
//       System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//       if(j==1||j==i){
//         System.out.print("*");
//       }
//       else{
//       System.out.print(" ");
//     }
//   }
  
//     System.out.println();
//    }
//    for(int i=n;i>=1;i--){
//     for(int j=1;j<=i;j++){
//       if(j==1||j==i){
//         System.out.print("*");
//       }
//       else{
//         System.out.print(" ");
//       }
//     }
//     for(int j=1;j<=2*(n-i);j++){
//       System.out.print(" ");
//     }
//     for(int j=1;j<=i;j++){
//       if(j==1||j==i){
//         System.out.print("*");
//       }
//       else{
//         System.out.print(" ");
//       }
     
//     }
//     System.out.println();
//    }
         
    
//   }
// }


//***Hollow Rhombus** */
// public class pract {

//   public static void main(String[] args) {
//     int n=5;
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       for(int j=1;j<=n;j++){
//        if(i==2||i==3||i==4){
//         if(j==1||j==n){
//           System.out.print("*");
//         }
//         else{
//           System.out.print(" ");
//         }
//       }
//       else{
//                System.out.print("*");
//       }
//     }
      
//       System.out.println();
//     }
//   }
// }


// or
// ***Hollow Rhombus type 2 long method****/
// public class pract {

//   public static void main(String[] args) {
//     int n=5;
//    // int m=4;
  

//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       for(int j=1;j<=i;j++){
//       if(i==2||i==3||i==4){
//         if(j==1){
//           System.out.print("*");
//         }
//         else{
//           System.out.print(" ");
//         }

//       }
//       else{
//         System.out.print("*");
//       }
//       }
//       System.out.println();
//     }
//     for(int i=n;i>=1;i++){
//       for(int j=1;j<=i-1;j++){
//        if(i==2||i==3||i==4){
//          if(j==(i-1)){
//            System.out.print("*");
//          }
//          else{
//            System.out.print(" ");
//          }
//        }
//        else{
//          System.out.print("*");
//        }
//       }
//       System.out.println();
//     }
  
//   }
// }

// //****Pascal's Traingle****/
// //sum of numbers is binomial like-->1,2,4,8,16,32
// public class pract{
//   public static void main(String[] args){
//     int n=5;
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       for(int j=1;j<=i;j++){
        
//        if(i==1||i==2||i==3){
//         if(j==1||j==i){
//           System.out.print("1" + " ");
//         }
//         else{
//           System.out.print(j + " ");
//         }
//       }
//       else if(i==4){
//       if(j==2){
//         System.out.print("3" + " ");
//       }
//      else if(j==1||j==i){
//         System.out.print("1" + " ");
//       }
//       else{
//         System.out.print(j + " ");
//       }
//      }
//      else {
//       if(j==2){
//         System.out.print("4" + " ");
//       }
//       else if(j==3){
//         System.out.print("6" + " ");
//       }
//       else if(j==1||j==i){
//         System.out.print("1" + " ");
//       }
      
//       else{
//         System.out.print(j + " ");
//       }
//      }
//     }
//     System.out.println();
//     }
 
//   }
//   }

// //or
// //***Pascal's triangle type 2 */
// public class pract {

//   public static void main(String[] args) {
//     int n=4;
//     for(int i=0;i<=n;i++){
//       int num=1;
      
//       for(int j=0;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       for(int j=0;j<=i;j++){
//         System.out.print(num + " ");
//         num=num*(i-j)/(j+1);
//       }
//       System.out.println();
//     }
//   }
// }

// // ***Half Pyramid****
// public class pract {

//   public static void main(String[] args) {
//     int n=5;
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=i;j++){
//         System.out.print(j+" ");
//       }
//       System.out.println();
//     }
//   }
// }

// public class pract {

// public static void main(String[] args) {
//   int n=4;
//   for(int i=1;i<=n;i++){
//     for(int j=n;j>=i;j--){
//       System.out.print(i+" ");
//     }
//     System.out.println();
//   }
// }
// 
//Check even number
// import java.util.*;
// public class pract{
//   public static int evenNum(int n){
//     if(n%2==0){
//       System.out.println("Given number is an even");
//     }
//     else{
//       System.out.println("Its not an even number");
//     }
//     return n;
//   }
//   public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     evenNum(n);
//   }
// }


// //***Print table of n */
// import java.util.*;
// public class pract {
//   public static int printTable(int n){
//     for(int i=1;i<=10;i++){
//       System.out.println(n*i);
//     }
//     return n;
//   }

//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     printTable(n);
   
//   }
// }

// //***Prime number */
// import java.util.*;
// public class pract {
//   public static void checkPrime(int n){
//     int count=0;
   
  
//       for(int j=1;j<=n;j++){
//         if(n%j==0){
//           count++;
//         }
//       }
     
    
  
//     if(count==2){
//       System.out.println("Its a prime number");
//     }
//     else{
//       System.out.println("Its not a prime number");
//     }

//   }
// }

//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     checkPrime(n);

    
//   }
// }

// import java.util.*;
// public class pract {

//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
 
//       String names[]=new String[n];
//     for(int i=0;i<n;i++){
//       names[i]=sc.next();
//     }
//     for(int i=0;i<n;i++){
//      System.out.println("name is " + names[i]);
//     }
 

//   }
// }


//**Check it is an ascending */
// import java.util.*;
// public class pract{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int numbers[]=new int[n];
//     int i;
//     for( i=0;i<n;i++){
//       numbers[i]=sc.nextInt();
//   }
//    boolean isAscending=true;
//    for(i=0;i<numbers.length-1;i++){//numbers.length-1  is termination condition
   
// if(numbers[i]>numbers[i+1]){
//  isAscending=false;

// }
//    }
// if(isAscending){
//     System.out.println("The array is sorted in ascending order");
// }
// else{
//     System.out.println("The array is not sorted in ascending order");
// }
  

//   }
// }


// import java.util.*;
// public class pract {
//   public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int numbers[]=new int[n];
//     int i;
//     for(i=0;i<n;i++){
//       numbers[i]=sc.nextInt();
//     }
//     boolean isDescending=true;
//     for(i=0;i<numbers.length-1;i++){
//       if(numbers[i]<numbers[i+1]){
//         isDescending=false;
//       }
//     }
//     if(isDescending){
//       System.out.println("The array elements are sorted in Descending order");
//     }
//     else{
//       System.out.println("The array elements are not sorted in Descending order");
//     }
//   }

// }


// import java.util.*;
// public class pract{
//   public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int numbers[]=new int[n];
//     int i;
//     for(i=0;i<n;i++){
//     numbers[i]=sc.nextInt();
//     }
//     boolean isAscending=true;
//     boolean isDescending=true;
//     for(i=0;i<numbers.length-1;i++){
//      if(numbers[i]>numbers[i+1]){
//       isAscending=false;
//      }
//      else if(numbers[i]<numbers[i+1]){
//       isDescending=false;
//      }
    
//     }
//     if(isAscending){
//       System.out.println("The array is sorted in Ascending oredr");
//     }
//     else if(isDescending){
//       System.out.println("The array is sorted in Descending order");
//     }
//     else{
//       System.out.print("invalid input");
//      }
    
//   }
// }

// import java.util.*;
// public class pract{
//   public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();//size input
//     int numbers[]=new int[n];//array
//     int i;
//     for(i=0;i<n;i++){
//       numbers[i]=sc.nextInt();//input array
//     }
//      int max=numbers[0];//**Considering first element in the array is max to compare with others */
//      int min=numbers[0];//**Considering first element in the array is min to compare with others */
//      for(i=1;i<n;i++){
//        if(numbers[i]>max){
//           max=numbers[i];
//        }
//      }
//      System.out.println("Maximum number in the array is " + max);
//      for(i=1;i<n;i++){
//       if(numbers[i]<min){
//          min=numbers[i];
//       }
//      }
//      System.out.println("Minimum number in the array is " + min);
     
//   }
// }

// //**Print transpose of N*M */
// import java.util.*;
// public class pract{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int N=sc.nextInt();
//         int M=sc.nextInt();
//         int matrix[][]=new int[N][M];
//         for(int i=0;i<N;i++){
//             for(int j=0;j<M;j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }
//         for(int j=0;j<M;j++){
//           for(int i=0;i<N;i++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//        }
//     }
// }

//*****Spiral matrix  */
//int dir=0;0-left to right,1-top to down,2-Right to left,3-down to top

// import java.util.*;
// public class pract{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int row=sc.nextInt();
//         int coln=sc.nextInt();
//         int matrix[][]=new int[row][coln];
        
//         for(int i=0;i<row;i++){
//             for(int j=0;j<coln;j++){
//              matrix[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("The spiral order matrix is ");
//         int fr=0;
//         int lr=row-1;
//         int fc=0;
//         int lc=coln-1;
//         while(fr<=lr&&fc<=lc){
//             for( int k=fc;k<=lc;k++){
//             System.out.print(matrix[fr][k] + " ");//1
//             }
//             fr++;

//             for(int k=fr;k<=lr;k++){
//                 System.out.print(matrix[k][lc] + " ");//2
//             }
//             lc--;
//             for(int k=lc;k>=fc;k--){
//                 System.out.print(matrix[lr][k] + " ");//3
//             }
//             lr--;
//             for(int k=lr;k>=fr;k--){
//                 System.out.print(matrix[k][fc] + " ");
//             }
//             fc++;
//             for(int k=fc;k<=lc;k++){
//                 System.out.print(matrix[fr][k] + " ");
//             }
//             fr++;
//             for(int k=fr;k<=lr;k++){
//                 System.out.print(matrix[k][lc] + " ");
//             }
//             lc--;
//             for(int k=lc;k>=fc;k--){
//                 System.out.print(matrix[lr][k] + " ");
//             }
//             lr--;
//             for(int k=fc;k<=lc;k++){
//                 System.out.print(matrix[fr][k] + " ");
//             }
//             fr++;

//         }
//     }
// }


// import java.util.*;
// public class pract{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         String array[]=new String[n];
//         int i;
//         int totallength=0;
//         for (i=0;i<n;i++){
//             array[i]=sc.nextLine();
//             totallength+=array[i].length();
//         }
//         System.out.println(totallength);
//     }
// }

// import java.util.*;
// public class pract{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String original=sc.nextLine();
//         String result="";
//         for(int i=0;i<original.length();i++){
            
//             if(original.charAt(i)=='e'){
//                 result+='i';
//             }
//             else{
//                 result+=original.charAt(i);
//             }
//             System.out.print(result.charAt(i));
//         }
//     }
// }

// import java.util.*;
// public class pract{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         String email=sc.nextLine();
//         System.out.print(email.substring(0,13));


//     }
// }

// //*Strings questions solving by using StringBuilder */
// import java.util.*;
// public class pract{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         String array[]=new String[n];
//         int i;
//         StringBuilder sb = new StringBuilder();
//         for(i=0;i<n;i++)
//         {
//             array[i] = sc.next();
//             sb.append(array[i]);
//         }
//         System.out.println(sb.length());
//     }
// }

// import java.util.*;
// public class pract{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     String original=sc.nextLine();
//     StringBuilder result=new StringBuilder(original);
//     for(int i=0;i<original.length();i++){
//       if(original.charAt(i)=='e'){
//         result.setCharAt(i,'i');
//       }
//       else{
//         original.charAt(i);
//       }
//     }
//     System.out.println(result);
//   }
// }




// import java.util.*;
// public class pract{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     String email=sc.nextLine();
//     StringBuilder sb=new StringBuilder(email);
//     sb.delete(13,24);
//     System.out.println(sb);
//   }
// }


// import java.util.*;
// public class pract{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     for(int i=0;i<n;i++){
//         if(n==Math.pow(2,i)){
//             System.out.println("Number is  a power of 2");
//         }
//     }
   
   
//   }
// }




//Program to toggle a bit a position ="pos" in a number n
/*
 Toggle a bit position means 1 to 0 or 0 to 1
 */
 
//  import java.util.*;
//  public class pract{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int pos=sc.nextInt();
//     int bitmask=1<<pos;
//     int newnumber=bitmask ^ n;
//     System.out.println(newnumber);
//   }
//  }

//or

// import java.util.*;
// public class pract{
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     int opern=sc.nextInt();
//     int n = sc.nextInt();
//     int pos=sc.nextInt();
//     int bitmask=1<<pos;
//     if(opern==1)
//     {
//       int newnumber=bitmask|n;
//       System.out.println(newnumber);
//     }
//     else{
//       int newbitmask=~(bitmask);
//       int newnumber=newbitmask & n;
//       System.out.println(newnumber);
//     }
//   }
// }


// import java.util.*;
// public class pract{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         // System.out.print(n%2);
//         //   int qt=n/2;
//         //   System.out.print(n%2);
//         int i;
//         for( i=n;i>=1;i--){ 
//           int qt=i/2;
//         //  int rem=i%2;
//          int rem=qt%2;
//         System.out.println(rem);
//         }
//     }
// }


//**Binary representation of the number count */
// import java.util.*;
// public class pract{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         StringBuilder binarynumber=new StringBuilder();
//         int count=0;
//         while(n>0){
//             int remainder=n%2;
//               binarynumber.append(remainder);
//               n=n/2;
//               if(remainder==1){
//                 count+=1;
//                 System.out.println(count);
//               }
//         }  
//     }
// }

//Decimal to binary and Binary to decimal

//1.Decimal to binary
// import java.util.*;
// public class pract{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         StringBuilder binarynumber=new StringBuilder();
//     while(n>0){
//         int remainder=n%2;
//       binarynumber.append(remainder);
//         n=n/2;
//     }
//     System.out.println(binarynumber.reverse());
//     }
// }

//*Binary to decimal */
// import java.util.*;
// public class pract{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int binarynumber[]=new int[n];
//         double decimal=0;
//         for(int i=0;i<n;i++){
//             binarynumber[i]=sc.nextInt();
//             double pow_=Math.pow(2,i);
//             double mul=binarynumber[i]*pow_;
//             decimal+=mul;
//         }  
//          System.out.println(decimal); 
//     }
// }

//*Code to convert from binary to decimal */
// import java.util.*;
// public class pract{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a binary number");
//         int n=sc.nextInt();
//         int remainder;
//         double decimal=0;

//         for(int i=0;i<4;i++)
//         {
//             remainder=n%10;
//             double pow_=Math.pow(2,i);
//             double mul=remainder*pow_;
//             decimal+=mul;
//             n=n/10;
//         }
//         System.out.println("Decimal of the given number is " + decimal);
//     }
// }

////prmutation practice question
// public class pract{
//     public static void printPerm(String number,String permutation,int idx){
//      if(number.length()==0){
//      System.out.println(permutation);
//         return;

//      }
//      for(int i=0;i<number.length();i++){
//         char currChar=number.charAt(i);
//         String newstring=number.substring(0,i)+number.substring(i+1);
//         printPerm(newstring,permutation+currChar,idx+1);
//      }
//     }
//     public static void main(String args[]){
//         String number="123";
//         printPerm(number,"",0);

//     }
// }


//Knight tour problem
/*
private static final-
 private-member or variable which is declared or valid within the class
 static-constant
 final-finalised the constant variable which is declared within the particular class
 */
// public class pract{
//     private static final int boardsize=8;//size of the chessboard
//    private static final int[][] moves={{2,1},{1,2},{-1,2},{-2,1},{-2,-1},{-1,-2},{1,-2},{2,-1}};//declaring total moves in chessboard by using graph
     
//     //function to check whether the given position is valid or not
//     private static boolean isValid(int x,int y,int[][] board){
//         //x and y ->current positions of a knight ,int[][] board->2D array
//         return(x>=0 && x<boardsize && y>=0 && y<boardsize && board[x][y]==-1);//board[x][y]=-1 indicates that current positions knight is unvisited the other places
//     }
//     //function to print the Knight tour problem
//     private static void printBoard(int[][] board){
//         for(int i=0;i<boardsize;i++){
//             for(int j=0;j<boardsize;j++){
//                 System.out.print(board[i][j]+ " ");
//             }
//             System.out.println();
//         }
//     }
//     //function to solve the knight tour problem
//     private static void solveKT(){
//         int[][] board=new int[boardsize][boardsize];
//         for(int i=0;i<boardsize;i++){
//             for(int j=0;j<boardsize;j++){
//                 board[i][j]=-1;//-1 indicates that all other squares are unvisited 
//             }
//         }
//         //starts from the top left corner
//         board[0][0]=0;
//         //initialize move counter
//         int movecount=1;
//         //recursive function to find the tour
//         if(!solveKT(0,0,movecount,board)){
//             System.out.println("Solution does not exist");
//         }
//         else{
//             System.out.println("Knights tour");
//             printBoard(board);
//         }

//     }
//     //recursive function
//     private static boolean solveKT(int x,int y,int movecount,int[][] board){
//         if(movecount==boardsize*boardsize){
//             return true;//All the moves got
//         }
//         //try all next moves from the current coprdinate x,y
//         for(int i=0;i<8;i++){
//             int nextX=x+moves[i][0];
//             int nextY=y+moves[i][1];
//             if(isValid(nextX,nextY,board)){
//                 board[nextX][nextY]=movecount;
//                 if(solveKT(nextX,nextY,movecount+1,board)){
//                     return true;
//                 }
//                 else{
//                     //backtrack if no solution found from the current move
//                     board[nextX][nextY]=-1;
//                 }
//             }
//         }
//         return false;
//     }
    
//     public static void main(String args[]){//main function which is recursive function solveKT
//         solveKT();
//     }
// }

// import java.util.*;


// public class pract{
//     public static void main(String []argh){
//         Scanner in = new Scanner(System.in);
//         int t=in.nextInt();
//           double mul_=0;
       
//        for(int i=0;i<t;i++){
//         int a = in.nextInt();
//             int b = in.nextInt();
//             int n = in.nextInt();
           
             
//             for(  i=0;i<n;i++){
//                 double pow=Math.pow(2,i);
//                 double mul=pow*b;
//                  mul_+=mul;
//                 double r1=a+mul_;
//                 int q1=(int)r1;
//                 System.out.print(q1 + " " );
//             }
//             System.out.println();
//        }
//     }
// }         


// //LinkedList
// import java.util.*;

// class pract{
//     public static void main(String args[]){
//         LinkedList<Integer>list=new LinkedList<Integer>();
//          list.addFirst(2);
//          list.addFirst(8);
//          list.addFirst(3);
//          list.addFirst(7);
//          list.addFirst(5);
//          list.addFirst(1);
//          list.add(3);
//          System.out.println(list);

//          for(int i=0;i<list.size();i++){
//           if(list.get(i)==7){
//             System.out.println(i);
//           }
//          }
   
//     }
// }

// //Remove the elements 26 to 50 in the  1 to 50 by using LinkedList
// import java.util.*;
// public class pract{
//   public static void main(String args[]){
//     LinkedList<Integer> list=new LinkedList<Integer>();

    

//         for(int i=1;i<=50;i++){
//             list.add(i);
//         }
//         System.out.println(list);
//         for(int i=26;i<=50;i++){
//             list.removeLast();
//         }
//     System.out.println(list);
 
//   }
// }


//Remove 4 from here
// import java.util.*;
// class pract {
//    public static void main(String args[]){
//     LinkedList<Integer> list=new LinkedList<Integer>();

//     list.addLast(1);
//     list.addLast(2);
//     list.addLast(3);
//     list.addLast(4);
//     list.addLast(5);
//     System.out.println(list);

// 	list.remove(3);
// 	System.out.println(list);

//    }
// }

// import java.util.*;

//  class pract{
//    public static void main(String args[]){
// 	LinkedList<Integer> list=new LinkedList<Integer>();

// 	list.addLast(1);
// 	list.addLast(2);
// 	list.addLast(3);
// 	list.addLast(4);
// 	System.out.println(list);
// 	list.set(1,1);
// 	list.set(0,2);
// 	list.set(2,4);
// 	list.set(3,3);

// 	System.out.println(list);
//    }
// }

// import java.util.*;
// public class pract{
// 	public static void main(String args[]){
// 		Scanner sc=new Scanner(System.in);
// 		int n=sc.nextInt();
//         System.out.println("Table of " + n + " is ");
// 		for(int i=1;i<=10;i++){
// 			System.out.println(n+ "*"+ i +"=" + n*i);
// 		}
// 	}
// }



// class pract{ 
// 	Node head;
// 	class Node{
// 	  int data;
// 	  Node next;
  
  
// 	  Node(int data){
// 		this.data=data;
// 		this.next=null;
// 	  }
// 	}
  
// 	////addFirst
// 	public void addFirst(int data){
// 	  Node newNode=new Node(data);
// 	  //head ==null
// 	 if(head==null){
// 	  head=newNode;
// 	  return;
// 	 }
  
// 	 newNode.next=head;
// 	 head=newNode;
// 	}
  
// 	//addLast
// 	public void addLast(int data){
// 	  Node newNode=new Node(data);
// 	  //head is having null next
// 	  if(head==null){
// 		head=newNode;
// 		return;
// 	  }
// 	 Node currNode=head;
// 	 while(currNode.next!=null){
// 	  currNode=currNode.next;
// 	 }
// 	 currNode.next=newNode;
// 	}
  
// 	//deleteFirst
// 	public void deleteFirst(){
// 	   if(head==null){//no elements are there 
// 		System.out.println("The list is empty here");
// 		return;
// 	   }
// 	   head=head.next;
// 	}
  
// 	//deleteLast
// 	public void deleteLast(){
// 	  Node secondLast=head;
// 	  Node lastNode=head.next;
  
// 	  while(lastNode.next!=null){
// 		lastNode=lastNode.next;
// 		secondLast=secondLast.next;
// 	  }
// 	  secondLast.next=null;
// 	}
  
// 	public void printList(){
// 	 //corner case
// 	 if(head==null){
// 	  System.out.println("The List is empty here");
// 	  return;
// 	 }
// 	 Node currNode=head;
// 	 while(currNode!=null){
// 	  System.out.print(currNode.data + "->");
// 	  currNode=currNode.next;
// 	 }
// 	 System.out.println("Null");
// 	}
// 	public static void main(String args[]){
// 	  pract list=new ();
// 	  list.addFirst(1);
// 	  list.addFirst(2);
// 	  list.addFirst(3);
// 	  list.addFirst(4);
// 	  list.printList();
  
// 	  list.addLast(5);
// 	  list.printList();
  
// 	  list.deleteFirst();
// 	  list.printList();
  
// 	  list.deleteLast();
// 	  list.printList();
  
  
// 	}
//   }
  

////swap two nodes in pairs
// class pract{
//     Node head;
//     Node tail;
//     class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }

//     ////addFirst
//     public void addFirst(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//             head=newNode;
//             return;
//         }
//         newNode.next=head;
//         head=newNode;
//     }
//    //swap nodes in pairs
//     public void swapPairs(){
//         head=swapPairs(head);//Here I am initializing the function by using the swapPairs function
//     }

//     private Node swapPairs(Node head){
//         if(head==null||head.next==null){
//             return head;//If list is empty then return from there
//         }

//         Node first=head;
//         Node second=head.next;
//         first.next=swapPairs(second.next);
//         second.next=first;
//         return second;
      
//     }

//     public void printList(){
//         Node currNode=head;
//         if(head==null){
//             System.out.println("The line is empty here");
//             return;
//         }

//         while(currNode!=null){
//             System.out.print(currNode.data + "->");
//             currNode=currNode.next;
//         }
//         System.out.println("Null");
//     }
      
     
//     public static void main(String args[]){
//      pract list=new pract();

//      list.addFirst(4);
//      list.addFirst(3);
//      list.addFirst(2);
//      list.addFirst(1);
//      list.printList();

//      list.swapPairs();
//      list.printList();

     
//     }
// }

// //swap second and fourth nodes
// class pract{
//     Node head;
//     class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//     }


//     //addFirst
//     public void addFirst(int data){
//         Node newNode=new Node(data);
//         if(head==null){
//           head=newNode;
//           return;
//         }

//         newNode.next=head;
//         head=newNode;
//     }

//     private void swapSecondandFourth(){

//         if(head==null||head.next==null||head.next.next==null||head.next.next.next==null){
//             //If 4 nodes are not there then we will return from here otherwise We will continue
//             return;
//         }

//         Node prevNode1=head;
//         Node node1=head.next;
//         Node prevNode2=head.next.next;
//         Node node2=prevNode2.next;

//         prevNode1.next=node2;
//         prevNode2.next=node1;

//         Node temp=node2.next;// Here I don't want to loss the value of 5 thats why I am storing it in a temporary variable called temp
//         node2.next=node1.next;
//         node1.next=temp;  
       
//     }
//     public void printList(){
//         if(head==null){
//             System.out.println("The List is empty here");
//             return;
//         }

//         Node currNode=head;
//         while(currNode!=null){
//             System.out.print(currNode.data + "->");
//             currNode=currNode.next;
//         }
//         System.out.println("Null");
//     }
//     public static void main(String args[]){
//       pract list=new pract();
//       list.addFirst(5);
//       list.addFirst(4);
//       list.addFirst(3);
//       list.addFirst(2);
//       list.addFirst(1);
//       list.printList();
//       list.swapSecondandFourth();
//       list.printList();
//     }
// }


// //counting the length of a number by using string
// import java.util.*;
// public class pract{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//          String n=sc.nextLine();

//          StringBuilder sb=new StringBuilder(n);
//         //  sb.length();
        

//          if(sb.length()%2==0){
//             System.out.println("Even");
//          }
//          else if(sb.length()%2!=0){
//             System.out.println("Odd");
//          }
//     }
// }

// //length of an array as even or odd
// import java.util.*;
// public class pract{
//    public static void main(String args[]){
//       Scanner sc=new Scanner(System.in);
      
//       String s="1";
//       System.out.println("Enter an array");
//       String arr[]=new String[s.length()];
//       int i=0;
//       int length=0;
//       String k=" ";
//          for(i=0;i<s.length();i++){
//            arr[i]=sc.nextLine();
          
//          }
      
//      for(i=0;i<s.length();i++){
//           k=arr[i];
//      }
//       if(k.length()%2==0){
//          System.out.println("Even");
//       }
//       else{
//          System.out.println("Odd");
//       }
//    }
// }


// //sample program
// class pract{
//     public static void main(String args[]){
//         int arr[]={12,15,18};
//         for(int i=0;i<3;i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//         //other approach to print the for loop
//         for(int val:arr){
//             System.out.print(val + " ");
//         }
      
//     }
// }
// import java.util.*;
// public class pract{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         System.out.println("Table of a " + n + " is ");
//         for(int i=1;i<=10;i++){
//         System.out.println(n + "*" + i + "=" +n*i);
//         }
//     }
// }

// //**HCF/GCD and lcm 
// import java.util.*;
// public class pract{
   
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n1=sc.nextInt();
//         int n2=sc.nextInt();
//         int on1=n1;
//         int on2=n2;
//         int hcf=1;
//         int lcm=1;
//         if(n1==0 || n2==0){
//              hcf=Math.max(n1,n2);
//              System.out.println(hcf);
//              System.out.println("lcm is 0");
          
//         }
//         else{
//             //euclidean algorithm
//             while(n2!=0){
//            int temp=n2;
//            n2=n1%n2;
//            n1=temp;
//             }
//             hcf=n1;
//             lcm=(on1*on2)/hcf;
//             System.out.println(hcf);
//             System.out.println(lcm);
           
//         }
      
//     }
// }

//or
//HCF
// import java.util.*;
// public class main2{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n1=sc.nextInt();
//         int n2=sc.nextInt();
//         int hcf=1;
//         int min=Math.min(n1,n2);
//         if(min==0){
//             int max=Math.max(n1,n2);
//             System.out.println(max);
//         }
//         else{
//         for(int i=15 ;i<=min;i++){
//             if(n1%i==0 && n2%i==0){
//                 hcf=i;
//             }
//         }
//         System.out.println(hcf);
//     }
//     }
// }

 /*
 ***Pascals Triangle
 Had 3 types of problems can ask
 1.Given r and c then find the respective element
 2.return an nth row of elements
 3.Print all the elements of a pascals triangle
  */
  
  // //1.Given r and c then find the respective element->use ncr method shortcut
  ////Time  complexity->O(r)
  // import java.util.*;
  // public class pract{
  //   public static void findNcR(int n,int r){
  //     long result=1;
  //     for(int i=0;i<r;i++){
  //       result=result*(n-i);
  //       result=result/(i+1);
  //     }
  //     int result_=(int)result;
  //    System.out.println(result_);
  //   }
  //   public static void main(String[] args) {
  //     Scanner sc=new Scanner(System.in);
  //     int n=sc.nextInt();
  //     int r=sc.nextInt();
  //     findNcR(n-1,r-1);
  //    // System.out.println(result_);
  //   }
  // }

  //2.return an nth row of elements
  //Time complexity->O(n) and Space complexity->O(1)
  // import java.util.*;
  // public class pract{
  //   public static void printNthrow(int n){
  //      long ans=1;
  //      System.out.print((int)ans +" ");//first column of nth row is always 1 after ncr so 

  //      //for other columns of nt row
  //      for(int i=1;i<n;i++){
  //       ans=ans*(n-i);
  //       ans=ans/i;
  //       System.out.print((int)ans + " ");
  //      }
  //   }
  //   public static void main(String[] args) {
  //     Scanner sc=new Scanner(System.in);
  //     int n=sc.nextInt();
  //     printNthrow(n);
  //   }
  // }

  //Multithreading practice questions from code with harry\
  class Mythread1 extends Thread{
    public void run(){
        int i=0;
        while(i<400){
            System.out.println("Good morning");
        }
    }
  }
  class Mythread2 extends Thread{
   public void run(){
    int i=0;
    while(i<400){
        System.out.println("Welcome");
    }
   }
  }
  class pract{
    public static void main(String[] args) {
        Mythread1 t1=new Mythread1();
        Mythread2 t2=new Mythread2();
        t1.start();
        t2.start();
    }
  }