@isTest
private class OASEggGroupSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASEggGroupSummary eggGroupSummary1 = OASEggGroupSummary.getExample();
        OASEggGroupSummary eggGroupSummary2 = eggGroupSummary1;
        OASEggGroupSummary eggGroupSummary3 = new OASEggGroupSummary();
        OASEggGroupSummary eggGroupSummary4 = eggGroupSummary3;

        System.assert(eggGroupSummary1.equals(eggGroupSummary2));
        System.assert(eggGroupSummary2.equals(eggGroupSummary1));
        System.assert(eggGroupSummary1.equals(eggGroupSummary1));
        System.assert(eggGroupSummary3.equals(eggGroupSummary4));
        System.assert(eggGroupSummary4.equals(eggGroupSummary3));
        System.assert(eggGroupSummary3.equals(eggGroupSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEggGroupSummary eggGroupSummary1 = OASEggGroupSummary.getExample();
        OASEggGroupSummary eggGroupSummary2 = OASEggGroupSummary.getExample();
        OASEggGroupSummary eggGroupSummary3 = new OASEggGroupSummary();
        OASEggGroupSummary eggGroupSummary4 = new OASEggGroupSummary();

        System.assert(eggGroupSummary1.equals(eggGroupSummary2));
        System.assert(eggGroupSummary2.equals(eggGroupSummary1));
        System.assert(eggGroupSummary3.equals(eggGroupSummary4));
        System.assert(eggGroupSummary4.equals(eggGroupSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEggGroupSummary eggGroupSummary1 = OASEggGroupSummary.getExample();
        OASEggGroupSummary eggGroupSummary2 = new OASEggGroupSummary();

        System.assertEquals(false, eggGroupSummary1.equals('foo'));
        System.assertEquals(false, eggGroupSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEggGroupSummary eggGroupSummary1 = OASEggGroupSummary.getExample();
        OASEggGroupSummary eggGroupSummary2 = new OASEggGroupSummary();
        OASEggGroupSummary eggGroupSummary3;

        System.assertEquals(false, eggGroupSummary1.equals(eggGroupSummary3));
        System.assertEquals(false, eggGroupSummary2.equals(eggGroupSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEggGroupSummary eggGroupSummary1 = OASEggGroupSummary.getExample();
        OASEggGroupSummary eggGroupSummary2 = new OASEggGroupSummary();

        System.assertEquals(eggGroupSummary1.hashCode(), eggGroupSummary1.hashCode());
        System.assertEquals(eggGroupSummary2.hashCode(), eggGroupSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEggGroupSummary eggGroupSummary1 = OASEggGroupSummary.getExample();
        OASEggGroupSummary eggGroupSummary2 = OASEggGroupSummary.getExample();
        OASEggGroupSummary eggGroupSummary3 = new OASEggGroupSummary();
        OASEggGroupSummary eggGroupSummary4 = new OASEggGroupSummary();

        System.assert(eggGroupSummary1.equals(eggGroupSummary2));
        System.assert(eggGroupSummary3.equals(eggGroupSummary4));
        System.assertEquals(eggGroupSummary1.hashCode(), eggGroupSummary2.hashCode());
        System.assertEquals(eggGroupSummary3.hashCode(), eggGroupSummary4.hashCode());
    }
}
