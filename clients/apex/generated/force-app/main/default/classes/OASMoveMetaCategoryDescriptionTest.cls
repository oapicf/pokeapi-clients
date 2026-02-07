@isTest
private class OASMoveMetaCategoryDescriptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveMetaCategoryDescription moveMetaCategoryDescription1 = OASMoveMetaCategoryDescription.getExample();
        OASMoveMetaCategoryDescription moveMetaCategoryDescription2 = moveMetaCategoryDescription1;
        OASMoveMetaCategoryDescription moveMetaCategoryDescription3 = new OASMoveMetaCategoryDescription();
        OASMoveMetaCategoryDescription moveMetaCategoryDescription4 = moveMetaCategoryDescription3;

        System.assert(moveMetaCategoryDescription1.equals(moveMetaCategoryDescription2));
        System.assert(moveMetaCategoryDescription2.equals(moveMetaCategoryDescription1));
        System.assert(moveMetaCategoryDescription1.equals(moveMetaCategoryDescription1));
        System.assert(moveMetaCategoryDescription3.equals(moveMetaCategoryDescription4));
        System.assert(moveMetaCategoryDescription4.equals(moveMetaCategoryDescription3));
        System.assert(moveMetaCategoryDescription3.equals(moveMetaCategoryDescription3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveMetaCategoryDescription moveMetaCategoryDescription1 = OASMoveMetaCategoryDescription.getExample();
        OASMoveMetaCategoryDescription moveMetaCategoryDescription2 = OASMoveMetaCategoryDescription.getExample();
        OASMoveMetaCategoryDescription moveMetaCategoryDescription3 = new OASMoveMetaCategoryDescription();
        OASMoveMetaCategoryDescription moveMetaCategoryDescription4 = new OASMoveMetaCategoryDescription();

        System.assert(moveMetaCategoryDescription1.equals(moveMetaCategoryDescription2));
        System.assert(moveMetaCategoryDescription2.equals(moveMetaCategoryDescription1));
        System.assert(moveMetaCategoryDescription3.equals(moveMetaCategoryDescription4));
        System.assert(moveMetaCategoryDescription4.equals(moveMetaCategoryDescription3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveMetaCategoryDescription moveMetaCategoryDescription1 = OASMoveMetaCategoryDescription.getExample();
        OASMoveMetaCategoryDescription moveMetaCategoryDescription2 = new OASMoveMetaCategoryDescription();

        System.assertEquals(false, moveMetaCategoryDescription1.equals('foo'));
        System.assertEquals(false, moveMetaCategoryDescription2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveMetaCategoryDescription moveMetaCategoryDescription1 = OASMoveMetaCategoryDescription.getExample();
        OASMoveMetaCategoryDescription moveMetaCategoryDescription2 = new OASMoveMetaCategoryDescription();
        OASMoveMetaCategoryDescription moveMetaCategoryDescription3;

        System.assertEquals(false, moveMetaCategoryDescription1.equals(moveMetaCategoryDescription3));
        System.assertEquals(false, moveMetaCategoryDescription2.equals(moveMetaCategoryDescription3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveMetaCategoryDescription moveMetaCategoryDescription1 = OASMoveMetaCategoryDescription.getExample();
        OASMoveMetaCategoryDescription moveMetaCategoryDescription2 = new OASMoveMetaCategoryDescription();

        System.assertEquals(moveMetaCategoryDescription1.hashCode(), moveMetaCategoryDescription1.hashCode());
        System.assertEquals(moveMetaCategoryDescription2.hashCode(), moveMetaCategoryDescription2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveMetaCategoryDescription moveMetaCategoryDescription1 = OASMoveMetaCategoryDescription.getExample();
        OASMoveMetaCategoryDescription moveMetaCategoryDescription2 = OASMoveMetaCategoryDescription.getExample();
        OASMoveMetaCategoryDescription moveMetaCategoryDescription3 = new OASMoveMetaCategoryDescription();
        OASMoveMetaCategoryDescription moveMetaCategoryDescription4 = new OASMoveMetaCategoryDescription();

        System.assert(moveMetaCategoryDescription1.equals(moveMetaCategoryDescription2));
        System.assert(moveMetaCategoryDescription3.equals(moveMetaCategoryDescription4));
        System.assertEquals(moveMetaCategoryDescription1.hashCode(), moveMetaCategoryDescription2.hashCode());
        System.assertEquals(moveMetaCategoryDescription3.hashCode(), moveMetaCategoryDescription4.hashCode());
    }
}
