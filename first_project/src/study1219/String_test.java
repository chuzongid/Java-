package study1219;

public class String_test {

	public static void main(String[] args) {
		String song = "나는 바나나 알러지 원숭이 그래도 나는 바나나 좋아해";
		
		// 1. 원본은 유지하고 바나나를 오렌지로 변경하여 출력하세요
		// 2. 과일 알러지 있는 원숭이 , 어떤 과일에 알러지 있는지 출력하세요.
		//	(알러지 문자열 앞의 과일 이름만 추출)
		// 3. song 문자열 앞에 "상상만 해도 웃음이 나요" 합쳐서 
		String change = song.replaceAll("바나나", "오렌지");
		System.out.println(change);
		
		change = song.split("알러지")[0].split(" ")[1];
		System.out.println(change);
		
		String lyric = "상상만 해도 웃음이 나요 ";
		System.out.println(lyric.concat(song));
		
		

		
		

	}

}
