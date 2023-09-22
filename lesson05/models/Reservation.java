package lesson05.models;

import java.util.Date;

public class Reservation {
   private static int counter = 100;
   private final int id;
   private Date date;
   private String name;

   public Reservation(Date date, String name) {
      this.id = ++counter;
      this.date = date;
      this.name = name;
   }

   public int getId() {
      return this.id;
   }
   
   public Date getDate() {
      return this.date;
   }
   
   public String getName() {
      return this.name;
   }

   public void setDate(Date date) {
       this.date = date;
   }
   
   public void setName(String name) {
       this.name = name;
   }
}