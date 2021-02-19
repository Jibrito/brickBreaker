package winterGame;

import javax.swing.JFrame;

public class Main_brickBreaker {

	public static void main(String[] args) {
		JFrame obj = new JFrame(); //Frame for the outside of the game
		Gameplay gamePlay = new Gameplay(); //object for game
        obj.setBounds(10, 10, 800, 600);
        obj.setTitle("Brick Breaker(Jibril's Version)");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
	}

}
