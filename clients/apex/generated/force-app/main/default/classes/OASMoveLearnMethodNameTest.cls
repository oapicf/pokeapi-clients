@isTest
private class OASMoveLearnMethodNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveLearnMethodName moveLearnMethodName1 = OASMoveLearnMethodName.getExample();
        OASMoveLearnMethodName moveLearnMethodName2 = moveLearnMethodName1;
        OASMoveLearnMethodName moveLearnMethodName3 = new OASMoveLearnMethodName();
        OASMoveLearnMethodName moveLearnMethodName4 = moveLearnMethodName3;

        System.assert(moveLearnMethodName1.equals(moveLearnMethodName2));
        System.assert(moveLearnMethodName2.equals(moveLearnMethodName1));
        System.assert(moveLearnMethodName1.equals(moveLearnMethodName1));
        System.assert(moveLearnMethodName3.equals(moveLearnMethodName4));
        System.assert(moveLearnMethodName4.equals(moveLearnMethodName3));
        System.assert(moveLearnMethodName3.equals(moveLearnMethodName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveLearnMethodName moveLearnMethodName1 = OASMoveLearnMethodName.getExample();
        OASMoveLearnMethodName moveLearnMethodName2 = OASMoveLearnMethodName.getExample();
        OASMoveLearnMethodName moveLearnMethodName3 = new OASMoveLearnMethodName();
        OASMoveLearnMethodName moveLearnMethodName4 = new OASMoveLearnMethodName();

        System.assert(moveLearnMethodName1.equals(moveLearnMethodName2));
        System.assert(moveLearnMethodName2.equals(moveLearnMethodName1));
        System.assert(moveLearnMethodName3.equals(moveLearnMethodName4));
        System.assert(moveLearnMethodName4.equals(moveLearnMethodName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveLearnMethodName moveLearnMethodName1 = OASMoveLearnMethodName.getExample();
        OASMoveLearnMethodName moveLearnMethodName2 = new OASMoveLearnMethodName();

        System.assertEquals(false, moveLearnMethodName1.equals('foo'));
        System.assertEquals(false, moveLearnMethodName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveLearnMethodName moveLearnMethodName1 = OASMoveLearnMethodName.getExample();
        OASMoveLearnMethodName moveLearnMethodName2 = new OASMoveLearnMethodName();
        OASMoveLearnMethodName moveLearnMethodName3;

        System.assertEquals(false, moveLearnMethodName1.equals(moveLearnMethodName3));
        System.assertEquals(false, moveLearnMethodName2.equals(moveLearnMethodName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveLearnMethodName moveLearnMethodName1 = OASMoveLearnMethodName.getExample();
        OASMoveLearnMethodName moveLearnMethodName2 = new OASMoveLearnMethodName();

        System.assertEquals(moveLearnMethodName1.hashCode(), moveLearnMethodName1.hashCode());
        System.assertEquals(moveLearnMethodName2.hashCode(), moveLearnMethodName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveLearnMethodName moveLearnMethodName1 = OASMoveLearnMethodName.getExample();
        OASMoveLearnMethodName moveLearnMethodName2 = OASMoveLearnMethodName.getExample();
        OASMoveLearnMethodName moveLearnMethodName3 = new OASMoveLearnMethodName();
        OASMoveLearnMethodName moveLearnMethodName4 = new OASMoveLearnMethodName();

        System.assert(moveLearnMethodName1.equals(moveLearnMethodName2));
        System.assert(moveLearnMethodName3.equals(moveLearnMethodName4));
        System.assertEquals(moveLearnMethodName1.hashCode(), moveLearnMethodName2.hashCode());
        System.assertEquals(moveLearnMethodName3.hashCode(), moveLearnMethodName4.hashCode());
    }
}
