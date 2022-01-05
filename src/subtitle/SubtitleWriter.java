package subtitle;

import java.util.Collection;

public interface SubtitleWriter {

	/** Write a single Subtitle into the file. */
	public void write(Subtitle sub) throws Exception;
	
	/** Close the file stream. */
	public void close() throws Exception;
	
	/** Write Subtitles into the file. */
	//public static void writeAll(String file, Collection<Subtitle> subs) throws Exception;
}
