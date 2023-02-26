
public class Interface {

	public static void main(String[] args) {
		SmartPhone lemon = new SmartPhone("Lemon");
		lemon.calculator();
		lemon.launchSpotify();
		lemon.playMusic();
		
		//Dynamic method dispatch
		Phone samsung = new SmartPhone("Samsung");//not working here
		samsung.calculator();
		
		music vivo = new SmartPhone("Vivo");
		vivo.playMusic();
		
		socialMedia oppo = new SmartPhone("Oppo");
		oppo.launchInstagram("dram_actic", "xxxxxxx0");
		oppo.faceBook("dram_actic", "xxxxxxx9");
	}

}

class Phone{
	public void call() {System.out.println("Calling....");}
	public void text() {System.out.println("messaging....");}
	public void calculator() {System.out.println("Calculating....");}
	public void phoneBook() {System.out.println("Phone Book opening....");}
}

interface music{
	void launchSpotify();
	void playMusic();
	void stopMusic();
}

interface socialMedia{
	default void faceBook(String userId, String password) {
		System.out.println("Welcome "+ userId);
	}
	void launchInstagram(String usedId, String password);
	void deletePost();
	void search(String name);
};


class SmartPhone extends Phone implements music, socialMedia{
	String brandName;
	SmartPhone(String name){this.brandName = name;}
	
	@Override
	public void text() {System.out.println("Run it....");}
	
	@Override
	public void launchInstagram(String userId, String password) {System.out.println("Instagram launched, you can feed now....");}

	@Override
	public void deletePost() {System.out.println("deleting the post...."); }

	@Override
	public void search(String name) { System.out.println("Searching"+name);}

	@Override
	public void launchSpotify() {System.out.println("Stream Music....");}

	@Override
	public void playMusic() {System.out.println("playing Dream on....");}

	@Override
	public void stopMusic() {System.out.println("stopped....");}
	
}
