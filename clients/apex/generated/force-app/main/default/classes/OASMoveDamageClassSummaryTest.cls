@isTest
private class OASMoveDamageClassSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveDamageClassSummary moveDamageClassSummary1 = OASMoveDamageClassSummary.getExample();
        OASMoveDamageClassSummary moveDamageClassSummary2 = moveDamageClassSummary1;
        OASMoveDamageClassSummary moveDamageClassSummary3 = new OASMoveDamageClassSummary();
        OASMoveDamageClassSummary moveDamageClassSummary4 = moveDamageClassSummary3;

        System.assert(moveDamageClassSummary1.equals(moveDamageClassSummary2));
        System.assert(moveDamageClassSummary2.equals(moveDamageClassSummary1));
        System.assert(moveDamageClassSummary1.equals(moveDamageClassSummary1));
        System.assert(moveDamageClassSummary3.equals(moveDamageClassSummary4));
        System.assert(moveDamageClassSummary4.equals(moveDamageClassSummary3));
        System.assert(moveDamageClassSummary3.equals(moveDamageClassSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveDamageClassSummary moveDamageClassSummary1 = OASMoveDamageClassSummary.getExample();
        OASMoveDamageClassSummary moveDamageClassSummary2 = OASMoveDamageClassSummary.getExample();
        OASMoveDamageClassSummary moveDamageClassSummary3 = new OASMoveDamageClassSummary();
        OASMoveDamageClassSummary moveDamageClassSummary4 = new OASMoveDamageClassSummary();

        System.assert(moveDamageClassSummary1.equals(moveDamageClassSummary2));
        System.assert(moveDamageClassSummary2.equals(moveDamageClassSummary1));
        System.assert(moveDamageClassSummary3.equals(moveDamageClassSummary4));
        System.assert(moveDamageClassSummary4.equals(moveDamageClassSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveDamageClassSummary moveDamageClassSummary1 = OASMoveDamageClassSummary.getExample();
        OASMoveDamageClassSummary moveDamageClassSummary2 = new OASMoveDamageClassSummary();

        System.assertEquals(false, moveDamageClassSummary1.equals('foo'));
        System.assertEquals(false, moveDamageClassSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveDamageClassSummary moveDamageClassSummary1 = OASMoveDamageClassSummary.getExample();
        OASMoveDamageClassSummary moveDamageClassSummary2 = new OASMoveDamageClassSummary();
        OASMoveDamageClassSummary moveDamageClassSummary3;

        System.assertEquals(false, moveDamageClassSummary1.equals(moveDamageClassSummary3));
        System.assertEquals(false, moveDamageClassSummary2.equals(moveDamageClassSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveDamageClassSummary moveDamageClassSummary1 = OASMoveDamageClassSummary.getExample();
        OASMoveDamageClassSummary moveDamageClassSummary2 = new OASMoveDamageClassSummary();

        System.assertEquals(moveDamageClassSummary1.hashCode(), moveDamageClassSummary1.hashCode());
        System.assertEquals(moveDamageClassSummary2.hashCode(), moveDamageClassSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveDamageClassSummary moveDamageClassSummary1 = OASMoveDamageClassSummary.getExample();
        OASMoveDamageClassSummary moveDamageClassSummary2 = OASMoveDamageClassSummary.getExample();
        OASMoveDamageClassSummary moveDamageClassSummary3 = new OASMoveDamageClassSummary();
        OASMoveDamageClassSummary moveDamageClassSummary4 = new OASMoveDamageClassSummary();

        System.assert(moveDamageClassSummary1.equals(moveDamageClassSummary2));
        System.assert(moveDamageClassSummary3.equals(moveDamageClassSummary4));
        System.assertEquals(moveDamageClassSummary1.hashCode(), moveDamageClassSummary2.hashCode());
        System.assertEquals(moveDamageClassSummary3.hashCode(), moveDamageClassSummary4.hashCode());
    }
}
