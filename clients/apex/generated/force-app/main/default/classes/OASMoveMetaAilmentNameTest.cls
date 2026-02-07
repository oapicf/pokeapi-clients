@isTest
private class OASMoveMetaAilmentNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveMetaAilmentName moveMetaAilmentName1 = OASMoveMetaAilmentName.getExample();
        OASMoveMetaAilmentName moveMetaAilmentName2 = moveMetaAilmentName1;
        OASMoveMetaAilmentName moveMetaAilmentName3 = new OASMoveMetaAilmentName();
        OASMoveMetaAilmentName moveMetaAilmentName4 = moveMetaAilmentName3;

        System.assert(moveMetaAilmentName1.equals(moveMetaAilmentName2));
        System.assert(moveMetaAilmentName2.equals(moveMetaAilmentName1));
        System.assert(moveMetaAilmentName1.equals(moveMetaAilmentName1));
        System.assert(moveMetaAilmentName3.equals(moveMetaAilmentName4));
        System.assert(moveMetaAilmentName4.equals(moveMetaAilmentName3));
        System.assert(moveMetaAilmentName3.equals(moveMetaAilmentName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveMetaAilmentName moveMetaAilmentName1 = OASMoveMetaAilmentName.getExample();
        OASMoveMetaAilmentName moveMetaAilmentName2 = OASMoveMetaAilmentName.getExample();
        OASMoveMetaAilmentName moveMetaAilmentName3 = new OASMoveMetaAilmentName();
        OASMoveMetaAilmentName moveMetaAilmentName4 = new OASMoveMetaAilmentName();

        System.assert(moveMetaAilmentName1.equals(moveMetaAilmentName2));
        System.assert(moveMetaAilmentName2.equals(moveMetaAilmentName1));
        System.assert(moveMetaAilmentName3.equals(moveMetaAilmentName4));
        System.assert(moveMetaAilmentName4.equals(moveMetaAilmentName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveMetaAilmentName moveMetaAilmentName1 = OASMoveMetaAilmentName.getExample();
        OASMoveMetaAilmentName moveMetaAilmentName2 = new OASMoveMetaAilmentName();

        System.assertEquals(false, moveMetaAilmentName1.equals('foo'));
        System.assertEquals(false, moveMetaAilmentName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveMetaAilmentName moveMetaAilmentName1 = OASMoveMetaAilmentName.getExample();
        OASMoveMetaAilmentName moveMetaAilmentName2 = new OASMoveMetaAilmentName();
        OASMoveMetaAilmentName moveMetaAilmentName3;

        System.assertEquals(false, moveMetaAilmentName1.equals(moveMetaAilmentName3));
        System.assertEquals(false, moveMetaAilmentName2.equals(moveMetaAilmentName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveMetaAilmentName moveMetaAilmentName1 = OASMoveMetaAilmentName.getExample();
        OASMoveMetaAilmentName moveMetaAilmentName2 = new OASMoveMetaAilmentName();

        System.assertEquals(moveMetaAilmentName1.hashCode(), moveMetaAilmentName1.hashCode());
        System.assertEquals(moveMetaAilmentName2.hashCode(), moveMetaAilmentName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveMetaAilmentName moveMetaAilmentName1 = OASMoveMetaAilmentName.getExample();
        OASMoveMetaAilmentName moveMetaAilmentName2 = OASMoveMetaAilmentName.getExample();
        OASMoveMetaAilmentName moveMetaAilmentName3 = new OASMoveMetaAilmentName();
        OASMoveMetaAilmentName moveMetaAilmentName4 = new OASMoveMetaAilmentName();

        System.assert(moveMetaAilmentName1.equals(moveMetaAilmentName2));
        System.assert(moveMetaAilmentName3.equals(moveMetaAilmentName4));
        System.assertEquals(moveMetaAilmentName1.hashCode(), moveMetaAilmentName2.hashCode());
        System.assertEquals(moveMetaAilmentName3.hashCode(), moveMetaAilmentName4.hashCode());
    }
}
