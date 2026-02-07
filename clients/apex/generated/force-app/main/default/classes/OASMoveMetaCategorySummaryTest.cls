@isTest
private class OASMoveMetaCategorySummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveMetaCategorySummary moveMetaCategorySummary1 = OASMoveMetaCategorySummary.getExample();
        OASMoveMetaCategorySummary moveMetaCategorySummary2 = moveMetaCategorySummary1;
        OASMoveMetaCategorySummary moveMetaCategorySummary3 = new OASMoveMetaCategorySummary();
        OASMoveMetaCategorySummary moveMetaCategorySummary4 = moveMetaCategorySummary3;

        System.assert(moveMetaCategorySummary1.equals(moveMetaCategorySummary2));
        System.assert(moveMetaCategorySummary2.equals(moveMetaCategorySummary1));
        System.assert(moveMetaCategorySummary1.equals(moveMetaCategorySummary1));
        System.assert(moveMetaCategorySummary3.equals(moveMetaCategorySummary4));
        System.assert(moveMetaCategorySummary4.equals(moveMetaCategorySummary3));
        System.assert(moveMetaCategorySummary3.equals(moveMetaCategorySummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveMetaCategorySummary moveMetaCategorySummary1 = OASMoveMetaCategorySummary.getExample();
        OASMoveMetaCategorySummary moveMetaCategorySummary2 = OASMoveMetaCategorySummary.getExample();
        OASMoveMetaCategorySummary moveMetaCategorySummary3 = new OASMoveMetaCategorySummary();
        OASMoveMetaCategorySummary moveMetaCategorySummary4 = new OASMoveMetaCategorySummary();

        System.assert(moveMetaCategorySummary1.equals(moveMetaCategorySummary2));
        System.assert(moveMetaCategorySummary2.equals(moveMetaCategorySummary1));
        System.assert(moveMetaCategorySummary3.equals(moveMetaCategorySummary4));
        System.assert(moveMetaCategorySummary4.equals(moveMetaCategorySummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveMetaCategorySummary moveMetaCategorySummary1 = OASMoveMetaCategorySummary.getExample();
        OASMoveMetaCategorySummary moveMetaCategorySummary2 = new OASMoveMetaCategorySummary();

        System.assertEquals(false, moveMetaCategorySummary1.equals('foo'));
        System.assertEquals(false, moveMetaCategorySummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveMetaCategorySummary moveMetaCategorySummary1 = OASMoveMetaCategorySummary.getExample();
        OASMoveMetaCategorySummary moveMetaCategorySummary2 = new OASMoveMetaCategorySummary();
        OASMoveMetaCategorySummary moveMetaCategorySummary3;

        System.assertEquals(false, moveMetaCategorySummary1.equals(moveMetaCategorySummary3));
        System.assertEquals(false, moveMetaCategorySummary2.equals(moveMetaCategorySummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveMetaCategorySummary moveMetaCategorySummary1 = OASMoveMetaCategorySummary.getExample();
        OASMoveMetaCategorySummary moveMetaCategorySummary2 = new OASMoveMetaCategorySummary();

        System.assertEquals(moveMetaCategorySummary1.hashCode(), moveMetaCategorySummary1.hashCode());
        System.assertEquals(moveMetaCategorySummary2.hashCode(), moveMetaCategorySummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveMetaCategorySummary moveMetaCategorySummary1 = OASMoveMetaCategorySummary.getExample();
        OASMoveMetaCategorySummary moveMetaCategorySummary2 = OASMoveMetaCategorySummary.getExample();
        OASMoveMetaCategorySummary moveMetaCategorySummary3 = new OASMoveMetaCategorySummary();
        OASMoveMetaCategorySummary moveMetaCategorySummary4 = new OASMoveMetaCategorySummary();

        System.assert(moveMetaCategorySummary1.equals(moveMetaCategorySummary2));
        System.assert(moveMetaCategorySummary3.equals(moveMetaCategorySummary4));
        System.assertEquals(moveMetaCategorySummary1.hashCode(), moveMetaCategorySummary2.hashCode());
        System.assertEquals(moveMetaCategorySummary3.hashCode(), moveMetaCategorySummary4.hashCode());
    }
}
