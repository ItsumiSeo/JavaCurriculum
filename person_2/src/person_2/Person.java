package person_2;

class Person {
	// クラスフィールドを定義
	public static int count = 0;

	// インスタンスフィールドを定義
	public String firstName;
	public String lastName;
	public int age;
	public double height;
	public double weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String firstName, int age, double height, double weight) {
		Person.count++;

		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// コンストラクタのオーバーロード
	Person(String firstName, String lastName, int age, double height, double weight) {
		Person.count++;

		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// インスタンスメソッドfullNameを定義
	public String fullName() {
		return this.firstName + this.lastName;
	}

	//インスタンスメソッドbmiを定義
	public double bmi() {
		return this.weight / this.height / this.height;

	}

	//インスタンスメソッドprintを定義
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}

}