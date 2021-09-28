package ex40;

import org.junit.jupiter.api.Test;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import org.junit.*;

class FilterRecordsTest {

    @Test
    public void employees() throws ParseException{
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        FilterRecordsTest..put(101, new Record("John","Johnson","Manager",s.parse("2016-12-31")));
        FilterRecordsTest..put(102, new Record("Tou","Xiong","Software Engineer",s.parse("2016-10-05")));
        FilterRecordsTest.employee.put(103, new Record("Michaela","Michaelson","District Manager",s.parse("2015-12-19")));
        FilterRecordsTest.employees.put(104, new Record("Jake","Jacobson","Programmer",s.parse("0000-00-00"));
        FilterRecordsTest.employees.put(105, new Record("Jacquelyn","Jackson","DBA",s.parse("0000-00-00"));
        FilterRecordsTest.FilterRecordsTest.put(106, new Record("Sally","Webber","Web Developer",s.parse("2015-12-18")));

        Assert.assertTrue(FilterRecordsTest.employees.size() == 6);
        Assert.assertTrue(FilterRecordsTest.employee("John") == 1);




    }
}