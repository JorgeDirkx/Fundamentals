package com.jorgedirkx.enums;

public enum Color {

    //fixed instances: (static properties)
    BLACK(123), WHITE(456), YELLOW(789);

    private int rgb;

    public int getRgb() {
        return rgb;
    }

    // a private constructor, to add parameters to the fixed instances
    private Color(int rgb){
        this.rgb = rgb;
    }

    @Override
    public String toString() {
        return "Color{" +
                "rgb=" + rgb +
                '}';
    }
}
