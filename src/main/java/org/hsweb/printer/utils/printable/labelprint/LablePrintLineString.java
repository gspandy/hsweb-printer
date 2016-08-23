/*
 *  Copyright (c) 2015.  meicanyun.com Corporation Limited.
 *  All rights reserved.
 *
 *  This software is the confidential and proprietary information of
 *  meicanyun Company. ("Confidential Information").  You shall not
 *  disclose such Confidential Information and shall use it only in
 *  accordance with the terms of the license agreement you entered into
 *  with meicanyun.com.
 */

package org.hsweb.printer.utils.printable.labelprint;

import java.awt.*;

/**
 * Created by xiongchuang on 2016/8/23 .
 */
public class LablePrintLineString implements LablePrintLine{
    private int x;
    private int y;
    private Font font;
    private String printString;

    public LablePrintLineString(int x, int y, Font font, String printString) {
        this.x = x;
        this.y = y;
        this.font = font;
        this.printString = printString;
    }

    @Override
    public void setX(int x) {
        this.x=x;
    }

    @Override
    public void setY(int y) {
        this.y=y;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    public Font getFont() {
        return font;
    }

    @Override
    public void print(int xpadding,int ypadding,Graphics2D g2){
        g2.setFont(this.font);
        g2.drawString(this.printString,xpadding+ this.x, ypadding+this.y);
    }
}
