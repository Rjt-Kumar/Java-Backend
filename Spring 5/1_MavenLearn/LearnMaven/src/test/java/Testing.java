import com.LetsGoo.App;
import org.junit.jupiter.api.Test;
import com.LetsGoo.App;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Testing {

     App rev = new App();
   @Test
    void justTest(){
       assertEquals("Hello",rev.reverse("Hello"));
    }
}
