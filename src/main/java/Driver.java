public class Driver {

    public static void main (String args[]) {
        /* Quickstart for working with AutoValue (which is an immutable Java value class generator).
            The class structure of the AutoValue class in this quickstart is the same structure
            as the one used in the Beam SDK codebase.

            Having a static inner value class (i.e. non top-level) can be seen in BigQueryIO
            [here](https://github.com/apache/beam/blob/master/sdks/java/io/google-cloud-platform/src/main/java/org/apache/beam/sdk/io/gcp/bigquery/BigQueryIO.java#L1706)
            and in the PTransform dev guide [here](https://beam.apache.org/contribute/ptransform-style-guide/#language-neutral-considerations)
         */

        System.out.println(new AutoValue_Example_Inner.Builder().setAmount(12).setCurrency("usd").build());
    }
}

