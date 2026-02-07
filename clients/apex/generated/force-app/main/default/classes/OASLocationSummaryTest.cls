@isTest
private class OASLocationSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationSummary locationSummary1 = OASLocationSummary.getExample();
        OASLocationSummary locationSummary2 = locationSummary1;
        OASLocationSummary locationSummary3 = new OASLocationSummary();
        OASLocationSummary locationSummary4 = locationSummary3;

        System.assert(locationSummary1.equals(locationSummary2));
        System.assert(locationSummary2.equals(locationSummary1));
        System.assert(locationSummary1.equals(locationSummary1));
        System.assert(locationSummary3.equals(locationSummary4));
        System.assert(locationSummary4.equals(locationSummary3));
        System.assert(locationSummary3.equals(locationSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationSummary locationSummary1 = OASLocationSummary.getExample();
        OASLocationSummary locationSummary2 = OASLocationSummary.getExample();
        OASLocationSummary locationSummary3 = new OASLocationSummary();
        OASLocationSummary locationSummary4 = new OASLocationSummary();

        System.assert(locationSummary1.equals(locationSummary2));
        System.assert(locationSummary2.equals(locationSummary1));
        System.assert(locationSummary3.equals(locationSummary4));
        System.assert(locationSummary4.equals(locationSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationSummary locationSummary1 = OASLocationSummary.getExample();
        OASLocationSummary locationSummary2 = new OASLocationSummary();

        System.assertEquals(false, locationSummary1.equals('foo'));
        System.assertEquals(false, locationSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationSummary locationSummary1 = OASLocationSummary.getExample();
        OASLocationSummary locationSummary2 = new OASLocationSummary();
        OASLocationSummary locationSummary3;

        System.assertEquals(false, locationSummary1.equals(locationSummary3));
        System.assertEquals(false, locationSummary2.equals(locationSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationSummary locationSummary1 = OASLocationSummary.getExample();
        OASLocationSummary locationSummary2 = new OASLocationSummary();

        System.assertEquals(locationSummary1.hashCode(), locationSummary1.hashCode());
        System.assertEquals(locationSummary2.hashCode(), locationSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationSummary locationSummary1 = OASLocationSummary.getExample();
        OASLocationSummary locationSummary2 = OASLocationSummary.getExample();
        OASLocationSummary locationSummary3 = new OASLocationSummary();
        OASLocationSummary locationSummary4 = new OASLocationSummary();

        System.assert(locationSummary1.equals(locationSummary2));
        System.assert(locationSummary3.equals(locationSummary4));
        System.assertEquals(locationSummary1.hashCode(), locationSummary2.hashCode());
        System.assertEquals(locationSummary3.hashCode(), locationSummary4.hashCode());
    }
}
