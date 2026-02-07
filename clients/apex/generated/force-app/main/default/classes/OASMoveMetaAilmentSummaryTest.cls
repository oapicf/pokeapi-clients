@isTest
private class OASMoveMetaAilmentSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveMetaAilmentSummary moveMetaAilmentSummary1 = OASMoveMetaAilmentSummary.getExample();
        OASMoveMetaAilmentSummary moveMetaAilmentSummary2 = moveMetaAilmentSummary1;
        OASMoveMetaAilmentSummary moveMetaAilmentSummary3 = new OASMoveMetaAilmentSummary();
        OASMoveMetaAilmentSummary moveMetaAilmentSummary4 = moveMetaAilmentSummary3;

        System.assert(moveMetaAilmentSummary1.equals(moveMetaAilmentSummary2));
        System.assert(moveMetaAilmentSummary2.equals(moveMetaAilmentSummary1));
        System.assert(moveMetaAilmentSummary1.equals(moveMetaAilmentSummary1));
        System.assert(moveMetaAilmentSummary3.equals(moveMetaAilmentSummary4));
        System.assert(moveMetaAilmentSummary4.equals(moveMetaAilmentSummary3));
        System.assert(moveMetaAilmentSummary3.equals(moveMetaAilmentSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveMetaAilmentSummary moveMetaAilmentSummary1 = OASMoveMetaAilmentSummary.getExample();
        OASMoveMetaAilmentSummary moveMetaAilmentSummary2 = OASMoveMetaAilmentSummary.getExample();
        OASMoveMetaAilmentSummary moveMetaAilmentSummary3 = new OASMoveMetaAilmentSummary();
        OASMoveMetaAilmentSummary moveMetaAilmentSummary4 = new OASMoveMetaAilmentSummary();

        System.assert(moveMetaAilmentSummary1.equals(moveMetaAilmentSummary2));
        System.assert(moveMetaAilmentSummary2.equals(moveMetaAilmentSummary1));
        System.assert(moveMetaAilmentSummary3.equals(moveMetaAilmentSummary4));
        System.assert(moveMetaAilmentSummary4.equals(moveMetaAilmentSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveMetaAilmentSummary moveMetaAilmentSummary1 = OASMoveMetaAilmentSummary.getExample();
        OASMoveMetaAilmentSummary moveMetaAilmentSummary2 = new OASMoveMetaAilmentSummary();

        System.assertEquals(false, moveMetaAilmentSummary1.equals('foo'));
        System.assertEquals(false, moveMetaAilmentSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveMetaAilmentSummary moveMetaAilmentSummary1 = OASMoveMetaAilmentSummary.getExample();
        OASMoveMetaAilmentSummary moveMetaAilmentSummary2 = new OASMoveMetaAilmentSummary();
        OASMoveMetaAilmentSummary moveMetaAilmentSummary3;

        System.assertEquals(false, moveMetaAilmentSummary1.equals(moveMetaAilmentSummary3));
        System.assertEquals(false, moveMetaAilmentSummary2.equals(moveMetaAilmentSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveMetaAilmentSummary moveMetaAilmentSummary1 = OASMoveMetaAilmentSummary.getExample();
        OASMoveMetaAilmentSummary moveMetaAilmentSummary2 = new OASMoveMetaAilmentSummary();

        System.assertEquals(moveMetaAilmentSummary1.hashCode(), moveMetaAilmentSummary1.hashCode());
        System.assertEquals(moveMetaAilmentSummary2.hashCode(), moveMetaAilmentSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveMetaAilmentSummary moveMetaAilmentSummary1 = OASMoveMetaAilmentSummary.getExample();
        OASMoveMetaAilmentSummary moveMetaAilmentSummary2 = OASMoveMetaAilmentSummary.getExample();
        OASMoveMetaAilmentSummary moveMetaAilmentSummary3 = new OASMoveMetaAilmentSummary();
        OASMoveMetaAilmentSummary moveMetaAilmentSummary4 = new OASMoveMetaAilmentSummary();

        System.assert(moveMetaAilmentSummary1.equals(moveMetaAilmentSummary2));
        System.assert(moveMetaAilmentSummary3.equals(moveMetaAilmentSummary4));
        System.assertEquals(moveMetaAilmentSummary1.hashCode(), moveMetaAilmentSummary2.hashCode());
        System.assertEquals(moveMetaAilmentSummary3.hashCode(), moveMetaAilmentSummary4.hashCode());
    }
}
