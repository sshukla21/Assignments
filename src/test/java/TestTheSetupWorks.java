import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class DummyClass {
    public String dummyMethod() {
        return null;
    }
}

public class TestTheSetupWorks {
    @Test
    public void testBasicJunitAndHamcrestWorks() {
        assertThat(2, is(1 + 1));
    }

    @Test
    public void testBasicMockitoWorks() {
        DummyClass dummyObject = mock(DummyClass.class);
        when(dummyObject.dummyMethod()).thenReturn("Hello World");
        assertThat(dummyObject.dummyMethod(), is("Hello World"));
    }
}
