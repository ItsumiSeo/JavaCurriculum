package Data;

public class data implements Comparable<data> {

	private static int seq = 0;
	private int no;
	private String 都道府県名;
	private String 県庁所在地;
	private double 面積;

	//コンストラクタ作成
	public data(String 都道府県名, String 県庁所在地, double 面積) {
	//フィールドnoにクラス変数の値seqを代入し、値を1ずつ増加させる。
	no = seq++;
	//コンストラクタの引数として渡された都道府県名をクラスのフィールドの都道府県名に代入する。
	this.都道府県名 = 都道府県名;
	//以下二行も上の行と同様。
	this.県庁所在地 = 県庁所在地;
	this.面積 = 面積;
	}

	//noフィールドの値を返し、並び変えるための番号を取得する。
	public int getNo() {
	return no;
	}

	@Override
	//返り値がString型のtoStringメソッドを作する。
	public String toString() {
	//String.formatを使用して都道府県名・県庁所在地・面積のフィールドを文字列として返す。
	return String.format("都道府県名：%s%n県庁所在地：%s%n面積：%.1fkm2%n", 都道府県名, 県庁所在地, 面積);
	}
	
	@Override
	//data型のオブジェクトを引数にとり、整数を返すcompareToメソッドを作成する。
	public int compareTo(data o) {
	//thisとnoに引数として渡されたoを比較する。
	return this.getNo() - o.getNo();
	}
	
}