package lesson05.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import lesson05.presenters.Model;

public class TableModel implements Model {
   private Collection<Table> tables;

   public TableModel() {
   }

   public Collection<Table> loadTables() {
      if (this.tables == null) {
         this.tables = new ArrayList();
         this.tables.add(new Table());
         this.tables.add(new Table());
         this.tables.add(new Table());
         this.tables.add(new Table());
         this.tables.add(new Table());
      }

      return this.tables;
   }

   public int reservationTable(Date reservationDate, int tableNo, String name) {
      Iterator var5 = this.tables.iterator();

      while (var5.hasNext()) {
         Table t = (Table) var5.next();
         if (t.getNo() == tableNo) {
            Reservation reservation = new Reservation(reservationDate, name);
            t.getReservations().add(reservation);
            return reservation.getId();
         }
      }

      return -1;
   }

   public void deleteReservation(int oldReservation) {
      Iterator var5 = this.tables.iterator();

      while (var5.hasNext()) {
         Table t = (Table) var5.next();
         if (!!t.getReservations().isEmpty()) {
            Iterator var6 = t.getReservations().iterator();
            while (var6.hasNext()) {
               Reservation r = (Reservation) var6.next();
               if (r.getId() == oldReservation) {
                  t.getReservations().remove(r);
               }
            }
         }
      }
   }

   public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
      deleteReservation(oldReservation);
      return reservationTable(reservationDate, tableNo, name);
   }
}
