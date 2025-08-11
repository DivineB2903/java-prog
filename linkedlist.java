import java.util.Scanner;

public class linkedlist {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedListcode {
        Node head;

        void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }

        void delete(int key) {
            if (head == null) return;

            if (head.data == key) {
                head = head.next;
                return;
            }

            Node temp = head;
            while (temp.next != null && temp.next.data != key) {
                temp = temp.next;
            }

            if (temp.next != null) {
                temp.next = temp.next.next;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        linkedlist obj = new linkedlist(); 
        LinkedListcode list = obj.new LinkedListcode(); 

        while (true) {
        
            System.out.println("\n1. Insert\n2. Delete\n3. Display\n4. Exit \n Enter your choice : ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Enter value: ");
                int value = sc.nextInt();
                list.insert(value);
            } else if (choice == 2) {
                System.out.print("Enter value to delete: ");
                int value = sc.nextInt();
                list.delete(value);
            } else if (choice == 3) {
                list.display();
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
