import java.util.HashSet;
import java.util.Set;

public class HashCycle {
    public static void main(String[] args) {
        SinglyLinkedListNode n3 = new SinglyLinkedListNode(3, null);
        SinglyLinkedListNode n2 = new SinglyLinkedListNode(2, n3);
        SinglyLinkedListNode n1 = new SinglyLinkedListNode(1, n2);
        SinglyLinkedListNode n0 = new SinglyLinkedListNode(0, n1);

        System.out.println("First has cycle is " + hasCycle(n0));

        // Introduce cycle
        n2.next = n1;

        System.out.println("Second has cycle is " + hasCycle(n0));

    }

    private static boolean hasCycle(SinglyLinkedListNode head){
        if(head == null) return false;
        else {
            final Set<SinglyLinkedListNode> nodeSet = new HashSet<>();
            SinglyLinkedListNode currentNode = head;
            nodeSet.add(currentNode);
            while(currentNode.next != null){
                currentNode = currentNode.next;
                if(nodeSet.contains(currentNode)) return true;
                else nodeSet.add(currentNode);
            }
            return false;
        }
    }

    private static class SinglyLinkedListNode{
        int data;
        SinglyLinkedListNode next;

        public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
            this.data = data;
            this.next = next;
        }
    }
}
