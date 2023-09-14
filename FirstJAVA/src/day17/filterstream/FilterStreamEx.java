package day17.filterstream;


import java.io.*;



public class FilterStreamEx {

	public static void main(String[] args) {
		
		FileReader input = null;
		FileWriter output = null;
		BufferedReader bufInput = null;
		BufferedWriter bufOutput = null;
		
		try {
			
			String inFile = "/Users/eongdeong-ihaejeogdan/Desktop/Develop/Java/FirstJAVA/test.txt";
			String outFile = "/Users/eongdeong-ihaejeogdan/Desktop/Develop/Java/FirstJAVA/test_out.txt";
			
			//필터 스트림은 대상이 노드 스트림을 대상
			input = new FileReader(inFile);
			output = new FileWriter(outFile);
			//필터 스트림..
			bufInput = new BufferedReader(input);
			bufOutput = new BufferedWriter(output);
			
			String line;
			line = bufInput.readLine();//문자열의 "\n"을 만날때 까지 입력
			System.out.println(line);
			while(line != null) {
				bufOutput.write(line, 0, line.length());
				bufOutput.newLine();//줄바꿈 "\n" 을 입력한 것과 같음
				line = bufInput.readLine();
				
			}
			System.out.println(inFile+ ">>"+outFile);
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(bufInput != null) {
					try {
						bufInput.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
				if(bufOutput != null) {
					try {
						bufOutput.close();
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}

}
