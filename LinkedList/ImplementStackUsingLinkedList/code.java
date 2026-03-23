package LinkedList.ImplementStackUsingLinkedList;

class Node {
    Node next;
    int data;

    public Node(int data) {
        this.data = data;
    }
}

class StackImpl {
    Node stack;

    public void push(int data) {
        if (stack == null) {
            stack = new Node(data);
            return;
        }
        Node newNode = new Node(data);
        newNode.next = stack;
        stack = newNode;
    }

    public void pop() {
        if (stack == null) {
            System.out.println("The element you are trying to pop is null");
            return;
        }
        stack = stack.next;
    }

    public void display() {
        Node trav = stack;
        while (trav != null) {
            System.out.println(trav.data);
            trav = trav.next;
        }
    }
}

public class code {
    public static void main(String[] args) {
        StackImpl stack = new StackImpl();
        stack.push(5);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.push(10);
        stack.display();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push(10);
        stack.display();
    }
}
