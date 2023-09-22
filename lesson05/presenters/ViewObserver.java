package lesson05.presenters;

import java.util.Date;

public interface ViewObserver {
   void onReservationTable(Date var1, int var2, String var3);
   void onChangeReservation(int var1, Date var2, int var3, String var4);
}
