@isTest
private class OASMoveTargetNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveTargetName moveTargetName1 = OASMoveTargetName.getExample();
        OASMoveTargetName moveTargetName2 = moveTargetName1;
        OASMoveTargetName moveTargetName3 = new OASMoveTargetName();
        OASMoveTargetName moveTargetName4 = moveTargetName3;

        System.assert(moveTargetName1.equals(moveTargetName2));
        System.assert(moveTargetName2.equals(moveTargetName1));
        System.assert(moveTargetName1.equals(moveTargetName1));
        System.assert(moveTargetName3.equals(moveTargetName4));
        System.assert(moveTargetName4.equals(moveTargetName3));
        System.assert(moveTargetName3.equals(moveTargetName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveTargetName moveTargetName1 = OASMoveTargetName.getExample();
        OASMoveTargetName moveTargetName2 = OASMoveTargetName.getExample();
        OASMoveTargetName moveTargetName3 = new OASMoveTargetName();
        OASMoveTargetName moveTargetName4 = new OASMoveTargetName();

        System.assert(moveTargetName1.equals(moveTargetName2));
        System.assert(moveTargetName2.equals(moveTargetName1));
        System.assert(moveTargetName3.equals(moveTargetName4));
        System.assert(moveTargetName4.equals(moveTargetName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveTargetName moveTargetName1 = OASMoveTargetName.getExample();
        OASMoveTargetName moveTargetName2 = new OASMoveTargetName();

        System.assertEquals(false, moveTargetName1.equals('foo'));
        System.assertEquals(false, moveTargetName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveTargetName moveTargetName1 = OASMoveTargetName.getExample();
        OASMoveTargetName moveTargetName2 = new OASMoveTargetName();
        OASMoveTargetName moveTargetName3;

        System.assertEquals(false, moveTargetName1.equals(moveTargetName3));
        System.assertEquals(false, moveTargetName2.equals(moveTargetName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveTargetName moveTargetName1 = OASMoveTargetName.getExample();
        OASMoveTargetName moveTargetName2 = new OASMoveTargetName();

        System.assertEquals(moveTargetName1.hashCode(), moveTargetName1.hashCode());
        System.assertEquals(moveTargetName2.hashCode(), moveTargetName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveTargetName moveTargetName1 = OASMoveTargetName.getExample();
        OASMoveTargetName moveTargetName2 = OASMoveTargetName.getExample();
        OASMoveTargetName moveTargetName3 = new OASMoveTargetName();
        OASMoveTargetName moveTargetName4 = new OASMoveTargetName();

        System.assert(moveTargetName1.equals(moveTargetName2));
        System.assert(moveTargetName3.equals(moveTargetName4));
        System.assertEquals(moveTargetName1.hashCode(), moveTargetName2.hashCode());
        System.assertEquals(moveTargetName3.hashCode(), moveTargetName4.hashCode());
    }
}
