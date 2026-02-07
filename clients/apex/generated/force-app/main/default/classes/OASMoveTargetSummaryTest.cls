@isTest
private class OASMoveTargetSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveTargetSummary moveTargetSummary1 = OASMoveTargetSummary.getExample();
        OASMoveTargetSummary moveTargetSummary2 = moveTargetSummary1;
        OASMoveTargetSummary moveTargetSummary3 = new OASMoveTargetSummary();
        OASMoveTargetSummary moveTargetSummary4 = moveTargetSummary3;

        System.assert(moveTargetSummary1.equals(moveTargetSummary2));
        System.assert(moveTargetSummary2.equals(moveTargetSummary1));
        System.assert(moveTargetSummary1.equals(moveTargetSummary1));
        System.assert(moveTargetSummary3.equals(moveTargetSummary4));
        System.assert(moveTargetSummary4.equals(moveTargetSummary3));
        System.assert(moveTargetSummary3.equals(moveTargetSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveTargetSummary moveTargetSummary1 = OASMoveTargetSummary.getExample();
        OASMoveTargetSummary moveTargetSummary2 = OASMoveTargetSummary.getExample();
        OASMoveTargetSummary moveTargetSummary3 = new OASMoveTargetSummary();
        OASMoveTargetSummary moveTargetSummary4 = new OASMoveTargetSummary();

        System.assert(moveTargetSummary1.equals(moveTargetSummary2));
        System.assert(moveTargetSummary2.equals(moveTargetSummary1));
        System.assert(moveTargetSummary3.equals(moveTargetSummary4));
        System.assert(moveTargetSummary4.equals(moveTargetSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveTargetSummary moveTargetSummary1 = OASMoveTargetSummary.getExample();
        OASMoveTargetSummary moveTargetSummary2 = new OASMoveTargetSummary();

        System.assertEquals(false, moveTargetSummary1.equals('foo'));
        System.assertEquals(false, moveTargetSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveTargetSummary moveTargetSummary1 = OASMoveTargetSummary.getExample();
        OASMoveTargetSummary moveTargetSummary2 = new OASMoveTargetSummary();
        OASMoveTargetSummary moveTargetSummary3;

        System.assertEquals(false, moveTargetSummary1.equals(moveTargetSummary3));
        System.assertEquals(false, moveTargetSummary2.equals(moveTargetSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveTargetSummary moveTargetSummary1 = OASMoveTargetSummary.getExample();
        OASMoveTargetSummary moveTargetSummary2 = new OASMoveTargetSummary();

        System.assertEquals(moveTargetSummary1.hashCode(), moveTargetSummary1.hashCode());
        System.assertEquals(moveTargetSummary2.hashCode(), moveTargetSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveTargetSummary moveTargetSummary1 = OASMoveTargetSummary.getExample();
        OASMoveTargetSummary moveTargetSummary2 = OASMoveTargetSummary.getExample();
        OASMoveTargetSummary moveTargetSummary3 = new OASMoveTargetSummary();
        OASMoveTargetSummary moveTargetSummary4 = new OASMoveTargetSummary();

        System.assert(moveTargetSummary1.equals(moveTargetSummary2));
        System.assert(moveTargetSummary3.equals(moveTargetSummary4));
        System.assertEquals(moveTargetSummary1.hashCode(), moveTargetSummary2.hashCode());
        System.assertEquals(moveTargetSummary3.hashCode(), moveTargetSummary4.hashCode());
    }
}
