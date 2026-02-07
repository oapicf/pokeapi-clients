@isTest
private class OASMoveDetailStatChangesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveDetailStatChangesInner moveDetailStatChangesInner1 = OASMoveDetailStatChangesInner.getExample();
        OASMoveDetailStatChangesInner moveDetailStatChangesInner2 = moveDetailStatChangesInner1;
        OASMoveDetailStatChangesInner moveDetailStatChangesInner3 = new OASMoveDetailStatChangesInner();
        OASMoveDetailStatChangesInner moveDetailStatChangesInner4 = moveDetailStatChangesInner3;

        System.assert(moveDetailStatChangesInner1.equals(moveDetailStatChangesInner2));
        System.assert(moveDetailStatChangesInner2.equals(moveDetailStatChangesInner1));
        System.assert(moveDetailStatChangesInner1.equals(moveDetailStatChangesInner1));
        System.assert(moveDetailStatChangesInner3.equals(moveDetailStatChangesInner4));
        System.assert(moveDetailStatChangesInner4.equals(moveDetailStatChangesInner3));
        System.assert(moveDetailStatChangesInner3.equals(moveDetailStatChangesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveDetailStatChangesInner moveDetailStatChangesInner1 = OASMoveDetailStatChangesInner.getExample();
        OASMoveDetailStatChangesInner moveDetailStatChangesInner2 = OASMoveDetailStatChangesInner.getExample();
        OASMoveDetailStatChangesInner moveDetailStatChangesInner3 = new OASMoveDetailStatChangesInner();
        OASMoveDetailStatChangesInner moveDetailStatChangesInner4 = new OASMoveDetailStatChangesInner();

        System.assert(moveDetailStatChangesInner1.equals(moveDetailStatChangesInner2));
        System.assert(moveDetailStatChangesInner2.equals(moveDetailStatChangesInner1));
        System.assert(moveDetailStatChangesInner3.equals(moveDetailStatChangesInner4));
        System.assert(moveDetailStatChangesInner4.equals(moveDetailStatChangesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveDetailStatChangesInner moveDetailStatChangesInner1 = OASMoveDetailStatChangesInner.getExample();
        OASMoveDetailStatChangesInner moveDetailStatChangesInner2 = new OASMoveDetailStatChangesInner();

        System.assertEquals(false, moveDetailStatChangesInner1.equals('foo'));
        System.assertEquals(false, moveDetailStatChangesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveDetailStatChangesInner moveDetailStatChangesInner1 = OASMoveDetailStatChangesInner.getExample();
        OASMoveDetailStatChangesInner moveDetailStatChangesInner2 = new OASMoveDetailStatChangesInner();
        OASMoveDetailStatChangesInner moveDetailStatChangesInner3;

        System.assertEquals(false, moveDetailStatChangesInner1.equals(moveDetailStatChangesInner3));
        System.assertEquals(false, moveDetailStatChangesInner2.equals(moveDetailStatChangesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveDetailStatChangesInner moveDetailStatChangesInner1 = OASMoveDetailStatChangesInner.getExample();
        OASMoveDetailStatChangesInner moveDetailStatChangesInner2 = new OASMoveDetailStatChangesInner();

        System.assertEquals(moveDetailStatChangesInner1.hashCode(), moveDetailStatChangesInner1.hashCode());
        System.assertEquals(moveDetailStatChangesInner2.hashCode(), moveDetailStatChangesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveDetailStatChangesInner moveDetailStatChangesInner1 = OASMoveDetailStatChangesInner.getExample();
        OASMoveDetailStatChangesInner moveDetailStatChangesInner2 = OASMoveDetailStatChangesInner.getExample();
        OASMoveDetailStatChangesInner moveDetailStatChangesInner3 = new OASMoveDetailStatChangesInner();
        OASMoveDetailStatChangesInner moveDetailStatChangesInner4 = new OASMoveDetailStatChangesInner();

        System.assert(moveDetailStatChangesInner1.equals(moveDetailStatChangesInner2));
        System.assert(moveDetailStatChangesInner3.equals(moveDetailStatChangesInner4));
        System.assertEquals(moveDetailStatChangesInner1.hashCode(), moveDetailStatChangesInner2.hashCode());
        System.assertEquals(moveDetailStatChangesInner3.hashCode(), moveDetailStatChangesInner4.hashCode());
    }
}
