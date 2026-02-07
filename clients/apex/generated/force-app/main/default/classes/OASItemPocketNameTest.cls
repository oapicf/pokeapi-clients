@isTest
private class OASItemPocketNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemPocketName itemPocketName1 = OASItemPocketName.getExample();
        OASItemPocketName itemPocketName2 = itemPocketName1;
        OASItemPocketName itemPocketName3 = new OASItemPocketName();
        OASItemPocketName itemPocketName4 = itemPocketName3;

        System.assert(itemPocketName1.equals(itemPocketName2));
        System.assert(itemPocketName2.equals(itemPocketName1));
        System.assert(itemPocketName1.equals(itemPocketName1));
        System.assert(itemPocketName3.equals(itemPocketName4));
        System.assert(itemPocketName4.equals(itemPocketName3));
        System.assert(itemPocketName3.equals(itemPocketName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemPocketName itemPocketName1 = OASItemPocketName.getExample();
        OASItemPocketName itemPocketName2 = OASItemPocketName.getExample();
        OASItemPocketName itemPocketName3 = new OASItemPocketName();
        OASItemPocketName itemPocketName4 = new OASItemPocketName();

        System.assert(itemPocketName1.equals(itemPocketName2));
        System.assert(itemPocketName2.equals(itemPocketName1));
        System.assert(itemPocketName3.equals(itemPocketName4));
        System.assert(itemPocketName4.equals(itemPocketName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemPocketName itemPocketName1 = OASItemPocketName.getExample();
        OASItemPocketName itemPocketName2 = new OASItemPocketName();

        System.assertEquals(false, itemPocketName1.equals('foo'));
        System.assertEquals(false, itemPocketName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemPocketName itemPocketName1 = OASItemPocketName.getExample();
        OASItemPocketName itemPocketName2 = new OASItemPocketName();
        OASItemPocketName itemPocketName3;

        System.assertEquals(false, itemPocketName1.equals(itemPocketName3));
        System.assertEquals(false, itemPocketName2.equals(itemPocketName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemPocketName itemPocketName1 = OASItemPocketName.getExample();
        OASItemPocketName itemPocketName2 = new OASItemPocketName();

        System.assertEquals(itemPocketName1.hashCode(), itemPocketName1.hashCode());
        System.assertEquals(itemPocketName2.hashCode(), itemPocketName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemPocketName itemPocketName1 = OASItemPocketName.getExample();
        OASItemPocketName itemPocketName2 = OASItemPocketName.getExample();
        OASItemPocketName itemPocketName3 = new OASItemPocketName();
        OASItemPocketName itemPocketName4 = new OASItemPocketName();

        System.assert(itemPocketName1.equals(itemPocketName2));
        System.assert(itemPocketName3.equals(itemPocketName4));
        System.assertEquals(itemPocketName1.hashCode(), itemPocketName2.hashCode());
        System.assertEquals(itemPocketName3.hashCode(), itemPocketName4.hashCode());
    }
}
