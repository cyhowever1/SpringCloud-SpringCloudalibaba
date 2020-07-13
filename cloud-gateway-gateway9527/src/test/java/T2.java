import lombok.extern.slf4j.Slf4j;

import java.time.ZonedDateTime;

/**
 * author:cy
 * Date:2020/6/4 19:49
 */
@Slf4j
public class T2 {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        log.info(now+"");
        //2020-06-04T19:50:43.429+08:00[Asia/Shanghai]
    }
}
