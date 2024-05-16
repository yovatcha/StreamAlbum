import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\cchai\\Desktop\\savedwork\\csc319LAB\\lambda_practice2\\trial_dataENG.csv";
        
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            
            Stream<String> lines = bufferedReader.lines().skip(1);
            List<Item> list = new ArrayList<>();
            
            lines.forEach(data -> {
                String[] values = data.split(",");
                Item item = new Item(values[0], values[1], values[2], values[3], values[4],
                        values[5], values[6]);
                list.add(item);
            });
            
            list.stream().forEach((Item item) -> {
                System.out.println(item.getId() + " " + item.getType() + " " +
                        item.getColor() + " " + item.getInkColor());
            });
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



////////////////////////////////////////////////////////////////////////


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Main {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\cchai\\Desktop\\savedwork\\csc319LAB\\lambda_practice2\\trial_dataENG.csv";
        
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader)) {
            
            Stream<String> lines = bufferedReader.lines().skip(1);
            List<Item> list = new ArrayList<>();
            
            lines.forEach(data -> {
                String[] values = data.split(",");
                Item item = new Item(values[0], values[1], values[2], values[3], values[4],
                        values[5], values[6]);
                list.add(item);
            });
            
            list.stream().forEach((Item item) -> {
                System.out.println(item.getId() + " " + item.getType() + " " +
                        item.getColor() + " " + item.getInkColor());
            });
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
