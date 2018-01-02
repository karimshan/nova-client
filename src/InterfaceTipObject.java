
public class InterfaceTipObject {
	
	private int interId;
	private int compId;
	private int slotid;

	public InterfaceTipObject(final int inter, final int comp, final int slot) {
		this.interId = inter;
		this.compId = comp;
		this.slotid = slot;
	}

	public int getComp() {
		return this.compId;
	}

	public int getInter() {
		return this.interId;
	}

	public int getSlot() {
		return this.slotid;
	}
	
}
