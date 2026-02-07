@isTest
private class OASLocationAreaSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationAreaSummary locationAreaSummary1 = OASLocationAreaSummary.getExample();
        OASLocationAreaSummary locationAreaSummary2 = locationAreaSummary1;
        OASLocationAreaSummary locationAreaSummary3 = new OASLocationAreaSummary();
        OASLocationAreaSummary locationAreaSummary4 = locationAreaSummary3;

        System.assert(locationAreaSummary1.equals(locationAreaSummary2));
        System.assert(locationAreaSummary2.equals(locationAreaSummary1));
        System.assert(locationAreaSummary1.equals(locationAreaSummary1));
        System.assert(locationAreaSummary3.equals(locationAreaSummary4));
        System.assert(locationAreaSummary4.equals(locationAreaSummary3));
        System.assert(locationAreaSummary3.equals(locationAreaSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationAreaSummary locationAreaSummary1 = OASLocationAreaSummary.getExample();
        OASLocationAreaSummary locationAreaSummary2 = OASLocationAreaSummary.getExample();
        OASLocationAreaSummary locationAreaSummary3 = new OASLocationAreaSummary();
        OASLocationAreaSummary locationAreaSummary4 = new OASLocationAreaSummary();

        System.assert(locationAreaSummary1.equals(locationAreaSummary2));
        System.assert(locationAreaSummary2.equals(locationAreaSummary1));
        System.assert(locationAreaSummary3.equals(locationAreaSummary4));
        System.assert(locationAreaSummary4.equals(locationAreaSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationAreaSummary locationAreaSummary1 = OASLocationAreaSummary.getExample();
        OASLocationAreaSummary locationAreaSummary2 = new OASLocationAreaSummary();

        System.assertEquals(false, locationAreaSummary1.equals('foo'));
        System.assertEquals(false, locationAreaSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationAreaSummary locationAreaSummary1 = OASLocationAreaSummary.getExample();
        OASLocationAreaSummary locationAreaSummary2 = new OASLocationAreaSummary();
        OASLocationAreaSummary locationAreaSummary3;

        System.assertEquals(false, locationAreaSummary1.equals(locationAreaSummary3));
        System.assertEquals(false, locationAreaSummary2.equals(locationAreaSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationAreaSummary locationAreaSummary1 = OASLocationAreaSummary.getExample();
        OASLocationAreaSummary locationAreaSummary2 = new OASLocationAreaSummary();

        System.assertEquals(locationAreaSummary1.hashCode(), locationAreaSummary1.hashCode());
        System.assertEquals(locationAreaSummary2.hashCode(), locationAreaSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationAreaSummary locationAreaSummary1 = OASLocationAreaSummary.getExample();
        OASLocationAreaSummary locationAreaSummary2 = OASLocationAreaSummary.getExample();
        OASLocationAreaSummary locationAreaSummary3 = new OASLocationAreaSummary();
        OASLocationAreaSummary locationAreaSummary4 = new OASLocationAreaSummary();

        System.assert(locationAreaSummary1.equals(locationAreaSummary2));
        System.assert(locationAreaSummary3.equals(locationAreaSummary4));
        System.assertEquals(locationAreaSummary1.hashCode(), locationAreaSummary2.hashCode());
        System.assertEquals(locationAreaSummary3.hashCode(), locationAreaSummary4.hashCode());
    }
}
