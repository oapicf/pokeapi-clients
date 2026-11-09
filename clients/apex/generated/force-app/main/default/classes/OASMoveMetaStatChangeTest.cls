@isTest
private class OASMoveMetaStatChangeTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveMetaStatChange moveMetaStatChange1 = OASMoveMetaStatChange.getExample();
        OASMoveMetaStatChange moveMetaStatChange2 = moveMetaStatChange1;
        OASMoveMetaStatChange moveMetaStatChange3 = new OASMoveMetaStatChange();
        OASMoveMetaStatChange moveMetaStatChange4 = moveMetaStatChange3;

        System.assert(moveMetaStatChange1.equals(moveMetaStatChange2));
        System.assert(moveMetaStatChange2.equals(moveMetaStatChange1));
        System.assert(moveMetaStatChange1.equals(moveMetaStatChange1));
        System.assert(moveMetaStatChange3.equals(moveMetaStatChange4));
        System.assert(moveMetaStatChange4.equals(moveMetaStatChange3));
        System.assert(moveMetaStatChange3.equals(moveMetaStatChange3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveMetaStatChange moveMetaStatChange1 = OASMoveMetaStatChange.getExample();
        OASMoveMetaStatChange moveMetaStatChange2 = OASMoveMetaStatChange.getExample();
        OASMoveMetaStatChange moveMetaStatChange3 = new OASMoveMetaStatChange();
        OASMoveMetaStatChange moveMetaStatChange4 = new OASMoveMetaStatChange();

        System.assert(moveMetaStatChange1.equals(moveMetaStatChange2));
        System.assert(moveMetaStatChange2.equals(moveMetaStatChange1));
        System.assert(moveMetaStatChange3.equals(moveMetaStatChange4));
        System.assert(moveMetaStatChange4.equals(moveMetaStatChange3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveMetaStatChange moveMetaStatChange1 = OASMoveMetaStatChange.getExample();
        OASMoveMetaStatChange moveMetaStatChange2 = new OASMoveMetaStatChange();

        System.assertEquals(false, moveMetaStatChange1.equals('foo'));
        System.assertEquals(false, moveMetaStatChange2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveMetaStatChange moveMetaStatChange1 = OASMoveMetaStatChange.getExample();
        OASMoveMetaStatChange moveMetaStatChange2 = new OASMoveMetaStatChange();
        OASMoveMetaStatChange moveMetaStatChange3;

        System.assertEquals(false, moveMetaStatChange1.equals(moveMetaStatChange3));
        System.assertEquals(false, moveMetaStatChange2.equals(moveMetaStatChange3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveMetaStatChange moveMetaStatChange1 = OASMoveMetaStatChange.getExample();
        OASMoveMetaStatChange moveMetaStatChange2 = new OASMoveMetaStatChange();

        System.assertEquals(moveMetaStatChange1.hashCode(), moveMetaStatChange1.hashCode());
        System.assertEquals(moveMetaStatChange2.hashCode(), moveMetaStatChange2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveMetaStatChange moveMetaStatChange1 = OASMoveMetaStatChange.getExample();
        OASMoveMetaStatChange moveMetaStatChange2 = OASMoveMetaStatChange.getExample();
        OASMoveMetaStatChange moveMetaStatChange3 = new OASMoveMetaStatChange();
        OASMoveMetaStatChange moveMetaStatChange4 = new OASMoveMetaStatChange();

        System.assert(moveMetaStatChange1.equals(moveMetaStatChange2));
        System.assert(moveMetaStatChange3.equals(moveMetaStatChange4));
        System.assertEquals(moveMetaStatChange1.hashCode(), moveMetaStatChange2.hashCode());
        System.assertEquals(moveMetaStatChange3.hashCode(), moveMetaStatChange4.hashCode());
    }
}
