package project_hero;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class GameImageArea extends Component {

	static BufferedImage img;
	ImageIcon icon;

	static int dx;
	static int dy;

	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, null);
		repaint();
	}

	public static void loadImage(String string) {
		try {
			img = new BufferedImage(dx, dy, BufferedImage.TYPE_INT_RGB);
			img = ImageIO.read(new File(string));
		} catch (IOException e) {
		}
	}

	public Dimension getPreferredSize() {
		if (img == null) {
			return new Dimension(dx, dy);
		} else {
			return new Dimension(img.getWidth(null), img.getHeight(null));
		}

	}

	public GameImageArea(int x, int y) {
		dx = x;
		dy = y;

		setPreferredSize(new Dimension(dx, dy));

		loadImage("res/pink.png");
	}

}
