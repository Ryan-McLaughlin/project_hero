package project_hero;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameWindow extends JPanel {

	// class fields
	protected static GameImageArea gameImage;
	protected static GameTextArea gameText;
	protected static Hero hero;
	protected static Enemy enemy;
	protected static GameInputArea gameIn;

	protected static boolean fight;

	public static void initializeComponents() {
		gameImage = new GameImageArea(300, 200);
		gameText = new GameTextArea(125, 100);
		hero = new Hero(125, 100);
		enemy = new Enemy(125, 100);
		gameIn = new GameInputArea(200, 100);

		fight = true;
	}

	public static void addComponentsToPane(Container pane) {
		JPanel north = new JPanel();
		north.setLayout(new BorderLayout());

		JPanel south = new JPanel();
		south.setLayout(new BorderLayout());

		north.add(gameImage, BorderLayout.NORTH);
		north.add(hero, BorderLayout.WEST);
		north.add(enemy, BorderLayout.EAST);

		south.add(gameText, BorderLayout.NORTH);
		south.add(gameIn, BorderLayout.SOUTH);

		pane.add(north, BorderLayout.NORTH);
		pane.add(south, BorderLayout.SOUTH);

		fight = true;
	}

	private static void createAndShowGUI() {
		JFrame frame = new JFrame("project_hero");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// initialize components
		initializeComponents();

		// set up the content pane
		addComponentsToPane(frame.getContentPane());

		// display the window
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		// Schedule a job for the event-dispatching thread:
		// creating and showing this application's GUI
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});

	}
}
