
// ------------------------ GFG POTD Add 1 to a Linked List Number ----------------------

class DAY9 {
    public Node addOne(Node head) {
        // Reverse the linked list
        head = reverse(head);
        
        // Add one to the reversed list
        Node temp = head;
        int carry = 1;
        Node prev = null;
        
        while (temp != null) {
            int sum = temp.data + carry;
            carry = sum / 10;
            temp.data = sum % 10;
            prev = temp;
            temp = temp.next;
        }
        
        // If there is a carry left, add a new node at the end
        if (carry > 0) {
            prev.next = new Node(carry);
        }
        
        // Reverse the list again to restore the original order
        head = reverse(head);
        
        return head;
    }
    
    // Helper function to reverse the linked list
    private Node reverse(Node head) {
        Node prev = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
}
