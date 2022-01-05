package subtitle;

/**
Rappresent a Subtitle.
*/
public interface Subtitle {
	
	/**
	Return the time in milliseconds of the start.
	*/
	public long getStart();
	
	/**
	Return the time in milliseconds of the end.
	*/
	public long getEnd();
	
	/**
	Return the text of the subtitle.
	*/
	public String getText();
}
