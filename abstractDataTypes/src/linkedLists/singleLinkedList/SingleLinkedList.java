package linkedLists.singleLinkedList;

public class SingleLinkedList {

    private Node start;

    public Node getStart() {
        return start;
    }

    public SingleLinkedList() {
        this.start = null;
    }

    public void insertDataIntoList(int info) {
        insertDataAtTheEndOfList(info);
    }


    public void insertDataAtTheEndOfList(int info) {
        Node p;
        Node temp = new Node(info);
        if (this.start == null) {
            this.start = temp;
            return;
        }
        p = this.start;
        while (p.link != null) {
            p = p.link;
        }
        p.link = temp;
    }

    public void insertDataInTheBeginning(int info){
        Node temp=new Node(info);
        if(this.start==null){
            this.start=temp;
            return;
        }
        temp.link=start;
        start=temp;

    }

    public void displayElementsInTheList(Node node){
        while(node.link!=null){
            System.out.print(node.info+" ");
            node=node.link;
        }
        System.out.println(node.info);
    }

    public void sizeOfTheList(Node node){
        int length=0;
        while(node.link!=null){
            ++length;
            node=node.link;
        }
        length+=1;
        System.out.println("Number of nodes in the list: "+length);
    }

    public void searchForAnElement(Node node,int info){
        int position=0;
        while(node.link!=null){
            position+=1;
            if(node.info==info){
                break;
            }
            node=node.link;
        }

        if(node.info==info && node.link==null){
            position+=1;
        }

        if(node.link==null && node.info!=info){
            System.out.println("Element "+info+" not found in the list");
        }else{
            System.out.println("Element "+info +" found at position "+position);
        }
    }

    public void dataInLastNode(Node node){
        while(node.link!=null){
            node= node.link;
        }
        System.out.println("Data in last node is  "+node.info);
    }

    public void dataInSecondLastNode(Node node){
        while(node.link.link!=null){
            node=node.link;
        }
        System.out.println("Data in second last node is "+node.info);
    }

    public void predecessorOfAGivenData(Node node, int info){
        int predecessorData=0;
        boolean doesElementExists=false;
        while(node.link!=null){
            if(node.link.info==info){
                predecessorData=node.info;
                doesElementExists=true;
                break;
            }
            node=node.link;
        }
        if(doesElementExists){
            System.out.println("Predecessor of given element is "+predecessorData);
        }else{
            System.out.println("Entered element "+info+" doesn't exists in the list");
        }

    }

    public void elementAtGivenPosition(Node node,int position){
        int counter=1;
        int data=0;
        boolean isElementFound=false;
        while(node.link!=null){
            if(counter==position){
                data=node.info;
                isElementFound=true;
                break;
            }else{
                node=node.link;
                counter++;
            }
        }
        if(node.link==null && counter==position){
            isElementFound=true;
            data=node.info;
        }


        if(isElementFound){
            System.out.println("Element at position "+position+" is "+data);
        }else{
            System.out.println("Specified position doesn't exists in the list");
        }
    }


    public void insertANodeAtGivenPosition(Node inputnode,int position,int data){
        Node newNode=new Node(data);
        int counter=1;
        boolean isNodeInserted=false;
        Node node=inputnode;
        while(node.link!=null){
            if(position-1==0){
                newNode.link=inputnode;
                inputnode=newNode;
                isNodeInserted=true;
                break;
            }
            if(counter==position-1){
                newNode.link=node.link;
                node.link=newNode;
                isNodeInserted=true;
                break;
            }
            counter++;
            node=node.link;
        }
        if(!isNodeInserted && counter==position-1){
            insertDataAtTheEndOfList(data);
            isNodeInserted=true;
        }

        if(isNodeInserted){
            System.out.println("Node inserted at position "+ position);
            displayElementsInTheList(inputnode);
        }else{
            System.out.println("Invalid position entered");
        }

    }


}
