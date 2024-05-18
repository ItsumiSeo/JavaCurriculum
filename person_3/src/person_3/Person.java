package person_3;

class Person {
	public static int count = 0;
	public String firstName;
	//問1インスタンスフィールドに「lastName」を追加
	public String lastName;
	public int age;
	public double height, weight;

	Person(String firstName, int age, double height, double weight) {
		Person.count++;
		this.firstName = firstName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	//問2lastNameの値を引数で受け取るコンストラクタを追加で定義
	Person(String firstName, String lastName, int age, double height, double weighr) {
		//問3作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセット
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;

	}

	public String fullName() {
		return this.firstName + this.lastName;
	}

	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public static void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}