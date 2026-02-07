@isTest
private class OASItemCategoryDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemCategoryDetail itemCategoryDetail1 = OASItemCategoryDetail.getExample();
        OASItemCategoryDetail itemCategoryDetail2 = itemCategoryDetail1;
        OASItemCategoryDetail itemCategoryDetail3 = new OASItemCategoryDetail();
        OASItemCategoryDetail itemCategoryDetail4 = itemCategoryDetail3;

        System.assert(itemCategoryDetail1.equals(itemCategoryDetail2));
        System.assert(itemCategoryDetail2.equals(itemCategoryDetail1));
        System.assert(itemCategoryDetail1.equals(itemCategoryDetail1));
        System.assert(itemCategoryDetail3.equals(itemCategoryDetail4));
        System.assert(itemCategoryDetail4.equals(itemCategoryDetail3));
        System.assert(itemCategoryDetail3.equals(itemCategoryDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemCategoryDetail itemCategoryDetail1 = OASItemCategoryDetail.getExample();
        OASItemCategoryDetail itemCategoryDetail2 = OASItemCategoryDetail.getExample();
        OASItemCategoryDetail itemCategoryDetail3 = new OASItemCategoryDetail();
        OASItemCategoryDetail itemCategoryDetail4 = new OASItemCategoryDetail();

        System.assert(itemCategoryDetail1.equals(itemCategoryDetail2));
        System.assert(itemCategoryDetail2.equals(itemCategoryDetail1));
        System.assert(itemCategoryDetail3.equals(itemCategoryDetail4));
        System.assert(itemCategoryDetail4.equals(itemCategoryDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemCategoryDetail itemCategoryDetail1 = OASItemCategoryDetail.getExample();
        OASItemCategoryDetail itemCategoryDetail2 = new OASItemCategoryDetail();

        System.assertEquals(false, itemCategoryDetail1.equals('foo'));
        System.assertEquals(false, itemCategoryDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemCategoryDetail itemCategoryDetail1 = OASItemCategoryDetail.getExample();
        OASItemCategoryDetail itemCategoryDetail2 = new OASItemCategoryDetail();
        OASItemCategoryDetail itemCategoryDetail3;

        System.assertEquals(false, itemCategoryDetail1.equals(itemCategoryDetail3));
        System.assertEquals(false, itemCategoryDetail2.equals(itemCategoryDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemCategoryDetail itemCategoryDetail1 = OASItemCategoryDetail.getExample();
        OASItemCategoryDetail itemCategoryDetail2 = new OASItemCategoryDetail();

        System.assertEquals(itemCategoryDetail1.hashCode(), itemCategoryDetail1.hashCode());
        System.assertEquals(itemCategoryDetail2.hashCode(), itemCategoryDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemCategoryDetail itemCategoryDetail1 = OASItemCategoryDetail.getExample();
        OASItemCategoryDetail itemCategoryDetail2 = OASItemCategoryDetail.getExample();
        OASItemCategoryDetail itemCategoryDetail3 = new OASItemCategoryDetail();
        OASItemCategoryDetail itemCategoryDetail4 = new OASItemCategoryDetail();

        System.assert(itemCategoryDetail1.equals(itemCategoryDetail2));
        System.assert(itemCategoryDetail3.equals(itemCategoryDetail4));
        System.assertEquals(itemCategoryDetail1.hashCode(), itemCategoryDetail2.hashCode());
        System.assertEquals(itemCategoryDetail3.hashCode(), itemCategoryDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemCategoryDetail itemCategoryDetail = new OASItemCategoryDetail();
        System.assertEquals(new List<OASItemSummary>(), itemCategoryDetail.items);
        System.assertEquals(new List<OASItemCategoryName>(), itemCategoryDetail.names);
        System.assertEquals(null, itemCategoryDetail.id);
        System.assertEquals(null, itemCategoryDetail.name);
        System.assertEquals(null, itemCategoryDetail.pocket);
    }
}
