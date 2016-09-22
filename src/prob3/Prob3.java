package prob3;

public class Prob3 {

	public static void main(String[] args) {
		String str = "모든 프로그램은 Java 언어로 개발 될 수 있습니다.";
	
		if(str.indexOf("Java") != -1){
		System.out.println("자바 문자열이 포함되어 있습니다.");
		}
		System.out.println("->" + str.replaceAll("자바", "Java"));

		/* 코드를 작성합니다 */

	}
}

/*다음 문자열에서 “자바”문자열이 포함되어 있는지 확인하고 
“자바”를 Java로 대치한 새로운 문자열로 만들어 보세요. 
[실행결과]
자바 문자열이 포함되어 있습니다.
->모든 프로그램은 Java 언어로 개발 될 수 있습니다.
*/