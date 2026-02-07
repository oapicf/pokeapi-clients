@isTest
private class OASItemFlingEffectSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemFlingEffectSummary itemFlingEffectSummary1 = OASItemFlingEffectSummary.getExample();
        OASItemFlingEffectSummary itemFlingEffectSummary2 = itemFlingEffectSummary1;
        OASItemFlingEffectSummary itemFlingEffectSummary3 = new OASItemFlingEffectSummary();
        OASItemFlingEffectSummary itemFlingEffectSummary4 = itemFlingEffectSummary3;

        System.assert(itemFlingEffectSummary1.equals(itemFlingEffectSummary2));
        System.assert(itemFlingEffectSummary2.equals(itemFlingEffectSummary1));
        System.assert(itemFlingEffectSummary1.equals(itemFlingEffectSummary1));
        System.assert(itemFlingEffectSummary3.equals(itemFlingEffectSummary4));
        System.assert(itemFlingEffectSummary4.equals(itemFlingEffectSummary3));
        System.assert(itemFlingEffectSummary3.equals(itemFlingEffectSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemFlingEffectSummary itemFlingEffectSummary1 = OASItemFlingEffectSummary.getExample();
        OASItemFlingEffectSummary itemFlingEffectSummary2 = OASItemFlingEffectSummary.getExample();
        OASItemFlingEffectSummary itemFlingEffectSummary3 = new OASItemFlingEffectSummary();
        OASItemFlingEffectSummary itemFlingEffectSummary4 = new OASItemFlingEffectSummary();

        System.assert(itemFlingEffectSummary1.equals(itemFlingEffectSummary2));
        System.assert(itemFlingEffectSummary2.equals(itemFlingEffectSummary1));
        System.assert(itemFlingEffectSummary3.equals(itemFlingEffectSummary4));
        System.assert(itemFlingEffectSummary4.equals(itemFlingEffectSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemFlingEffectSummary itemFlingEffectSummary1 = OASItemFlingEffectSummary.getExample();
        OASItemFlingEffectSummary itemFlingEffectSummary2 = new OASItemFlingEffectSummary();

        System.assertEquals(false, itemFlingEffectSummary1.equals('foo'));
        System.assertEquals(false, itemFlingEffectSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemFlingEffectSummary itemFlingEffectSummary1 = OASItemFlingEffectSummary.getExample();
        OASItemFlingEffectSummary itemFlingEffectSummary2 = new OASItemFlingEffectSummary();
        OASItemFlingEffectSummary itemFlingEffectSummary3;

        System.assertEquals(false, itemFlingEffectSummary1.equals(itemFlingEffectSummary3));
        System.assertEquals(false, itemFlingEffectSummary2.equals(itemFlingEffectSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemFlingEffectSummary itemFlingEffectSummary1 = OASItemFlingEffectSummary.getExample();
        OASItemFlingEffectSummary itemFlingEffectSummary2 = new OASItemFlingEffectSummary();

        System.assertEquals(itemFlingEffectSummary1.hashCode(), itemFlingEffectSummary1.hashCode());
        System.assertEquals(itemFlingEffectSummary2.hashCode(), itemFlingEffectSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemFlingEffectSummary itemFlingEffectSummary1 = OASItemFlingEffectSummary.getExample();
        OASItemFlingEffectSummary itemFlingEffectSummary2 = OASItemFlingEffectSummary.getExample();
        OASItemFlingEffectSummary itemFlingEffectSummary3 = new OASItemFlingEffectSummary();
        OASItemFlingEffectSummary itemFlingEffectSummary4 = new OASItemFlingEffectSummary();

        System.assert(itemFlingEffectSummary1.equals(itemFlingEffectSummary2));
        System.assert(itemFlingEffectSummary3.equals(itemFlingEffectSummary4));
        System.assertEquals(itemFlingEffectSummary1.hashCode(), itemFlingEffectSummary2.hashCode());
        System.assertEquals(itemFlingEffectSummary3.hashCode(), itemFlingEffectSummary4.hashCode());
    }
}
