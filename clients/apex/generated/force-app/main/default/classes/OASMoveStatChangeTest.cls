@isTest
private class OASMoveStatChangeTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveStatChange moveStatChange1 = OASMoveStatChange.getExample();
        OASMoveStatChange moveStatChange2 = moveStatChange1;
        OASMoveStatChange moveStatChange3 = new OASMoveStatChange();
        OASMoveStatChange moveStatChange4 = moveStatChange3;

        System.assert(moveStatChange1.equals(moveStatChange2));
        System.assert(moveStatChange2.equals(moveStatChange1));
        System.assert(moveStatChange1.equals(moveStatChange1));
        System.assert(moveStatChange3.equals(moveStatChange4));
        System.assert(moveStatChange4.equals(moveStatChange3));
        System.assert(moveStatChange3.equals(moveStatChange3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveStatChange moveStatChange1 = OASMoveStatChange.getExample();
        OASMoveStatChange moveStatChange2 = OASMoveStatChange.getExample();
        OASMoveStatChange moveStatChange3 = new OASMoveStatChange();
        OASMoveStatChange moveStatChange4 = new OASMoveStatChange();

        System.assert(moveStatChange1.equals(moveStatChange2));
        System.assert(moveStatChange2.equals(moveStatChange1));
        System.assert(moveStatChange3.equals(moveStatChange4));
        System.assert(moveStatChange4.equals(moveStatChange3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveStatChange moveStatChange1 = OASMoveStatChange.getExample();
        OASMoveStatChange moveStatChange2 = new OASMoveStatChange();

        System.assertEquals(false, moveStatChange1.equals('foo'));
        System.assertEquals(false, moveStatChange2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveStatChange moveStatChange1 = OASMoveStatChange.getExample();
        OASMoveStatChange moveStatChange2 = new OASMoveStatChange();
        OASMoveStatChange moveStatChange3;

        System.assertEquals(false, moveStatChange1.equals(moveStatChange3));
        System.assertEquals(false, moveStatChange2.equals(moveStatChange3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveStatChange moveStatChange1 = OASMoveStatChange.getExample();
        OASMoveStatChange moveStatChange2 = new OASMoveStatChange();

        System.assertEquals(moveStatChange1.hashCode(), moveStatChange1.hashCode());
        System.assertEquals(moveStatChange2.hashCode(), moveStatChange2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveStatChange moveStatChange1 = OASMoveStatChange.getExample();
        OASMoveStatChange moveStatChange2 = OASMoveStatChange.getExample();
        OASMoveStatChange moveStatChange3 = new OASMoveStatChange();
        OASMoveStatChange moveStatChange4 = new OASMoveStatChange();

        System.assert(moveStatChange1.equals(moveStatChange2));
        System.assert(moveStatChange3.equals(moveStatChange4));
        System.assertEquals(moveStatChange1.hashCode(), moveStatChange2.hashCode());
        System.assertEquals(moveStatChange3.hashCode(), moveStatChange4.hashCode());
    }
}
