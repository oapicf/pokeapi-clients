@isTest
private class OASStatSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASStatSummary statSummary1 = OASStatSummary.getExample();
        OASStatSummary statSummary2 = statSummary1;
        OASStatSummary statSummary3 = new OASStatSummary();
        OASStatSummary statSummary4 = statSummary3;

        System.assert(statSummary1.equals(statSummary2));
        System.assert(statSummary2.equals(statSummary1));
        System.assert(statSummary1.equals(statSummary1));
        System.assert(statSummary3.equals(statSummary4));
        System.assert(statSummary4.equals(statSummary3));
        System.assert(statSummary3.equals(statSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASStatSummary statSummary1 = OASStatSummary.getExample();
        OASStatSummary statSummary2 = OASStatSummary.getExample();
        OASStatSummary statSummary3 = new OASStatSummary();
        OASStatSummary statSummary4 = new OASStatSummary();

        System.assert(statSummary1.equals(statSummary2));
        System.assert(statSummary2.equals(statSummary1));
        System.assert(statSummary3.equals(statSummary4));
        System.assert(statSummary4.equals(statSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASStatSummary statSummary1 = OASStatSummary.getExample();
        OASStatSummary statSummary2 = new OASStatSummary();

        System.assertEquals(false, statSummary1.equals('foo'));
        System.assertEquals(false, statSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASStatSummary statSummary1 = OASStatSummary.getExample();
        OASStatSummary statSummary2 = new OASStatSummary();
        OASStatSummary statSummary3;

        System.assertEquals(false, statSummary1.equals(statSummary3));
        System.assertEquals(false, statSummary2.equals(statSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASStatSummary statSummary1 = OASStatSummary.getExample();
        OASStatSummary statSummary2 = new OASStatSummary();

        System.assertEquals(statSummary1.hashCode(), statSummary1.hashCode());
        System.assertEquals(statSummary2.hashCode(), statSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASStatSummary statSummary1 = OASStatSummary.getExample();
        OASStatSummary statSummary2 = OASStatSummary.getExample();
        OASStatSummary statSummary3 = new OASStatSummary();
        OASStatSummary statSummary4 = new OASStatSummary();

        System.assert(statSummary1.equals(statSummary2));
        System.assert(statSummary3.equals(statSummary4));
        System.assertEquals(statSummary1.hashCode(), statSummary2.hashCode());
        System.assertEquals(statSummary3.hashCode(), statSummary4.hashCode());
    }
}
