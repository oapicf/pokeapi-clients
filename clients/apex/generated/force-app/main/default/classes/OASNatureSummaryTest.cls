@isTest
private class OASNatureSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASNatureSummary natureSummary1 = OASNatureSummary.getExample();
        OASNatureSummary natureSummary2 = natureSummary1;
        OASNatureSummary natureSummary3 = new OASNatureSummary();
        OASNatureSummary natureSummary4 = natureSummary3;

        System.assert(natureSummary1.equals(natureSummary2));
        System.assert(natureSummary2.equals(natureSummary1));
        System.assert(natureSummary1.equals(natureSummary1));
        System.assert(natureSummary3.equals(natureSummary4));
        System.assert(natureSummary4.equals(natureSummary3));
        System.assert(natureSummary3.equals(natureSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNatureSummary natureSummary1 = OASNatureSummary.getExample();
        OASNatureSummary natureSummary2 = OASNatureSummary.getExample();
        OASNatureSummary natureSummary3 = new OASNatureSummary();
        OASNatureSummary natureSummary4 = new OASNatureSummary();

        System.assert(natureSummary1.equals(natureSummary2));
        System.assert(natureSummary2.equals(natureSummary1));
        System.assert(natureSummary3.equals(natureSummary4));
        System.assert(natureSummary4.equals(natureSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNatureSummary natureSummary1 = OASNatureSummary.getExample();
        OASNatureSummary natureSummary2 = new OASNatureSummary();

        System.assertEquals(false, natureSummary1.equals('foo'));
        System.assertEquals(false, natureSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNatureSummary natureSummary1 = OASNatureSummary.getExample();
        OASNatureSummary natureSummary2 = new OASNatureSummary();
        OASNatureSummary natureSummary3;

        System.assertEquals(false, natureSummary1.equals(natureSummary3));
        System.assertEquals(false, natureSummary2.equals(natureSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNatureSummary natureSummary1 = OASNatureSummary.getExample();
        OASNatureSummary natureSummary2 = new OASNatureSummary();

        System.assertEquals(natureSummary1.hashCode(), natureSummary1.hashCode());
        System.assertEquals(natureSummary2.hashCode(), natureSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNatureSummary natureSummary1 = OASNatureSummary.getExample();
        OASNatureSummary natureSummary2 = OASNatureSummary.getExample();
        OASNatureSummary natureSummary3 = new OASNatureSummary();
        OASNatureSummary natureSummary4 = new OASNatureSummary();

        System.assert(natureSummary1.equals(natureSummary2));
        System.assert(natureSummary3.equals(natureSummary4));
        System.assertEquals(natureSummary1.hashCode(), natureSummary2.hashCode());
        System.assertEquals(natureSummary3.hashCode(), natureSummary4.hashCode());
    }
}
