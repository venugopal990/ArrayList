import java.util.*;
import java.io.*;
 public class ListArray{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        ArrayList<Integer> Arr = new ArrayList<Integer>(); 
          int choice;
        
        do{
        //ArrayList
        System.out.println("1.Insert 2.Insert at Index 3.Delete 4.Sort 5.Search 6.exit");
        System.out.println("Enter your choice:");
     choice=sc.nextInt();
        
            switch(choice){
                case 1:
                    System.out.println("Enter a Element to Insert:");
                    int Arr1= sc.nextInt();
                    Arr.add(Arr1);
                        System.out.println("Element are:"+Arr);
                    break;
                case 2: 
                      System.out.println("Enter a Index :");
                         int Arr2= sc.nextInt();
                          System.out.println("Enter a Element to Insert:");
                         int Arr21= sc.nextInt();
                         Arr.add(Arr2,Arr21);
                                System.out.println("Element are:"+Arr);
                          break;
                case 3:
                     System.out.println("Enter Index to Remove Element:");
                    int Arr3= sc.nextInt();
                    Arr.remove(Arr3);
                       System.out.println("Element are:"+Arr);
                     break;
                case 4:
                    
                         Collections.sort(Arr);
                          System.out.println("Sorted Element are:"+Arr);
                         
                   
                     break;
                case 5:
                   System.out.println("Enter a Element to Search the Index:");
                   int arr5=sc.nextInt();
                 System.out.println( "Index is:"+Arr.indexOf(arr5));;
                    break;
                
                case 6:
                        break;
                    
                default :
                        break;
                      
                
            }
        }while(choice!=6);
        
    }
}
