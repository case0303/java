package day17.filterstream;


import java.io.*;

import util.Closer;

public class DataWriteApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일 객체
		File file = new File("/Users/eongdeong-ihaejeogdan/Desktop/Develop/Java/FirstJAVA/custom.txt");
		// 노드 스트림
		FileOutputStream fos = null;
		// 필터 스트림 - Data
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			// 데이터 인풋/아웃풋 스트림은 데이터를 순서대로 추가.. 불러올때도 순서대로 불러야함.
			dos.writeUTF("홍길동"); dos.writeChar('M');
			dos.writeUTF("abc1@abc.com"); dos.writeInt(30);
			dos.writeUTF("홍길남"); dos.writeChar('F');
			dos.writeUTF("abc2@abc.com"); dos.writeInt(25);
			System.out.println("file seved");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			if(dos!=null) Closer.close(dos);
			if(dos!=null) Closer.close(fos);
		}
		
	}

}
