import java.util.Stack;
import java.util.LinkedList;

public class BinaryTree {
	public static void main(String[] arr) {
		Node node1 = new Node();
		Node node2 = new Node();
		Node node3 = new Node();
		Node node4 = new Node();

		node1.setValue(4);
		node2.setValue(2);
		node3.setValue(1);
		node4.setValue(5);

		node1.setLeft(node2);
		node1.setRight(node4);

		node2.setLeft(node3);

		DFS(node1);
		BFS(node1);
	}

	public static void DFS(Node node) {
		Stack<Node> stack = new Stack();
		stack.push(node);

		while (!stack.empty()) {
			Node current = stack.pop();
			System.out.print(current.getValue() + " ");
			Node next[] = { current.getRight(), current.getLeft() };

			for (Node n : next) {
				if (n != null) {
					stack.push(n);
				}
			}
		}

		System.out.println();
	}

	public static void BFS(Node node) {
		LinkedList<Node> queue = new LinkedList();
		queue.add(node);

		while (!queue.isEmpty()) {
			Node current = queue.poll();
			System.out.print(current.getValue() + " ");
			Node next[] = { current.getLeft(), current.getRight() };

			for (Node n : next) {
				if (n != null) {
					queue.add(n);
				}
			}
		}

		System.out.println();
	}
}
