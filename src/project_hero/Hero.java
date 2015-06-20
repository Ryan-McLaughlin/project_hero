package project_hero;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Hero extends JPanel {

	static JTextArea textArea;
	final static String newline = "\n";

	static int health;
	static int maxHealth;
	static int physical;
	static int magic;
	static int xp;

	private static void updateHero() {
		textArea.setText("health: " + health + " / " + maxHealth + "\n");
		textArea.append("physical: " + physical + "\n");
		textArea.append("magic: " + magic);
		
		if (health == 0)
			textArea.append("\nHero is dead");
	}

	public static void addHealth(int hpMod) {
		health += hpMod;
		if (health < 1)
			health = 0;
		if (health > maxHealth)
			health = maxHealth;
		
		updateHero();
	}

	public Hero(int x, int y) {
		setPreferredSize(new Dimension(x, y));

		textArea = new JTextArea(3, 2);
		textArea.setEditable(false);

		maxHealth = 10;
		health = 10;
		physical = 5;
		magic = 5;

		updateHero();
		add(textArea, BorderLayout.WEST);
	}

}
