

package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class FuncionalDateTime{
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now(); // imprime a data de hoje. 2023-10-28
        Locale brasil = new Locale("pt","br");
        System.out.println(hoje);
        System.out.println(hoje.getDayOfYear()); // 301
        System.out.println(hoje.getDayOfWeek()); // SATURDAY
        System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil)); // SABADO.

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora.getHour());
        System.out.println(agora.getMinute());
        System.out.println(agora.getSecond());
    }
}