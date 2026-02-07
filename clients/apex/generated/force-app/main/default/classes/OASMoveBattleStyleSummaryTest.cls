@isTest
private class OASMoveBattleStyleSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveBattleStyleSummary moveBattleStyleSummary1 = OASMoveBattleStyleSummary.getExample();
        OASMoveBattleStyleSummary moveBattleStyleSummary2 = moveBattleStyleSummary1;
        OASMoveBattleStyleSummary moveBattleStyleSummary3 = new OASMoveBattleStyleSummary();
        OASMoveBattleStyleSummary moveBattleStyleSummary4 = moveBattleStyleSummary3;

        System.assert(moveBattleStyleSummary1.equals(moveBattleStyleSummary2));
        System.assert(moveBattleStyleSummary2.equals(moveBattleStyleSummary1));
        System.assert(moveBattleStyleSummary1.equals(moveBattleStyleSummary1));
        System.assert(moveBattleStyleSummary3.equals(moveBattleStyleSummary4));
        System.assert(moveBattleStyleSummary4.equals(moveBattleStyleSummary3));
        System.assert(moveBattleStyleSummary3.equals(moveBattleStyleSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveBattleStyleSummary moveBattleStyleSummary1 = OASMoveBattleStyleSummary.getExample();
        OASMoveBattleStyleSummary moveBattleStyleSummary2 = OASMoveBattleStyleSummary.getExample();
        OASMoveBattleStyleSummary moveBattleStyleSummary3 = new OASMoveBattleStyleSummary();
        OASMoveBattleStyleSummary moveBattleStyleSummary4 = new OASMoveBattleStyleSummary();

        System.assert(moveBattleStyleSummary1.equals(moveBattleStyleSummary2));
        System.assert(moveBattleStyleSummary2.equals(moveBattleStyleSummary1));
        System.assert(moveBattleStyleSummary3.equals(moveBattleStyleSummary4));
        System.assert(moveBattleStyleSummary4.equals(moveBattleStyleSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveBattleStyleSummary moveBattleStyleSummary1 = OASMoveBattleStyleSummary.getExample();
        OASMoveBattleStyleSummary moveBattleStyleSummary2 = new OASMoveBattleStyleSummary();

        System.assertEquals(false, moveBattleStyleSummary1.equals('foo'));
        System.assertEquals(false, moveBattleStyleSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveBattleStyleSummary moveBattleStyleSummary1 = OASMoveBattleStyleSummary.getExample();
        OASMoveBattleStyleSummary moveBattleStyleSummary2 = new OASMoveBattleStyleSummary();
        OASMoveBattleStyleSummary moveBattleStyleSummary3;

        System.assertEquals(false, moveBattleStyleSummary1.equals(moveBattleStyleSummary3));
        System.assertEquals(false, moveBattleStyleSummary2.equals(moveBattleStyleSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveBattleStyleSummary moveBattleStyleSummary1 = OASMoveBattleStyleSummary.getExample();
        OASMoveBattleStyleSummary moveBattleStyleSummary2 = new OASMoveBattleStyleSummary();

        System.assertEquals(moveBattleStyleSummary1.hashCode(), moveBattleStyleSummary1.hashCode());
        System.assertEquals(moveBattleStyleSummary2.hashCode(), moveBattleStyleSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveBattleStyleSummary moveBattleStyleSummary1 = OASMoveBattleStyleSummary.getExample();
        OASMoveBattleStyleSummary moveBattleStyleSummary2 = OASMoveBattleStyleSummary.getExample();
        OASMoveBattleStyleSummary moveBattleStyleSummary3 = new OASMoveBattleStyleSummary();
        OASMoveBattleStyleSummary moveBattleStyleSummary4 = new OASMoveBattleStyleSummary();

        System.assert(moveBattleStyleSummary1.equals(moveBattleStyleSummary2));
        System.assert(moveBattleStyleSummary3.equals(moveBattleStyleSummary4));
        System.assertEquals(moveBattleStyleSummary1.hashCode(), moveBattleStyleSummary2.hashCode());
        System.assertEquals(moveBattleStyleSummary3.hashCode(), moveBattleStyleSummary4.hashCode());
    }
}
