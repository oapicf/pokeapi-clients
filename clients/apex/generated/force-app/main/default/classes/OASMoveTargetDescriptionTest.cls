@isTest
private class OASMoveTargetDescriptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveTargetDescription moveTargetDescription1 = OASMoveTargetDescription.getExample();
        OASMoveTargetDescription moveTargetDescription2 = moveTargetDescription1;
        OASMoveTargetDescription moveTargetDescription3 = new OASMoveTargetDescription();
        OASMoveTargetDescription moveTargetDescription4 = moveTargetDescription3;

        System.assert(moveTargetDescription1.equals(moveTargetDescription2));
        System.assert(moveTargetDescription2.equals(moveTargetDescription1));
        System.assert(moveTargetDescription1.equals(moveTargetDescription1));
        System.assert(moveTargetDescription3.equals(moveTargetDescription4));
        System.assert(moveTargetDescription4.equals(moveTargetDescription3));
        System.assert(moveTargetDescription3.equals(moveTargetDescription3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveTargetDescription moveTargetDescription1 = OASMoveTargetDescription.getExample();
        OASMoveTargetDescription moveTargetDescription2 = OASMoveTargetDescription.getExample();
        OASMoveTargetDescription moveTargetDescription3 = new OASMoveTargetDescription();
        OASMoveTargetDescription moveTargetDescription4 = new OASMoveTargetDescription();

        System.assert(moveTargetDescription1.equals(moveTargetDescription2));
        System.assert(moveTargetDescription2.equals(moveTargetDescription1));
        System.assert(moveTargetDescription3.equals(moveTargetDescription4));
        System.assert(moveTargetDescription4.equals(moveTargetDescription3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveTargetDescription moveTargetDescription1 = OASMoveTargetDescription.getExample();
        OASMoveTargetDescription moveTargetDescription2 = new OASMoveTargetDescription();

        System.assertEquals(false, moveTargetDescription1.equals('foo'));
        System.assertEquals(false, moveTargetDescription2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveTargetDescription moveTargetDescription1 = OASMoveTargetDescription.getExample();
        OASMoveTargetDescription moveTargetDescription2 = new OASMoveTargetDescription();
        OASMoveTargetDescription moveTargetDescription3;

        System.assertEquals(false, moveTargetDescription1.equals(moveTargetDescription3));
        System.assertEquals(false, moveTargetDescription2.equals(moveTargetDescription3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveTargetDescription moveTargetDescription1 = OASMoveTargetDescription.getExample();
        OASMoveTargetDescription moveTargetDescription2 = new OASMoveTargetDescription();

        System.assertEquals(moveTargetDescription1.hashCode(), moveTargetDescription1.hashCode());
        System.assertEquals(moveTargetDescription2.hashCode(), moveTargetDescription2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveTargetDescription moveTargetDescription1 = OASMoveTargetDescription.getExample();
        OASMoveTargetDescription moveTargetDescription2 = OASMoveTargetDescription.getExample();
        OASMoveTargetDescription moveTargetDescription3 = new OASMoveTargetDescription();
        OASMoveTargetDescription moveTargetDescription4 = new OASMoveTargetDescription();

        System.assert(moveTargetDescription1.equals(moveTargetDescription2));
        System.assert(moveTargetDescription3.equals(moveTargetDescription4));
        System.assertEquals(moveTargetDescription1.hashCode(), moveTargetDescription2.hashCode());
        System.assertEquals(moveTargetDescription3.hashCode(), moveTargetDescription4.hashCode());
    }
}
