package day14.collection;

import java.util.TreeSet;

public class TreeSetEx {
	
	
	/*
	 * 트리구조(tree, 나무구조)
		- 그래프의 일종
		- 여러 노드가 한 노드를 가리킬 수 없는 구조
		- 간단하게 회로가 없고 서로 다른 두 노드를 잇는 길이 하나뿐인 그래프를 트리구조라고 함
		- 트리에는 최상위 노드를 루트 노드(root node 뿌리 노드)
		- 노드 A가 노드 B를 가리킬 때 A를 B의 부모 노드(Parent node),B를 A의 자식 노드(child node)
		- 자식노드가 없는 노드를 잎 노드 (leaf node 리프노드)
		- 잎 노드가 아닌 노드를 내부 노드(internal node)
	 */
	

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>();
		ts.add("hello"); 
		ts.add("java"); 
		ts.add("aaa"); 
		ts.add("computer");
		ts.add("monitor");
		ts.add("get");
		
	
		
		for(String str : ts) {
			System.out.print(str+"\t");
		}
		
		
	}

}
