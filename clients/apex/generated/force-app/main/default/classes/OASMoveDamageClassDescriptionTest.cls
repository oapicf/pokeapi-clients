@isTest
private class OASMoveDamageClassDescriptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveDamageClassDescription moveDamageClassDescription1 = OASMoveDamageClassDescription.getExample();
        OASMoveDamageClassDescription moveDamageClassDescription2 = moveDamageClassDescription1;
        OASMoveDamageClassDescription moveDamageClassDescription3 = new OASMoveDamageClassDescription();
        OASMoveDamageClassDescription moveDamageClassDescription4 = moveDamageClassDescription3;

        System.assert(moveDamageClassDescription1.equals(moveDamageClassDescription2));
        System.assert(moveDamageClassDescription2.equals(moveDamageClassDescription1));
        System.assert(moveDamageClassDescription1.equals(moveDamageClassDescription1));
        System.assert(moveDamageClassDescription3.equals(moveDamageClassDescription4));
        System.assert(moveDamageClassDescription4.equals(moveDamageClassDescription3));
        System.assert(moveDamageClassDescription3.equals(moveDamageClassDescription3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveDamageClassDescription moveDamageClassDescription1 = OASMoveDamageClassDescription.getExample();
        OASMoveDamageClassDescription moveDamageClassDescription2 = OASMoveDamageClassDescription.getExample();
        OASMoveDamageClassDescription moveDamageClassDescription3 = new OASMoveDamageClassDescription();
        OASMoveDamageClassDescription moveDamageClassDescription4 = new OASMoveDamageClassDescription();

        System.assert(moveDamageClassDescription1.equals(moveDamageClassDescription2));
        System.assert(moveDamageClassDescription2.equals(moveDamageClassDescription1));
        System.assert(moveDamageClassDescription3.equals(moveDamageClassDescription4));
        System.assert(moveDamageClassDescription4.equals(moveDamageClassDescription3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveDamageClassDescription moveDamageClassDescription1 = OASMoveDamageClassDescription.getExample();
        OASMoveDamageClassDescription moveDamageClassDescription2 = new OASMoveDamageClassDescription();

        System.assertEquals(false, moveDamageClassDescription1.equals('foo'));
        System.assertEquals(false, moveDamageClassDescription2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveDamageClassDescription moveDamageClassDescription1 = OASMoveDamageClassDescription.getExample();
        OASMoveDamageClassDescription moveDamageClassDescription2 = new OASMoveDamageClassDescription();
        OASMoveDamageClassDescription moveDamageClassDescription3;

        System.assertEquals(false, moveDamageClassDescription1.equals(moveDamageClassDescription3));
        System.assertEquals(false, moveDamageClassDescription2.equals(moveDamageClassDescription3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveDamageClassDescription moveDamageClassDescription1 = OASMoveDamageClassDescription.getExample();
        OASMoveDamageClassDescription moveDamageClassDescription2 = new OASMoveDamageClassDescription();

        System.assertEquals(moveDamageClassDescription1.hashCode(), moveDamageClassDescription1.hashCode());
        System.assertEquals(moveDamageClassDescription2.hashCode(), moveDamageClassDescription2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveDamageClassDescription moveDamageClassDescription1 = OASMoveDamageClassDescription.getExample();
        OASMoveDamageClassDescription moveDamageClassDescription2 = OASMoveDamageClassDescription.getExample();
        OASMoveDamageClassDescription moveDamageClassDescription3 = new OASMoveDamageClassDescription();
        OASMoveDamageClassDescription moveDamageClassDescription4 = new OASMoveDamageClassDescription();

        System.assert(moveDamageClassDescription1.equals(moveDamageClassDescription2));
        System.assert(moveDamageClassDescription3.equals(moveDamageClassDescription4));
        System.assertEquals(moveDamageClassDescription1.hashCode(), moveDamageClassDescription2.hashCode());
        System.assertEquals(moveDamageClassDescription3.hashCode(), moveDamageClassDescription4.hashCode());
    }
}
