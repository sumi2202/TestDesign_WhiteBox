package com.laksumi.whiteTest;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AppTest 
{
    @Test
    public void words()
    {
        assertEquals(NoOfOccur.checkOccur("pineapples"),
                "\n# of occurrences for p: 3" +
                        "\n# of occurrences for i: 1" +
                        "\n# of occurrences for n: 1" +
                        "\n# of occurrences for e: 2" +
                        "\n# of occurrences for a: 1" +
                        "\n# of occurrences for l: 1" +
                        "\n# of occurrences for s: 1");
        assertEquals(NoOfOccur.checkOccur("Pneumonoultramicroscopicsilicovolcanoconiosis"),
                "\n# of occurrences for P: 1" +
                        "\n# of occurrences for n: 4" +
                        "\n# of occurrences for e: 1" +
                        "\n# of occurrences for u: 2" +
                        "\n# of occurrences for m: 2" +
                        "\n# of occurrences for o: 9" +
                        "\n# of occurrences for l: 3" +
                        "\n# of occurrences for t: 1" +
                        "\n# of occurrences for r: 2" +
                        "\n# of occurrences for a: 2" +
                        "\n# of occurrences for i: 6" +
                        "\n# of occurrences for c: 6" +
                        "\n# of occurrences for s: 4" +
                        "\n# of occurrences for p: 1" +
                        "\n# of occurrences for v: 1");
    }
}
