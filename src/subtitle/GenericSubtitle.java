package subtitle;

/**
Generic subtitle format.
*/
public class GenericSubtitle extends AbstractSubtitle {
	
	/**
	Create GenericSubtitle Object.
	*/
	public GenericSubtitle(long start, long end, String text) {
		setStart(start);
		setEnd(end);
		setText(text);
	}
	
	/**
	Create GenericSubtitle Object passing another Subtitle.
	*/
	public GenericSubtitle(Subtitle sub) {
		this(sub.getStart(), sub.getEnd(), sub.getText());
	}
	
	/** @override */
	public String toString() {
		return getStart() + ";" + getEnd() + ";" + getText();
	}
}
