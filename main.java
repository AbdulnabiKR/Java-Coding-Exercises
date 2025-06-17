
/* how java run??
-->JKD(java kit development) in it->JRE(java Runtime environment)(library) in it->JVM(java virtual machine) is there
  steps compiling and execution of java
  1.souce code.java ,goes to
  2.compiler JKD,goes to
  3.byte code,goes to
  4.jvm whcih converts it in native code(0 or 1 low level language which can undesrtood by computer)

  ****Mainly two bodies****
  1.function
    void main
    {

    }
2.class(which is the group of functions)
public class main{
public static void main(String[] args)//String[] args->means command line argument
{

}
}
  
 */
//  public class main {

//     public static void main(String[] args) {
//         System.out.println("Hello world!!");
   /*

   *public-Keyword which is denoted as access modifier,static-keyword which shows that its common for these whole main fn
    void-Keyword which shows that there is no any return value main-main function which is like the entry point in code

    System-built in class which provides access to the system.
    out-member of the system which represents standard output
    println-prints what we give
    */
//     }
// }


/*
 * There are 4 types of errors in Java they are
   1.Compilation error/Syntax error-which occurs when there is miss of (;) or different brackets like ( } like that
   2.Run time error-which occurs when syntax is correct but compiler cannot run the code due to errors ,there is index defined out of its bound
   3.Logical error/Wrong answer(WA)-which occurs when code runs and compiles but give the wrong output
   It may be occur due to incorrect conditionals or incorrect code
 */


// public class main {
//   public static void main(String[] args)
//   {
   
//     System.out.println("Hello world with java"); //println-next line
//     // System.out.print("Hello world with java\n");//\n-next line
     
//     System.out.print("Hello world with java ");//output system-class ,print-function
//   }
// }

// //1.Print the pattern
//  public class main
//  {
//   public static void main(String[] args)
//   {
//     System.out.println("*");
//     System.out.println("**");
//     System.out.println("***");
//     System.out.print("****");
//   }
//  }

// public class main{
//   public static void main(String[] args)
//   {
//     System.out.println("*");
//     System.out.println("**");
//   }
// }


//***Variables and Datatypes/
// public class main {
//    public static void main(String[] args)
// {
//   int a=10;
//   int b=15;
//   System.out.println(a+b);
//   System.out.println(b-a);
//   System.out.println(a*b);
//   System.out.println(a/b);

// }   
// }

// public class main{
//   public static void main(String[] args) {
//     int a=10;
//     int b=5;
//     System.out.println((a*b)/(a-b));
//   }
// }

// //***Input in java ***
// import java.util.*;
// public class main{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     String name=sc.nextLine();
//     System.out.println(name); 
/*
 int->nextInt(),float->nextFloat,char->nextChar etc.
 */
//   }
// }

//2.Two variables a and b print their sum

// import java.util.*;
// public class main{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     System.out.println(a+b);


//   }
// }

//****if,else if,else */
// import java.util.*;
// public class main{
//   public static void main(String[] args)
//   {
//     Scanner sc=new Scanner(System.in);
//     int age=sc.nextInt();
//     if(age<=5)
//     {
//       System.out.println("Baby");
//     }
//     else if(age>=5&&age<=18)
//     {
//       System.out.println("adult");
//     }
//     else
//     {
//       System.out.println("oldperson");
//     }
//   }
// }

// import java.util.*;
// public class main{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     if(n%2==0)
//     {
//       System.out.println("It is an even number");
//     }
//     else{
//       System.out.println("It is an odd number");
//     }
//   }
// }


// import java.util.*;
// public class main {
//   public static void main(String[] args)
//   {
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     if(a==b) {
//       System.out.println("Equal");
//     }
//     else if(a>b) {
//            System.out.println("a is greater than b");
//     }
//     else {
//       System.out.println("b is greater than a");
//     }
//   }
// }

//  import java.util.*;
// public class main{
//   public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
//      int n=sc.nextInt();
//     if(n==1){
//       System.out.println("Hello");
//     }
//     else if(n==2){
//       System.out.println("Namaste");
//     }
//     else if(n==3){
//       System.out.println("Bonjour");
//     }
//     // else{
//     //   System.out.println("null");
//     // }
//   }
// }

// //***switch */
// import java.util.*;
// public class main{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int number=sc.nextInt();
//     switch(number)
//     {
//       case 1:
//       System.out.println("Hello");
//       break;
//       case 2:
//       System.out.println("Namaste");
//       break;
//       case 3:
//       System.out.println("Bonjour");
//       break;
//       default:
//       System.out.println("Invalid");
//     }

//   }
// }

//***loops****
/*
  for loop
  -->Syntax
  for(intialization;condition;updation)
  {
    statements;
  }
 */
// public class main{
//   public static void main(String[] args) {
//     for(int i=0;i<5;i++)
//     {
//       System.out.println("Hello world");
//     }
//   }
// }

// public class main{
//   public static void main(String[] args) {
//     for(int i=0;i<=10;i++)
//     {
//       //System.out.print(i+ " ");->In a single line.
//       System.out.println(i);
//     }
//   }
// }


//***while loop ***
/*
  while loop
  Syntax-->
   intialization;
  while(condition){
    statements;
    updation;
  }
 */
// public class main{
//   public static void main(String[] args){
//     int i=0;
//     while(i<=10){
//       System.out.println(i);
//       i++;
//     }
//   }
// }


//****do while ***/
/*
  do while
  Syntax-->
  initialization;
  do{
    statements;
    updation;
  }while(condition);
 */
// public class main {
//    public static void main(String[] args) {
//     int i=0;
//     do{
//       System.out.println(i);
//       i++;
//     }while(i<=10);
//    }
  
// }

//sum off n natural numbers
// import java.util.*;
// public class main{
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int sum=0;
//     for(int i=1;i<=n;i++)
//     {
//       sum=sum+i;
//     }
//     System.out.println(sum);
//   }
// }


//***nested loops -->for */
/*
 for()
 {
  for()
  {
    statements;
  }
  statements;
 }
 */
//****Full rectangle */
// public class main{
//   public static void main(String[] args){
//     int n=4;
//     int m=5;
//     for(int i=1;i<=n;i++)
//     {
//       for(int j=1;j<=m;j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }


//**Hollowed rectangle */
// public class main{
//   public static void main(String[] args){
//     int n=4;
//     int m=5;
//     for(int i=1;i<=n;i++)
//     {
//       for(int j=1;j<=m;j++){
//         if(i==1||j==1||i==n||j==m){
//           System.out.print("*");
//         }
//         else{
//           System.out.print(" ");
//         }
//       }
//       System.out.println();
//     }
//   }
// }

////***Right Half pyramid */
// public class main{
//   public static void main(String[] args) {
//     int n=4;
//     for(int i=1;i<=n;i++){
//      for(int j=1;j<=i;j++){
//       System.out.print("*");
//      }
//      System.out.println();
//     }
//   }
// }

// //***Inversed Right half pyramid */
// public class main{
//   public static void main(String[] args) {
//     int n=4;
//     for(int i=1;i<=n;i++){
//       for(int j=n;j>=i;j--){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }


// //***Left half pyramid */
// public class main {
//   public static void main(String[] args) {
//     int n=4;
//     for(int i=1;i<=n;i++){
    
//       for(int j=1;j<=n-i;j++){
//         System.out.print(" ");
//       }
//       for(int j=1;j<=i;j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }


//  }
// }

//***Inverse left half pyramid */
// public class main {
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

// public class main{
//   public static void main(String[] args) {
//     int n=5;
//       for(int i=n;i>=1;i--){
//       for(int j=1;j<=i;j++){
//         System.out.print(j+" ");
//       }
//       System.out.println();
//     }
//   }
// }

// public class main {
//   public static void main(String[] args) {
//     int n=5;
//     int number=1;
//     for(int i=1;i<=n;i++)
//     {
//       for(int j=1;j<=i;j++)
//       {
//         System.out.print(number+" ");
//         number++;
//       }
//       System.out.println();
//     }
//   }
// }


//*** 0-1 Triangle */
/*
 5*5 matrix form
 whenever 
 sum of i+j= odd ->0
 sum of i+j=even->1

 */
// public class main {
//  public static void main(String[] args) {
//   int n=5;
  
//   for(int i=1;i<=n;i++)
//   {
//     for(int j=1;j<=i;j++)
//     {
//       int sum=i+j;
//       if(sum%2==0)
//       {
//         System.out.print("1 ");
//       }
//       else{
//         System.out.print("0 ");
//       }
//     }
//     System.out.println();
//   }
//  }
  
// }

// public class main{
//   public static void main(String[] args) {
//     int n=4;
//     for(int i=1;i<=n;i++)
//     {
//       for(int j=1;j<=n-i;j++)
//       {
//         System.out.print(" ");
//       }
      
//       for(int j=1;j<=i;j++){
//         System.out.print("*");
//       }
    
//       for(int j=2;j<=i;j++)
//       {
//         System.out.print("*");
//       }
//     //  System.out.println();
//       System.out.println();
//     }
//   }
// }

/*
 * When u declare two or more for loops of j or like others within the single for i loop then they will give the output of combination
 */
////**Butterfly printing */
// public class main{
//   public static void main(String[] args){
//     int n=4;
//     //upper part
//     for(int i=1;i<=n;i++){
//       for(int j=1;j<=i;j++){//first part
//         System.out.print("*");
//       }
//       for(int j=1;j<=2*(n-i);j++){
//         System.out.print(" ");
//       }
//       for(int j=1;j<=i;j++){//second part
//         System.out.print("*");
//       }
   
//       System.out.println();
//     }
//     //lower part
//     for(int i=n;i>=1;i--){
//       for(int j=1;j<=i;j++){//third part
//         System.out.print("*");
//       }
//       for(int j=1;j<=2*(n-i);j++){//fourth part
//         System.out.print(" ");
//       }
//       for(int j=1;j<=i;j++){
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }



//****Functions****/
/*Defn:Funcion is a block of code which used to perform specific tasks which is encapsulated within a class or interface
 Syntax:
 public static returnType functionName(type arg1,type arg2){
  operations
 }
 //public static-->Keyword
 returnType-->int,void,float,string....
 functionName-->printSum,calculateNumbers(Camelcase-firstword-lowerletter,nextword starts with Uppercase )
 type arg-->int name like this...
 */

//  //print name
//  import java.util.*;
//  public class main{
//   public static void printMyName(String name){//Declaration
//     System.out.println(name);
//   }
//   public static void main(String[] args){
//     Scanner sc=new Scanner(System.in);
//     String name=sc.next();

//     printMyName(name);//fn calling

//   }
//  }

// //sum of two numbers
// import java.util.*;
// public class main {
//   public static int sumNumbers(int a,int b){
//   int sum=a+b;
//   System.out.println("sum of two numbers is "+ sum);
//   return sum;

//   }

//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
   
//     sumNumbers(a,b);
    
//   }
// }

// import java.util.*;
// public class main {

//   public static int multiplyNumbers(int a,int b){
//     int product=a*b;
//     System.out.println("product of two numbers is "+ product);
//     return product;
//   }
//   public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int a=sc.nextInt();
//     int b=sc.nextInt();
//     multiplyNumbers(a,b);
    
//   }
// }

// //factorial of a number
// import java.util.*;
// public class main{
//   public static void printFact(int n){
//        int fact=1;
//        for(int i=1;i<=n;i++){
//         fact*=i;
//        }
//        System.out.println(fact);
//   }
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     printFact(n);
//   }
// } 

 //***Time and Space complexity***
/*
 1.Time complexity->
   Time complexity  means the time which took by code to run,lesser time- efficient code, else larger time-not much efficient code.
   Time complexity is directly proportional to input size
   input size->means n like that

   There are three scenerios in time complexity they are
   *Best code-Code took less time to run(sigma(n))
   -Ex:1,2,3,4,5
   find position of 1
   {1 present at 1st position only}

   *Average code-Code took average time to run(Q(n))
   -Ex-2,1,3,4,5
   Ex:2,3,1,4,5
   Ex:2,3,4,1,5
   (1+2+3+4+5)/5->(n)
   ->(n+2)/2

   *Worst code-Code took more time to run(O(n))
   -10^6,10^7
   *We use worst case most of the time in DSA because to align it in a correct order from one side to basic

 */
