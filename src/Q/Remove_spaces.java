package Q;

import java.util.logging.Logger;

public class Remove_spaces {
    static Logger logger = Logger.getLogger(String.valueOf(Remove_spaces.class));

    static void main() {
        String str = "a b ww s";
        String ans = "";
        for (char a : str.toCharArray()) {
            if (a == ' ') {
            } else {
                ans += a;
            }
        }
        logger.info(ans);
        logger.warning(ans);
    }
}
