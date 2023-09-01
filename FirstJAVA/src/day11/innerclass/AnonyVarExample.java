package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class AnonyVarExample {
	
	
	private Frame f;
	
	public AnonyVarExample() {
		f = new Frame("Title");
	}
	
	WindowAdapter handler = new WindowAdapter() {//핸들러는 인스턴스 변수
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("종료");
			System.exit(0);
		}
		
	};
	
	private void launchFrame() {
		f.addWindowListener(handler);
		f.setSize(333, 444);
		f.setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousExample ave = new AnonymousExample();
		ave.launchFrame();
	}

}
