@isTest
private class OASMoveSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveSummary moveSummary1 = OASMoveSummary.getExample();
        OASMoveSummary moveSummary2 = moveSummary1;
        OASMoveSummary moveSummary3 = new OASMoveSummary();
        OASMoveSummary moveSummary4 = moveSummary3;

        System.assert(moveSummary1.equals(moveSummary2));
        System.assert(moveSummary2.equals(moveSummary1));
        System.assert(moveSummary1.equals(moveSummary1));
        System.assert(moveSummary3.equals(moveSummary4));
        System.assert(moveSummary4.equals(moveSummary3));
        System.assert(moveSummary3.equals(moveSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveSummary moveSummary1 = OASMoveSummary.getExample();
        OASMoveSummary moveSummary2 = OASMoveSummary.getExample();
        OASMoveSummary moveSummary3 = new OASMoveSummary();
        OASMoveSummary moveSummary4 = new OASMoveSummary();

        System.assert(moveSummary1.equals(moveSummary2));
        System.assert(moveSummary2.equals(moveSummary1));
        System.assert(moveSummary3.equals(moveSummary4));
        System.assert(moveSummary4.equals(moveSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveSummary moveSummary1 = OASMoveSummary.getExample();
        OASMoveSummary moveSummary2 = new OASMoveSummary();

        System.assertEquals(false, moveSummary1.equals('foo'));
        System.assertEquals(false, moveSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveSummary moveSummary1 = OASMoveSummary.getExample();
        OASMoveSummary moveSummary2 = new OASMoveSummary();
        OASMoveSummary moveSummary3;

        System.assertEquals(false, moveSummary1.equals(moveSummary3));
        System.assertEquals(false, moveSummary2.equals(moveSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveSummary moveSummary1 = OASMoveSummary.getExample();
        OASMoveSummary moveSummary2 = new OASMoveSummary();

        System.assertEquals(moveSummary1.hashCode(), moveSummary1.hashCode());
        System.assertEquals(moveSummary2.hashCode(), moveSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveSummary moveSummary1 = OASMoveSummary.getExample();
        OASMoveSummary moveSummary2 = OASMoveSummary.getExample();
        OASMoveSummary moveSummary3 = new OASMoveSummary();
        OASMoveSummary moveSummary4 = new OASMoveSummary();

        System.assert(moveSummary1.equals(moveSummary2));
        System.assert(moveSummary3.equals(moveSummary4));
        System.assertEquals(moveSummary1.hashCode(), moveSummary2.hashCode());
        System.assertEquals(moveSummary3.hashCode(), moveSummary4.hashCode());
    }
}
