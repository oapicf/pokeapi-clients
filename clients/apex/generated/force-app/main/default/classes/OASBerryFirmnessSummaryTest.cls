@isTest
private class OASBerryFirmnessSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerryFirmnessSummary berryFirmnessSummary1 = OASBerryFirmnessSummary.getExample();
        OASBerryFirmnessSummary berryFirmnessSummary2 = berryFirmnessSummary1;
        OASBerryFirmnessSummary berryFirmnessSummary3 = new OASBerryFirmnessSummary();
        OASBerryFirmnessSummary berryFirmnessSummary4 = berryFirmnessSummary3;

        System.assert(berryFirmnessSummary1.equals(berryFirmnessSummary2));
        System.assert(berryFirmnessSummary2.equals(berryFirmnessSummary1));
        System.assert(berryFirmnessSummary1.equals(berryFirmnessSummary1));
        System.assert(berryFirmnessSummary3.equals(berryFirmnessSummary4));
        System.assert(berryFirmnessSummary4.equals(berryFirmnessSummary3));
        System.assert(berryFirmnessSummary3.equals(berryFirmnessSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerryFirmnessSummary berryFirmnessSummary1 = OASBerryFirmnessSummary.getExample();
        OASBerryFirmnessSummary berryFirmnessSummary2 = OASBerryFirmnessSummary.getExample();
        OASBerryFirmnessSummary berryFirmnessSummary3 = new OASBerryFirmnessSummary();
        OASBerryFirmnessSummary berryFirmnessSummary4 = new OASBerryFirmnessSummary();

        System.assert(berryFirmnessSummary1.equals(berryFirmnessSummary2));
        System.assert(berryFirmnessSummary2.equals(berryFirmnessSummary1));
        System.assert(berryFirmnessSummary3.equals(berryFirmnessSummary4));
        System.assert(berryFirmnessSummary4.equals(berryFirmnessSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerryFirmnessSummary berryFirmnessSummary1 = OASBerryFirmnessSummary.getExample();
        OASBerryFirmnessSummary berryFirmnessSummary2 = new OASBerryFirmnessSummary();

        System.assertEquals(false, berryFirmnessSummary1.equals('foo'));
        System.assertEquals(false, berryFirmnessSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerryFirmnessSummary berryFirmnessSummary1 = OASBerryFirmnessSummary.getExample();
        OASBerryFirmnessSummary berryFirmnessSummary2 = new OASBerryFirmnessSummary();
        OASBerryFirmnessSummary berryFirmnessSummary3;

        System.assertEquals(false, berryFirmnessSummary1.equals(berryFirmnessSummary3));
        System.assertEquals(false, berryFirmnessSummary2.equals(berryFirmnessSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerryFirmnessSummary berryFirmnessSummary1 = OASBerryFirmnessSummary.getExample();
        OASBerryFirmnessSummary berryFirmnessSummary2 = new OASBerryFirmnessSummary();

        System.assertEquals(berryFirmnessSummary1.hashCode(), berryFirmnessSummary1.hashCode());
        System.assertEquals(berryFirmnessSummary2.hashCode(), berryFirmnessSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerryFirmnessSummary berryFirmnessSummary1 = OASBerryFirmnessSummary.getExample();
        OASBerryFirmnessSummary berryFirmnessSummary2 = OASBerryFirmnessSummary.getExample();
        OASBerryFirmnessSummary berryFirmnessSummary3 = new OASBerryFirmnessSummary();
        OASBerryFirmnessSummary berryFirmnessSummary4 = new OASBerryFirmnessSummary();

        System.assert(berryFirmnessSummary1.equals(berryFirmnessSummary2));
        System.assert(berryFirmnessSummary3.equals(berryFirmnessSummary4));
        System.assertEquals(berryFirmnessSummary1.hashCode(), berryFirmnessSummary2.hashCode());
        System.assertEquals(berryFirmnessSummary3.hashCode(), berryFirmnessSummary4.hashCode());
    }
}
