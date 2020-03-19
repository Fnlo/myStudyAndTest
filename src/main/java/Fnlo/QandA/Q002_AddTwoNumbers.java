package Fnlo.QandA;

/**
 * @author Fnlo
 *
 *给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。

如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。

您可以假设除了数字 0 之外，这两个数都不会以 0 开头。

示例：

输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
输出：7 -> 0 -> 8
原因：342 + 465 = 807

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/add-two-numbers
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q002_AddTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode x1 = new ListNode(1);
		
		ListNode x2_1 = new ListNode(9);
		ListNode x2_2 = new ListNode(9);
		x2_1.next = x2_2;
		
		
		ListNode x = new Q002_AddTwoNumbers().addTwoNumbers(x1, x2_1);
		System.out.println(x);
	}
	public static class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	}
	/**
	 * @param l1
	 * @param l2
	 * @return l1 + l2
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        int nodeSum = l1.val + l2.val;
        ListNode res = new ListNode(nodeSum % 10);
        if(nodeSum / 10 > 0){
            ListNode carryNode = new ListNode(nodeSum / 10);
            res.next = carryNode;
        }
        ListNode l1Next = l1.next;
        ListNode l2Next = l2.next;
        if(l1Next == null && l2Next == null){
            return res;
        }
        
        ListNode nextNode = addTwoNumbers(l1Next != null ? l1Next : new ListNode(0), l2Next != null ? l2Next : new ListNode(0));
        if(res.next != null){
        	nextNode = addTwoNumbers(nextNode, res.next);
        }
        res.next = nextNode;
        return res;
    }
	
	/**
	 * @param l1
	 * @param l2
	 * @return l1 * l2
	 */
	public ListNode productTwoNumbers(ListNode l1, ListNode l2) {
        
        int nodeSum = l1.val * l2.val;
        ListNode res = new ListNode(nodeSum % 10);
        if(nodeSum / 10 > 0){
            ListNode carryNode = new ListNode(nodeSum / 10);
            res.next = carryNode;
        }
        ListNode l1Next = l1.next;
        ListNode l2Next = l2.next;
        if(l1Next == null && l2Next == null){
            return res;
        }
        
        ListNode nextNode = addTwoNumbers(l1Next != null ? l1Next : new ListNode(1), l2Next != null ? l2Next : new ListNode(1));
        if(res.next != null){
        	nextNode = addTwoNumbers(nextNode, res.next);
        }
        res.next = nextNode;
        return res;
    }

}