/*
 2.Space complexity
 Space complexity means the size or space of the memory which took by code in system
 Space complexity is directly proportional variables only not input size in some cases
 
 Arrays-Space complexity is directly proportional to input size in arrays.We all learnt it in detail way in Dynamic programming.
 */

 //**Array***//
 /*
  ->It is the collection of values of the same data type.
  *Syntax->
  datatype[] arrayname=new type[SIZE];
  int arr[]=new itn[5];
  datatype[] arr->compile tyme
  new int[size]->runtime(dynamic memory allocation)

  *array objects are in heap
  *heap objects are not continous
  */
  // import java.util.*;
  // public class main{
  //   public static void main(String[] args){
  //     Scanner sc=new Scanner(System.in);
  //     int marks[]=new int[3];
  //     for(int i=0;i<3;i++){
  //       marks[i]=sc.nextInt();
  //     }
  //     //int marks[]={97,98,95};
  //     // marks[0]=97;
  //     // marks[1]=98;
  //     // marks[2]=95;
  //     // for(int i=0;i<3;i++){
  //     //   System.out.println(marks[i]);
  //     // }
  

  // //or enhanced for loop
  // for(int num:marks){
  //   //num->printing each element of an array like i
  //    System.out.println(num+ " ");
  // }

  //   }
  // }

  // // import java.util.*;
  // public class main{
  //   public static void main(String[] args) {
  //    Scanner sc=new Scanner(System.in);
  //    System.out.println("Enter the size of an array");
  //    int n=sc.nextInt();
  //    int numbers[]=new int[n];
  //     for(int i=0;i<n;i++){
  //       numbers[i]=sc.nextInt();
  //     }
  //    for(int i=0;i<n;i++){
  //     System.out.println(numbers[i]);
  //    }
  //   }
  // }
  // /*
  //      Here it print 0 due to uninitialization of values to the arraryname numbers ,It only prints the 0 because of uninitialization of arrayname
  //    
  //  uninitialization of variables or arrayname is there then
  //       *int->0
  //       *float->0.0
  //       *bool->" "/false
  //       It is an advantage of java progarmming language
  //     */

  // import java.util.*;
  // public class main {
  //   public static void main(String[] args) {
  //     Scanner sc=new Scanner(System.in);
  //     System.out.println("Enter the size of an array");
  //     int n=sc.nextInt();
  //   int numbers[]=new int[n];
  //   System.out.println(" ");
  //   for(int i=0;i<n;i++){
  //     numbers[i]=sc.nextInt();
  //   }
  //   System.out.println("Enter the x element value " + "\n");
  //   int x=sc.nextInt();
  //   System.out.println(" ");
  //     for(int i=0;i<n;i++){
  //     if(numbers[i]==x){
  //       System.out.println("x found at index " + i);
  //     }
  //   }
  //   }
  // }

  //****2D Array***/
  //->2D array means having rows and columns.We use it most of the time in matrix only
  //->Total memory consumtion=rows*columns*datatype bytes
  //Syntax->datatype[][] arrayname=new datatype[rows][columns];

  // import java.util.*;
  // public class main{
  //   public static void main(String[] args){
  //     Scanner sc=new Scanner(System.in);
  //     int rows=sc.nextInt();
  //     int cols=sc.nextInt();
  //     int[][] numbers=new int[rows][cols];
  //     for(int i=0;i<rows;i++){//rows by using outer loop
  //       for(int j=0;j<cols;j++){//columns by using inner loop
  //         numbers[i][j]=sc.nextInt();
  //       }
  //     }
  //     System.out.println(" ");
  //     for(int i=0;i<rows;i++){
  //       for(int j=0;j<cols;j++){
  //         System.out.print(numbers[i][j] + " ");
  //       }
  //       System.out.println();
  //     }
  //   }
  // }

  // import java.util.*;
  // public class main{
  //   public static void main(String[] args){
  //     Scanner sc=new Scanner(System.in);
  //     int rows=sc.nextInt();
  //     int cols=sc.nextInt();
  //     int[][] numbers=new int[rows][cols];
  //     for(int i=0;i<rows;i++)
  //     {
  //       for(int j=0;j<cols;j++){
  //         numbers[i][j]=sc.nextInt();
  //       }
  //     }
  //     System.out.println(" ");
  //     int x=sc.nextInt();
  //     for(int i=0;i<rows;i++){
  //       for(int j=0;j<cols;j++){
  //         if(numbers[i][j]==x){
  //           System.out.print("x is found at index " + i + j);
  //         }
  //       }
  //       System.out.println();
  //     }

  //   }
  // }


  //**String-It is a collection of characters */
  //If we want to print a single word then we use sc.next(); ,to print
  //two or more words with space we use sc.nextLine();
  //Strings are immutable ->means we cant change string in memory ,we have to declare another string 

  // import java.util.*;
  // public class main{
  //   public static void main(String args[])
  //   {
  //     Scanner sc=new Scanner(System.in);
  //     String name=sc.nextLine();
  //     System.out.println("Your name is " + name);
  //   }
  // }

  // public class main{
  //   public static void main(String args[])
  //   {
      // //1.Concatenation by using +
      // String firstname="Abdul";
      // String lastname="Nabi";
      // String fullname=firstname+ " "+lastname;//firstname+lastname
      // System.out.println(fullname);
      
    //   //2.length of String by .length()
        //   String firstname="Abdul";
        //   String lastname="Nabi";
        //  String fullname=firstname+ " "+lastname;//firstname+lastname
        //    System.out.println(fullname.length());
    
    //3.Access char at string by .charAt(i) 
      //     String firstname="Abdul";
      // String lastname="Nabi";
      // String fullname=firstname+ " "+lastname;//firstname+lastname
      // for(int i=0;i<fullname.length();i++){
      // System.out.println(fullname.charAt(i));
      // }

      // //4.compare two strings by name1.equals(name2)
      // String name1="Nabi";
      // String name2="Nabi";
      /*
       Here there are three condns they are
       string1>string2=+ve value
       string1=string2=0
       strin1<string2=-ve
       */
      // // if(name1.equals(name2)){
      // //   System.out.println("String are equal");
      // // }
      // // else{
      // //   System.out.println("Strings are not equal");
      // // }
      //  /*
      //  We can also useif(name1==name2) print equal else not equal but it will not be true all times.Ex
      //  */
      // if(new String("Tony")==new String("Tony")){
      //   System.out.println("String are equal");
      // }
      // else{
      //   System.out.println("Strings are not equal");+
      // }

  //     //5.Substring by .substring(init ind,final ind)
  //     //if we have any particular word in sentence we have to give first and last index of that word
  //      String sentence="I am from HP Ameena bi Hostel";
  //      //System.out.println(sentence.substring(10,22));
  //      System.out.println(sentence.substring(23));//for last word we dont need to write the lastindex value it took automatically
  //   }
  // }
  // Java code to illustrate different constructors and methods in String class


// import java.io.*;
// import java.util.*;

// public class main
// {
//     public static void main (String[] args)
//     {
//         String s= "GeeksforGeeks";
//         // or String s= new String ("GeeksforGeeks");

//         // Returns the number of characters in the String.
//         System.out.println("String length = " + s.length());

//         // Returns the character at ith index.
//         System.out.println("Character at 3rd position = "
//                            + s.charAt(3));

//         // Return the substring from the ith  index character
//         // to end of string
//         System.out.println("Substring " + s.substring(3));

//         // Returns the substring from i to j-1 index.
//         System.out.println("Substring  = " + s.substring(2,5));

//         // Concatenates string2 to the end of string1.
//         String s1 = "Geeks";
//         String s2 = "forGeeks";
//         System.out.println("Concatenated string  = " +
//                             s1.concat(s2));

//         // Returns the index within the string
//         // of the first occurrence of the specified string.
//         String s4 = "Learn Share Learn";
//         System.out.println("Index of Share " +
//                            s4.indexOf("Share"));

//         // Returns the index within the string of the
//         // first occurrence of the specified string,
//         // starting at the specified index.
//         System.out.println("Index of a = " +
//                            s4.indexOf('a',3));

//         // Checking equality of Strings
//         Boolean out = "Geeks".equals("geeks");
//         System.out.println("Checking Equality  " + out);
//         out = "Geeks".equals("Geeks");
//         System.out.println("Checking Equality  " + out);

//         out = "Geeks".equalsIgnoreCase("gEeks ");
//         System.out.println("Checking Equality " + out);

//         //If ASCII difference is zero then the two strings are similar
//         int out1 = s1.compareTo(s2);
//         System.out.println("the difference between ASCII value is="+out1);
//         // Converting cases
//         String w1 = "GeeKyMe";
//         System.out.println("Changing to lower Case " +
//                             w1.toLowerCase());

//         // Converting cases
//         String w2 = "GeekyME";
//         System.out.println("Changing to UPPER Case " +
//                             w2.toUpperCase());

//         // Trimming the word
//         String w4 = " Learn Share Learn ";
//         System.out.println("Trim the word " + w4.trim());

//         // Replacing characters
//         String str1 = "feeksforfeeks";
//         System.out.println("Original String " + str1);
//         String str2 = "feeksforfeeks".replace('f' ,'g') ;
//         System.out.println("Replaced f with g -> " + str2);
//     }
// }

  //*String builder */
  //Strings are immutable means we cant add or delete string in a memory for that we use String builders
  //String builders are helpful in Saving the time and many other things
  //StringBuffer sb=new StringBuffer("data" or size);

  // import java.util.*;
  // public class main{
  //   public static void main(String[] args){
      // StringBuilder sb=new StringBuilder("Nabi");//(data)
      // System.out.println(sb);

      // // //.charAt(i)
      // System.out.println(sb.charAt(0));

      // //variable(object).setCharAt(index,"alphabet")->means any char replace by other character
      // sb.setCharAt(0,'A');
      // System.out.println(sb);
      
      //.insert(index,'A')
      // sb.insert(3,'h');
      // System.out.println(sb);
 
      //.delete(index want to delete,end index)-end index not included
      // sb.delete(1,3);
      // System.out.println(sb);

      //append ->combination of diffnt stms
      //  StringBuilder sb=new StringBuilder("h");
      //  sb.append("e");
      //  sb.append("l");
      //  sb.append("l");
      //  sb.append("o");
      //  System.out.println(sb.length());

      //All functions for StringBuilder
    //   public class main{
    //     public static void main(String[] args) {
    
    //         // Create a new StringBuilder with the
    //         // initial content "GeeksforGeeks"
    //         StringBuilder sb = new StringBuilder("GeeksforGeeks");
    //         System.out.println("Initial StringBuilder: " + sb);
    
    //         // 1. Append a string to the StringBuilder
    //         sb.append(" is awesome!");
    //         System.out.println("After append: " + sb);
    
    //         // 2. Insert a substring at a specific position
    //         sb.insert(13, " Java");
    //         System.out.println("After insert: " + sb);
    
    //         // 3. Replace a substring with another string
    //         sb.replace(0, 5, "Welcome to");
    //         System.out.println("After replace: " + sb);
    
    //         // 4. Delete a substring from the StringBuilder
    //         sb.delete(8, 14);
    //         System.out.println("After delete: " + sb);
    
    //         // 5. Reverse the content of the StringBuilder
    //         sb.reverse();
    //         System.out.println("After reverse: " + sb);
    
    //         // 6. Get the current capacity of the StringBuilder
    //         int capacity = sb.capacity();
    //         System.out.println("Current capacity: " + capacity);
    
    //         // 7. Get the length of the StringBuilder
    //         int length = sb.length();
    //         System.out.println("Current length: " + length);
    
    //         // 8. Access a character at a specific index
    //         char charAt5 = sb.charAt(5);
    //         System.out.println("Character at index 5: " + charAt5);
    
    //         // 9. Set a character at a specific index
    //         sb.setCharAt(5, 'X');
    //         System.out.println("After setCharAt: " + sb);
    
    //         // 10. Get a substring from the StringBuilder
    //         String substring = sb.substring(5, 10);
    //         System.out.println("Substring (5 to 10): " + substring);
    
    //         // 11. Find the index of a specific substring
    //         sb.reverse(); // Reversing back to original order for search
    //         int indexOfGeeks = sb.indexOf("Geeks");
    //         System.out.println("Index of 'Geeks': " + indexOfGeeks);
    
    //         // 12. Delete a character at a specific index
    //         sb.deleteCharAt(5);
    //         System.out.println("After deleteCharAt: " + sb);
    
    //         // 13. Convert the StringBuilder to a String
    //         String result = sb.toString();
    //         System.out.println("Final String: " + result);
    //     }
    // }

      //***Reverse a String  */

  //     StringBuilder sb=new StringBuilder("hello");
  //     for(int i=0;i<sb.length()/2;i++){
  //       int front=i;
  //       int back=sb.length()-1-i;

  //       char frontChar=sb.charAt(front);
  //       char backChar=sb.charAt(back);

  //       sb.setCharAt(front,backChar);
  //       sb.setCharAt(back,frontChar);
  //     }
  //     System.out.println(sb);

  //   }
  // }
  

