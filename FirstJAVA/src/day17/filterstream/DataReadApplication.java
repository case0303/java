package day17.filterstream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

import util.Closer;

public class DataReadApplication {

	public static void main(String[] args) {
		File file = new File("/Users/eongdeong-ihaejeogdan/Desktop/Develop/Java/FirstJAVA/custom.txt");
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			String name = null;
			name=dis.readUTF();
			while(name != null) {
				System.out.print(name+", ");  //이름
				System.out.print(dis.readChar()+", ");  //성별
				System.out.print(dis.readUTF()+", ");   //이메일
				System.out.print(dis.readInt()+"\n");   //나이
				name=dis.readUTF();  //null 값을 가질 경우 예외가 발생함.
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			if(dis!=null) Closer.close(dis);
			if(fis!=null) Closer.close(fis);
		}

	}

}