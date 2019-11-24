package com.greenleaf.designpatterns.composite.htmlexample;

import java.util.List;

/**
 * The Component is the interface that defines the signatures of the important methods used in
 * the composite/leaf classes
 *
 * The abstract methods indicates the function that HAVE to be defined in both the composite and leaf classes.
 *
 */
public abstract class HtmlTagComponent {

    public abstract String getTagName();

    /** These abstract methods MUST be defined in extending classes */
    public abstract void setStartTag(String tag);
    public abstract void setEndTag(String tag);
    public abstract void generateHtml();

    /**
     * These may or may not be defined in child classes.
     * So define a default exception behavior and have the pertinent child class implement the body.
     *  These are useful only the the Composite class
     **/
    public void setTagBody(String tagBody){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public void addChildTag(HtmlTagComponent htmlTag){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public void removeChildTag(HtmlTagComponent htmlTag){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }
    public List<HtmlTagComponent> getChildren(){
        throw new UnsupportedOperationException("Current operation is not support for this object");
    }

}
