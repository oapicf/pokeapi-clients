@isTest
private class OASContestTypeNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASContestTypeName contestTypeName1 = OASContestTypeName.getExample();
        OASContestTypeName contestTypeName2 = contestTypeName1;
        OASContestTypeName contestTypeName3 = new OASContestTypeName();
        OASContestTypeName contestTypeName4 = contestTypeName3;

        System.assert(contestTypeName1.equals(contestTypeName2));
        System.assert(contestTypeName2.equals(contestTypeName1));
        System.assert(contestTypeName1.equals(contestTypeName1));
        System.assert(contestTypeName3.equals(contestTypeName4));
        System.assert(contestTypeName4.equals(contestTypeName3));
        System.assert(contestTypeName3.equals(contestTypeName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASContestTypeName contestTypeName1 = OASContestTypeName.getExample();
        OASContestTypeName contestTypeName2 = OASContestTypeName.getExample();
        OASContestTypeName contestTypeName3 = new OASContestTypeName();
        OASContestTypeName contestTypeName4 = new OASContestTypeName();

        System.assert(contestTypeName1.equals(contestTypeName2));
        System.assert(contestTypeName2.equals(contestTypeName1));
        System.assert(contestTypeName3.equals(contestTypeName4));
        System.assert(contestTypeName4.equals(contestTypeName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASContestTypeName contestTypeName1 = OASContestTypeName.getExample();
        OASContestTypeName contestTypeName2 = new OASContestTypeName();

        System.assertEquals(false, contestTypeName1.equals('foo'));
        System.assertEquals(false, contestTypeName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASContestTypeName contestTypeName1 = OASContestTypeName.getExample();
        OASContestTypeName contestTypeName2 = new OASContestTypeName();
        OASContestTypeName contestTypeName3;

        System.assertEquals(false, contestTypeName1.equals(contestTypeName3));
        System.assertEquals(false, contestTypeName2.equals(contestTypeName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASContestTypeName contestTypeName1 = OASContestTypeName.getExample();
        OASContestTypeName contestTypeName2 = new OASContestTypeName();

        System.assertEquals(contestTypeName1.hashCode(), contestTypeName1.hashCode());
        System.assertEquals(contestTypeName2.hashCode(), contestTypeName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASContestTypeName contestTypeName1 = OASContestTypeName.getExample();
        OASContestTypeName contestTypeName2 = OASContestTypeName.getExample();
        OASContestTypeName contestTypeName3 = new OASContestTypeName();
        OASContestTypeName contestTypeName4 = new OASContestTypeName();

        System.assert(contestTypeName1.equals(contestTypeName2));
        System.assert(contestTypeName3.equals(contestTypeName4));
        System.assertEquals(contestTypeName1.hashCode(), contestTypeName2.hashCode());
        System.assertEquals(contestTypeName3.hashCode(), contestTypeName4.hashCode());
    }
}
