package refactoring_guru.composite.example.shapes;

import java.awt.Color;
import java.awt.Graphics;

//Um retângulo
public class Rectangle extends BaseShape{
	
	public int width;
	public int height;
	
	public Rectangle(int x, int y, int width, int height, Color color) {
		super(x, y, color);
		this.width = width;
		this.height = height;
	}

	@Override
	public int getWidth() {
		return this.width;
	}
	
	@Override
	public int getHeight() {
		return this.height;
	}
	
	@Override
	public void paint(Graphics graphics) {
		super.paint(graphics);
		graphics.drawRect(x, y, getWidth() - 1, getHeight() - 1);
	}
}
