// An interface defines behavior

public interface Moveable {
	
	// You can have attributes, but they can only be:
	// public, final (constant), and static.
	// By default are public static final (no need to declare it)
	
	public static final int UNIT = 10;

	// By default, all methods of the interface are public and abstract.
	
	void moveUp(); // No implementation for methods.
	
	// No need to declare public abstract because it is done by default.
	public abstract void moveDown(); 

}
