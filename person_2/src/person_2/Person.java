package person_2;

class Person {
	// 問1クラスフィールドを定義
	public static int count = 0;

	// インスタンスフィールドを定義
	public String name;
	public int age;
	public double height;
	public double weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		//問2クラスフィールドcountに１足す
		Person.count++;

		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	//インスタンスメソッドbmiを定義
	public double bmi() {
		return this.weight / this.height / this.height;

	}

	//インスタンスメソッドprintを定義
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
	}

	//問4クラスメソッド「printCount」を定義
	public static void printCount() {
		//問5
		System.out.println("合計" + Person.count + "人です");
	}

}