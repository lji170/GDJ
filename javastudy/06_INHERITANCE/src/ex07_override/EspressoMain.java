package ex07_override;

public class EspressoMain {

	public static void main(String[] args) {
		
		Expresso erpresso = new Expresso();
		erpresso.taste();
		
		Americano americano = new Americano();
		americano.taste();
		
		CafeLatte cafeLatte = new CafeLatte();
		cafeLatte.taste();

	}

}
