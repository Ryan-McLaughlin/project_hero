package project_hero;

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
	protected static GameInputArea gameIn;

	public static void initializeComponents() {
		gameImage = new GameImageArea(200, 100);
		gameText = new GameTextArea(100, 50);
		hero = new Hero(100, 100);
		gameIn = new GameInputArea(200, 75);
	}

	public static void addComponentsToPane(Container pane) {
		pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

		pane.add(gameImage);
		pane.add(hero);
		pane.add(gameText);		
		pane.add(gameIn);
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
