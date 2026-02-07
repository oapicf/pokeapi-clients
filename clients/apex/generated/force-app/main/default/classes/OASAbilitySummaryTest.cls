@isTest
private class OASAbilitySummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASAbilitySummary abilitySummary1 = OASAbilitySummary.getExample();
        OASAbilitySummary abilitySummary2 = abilitySummary1;
        OASAbilitySummary abilitySummary3 = new OASAbilitySummary();
        OASAbilitySummary abilitySummary4 = abilitySummary3;

        System.assert(abilitySummary1.equals(abilitySummary2));
        System.assert(abilitySummary2.equals(abilitySummary1));
        System.assert(abilitySummary1.equals(abilitySummary1));
        System.assert(abilitySummary3.equals(abilitySummary4));
        System.assert(abilitySummary4.equals(abilitySummary3));
        System.assert(abilitySummary3.equals(abilitySummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAbilitySummary abilitySummary1 = OASAbilitySummary.getExample();
        OASAbilitySummary abilitySummary2 = OASAbilitySummary.getExample();
        OASAbilitySummary abilitySummary3 = new OASAbilitySummary();
        OASAbilitySummary abilitySummary4 = new OASAbilitySummary();

        System.assert(abilitySummary1.equals(abilitySummary2));
        System.assert(abilitySummary2.equals(abilitySummary1));
        System.assert(abilitySummary3.equals(abilitySummary4));
        System.assert(abilitySummary4.equals(abilitySummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAbilitySummary abilitySummary1 = OASAbilitySummary.getExample();
        OASAbilitySummary abilitySummary2 = new OASAbilitySummary();

        System.assertEquals(false, abilitySummary1.equals('foo'));
        System.assertEquals(false, abilitySummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAbilitySummary abilitySummary1 = OASAbilitySummary.getExample();
        OASAbilitySummary abilitySummary2 = new OASAbilitySummary();
        OASAbilitySummary abilitySummary3;

        System.assertEquals(false, abilitySummary1.equals(abilitySummary3));
        System.assertEquals(false, abilitySummary2.equals(abilitySummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAbilitySummary abilitySummary1 = OASAbilitySummary.getExample();
        OASAbilitySummary abilitySummary2 = new OASAbilitySummary();

        System.assertEquals(abilitySummary1.hashCode(), abilitySummary1.hashCode());
        System.assertEquals(abilitySummary2.hashCode(), abilitySummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAbilitySummary abilitySummary1 = OASAbilitySummary.getExample();
        OASAbilitySummary abilitySummary2 = OASAbilitySummary.getExample();
        OASAbilitySummary abilitySummary3 = new OASAbilitySummary();
        OASAbilitySummary abilitySummary4 = new OASAbilitySummary();

        System.assert(abilitySummary1.equals(abilitySummary2));
        System.assert(abilitySummary3.equals(abilitySummary4));
        System.assertEquals(abilitySummary1.hashCode(), abilitySummary2.hashCode());
        System.assertEquals(abilitySummary3.hashCode(), abilitySummary4.hashCode());
    }
}
