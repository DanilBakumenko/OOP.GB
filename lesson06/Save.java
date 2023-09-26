package lesson06;

import java.io.FileWriter;
import java.io.IOException;

public class Save<T extends Order> {

    public void saveTo(T t,String saveType){
        String fileName = "order." + saveType;
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\""+ t.getClientName() + "\",\n");
            writer.write("\"product\":\""+t.getProduct()+"\",\n");
            writer.write("\"qnt\":"+t.getQnt()+",\n");
            writer.write("\"price\":"+t.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