//*StringBuffer->StringBuilder also have the same inbuilt function which are mentioned below */
//   import java.util.*;
//  public class main{
//     public static void main(String args[])
//     {
//         StringBuffer sb = new StringBuffer("Hello ");
//         sb.append("Java"); // now original string is changed
//         System.out.println(sb);

//         //.insert(index,"data");
//         sb.insert(1, "Java");// Now original string is changed
//         System.out.println(sb);
//     }
// }


// import java.util.*;
// public class main{
//   public static void main(String args[]){
//     StringBuffer sb=new StringBuffer("Hello");
//     //sb.replace(beginning index,end idx(not included),place this word)

//     sb.replace(1,3,"Java");
//     System.out.println(sb);

//    //sb.reverse
//    sb.reverse();
//    System.out.println(sb);

//   }
// }

//to know the capacity default StringBuffer capacity is 16 characters if new character is(oldcapacity*2)+2 will be there i.e 18
// import java.io.*;

// class main {
//     public static void main(String args[])
//     {
//         StringBuffer sb = new StringBuffer();
      
//           // default 16
//         System.out.println(sb.capacity()); 
//         sb.append("Hello");
      
//           // now 16
//         System.out.println(sb.capacity()); 
//         sb.append("java is my favourite language");
        
//           // (oldcapacity*2)+2
//           System.out.println(sb.capacity());
//     }
// }



  //Operators-Symbols which tell compiler to perform some operation
  /*
   a+b
   -> + is operator
   ->a and b are operands

   Types of Operators
   1.Arithmetic operators
     1.Binary operators
       -Operation which done in between two operands
      +,-,/,*.% are the binary operators
    
     2.Unary operators
       -Operation which done with single operands  only
       ++,--,Increment and Decrement operators

        In Increment operators there are two types
        *Pre increment operators- ++a
        *Post increment operators- a++

        In Decrement operators there also two types
        *Pre decrement- --a
        *Post decrement-a--

    2.Relational operators-Which gives binary output as true or false
      Operators   Operands
       ==          equal to
       !=         is  not equal to
       >           greater than
       <            lesser than
       >=          greater than or equal to
       <=          lesser than or equal to

    3.Logical Opearators-Which gives binary output as true or false
      
    &&(Logical AND)            OR    stat1     stat2   AND
                                T       T         T     T
    ||(Logical OR)              T       T         F     F
                                T       F         T     F 
                                F       F         F      F
    !(Logical NOT)-which gives compliment of true or false
     
     Binary  number system-Base2
      To convert decimal to binary 
      ex-4 to binary
        2|4 -0
        2|2 -0
         |1
         binary-100
         (100)base2=(4)base10
         
         Binary to Decimal
         ex=101
          1    0      1
        *2^2 *2^1  *2^0
          4 +  0   +1=5
          (101)base2=(5)base10 
          Octal base8 and Hexadecimal base16 same procedure
     
      4.Bitwise opeartors
      ex:A=0101,B=0110
      &(Binary AND)   0101
                      &
                      0110
                      0100 

      |(Binary OR)    0101
                      |
                      0110
                      0111

      ^(Binary XOR)-When both i/p equal false(0),both different True(1)
                     0101
                     ^
                     0110
                     0011

      ~(Binary Ones compliment means NOT)
                    A=0101
                    ~
                    A=1010

                    (Al shift by 1)
      <<(Binary Left shift)
                    A=0101  
                    <<
                    A=1010
                    B=0110
                    <<
                    B=1100

      >>(Binary right shift)
                    A=0101
                    >>
                    A=0010
                    B=0110
                    >>
                    B=0011

    5.Assignment operators
     =
     +=->a+=b-a=a+b
     -=
     *=
     /=
   */

   //Bit manipulation
  /*
  get bit
  Ex:5-0101
  consider position:2 which is 1
  at last after applying & we got 1 only,if position is having 0 at last we will get 0 only

     Bit Mask:1<<i
     Operation:AND(bitmask&n)
    */
 

    // import java.util.*;
    // public class main{
    //   public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int n=5;//0101
    //     int pos=sc.nextInt();
    //     int bitmask=1<<pos;//0001<<pos
    //     if((bitmask & n)==0){
    //       System.out.println("Bit was zero");
    //     }
    //     else{
    //       System.out.println("Bit was 1");
    //     }

    //   }
    // }

    // import java.util.*;
    // public class main{
    //   public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int pos=sc.nextInt();
    //     int bitmask=1<<pos;
    //       int newnumber=bitmask & n;
    //     // if((bitmask&n)==0){
    //     //   System.out.println("Bit was zero");
    //     // }
    //     // else{
    //     //   System.out.println("Bit was one");
    //     // }
    //     System.out.println(newnumber);
    //   }
    // }

    //Set  bit
    /*
    Bitmask:1<<i
    OR operation:bitmask|n
     ex:5-0101
     consider position 2 which number is 1 ,it gives 1 only due to or operation for 0s it will depend on original no and bitmask,0 to 1
     */ 

    //  import java.util.*;
    //  public class main{
    //   public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();//5-0101
    //     int pos=sc.nextInt();//pos-2(1)
    //     int bitmask=1<<pos;
    //     int newnumber=bitmask|n;
    //     // if((bitmask|n)==0){
    //     //   System.out.println("Bit was zero");
    //     // }
    //     // else{
    //     //   System.out.println("Bit was 1");
    //     // }
    //     System.out.println(newnumber);
    //   }
    //  }

    // //clear bit->means I want to make any paricular 1 value as 0  ,1 to 0
    // /*
    //  * Bitmask=1<<i;
    //  * operation=NOT with AND
    //  */
    // import java.util.*;
    // public class main{
    //   public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int pos=sc.nextInt();
    //     int bitmask=1<<pos;
    //     int notbitmask=~(bitmask);
    //     int newnumber=notbitmask & n;
    //     System.out.println(newnumber);


    //   }
    // }


    // //Update bit-> 1 to 0(opern 0)=clear bit(AND with NOT) ,0 to 1(open 1)=set bit(AND)

    // import java.util.*;
    // public class main{
    //   public static void main(String args[]){
    //     Scanner sc=new Scanner(System.in);
    //     int opern=sc.nextInt();
    //     int n=sc.nextInt();
    //     int pos=sc.nextInt();
    //     int bitmask=1<<pos;
    //     //set bit means 0 to 1(opn1)
    //     if(opern==1){
    //       int newnumber=bitmask | n;
    //       System.out.println(newnumber);
    //     }
    //     //clear bit means 1 to 0(opern 0)
    //     else{
    //        int newbitmask=~(bitmask);
    //        int newnumber=newbitmask & n;
    //        System.out.println(newnumber);
    //     }
    //   }
    // }
    //or
    //Update bit by using XOR operation
    /*
     * Bitmask=1<<i
     * Operation=XOR(bitmask ^ n)
     */
    // import java.util.*;
    // public class main {
    //   public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     int n=sc.nextInt();
    //     int pos=sc.nextInt();
    //     int bitmask=1<<pos;
    //     int newnumber=bitmask^n;
    //     System.out.println(newnumber);
    //   }
    // }


    //Bubble sort->Means largest element placed at the extreme right of array,every element is compared with adjacent element and largest element placed in right end,pair wise swap.
    /*time complexity-O(n^2)(Worst code)
      because
      1.for each term which coming in first position after sorting it will comparing with n-1+n-2,n-3 + ......
      therefore after adding these all we get
      (n^2+n)/2;
      where n^2 dominates here thats why it is worst code (O(n^2))
      EX:7,8,3,1,2
    */
  
    // public class main{
    //   public static void printArray(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //       System.out.print(arr[i] + " ");
    //     }
    //     System.out.println();
    //   }
    //   public static void main(String args[]){
    //     int arr[]={7,8,3,1,2};
    //     for(int i=0;i<arr.length-1;i++){//n-1 times n=5,n-1=4
    //       for(int j=0;j<arr.length-i-1;j++){
    //         if(arr[j]>arr[j+1]){
    //             //swap
    //         int temp=arr[j];
    //         arr[j]=arr[j+1];
    //         arr[j+1]=temp;
    //       }
    //     }
    //     }
    //    printArray(arr);
    //   }
    // }

    //or

    // public class main{
    //   public static void main(String args[]){
    //   int arr[]={5,4,3,2,6};
    //   int length=arr.length;
    //   for(int i=0;i<length-1;i++){//n-1(->4)
    //     for(int j=0;j<length-i-1;j++){
    //       if(arr[j]>arr[j+1]){
    //         int temp=arr[j];
    //         arr[j]=arr[j+1];
    //         arr[j+1]=temp;
    //       }
    //     }
    //   }
    //   System.out.println("Sorted array is ");
    //   for(int i=0;i<length;i++){
    //   System.out.print( arr[i] + " ");
    //   }
    //   }
    // }

    //Selection sort->means smallest element placed in extreme left ,here only single swap will be done.
    /*
    Time complexity :Worst code(O(n^2))
    because
    1.for the first term I made n-1 comparisons
    2.for the 2nd term I made n-2 comparisons 
    3.for the 3rd term I made n-3 comparisons
    so on 
    when I add up these I will get (n^2+n)/2;
    where n^2 will dominate here thats why it is worst code(O(n^2))
      Ex:7,8,3,1,2
     1.small:0[7], compared with adjacent element 8,8>7 no swap,next 3<7 swap at 0[3],1<3 swap at 0[1],2>1 no swap
     then array is 1,8,3,7,2 swap 1 and 7 only (1st loop)
     2.leave i[0] means 1 already swapped,3<8 at 1[3],7>3 no swap,2<3 at 1[2]
     then 1,2,3,7,8 swap 8 and 2(2nd loop)
     3.leave i[0],i[1] means 1,2 ,7>3 no swap,8>3 no swap 
     1,2,3,7,8(3rd and 4th loop)
     */
   

    //  public class main{
    //   public static void printarray(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //       System.out.print(arr[i] + " ");
    //     }
    //   }
    //   public static void main(String args[]){
    //     int arr[]={7,8,3,1,2};
    //     for(int i=0;i<arr.length-1;i++){
    //       int smallest=i;
    //       for(int j=i+1;j<arr.length;j++){
    //           if(arr[j]<arr[smallest]){
    //             smallest=j;
    //           }
    //       }
    //       int temp=arr[smallest];
    //       arr[smallest]=arr[i];
    //       arr[i]=temp;
    //     }
    //    printarray(arr);
    //   }
    //  }

    //or

    // public class main{
    //   public static void main(String args[]){
    //     int arr[]={7,8,3,1,2};
    //     for(int i=0;i<arr.length-1;i++){
    //       int smallest=i;
    //       for(int j=i+1;j<arr.length;j++){
    //         if(arr[j]<arr[smallest]){
    //           smallest=j;
    //         }
    //       }
    //       int temp=arr[smallest];
    //       arr[smallest]=arr[i];
    //       arr[i]=temp;
    //     }
    //     System.out.println("Sorted array is ");
    //     for(int i=0;i<arr.length;i++){
    //       System.out.print(arr[i] + " ");
    //     }
    //   }  
    // }

    //Insertion sort->we divide the whole array into two sets one is sorted and another one is unsorted,we will remove the elements from unsorted and put it into sorted
    /*
    Time complexity-Worst code(O(n^2))
    because
     1.for first term I  made 0 comparisons
     2.for 2nd term I madde 1 comparison
     3.for 3rd term I made 2 comparisons
     so on , when I add up these all values I got like 0+1+2+3+...+n-1
     which is equal to (n^2-n)/2;
     where n^2 dominates thats why code is O(n^2)
     Ex:7,8,3,1,2
     1.7|8,3,1,2(sorted|unsorted)
     8>7 ->7,8|3,1,2
    2. 3<8,3<7 -7 and step back one position
     3,7,8|1,2
    3.1<8,1<7,1<3 step back
    1,3,7,8|2
    2<8,2<7,2<3 these all step back but 2>1 it will go to 2nd position
    1,2,3,7,8
     */

    //  public class main{
    //   public static void printarray(int arr[]){
    //     for(int i=0;i<arr.length;i++){
    //       System.out.print(arr[i] + " ");
    //     }
    //   }
    //   public static void main(String args[]){
    //     int arr[]={7,8,3,1,2};
    //     for(int i=1;i<arr.length;i++){//unsorted part
    //       int current=arr[i];
    //       int j=i-1;//sorted part
    //       while(j>=0 && current<arr[j]){
    //         arr[j+1]=arr[j];
    //         j--;
    //       }
    //       arr[j+1]=current;
    //     }
    //     printarray(arr);
    //   }
    //  }

    //or

    // public class main{
    //   public static void main(String args[]){
    //     int arr[]={7,8,3,1,2};
    //     for(int i=1;i<arr.length;i++){
    //       int current=arr[i];
    //       int j=i-1;
    //       while(j>=0 && current<arr[j]){
    //         arr[j+1]=arr[j];
    //         j--;
    //       }
    //       arr[j+1]=current;
    //     }
    //     System.out.println("sorted array is ");
    //     for(int i=0;i<arr.length;i++){
    //       System.out.print(arr[i] + " ");
    //     }
    //   }
    // }

    
    //Recursion->It is a function which call itself again and again upto reaches the satisfying condition
       /*
        In recursion we declare one main function which call another one function ,where this function call itself again and again upto it reaches the base value(0 or 1)
        ,If there is no base case means then code will go upto infinite value which will lead to Stack Overflow
        */
