package new_curriculum_23;

public class new_curriculum_23 {
	private String animalName;
	private String animalWide;
	private String animalSpeed;
	
	public new_curriculum_23(String animalName,String animalWide,String animalSpeed) {
		this.animalName = animalName;
		this.animalWide = animalWide;
		this.animalSpeed = animalSpeed;
	}
	
	public String getAnimalName() {
		return animalName;
	}
	
	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}
	
	public String getAnimalWide() {
		return animalWide;
	}
	
	public void setAnimalWide(String animalWide) {
		this.animalWide = animalWide;
	}
	
	public String getAnimalSpeed() {
		return animalSpeed;
	}
	
	public void setAnimalSpeed(String animalSpeed) {
		this.animalSpeed = animalSpeed;
	}
	
	
	@Override
	public String toString() {
		return "動物名：" + animalName + "体長：" + animalWide + "速度：" + animalSpeed;
	}
	
	public static void main(String[] args) {
		new_curriculum_23 Lion = new new_curriculum_23("ライオン","2.1m" ,"80km/h");
		System.out.print(Lion);	
	}
}

