package service;

import model.Disk;
import db.CollectionDisk;

import java.util.List;

public class DiskService {
    private CollectionDisk db = new CollectionDisk();


    public void addDisk(Disk disk) {
        db.getDisks().add(disk);
    }

    public void removeDisk(Disk disk) {
        db.getDisks().remove(disk);
    }

    public void changeDisk(Disk oldDisk, Disk newDisk) {
        int index = db.getDisks().indexOf(oldDisk);
        if (index != -1) {
            db.getDisks().set(index, newDisk);
        } else {
            System.out.println("Такого диска я не знаю!Ты видимо ошибся.");
        }
    }
    public void editDisk(int index, String newType, List<String> newCategory) {
        db.getDisks().get(index).setType(newType);
        db.getDisks().get(index).setCategory(newCategory);
    }

    @Override
    public String toString() {
        return db.toString();
    }


}
