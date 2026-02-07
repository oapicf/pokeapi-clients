@isTest
private class OASBerryFlavorSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryFlavorSummary berryFlavorSummary1 = OASBerryFlavorSummary.getExample();
        OASBerryFlavorSummary berryFlavorSummary2 = berryFlavorSummary1;
        OASBerryFlavorSummary berryFlavorSummary3 = new OASBerryFlavorSummary();
        OASBerryFlavorSummary berryFlavorSummary4 = berryFlavorSummary3;

        System.assert(berryFlavorSummary1.equals(berryFlavorSummary2));
        System.assert(berryFlavorSummary2.equals(berryFlavorSummary1));
        System.assert(berryFlavorSummary1.equals(berryFlavorSummary1));
        System.assert(berryFlavorSummary3.equals(berryFlavorSummary4));
        System.assert(berryFlavorSummary4.equals(berryFlavorSummary3));
        System.assert(berryFlavorSummary3.equals(berryFlavorSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryFlavorSummary berryFlavorSummary1 = OASBerryFlavorSummary.getExample();
        OASBerryFlavorSummary berryFlavorSummary2 = OASBerryFlavorSummary.getExample();
        OASBerryFlavorSummary berryFlavorSummary3 = new OASBerryFlavorSummary();
        OASBerryFlavorSummary berryFlavorSummary4 = new OASBerryFlavorSummary();

        System.assert(berryFlavorSummary1.equals(berryFlavorSummary2));
        System.assert(berryFlavorSummary2.equals(berryFlavorSummary1));
        System.assert(berryFlavorSummary3.equals(berryFlavorSummary4));
        System.assert(berryFlavorSummary4.equals(berryFlavorSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryFlavorSummary berryFlavorSummary1 = OASBerryFlavorSummary.getExample();
        OASBerryFlavorSummary berryFlavorSummary2 = new OASBerryFlavorSummary();

        System.assertEquals(false, berryFlavorSummary1.equals('foo'));
        System.assertEquals(false, berryFlavorSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryFlavorSummary berryFlavorSummary1 = OASBerryFlavorSummary.getExample();
        OASBerryFlavorSummary berryFlavorSummary2 = new OASBerryFlavorSummary();
        OASBerryFlavorSummary berryFlavorSummary3;

        System.assertEquals(false, berryFlavorSummary1.equals(berryFlavorSummary3));
        System.assertEquals(false, berryFlavorSummary2.equals(berryFlavorSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryFlavorSummary berryFlavorSummary1 = OASBerryFlavorSummary.getExample();
        OASBerryFlavorSummary berryFlavorSummary2 = new OASBerryFlavorSummary();

        System.assertEquals(berryFlavorSummary1.hashCode(), berryFlavorSummary1.hashCode());
        System.assertEquals(berryFlavorSummary2.hashCode(), berryFlavorSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryFlavorSummary berryFlavorSummary1 = OASBerryFlavorSummary.getExample();
        OASBerryFlavorSummary berryFlavorSummary2 = OASBerryFlavorSummary.getExample();
        OASBerryFlavorSummary berryFlavorSummary3 = new OASBerryFlavorSummary();
        OASBerryFlavorSummary berryFlavorSummary4 = new OASBerryFlavorSummary();

        System.assert(berryFlavorSummary1.equals(berryFlavorSummary2));
        System.assert(berryFlavorSummary3.equals(berryFlavorSummary4));
        System.assertEquals(berryFlavorSummary1.hashCode(), berryFlavorSummary2.hashCode());
        System.assertEquals(berryFlavorSummary3.hashCode(), berryFlavorSummary4.hashCode());
    }
}
