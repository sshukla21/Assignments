import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class AddTest {
    @Test
    public void shouldAdditionOfOneAndOneBeTwo() {
        assertThat(2, is(1 + 1));
    }
}
