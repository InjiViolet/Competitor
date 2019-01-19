package yarish;

import beans.Competitor;
import beans.User;
import config.Config;
import util.CompetitionUtil;
import util.MenuUtil;
import util.UserUtil;

public class Main {

    /*0. login olmaq teleb olunur. 3 defe sehv etsem xeta versin ve sistemden cixsin.+
    *1. menu cixir ve secimleri gosterir:
    1-yarismacilari daxil et, 2-yarismaya basla, 3-xalini oyren, 4-ishtirakcilarin sayini artir,
    5-yarismacilara bax, 6-logout+
    *2. yarismacilari daxil et secilir ve nece yarismaci oldugu sorusulur.
    hemin yarismacilarin adi, soyadi ve yashi teleb olunur+
    *3. yarismaya basla secilir ve sistem arxa planda hazir index goturur ve
    menden hansi yarismacinin qalib oldugu sorusulur. eger duz tapsam menim
    xalimi artirir+
    *4. logout secsem bu zaman yeniden login sehifesine qaytarir
     */
    public static void main(String[] args) {
        User user = UserUtil.requireInputsAndLogin(1, true);

        System.out.println("Hello, " + user.getUsername());
        MenuUtil.showMenuInfinite();
    }
}
