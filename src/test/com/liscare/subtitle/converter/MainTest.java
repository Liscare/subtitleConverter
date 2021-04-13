package com.liscare.subtitle.converter;

import com.liscare.subtitle.converter.file.*;
import com.liscare.subtitle.converter.file.TimedTextFileFormat;
import com.liscare.subtitle.converter.file.TimedTextObject;

import java.io.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Main tests for converting")
public class MainTest {

    /**
     * To test the correct implementation of the SRT parser and writer.
     * @throws Exception
     */
    @Test
    public void test_SRT() throws Exception{
        TimedTextFileFormat ttff = new FormatSRT();
        InputStream is = getClass().getClassLoader().getResourceAsStream("SRT/Avengers.2012.Eng.Subs.srt");
        TimedTextObject tto = ttff.parseFile("Avengers.2012.Eng.Subs.srt", is);
        IOClass.writeFileTxt("test.srt", tto.toSRT());
    }

    /**
     * To test the correct implementation of the ASS/SSA parser and writer.
     * @throws Exception
     */
    @Test
    public void test_ssa() throws Exception {
        TimedTextFileFormat ttff = new FormatASS();
        InputStream is = getClass().getClassLoader().getResourceAsStream("ASS/test.ssa");
        TimedTextObject tto = ttff.parseFile("ASS/test.ssa", is);
        IOClass.writeFileTxt("test.ssa", tto.toASS());
    }

    /**
     * To test the correct implementation of the TTML parser and writer.
     * @throws Exception
     */
    @Test
    public void test_xml() throws Exception {
        TimedTextFileFormat ttff = new FormatTTML();
        InputStream is = getClass().getClassLoader().getResourceAsStream("XML/Debate0_03-03-08.dfxp.xml");
        TimedTextObject tto = ttff.parseFile("XML/Debate0_03-03-08.dfxp.xml", is);
        IOClass.writeFileTxt("test.xml", tto.toTTML());
    }

    /**
     * To test the correct implementation of the STL parser and writer.
     * @throws Exception
     */
    @Test
    public void test_stl() throws Exception {
        TimedTextFileFormat ttff = new FormatSTL();
        InputStream is = getClass().getClassLoader().getResourceAsStream("STL/Alsalirdeclasebien.stl");
        TimedTextObject tto = ttff.parseFile("STL/Alsalirdeclasebien.stl", is);
        try (OutputStream output = new BufferedOutputStream(new FileOutputStream("test.stl"))) {
            output.write(tto.toSTL());
        }
    }

    /**
     * To test the correct implementation of the SCC parser and writer.
     * @throws Exception
     */
    @Test
    public void test_scc() throws Exception {
        TimedTextFileFormat ttff = new FormatSCC();
        InputStream is = getClass().getClassLoader().getResourceAsStream("SCC/sccTest.scc");
        TimedTextObject tto = ttff.parseFile("SCC/sccTest.scc", is);
        IOClass.writeFileTxt("prueba.scc", tto.toSCC());
    }

}
