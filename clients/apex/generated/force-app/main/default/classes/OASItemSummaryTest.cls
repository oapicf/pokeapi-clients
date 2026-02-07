@isTest
private class OASItemSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemSummary itemSummary1 = OASItemSummary.getExample();
        OASItemSummary itemSummary2 = itemSummary1;
        OASItemSummary itemSummary3 = new OASItemSummary();
        OASItemSummary itemSummary4 = itemSummary3;

        System.assert(itemSummary1.equals(itemSummary2));
        System.assert(itemSummary2.equals(itemSummary1));
        System.assert(itemSummary1.equals(itemSummary1));
        System.assert(itemSummary3.equals(itemSummary4));
        System.assert(itemSummary4.equals(itemSummary3));
        System.assert(itemSummary3.equals(itemSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemSummary itemSummary1 = OASItemSummary.getExample();
        OASItemSummary itemSummary2 = OASItemSummary.getExample();
        OASItemSummary itemSummary3 = new OASItemSummary();
        OASItemSummary itemSummary4 = new OASItemSummary();

        System.assert(itemSummary1.equals(itemSummary2));
        System.assert(itemSummary2.equals(itemSummary1));
        System.assert(itemSummary3.equals(itemSummary4));
        System.assert(itemSummary4.equals(itemSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemSummary itemSummary1 = OASItemSummary.getExample();
        OASItemSummary itemSummary2 = new OASItemSummary();

        System.assertEquals(false, itemSummary1.equals('foo'));
        System.assertEquals(false, itemSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemSummary itemSummary1 = OASItemSummary.getExample();
        OASItemSummary itemSummary2 = new OASItemSummary();
        OASItemSummary itemSummary3;

        System.assertEquals(false, itemSummary1.equals(itemSummary3));
        System.assertEquals(false, itemSummary2.equals(itemSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemSummary itemSummary1 = OASItemSummary.getExample();
        OASItemSummary itemSummary2 = new OASItemSummary();

        System.assertEquals(itemSummary1.hashCode(), itemSummary1.hashCode());
        System.assertEquals(itemSummary2.hashCode(), itemSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemSummary itemSummary1 = OASItemSummary.getExample();
        OASItemSummary itemSummary2 = OASItemSummary.getExample();
        OASItemSummary itemSummary3 = new OASItemSummary();
        OASItemSummary itemSummary4 = new OASItemSummary();

        System.assert(itemSummary1.equals(itemSummary2));
        System.assert(itemSummary3.equals(itemSummary4));
        System.assertEquals(itemSummary1.hashCode(), itemSummary2.hashCode());
        System.assertEquals(itemSummary3.hashCode(), itemSummary4.hashCode());
    }
}
