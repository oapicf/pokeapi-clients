@isTest
private class OASItemPocketSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemPocketSummary itemPocketSummary1 = OASItemPocketSummary.getExample();
        OASItemPocketSummary itemPocketSummary2 = itemPocketSummary1;
        OASItemPocketSummary itemPocketSummary3 = new OASItemPocketSummary();
        OASItemPocketSummary itemPocketSummary4 = itemPocketSummary3;

        System.assert(itemPocketSummary1.equals(itemPocketSummary2));
        System.assert(itemPocketSummary2.equals(itemPocketSummary1));
        System.assert(itemPocketSummary1.equals(itemPocketSummary1));
        System.assert(itemPocketSummary3.equals(itemPocketSummary4));
        System.assert(itemPocketSummary4.equals(itemPocketSummary3));
        System.assert(itemPocketSummary3.equals(itemPocketSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemPocketSummary itemPocketSummary1 = OASItemPocketSummary.getExample();
        OASItemPocketSummary itemPocketSummary2 = OASItemPocketSummary.getExample();
        OASItemPocketSummary itemPocketSummary3 = new OASItemPocketSummary();
        OASItemPocketSummary itemPocketSummary4 = new OASItemPocketSummary();

        System.assert(itemPocketSummary1.equals(itemPocketSummary2));
        System.assert(itemPocketSummary2.equals(itemPocketSummary1));
        System.assert(itemPocketSummary3.equals(itemPocketSummary4));
        System.assert(itemPocketSummary4.equals(itemPocketSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemPocketSummary itemPocketSummary1 = OASItemPocketSummary.getExample();
        OASItemPocketSummary itemPocketSummary2 = new OASItemPocketSummary();

        System.assertEquals(false, itemPocketSummary1.equals('foo'));
        System.assertEquals(false, itemPocketSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemPocketSummary itemPocketSummary1 = OASItemPocketSummary.getExample();
        OASItemPocketSummary itemPocketSummary2 = new OASItemPocketSummary();
        OASItemPocketSummary itemPocketSummary3;

        System.assertEquals(false, itemPocketSummary1.equals(itemPocketSummary3));
        System.assertEquals(false, itemPocketSummary2.equals(itemPocketSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemPocketSummary itemPocketSummary1 = OASItemPocketSummary.getExample();
        OASItemPocketSummary itemPocketSummary2 = new OASItemPocketSummary();

        System.assertEquals(itemPocketSummary1.hashCode(), itemPocketSummary1.hashCode());
        System.assertEquals(itemPocketSummary2.hashCode(), itemPocketSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemPocketSummary itemPocketSummary1 = OASItemPocketSummary.getExample();
        OASItemPocketSummary itemPocketSummary2 = OASItemPocketSummary.getExample();
        OASItemPocketSummary itemPocketSummary3 = new OASItemPocketSummary();
        OASItemPocketSummary itemPocketSummary4 = new OASItemPocketSummary();

        System.assert(itemPocketSummary1.equals(itemPocketSummary2));
        System.assert(itemPocketSummary3.equals(itemPocketSummary4));
        System.assertEquals(itemPocketSummary1.hashCode(), itemPocketSummary2.hashCode());
        System.assertEquals(itemPocketSummary3.hashCode(), itemPocketSummary4.hashCode());
    }
}
