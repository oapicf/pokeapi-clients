@isTest
private class OASBerrySummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASBerrySummary berrySummary1 = OASBerrySummary.getExample();
        OASBerrySummary berrySummary2 = berrySummary1;
        OASBerrySummary berrySummary3 = new OASBerrySummary();
        OASBerrySummary berrySummary4 = berrySummary3;

        System.assert(berrySummary1.equals(berrySummary2));
        System.assert(berrySummary2.equals(berrySummary1));
        System.assert(berrySummary1.equals(berrySummary1));
        System.assert(berrySummary3.equals(berrySummary4));
        System.assert(berrySummary4.equals(berrySummary3));
        System.assert(berrySummary3.equals(berrySummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASBerrySummary berrySummary1 = OASBerrySummary.getExample();
        OASBerrySummary berrySummary2 = OASBerrySummary.getExample();
        OASBerrySummary berrySummary3 = new OASBerrySummary();
        OASBerrySummary berrySummary4 = new OASBerrySummary();

        System.assert(berrySummary1.equals(berrySummary2));
        System.assert(berrySummary2.equals(berrySummary1));
        System.assert(berrySummary3.equals(berrySummary4));
        System.assert(berrySummary4.equals(berrySummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASBerrySummary berrySummary1 = OASBerrySummary.getExample();
        OASBerrySummary berrySummary2 = new OASBerrySummary();

        System.assertEquals(false, berrySummary1.equals('foo'));
        System.assertEquals(false, berrySummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASBerrySummary berrySummary1 = OASBerrySummary.getExample();
        OASBerrySummary berrySummary2 = new OASBerrySummary();
        OASBerrySummary berrySummary3;

        System.assertEquals(false, berrySummary1.equals(berrySummary3));
        System.assertEquals(false, berrySummary2.equals(berrySummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASBerrySummary berrySummary1 = OASBerrySummary.getExample();
        OASBerrySummary berrySummary2 = new OASBerrySummary();

        System.assertEquals(berrySummary1.hashCode(), berrySummary1.hashCode());
        System.assertEquals(berrySummary2.hashCode(), berrySummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASBerrySummary berrySummary1 = OASBerrySummary.getExample();
        OASBerrySummary berrySummary2 = OASBerrySummary.getExample();
        OASBerrySummary berrySummary3 = new OASBerrySummary();
        OASBerrySummary berrySummary4 = new OASBerrySummary();

        System.assert(berrySummary1.equals(berrySummary2));
        System.assert(berrySummary3.equals(berrySummary4));
        System.assertEquals(berrySummary1.hashCode(), berrySummary2.hashCode());
        System.assertEquals(berrySummary3.hashCode(), berrySummary4.hashCode());
    }
}
