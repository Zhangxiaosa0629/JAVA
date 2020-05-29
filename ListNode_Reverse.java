class LNode{
    public LNode next;
    public int data;
}

public class ListNode_Reverse {
    public static void Reverse(LNode head){
        if (head==null || head.next==null)
            return;
        LNode cur=null;
        LNode next=null;
        cur=head.next.next;
        head.next.next=null;
        while (cur != null){
            next=cur.next;
            cur.next=head.next;
            head.next=cur;
            cur=next;
        }
    }

    public static void main(String [] args){
        LNode head=new LNode();
        LNode cur=head;
        for (int i=1;i<8;i++){
            LNode tmp=new LNode();
            tmp.data=i;
            tmp.next=null;
            cur.next=tmp;
            cur=tmp;
        }
        System.out.print("逆序前：");
        for (cur=head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data+" ");
        }
        Reverse(head);
        System.out.print("\n逆序后：");
        for (cur=head.next;cur!=null;cur=cur.next){
            System.out.print(cur.data+" ");
        }
    }
}
