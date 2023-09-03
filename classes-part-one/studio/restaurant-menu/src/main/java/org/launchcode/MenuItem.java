package org.launchcode;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private boolean isNew = true;

    public MenuItem(String name, String description, String category, double price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public boolean isNew() {
        return isNew;
    }

    void setNew(boolean itemStatus) {
        isNew = itemStatus;
    }
}
