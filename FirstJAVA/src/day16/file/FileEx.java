package day16.file;

import java.io.File;

public class FileEx {
	
	
	
		static String env_path = "/usr/local/bin:/System/Cryptexes/App/usr/bin:/usr/bin:/bin:/usr/sbin:/sbin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/local/bin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/bin:/var/run/com.apple.security.cryptexd/codex.system/bootstrap/usr/appleinternal/bin:/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home/bin:/bin";
		
		
		
		
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			File f = new File("/Users/eongdeong-ihaejeogdan/Desktop/Develop/a.txt") ;
			File dir = new File("./"); // 현재 디렉터리
			
			
			// 1. exists : 파일 혹은 디렉터리의 존재 여부 확인
			System.out.println("exists? :"+f.exists());
			System.out.println("exists? :"+dir.exists());
			
			
			// 2. isDirectory : 디렉터리인지 여부를 확인
			System.out.println("isDirectory : "+f.isDirectory());
			System.out.println("isDirectory : "+dir.isDirectory());
			
			// 3. isAbsolute : 해당 경로가 절대 경로인지 확인
			//파일이나 디렉터리를 지정할 때, 루트(최상위 경로)로부터 모든 경로 정보를 다 기술 하는 경우 절때 경로
			//  절대 경로는 어디서든 같은 값을 가짐
			//  단 절대 경로는 경로의 길이 값이 길어질 수 있어 이때문에 불편할 수 있음
			//파일이나 디렉터리를 지정할 때, 현재 작업 위치를 기준으로 경로 정보를 기술하는 경우
			//  상대 경로는 위치에 따라서 변경됨
			
			System.out.println("isAbsolute() : "+f.isAbsolute());
			System.out.println("isAbsolute() : "+dir.isAbsolute());
			
			
			//4. canExecute,canRead, canWrite : 권한 확인
			
			System.out.println("canExecute : "+f.canExecute());
			System.out.println("canRead() : "+f.canRead());
			System.out.println("canWrite() : "+f.canWrite());
			System.out.println("canExecute : "+dir.canExecute());
			System.out.println("canRead() : "+dir.canRead());
			System.out.println("canWrite() : "+dir.canWrite());
			
			//5.getAbsolutePath()
			System.out.println("./의 실제 위치(절대경로)"+dir.getAbsolutePath());
			
			//6. 부모폴더를 문자열로 반환
			System.out.println(f.getParent());
			
			//7.부모 폴더를 file 객체로 반환
			File f_parent = f.getParentFile();
			System.out.println(f_parent);
			
			
			//8. static 한것들 (File 객체의 상수)
			System.out.println(File.separator);				// "\"
			System.out.println(File.separatorChar);			// "\"
			System.out.println(File.pathSeparator);			// ";"
			System.out.println(File.pathSeparatorChar);		// ";"
			
			
			//환경변수
			String[] path = env_path.split(File.pathSeparator);
			for(String p : path) {
				System.out.println(p);
			}
			
			// 파일 생성 / 수정 / 삭제 메서드
			
			File test = new File("/Users/eongdeong-ihaejeogdan/Desktop/Develop/test/abc");
			// mkdir() : 해당 경로의 폴더를 생성
			// mkdirs() : 존재하지 않는 부모 폴더까지 모두 포함해서 폴더를 생성
			if(!test.exists()) {
				//test.mkdir();
				test.mkdirs();
			}
			// createNewFile : 파일이 없으면 새로 생성
			test = new File("/Users/eongdeong-ihaejeogdan/Desktop/Develop/test/abc/abcmart.txt");
			try {
				test.createNewFile();
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("파일 생성중 에러가 발생하면 나오는 곳");
			}
			
			
			// delete : 파일이나 폴더를 삭제한다. 폴더는 비어있지 않으면 삭제할수 없다.
			
			test = new File("/Users/eongdeong-ihaejeogdan/Desktop/Develop/test/abc");
			test.delete();
			
			//renameTo : 파일이나 폴더의 이름 및 경로를 변경합니다.
			test = new File("/Users/eongdeong-ihaejeogdan/Desktop/Develop/test");
			File dst = new File("\"/Users/eongdeong-ihaejeogdan/Desktop/Develop/test3");
			test.renameTo(dst);
			
			
	}

}
