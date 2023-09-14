package day17.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import util.Closer;

public class StringInputEx {

	public static void main(String[] args) {
		//한줄씩 입력받아서 내용을 저장
		File file = new File("/Users/eongdeong-ihaejeogdan/Desktop/Develop/Java/FirstJAVA/stringline.txt");
		InputStreamReader isr = null;
		BufferedReader br = null;
		FileOutputStream fos = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		String inputString;
		System.out.println("저장할 내용을 입력후 cmd+z를 눌러주세요.");
		
		try {
			isr = new InputStreamReader(System.in); //바이트를 캐릭터로 바꿈
			br = new BufferedReader(isr);
			
			fos = new FileOutputStream(file);
			osw = new OutputStreamWriter(fos);
			bw = new BufferedWriter(osw);
			
			while((inputString = br.readLine()) != null) {
				bw.write(inputString+"\n");
				
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if(br!=null) Closer.close(br);
			if(bw!=null) Closer.close(bw);
		}
		
		
	}

}
