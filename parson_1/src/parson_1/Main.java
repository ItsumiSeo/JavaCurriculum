package parson_1;

class Main {
	  public static void main(String[] args) {
		
		//インスタンス生成。weightの60も引数に追加
	    Person person1 = new Person("鈴木太郎", 20, 1.7,60);
	   
	    System.out.println(person1.name);
	    System.out.println(person1.age);
	    System.out.println(person1.height);
	    
	  }
	  
}
