package day17.filterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;

public class TextReadApplication {

	public static void main(String[] args) {
		File f = new File("/Users/eongdeong-ihaejeogdan/Desktop/Develop/Java/FirstJAVA/custom.txt");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String data = null;
			while((data=br.readLine())!=null) {
				String[] member = data.split(",");
				int age = Integer.parseInt(member[3]);
				if(age >= 20) {
					System.out.println(data);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(br!=null) try {br.close();} catch (Exception e2) {}
			if(fr!=null) try {fr.close();} catch (Exception e2) {}
		}
		

	}

}
