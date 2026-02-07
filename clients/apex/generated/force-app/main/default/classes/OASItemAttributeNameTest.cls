@isTest
private class OASItemAttributeNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemAttributeName itemAttributeName1 = OASItemAttributeName.getExample();
        OASItemAttributeName itemAttributeName2 = itemAttributeName1;
        OASItemAttributeName itemAttributeName3 = new OASItemAttributeName();
        OASItemAttributeName itemAttributeName4 = itemAttributeName3;

        System.assert(itemAttributeName1.equals(itemAttributeName2));
        System.assert(itemAttributeName2.equals(itemAttributeName1));
        System.assert(itemAttributeName1.equals(itemAttributeName1));
        System.assert(itemAttributeName3.equals(itemAttributeName4));
        System.assert(itemAttributeName4.equals(itemAttributeName3));
        System.assert(itemAttributeName3.equals(itemAttributeName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemAttributeName itemAttributeName1 = OASItemAttributeName.getExample();
        OASItemAttributeName itemAttributeName2 = OASItemAttributeName.getExample();
        OASItemAttributeName itemAttributeName3 = new OASItemAttributeName();
        OASItemAttributeName itemAttributeName4 = new OASItemAttributeName();

        System.assert(itemAttributeName1.equals(itemAttributeName2));
        System.assert(itemAttributeName2.equals(itemAttributeName1));
        System.assert(itemAttributeName3.equals(itemAttributeName4));
        System.assert(itemAttributeName4.equals(itemAttributeName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemAttributeName itemAttributeName1 = OASItemAttributeName.getExample();
        OASItemAttributeName itemAttributeName2 = new OASItemAttributeName();

        System.assertEquals(false, itemAttributeName1.equals('foo'));
        System.assertEquals(false, itemAttributeName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemAttributeName itemAttributeName1 = OASItemAttributeName.getExample();
        OASItemAttributeName itemAttributeName2 = new OASItemAttributeName();
        OASItemAttributeName itemAttributeName3;

        System.assertEquals(false, itemAttributeName1.equals(itemAttributeName3));
        System.assertEquals(false, itemAttributeName2.equals(itemAttributeName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemAttributeName itemAttributeName1 = OASItemAttributeName.getExample();
        OASItemAttributeName itemAttributeName2 = new OASItemAttributeName();

        System.assertEquals(itemAttributeName1.hashCode(), itemAttributeName1.hashCode());
        System.assertEquals(itemAttributeName2.hashCode(), itemAttributeName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemAttributeName itemAttributeName1 = OASItemAttributeName.getExample();
        OASItemAttributeName itemAttributeName2 = OASItemAttributeName.getExample();
        OASItemAttributeName itemAttributeName3 = new OASItemAttributeName();
        OASItemAttributeName itemAttributeName4 = new OASItemAttributeName();

        System.assert(itemAttributeName1.equals(itemAttributeName2));
        System.assert(itemAttributeName3.equals(itemAttributeName4));
        System.assertEquals(itemAttributeName1.hashCode(), itemAttributeName2.hashCode());
        System.assertEquals(itemAttributeName3.hashCode(), itemAttributeName4.hashCode());
    }
}
