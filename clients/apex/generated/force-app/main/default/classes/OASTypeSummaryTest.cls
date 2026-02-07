@isTest
private class OASTypeSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypeSummary typeSummary1 = OASTypeSummary.getExample();
        OASTypeSummary typeSummary2 = typeSummary1;
        OASTypeSummary typeSummary3 = new OASTypeSummary();
        OASTypeSummary typeSummary4 = typeSummary3;

        System.assert(typeSummary1.equals(typeSummary2));
        System.assert(typeSummary2.equals(typeSummary1));
        System.assert(typeSummary1.equals(typeSummary1));
        System.assert(typeSummary3.equals(typeSummary4));
        System.assert(typeSummary4.equals(typeSummary3));
        System.assert(typeSummary3.equals(typeSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypeSummary typeSummary1 = OASTypeSummary.getExample();
        OASTypeSummary typeSummary2 = OASTypeSummary.getExample();
        OASTypeSummary typeSummary3 = new OASTypeSummary();
        OASTypeSummary typeSummary4 = new OASTypeSummary();

        System.assert(typeSummary1.equals(typeSummary2));
        System.assert(typeSummary2.equals(typeSummary1));
        System.assert(typeSummary3.equals(typeSummary4));
        System.assert(typeSummary4.equals(typeSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypeSummary typeSummary1 = OASTypeSummary.getExample();
        OASTypeSummary typeSummary2 = new OASTypeSummary();

        System.assertEquals(false, typeSummary1.equals('foo'));
        System.assertEquals(false, typeSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypeSummary typeSummary1 = OASTypeSummary.getExample();
        OASTypeSummary typeSummary2 = new OASTypeSummary();
        OASTypeSummary typeSummary3;

        System.assertEquals(false, typeSummary1.equals(typeSummary3));
        System.assertEquals(false, typeSummary2.equals(typeSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypeSummary typeSummary1 = OASTypeSummary.getExample();
        OASTypeSummary typeSummary2 = new OASTypeSummary();

        System.assertEquals(typeSummary1.hashCode(), typeSummary1.hashCode());
        System.assertEquals(typeSummary2.hashCode(), typeSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypeSummary typeSummary1 = OASTypeSummary.getExample();
        OASTypeSummary typeSummary2 = OASTypeSummary.getExample();
        OASTypeSummary typeSummary3 = new OASTypeSummary();
        OASTypeSummary typeSummary4 = new OASTypeSummary();

        System.assert(typeSummary1.equals(typeSummary2));
        System.assert(typeSummary3.equals(typeSummary4));
        System.assertEquals(typeSummary1.hashCode(), typeSummary2.hashCode());
        System.assertEquals(typeSummary3.hashCode(), typeSummary4.hashCode());
    }
}
