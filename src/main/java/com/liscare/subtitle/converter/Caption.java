package com.liscare.subtitle.converter;

import com.liscare.subtitle.converter.file.Region;
import com.liscare.subtitle.converter.file.Style;
import com.liscare.subtitle.converter.file.Time;

public class Caption {
	
	public Style style;
	public Region region;
	
	public Time start;
	public Time end;

    /**
     * Raw content, before cleaning up templates and markup.
     */
	public String rawContent="";
    /**
     * Cleaned-up subtitle content.
     */
	public String content="";

    @Override
    public String toString() {
        return "Caption{" +
                start + ".." + end +
                ", " + (style != null ? style.getId() : null) + ", " + region + ": " + content +
                '}';
    }
}
