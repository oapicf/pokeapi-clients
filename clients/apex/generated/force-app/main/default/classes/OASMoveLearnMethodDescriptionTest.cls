@isTest
private class OASMoveLearnMethodDescriptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveLearnMethodDescription moveLearnMethodDescription1 = OASMoveLearnMethodDescription.getExample();
        OASMoveLearnMethodDescription moveLearnMethodDescription2 = moveLearnMethodDescription1;
        OASMoveLearnMethodDescription moveLearnMethodDescription3 = new OASMoveLearnMethodDescription();
        OASMoveLearnMethodDescription moveLearnMethodDescription4 = moveLearnMethodDescription3;

        System.assert(moveLearnMethodDescription1.equals(moveLearnMethodDescription2));
        System.assert(moveLearnMethodDescription2.equals(moveLearnMethodDescription1));
        System.assert(moveLearnMethodDescription1.equals(moveLearnMethodDescription1));
        System.assert(moveLearnMethodDescription3.equals(moveLearnMethodDescription4));
        System.assert(moveLearnMethodDescription4.equals(moveLearnMethodDescription3));
        System.assert(moveLearnMethodDescription3.equals(moveLearnMethodDescription3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveLearnMethodDescription moveLearnMethodDescription1 = OASMoveLearnMethodDescription.getExample();
        OASMoveLearnMethodDescription moveLearnMethodDescription2 = OASMoveLearnMethodDescription.getExample();
        OASMoveLearnMethodDescription moveLearnMethodDescription3 = new OASMoveLearnMethodDescription();
        OASMoveLearnMethodDescription moveLearnMethodDescription4 = new OASMoveLearnMethodDescription();

        System.assert(moveLearnMethodDescription1.equals(moveLearnMethodDescription2));
        System.assert(moveLearnMethodDescription2.equals(moveLearnMethodDescription1));
        System.assert(moveLearnMethodDescription3.equals(moveLearnMethodDescription4));
        System.assert(moveLearnMethodDescription4.equals(moveLearnMethodDescription3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveLearnMethodDescription moveLearnMethodDescription1 = OASMoveLearnMethodDescription.getExample();
        OASMoveLearnMethodDescription moveLearnMethodDescription2 = new OASMoveLearnMethodDescription();

        System.assertEquals(false, moveLearnMethodDescription1.equals('foo'));
        System.assertEquals(false, moveLearnMethodDescription2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveLearnMethodDescription moveLearnMethodDescription1 = OASMoveLearnMethodDescription.getExample();
        OASMoveLearnMethodDescription moveLearnMethodDescription2 = new OASMoveLearnMethodDescription();
        OASMoveLearnMethodDescription moveLearnMethodDescription3;

        System.assertEquals(false, moveLearnMethodDescription1.equals(moveLearnMethodDescription3));
        System.assertEquals(false, moveLearnMethodDescription2.equals(moveLearnMethodDescription3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveLearnMethodDescription moveLearnMethodDescription1 = OASMoveLearnMethodDescription.getExample();
        OASMoveLearnMethodDescription moveLearnMethodDescription2 = new OASMoveLearnMethodDescription();

        System.assertEquals(moveLearnMethodDescription1.hashCode(), moveLearnMethodDescription1.hashCode());
        System.assertEquals(moveLearnMethodDescription2.hashCode(), moveLearnMethodDescription2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveLearnMethodDescription moveLearnMethodDescription1 = OASMoveLearnMethodDescription.getExample();
        OASMoveLearnMethodDescription moveLearnMethodDescription2 = OASMoveLearnMethodDescription.getExample();
        OASMoveLearnMethodDescription moveLearnMethodDescription3 = new OASMoveLearnMethodDescription();
        OASMoveLearnMethodDescription moveLearnMethodDescription4 = new OASMoveLearnMethodDescription();

        System.assert(moveLearnMethodDescription1.equals(moveLearnMethodDescription2));
        System.assert(moveLearnMethodDescription3.equals(moveLearnMethodDescription4));
        System.assertEquals(moveLearnMethodDescription1.hashCode(), moveLearnMethodDescription2.hashCode());
        System.assertEquals(moveLearnMethodDescription3.hashCode(), moveLearnMethodDescription4.hashCode());
    }
}
