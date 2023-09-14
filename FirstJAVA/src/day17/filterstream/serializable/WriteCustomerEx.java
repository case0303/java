package day17.filterstream.serializable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import util.Closer;

public class WriteCustomerEx {

	public static void main(String[] args) {
		Customer cust1 = new Customer("홍길동", 'M', "abc1@abc.com", 30);
		Customer cust2 = new Customer("홍길동2", 'F', "abc2@abc.com", 20);
		
		File file = new File("/Users/eongdeong-ihaejeogdan/Desktop/Develop/Java/FirstJAVA/customer.ser");
		//객체 선언
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			//객체 생성
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(cust1);
			oos.writeObject(cust1); // 왜 2번임?
			
			ArrayList<Customer> list = new ArrayList<>();
			list.add(cust1);
			list.add(cust2);
			oos.writeObject(list);
			
			
			System.out.println("정상 저장");
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			if(oos!=null) Closer.close(oos);
			if(fos!=null) Closer.close(oos);
		}

	}

}
