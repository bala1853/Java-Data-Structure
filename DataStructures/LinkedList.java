package LinkedListExample;
public class LinkedList{
    Node head;
    class Node{
        int data;
        Node next;
        Node(int val){
            data = val;
            next = null;
        }
    }
    LinkedList(){
        head = null;
    }
    public void InsertAtBeginning(int val){
        Node newNode = new Node(val);
        if(head == null){ //if head is null
            head = newNode;
        }
        else{ //if head already contains the value
            newNode.next = head;
            head = newNode;

        }
    }
    public void InsertAtEnd(int val){
        Node newNode = new Node(val);
        int size = 0;
        Node temp = head;
        Node temp1 = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        for(int i =0;i<size-1;i++){
            temp1 = temp1.next;
        }
        temp1.next = newNode;
    }
    public void InsertAtPostion(int pos, int val){
        if(pos == 0){
            InsertAtBeginning(val);
            return;
        }
         Node newNode = new Node(val);
         Node temp = head;
         for(int i =0;i<pos-1;i++){ 
            temp = temp.next;
            if(temp == null){
                System.out.println("Invalid Position");
                return;                
            }
         }
         newNode.next =temp.next;
         temp.next = newNode;
    }
    public void DeleteAtFirst(){
        if(head == null){
            System.out.println("List is empty");
        }
        else{
            head = head.next;
        }
        
    }
    public void DeleteAtPosition(int pos){
        if(head == null){
            System.out.println("List is empty");
        }
        else if(pos == 0){
            DeleteAtFirst();
            return;
        }
        else{
            Node temp =head;
            Node prev = null;
            for(int i =0;i<pos;i++){
               prev = temp;
               temp = temp.next;
            }
            prev.next = temp.next;
        }
    
    }
    public void DeleteAtEnd(){
        int size = 0;
        Node temp = head;
        Node temp1 = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        for(int i =0;i<size-2;i++){
            temp1 = temp1.next;
        }
        temp1.next = null;
        return;
        
    }
    public void update(int pos, int val){
        Node temp = head;
         for(int i =0;i<pos;i++){
            temp = temp.next;
        }
        temp.data = val;
    }
    public void display(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.InsertAtBeginning(1);
        list.InsertAtPostion(1,2);
        list.InsertAtEnd(3);
        list.DeleteAtEnd();
        list.DeleteAtFirst();
        list.update(0, 10);
        list.DeleteAtPosition(0);
        list.display();
    }

}