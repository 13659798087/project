package lzgene.newscreening;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class time {

    @Test
    public void time() throws ParseException {

       /* System.out.println(System.currentTimeMillis());
        String s="2018-07-18 09:31:00";
        String res="";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = simpleDateFormat.parse(s);
        long ts = date.getTime();
        res = String.valueOf(ts);

        System.out.println(res);
        System.out.println(System.currentTimeMillis() - ts);*/
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();

        System.out.println(format.format(date));


        //System.out.println("这是："+ Calendar.getInstance().get(Calendar.YEAR));

    }


}
