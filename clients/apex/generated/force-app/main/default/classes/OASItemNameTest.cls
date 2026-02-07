@isTest
private class OASItemNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemName itemName1 = OASItemName.getExample();
        OASItemName itemName2 = itemName1;
        OASItemName itemName3 = new OASItemName();
        OASItemName itemName4 = itemName3;

        System.assert(itemName1.equals(itemName2));
        System.assert(itemName2.equals(itemName1));
        System.assert(itemName1.equals(itemName1));
        System.assert(itemName3.equals(itemName4));
        System.assert(itemName4.equals(itemName3));
        System.assert(itemName3.equals(itemName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemName itemName1 = OASItemName.getExample();
        OASItemName itemName2 = OASItemName.getExample();
        OASItemName itemName3 = new OASItemName();
        OASItemName itemName4 = new OASItemName();

        System.assert(itemName1.equals(itemName2));
        System.assert(itemName2.equals(itemName1));
        System.assert(itemName3.equals(itemName4));
        System.assert(itemName4.equals(itemName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemName itemName1 = OASItemName.getExample();
        OASItemName itemName2 = new OASItemName();

        System.assertEquals(false, itemName1.equals('foo'));
        System.assertEquals(false, itemName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemName itemName1 = OASItemName.getExample();
        OASItemName itemName2 = new OASItemName();
        OASItemName itemName3;

        System.assertEquals(false, itemName1.equals(itemName3));
        System.assertEquals(false, itemName2.equals(itemName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemName itemName1 = OASItemName.getExample();
        OASItemName itemName2 = new OASItemName();

        System.assertEquals(itemName1.hashCode(), itemName1.hashCode());
        System.assertEquals(itemName2.hashCode(), itemName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemName itemName1 = OASItemName.getExample();
        OASItemName itemName2 = OASItemName.getExample();
        OASItemName itemName3 = new OASItemName();
        OASItemName itemName4 = new OASItemName();

        System.assert(itemName1.equals(itemName2));
        System.assert(itemName3.equals(itemName4));
        System.assertEquals(itemName1.hashCode(), itemName2.hashCode());
        System.assertEquals(itemName3.hashCode(), itemName4.hashCode());
    }
}
