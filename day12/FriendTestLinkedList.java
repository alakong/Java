package day12;

import day8.Friend;
import java.util.*;

public class FriendTestLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Friend> list = new LinkedList<Friend>();
		list.add(new Friend("qwe", "99090954", "bbamabamabi@"));
		list.add(new Friend("ads", "12345633", "sfdfsg@"));
		list.add(new Friend("bas", "15643981", "fgergaeger@"));
		list.add(new Friend("cqe", "63636357", "fgfga@"));
		list.add(new Friend("djy", "15414631", "gnnh@"));

		
		System.out.println("�̸�"+"      "+"��ȭ��ȣ"+"        "+"�����ּ�"+"      ");
		System.out.println("---------------------------------------");
		
		Iterator<Friend> iter = list.iterator();
		while (iter.hasNext()) {
			Friend s = iter.next();
			System.out.println(s.getInfo());
			
			//System.out.println(iter.next().getInfo());�ص� ����!! �ѹ� ȣ���̴ϱ� �ٷ� �ֱ�
			

		}

	}
}