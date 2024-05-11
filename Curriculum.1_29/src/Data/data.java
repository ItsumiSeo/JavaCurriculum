package Data;

public class data implements Comparable<data> {

	private static int seq = 0;
	private int no;
	private String 都道府県名;
	private String 県庁所在地;
	private double 面積;

	public data(String 都道府県名, String 県庁所在地, double 面積) {
	no = seq++;
	this.都道府県名 = 都道府県名;
	this.県庁所在地 = 県庁所在地;
	this.面積 = 面積;
	}

	public int getNo() {
	return no;
	}

	@Override
	public String toString() {
	return String.format("都道府県名：%s%n県庁所在地：%s%n面積：%.1fkm2%n", 都道府県名, 県庁所在地, 面積);
	}
	
	@Override
	public int compareTo(data o) {
	return this.getNo() - o.getNo();
	}
	
}