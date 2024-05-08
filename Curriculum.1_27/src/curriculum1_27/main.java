package curriculum1_27;

import java.util.HashMap;
import java.util.Map;

public class main {
	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		map.put("ライオン", "パンテラ レオ");
		map.put("ゾウ", "ロキソドンタ・サイクロティス");
		map.put("パンダ", "アイルロポダ・メラノレウカ");
		map.put("チンパンジー", "パン・トゥログロディテス");
		map.put("シマウマ", "チャップマンシマウマ");
		
		System.out.println("コンソールに文字を入力してください");
		//入力された文字を受け取る
		String scan = new java.util.Scanner(System.in).nextLine();
		
		//受け取った文字列を「,」で分割し、配列animalsに格納
		String[] animals = scan.split(",");
		for(int i = 0; i < animals.length; i++) {
			//配列animalsを「:」でさらに分割し、配列cに格納
			String[] c = animals[i].split(":");
			
			System.out.printf("\r\n\r\n動物名:%s\r\n体長:%.1fm\r\n速度:%dkm/h\r\n学名:%s" , c[0],Double.parseDouble(c[1]),Integer.parseInt(c[2]),map.getOrDefault(c[0],"不明"));
		}
	}
}