//print numbers from 5 to 1 by recursion
// public class main{
//   public static void printNumb(int n){
//     if(n==0){
//       return;//Base value
//     }
//     System.out.println(n);//n=5
//     printNumb(n-1);
//   }
//   public static void main(String args[]){
//     int n=5;
//     printNumb(n);
//   }
// }

//Print numbers from 1 to 5
// public class main{
//   public static void printNumb(int n){
//     if(n==6){
//       return;//Base case
//     }
//     System.out.println(n);
//     printNumb(n+1);
//   }
//   public static void main(String args[]){
//     int n=1;
//     printNumb(n);
//   }
// }

//Print sum of first n natural numbers
/*
  i=1;
  sum=sum+i;
  n->Base condition

 */
// public class main{
//   public static void printSum(int i,int n,int sum){
//      if(i==n){
//       sum+=i;
//       System.out.println(sum);
//       return;
//      }
//     sum+=i;
//     printSum(i+1,n,sum);
//   }
//   public static void main(String args[]){
//     printSum(1,5,0);
//   }
// }

// //print a factorial of a number n
// import java.util.*;
// public class main{

//   public static void printFact(int i,int n,int fact){
//        if(i==n){
//         fact*=i;
//         System.out.println(fact);
//         return;
//        }

//     fact*=i;
//     printFact(i+1,n,fact);
       

//   }
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();


//   printFact(1,n,1);
//   }
// }


// //print fibonacci series till nth term
// import java.util.*;
// public class main{
//   public static void printFib(int a,int b,int n){
//     if(n==0){
//       return;
//     }
//     int c=a+b;
//     System.out.print(c + " ");
//     printFib(b,c,n-1);

//   }
//   public static void main(String args[]){
//    Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    int a=0;
//    int b=1;
//    System.out.print(a + " " + b + " ");
//    printFib(a,b,n-2);                          
//   }
// }


////print x^n(stack height =n)
// public class main{
//   public static int printXpown(int x,int n){
//      if(n==0){
//       return 1;
//      }
//     int pow_=printXpown(x,n-1);
//     int _xpown=x*pow_;
//     printXpown(x, n-1);
//     return _xpown;
//   }
//   public static void main(String args[]){
//     int x=2;
//     int n=6;
//     int calcpow=printXpown(x,n);
//     System.out.println(calcpow);
//     printXpown(x,n);
//   }
// }

////print x^n(stack height=logn)

// public class main{
//     public static int printXpown(int x,int n){
//       if(n==0){
//         return 1;
//       }
//       //even
//       if(n%2==0){
//         return printXpown(x,n/2)*printXpown(x,n/2);
//       }
//       //odd
//       else{
//         return printXpown(x,n/2)*printXpown(x,n/2)*x;
//       }
//     }
//   public static void main(String args[]){
//     int x=2;
//     int n=7;
//     int calcpow=printXpown(x,n);
//     System.out.println(calcpow);
//     printXpown(x, n);

//   }
// }

// // Recursion to print Tower of Hanoi->Rules:
/*1.Larger disks are placed below and smaller disks are placed above it
  2.One disk can only transfer at a time
  Time complexity:*Worst code
                  *O(2^n-1)~~O(2^n)r
*/
// import java.util.*;
// public class main{
//   public static void towerHanoi(int n,String src,String helper,String destn){
//    if(n==1){
//     System.out.println(" Desk " + n + " is transferred from " + src + "to" + destn );
//     return;
//    }
//     towerHanoi(n-1,src,destn,helper);
//     System.out.println(" Desk " + n + " is transferred from " + src + "to" + destn );
//     towerHanoi(n-1,helper,src,destn);
//   }
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     towerHanoi(n,"S","H","D");
//   }
// }


// // Recursion to Reverse a string
//Time complexity:*Worst code ,Here we calculate the time complexity basis on the levels here levels=name.length(),thats why
//                *O(n),where n is equal to length  of a string    
// import java.util.*;
// public class main{
//   public static void printString(String name,int i){
// if(i==0){
//   System.out.print(name.charAt(i));
//   return;
// }
//     System.out.print(name.charAt(i));
//     printString(name,i-1);
//   }
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     String name=sc.nextLine();
//     int i=name.length()-1;
//     printString(name,i);
    
//   }
// }

// //find first and last occurence of a character in a string 
/*
 Here Ex:abaacdefaag
 first occurence=0;
 last occurence=9;
 1.Here if I take element=a,then it found at index(0,9)
 2.Here if I take element=h,then it found at index(-1,-1)->means it will not present here,we took this only as we dont know the occurence of a particular element
 3.Here if I take element=c,then it found at index(4,4)
 *Program->
  here  I take first=-1;
  if element found at any index then replace that index with first
   first=index;
  
  next I take last=-1;
  if element found at any index after first it will update that index with last upto getting last value
  last=idx;
 */
// //Time complexity:O(n) where n is the length of a string
// import java.util.*;
// public class main{
//   public static int first=-1;
//   public static int last=-1;//Here we take it as static variable because as we go above in the levels we dont want to change the value of a variable.thats why we use static variable here.
//   public static void findOccurence(String str,int idx,char element){
//     if(idx==str.length()){
//       System.out.println(first);
//       System.out.println(last);
//       return;
//     }
//     char currchar=str.charAt(idx);
//     if(currchar==element){
//       if(first==-1){//here we took first and last values as -1 instead of 0 ,because if we initialize with 0 then it will not understand whether it will starting from 0 or initializing with 0,thats why we use -1 which will say about the starting
//         //point but uninitialized,we initialize it later
//         first=idx;//initialized here and update the value
//       }
//       else{
//         last=idx;//update the value with last variable
//       }
//     }
//     findOccurence(str,idx+1,element);

//   }
//   public static void main(String args[]){
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Enter a string");
//    String str=sc.nextLine();
//    findOccurence(str,0,'a');

//   }
// }

// //check if an array is sorted(Strictly increasing)
/*
 Time complexity:
 We triverse the array upto its length, therefore the Time complexity is O(n) where n is the length of a string
 */
////Method 1.
// public class main {
//    public static void checkSort(boolean isAscending,int i,int arr[]){
//     if(i==arr.length-1){
//       if(isAscending){
//         System.out.println("Array is sorted in Stricyly increasing order");
//       }
//       else{
//         System.out.println("Array is not sorted in strictly increasing order");
//       }
//       return;
//     }
//     if(arr[i]>arr[i+1]){
//       isAscending=false;
//     }
//       checkSort(isAscending,i+1,arr);
//    }
//    public static void main(String args[]){
//     int arr[]={1,2,3,4,5};
//     boolean isAscending=true;
//     checkSort(isAscending, 0, arr);
//   }
// }

//or

//Method 2.
// import java.util.*;
// public class main{
//   public static void checkSort(boolean isAscending,int n,int arr[],int i){
//      if(i==n-1){
//       if(isAscending){
//         System.out.println("Array is sorted in Strictly increasing order");
//       }
//       else{
//         System.out.println("Array is not sorted in Strictly increasing order");
//       }
//       return;
//      }
//     if(arr[i]>arr[i+1]){
//       isAscending=false;
//     }
    
//     checkSort(isAscending,n,arr,i+1);
//   }
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int arr[]=new int[n];
//     for(int i=0;i<n;i++){
//       arr[i]=sc.nextInt();
//     }
//      boolean isAscending=true;
//     checkSort(isAscending,n,arr,0);
//   }
// }

//or

// // //Method 3.
// public class main{
//   public static boolean checkSort(int i,int arr[]){
//     if(i==arr.length-1){
//       return true;
//     }
//     if(arr[i]>arr[i+1]){
//       return false;
//     }
//     return checkSort(i+1,arr);
//   }
//   public static void main(String args[]){
//     int arr[]={3,3,5};
//     System.out.println(checkSort(0,arr));
//   }
// }

////move x in  at the end in a string
// public class main{
//   public static void moveEnd(String str,String newstring,int count,int i){
//     if(i==str.length())
//      {
//       for(i=0;i<count;i++){
//         newstring+='x';
//       }
//       System.out.println(newstring);
//       return;
//      }
//     char currchar=str.charAt(i);
//       if(currchar=='x'){
//         count++;
//         moveEnd(str,newstring,count,i+1);
//       }
//       else
//       {
//          newstring += currchar;
//         moveEnd(str,newstring,count,i+1);
//       }
//   }
//   public static void main(String args[]){
//     String str="axbcxxd";
//     moveEnd(str,"",0,0);
//   }
// }

//or

// import java.util.*;
// public class main{
//   public static void moveAllx(int i,int count,String str,String newstring){
//     if(i==str.length()){
//       for(i=0;i<count;i++){
//         newstring+='x';
//       }
//       System.out.println(newstring);
//       return;
//     }
//     char currchar=str.charAt(i);
//     if(currchar=='x'){
//       count++;
//       moveAllx(i+1,count,str,newstring);
//     }
//     else{
//       newstring+=currchar;
//       moveAllx(i+1,count,str,newstring);
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter a string");
//     String str=sc.next();
//     moveAllx(0,0,str,"");
//   }
// }

