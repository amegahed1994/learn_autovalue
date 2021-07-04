import com.google.auto.value.AutoValue;

public class Example {
    @AutoValue
    public abstract static class Inner {
        public abstract String getCurrency();

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