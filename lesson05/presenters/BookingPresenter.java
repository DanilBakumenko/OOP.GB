package lesson05.presenters;

import java.util.Collection;
import java.util.Date;
import lesson05.models.Table;

public class BookingPresenter implements ViewObserver {
   private final Model model;
   private final View view;

   public BookingPresenter(Model model, View view) {
      this.model = model;
      this.view = view;
      this.view.setObserver(this);
   }

   public Collection<Table> loadTables() {
      return this.model.loadTables();
   }

   public void updateTablesUI() {
      this.view.showTables(this.loadTables());
   }

   public void updateReservationResultUI(int reservationNo) {
      this.view.showReservationResult(reservationNo);
   }

   public void onReservationTable(Date reservationDate, int tableNo, String name) {
      int reservationNo = this.model.reservationTable(reservationDate, tableNo, name);
      this.updateReservationResultUI(reservationNo);
   }

   public void onChangeReservation(int oldReservation, Date reservationDate, int tableNo, String name){
      int reservationNo = this.model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
      this.updateReservationResultUI(reservationNo);
   }
}

