package lesson05.presenters;

import java.util.Collection;
import java.util.Date;
import lesson05.models.Table;

public interface Model {
   Collection<Table> loadTables();

   int reservationTable(Date var1, int var2, String var3);
   void deleteReservation(int var1);
   int changeReservationTable(int var1, Date var2, int var3, String var4);
}
