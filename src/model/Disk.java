package model;

import java.util.List;

public class Disk {
    private String type;
    private List<String> categories;
    private String description;

    // Конструктор
    public Disk(String type, List<String> category, String description) {
        this.type = type;
        this.categories = category;
        this.description = description;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getCategory() {
        return categories;
    }

    public void setCategory(List<String> categories) {
        this.categories = categories;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void editDisk(String newType, List<String> newCategory) {
        setType(newType); // Изменение типа диска
        setCategory(newCategory); // Изменение категории диска
    }

    @Override
    public String toString() {
        return "Type: " + type + "\nCategory: " + categories + "\nDescription: " + description;
    }
}