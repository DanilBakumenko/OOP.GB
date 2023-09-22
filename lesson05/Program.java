package lesson05;

import java.util.Date;
import lesson05.models.TableModel;
import lesson05.presenters.BookingPresenter;
import lesson05.views.BookingView;

public class Program {
   public Program() {
   }

   public static void main(String[] args) {
      TableModel model = new TableModel();
      BookingView view = new BookingView();
      BookingPresenter presenter = new BookingPresenter(model, view);
      presenter.updateTablesUI();
      view.reservationTable(new Date(), 3, "Stanislav");
      view.reservationTable(new Date(), 3, "Stanislav");
      view.reservationTable(new Date(), 3, "Stanislav");
      view.changeReservationTable(101, new Date(), 4, "Stanislav");
   }
}
