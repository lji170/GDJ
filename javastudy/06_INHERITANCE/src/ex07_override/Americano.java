package ex07_override;

public class Americano extends Expresso {
	
	private int extraWater;

	@Override
	public void taste() {
		// 해야 할 일을 적어 둠
		System.out.println("덜 쓰다");
	}

}
