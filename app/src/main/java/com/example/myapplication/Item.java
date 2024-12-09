package com.example.myapplication;




public class Item {
    private final int imageResId;
    private final String text;
    private boolean selected;

    public Item(int imageResId, String text) {
        this.imageResId = imageResId;
        this.text = text;
        this.selected = false;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getText() {
        return text;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
}
