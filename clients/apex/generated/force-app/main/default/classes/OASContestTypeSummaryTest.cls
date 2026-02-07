@isTest
private class OASContestTypeSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASContestTypeSummary contestTypeSummary1 = OASContestTypeSummary.getExample();
        OASContestTypeSummary contestTypeSummary2 = contestTypeSummary1;
        OASContestTypeSummary contestTypeSummary3 = new OASContestTypeSummary();
        OASContestTypeSummary contestTypeSummary4 = contestTypeSummary3;

        System.assert(contestTypeSummary1.equals(contestTypeSummary2));
        System.assert(contestTypeSummary2.equals(contestTypeSummary1));
        System.assert(contestTypeSummary1.equals(contestTypeSummary1));
        System.assert(contestTypeSummary3.equals(contestTypeSummary4));
        System.assert(contestTypeSummary4.equals(contestTypeSummary3));
        System.assert(contestTypeSummary3.equals(contestTypeSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASContestTypeSummary contestTypeSummary1 = OASContestTypeSummary.getExample();
        OASContestTypeSummary contestTypeSummary2 = OASContestTypeSummary.getExample();
        OASContestTypeSummary contestTypeSummary3 = new OASContestTypeSummary();
        OASContestTypeSummary contestTypeSummary4 = new OASContestTypeSummary();

        System.assert(contestTypeSummary1.equals(contestTypeSummary2));
        System.assert(contestTypeSummary2.equals(contestTypeSummary1));
        System.assert(contestTypeSummary3.equals(contestTypeSummary4));
        System.assert(contestTypeSummary4.equals(contestTypeSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASContestTypeSummary contestTypeSummary1 = OASContestTypeSummary.getExample();
        OASContestTypeSummary contestTypeSummary2 = new OASContestTypeSummary();

        System.assertEquals(false, contestTypeSummary1.equals('foo'));
        System.assertEquals(false, contestTypeSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASContestTypeSummary contestTypeSummary1 = OASContestTypeSummary.getExample();
        OASContestTypeSummary contestTypeSummary2 = new OASContestTypeSummary();
        OASContestTypeSummary contestTypeSummary3;

        System.assertEquals(false, contestTypeSummary1.equals(contestTypeSummary3));
        System.assertEquals(false, contestTypeSummary2.equals(contestTypeSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASContestTypeSummary contestTypeSummary1 = OASContestTypeSummary.getExample();
        OASContestTypeSummary contestTypeSummary2 = new OASContestTypeSummary();

        System.assertEquals(contestTypeSummary1.hashCode(), contestTypeSummary1.hashCode());
        System.assertEquals(contestTypeSummary2.hashCode(), contestTypeSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASContestTypeSummary contestTypeSummary1 = OASContestTypeSummary.getExample();
        OASContestTypeSummary contestTypeSummary2 = OASContestTypeSummary.getExample();
        OASContestTypeSummary contestTypeSummary3 = new OASContestTypeSummary();
        OASContestTypeSummary contestTypeSummary4 = new OASContestTypeSummary();

        System.assert(contestTypeSummary1.equals(contestTypeSummary2));
        System.assert(contestTypeSummary3.equals(contestTypeSummary4));
        System.assertEquals(contestTypeSummary1.hashCode(), contestTypeSummary2.hashCode());
        System.assertEquals(contestTypeSummary3.hashCode(), contestTypeSummary4.hashCode());
    }
}
