/***
 * 
 * 判断两个单链表是否相交及找到第一个交点
 *
 */
public class Node1 {

}

class Node {
	public String name;
	public Node next;
}

class NodeUtil {
	Node findNode(Node header1, Node header2) {
		if (head1 == NULL || head2 == NULL) {
			return NULL;
		}
		Node p1, p2;
		p1 = head1;
		p2 = head2;
		int len1 = 0;
		int len2 = 0;
		int diff = 0;
		while (p1.next != NULL) {
			p1 = p1.next;
			len1++;
		}
		while (p2.next != NULL) {
			p2 = p2.next;
			len2++;
		}
		if (p1 != p2) {
			return NULL;
		}
		diff = abs(len1 - len2);
		if (len1 > len2) {
			p1 = head1;
			p2 = head2;
		} else {
			p1 = head2;
			p2 = head1;
		}
		for (int i = 0; i < diff; i++) {
			p1 = p1.next;
		}
		while (p1 != p2) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p1;
	}
}
