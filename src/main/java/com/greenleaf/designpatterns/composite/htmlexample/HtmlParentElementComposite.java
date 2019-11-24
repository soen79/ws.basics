package com.greenleaf.designpatterns.composite.htmlexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 10/5/2019.
 */
public class HtmlParentElementComposite extends HtmlTagComponent {

    private String tagName;
    private String startTag;
    private String endTag;
    private List<HtmlTagComponent> childrenTag;

    public HtmlParentElementComposite(String tagName){
        this.tagName = tagName;
        this.startTag = "";
        this.endTag = "";
        this.childrenTag = new ArrayList<>();
    }


    @Override
    public String getTagName() {
        return tagName;
    }

    @Override
    public void setStartTag(String tag) {
        this.startTag = tag;
    }

    @Override
    public void setEndTag(String tag) {
        this.endTag = tag;
    }

    @Override
    public void addChildTag(HtmlTagComponent htmlTag){
        childrenTag.add(htmlTag);
    }

    @Override
    public void removeChildTag(HtmlTagComponent htmlTag){
        childrenTag.remove(htmlTag);
    }

    @Override
    public List<HtmlTagComponent>getChildren(){
        return childrenTag;
    }

    @Override
    public void generateHtml() {
        System.out.println(startTag);
        for(HtmlTagComponent tag : childrenTag){
            tag.generateHtml();
        }
        System.out.println(endTag);

    }
}
