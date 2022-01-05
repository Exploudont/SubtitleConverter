package subtitle;

/**
Abstract Subtitle that implements tipical methods of a Subtitle.
*/
abstract class AbstractSubtitle implements Subtitle {
	
	/** @overridde */
	public long getStart() {
		return this.start;
	}
	
	/** @overridde */
	public long getEnd() {
		return this.end;
	}
	
	/** @overridde */
	public String getText() {
		return this.text;
	}
	
	/**
	Set the time in milliseconds of the start.
	*/
	protected void setStart(long start) {
		this.start = start;
	}
	
	/**
	Set the time in milliseconds of the end.
	*/
	protected void setEnd(long end) {
		this.end = end;
	}
	
	/**
	Set the text of the subtitle.
	*/
	protected void setText(String text) {
		this.text = text;
	}
	
	private long start;
	private long end;
	private String text;
}
