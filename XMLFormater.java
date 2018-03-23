package org.json;

/*
Copyright (c) 2018 JSON.org

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

The Software shall be used for Good, not Evil.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.logging.XMLFormatter;

public class XMLFormater {

    /** tag type, repeat element in list */
    public static final int TAG_TYPE_REPEAT_IN_LIST = 1;

    private Map<String, String> repeatTagNameMap= new HashMap<String, String>();


    public void setTagType(String tagName, int type){
        switch (type) {
            case TAG_TYPE_REPEAT_IN_LIST:
                repeatTagNameMap.put(tagName, tagName);
                break;
        }
    }

    public Map<String, String> getRepeatTagNameMap() {
        return repeatTagNameMap;
    }

}