// //Remove all the duplicate or repeated elements in a string
// /* Time complexity:O(n)->Worst code because here traversing the string along its length that's why??
//   String ex:abbccda
//   Here I have b,c,a-> duplicate means repeated elements in a string which I have to remove.
//   Procedure:
//   1.First I have to get currchar by using charAt(i).
//   2.Here I have to use boolean datatype array which tells the true(character found) or false(character not found) condition 
//   3.map(idx)=currchar-'a' I have to use,map(idx)='z'-'a'=25-0=25
//   4.currrchar->found then gives true condn where we dont have to add it in a string
//     currchar->does not found gives false condn we have to add it in a newstring ,with that we also pass map[pos]=True->which says that if any character found again it says its already there and its ia duplicated one
//  */

//  public class main{
//   public static boolean map[]=new boolean[26];
//   public static void removeDupl(int i,String str,String newstring)
//   {
//     if(i==str.length()){
//       System.out.println(newstring);
//       return;
//     }
//     char currchar=str.charAt(i);
//     if(map[currchar-'a']==true){  //Here map[currchar-'a'] gives the index==true->says that character is found ,then we dont add it in a newstring
//      removeDupl(i+1,str,newstring);
//     }
//     else
//     {    //Here map[currchar-'a']==false,here I have to add this in the newstring and map[currchar-'a']=true->It shows that this character is already found means which is duplicate one dont add it
//      newstring += currchar;
//      map[currchar-'a']=true;
//      removeDupl(i+1,str,newstring);
//     }
//   }
//   public static void main(String args[]){
//     String str="abbccda";
//     removeDupl(0,str,"");
//   }
//  }

// //***print all the subsequences of a string->Important qn */
// //Time complexity:O(2^n)
/*
 In first stage ->2^0 steps
  then 2^1,2^2,2^3 ......steps i.e 2^n steps are there thats why Time complexity is worst code O(2^n)
    or
    Here Time complexity goes from 2^(n-2)+2^(n-3)+2^(n-4)+.......+1
    By using geometric progression we can calculate the time complexity of a subsequences of a string
     Formula for the geometric progression is->a(r^n+1 -1)/(r-1)
     =1(2^n+1 -1)/(2-1)
     =(2^n+1-1)//! is negligible
     =2^n+1=2^n*2
     we dont consider constant value 2
     =2^n.Therefore Time complexity is worst code ie O(2^n)
 */
// import java.util.*;
// public class main{
//   public static void subSequences(String str,String newstring,int i){
//     if(i==str.length()){
//       System.out.println(newstring);
//       return;
//     }
//     char currchar=str.charAt(i);
//     //Character want to present
//     subSequences(str,newstring+currchar,i+1);
     /////character do not want to present here
//     subSequences(str,newstring,i+1);
//   }
//   public static void main(String args[]){
//    Scanner sc=new Scanner(System.in);
//    System.out.println("Enter a string");
//    String str=sc.next();
//     subSequences(str,"",0);
//   }
// }


// ////**print all the unique subsequences of a string */
// import java.util.HashSet;//Here we are using input package to take HashSet,here we have to use Hashset to get unique subsequences in a string
// public class main{
//   public static void subSequences(String str,String newstring,int i,HashSet<String>set)
//   {
//     if(i==str.length()){
//       if(set.contains(newstring)){
//         return;
//       }
//       else{
//         System.out.println(newstring);
//         set.add(newstring);
//         return;
//       }
//     }
//     char currchar=str.charAt(i);
    
//     subSequences(str,newstring+currchar,i+1,set);

//     subSequences(str,newstring,i+1,set);
//   }
//   public static void main(String args[]){
//     String str="aaa";
//     HashSet<String>set=new HashSet<>();//decln
//     subSequences(str,"",0,set);

//   }
// }

////print the keypad combination
////Time complexity->O(4^n) where 4 is number of choices and n is a length of a string
// public class main{
//   public static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
//   public static void printComb(String str,String combination,int idx){
//     if(idx==str.length()){
//       System.out.println(combination);
//       return;
//     }
//     char currchar=str.charAt(idx);
//     String mapping=keypad[currchar-'0'];//mapping gives the index size of a string
//     for(int i=0;i<mapping.length();i++){
//       printComb(str,combination+mapping.charAt(i),idx+1);
//     }
   
//   }
//   public static void main(String args[]){
//      String str="23";
//      printComb(str,"",0);
//   }
// }

////Advanced questions
////print the permutations of a string
/*
  Time complexity: Ex:abc here a->n choices(3 choices),b->(n-1) choices(2 choices),c->(n-2) choices.....
  means ->n+(n-1)+(n-2)+(n-3)+.....
   i.e->n!
  -> O(n!) 
 * Permutation->Maximum possible  grouping of a string.

 Ex:1.abc,which maximum possible grouping or combination is
 abc,acb,bac,bca,cab,cba->6 combinations means ->3p3(3 characters p 3 places)=3!=6 combinations
 2.abcd->4!=24 combinations
 */

//  import java.util.*;
//  public class main{
//   public static void printPerm(String str,String permutation)//I don't take here index because I use for loop to track the characters
//   {
//     if(str.length()==0)  
//     {
//       System.out.println(permutation);
//       return;
//     }
//     for(int i=0;i<str.length();i++){
//       char currchar=str.charAt(i);
//       String newstring=str.substring(0,i)+str.substring(i+1);//i=b,->"ab"
//       printPerm(newstring,permutation+currchar);
//     }
//   }
//   public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter a string");
//     String str=sc.next(); 
//     printPerm(str,"");
//   }
//  }

////Count total paths in a maze to move from (0,0) to (n,m)
////Time complexity:Due to dynamic programming we can solve this problem in few time
// public class main{
//   public static int countPath(int i,int j,int n,int m){
   
//    if (i==n || j==m) {
//     return 0;//No more paths
//    } 
//    if(i==n-1 && j==m-1){
//     return 1;//means there is only 1 path here no more paths
//    }
//     //Move down
//     int downpath=countPath(i+1,j,n,m);
//     //Move right
//     int rightpath=countPath(i,j+1,n,m);
//     return downpath+rightpath;
    
//   }
//   public static void main(String args[]){
//    int n=3,m=3;
//     int totalpaths=countPath(0,0,n,m);
//     System.out.println(totalpaths);
//   }
// }

////place tiles of size 1*m in floor of size n*m,n=4,m=2
////Time complexity:Due to dynamic programming we can get it in few time
// public class main{
//   public static int placeTiles(int n,int m){
//    if(n==m){
//     return 2;
//    }
//    if(n<m){
//     return 1;
//    }
//     int vertplace=placeTiles(n-m,m);

//     int hortplace=placeTiles(n-1,m);
//     return vertplace+hortplace;
//   }
//   public static void main(String args[]){
//     System.out.println(placeTiles(4,2));
//   }
// }

////find the no of ways in which u can invite the n guests to ur party in single or in pairs
// public class main{
//   public static int callGuests(int n){
//     if(n<=1){
//       return 1;
//     }
//     //single 
//     int way1=callGuests(n-1);
//     //pair
//     int way2=(n-1)*callGuests(n-2);
//     return way1+way2;
//   }
//   public static void main(String args[]){
//    System.out.println(callGuests(4));
//   }
// }

////print all the subsets of a natural number n 
/*Time complexity:O(2^n)
 * Subset->It is a set which can want to add or not 
 */
// import java.util.*;//To import the arraylist from the input package
// public class main{
//   public static void printSubset(ArrayList<Integer>subset){
//     for(int i=0;i<subset.size();i++){
//       System.out.println(subset.get(i)+ " ");
//     }
//     System.out.println();
//   }
//   public static void findSubset(int n,ArrayList<Integer>subset){
    
//     if(n==0){
//      printSubset(subset);
//      return;
//     }
//     //want to add the element
//     subset.add(n);//adding n element
//     findSubset(n-1, subset);
//     //don't want to add the element
//     subset.remove(subset.size()-1);//removing from the last index
//     findSubset(n-1, subset);
//   }
//   public static void main(String args[]){
//     int n=3;
//     ArrayList<Integer>subset=new ArrayList<>();//storing all the subsets in an arraylist
//     findSubset(n,subset);
//   }
// }


////*BackTracking->Find all the possible solutions and use the one u  want
/*Permutation->Maximum possible grouping of a string
  Ex:ABC
  A-> B  C=ABC

      C  B=ACB
  B-> A  C=BAC
      C  A=BCA
  C-> A  B=CAB
      B  A=CBA
     Total Permutation is n!=3!=6 arrangements
     Time complexity:Worst code->O(n*n!) =>n-steps and n!-answers I got Example here I have 3 steps by observing tree visualization and 6(3!) answers =>3*6(3!)=>n*n!
*/

public class main{
  public static void printPermutation(String str,String permutation,int idx){ ////Here I will traverse it by using the for loop i 
    if(str.length()==0){// due to backtrapping When length of a string is equals to 0
      System.out.println(permutation);
      return;
    }
    
    for(int i=0;i<str.length();i++){
      char currChar=str.charAt(i); ////Ex:currChar->B then I want A and C therefore I will not include B    
      String newstring=str.substring(0,i)+str.substring(i+1);//   
      printPermutation(newstring,permutation+currChar,idx+1);                     
  }
}
  public static void main(String args[]){
    String str="ABC";
    printPermutation(str,"",0);
  }
}

/////N Queens 
/*
 In N queens we have N*N board with N number of queens 
 In 1*1,2*2,3*3 ->only 1 queen is there
 Ex:4*4
 4 queens are there->Q1,Q2,Q3,Q4    
 */
//  class main{
//   public boolean isSafe(int row,int col,char[][] board){
//     //horizontal
//     for(int j=0;j<board.length;j++){
//       if(board[row][j]=='Q'){
//         return false;
//       }
//     }
//     //Vertical
//     for(int i=0;i<board.length;i++){
//       if(board[i][col]=='Q'){
//         return false;
//       }
//     }
//     //upper left
//     int r=row;
//     for(int c=col;c>=0 && r>=0;c--,r--){
//       if(board[r][c]=='Q'){
//         return false;
//       }
//     }
//     //upper right
//     r=row;
//     for( int c=col;c<board.length && r>=0;r--,c++){
//       if(board[r][c]=='Q'){
//         return false;
//       }
//     }
//     //lower left
//     r=row;
//     for(int c=col;c>=0 && r<board.length;r++,c--){
//       if(board[r][c]=='Q'){
//         return false;
//       }
//     }
//     //lower right
//     for(int c=col;c<board.length && r<board.length;c++,r++){
//       if(board[r][c]=='Q'){
//         return false;
//       }
//     }
//     return true;
//   }

//   public void saveBoard(char[][] board,List<List<String>>allBoards){
//     String row="";
//     List<String>newBoard=new ArrayList<>();
//     for(int i=0;i<board.length;i++){
//       row="";
//       for(int j=0;j<board[0].length;j++){
//         if(board[i][j]=='Q')
//           row+='Q';
        
//         else
//           row+='.';
//       }
//       newBoard.add(row);
//     }
//     allBoards.add(newBoard);
//   }

//   public void helper(char[][] board,List<List<String>>allBoards,int col){//helper function
//    if(col==board.length){
//     saveBoard(board,allBoards);
//     return;
//    }

//    for(int row=0;row<board.length;row++){
//     if(isSafe(row,col,board)){
//       board[row][col]='Q';
//       helper(board,allBoards,col+1);
//       board[row][col]='.';
//     }
//    }
//   }
//   public List<List<String>>solveNQueens(int n){ //main function
//     List<List<String>>allBoards=new ArrayList<>();
//     char[][] board=new char[n][n];//2D array to simplify the question 
//     helper(board,allBoards,0);
//     return allBoards;
//   }
// }
 


// //N Queens soln-2
// import java.util.*;
// public class main{
//   static int n=4;
//   public static void printBoard(char[][] board){//utility function
//     for(int row=0;row<board.length;row++){
//       for(int col=0;col<board.length;col++){
//         System.out.print(board[row][col] + " ");
//       }
//       System.out.println();
//     }
//   }
//   public static boolean isSafe(char[][] board,int r,int c){
//     //vertical check
//     for(int i=0;i<board.length;i++){
//       if(board[i][c]=='Q')
//         return false;
//   }

