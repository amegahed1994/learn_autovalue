import javax.annotation.processing.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Main_Inner extends Main.Inner {

  private final String currency;

  private final long amount;

  private AutoValue_Main_Inner(
      String currency,
      long amount) {
    this.currency = currency;
    this.amount = amount;
  }

  @Override
  public String getCurrency() {
    return currency;
  }

  @Override
  public long getAmount() {
    return amount;
  }

  @Override
  public String toString() {
    return "Inner{"
        + "currency=" + currency + ", "
        + "amount=" + amount
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Main.Inner) {
      Main.Inner that = (Main.Inner) o;
      return this.currency.equals(that.getCurrency())
          && this.amount == that.getAmount();
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h$ = 1;
    h$ *= 1000003;
    h$ ^= currency.hashCode();
    h$ *= 1000003;
    h$ ^= (int) ((amount >>> 32) ^ amount);
    return h$;
  }

  @Override
  Main.Inner.Builder tobuilder() {
    return new Builder(this);
  }

  static final class Builder extends Main.Inner.Builder {
    private String currency;
    private Long amount;
    Builder() {
    }
    private Builder(Main.Inner source) {
      this.currency = source.getCurrency();
      this.amount = source.getAmount();
    }
    @Override
    Main.Inner.Builder setCurrency(String currency) {
      if (currency == null) {
        throw new NullPointerException("Null currency");
      }
      this.currency = currency;
      return this;
    }
    @Override
    Main.Inner.Builder setAmount(long amount) {
      this.amount = amount;
      return this;
    }
    @Override
    Main.Inner build() {
      String missing = "";
      if (this.currency == null) {
        missing += " currency";
      }
      if (this.amount == null) {
        missing += " amount";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_Main_Inner(
          this.currency,
          this.amount);
    }
  }

}
