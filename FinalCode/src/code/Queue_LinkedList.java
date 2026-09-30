package code;

public class Queue_LinkedList {

    Node head;
    Node tail;

    void enqueue(Member member) {

        Node n = new Node(member);

        if (isEmpty()) {

            head = tail = n;
        }
        else {

            tail.next = n;
            tail = n;
        }
    }


    boolean isEmpty() {

        if (head == null && tail == null)
            return true;

        return false;
    }


    void dequeue() {

        if (isEmpty()) {

            throw new IllegalAccessError("Queue is empty");
        }
        else if (head == tail) {

            head = tail = null;
        }
        else {

            Node temp = head;

            head = head.next;

            temp.next = null;
        }
    }


    Member[] getMembers() {

        int size = 0;

        Node i = head;

        while (i != null) {

            size++;

            i = i.next;
        }

        Member[] members = new Member[size];

        i = head;

        int index = 0;

        while (i != null) {

            members[index] = i.data;

            index++;

            i = i.next;
        }

        return members;
    }
}