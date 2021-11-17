package listusinglinkedmemory;

import java.util.Scanner;

public class ListUsingLinkedMemory {
    public static void main(String[] args) {
        int decision = 1 ;
        Scanner input = new Scanner(System.in) ;
        int data = 0 ;
        System.out.println("Making an Un-ordered link list");
        LinkList list = new LinkList();
        
        
        SortedLinkList orderedList = new SortedLinkList() ;
        orderedList.insert(23);
        orderedList.displayList();
        orderedList.insert(60);
        orderedList.displayList();
        orderedList.insert(40);
        orderedList.displayList();
        orderedList.insert(10);
        orderedList.displayList();
        orderedList.insert(30);
        orderedList.displayList();
        orderedList.insert(50);
        orderedList.insert(-10);
        orderedList.displayList();
        orderedList.remove(100);
        orderedList.displayList();
          
               
                
        
        /*
        list.displayList();
        list.addAtLast(20);
        list.addAtFirstLocation(70);
        list.displayList();
        list.addAtLast(40);
        list.displayList();
        list.addAtLast(-10);
        list.displayList();
        list.addAtFirstLocation(30);
        list.displayList();
        list.addAtFirstLocation(40);
        list.displayList();
        list.addAtFirstLocation(60);
        list.displayList();
        list.remove(60);
        list.displayList();
        */
        
        
        /*
        while(decision == 1){
            System.out.print("Enter data to insert: ");
            data = input.nextInt() ;
            list.addAtFirstLocation(data);
            System.out.println("List after adding: " + data);
            list.displayList();
            System.out.print("Do you want to continue? Press 1 to continue or 0 to stop:");
            decision = input.nextInt() ;
        }
        */
        
        
        /*
        System.out.println("-------------------------------------");
        System.out.println("Making an Ordered link list");
        SortedLinkList sortedList = new SortedLinkList() ;
        decision = 1 ;
        while(decision == 1){
            System.out.print("Enter data to insert: ");
            data = input.nextInt() ;
            sortedList.insert(data);
            System.out.println("List after adding: " + data);
            sortedList.displayList();
            System.out.print("Do you want to continue? Press 1 to continue or 0 to stop:");
            decision = input.nextInt() ;
        }
        */
    }
}
