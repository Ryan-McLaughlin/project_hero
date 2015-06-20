package project_hero;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameInputArea extends JPanel implements ActionListener {

	protected JButton b_01;
	protected JButton b_02;
	protected JButton b_03;
	protected JButton b_04;
	protected JButton b_05;

	public GameInputArea(int x, int y) {
		setPreferredSize(new Dimension(x, y));

		b_01 = new JButton("for text");
		b_01.setActionCommand("b_01");
		b_01.addActionListener(this);

		b_02 = new JButton("black");
		b_02.setActionCommand("b_02");
		b_02.addActionListener(this);

		b_03 = new JButton("pink");
		b_03.setActionCommand("b_03");
		b_03.addActionListener(this);

		b_04 = new JButton("-");
		b_04.setActionCommand("b_04");
		b_04.addActionListener(this);

		b_05 = new JButton("+");
		b_05.setActionCommand("b_05");
		b_05.addActionListener(this);

		add(b_01, BorderLayout.CENTER);
		add(b_02, BorderLayout.CENTER);
		add(b_03, BorderLayout.CENTER);
		add(b_04, BorderLayout.CENTER);
		add(b_05, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ("b_01".equals(e.getActionCommand())) {
			// b_01.setText("for text");
			GameTextArea.addText("button is working");
		}

		if ("b_02".equals(e.getActionCommand())) {
			// b_02.setText("working");
			GameImageArea.loadImage("res/black.png");
		}

		if ("b_03".equals(e.getActionCommand())) {
			GameImageArea.loadImage("res/pink.png");
		}

		if ("b_04".equals(e.getActionCommand())) {
			Hero.addHealth(-1);
		}

		if ("b_05".equals(e.getActionCommand())) {
			Hero.addHealth(1);
		}

	}
}
