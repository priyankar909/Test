import java.util.Scanner;
class qfirst{
    public static void main(String[] args) {
        int a[]=new int[5];
        int temp;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.print("enter the element of array");
            a[i] = sc.nextInt();
        }
        
        for(int i=1;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
            if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                
            }
        }
    }
                for(int i=0;i<a.length;i++){
            System.out.println(a[i]);

    
                }
}
}
// import java.util.Scanner;

// class AreaOfShape {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.println("Enter any number:");
//         System.out.println("1. Area of rectangle");
//         System.out.println("2. Area of circle");
//         System.out.println("3. Area of square");
//         System.out.println("4. Area of triangle");
//         System.out.println("5. Area of circumference");
//         int choice = scanner.nextInt();

//         switch (choice) {
//             case 1:
//                 System.out.println("Enter length");
//                 double length = scanner.nextDouble();
//                 System.out.println("Enter breadth");
//                 double breadth = scanner.nextDouble();
//                 double area = length * breadth;
//                 System.out.println("The area of rectangle is: " + area);
//                 break;
//             case 2:
//                 System.out.println("Enter radius");
//                 double radius = scanner.nextDouble();
//                 double circle = 3.14 * radius * radius;
//                 System.out.println("Area of circle is: " + circle);
//                 break;
//             case 3:
//                 System.out.println("Enter side");
//                 double side = scanner.nextDouble();
//                 double square = side * side;
//                 System.out.println("Area of square is: " + square);
//                 break;
//             case 4:
//                 System.out.println("Enter height");
//                 double height = scanner.nextDouble();
//                 System.out.println("Enter base");
//                 double base = scanner.nextDouble();
//                 double triangle = 0.5 * base * height;
//                 System.out.println("Area of triangle is: " + triangle);
//                 break;
//             case 5:
//                 System.out.println("Enter radius");
//                 radius = scanner.nextDouble();
//                 double circumference = 2 * 3.14 * radius;
//                 System.out.println("Area of circumference is: " + circumference);
//                 break;
//             default:
//                 System.out.println("Invalid choice");
//         }

//         scanner.close();
//     }
// import java.util.Scanner;
// class areaofshape{
//     public static void main(String[] args) {
//  //Scanner r=new Scanner(System.in);
//  System.out.println("enter any number:");
//  System.out.println("1.area of rectangle");
//  System.out.println("2.area of circle");
//  System.out.println("3.arae of square");
//  System.out.println("4.area of triangle");
//  System.out.println("5.area ofcirumperence");
//   Scanner r=new Scanner(System.in);
//  int choice =r.nextInt();
//  switch(choice){
//     case 1:
//     System.out.println("enter l");
//     double l=r.nextDouble();
//     System.out.println("enter breadth");
//     double b=r.nextDouble();
//     double area=l*b;
//     System.out.println("the area of rectangle:"+" " +area);
//     break;
//     case 2:
//     System.out.println("enter r");
//     double radius=r.nextDouble();
//       double circle=3.24*radius*radius;
//     System.out.println("arae of circle is:"+""+ circle);
//     break;
//     case 3:
//     System.out.println("enter side");
//     double side=r.nextDouble();
//     double square=side*side;
//     System.out.println("area of suare"+""+ square);
//     break;
//     case 4:
//     System.out.println("enter h");
//     double h=r.nextDouble();
//     System.out.println("enter base");
//     double base=r.nextDouble();
//     double triangle=0.25*base*h;
//     System.out.println("area of triangle:"+""+triangle);
//     break;
//     default :
//         System.out.println("invalid choice");
//     }
            

    
    

//  }


// }
// public class qfirst {
//     public static void main(String[] args) {
//         int fg=fact(5);
//             System.out.println(fg);
//     }
//        static int fact(int n){
//         int fact1=1;
//     if(n<=1){
//         System.out.println(1);
//         return 1;
//     }

         
//             //System.out.println(fact1);
//               fact1=n*(n-1);
//             return   fact1 ;
//         }
//         }
       
// public class qfirst {
//     public static int findLargerNumber(int a, int b) {
//         return (a > b) ? a : b;
//      }
//         public static void main(String[] args) {
    
//                 int a = 10;
//                 int b = 20;
        
//                 int largerNumber = findLargerNumber(a, b);
        
//                 System.out.println("The larger number is: " + largerNumber);
//             }
//         }

// import java.util.Scanner;

// public class qfirst {
//         public static void main(String[] args) {
//             //import java.util.Scanner;

//  int  r=0,n,rem=0;
//  Scanner obj=new Scanner (System.in);
//     System.out.println(" enter your number ");
//     n= obj.nextInt();
//     for( int i=n;n>0;i++)
//     {
//         rem=n%10;
//         r=r*10+rem;
//         n=n/10;
//        // System.out.println("reverse"+rem );
    
//     }
//      System.out.println("reverse"+rem );
// }
// }
        
            
        
   
    
    

