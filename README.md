Subtitle Converter
==================

Original README
---------------
This is a java framework for processing subtitle formats and converting them into other formats.

So far the formats supported are EBU's STL, .SCC, .ASS/.SSA .SRT and a subset of W3C's TTML 1.0

You can find the logic working online at: subtitleconverter.net

This work was done as part of my bachelor's thesis for the Universidad Carlos III de Madrid.

Addtional Notes
---------------
To create an executable jar using maven, run the following out of the parent
subtitleConvert directory where pom.xml is (Note: Maven must already be installed):

    $ mvn package

This will create the executable jar under target/subtitleConvert-1.0.2.jar

To perform a conversion:

    $ java -jar subtitleConvert-1.0.2.jar input-file input-format output-format output-file

Note: Some IO changes have been made for Linux support and are not guaranteed
to work on Windows.
