import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args)throws FileNotFoundException {
        Monsters monsters = new Monsters("goblin", 0.25, 7, 15);
        Data Data = new Data();

        File file = new File("monsters.csv");
        Scanner sc = new Scanner(file);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
            String line = sc.nextLine();
            String[] lineArray = line.split(",");
            Monsters m = new Monsters(lineArray[0],Double.parseDouble(lineArray[2]), Double.parseDouble(lineArray[4]), Double.parseDouble(lineArray[5]));
            Data.addMonster(m);
        }
        System.out.println(monsters.toString());
        System.out.println(Data.getByCR(4));
        System.out.println(Data.sortByHP());
        System.out.println(Data.sortByArmor());
        System.out.println(Data.getMaxHP());
        System.out.println(Data.getLowestArmor());
        System.out.println(Data.getByArmor(16));
    }
}
