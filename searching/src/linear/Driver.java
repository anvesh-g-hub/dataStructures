package linear;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        linearSearchUsingSentinel();

    }


    public static void linearSearch(){
        LinearSearch ls=new LinearSearch();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int sizeOfArray=sc.nextInt();


        int[] elements=new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            System.out.print("Enter element "+i+": ");
            elements[i]=sc.nextInt();
        }

        System.out.print("Enter element to be searched:");
        int elementToBeSearched=sc.nextInt();

        int index=ls.search(elements,sizeOfArray,elementToBeSearched);
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index "+index);
        }
    }

    public static void linearSearchUsingSentinel(){
        LinearSearchUsingSentinel lss=new LinearSearchUsingSentinel();
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int sizeOfArray=sc.nextInt();


        int[] elements=new int[sizeOfArray+1];
        for(int i=0;i<sizeOfArray;i++){
            System.out.print("Enter element "+i+": ");
            elements[i]=sc.nextInt();
        }

        System.out.print("Enter element to be searched:");
        int elementToBeSearched=sc.nextInt();

        int index=lss.search(elements,sizeOfArray,elementToBeSearched);
        if(index==-1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index "+index);
        }
    }
}
