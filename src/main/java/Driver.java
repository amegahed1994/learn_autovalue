public class Driver {

    public static void main (String args[]) {

        Example.Inner sampleValueObject = new AutoValue_Example_Inner.Builder().setAmount(12).setCurrency("usd").build();
        System.out.println(sampleValueObject);

        /* In the case of the code found [here](https://github.com/apache/beam/blob/master/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/bigquery/BigQueryIO.java#L1702),
            the return type is static because this method is inside the same outer class as the AutoValue class.
         */
    }
}

