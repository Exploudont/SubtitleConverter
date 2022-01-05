# Subtitle Converter

## Installation


## Usage

There are few main classes:
- 'Subtitle': interface for all subtitle;
- 'AbstractSubtitle': implements Subtitle methods;
- 'GenericSubtitle': to prevent a concrete class for a generic file format; 
- 'SubtitleReader': interface for all subtitle readers;
- 'SubtitleWriter': interface for all subtitle writers.

Those classes are extended in all subtitle sub-package.
Example for 'srt':

- 'SRTSubtitle';
- 'SRTSubtitleReader';
- 'SRTSubtitleWriter';

### Reader

All readers implements 'SubtitleReader'.

You can read all subtitle at once time using the static method:

''' java
List<Subtitle> subs = SRTSubtitleReader.readAll("file.srt");
'''

Or process every single subtitle:

''' java
SubtitleReader reader = new SRTSubtitleReader("file.srt");

Subtitle s;
while((s = reader.read()) != null) {
	// do something
}
'''

### Writer

All writers implements 'SubtitleWriter'.

You can write all subtitle at once time using the static method:

''' java
List<Subtitle> subs;
// ...

SRTSubtitleWriter.writeAll(subs, "file.srt");
'''

Or process every single subtitle:

''' java
List<Subtitle> subs;
// ...

SubtitleWriter writer = new SRTSubtitleWriter("file.srt");
for(Subtitle s : subs)
	writer.write(s);

}
'''

## Documentation
Documentation is the java doc.
You can generate the documentation using 'javadoc' inside the package.

## License

