package com.company;

public class List {
    private Node head;
    public List(){
        this.head = null;
    }

    public List(Node head){
        this.head = head;
    }

    public void printList() {
        Node nodeTmp = this.head;
        while (nodeTmp != null) {
            System.out.println(nodeTmp.getValue());
            nodeTmp = nodeTmp.getNextNode();
        }
    }

            public void push(int value){
                Node nodeTmp = this.head;
                while (nodeTmp.getNextNode() != null){
                    nodeTmp = nodeTmp.getNextNode();

                }
                nodeTmp.setNextNode(new Node(value));
            }

            public void push(int value, int index) {
                Node nodeTmp = this.head;
                for (int i = 0; i < index - 1 && nodeTmp.getNextNode() != null; i++) {
                    nodeTmp = nodeTmp.getNextNode();
                }
                Node newNode = new Node(value, nodeTmp.getNextNode());
                nodeTmp.setNextNode(newNode);
            }

                public void pushHead(int value){
                    Node node = new Node(value,this.head );
                    this.head = node;

                }
            }
            



