package fit.core;

import java.util.function.Function;

public class FuncLogger {
    public static Function<String, String> create(String prefix) {
        return texto -> String.format("%s %s", prefix, texto);
    }
}
