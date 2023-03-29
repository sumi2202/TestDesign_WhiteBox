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
        assertEquals(NoOfOccur.checkOccur("hello"),
                        "\n# of occurrences for h: 1" +
                        "\n# of occurrences for e: 1" +
                        "\n# of occurrences for l: 2" +
                        "\n# of occurrences for o: 1");
    }
    @Test
    public void numbers(){
        assertEquals(NoOfOccur.checkOccur("4164390000"),
                        "\n# of occurrences for 4: 2" +
                        "\n# of occurrences for 1: 1" +
                        "\n# of occurrences for 6: 1" +
                        "\n# of occurrences for 3: 1" +
                        "\n# of occurrences for 9: 1" +
                        "\n# of occurrences for 0: 4");
        assertEquals(NoOfOccur.checkOccur("4166652000"),
                        "\n# of occurrences for 4: 1" +
                        "\n# of occurrences for 1: 1" +
                        "\n# of occurrences for 6: 3" +
                        "\n# of occurrences for 5: 1" +
                        "\n# of occurrences for 2: 1" +
                        "\n# of occurrences for 0: 3");

    }
    @Test
    public void characters(){
        assertEquals(NoOfOccur.checkOccur("+/--+$%"),
                "\n# of occurrences for +: 2" +
                "\n# of occurrences for /: 1" +
                "\n# of occurrences for -: 2" +
                "\n# of occurrences for $: 1" +
                "\n# of occurrences for %: 1");
    }


}

