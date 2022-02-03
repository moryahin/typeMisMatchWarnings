import io.reactivex.rxjava3.annotations.NonNull;
import io.reactivex.rxjava3.annotations.Nullable;

public class RxJava3Annotation<T> {
    @Nullable
    public String field = null;

    @Nullable
    public String foo(@NonNull String x, @Nullable CharSequence y) {
        return "";
    }

    @NonNull
    public String bar() {
        return "";
    }

    @Nullable
    public T baz(@NonNull T x) { return x; }
}