@isTest
private class OASContestEffectEffectTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASContestEffectEffectText contestEffectEffectText1 = OASContestEffectEffectText.getExample();
        OASContestEffectEffectText contestEffectEffectText2 = contestEffectEffectText1;
        OASContestEffectEffectText contestEffectEffectText3 = new OASContestEffectEffectText();
        OASContestEffectEffectText contestEffectEffectText4 = contestEffectEffectText3;

        System.assert(contestEffectEffectText1.equals(contestEffectEffectText2));
        System.assert(contestEffectEffectText2.equals(contestEffectEffectText1));
        System.assert(contestEffectEffectText1.equals(contestEffectEffectText1));
        System.assert(contestEffectEffectText3.equals(contestEffectEffectText4));
        System.assert(contestEffectEffectText4.equals(contestEffectEffectText3));
        System.assert(contestEffectEffectText3.equals(contestEffectEffectText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASContestEffectEffectText contestEffectEffectText1 = OASContestEffectEffectText.getExample();
        OASContestEffectEffectText contestEffectEffectText2 = OASContestEffectEffectText.getExample();
        OASContestEffectEffectText contestEffectEffectText3 = new OASContestEffectEffectText();
        OASContestEffectEffectText contestEffectEffectText4 = new OASContestEffectEffectText();

        System.assert(contestEffectEffectText1.equals(contestEffectEffectText2));
        System.assert(contestEffectEffectText2.equals(contestEffectEffectText1));
        System.assert(contestEffectEffectText3.equals(contestEffectEffectText4));
        System.assert(contestEffectEffectText4.equals(contestEffectEffectText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASContestEffectEffectText contestEffectEffectText1 = OASContestEffectEffectText.getExample();
        OASContestEffectEffectText contestEffectEffectText2 = new OASContestEffectEffectText();

        System.assertEquals(false, contestEffectEffectText1.equals('foo'));
        System.assertEquals(false, contestEffectEffectText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASContestEffectEffectText contestEffectEffectText1 = OASContestEffectEffectText.getExample();
        OASContestEffectEffectText contestEffectEffectText2 = new OASContestEffectEffectText();
        OASContestEffectEffectText contestEffectEffectText3;

        System.assertEquals(false, contestEffectEffectText1.equals(contestEffectEffectText3));
        System.assertEquals(false, contestEffectEffectText2.equals(contestEffectEffectText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASContestEffectEffectText contestEffectEffectText1 = OASContestEffectEffectText.getExample();
        OASContestEffectEffectText contestEffectEffectText2 = new OASContestEffectEffectText();

        System.assertEquals(contestEffectEffectText1.hashCode(), contestEffectEffectText1.hashCode());
        System.assertEquals(contestEffectEffectText2.hashCode(), contestEffectEffectText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASContestEffectEffectText contestEffectEffectText1 = OASContestEffectEffectText.getExample();
        OASContestEffectEffectText contestEffectEffectText2 = OASContestEffectEffectText.getExample();
        OASContestEffectEffectText contestEffectEffectText3 = new OASContestEffectEffectText();
        OASContestEffectEffectText contestEffectEffectText4 = new OASContestEffectEffectText();

        System.assert(contestEffectEffectText1.equals(contestEffectEffectText2));
        System.assert(contestEffectEffectText3.equals(contestEffectEffectText4));
        System.assertEquals(contestEffectEffectText1.hashCode(), contestEffectEffectText2.hashCode());
        System.assertEquals(contestEffectEffectText3.hashCode(), contestEffectEffectText4.hashCode());
    }
}
