package parson_1;

class Person{
	//クラスフィールドを定義
	public static int count = 0;
	
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	//インスタンスフィールド[weight]を定義
	double weight;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age,double height,double weight){
		Person.count++;
		this.name = name;
		this.age = age;
		this.height = height;
		//コンストラクタにも[weight]の値をセット
		this.weight = weight;
	}
	
	//インスタンスメソッドbmiを定義
		public double bmi() {
			double bmi = this.weight / (this.height * this.height);
			return bmi;
		}
		
		//インスタンスメソッドprintを定義
		public void print() {
			System.out.println("名前は" + this.name + "です");
			System.out.println("年は" + this.age + "です");
			System.out.println("BMIは" + String.format("%.1f",bmi()) + "です");
		}
				
		public static void printCount() {
			System.out.println("合計" + Person.count + "人です");
		}
	
}