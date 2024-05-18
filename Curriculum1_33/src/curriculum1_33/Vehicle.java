package curriculum1_33;

//問1Vehicleクラスを作成。
public class Vehicle {

	//String型のprivateなインスタンスフィールド「owner」を定義
	private String owner;

	//問3Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義
	//ゲッターの定義
	public String getOwner() {
		return owner;
	}
	//セッターの定義
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
