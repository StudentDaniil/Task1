import db.CollectionDisk;
import model.Disk;
import service.DiskService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//
//        Scanner scanner = new Scanner(System.in);
//        DiskService collectionDisk1 = new DiskService();
//
//        System.out.println("Добро пожаловать в вашу коллекцию дисков!");
//        while (true) {
//            System.out.println("Добавление типа диска:");
//            String type = scanner.nextLine();
//            System.out.println("Добавление категории диска (если есть несколько категорий, укажите их через запятую):");
//            String categoriesInput = scanner.nextLine();
//            String[] categories = categoriesInput.split(","); // Разбиваем введенную строку на массив категорий
//            System.out.println("Добавление описания диска:");
//            String description = scanner.nextLine();
//
//            Disk newDisk = new Disk(type, List.of(categories), description);
//            collectionDisk1.addDisk(newDisk);
//
//            System.out.println("Ваш диск добавлен в коллекцию!");
//
//            System.out.println("Вы хотите добавить еще диск? (Y/N)");
//            String choice = scanner.nextLine();
//            if (!choice.equalsIgnoreCase("Y")) {
//                break;
//            }
//        }

//        System.out.println("Ваша коллекцию дисков:");
//        System.out.println(collectionDisk1);

        List<String> newCategory1 = new ArrayList<>();
        newCategory1.add("Фильмы");
        newCategory1.add("Сериалы");
        newCategory1.add("Видео");
        List<String> newCategory2 = new ArrayList<>();
        newCategory2.add("Фильмы");
        newCategory2.add("Сериалы");
        Disk disk1 = new Disk("DVD", newCategory1, "Описание фильма 1");
        Disk disk2 = new Disk("cd-r", newCategory2, "Описание");


        DiskService collectionDisk2 = new DiskService();

        collectionDisk2.addDisk(disk1);
        collectionDisk2.addDisk(disk2);

        System.out.println(collectionDisk2);

        collectionDisk2.removeDisk(disk1);

        System.out.println("Удаление первого диска:" + collectionDisk2);

        collectionDisk2.addDisk(disk1);

        collectionDisk2.changeDisk(disk1, disk2);

        System.out.println("Замена первого на второй:" + collectionDisk2);

        collectionDisk2.editDisk(0, "Mp3", newCategory2);
        System.out.println("Изменение типа и категории у второй коллекции дисков:" + collectionDisk2);














//        DiskService collectionDisk1 = new DiskService();

//        Disk disk2 = new Disk("CD-R", "Музыка", "Описание альбома 1");
//        Disk disk3 = new Disk("mini-disc", "Файлы", "Описание 10 винды");
//        Disk disk4 = new Disk("DVD", "Фильмы", "Описание фильмов");
//        Disk disk5 = new Disk("mini-disc", "Файлы", "Какие-то файлы");
//
//        collectionDisk1.addDisk(disk1);
////        collectionDisk.removeDisk(disk1);
//        disk1.editDisk("CD-R", "Музыка");
//
//        System.out.println("Первая коллекция дисков:");
//        System.out.println(collectionDisk1);

    }
}