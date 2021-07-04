import com.google.auto.value.AutoValue;

import javax.annotation.Nullable;

public class Example {
    @AutoValue
    public abstract static class Inner {
        @Nullable public abstract String getCurrency();

        public abstract long getAmount();

        abstract Builder tobuilder();

        @AutoValue.Builder
        abstract static class Builder {
            abstract Builder setCurrency(String currency);

            abstract Builder setAmount(long amount);

            abstract Inner build();
        }
    }
}