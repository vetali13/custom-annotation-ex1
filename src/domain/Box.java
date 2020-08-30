package domain;

import util.DefaultValue;

public class Box {
	@DefaultValue(100)
	private int length;
	@DefaultValue(101)
	private int width;
	@DefaultValue(102)
	private int height;
	
	protected Box() {
		super();
	}

	public int getLength() {
		return length;
	}

	protected void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	protected void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	protected void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Box [getLength()=" + getLength() + ", getWidth()=" + getWidth() + ", getHeight()=" + getHeight() + "]";
	};
	
	
	
}
