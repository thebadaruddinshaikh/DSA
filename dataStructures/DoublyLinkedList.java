package com.dsa.dataStructures;

public class DoublyLinkedList{

    public DNode head;
    public DNode tail;
    public void  insert(int val){
        DNode node = new DNode(val);
        tail.next = node;
        node.prev = tail;
        tail = node;
    }
    public boolean remove(int val){
        DNode node = find(val);
        if(node == null)
            return false;

        node.prev.next = node.next;
        node.next.prev = node.prev;
        return true;
    }

    public DNode find(int val){
        DNode trav = head;
        while(trav != null){
            if(trav.val == val)
                return trav;
            trav = trav.next;
        }
        return null;
    }
    public void print(){
        DNode trav = this.head;
        while(trav!=null){
            System.out.print(trav.val+" ");
            trav = trav.next;
        }

        System.out.println();
    }

    public DoublyLinkedList(int val){
        this.head = new DNode(val);
        this.tail = this.head;
    }


    public static void main(String[] args){
        DoublyLinkedList db = new DoublyLinkedList(0);
        db.print();
        db.insert(1);
        db.print();
        db.insert(4);
        db.print();
        db.find(1);
        db.remove(1);
        db.print();
        db.remove(5);
        db.print();
    }
}


class DNode{
    public int val;
    public DNode next;
    public DNode prev;

    public DNode(int val){
        this.val = val;
    }
}

