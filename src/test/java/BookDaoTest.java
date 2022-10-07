import com.ys.config.SpringConfig;
import com.ys.dao.BookDao;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//设置类运行器
@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring环境对应的配置类
@ContextConfiguration(classes = {SpringConfig.class}) //加载配置类
public class BookDaoTest {
   private BookDao bookDao;

   @Autowired
   private ApplicationContext ctx;

   @Before
   public void init(){
       bookDao = (BookDao) ctx.getBean("bookDaoImpl");
   }

    @Test
    public void testBookDao(){
        bookDao.save();
        bookDao.update();
        System.out.println("hello, world");
    }
}
