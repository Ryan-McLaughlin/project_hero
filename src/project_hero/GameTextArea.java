package project_hero;

import java.awt.Dimension;
import java.awt.GridBagConstraints;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import static javax.swing.ScrollPaneConstants.*;

@SuppressWarnings("serial")
public class GameTextArea extends JPanel {

	static JTextArea textArea;
	final static String newline = "\n";

	public static void addText(String string) {
		textArea.append(string + "\n");
	}

	public GameTextArea(int x, int y) {
		setPreferredSize(new Dimension(x, y));

		textArea = new JTextArea(5, 20);
		textArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(textArea);

		scrollPane.setHorizontalScrollBarPolicy(HORIZONTAL_SCROLLBAR_NEVER);

		GridBagConstraints c = new GridBagConstraints();
		c.gridwidth = GridBagConstraints.REMAINDER;

		// c.fill = GridBagConstraints.HORIZONTAL;

		c.weightx = 1.0;
		c.weighty = 1.0;
		add(scrollPane, c);

		// add(textArea, BorderLayout.CENTER);
	}

}
