@isTest
private class OASMoveLearnMethodSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveLearnMethodSummary moveLearnMethodSummary1 = OASMoveLearnMethodSummary.getExample();
        OASMoveLearnMethodSummary moveLearnMethodSummary2 = moveLearnMethodSummary1;
        OASMoveLearnMethodSummary moveLearnMethodSummary3 = new OASMoveLearnMethodSummary();
        OASMoveLearnMethodSummary moveLearnMethodSummary4 = moveLearnMethodSummary3;

        System.assert(moveLearnMethodSummary1.equals(moveLearnMethodSummary2));
        System.assert(moveLearnMethodSummary2.equals(moveLearnMethodSummary1));
        System.assert(moveLearnMethodSummary1.equals(moveLearnMethodSummary1));
        System.assert(moveLearnMethodSummary3.equals(moveLearnMethodSummary4));
        System.assert(moveLearnMethodSummary4.equals(moveLearnMethodSummary3));
        System.assert(moveLearnMethodSummary3.equals(moveLearnMethodSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveLearnMethodSummary moveLearnMethodSummary1 = OASMoveLearnMethodSummary.getExample();
        OASMoveLearnMethodSummary moveLearnMethodSummary2 = OASMoveLearnMethodSummary.getExample();
        OASMoveLearnMethodSummary moveLearnMethodSummary3 = new OASMoveLearnMethodSummary();
        OASMoveLearnMethodSummary moveLearnMethodSummary4 = new OASMoveLearnMethodSummary();

        System.assert(moveLearnMethodSummary1.equals(moveLearnMethodSummary2));
        System.assert(moveLearnMethodSummary2.equals(moveLearnMethodSummary1));
        System.assert(moveLearnMethodSummary3.equals(moveLearnMethodSummary4));
        System.assert(moveLearnMethodSummary4.equals(moveLearnMethodSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveLearnMethodSummary moveLearnMethodSummary1 = OASMoveLearnMethodSummary.getExample();
        OASMoveLearnMethodSummary moveLearnMethodSummary2 = new OASMoveLearnMethodSummary();

        System.assertEquals(false, moveLearnMethodSummary1.equals('foo'));
        System.assertEquals(false, moveLearnMethodSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveLearnMethodSummary moveLearnMethodSummary1 = OASMoveLearnMethodSummary.getExample();
        OASMoveLearnMethodSummary moveLearnMethodSummary2 = new OASMoveLearnMethodSummary();
        OASMoveLearnMethodSummary moveLearnMethodSummary3;

        System.assertEquals(false, moveLearnMethodSummary1.equals(moveLearnMethodSummary3));
        System.assertEquals(false, moveLearnMethodSummary2.equals(moveLearnMethodSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveLearnMethodSummary moveLearnMethodSummary1 = OASMoveLearnMethodSummary.getExample();
        OASMoveLearnMethodSummary moveLearnMethodSummary2 = new OASMoveLearnMethodSummary();

        System.assertEquals(moveLearnMethodSummary1.hashCode(), moveLearnMethodSummary1.hashCode());
        System.assertEquals(moveLearnMethodSummary2.hashCode(), moveLearnMethodSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveLearnMethodSummary moveLearnMethodSummary1 = OASMoveLearnMethodSummary.getExample();
        OASMoveLearnMethodSummary moveLearnMethodSummary2 = OASMoveLearnMethodSummary.getExample();
        OASMoveLearnMethodSummary moveLearnMethodSummary3 = new OASMoveLearnMethodSummary();
        OASMoveLearnMethodSummary moveLearnMethodSummary4 = new OASMoveLearnMethodSummary();

        System.assert(moveLearnMethodSummary1.equals(moveLearnMethodSummary2));
        System.assert(moveLearnMethodSummary3.equals(moveLearnMethodSummary4));
        System.assertEquals(moveLearnMethodSummary1.hashCode(), moveLearnMethodSummary2.hashCode());
        System.assertEquals(moveLearnMethodSummary3.hashCode(), moveLearnMethodSummary4.hashCode());
    }
}
