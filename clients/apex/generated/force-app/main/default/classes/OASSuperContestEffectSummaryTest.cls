@isTest
private class OASSuperContestEffectSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASSuperContestEffectSummary superContestEffectSummary1 = OASSuperContestEffectSummary.getExample();
        OASSuperContestEffectSummary superContestEffectSummary2 = superContestEffectSummary1;
        OASSuperContestEffectSummary superContestEffectSummary3 = new OASSuperContestEffectSummary();
        OASSuperContestEffectSummary superContestEffectSummary4 = superContestEffectSummary3;

        System.assert(superContestEffectSummary1.equals(superContestEffectSummary2));
        System.assert(superContestEffectSummary2.equals(superContestEffectSummary1));
        System.assert(superContestEffectSummary1.equals(superContestEffectSummary1));
        System.assert(superContestEffectSummary3.equals(superContestEffectSummary4));
        System.assert(superContestEffectSummary4.equals(superContestEffectSummary3));
        System.assert(superContestEffectSummary3.equals(superContestEffectSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSuperContestEffectSummary superContestEffectSummary1 = OASSuperContestEffectSummary.getExample();
        OASSuperContestEffectSummary superContestEffectSummary2 = OASSuperContestEffectSummary.getExample();
        OASSuperContestEffectSummary superContestEffectSummary3 = new OASSuperContestEffectSummary();
        OASSuperContestEffectSummary superContestEffectSummary4 = new OASSuperContestEffectSummary();

        System.assert(superContestEffectSummary1.equals(superContestEffectSummary2));
        System.assert(superContestEffectSummary2.equals(superContestEffectSummary1));
        System.assert(superContestEffectSummary3.equals(superContestEffectSummary4));
        System.assert(superContestEffectSummary4.equals(superContestEffectSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSuperContestEffectSummary superContestEffectSummary1 = OASSuperContestEffectSummary.getExample();
        OASSuperContestEffectSummary superContestEffectSummary2 = new OASSuperContestEffectSummary();

        System.assertEquals(false, superContestEffectSummary1.equals('foo'));
        System.assertEquals(false, superContestEffectSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSuperContestEffectSummary superContestEffectSummary1 = OASSuperContestEffectSummary.getExample();
        OASSuperContestEffectSummary superContestEffectSummary2 = new OASSuperContestEffectSummary();
        OASSuperContestEffectSummary superContestEffectSummary3;

        System.assertEquals(false, superContestEffectSummary1.equals(superContestEffectSummary3));
        System.assertEquals(false, superContestEffectSummary2.equals(superContestEffectSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSuperContestEffectSummary superContestEffectSummary1 = OASSuperContestEffectSummary.getExample();
        OASSuperContestEffectSummary superContestEffectSummary2 = new OASSuperContestEffectSummary();

        System.assertEquals(superContestEffectSummary1.hashCode(), superContestEffectSummary1.hashCode());
        System.assertEquals(superContestEffectSummary2.hashCode(), superContestEffectSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSuperContestEffectSummary superContestEffectSummary1 = OASSuperContestEffectSummary.getExample();
        OASSuperContestEffectSummary superContestEffectSummary2 = OASSuperContestEffectSummary.getExample();
        OASSuperContestEffectSummary superContestEffectSummary3 = new OASSuperContestEffectSummary();
        OASSuperContestEffectSummary superContestEffectSummary4 = new OASSuperContestEffectSummary();

        System.assert(superContestEffectSummary1.equals(superContestEffectSummary2));
        System.assert(superContestEffectSummary3.equals(superContestEffectSummary4));
        System.assertEquals(superContestEffectSummary1.hashCode(), superContestEffectSummary2.hashCode());
        System.assertEquals(superContestEffectSummary3.hashCode(), superContestEffectSummary4.hashCode());
    }
}
