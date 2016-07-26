package com.choinisae.nisaechoi.myapplication.girdview;

/**
 * Created by donghaechoi on 2016. 7. 21..
 */
public class GridItem {

    private int gridItemRes;
    private String gridItemName;
    private String gridButtonName;

    public GridItem(int gridItemRes, String gridItemName, String gridButtonName) {
        this.gridItemRes = gridItemRes;
        this.gridItemName = gridItemName;
        this.gridButtonName = gridButtonName;
    }

    public String getGridButtonName() {
        return gridButtonName;
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