//   //Horizontal check
//   for(int j=0;j<board.length;j++){
//     if(board[r][j]=='Q')
//       return false;
//   }

//   //upside left
//   for(int i=r,j=c;i>=0 && j>=0;i--,j--){
//     if(board[i][j]=='Q')
//       return false;
//   }

//   //upside right
//   for(int i=r,j=c;i>=0 && j<board.length;i--,j++){
//     if(board[i][j]=='Q')
//       return false;
//   }

//   //lower left
//   for(int i=r,j=c;i<board.length && j>=0;i++,j--){
//     if(board[i][j]=='Q')
//     return false;
//   }

//   //lower right
//   for(int i=r,j=c;i<board.length && j<board.length;i++,j++){
//     if(board[i][j]=='Q')
//       return false;
//   }
//   return true;
// }
//   public static void nQueenSolution(char[][] board,int r){
//     if(r==board.length){
//       printBoard(board);
//     }
//     else{
//       for(int col=0;col<board.length;col++){
//         if(isSafe(board,r,col)){
//           board[r][col]='Q';
//           nQueenSolution(board, r+1);//printing Q Queen where she is safety,if not then we will do Backtarcking
//           board[r][col]='-';

//         }
//       }
//     }
//   }
//   public static void main(String args[]){//main function
//     char[][] board=new char[n][n];//2D array
//     for(int row=0;row<board.length;row++){
//       Arrays.fill(board[row],'-');
//     }
//     printBoard(board);
//     nQueenSolution(board, 0);

//   }

// }

////Sudoku solver
// public class main{
//   public boolean isSafe(char[][] board,int row,int col,int number){
//     //vertical wise
//     for(int i=0;i<board.length;i++){
//       if(board[i][col]==(char)(number+'0')){//board->char number->int therefore int number is converted into char by casttyping
//         return false;//returning false if any  same number is there along the row wise
//       }
//     }
//     //horizontal wise
//     for(int i=0;i<board.length;i++){
//       if(board[row][i]==(char)(number+'0')){
//         return false;//returning false any same  number is there in along the column wise
//       }
//     }
//     //grid 
//     int sr=3*(row/3);
//     int sc=3*(col/3);

//     for(int i=sr;i<sr+3;i++){
//       for(int j=sc;j<sc+3;j++){
//         if(board[i][j]==(char)(number+'0')){
//            return false;//if any same number is present in the grid then it will t=return false
//         }
//       }
//     }
//     return true;//if same number is not present int any row,column and grid then it will return true
//   }
//   public boolean helper(char[][] board,int row,int col){
//    if(row==board.length){
//     return true;
//    }
//    int nrow=0;
//    int ncol=0;
//    if(col==board.length-1){
//     nrow=row;
//     ncol=col+1;
//    }
//    else{
//     nrow=row+1;
//     ncol=0;
//    }
//    if(board[row][col]!='.'){//filled by already by any other number
//     if(helper(board,nrow,ncol)){
//       return true;
//     }
//   }
//   else{
//     //space if empty then fill it
//     for(int i=1;i<=9;i++){
//       if(isSafe(board,row,col,i)){
//         board[row][col]=(char)(i+'0');//board is char type thats why int i is casttyping into char type
//       }
//       if(helper(board,nrow,ncol)){
//         return true;    //return true if char i can fit in board,row,col
//       }
//       else{
//         board[row][col]='.';//leave space as it is if it cannot be fit in space
//       }
//     }
//   }
//   return false;//returning false if all the above true conditions are not happen
// }
// public void solveSudoku(char[][] board){
// helper(board,0,0);
// }
// public static void main(String args[]){
//   main sudokuSolver=new main();
//   /*
//    main->class ,sudokuSolver->name of the variable.
//    main class and assigns it to the variable sudokuSolver.After this statement is executed refers to the newly createtd instance of the main class whic can be used to call methods or access fields
//    */

//   //defines a Sudoku puzzle board
//   char[][] board = {
//     {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
//     {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
//     {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
//     {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
//     {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
//     {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
//     {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
//     {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
//     {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
// };
// sudokuSolver.solveSudoku(board);//sudokuSolver is variable which refers to the instance of main class ,solvesudoku is the unction which is responsible to solve the puzzle with board is the 2D array
// for(int i=0;i<board.length;i++){
//   for(int j=0;j<board.length;j++){
//     System.out.print(board[i][j] + " ");
//   }
//   System.out.println();
// }
// }
// }

////Merge sort->As like sorting techniques bubble sort,Selection sort and insertion sort there are other two sorting techniques that is merge sort and quick sort
/*
 Ex:unsorted-6 3 9 5 2 8
          to (using merge sort)
    sorted  -2 3 5 6 8 9
      Divide and Conquer
      Time complexity:O(nlogn)->Worst code
      logn->Divide (dividing all the elements in the array)
      n->conquer all the elements in the array
      totally time complexity is O(nlogn)
 */

//  public class main{
//   public static void conquer(int arr[],int si,int mid,int ei){
//     int merged[]=new int[ei-si+1];
//     //Merged array to store the sorted elements in a way ,ei-si+1->going from si to ei +1(because as ind stars with 0 length should be +1 thats why)
//     int idx1=si;//to traverse along the first array
//     int idx2=mid+1;//to traverse along the second array
//     int x=0;//along the merged array
//     while(idx1<=mid && idx2<=ei){
//       if(arr[idx1]<=arr[idx2]){
//         merged[x]=arr[idx1];
//         x++;idx1++;
//       }
//       else{
//         //arr[idx2]<arr[idx1]]
//         merged[x]=arr[idx2];
//         x++;idx2++;
//       }
//       //remaining more elements which does not have any elements to compare with other array
//     }
//       while(idx1<=mid){
//         merged[x]=arr[idx1];
//         x++;idx1++;

//       }
//       while(idx2<=ei){
//         merged[x]=arr[idx2];
//         x++;idx2++;
//       }
//       //store merged array in new array
//       for(int i=0,j=si;i<merged.length;i++,j++){
//         arr[j]=merged[i];
//       }
//     }
  
//   public static void divide(int arr[],int si,int ei){
//       if(si>=ei){
//         return;
//       }
//     int mid=si+(ei-si)/2;
//     //mid=(si+ei)/2 but for  higher integer value it can be face any space complexity problem thats why we use above formula instead of these
//     divide(arr,si,mid);
//     divide(arr,mid+1,ei);
//     conquer(arr,si,mid,ei);

//   }
//   public static void main(String args[]){
//     int arr[]={6, 3, 9, 5, 2, 8};
//     int n=arr.length;
//     divide(arr,0,n-1);
//     for(int i=0;i<n;i++){
//       System.out.print(arr[i] + " ");
//     }
//     System.out.println();
//   }
// }
 

////Quick sort
/*
 Quick sort is one of the sorting technique 
 Ex:
 Unsorted array:6 3 9 5 2 8
                     to
 Sorted array:  2 3 5 6 8 9

 Pivot and Partition:
 Pivot is the one which acts like a hero in the quick sort which is use mainly used to sort the array
 Partition->Either side elements of pivot  which are located are Partition
 
 There are many different ways to implement Pivot:
 By choosing 
 1.random element
 2.1st element
 3.2nd element
 4.last element

 Ex: 6 3 9 5 2 8
 Pivot-8(last element)

 send smaller elements than pivot before Pivot and larger elements than the pivot after pivot
 Time complexity:Worst case:O(n^2)(because It occurs when pivot always will be the largest and smallest element in the array)
  if pivot will be the last element in the array the smallest and largest element in the array
  is
     Average case:Q(nlogn)
   
//  */
// public class main{

//   public static int partition(int arr[],int low,int high){//int->because it return the number
//     int pivot=arr[high];//last element is  a Pivot
//     int i=low-1;
//     for(int j=low;j<high;j++){//j<high->because we dont consider pivot(high) element in sorting thats why we dont consider high
//       if(arr[j]<pivot){//placing smaller elements
//          i++;//going to next position
//          int temp=arr[i];
//          arr[i]=arr[j];
//          arr[j]=temp;
//       }
//     }
//       i++;//position creating for placing pivot element
//       int temp=arr[i];
//       arr[i]=arr[high];
//       arr[high]=temp;
//       return i;//returning index of pivot
    

//   }
//   public static void quickSort(int arr[],int low,int high){
//     if(low<high){
//       int piidx=partition(arr,low,high);//this gives the index of pivot
//       quickSort(arr,low,piidx-1);//smaller elements than the pivot
//       quickSort(arr,piidx+1,high);//Larger elements than the pivot
//     }
//   }
//   public static void main(String args[]){
//     int arr[]={6,3,9,5,2,8};
//     int n=arr.length;
//     quickSort(arr,0,n-1);
//     for(int i=0;i<n;i++){
//       System.out.print(arr[i] + " ");
//     }
//     System.out.println();
//   }
// }



////OOPs(Object Oriented Programming languages) concept:
/*
 Classes and Objects-These basically introduced to solve the real world problems
  Classes-It's like a blueprint to solve the real world problems
  Objects-Objects are all the entities 
 */

// //Class
//  class Pen{  // This Class which I am taking here, name of the class can be anything 
////data
//   String color;
//   String type;//ballpen or gel

//   //function here we called it as method
//   public void write(){
//     System.out.println("Writing something");
//   }
//// above string,int are all those data and function is the members both together called data members

//  }


// //Objects
//  public class main{  //main class 
//     public static void main(String args[]){  //main function
//      Pen pen1=new pen();//used to define the object like pen1
//      pen1.color="blue";//to access the color we use . infront of the object name pen1
//      pen1.type="gel";

//      pen1.write();//printing the statement by using from the class statement
//     }
//  }

// //class
// class Pen{
//   String color;
//   String type;
// public void print(){
//   System.out.println(this.color);//this-It is a keyword which used give information for the objects(pen1 & pen2) to print the color declared in object section  what it has to print
//   System.out.println(this.type);
// }
// }


// public class main{
//   public static void main(String args[]){
//     Pen pen1=new pen();
//       pen1.color="blue";
//       pen1.type="gel";
//     Pen pen2=new pen();
//      pen2.color="black";
//      pen2.type="ballpoint";
//      pen1.print();
//      pen2.print();
//   }
// }

// //class 
// class Student{
//   String name;
//   int age;

//   public void printInfo(){
//     System.out.println(this.name);
//     System.out.println(this.age);
//   }
// }

// //objects
// public class main{
//   public static void main(String args[]){
//     Student s1=new Student();
//     /*new-It is a keyword ,the one which allocates new memory location after executig statement
//       Student-Constructor which is used here in above line to create the object like s1 and in other section except these there are two types of constructor they are 
//          -normal constructor
//          -non-paramerized constructor
//     */
//     s1.name="Hasen patel";
//     s1.age=1;
//     s1.printInfo();
//   }
// }


// class Student{
//   String name;
//   int age;

//   public void printInfo(){
//     System.out.println(this.name);
//     System.out.println(this.age);
//   }
//   /////1.Non-paramerized constructor-/I am declaring here the non-paramerised constructor means which doesn't have any parameters inside the parenthesis
//   // Student(){
//   //   System.out.println("constructor called");
//   // }
//   //////2.normal constructor-Here I am declaring the normal constructor means which have parameters inside the parenthesis
//   Student(String name,int age){
//     this.name=name;//this.name->object and name->parameters which declared for the object
//     this.age=age;
//   }

// }

// public class main{
//   public static void  main(String args[]){
//       Student s1=new Student("Hasan patel",1);
//       //Student s1=new Student();
//       // s1.name="Hasan patel";
//       // s1.age=1;
//       s1.printInfo();
//   }
// }

// class Student{
//   String name;
//   int age;

//   public void printInfo(){
//     System.out.println(this.name);
//     System.out.println(this.age);
//   }
//   //Copy constructor
//   Student(Student s2){
//     this.name=s2.name;
//     this.age=s2.age;
//   }
//   Student(){//i have to call for the sq also thats why I used it here

