
/**
 * 
 * @author Karimshan Nawaz
 *
 */
public class Keyboard {
	
	/**
	 * Represents 'key codes'
	 */
	public static final int TAB_KEY_CODE = 80, ENTER_KEY_CODE = 84;
	
	/**
	 * Registers the enter key manually.
	 */
	public static void registerEnterKey() {
		Class361.keyStrokeHandler.method3456('\0', ENTER_KEY_CODE, 0);
		Class361.keyStrokeHandler.method3456('\0', ENTER_KEY_CODE, 1);
	}
	
	/**
	 * Registers the tab key manually.
	 */
	public static void registerTabKey() {
		Class361.keyStrokeHandler.method3456('\0', TAB_KEY_CODE, 0);
	}
	
	/**
	 * Registers a character manually.
	 * @param c
	 */
	public static void registerNormalCharacter(char c) {
		Class361.keyStrokeHandler.method3456(c, -1, 3);
	}

}
