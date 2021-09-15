package ninja.javahacker.test.bugjdk17;

import java.util.List;
import lombok.Builder;
import lombok.Singular;

public class BugTest {

    @Builder
    public static void request(@Singular List<String> headers) {}
}