//   }
// }

// public class main{
//   public static void main(String args[]){
//      Student s1=new Student();
//      s1.name="Hasen patel";
//      s1.age=1;
//      Student s2=new Student(s1);// coping or assigning  s1 value to s2 and printing it
//      s1.printInfo();
     
//   }
// }


/*
 OOP's->In oops  there are mainly 4 concepts  they are-
 *Polymorphism
 *Inheritance
 *Abstraction
 *Encapsulation

 Here in Java there is no destructor like in C++  instead of that here we have Garbage collection which in default removes the unwanted variables from the memory
 */

////1.Polymorphism
/*Defn-Poly->many,morphism-forms
  Polymorphism is the type of OOPs which is used to write the same thing in different ways
   
  There are two types in Polymorphism they are:
   *Function Overloading-Compile time polymorphism
   *Function Overwriting-Run time polymorphism
 */

 ////Function overloading-Compile time polymorphism
 /*
    In this we use same function name for different purposes
  

    Rules for using compile time polymorphism-
    1. We have to use different data types in every members else
    2.We have to use different parameters inside the parenthesis else
    3.if we have used the same datatype and same parameters then we have to add another one parameter inside the parenthesis 
 */

//  //class
//  class Student{
//   String name;
//   int age;

//different parameters inside the parenthesis is I am using here
//   public void printInfo(String name){  //function-printInfo which prints the name
//     System.out.println(name);
//   }
//   public void printInfo(int age){//funcn used to print the age
//     System.out.println(age);
//   }
//   public void printInfo(String name,int age){//function which took two parameters to print both the name and age
//     System.out.println(name + " " + age);
//   }
//  }

//  //object
//  public class main{
//   public static void main(String args[]){
//     Student s1=new Student();
//     s1.name="Shihabuddin";
//     s1.age=2;
//     s1.printInfo(s1.name,s1.age);

//   }
//  }


////2.Inheritance
/*
 Defn-Inheritance is the type of OOPs concept which is used to inherit the ones particular class property to other class. 
 Parent/Base class -Class which is giving the property
 Child/sub class-Class which is taking the property.
 */

//  class Shape{//For different shapes like rectangle,triangle or circle they all different size or area we cant declare all these things in a single class
//   String color;
//  }

//   class Triangle extends Shape{
//     ////without declaring any parameters inside this we can get
//   }

//  public class main{
//   public static void main(String args[]){
//   Triangle t1=new Triangle();
//   t1.color="red";//Here for t1 object which is declared by using the class Triangle in reality doesn't have any parameters but due to using inheritance property it will inherit the property from base class thats it doesnt have any errors in that
//   }
//  }


////There are 4 types of inheritance they are
//1.Single level inheritance-Base class --> Derived class (class property will transferred from the Base class to the Derived class)
// class Shape{ //Base class
//   public void area(){
//     System.out.println("display the area");
//   }
// }

// class Triangle extends Shape{ //Derived class
//   public void area(int b,int h){
//     System.out.println(1/2*b*h);
//   }
// } 
// public class main{
//   public static void main(String args[]){
//
//   }
// }


// //2.Multilevel Inheritance-Base class-->Derived class-->Derived class
// class Shape{ //Base class
//   public void area(){
//     System.out.println("display the area");
//   }
// }

// class Triangle extends Shape{ //Derived class
//   public void area(int l,int b){
//     System.out.println(1/2*l*b);
//   }
// }

// class EquilateralTraingle extends Triangle{
//   public void area(int l,int b){
//     System.out.println(1/2*l*b);
//   }
// }

// public class main{
//   public static void main(String args[]){

//   }
// }


// //3.Hiererchial Inheritance
// /*
//  Defn:Hiererchial inheritance is the proces in which multiple or many Derived classes depend on the Base class only.
//   Base class-->Derived class1 ,Derived class2.......
//  */

//  class Shape{ //Base class
//   public void area(){
//     System.out.println("Display the area");
//   }
//  }

//  class Triangle extends Shape{ //Derived class which is depend on the base class
//     public void area(int l,int b){
//       System.out.println(1/2*l*b);
//     }
//  }

//  class Circle extends Shape{ //Another derived class which is depend on the Base class only
//   public void area(int r){
//     System.out.println(3.14*r*r);
//   }
//  }

//  public class main{
//   public static void main(String args[]){

//   }
//  }


//4.Hybrid inheritance-means Sometimes in java all three inheritance types (single level,multi level and Hiererchial inheritance) occurs at a time is konown as Hybrid level inheritance

//There is also another one type of inheritance is there that is Multiple inheritance but in java we dont use it in class instead of that we use it as  in the form interfacers

//3.Encapsulation- data and functions in a class are integrated in one unit
/*
  By using encapsulation we can do Data Hiding means we can hide the sensitive data by using the access modifiers
 In Java mainly we study about two main concepts they are
 1.Packages
 2.Access modifiers

 1.Packages-We used it for some particular purposes like functioning etc.
    Packages of one particular class can be transferred from one class to the other class
 */
//   package bank;//Taking one package which shows that I am importing one input package
//   class Account{
//     public String name;
//   }
//  public class main{
//  }
//We transfer class properties from other class(xtrap) to here

//2.Access modifiers-In Java there are 4 types of access modifiers they are
/*
  1.public -which can be access anywhere may be in the class or in the package also
  2.default-there is no any access modifier in front of parameters
  3.protected-which can be access by the same package but for different packages we can use it only in sub classes
  4.private-which can be access in the same class not in others classes,sub-classes or in package

 */

////*public access modifier
////*default access modifier */
////*protected access modifier */
////*private access modifier */
 ////In Java we can use two different types of function they are-
 /*
    getters and setters
    *getters-which is used to get the private information back to us
    *setters-which is used to set any password or wanted things to it
 */
//  class Account{
//   public String name;//public denotes that string parameter can be apply to whole class
//                      //String name;//This one is default where it does not have any access modifiers
//   public String email;
//   private String password;//access in this class only

//   //getters and setters
//   public String getPassword(){
//     return this.password;
//   }

//   public void setPassword(String pass){
//        this.password=pass;
//   }

//  }

//  public class main{
//   public static void main(String args[]){//here in both places like in class and in main function we used public denotes that this class can be access anywhere with that main function can access to anyone
//     Account account1=new Account();
//     account1.name="Khaja husen";
//     account1.email="apnacollege@gmail.com";
//     //account1.password="abcd";//because it can access in a one class i.e Account class
//     account1.setPassword("abcd");
//     System.out.println(account1.getPassword());
//   }
//  }


////4.Abstraction-It is the concept of OOP's where we used it to show the only important information and hide the unimportant information
/*
  there are two types of using abstarction in Java they are
  1.By using keyword,class or functions.
  2.By using interface.

 */

////1.by using abstract keyword , class or function method
// //Here in Base class I just want this as blueprint only dont want to use it means in abstarct-only exist but dont want to use
//  abstract class Animal{
//  abstract void walk();//There is no need to use use{} here we have to terminate by using the (;).

//  //non abstract method 
//  public void eats(){
//   System.out.println("Animal eats");
//  }

//  }

//  class Horse extends Animal{
//   public void walk(){
//     System.out.println("Walk on 4 legs");
//   }
//  }

//  class Human extends Animal{
//   public void walk(){
//     System.out.println("walk on 2 legs");
//   }
//  }


// public class main{
//   public static void main(String args[]){
//     Horse horse=new Horse();
//     horse.walk();
//     horse.eats();//because above used non abstract method where base class have both exist and using properties
//    // Animal animal=new Animal();
//     //animal.walk();//getting run time error because here I used Animal class as only for exist not for use
//   }
// }
  
////contructor properties in abstraction
/*
 Here first Base class constructor will execute then the derived class this is called Constructor chain.
 */
// abstract class Animal{
//    abstract void walk();
//    Animal(){
//     System.out.println("Animal constructor is present here");
//    }
// }

// class Horse extends Animal{
//   Horse(){
//     System.out.println("Horse constructor is present here");
//   }
//     public void walk(){
//       System.out.println("Walk on 4 legs");
//     }
// }

// class Human extends Animal{
//   public void walk(){
//     System.out.println("walk on 2 legs");
//   }
// }

// public class main{
//   public static void main(String args[]){
//     Horse horse=new Horse();
//   }
// }


//2.By using Interface method which is like the class only.Here we cant use constructors in it
/*
 In interface we can use multilevel inheritance by accesing two classe at a single time but cant use in class
 */
// interface Animal{
//   void walk();//By default it will considered as a public or abstract both also
// }
//  interface Herbivores{

//  }

// class Horse implements Animal,Herbivores{
//   public void walk(){
//     System.out.println("Walk on 4 legs");
//   }
// }

// public class main{
//   public static void main(String args[]){
//     Horse horse=new Horse();
//     horse.walk();
//   }
// }

////Static-Static is a keyword which is used to give the common name for all ,for example for all students of our college there  is common college i.e is UVCE
/*
 Static can be used in front of parameters,functions or block to show that which is common
 */
//   class Student{
//     String name;//student name
//     static String school;//Static because for all students there is common school
//   }

//   // public static void changeSchool(){
//   //   school="newschool";
//   // }


// public class main{
//   public static void main(String args[]){
//     //As I used static here there is no need to declare the object because it will access by using the class
//     Student.school="MDRS";
//     Student student=new Student();
//     student.name="patel";
//     System.out.println(student.school);

//   }
// }


////Arraylist
/*
 Array-0|1|2|3|4|5   -*Properties 
                     -*memory is continous means  we have to place all the elements in a continous way
                     -*fixed in size

   To come out from this two properties disadvantages we use Arraylist
 Arraylist -which have -*uncontinous memory
                       -*variable in size

  Array have primitives(int,float) and objects.

  but
  Arraylist have only the objects which are stored in a heap memory

  Operations which can done in Arraylist
  -Add
  -get(getting return added element)
  -Delete/remove
  -Modify
  -Iterate/operations
 */


 
// import java.util.ArrayList;
// import java.util.Collections;

// public class main{
//   public static void main(String args[]){
//     ArrayList<Integer>list=new ArrayList<>();
//     //Here in java we cant use primitive we can only use objects thats why here we are using classes for datatypes like Integer,Float,String,Boolean like that
//     // add-variable.add()
//     list.add(0);
//     list.add(2);
//     list.add(4);
//     System.out.println(list);

//     //get-variable.get()-getting added element from the index
//     int element=list.get(2);
//     System.out.println(element);

//     //add elements in between(Modify)-variable.add(adding index,element)
//       list.add(2,3);
//       System.out.println(list);

//     //set -variable.set(index,element)-replace the particular element
//     list.set(0,5);
//     System.out.println(list);

//     //remove-variable.remove(index)
//     list.remove(3);
//     System.out.println(list);

//     //size=variable.size()
//     int size=list.size();
//     System.out.println(size);


//     //loops
//     for(int i=0;i<list.size();i++){
//       System.out.print(list.get(i));
//     }
//     System.out.println();

//     //sorting -Collections.sort(variable);

//     Collections.sort(list);//Collections is class which have data structures like sets,maps,sorting etc
//     System.out.println(list);

//   }
// }

/*
           Arraylist                                              Linkedlist
 *Insert-  O(n)                              >                      O(1)
 *search-  O(1)                              <                      O(n)

 Linkedlist properties
 Variable size
 Non-contigous memory
 Insert -O(1)(We use it because it takes less Time complexity)
 search -O(n)
 */
   

 //Linked list coding doing 4 operations : add(insert),print,delete,size
//  class main{
//      Node head;
//      private int size;

//       main(){//constructor
//         this.size=0;
//      }

//   class Node{//Node with the value of data and next are represented by using the class
//     String data;
//     Node next;//next are declared by using the class name infront of it

