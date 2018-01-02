
public class ItemOnButton {
	
	static int anInt2002;
	static int sentItemOnComponent;

	static final void display(int buttonId, int amount, int itemId) {
		sentItemOnComponent += 1;
		CacheNode_Sub2 cs = Class320_Sub19.method3754(3, 9, buttonId);
		cs.method2288(0);
		cs.itemId = itemId;
		cs.itemAmount = amount;
	}
}
