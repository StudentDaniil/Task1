package db;

import model.Disk;

import java.util.ArrayList;
import java.util.List;

public class CollectionDisk {
    private List<Disk> disks;

    public CollectionDisk() {
        disks = new ArrayList<>();
    }

    public List<Disk> getDisks() {
        return disks;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int k = 0;
        for (int i = 0; i < disks.size(); i++) {
            Disk disk = disks.get(i);
            k += 1;
            result.append("Disk " + k).append("\n");
            result.append(disk.toString()).append("\n");
        }
        return result.toString();
    }
}