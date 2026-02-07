@isTest
private class OASItemAttributeSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemAttributeSummary itemAttributeSummary1 = OASItemAttributeSummary.getExample();
        OASItemAttributeSummary itemAttributeSummary2 = itemAttributeSummary1;
        OASItemAttributeSummary itemAttributeSummary3 = new OASItemAttributeSummary();
        OASItemAttributeSummary itemAttributeSummary4 = itemAttributeSummary3;

        System.assert(itemAttributeSummary1.equals(itemAttributeSummary2));
        System.assert(itemAttributeSummary2.equals(itemAttributeSummary1));
        System.assert(itemAttributeSummary1.equals(itemAttributeSummary1));
        System.assert(itemAttributeSummary3.equals(itemAttributeSummary4));
        System.assert(itemAttributeSummary4.equals(itemAttributeSummary3));
        System.assert(itemAttributeSummary3.equals(itemAttributeSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemAttributeSummary itemAttributeSummary1 = OASItemAttributeSummary.getExample();
        OASItemAttributeSummary itemAttributeSummary2 = OASItemAttributeSummary.getExample();
        OASItemAttributeSummary itemAttributeSummary3 = new OASItemAttributeSummary();
        OASItemAttributeSummary itemAttributeSummary4 = new OASItemAttributeSummary();

        System.assert(itemAttributeSummary1.equals(itemAttributeSummary2));
        System.assert(itemAttributeSummary2.equals(itemAttributeSummary1));
        System.assert(itemAttributeSummary3.equals(itemAttributeSummary4));
        System.assert(itemAttributeSummary4.equals(itemAttributeSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemAttributeSummary itemAttributeSummary1 = OASItemAttributeSummary.getExample();
        OASItemAttributeSummary itemAttributeSummary2 = new OASItemAttributeSummary();

        System.assertEquals(false, itemAttributeSummary1.equals('foo'));
        System.assertEquals(false, itemAttributeSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemAttributeSummary itemAttributeSummary1 = OASItemAttributeSummary.getExample();
        OASItemAttributeSummary itemAttributeSummary2 = new OASItemAttributeSummary();
        OASItemAttributeSummary itemAttributeSummary3;

        System.assertEquals(false, itemAttributeSummary1.equals(itemAttributeSummary3));
        System.assertEquals(false, itemAttributeSummary2.equals(itemAttributeSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemAttributeSummary itemAttributeSummary1 = OASItemAttributeSummary.getExample();
        OASItemAttributeSummary itemAttributeSummary2 = new OASItemAttributeSummary();

        System.assertEquals(itemAttributeSummary1.hashCode(), itemAttributeSummary1.hashCode());
        System.assertEquals(itemAttributeSummary2.hashCode(), itemAttributeSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemAttributeSummary itemAttributeSummary1 = OASItemAttributeSummary.getExample();
        OASItemAttributeSummary itemAttributeSummary2 = OASItemAttributeSummary.getExample();
        OASItemAttributeSummary itemAttributeSummary3 = new OASItemAttributeSummary();
        OASItemAttributeSummary itemAttributeSummary4 = new OASItemAttributeSummary();

        System.assert(itemAttributeSummary1.equals(itemAttributeSummary2));
        System.assert(itemAttributeSummary3.equals(itemAttributeSummary4));
        System.assertEquals(itemAttributeSummary1.hashCode(), itemAttributeSummary2.hashCode());
        System.assertEquals(itemAttributeSummary3.hashCode(), itemAttributeSummary4.hashCode());
    }
}
