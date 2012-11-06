package StringPermutation;


import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class StringPermutationTest {

    @Test
    public void permutateTest()
    {

        assertEquals("ABC ACB BAC BCA CBA CAB ", StringPermutation.permute("ABC"));
        assertEquals("LAMP LAPM LMAP LMPA LPMA LPAM ALMP ALPM AMLP AMPL APML APLM MALP MAPL MLAP MLPA MPLA MPAL PAML PALM PMAL PMLA PLMA PLAM ", StringPermutation.permute("LAMP"));
    }
}
