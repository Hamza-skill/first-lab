
package listusinglinkedmemory;

/**
 *
 * @author M. Ishtiaq
 */
// Un-ordered link list

public class LinkList {
    public Node head ;

    public LinkList() {    
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
    
    public void addAtLast(int data){
        if (head == null){
            head = new Node(data) ;
            return ;
        }
        Node iterator = head ;
        while(iterator.getNext() != null)
            iterator = iterator.getNext() ;
        iterator.setNext(new Node(data)) ;
    }
    
    public void addMiddle (int data)
    {
         Node current = head ;
         Node lastCurrent = null ; 
       
          while (current != null && current.getData() != data)
          {
              lastCurrent = current;
              head = current.getNext();
          }
    }
    //public void 
    
    public void addAtFirstLocation(int data){
        Node newNode = new Node(data) ;
        newNode.setNext(head);
        head = newNode ;
    }
    
    public void displayList(){
        Node iterator = head ;
        //int i = 0 ;
        while (iterator != null){
            //System.out.printf("|%d:%d|",++i,iterator.getData());
            System.out.printf("|%d|",iterator.getData());
            iterator = iterator.getNext() ;
            if (iterator != null)
                System.out.printf(" -> ");
        }
        System.out.println("");
    }
}
