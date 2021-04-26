public class LinkedList {
    Element head = null;

    public boolean isEmpty() {
        return head==null;
    }

    public int  getListSize() {
        Element currElement = head;
        int total = 0;
        // Traverse through the LinkedList
        while (currElement != null) {
            // Print the data at current node
            // System.out.print(currElement.data + " ");

            // Go to next node
            currElement = currElement.next;
            total ++;
        }

        System.out.println(total);
        return total;
    }

    public void addElement(int new_element) {
        // insert the data
        Element new_node = new Element(new_element);
        new_node.next = head;
        head = new_node;
    }

    Element removeElement() {
        Element temp = head;
        head = temp.next;
        return temp;
    }

    public static void main(String args[]) {
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addElement(50);
        myLinkedList.addElement(100);

        // check List length
        myLinkedList.getListSize();
        // remove first element
        myLinkedList.removeElement();
        // check List length again
        myLinkedList.getListSize();
    }
}