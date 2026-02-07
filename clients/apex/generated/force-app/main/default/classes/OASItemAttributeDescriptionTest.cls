@isTest
private class OASItemAttributeDescriptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemAttributeDescription itemAttributeDescription1 = OASItemAttributeDescription.getExample();
        OASItemAttributeDescription itemAttributeDescription2 = itemAttributeDescription1;
        OASItemAttributeDescription itemAttributeDescription3 = new OASItemAttributeDescription();
        OASItemAttributeDescription itemAttributeDescription4 = itemAttributeDescription3;

        System.assert(itemAttributeDescription1.equals(itemAttributeDescription2));
        System.assert(itemAttributeDescription2.equals(itemAttributeDescription1));
        System.assert(itemAttributeDescription1.equals(itemAttributeDescription1));
        System.assert(itemAttributeDescription3.equals(itemAttributeDescription4));
        System.assert(itemAttributeDescription4.equals(itemAttributeDescription3));
        System.assert(itemAttributeDescription3.equals(itemAttributeDescription3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemAttributeDescription itemAttributeDescription1 = OASItemAttributeDescription.getExample();
        OASItemAttributeDescription itemAttributeDescription2 = OASItemAttributeDescription.getExample();
        OASItemAttributeDescription itemAttributeDescription3 = new OASItemAttributeDescription();
        OASItemAttributeDescription itemAttributeDescription4 = new OASItemAttributeDescription();

        System.assert(itemAttributeDescription1.equals(itemAttributeDescription2));
        System.assert(itemAttributeDescription2.equals(itemAttributeDescription1));
        System.assert(itemAttributeDescription3.equals(itemAttributeDescription4));
        System.assert(itemAttributeDescription4.equals(itemAttributeDescription3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemAttributeDescription itemAttributeDescription1 = OASItemAttributeDescription.getExample();
        OASItemAttributeDescription itemAttributeDescription2 = new OASItemAttributeDescription();

        System.assertEquals(false, itemAttributeDescription1.equals('foo'));
        System.assertEquals(false, itemAttributeDescription2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemAttributeDescription itemAttributeDescription1 = OASItemAttributeDescription.getExample();
        OASItemAttributeDescription itemAttributeDescription2 = new OASItemAttributeDescription();
        OASItemAttributeDescription itemAttributeDescription3;

        System.assertEquals(false, itemAttributeDescription1.equals(itemAttributeDescription3));
        System.assertEquals(false, itemAttributeDescription2.equals(itemAttributeDescription3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemAttributeDescription itemAttributeDescription1 = OASItemAttributeDescription.getExample();
        OASItemAttributeDescription itemAttributeDescription2 = new OASItemAttributeDescription();

        System.assertEquals(itemAttributeDescription1.hashCode(), itemAttributeDescription1.hashCode());
        System.assertEquals(itemAttributeDescription2.hashCode(), itemAttributeDescription2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemAttributeDescription itemAttributeDescription1 = OASItemAttributeDescription.getExample();
        OASItemAttributeDescription itemAttributeDescription2 = OASItemAttributeDescription.getExample();
        OASItemAttributeDescription itemAttributeDescription3 = new OASItemAttributeDescription();
        OASItemAttributeDescription itemAttributeDescription4 = new OASItemAttributeDescription();

        System.assert(itemAttributeDescription1.equals(itemAttributeDescription2));
        System.assert(itemAttributeDescription3.equals(itemAttributeDescription4));
        System.assertEquals(itemAttributeDescription1.hashCode(), itemAttributeDescription2.hashCode());
        System.assertEquals(itemAttributeDescription3.hashCode(), itemAttributeDescription4.hashCode());
    }
}
