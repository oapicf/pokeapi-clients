@isTest
private class OASItemCategorySummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemCategorySummary itemCategorySummary1 = OASItemCategorySummary.getExample();
        OASItemCategorySummary itemCategorySummary2 = itemCategorySummary1;
        OASItemCategorySummary itemCategorySummary3 = new OASItemCategorySummary();
        OASItemCategorySummary itemCategorySummary4 = itemCategorySummary3;

        System.assert(itemCategorySummary1.equals(itemCategorySummary2));
        System.assert(itemCategorySummary2.equals(itemCategorySummary1));
        System.assert(itemCategorySummary1.equals(itemCategorySummary1));
        System.assert(itemCategorySummary3.equals(itemCategorySummary4));
        System.assert(itemCategorySummary4.equals(itemCategorySummary3));
        System.assert(itemCategorySummary3.equals(itemCategorySummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemCategorySummary itemCategorySummary1 = OASItemCategorySummary.getExample();
        OASItemCategorySummary itemCategorySummary2 = OASItemCategorySummary.getExample();
        OASItemCategorySummary itemCategorySummary3 = new OASItemCategorySummary();
        OASItemCategorySummary itemCategorySummary4 = new OASItemCategorySummary();

        System.assert(itemCategorySummary1.equals(itemCategorySummary2));
        System.assert(itemCategorySummary2.equals(itemCategorySummary1));
        System.assert(itemCategorySummary3.equals(itemCategorySummary4));
        System.assert(itemCategorySummary4.equals(itemCategorySummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemCategorySummary itemCategorySummary1 = OASItemCategorySummary.getExample();
        OASItemCategorySummary itemCategorySummary2 = new OASItemCategorySummary();

        System.assertEquals(false, itemCategorySummary1.equals('foo'));
        System.assertEquals(false, itemCategorySummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemCategorySummary itemCategorySummary1 = OASItemCategorySummary.getExample();
        OASItemCategorySummary itemCategorySummary2 = new OASItemCategorySummary();
        OASItemCategorySummary itemCategorySummary3;

        System.assertEquals(false, itemCategorySummary1.equals(itemCategorySummary3));
        System.assertEquals(false, itemCategorySummary2.equals(itemCategorySummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemCategorySummary itemCategorySummary1 = OASItemCategorySummary.getExample();
        OASItemCategorySummary itemCategorySummary2 = new OASItemCategorySummary();

        System.assertEquals(itemCategorySummary1.hashCode(), itemCategorySummary1.hashCode());
        System.assertEquals(itemCategorySummary2.hashCode(), itemCategorySummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemCategorySummary itemCategorySummary1 = OASItemCategorySummary.getExample();
        OASItemCategorySummary itemCategorySummary2 = OASItemCategorySummary.getExample();
        OASItemCategorySummary itemCategorySummary3 = new OASItemCategorySummary();
        OASItemCategorySummary itemCategorySummary4 = new OASItemCategorySummary();

        System.assert(itemCategorySummary1.equals(itemCategorySummary2));
        System.assert(itemCategorySummary3.equals(itemCategorySummary4));
        System.assertEquals(itemCategorySummary1.hashCode(), itemCategorySummary2.hashCode());
        System.assertEquals(itemCategorySummary3.hashCode(), itemCategorySummary4.hashCode());
    }
}
