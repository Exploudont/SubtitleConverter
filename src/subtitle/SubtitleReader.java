package subtitle;

import java.util.Collection;

public interface SubtitleReader {

	/** Read a single Subtitle from file. */
	public Subtitle read();
	
	/** Close the file stream. */
	public void close() throws Exception;
	
	/** Read Subtitles from file. */
	//public static Collection<Subtitle> readAll(String file) throws Exception;
}
