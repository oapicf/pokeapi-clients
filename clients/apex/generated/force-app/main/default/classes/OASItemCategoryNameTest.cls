@isTest
private class OASItemCategoryNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemCategoryName itemCategoryName1 = OASItemCategoryName.getExample();
        OASItemCategoryName itemCategoryName2 = itemCategoryName1;
        OASItemCategoryName itemCategoryName3 = new OASItemCategoryName();
        OASItemCategoryName itemCategoryName4 = itemCategoryName3;

        System.assert(itemCategoryName1.equals(itemCategoryName2));
        System.assert(itemCategoryName2.equals(itemCategoryName1));
        System.assert(itemCategoryName1.equals(itemCategoryName1));
        System.assert(itemCategoryName3.equals(itemCategoryName4));
        System.assert(itemCategoryName4.equals(itemCategoryName3));
        System.assert(itemCategoryName3.equals(itemCategoryName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemCategoryName itemCategoryName1 = OASItemCategoryName.getExample();
        OASItemCategoryName itemCategoryName2 = OASItemCategoryName.getExample();
        OASItemCategoryName itemCategoryName3 = new OASItemCategoryName();
        OASItemCategoryName itemCategoryName4 = new OASItemCategoryName();

        System.assert(itemCategoryName1.equals(itemCategoryName2));
        System.assert(itemCategoryName2.equals(itemCategoryName1));
        System.assert(itemCategoryName3.equals(itemCategoryName4));
        System.assert(itemCategoryName4.equals(itemCategoryName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemCategoryName itemCategoryName1 = OASItemCategoryName.getExample();
        OASItemCategoryName itemCategoryName2 = new OASItemCategoryName();

        System.assertEquals(false, itemCategoryName1.equals('foo'));
        System.assertEquals(false, itemCategoryName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemCategoryName itemCategoryName1 = OASItemCategoryName.getExample();
        OASItemCategoryName itemCategoryName2 = new OASItemCategoryName();
        OASItemCategoryName itemCategoryName3;

        System.assertEquals(false, itemCategoryName1.equals(itemCategoryName3));
        System.assertEquals(false, itemCategoryName2.equals(itemCategoryName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemCategoryName itemCategoryName1 = OASItemCategoryName.getExample();
        OASItemCategoryName itemCategoryName2 = new OASItemCategoryName();

        System.assertEquals(itemCategoryName1.hashCode(), itemCategoryName1.hashCode());
        System.assertEquals(itemCategoryName2.hashCode(), itemCategoryName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemCategoryName itemCategoryName1 = OASItemCategoryName.getExample();
        OASItemCategoryName itemCategoryName2 = OASItemCategoryName.getExample();
        OASItemCategoryName itemCategoryName3 = new OASItemCategoryName();
        OASItemCategoryName itemCategoryName4 = new OASItemCategoryName();

        System.assert(itemCategoryName1.equals(itemCategoryName2));
        System.assert(itemCategoryName3.equals(itemCategoryName4));
        System.assertEquals(itemCategoryName1.hashCode(), itemCategoryName2.hashCode());
        System.assertEquals(itemCategoryName3.hashCode(), itemCategoryName4.hashCode());
    }
}
