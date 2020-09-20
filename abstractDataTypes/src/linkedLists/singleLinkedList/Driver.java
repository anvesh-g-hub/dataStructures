package linkedLists.singleLinkedList;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        SingleLinkedList sll = insertDataIntoTheList();
        displayDataInTheList(sll);
//        SingleLinkedList sll2=insertDataInTheBeginning();
//        displayDataInTheList(sll2);
        sizeOfTheList(sll);
        searchForAnElement(sll);
        sll.dataInLastNode(sll.getStart());
        sll.dataInSecondLastNode(sll.getStart());
        predecessorOfAGivenData(sll);
        elementAtGivenPosition(sll);


    }

    public static SingleLinkedList insertDataIntoTheList() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number elements to be inserted");
        int totalElements = sc.nextInt();
        SingleLinkedList sll = new SingleLinkedList();
        for (int i = 0; i < totalElements; i++) {
            System.out.print("Enter " + (i + 1) + " element in the list :");
            int element = sc.nextInt();
            sll.insertDataIntoList(element);
        }
        return sll;
    }

    public static void displayDataInTheList(SingleLinkedList sll) {
        sll.displayElementsInTheList(sll.getStart());
    }

    public static SingleLinkedList insertDataInTheBeginning() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number elements to be inserted");
        int totalElements = sc.nextInt();
        SingleLinkedList sll = new SingleLinkedList();
        for (int i = 0; i < totalElements; i++) {
            System.out.print("Enter " + (i + 1) + " element in the list :");
            int element = sc.nextInt();
            sll.insertDataInTheBeginning(element);
        }
        return sll;
    }

    public static void sizeOfTheList(SingleLinkedList sll) {
        sll.sizeOfTheList(sll.getStart());
    }

    public static void searchForAnElement(SingleLinkedList sll) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element to be searched: ");
        int searchElement=sc.nextInt();
        sll.searchForAnElement(sll.getStart(),searchElement);
    }

    public static void predecessorOfAGivenData(SingleLinkedList sll){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter element for which you need predecessor: ");
        int searchElement=sc.nextInt();
        sll.predecessorOfAGivenData(sll.getStart(),searchElement);

    }

    public static void elementAtGivenPosition(SingleLinkedList sll){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter position for which you want to know the data: ");
        int searchPosition=sc.nextInt();
        sll.elementAtGivenPosition(sll.getStart(),searchPosition);
    }


}
