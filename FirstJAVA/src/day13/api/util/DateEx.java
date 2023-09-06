package day13.api.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		
		Date date = new Date();//유틸임
		
		System.out.println(date.toString());
		//특정 문자열 포멧으로 얻어내고 싶은 경우
		//SimpleDateFormat을 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 ");
		// hh -12시간 HH - 24시간
		String time = sdf.format(date);
		System.out.println(time);
		
		sdf = new SimpleDateFormat("yy-MM-dd a hh:mm:ss");
		System.out.println(sdf.format(date));
		
		
		sdf = new SimpleDateFormat("오늘은 E요일입니다. 오늘은 1년중 D번째 날입니다.");
		System.out.println(sdf.format(date));
		
	}

}
