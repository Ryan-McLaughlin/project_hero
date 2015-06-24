package project_hero;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GameInputArea extends JPanel implements ActionListener {

	protected JButton b_01;
	protected JButton b_02;
	protected JButton b_03;

	public GameInputArea(int x, int y) {
		setPreferredSize(new Dimension(x, y));

		JPanel bPanel = new JPanel();
		bPanel.setLayout(new BoxLayout(bPanel, BoxLayout.Y_AXIS));

		b_01 = new JButton("");
		b_01.addActionListener(this);

		b_02 = new JButton("");
		b_02.addActionListener(this);

		b_03 = new JButton("");
		b_03.addActionListener(this);

		updateButtons();

		bPanel.add(b_01);
		bPanel.add(b_02);
		bPanel.add(b_03);

		// add(b_01, BorderLayout.CENTER);
		// add(b_02, BorderLayout.CENTER);
		// add(b_03, BorderLayout.CENTER);
		add(bPanel, BorderLayout.WEST);
	}

	private void updateButtons() {
		// home town
		if (Hero.loc == Location.HOME_TOWN) {
			b_01.setText("shop");
			b_01.setActionCommand("shop");

			b_02.setText("wooded trail 01");
			b_02.setActionCommand("wooded_trail_01");

			b_03.setText("wooded path 01");
			b_03.setActionCommand("wooded_path_01");
		}

		// wooded trail 01
		if (Hero.loc == Location.WOODED_TRAIL_01) {
			b_01.setText("fight");
			b_01.setActionCommand("fight");

			b_02.setText("home town");
			b_02.setActionCommand("home_town");

			b_03.setText("forest shrine");
			b_03.setActionCommand("forest_shrine");
		}

		// wooded trail 02
		if (Hero.loc == Location.WOODED_TRAIL_02) {
			b_01.setText("fight");
			b_01.setActionCommand("fight");

			b_02.setText("waytown");
			b_02.setActionCommand("waytown");

			b_03.setText("waterfall");
			b_03.setActionCommand("waterfall");
		}

		// forest shrine
		if (Hero.loc == Location.FOREST_SHRINE) {
			b_01.setText("pray");
			b_01.setActionCommand("pray");

			b_02.setText("wooded trail 01");
			b_02.setActionCommand("wooded_trail_01");

			b_03.setText("animal trail 01");
			b_03.setActionCommand("animal_trail_01");
		}

		// animal trail 01
		if (Hero.loc == Location.ANIMAL_TRAIL_01) {
			b_01.setText("fight");
			b_01.setActionCommand("fight");

			b_02.setText("forest shrine");
			b_02.setActionCommand("forest_shrine");

			b_03.setText("cave");
			b_03.setActionCommand("cave");
		}

		// animal trail 02
		if (Hero.loc == Location.ANIMAL_TRAIL_02) {
			b_01.setText("fight");
			b_01.setActionCommand("fight");

			b_02.setText("cave");
			b_02.setActionCommand("cave");

			b_03.setText("waterfall");
			b_03.setActionCommand("waterfall");
		}

		// cave
		if (Hero.loc == Location.CAVE) {
			b_01.setText("fight");
			b_01.setActionCommand("fight");

			b_02.setText("animal trail 01");
			b_02.setActionCommand("animal_trail_01");

			b_03.setText("animal trail 02");
			b_03.setActionCommand("animal_trail_02");
		}

		// wooded path 01
		if (Hero.loc == Location.WOODED_PATH_01) {
			b_01.setText("fight");
			b_01.setActionCommand("fight");

			b_02.setText("home town");
			b_02.setActionCommand("home_town");

			b_03.setText("bridge");
			b_03.setActionCommand("bridge");
		}

		// wooded path 02
		if (Hero.loc == Location.WOODED_PATH_02) {
			b_01.setText("fight");
			b_01.setActionCommand("fight");

			b_02.setText("bridge");
			b_02.setActionCommand("bridge");

			b_03.setText("waytown");
			b_03.setActionCommand("waytown");
		}

		// bridge
		if (Hero.loc == Location.BRIDGE) {
			b_01.setText("fight");
			b_01.setActionCommand("fight");

			b_02.setText("wooded path 01");
			b_02.setActionCommand("wooded_path_01");

			b_03.setText("wooded path 02");
			b_03.setActionCommand("wooded_path_02");
		}

		// waytown
		if (Hero.loc == Location.WAYTOWN) {
			b_01.setText("shop");
			b_01.setActionCommand("shop");

			b_02.setText("wooded path 02");
			b_02.setActionCommand("wooded_path_02");

			b_03.setText("wooded trail 02");
			b_03.setActionCommand("wooded_trail_02");
		}

		// waterfall
		if (Hero.loc == Location.WATERFALL) {
			b_01.setText("cleanse");
			b_01.setActionCommand("cleanse");

			b_02.setText("animal trail 02");
			b_02.setActionCommand("animal_trail_02");

			b_03.setText("wooded trail 02");
			b_03.setActionCommand("wooded_trail_02");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ("home_town".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to home town");
			Hero.loc = Location.HOME_TOWN;
		}

		if ("wooded_trail_01".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to wooded trail 01");
			Hero.loc = Location.WOODED_TRAIL_01;
		}

		if ("wooded_trail_02".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to wooded trail 02");
			Hero.loc = Location.WOODED_TRAIL_02;
		}

		if ("wooded_path_02".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to wooded path 02");
			Hero.loc = Location.WOODED_PATH_02;
		}

		if ("forest_shrine".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to forest_shrine");
			Hero.loc = Location.FOREST_SHRINE;
		}

		if ("animal_trail_01".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to animal trail 01");
			Hero.loc = Location.ANIMAL_TRAIL_01;
		}

		if ("animal_trail_02".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to animal trail 02");
			Hero.loc = Location.ANIMAL_TRAIL_02;
		}

		if ("cave".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to cave");
			Hero.loc = Location.CAVE;
		}

		if ("wooded_path_01".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to wooded path 01");
			Hero.loc = Location.WOODED_PATH_01;
		}

		if ("wooded_path_02".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to wooded path 02");
			Hero.loc = Location.WOODED_PATH_02;
		}

		if ("bridge".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to bridge");
			Hero.loc = Location.BRIDGE;
		}

		if ("waytown".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to waytown");
			Hero.loc = Location.WAYTOWN;
		}

		if ("waterfall".equals(e.getActionCommand())) {
			GameTextArea.addText("moving to waterfall");
			Hero.loc = Location.WATERFALL;
		}

		// non travel ***************************************
		if ("pray".equals(e.getActionCommand())) {
			GameTextArea.addText("you feel the gods bless you");
		}

		if ("shop".equals(e.getActionCommand())) {
			GameTextArea.addText("shopping");
		}
		
		if ("fight".equals(e.getActionCommand())){
			
		}

		Hero.updateHero();
		updateButtons();
	}
}
