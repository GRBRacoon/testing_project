
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class SubtractorTest {

    static ISubtractor subtractor;

    @BeforeAll
    public static void setUp(){
        IAdder adder = Mockito.mock((IAdder.class));
        IFlipper flipper=Mockito.mock((IFlipper.class));

        Mockito.when(flipper.flip(5)).thenReturn(-5);
        Mockito.when(adder.add(3,-5)).thenReturn(-2);

        subtractor =new Subtractor(adder, flipper);

    }
    @Test
    public  void  subtractTest(){
//        Assertions.fail();
//        Assertions.fail();
        Assertions.assertEquals(-2,subtractor.subtract(3,5));
    }




}
