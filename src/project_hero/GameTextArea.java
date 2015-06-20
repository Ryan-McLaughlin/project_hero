package project_hero;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class GameTextArea extends JPanel {

	static JTextArea textArea;
	final static String newline = "\n";

	public static void addText(String string) {
		textArea.append(string + "\n");
	}

	public GameTextArea(int x, int y) {
		setPreferredSize(new Dimension(x, y));

		textArea = new JTextArea();
		textArea.setEditable(false);

		add(textArea, BorderLayout.CENTER);
	}

}
