package curriculum1_33;

class Main {
	  public static void main(String[] args) {  
	 
	  Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
	  //person1.print();
	  Person person2 = new Person("山田", "花子", 22, 1.5, 40);
	  //person2.print();

	  //Person.printCount();
	 
	  //問4MainクラスにsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、Bicycleクラスのインスタンス「bicycle」の所有者を「person2」に設定。Personクラスのインスタンスからフルネームを取得し、ownerにセット
	  Car car = new Car();
	  Bicycle bicycle = new Bicycle();
	 
	  //ownerを設定
	  car.setOwner(person1.fullName());
	  bicycle.setOwner(person2.fullName());
	 
	  //問5ownerをコンソールに出力
	  //System.out.println(car.getOwner());
	  //System.out.println(bicycle.getOwner());

	 
	  // 乗り物を購入
	  person1.buy(car);
	  person2.buy(bicycle);
	  }

	}