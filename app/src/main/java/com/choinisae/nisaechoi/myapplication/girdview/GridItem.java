package com.choinisae.nisaechoi.myapplication.girdview;

/**
 * Created by donghaechoi on 2016. 7. 21..
 */
public class GridItem {

    private int gridItemRes;
    private String gridItemName;

    public GridItem(int gridItemRes, String gridItemName) {
        this.gridItemRes = gridItemRes;
        this.gridItemName = gridItemName;
    }

    public int getGridItemRes() {
        return gridItemRes;
    }

    public void setGridItemRes(int gridItemRes) {
        this.gridItemRes = gridItemRes;
    }

    public String getGridItemName() {
        return gridItemName;
    }

    public void setGridItemName(String gridItemName) {
        this.gridItemName = gridItemName;
    }
}
