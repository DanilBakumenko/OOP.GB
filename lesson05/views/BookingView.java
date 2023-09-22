package lesson05.views;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import lesson05.models.Table;
import lesson05.presenters.View;
import lesson05.presenters.ViewObserver;

public class BookingView implements View {
   private ViewObserver observer;

   public BookingView() {
   }

   public void setObserver(ViewObserver observer) {
      this.observer = observer;
   }

   public void showTables(Collection<Table> tables) {
      Iterator var3 = tables.iterator();

      while(var3.hasNext()) {
         Table table = (Table)var3.next();
         System.out.println(table);
      }

   }

   public void showReservationResult(int reservationNo) {
      if (reservationNo > 0) {
         System.out.printf("Table is reserved, your reservation number: #%d\n", reservationNo);
      } else {
         System.out.println("We cannot reserve this table, try again later.");
      }

   }

   public void reservationTable(Date reservationDate, int tableNo, String name) {
      if (this.observer != null) {
         this.observer.onReservationTable(reservationDate, tableNo, name);
      }

   }

   public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
      if (this.observer != null) {
         this.observer.onChangeReservation(oldReservation, reservationDate, tableNo, name);
      }
   }
}
