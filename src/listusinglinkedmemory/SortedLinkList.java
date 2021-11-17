package listusinglinkedmemory;
/**
 *
 * @author M. Ishtiaq
 */
public class SortedLinkList {
    Node head ;

    public SortedLinkList() {
        head = null ;
    }
    
    public void insert(int data) {
        Node lastCurrentNode = null  ;
        Node currentNode = head ;
        Node newNode = new Node(data) ;
        if (head != null){
            while (currentNode != null){
                if (currentNode.getData() < data){
                    lastCurrentNode = currentNode ;
                    currentNode = currentNode.getNext() ;
                }
                else break ;
            }
            newNode.setNext(currentNode);
        }
        if (lastCurrentNode != null)
            lastCurrentNode.setNext(newNode);        
        else
            head = newNode ;
    }
        
    public void remove (int data){
        Node current = head ;
        Node lastCurrent = null ;
        while (current != null && current.getData() != data){
            lastCurrent = current ;
            current = current.getNext() ;
        }
        if (current != null && lastCurrent != null){
            lastCurrent.setNext(current.getNext());
        }
        else if (current != null){
            head = head.getNext() ;
        }
        else 
            System.out.printf("%d not found%n",data);
    }
    

    public boolean find(int data){
        Node iterator = head ;
        while (iterator != null){
            if (iterator.getData() == data){
                return true ;
            }
            iterator = iterator.getNext() ;
        }
        return false ;
    }
    
    
    public void displayList(){
        Node iterator = head ;
        while (iterator != null){
            System.out.printf("%d",iterator.getData());
            iterator = iterator.getNext() ;
            if (iterator != null)
                System.out.printf(" -> ");
        }
        System.out.println("");
    }
    
}