package day11.innerclass;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class InnerLocal {
	private Frame f;
	public InnerLocal() {
		f = new Frame("Inner Local Class");
	}
	public void launchFrame() {
		// inner Local Class : 완전한 클래스 형태이기 때문에. 클래스와 같은 기능을 함.
		//  로컬 이너 클래스는 외부에 있는 모든 멤버에 대해서 참조 가능함.
		// 다만 지역 변수를 참조할 때는 지역 변수가 Final로 선언되어야 합니다.
		;
		final String btn = "X 버튼";
		class MyWindowAdapter extends WindowAdapter{
			@Override
			public void windowClosing(WindowEvent e) {
				System.out.println("X 버튼 클릭");
				System.exit(0);
			}
		}
		f.addWindowListener(new MyWindowAdapter());
		f.setSize(300, 300);
		f.setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerLocal il = new InnerLocal();
		il.launchFrame();
	}

}
