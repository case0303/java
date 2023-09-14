package day18.quiz;

import java.awt.event.FocusListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManagerController {
		
	static ArrayList<Customer> cusList = new ArrayList<Customer>();
	static Scanner scan = new Scanner(System.in);
	String path = "/Users/eongdeong-ihaejeogdan/Desktop/Develop/Java/FirstJAVA/CM.txt";
		
	public static void main(String[] args) {
			
			
		while(true) {
			System.out.printf("\n[INFO] 고객 수 : %d",cusList.size());
			System.out.println("\t");
		}
			
			
			
			
			
			
			
			
			
	}
	
	
		
		
		
		
		
		public void insertCustomerData() {
			// Customer 데이터를 추가
			Customer cus = new Customer();
			System.out.println("이름을 입력 하세요.");
			cus.setName(scan.nextLine());
			System.out.println("성별을 입력 하세요.(F / M)");
			cus.setGender(scan.nextLine());
			System.out.println("이메일을 입력 하세요.");
			cus.setEmail(scan.nextLine());
			System.out.println("출생년도를 입력 하세요.");
			cus.setBirthYear(scan.nextInt());
			cusList.add(cus);
			
			
			
			
			
			
			
		}
		
		public Customer selectCustomerData() {
			return null;
		}
		
		public void printCustomerData(Customer cus) {
			
		}
		
		public void printAllCustomerData() {
			
		}
		
		
		public void updateCustomerData(Customer cus) {
			
		}
		
		
		public void deleteCustomerData(Customer cus) {
			
		}
		
		public void writeCustomerData() {
			File f = new File(path);
			FileWriter fw = null;
			BufferedWriter bw = null;
		}
		
		public void readCustomerData() {
			
		}
		
	
	
	
}
