@isTest
private class OASContestEffectSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASContestEffectSummary contestEffectSummary1 = OASContestEffectSummary.getExample();
        OASContestEffectSummary contestEffectSummary2 = contestEffectSummary1;
        OASContestEffectSummary contestEffectSummary3 = new OASContestEffectSummary();
        OASContestEffectSummary contestEffectSummary4 = contestEffectSummary3;

        System.assert(contestEffectSummary1.equals(contestEffectSummary2));
        System.assert(contestEffectSummary2.equals(contestEffectSummary1));
        System.assert(contestEffectSummary1.equals(contestEffectSummary1));
        System.assert(contestEffectSummary3.equals(contestEffectSummary4));
        System.assert(contestEffectSummary4.equals(contestEffectSummary3));
        System.assert(contestEffectSummary3.equals(contestEffectSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASContestEffectSummary contestEffectSummary1 = OASContestEffectSummary.getExample();
        OASContestEffectSummary contestEffectSummary2 = OASContestEffectSummary.getExample();
        OASContestEffectSummary contestEffectSummary3 = new OASContestEffectSummary();
        OASContestEffectSummary contestEffectSummary4 = new OASContestEffectSummary();

        System.assert(contestEffectSummary1.equals(contestEffectSummary2));
        System.assert(contestEffectSummary2.equals(contestEffectSummary1));
        System.assert(contestEffectSummary3.equals(contestEffectSummary4));
        System.assert(contestEffectSummary4.equals(contestEffectSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASContestEffectSummary contestEffectSummary1 = OASContestEffectSummary.getExample();
        OASContestEffectSummary contestEffectSummary2 = new OASContestEffectSummary();

        System.assertEquals(false, contestEffectSummary1.equals('foo'));
        System.assertEquals(false, contestEffectSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASContestEffectSummary contestEffectSummary1 = OASContestEffectSummary.getExample();
        OASContestEffectSummary contestEffectSummary2 = new OASContestEffectSummary();
        OASContestEffectSummary contestEffectSummary3;

        System.assertEquals(false, contestEffectSummary1.equals(contestEffectSummary3));
        System.assertEquals(false, contestEffectSummary2.equals(contestEffectSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASContestEffectSummary contestEffectSummary1 = OASContestEffectSummary.getExample();
        OASContestEffectSummary contestEffectSummary2 = new OASContestEffectSummary();

        System.assertEquals(contestEffectSummary1.hashCode(), contestEffectSummary1.hashCode());
        System.assertEquals(contestEffectSummary2.hashCode(), contestEffectSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASContestEffectSummary contestEffectSummary1 = OASContestEffectSummary.getExample();
        OASContestEffectSummary contestEffectSummary2 = OASContestEffectSummary.getExample();
        OASContestEffectSummary contestEffectSummary3 = new OASContestEffectSummary();
        OASContestEffectSummary contestEffectSummary4 = new OASContestEffectSummary();

        System.assert(contestEffectSummary1.equals(contestEffectSummary2));
        System.assert(contestEffectSummary3.equals(contestEffectSummary4));
        System.assertEquals(contestEffectSummary1.hashCode(), contestEffectSummary2.hashCode());
        System.assertEquals(contestEffectSummary3.hashCode(), contestEffectSummary4.hashCode());
    }
}
