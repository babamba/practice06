package prob1;

public class Prob1 {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData2 = 150;
		
		int intData1 = 0;
		intData1 = Integer.parseInt(strData1);		// String => Integer
		
		String strData2 = null;
		strData2 = String.valueOf(intData2);		// Integer => String
		
		
		
		System.out.println( "결과:" + intData1 + "," + strData2 );
	}
}
/* 코드를 완성합니다. 
다음의 실행 결과처럼 출력되도록 문자열 “200”을 정수로 변환하는 코드와 
숫자 150을 문자열로 변환하는 코드를 작성해 보세요*/
//결과: 200, 150