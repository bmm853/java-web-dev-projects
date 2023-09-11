package org.launchcode;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date d, ArrayList<MenuItem> i) {
        this.lastUpdated = d;
        this.items = i;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    //My version
    public void addItem(MenuItem anItem) {
        items.add(anItem);
    }

//Chloe's version:
//    public ArrayList<MenuItem> addItem(MenuItem anItem) {
//        this.items.add(anItem);
//        return this.items;
//    }


//    void removeItem(MenuItem item) {
//
//    }

}

