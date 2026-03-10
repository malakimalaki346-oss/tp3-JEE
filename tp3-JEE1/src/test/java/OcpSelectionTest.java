import metier.IMetier;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import presentation.Presentation2;
import static org.junit.Assert.assertEquals;

public class OcpSelectionTest {

    @Test
    public void devProfile_choisitDao2_320() {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();

        ctx.getEnvironment().setActiveProfiles("dev");

        ctx.register(Presentation2.class);
        ctx.refresh();

        IMetier m = ctx.getBean(IMetier.class);

        assertEquals(320.0, m.calcul(), 0.001);

        ctx.close();
    }

    @Test
    public void prodProfile_choisitDao_2400() {

        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();

        ctx.getEnvironment().setActiveProfiles("prod");

        ctx.register(Presentation2.class);
        ctx.refresh();

        IMetier m = ctx.getBean(IMetier.class);

        assertEquals(2400.0, m.calcul(), 0.001);

        ctx.close();
    }
}