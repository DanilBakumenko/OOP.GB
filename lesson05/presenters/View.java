package lesson05.presenters;

import java.util.Collection;
import lesson05.models.Table;

public interface View {
   void setObserver(ViewObserver var1);

   void showTables(Collection<Table> var1);

   void showReservationResult(int var1);
}