//     Node(String data){//paramerized constructor class
//       this.data=data;
//       this.next=null;//Head node next will be null
//        size++;
//     }
//   }
//   //addfirst
//     public void addFirst(String data){
//       Node newNode=new Node(data);
//      //head is having null next
//    if(head==null){
//     head=newNode;
//     return;
//    }
//    //head is not having null next
//    newNode.next=head;
//    head=newNode;
//     }
//   //addlast
//     public void addLast(String data){
//       Node newNode=new Node(data);
//       if(head==null){
//         head=newNode;
//         return;
//       }

//       Node currNode=head;//if we traverse the head then that head will shift to next one then we cant get the real head back thats why here we declared head by using the currNode which will not affect on anything
//       while(currNode.next!=null){
//         currNode=currNode.next;//it will go upto reachin null
//       }
//       currNode.next=newNode;//newcode is assigned to the currNode

//     }

//     public void printList(){
//       //If there is not any nodes then
//       if(head==null){//corner case 
//         System.out.println("The List is empty here");
//         return;
//       }
//         Node currNode=head;
//         while(currNode!=null){
//           System.out.print(currNode.data + "->");
//           currNode=currNode.next;
//         }
//         System.out.println("NULL");
//     }

//     //delete first
//     public void deleteFirst(){
//     if(head==null){ //corner case-no elements
//      System.out.println("The list is empty here");
//        return;
//     }
//     size--;
//     head=head.next;
//   }

//   //deleteLast
//   public void deleteLast(){
//     if(head==null){
//       System.out.println("The List is empty here");
//     }
//     size--;//here we r using the size-- because if we use after the if statement which consists the head.next it will lead to lost that value by decreamenting
//     if(head.next==null){
//        head=null;
//        return;
//     }
//     Node secondLast=head;
//     Node lastNode=head.next;

//     while(lastNode.next!=null){
//        lastNode=lastNode.next;
//        secondLast=secondLast.next;
//     }
//     secondLast.next=null;
//   }

//   public int getSize(){
//     return size;
//   }
//   public static void main(String args[]){
//     main list=new main();
//     list.addFirst("a");
//     list.addFirst("is");
//     list.addFirst("This");
//     list.printList();

//     list.addLast("List");
//     list.printList();

//     list.deleteFirst();
//     list.printList();

//     list.deleteLast();
//     list.printList();

//     System.out.println(list.getSize());

//     list.addFirst("this");
//     System.out.println(list.getSize());
//    }
//   }
    

    //  import java.util.*;   //to take LinkedList
    //  class main{
    //   public static void main(String args[]){
    //     LinkedList<String> list=new LinkedList<String>();
    //     list.addFirst("a");
    //     list.addFirst("is");
    //     list.addFirst("This");
    //     System.out.println(list);
    //     list.addLast("list");//list.add can also take default in place of list.addLast
    //     System.out.println(list);
    //     System.out.println(list.size());
    //     for(int i=0;i<list.size();i++){
    //       System.out.print(list.get(i) + "->");
    //     }
    //     System.out.println("null");
    //     list.removeFirst();
    //     System.out.println(list);
    //     list.removeLast();
    //     System.out.println(list);
    //     list.remove(1);
    //     System.out.println(list);
    //   }
    //  }

    
//     ////Reverse LinkedList by Iterate way or by Recursive way
//     /*
//      Time complexity:O(n)
//      Space complexity:O(1)- We have to do this program in a constant space
//      */
//  class main{
//   Node head;
//   private int size;

//    main(){//constructor
//      this.size=0;
//   }

// class Node{//Node with the value of data and next are represented by using the class
//  int data;
//  Node next;//next are declared by using the class name infront of it

//  Node(int data){//paramerized constructor class
//    this.data=data;
//    this.next=null;//Head node next will be null
//     size++;
//  }
// }

// //addLast
//  public void addLast(int data){
//    Node newNode=new Node(data);
//    if(head==null){//next is null
//      head=newNode;
//      return;
//    }
//    Node currNode=head;//if we traverse the head then that head will shift to next one then we cant get the real head back thats why here we declared head by using the currNode which will not affect on anything
//    while(currNode.next!=null){
//      currNode=currNode.next;//it will go upto reaching null
//    }
//    currNode.next=newNode;//newcode is assigned to the currNode

//  }

//  public void printList(){
//    //If there is not any nodes then
//    if(head==null){//corner case
//      System.out.println("The List is empty here");
//      return;
//    }
//      Node currNode=head;
//      while(currNode!=null){
//        System.out.print(currNode.data + "->");
//        currNode=currNode.next;
//      }
//      System.out.println("NULL");
//  }

// public int getSize(){
//  return size;
// }

// // //Iterative way
// // public void reverseIterate(){
// //    if(head==null||head.next==null){
// //     //corner case-when no elements are there and only one head there is no head next 
// //     return;
// //    }

// //    Node prevNode=head;
// //    Node currNode=head.next;
// //    while(currNode!=null){
// //     Node nextNode=currNode.next;
// //     currNode.next=prevNode;
// //     prevNode=currNode;
// //     currNode=nextNode;
// //    }
// //    head.next=null;
// //    head=prevNode;
// // }


////Recursive way 
// public Node reverseRecu(Node head){
//   if(head==null||head.next==null){
//     return head;
//   }
//   Node newHead=reverseRecu(head.next);
//   head.next.next=head;
//   head.next=null;

//   return newHead;

// }

// public static void main(String args[]){
//  main list=new main();
//  list.addLast(1);
//  list.addLast(2);
//  list.addLast(3);
//  list.addLast(4);
//  list.printList();
// //  list.reverseIterate();
// //  list.printList();

//   list.head=list.reverseRecu(list.head);
//   list.printList();
//  }
// }


////delete secondlast node in a linked list
////Ex:1->2->3->4->5->N

// class main{
//   Node head;
//   private int size;//keeps tracking the number of codes in the list

//   main(){
//     this.size=0;//initializes the size to 0
//   }
//   class Node{
//     int data;
//     Node next;

//     Node(int data){
//       this.data=data;
//       this.next=null;
//       size++;//increment the size of the list
//     }
//   }
//   public void addFirst(int data){
//     Node newNode=new Node(data);
//     if(head==null){//list is empty
//       head=newNode;
//       return;
//     }
//     newNode.next=head;
//     head=newNode;
//   }
//   public Node remove(int index){
//     if(head==null||index<1||index>size){//checking list is empty or index is out of bound
//       return null;
//     }
//     if(index==1){
//       //only two node are there
//       head=head.next;//setting head to the next node and removinfg the head
//       size--;
//       return head;
//     }
//     Node prev=head;
//     for(int i=1;i<index-1;i++){
//       prev=prev.next;
//     }
//     prev.next=prev.next.next;
//     size--;
//     return head;
//   }

//   public void printList(){
//     //If there is no nodes then
//     if(head==null){
//       System.out.println("The list is empty here");
//       return;
//     }
//     Node currNode=head;
//     while (currNode!=null) {
//       System.out.print(currNode.data + "->");
//       currNode=currNode.next;
//     }
//     System.out.println("Null");
//   }

//   public int getSize(){
//     return size;
//     //returns the current size of the code
//   }

//   public static void main(String args[]){
//     main list=new main();
//     list.addFirst(5);
//     list.addFirst(4);
//     list.addFirst(3);
//     list.addFirst(2);
//     list.addFirst(1);
//     list.printList();
//     list.remove(4);
//     list.printList();
//   }
// }

/*
 Stack-(LIFO-Last In First Out)
 which one comes at last will be removed first
 -Stack is a one where elements are placed one above 
  ->Here there are mainly three functions in stack they are
 *Push O(1)-adding elements
 *Pop O(1)-removing top element from stack and return deleted top element
 *Peek O(1)-returning the top element in a stack without removing it

 ->Three implementation types:
  Array
  ArrayList
  LinkedList
 */

 //*Linked list form */
 //Here infront of class we are using access modifiers thats only the diffrence in this and previous code of a linked list
//  public class main{//class-public class
//   static class Node{
//       int data;
//       Node next;
//    public Node(int data){
//     this.data=data;
//     this.next=null;
//    }
//   }

//   static class Stack{
//     public static Node head;
//     public static boolean isEmpty(){
//       return head==null;//return whether linkedlist is null or ot
//     }

//     //To add the element in a stack as a head and top element-push
//     public static void push(int data){
//       Node newNode=new Node(data);
//       if(isEmpty()){
//           head=newNode;
//           return;  
//       }
//       newNode.next=head;
//       head=newNode;//head will be the top element in a stock
//     }
      
//     //To delete the top element and return the  top element-pop
//     public static int pop(){
//       if(isEmpty()){
//         return -1;//if list is empty then it will return -1 because no one element is here delete
//       }
//       int top=head.data;
//       head=head.next;
//       return top;
//     }

//     //Returning the top element without deleting it
//     public static int peek(){
//       if(isEmpty()){
//         return -1;
//       }
//       return head.data;
//     }
//   }

//     public static void main(String args[]){
//       Stack s=new Stack();
//       s.push(1);
//       s.push(2);
//       s.push(3);
//       s.push(4);

//       while(!s.isEmpty()){
//         //print elements upto list is not empty
//         System.out.println(s.peek());
//         s.pop();
//       }
//     }
//  }


// //*Arraylist form */
// import java.util.*;
// public class main{
//    static class Stack{
//     static ArrayList <Integer> list=new ArrayList<>();
    
//     public static boolean isEmpty(){
//      return list.size()==0;
//     }

//     //add the element
//     public static void push(int data){
//         list.add(data);
//     }

//     //delete the top element and return the top element
//     public static int pop(){
//       if(isEmpty()){
//         return -1;
//       }
//       int top=list.get(list.size()-1);
//       list.remove(list.size()-1);
//       return top;
//     }

//     //returning the top element without deleting it
//     public static int peek(){
//       if(isEmpty()){
//         return -1;
//       }
//       return list.size()-1;
//     }
//   }
//   public static void main(String args[]){
//     Stack s = new Stack();
//     s.push(1);
//     s.push(2);
//     s.push(3);
//     s.push(4);

//     while(!s.isEmpty()){
//       System.out.println(s.peek());
//       s.pop();
//     }
//   }
// }



// //Usng collectons framework
// import java.util.*;

// public class main{
//   public static void main(String args[]){
//     Stack<Integer> s=new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);
//     s.push(4);

//     while(!s.isEmpty()){
//       System.out.println(s.peek());
//       s.pop();
//     }
    
//   }
// }

/*There are 2 types of stack
*implicit stack-this stack which is already present in the memory in the form of stack which can be done by using the recursion fn
*explicit stack-stack which is userdefined  
*/
// //pushBottom stack by using recursion
// import java.util.*;
// public class main{
//    public static void pushBottom(int data,Stack<Integer>s){
//      if(s.isEmpty()){
//       s.push(data);
//       return;
//      }
//     int top=s.pop();//removing the top element from here
//      pushBottom(data,s);
//      s.push(top);
//    }
//   public static void main(String args[]){
//     Stack<Integer> s=new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);
//     pushBottom(4,s);
//     while(!s.isEmpty()){
//       System.out.println(s.peek());
//       s.pop();
//     }
//   }
// }

// //Reverse a stack
// import java.util.*;
// public class main{//main class
//   public static void pushBottom(int data,Stack<Integer>s){
//     if(s.isEmpty()){
//       s.push(data);//list is empty then top element pushed there
//       return;
//     }
//     int top=s.pop();
//     pushBottom(data,s);
//     s.push(top);
//   }

//   public static void reverse(Stack<Integer>s){
//     if(s.isEmpty()){
//       return;
//     }
//     int top=s.pop();//removing top elements 
//     reverse(s);//reversing from single ,then two ,three elements like that
//     pushBottom(top,s);
//   }
//   public static void main(String args[]){ 
//     Stack<Integer> s=new Stack<>();
//     s.push(1);
//     s.push(2);
//     s.push(3);
//      reverse(s);

//     while(!s.isEmpty()){
//       //go upto there where list is not equal to empty
//       System.out.println(s.peek());
//       s.pop();
//     }
//    }
// }


