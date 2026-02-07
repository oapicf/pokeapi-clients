@isTest
private class OASGenerationSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerationSummary generationSummary1 = OASGenerationSummary.getExample();
        OASGenerationSummary generationSummary2 = generationSummary1;
        OASGenerationSummary generationSummary3 = new OASGenerationSummary();
        OASGenerationSummary generationSummary4 = generationSummary3;

        System.assert(generationSummary1.equals(generationSummary2));
        System.assert(generationSummary2.equals(generationSummary1));
        System.assert(generationSummary1.equals(generationSummary1));
        System.assert(generationSummary3.equals(generationSummary4));
        System.assert(generationSummary4.equals(generationSummary3));
        System.assert(generationSummary3.equals(generationSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerationSummary generationSummary1 = OASGenerationSummary.getExample();
        OASGenerationSummary generationSummary2 = OASGenerationSummary.getExample();
        OASGenerationSummary generationSummary3 = new OASGenerationSummary();
        OASGenerationSummary generationSummary4 = new OASGenerationSummary();

        System.assert(generationSummary1.equals(generationSummary2));
        System.assert(generationSummary2.equals(generationSummary1));
        System.assert(generationSummary3.equals(generationSummary4));
        System.assert(generationSummary4.equals(generationSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerationSummary generationSummary1 = OASGenerationSummary.getExample();
        OASGenerationSummary generationSummary2 = new OASGenerationSummary();

        System.assertEquals(false, generationSummary1.equals('foo'));
        System.assertEquals(false, generationSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerationSummary generationSummary1 = OASGenerationSummary.getExample();
        OASGenerationSummary generationSummary2 = new OASGenerationSummary();
        OASGenerationSummary generationSummary3;

        System.assertEquals(false, generationSummary1.equals(generationSummary3));
        System.assertEquals(false, generationSummary2.equals(generationSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerationSummary generationSummary1 = OASGenerationSummary.getExample();
        OASGenerationSummary generationSummary2 = new OASGenerationSummary();

        System.assertEquals(generationSummary1.hashCode(), generationSummary1.hashCode());
        System.assertEquals(generationSummary2.hashCode(), generationSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerationSummary generationSummary1 = OASGenerationSummary.getExample();
        OASGenerationSummary generationSummary2 = OASGenerationSummary.getExample();
        OASGenerationSummary generationSummary3 = new OASGenerationSummary();
        OASGenerationSummary generationSummary4 = new OASGenerationSummary();

        System.assert(generationSummary1.equals(generationSummary2));
        System.assert(generationSummary3.equals(generationSummary4));
        System.assertEquals(generationSummary1.hashCode(), generationSummary2.hashCode());
        System.assertEquals(generationSummary3.hashCode(), generationSummary4.hashCode());
    }
}
