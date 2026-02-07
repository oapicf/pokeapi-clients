@isTest
private class OASItemPocketDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemPocketDetail itemPocketDetail1 = OASItemPocketDetail.getExample();
        OASItemPocketDetail itemPocketDetail2 = itemPocketDetail1;
        OASItemPocketDetail itemPocketDetail3 = new OASItemPocketDetail();
        OASItemPocketDetail itemPocketDetail4 = itemPocketDetail3;

        System.assert(itemPocketDetail1.equals(itemPocketDetail2));
        System.assert(itemPocketDetail2.equals(itemPocketDetail1));
        System.assert(itemPocketDetail1.equals(itemPocketDetail1));
        System.assert(itemPocketDetail3.equals(itemPocketDetail4));
        System.assert(itemPocketDetail4.equals(itemPocketDetail3));
        System.assert(itemPocketDetail3.equals(itemPocketDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemPocketDetail itemPocketDetail1 = OASItemPocketDetail.getExample();
        OASItemPocketDetail itemPocketDetail2 = OASItemPocketDetail.getExample();
        OASItemPocketDetail itemPocketDetail3 = new OASItemPocketDetail();
        OASItemPocketDetail itemPocketDetail4 = new OASItemPocketDetail();

        System.assert(itemPocketDetail1.equals(itemPocketDetail2));
        System.assert(itemPocketDetail2.equals(itemPocketDetail1));
        System.assert(itemPocketDetail3.equals(itemPocketDetail4));
        System.assert(itemPocketDetail4.equals(itemPocketDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemPocketDetail itemPocketDetail1 = OASItemPocketDetail.getExample();
        OASItemPocketDetail itemPocketDetail2 = new OASItemPocketDetail();

        System.assertEquals(false, itemPocketDetail1.equals('foo'));
        System.assertEquals(false, itemPocketDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemPocketDetail itemPocketDetail1 = OASItemPocketDetail.getExample();
        OASItemPocketDetail itemPocketDetail2 = new OASItemPocketDetail();
        OASItemPocketDetail itemPocketDetail3;

        System.assertEquals(false, itemPocketDetail1.equals(itemPocketDetail3));
        System.assertEquals(false, itemPocketDetail2.equals(itemPocketDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemPocketDetail itemPocketDetail1 = OASItemPocketDetail.getExample();
        OASItemPocketDetail itemPocketDetail2 = new OASItemPocketDetail();

        System.assertEquals(itemPocketDetail1.hashCode(), itemPocketDetail1.hashCode());
        System.assertEquals(itemPocketDetail2.hashCode(), itemPocketDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemPocketDetail itemPocketDetail1 = OASItemPocketDetail.getExample();
        OASItemPocketDetail itemPocketDetail2 = OASItemPocketDetail.getExample();
        OASItemPocketDetail itemPocketDetail3 = new OASItemPocketDetail();
        OASItemPocketDetail itemPocketDetail4 = new OASItemPocketDetail();

        System.assert(itemPocketDetail1.equals(itemPocketDetail2));
        System.assert(itemPocketDetail3.equals(itemPocketDetail4));
        System.assertEquals(itemPocketDetail1.hashCode(), itemPocketDetail2.hashCode());
        System.assertEquals(itemPocketDetail3.hashCode(), itemPocketDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemPocketDetail itemPocketDetail = new OASItemPocketDetail();
        System.assertEquals(new List<OASItemCategorySummary>(), itemPocketDetail.categories);
        System.assertEquals(new List<OASItemPocketName>(), itemPocketDetail.names);
        System.assertEquals(null, itemPocketDetail.id);
        System.assertEquals(null, itemPocketDetail.name);
    }
}
