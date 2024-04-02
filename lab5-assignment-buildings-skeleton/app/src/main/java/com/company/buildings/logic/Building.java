package com.company.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    private int mLength;
    private int mWidth;
    private int mLotLength;
    private int mLotWidth;

    Building(int length, int width, int lotLength, int lotWidth) {
        this.mLength = length;
        this.mWidth = width;
        this.mLotLength = lotLength;
        this.mLotWidth = lotWidth;
    }

    public int getLength() {
        return mLength;
    }

    public int getWidth() {
        return mWidth;
    }

    public int getLotLength() {
        return mLotLength;
    }

    public int getLotWidth() {
        return mLotWidth;
    }

    public void setLength(int length) {
        mLength = length;
    }

    public void setWidth(int width) {
        mWidth = width;
    }

    public void setLotLength(int lotLength) {
        mLotLength = lotLength;
    }

    public void setLotWidth(int lotWidth) {
        mLotWidth = lotWidth;
    }

    public int calcBuildingArea() {
        return mWidth * mLength;
    }

    public int calcLotArea() {
        return mLotWidth * mLotLength;
    }

    @Override
    public String toString() {
        return "Building [Length=" + mLength + ", Width=" + mWidth + ", LotLength=" + mLotLength + ", LotWidth=" + mLotWidth + "]";
    }
}
