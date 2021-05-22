package refactoring_guru.composite.example.shapes;

import java.awt.Color;
import java.awt.Graphics;

//Um ponto
public class Dot extends BaseShape{

	public final int DOT_SIZE = 3;
	
	public Dot(int x, int y, Color color) {
		super(x, y, color);
	}

	@Override
	public int getWidth() {
		return DOT_SIZE;
	}
	
	@Override
	public int getHeight() {
		return DOT_SIZE;
	}
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.fillRect(x -1, y -1, getWidth(), getHeight());
	}
	
}
