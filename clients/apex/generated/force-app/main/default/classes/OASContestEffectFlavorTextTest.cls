@isTest
private class OASContestEffectFlavorTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASContestEffectFlavorText contestEffectFlavorText1 = OASContestEffectFlavorText.getExample();
        OASContestEffectFlavorText contestEffectFlavorText2 = contestEffectFlavorText1;
        OASContestEffectFlavorText contestEffectFlavorText3 = new OASContestEffectFlavorText();
        OASContestEffectFlavorText contestEffectFlavorText4 = contestEffectFlavorText3;

        System.assert(contestEffectFlavorText1.equals(contestEffectFlavorText2));
        System.assert(contestEffectFlavorText2.equals(contestEffectFlavorText1));
        System.assert(contestEffectFlavorText1.equals(contestEffectFlavorText1));
        System.assert(contestEffectFlavorText3.equals(contestEffectFlavorText4));
        System.assert(contestEffectFlavorText4.equals(contestEffectFlavorText3));
        System.assert(contestEffectFlavorText3.equals(contestEffectFlavorText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASContestEffectFlavorText contestEffectFlavorText1 = OASContestEffectFlavorText.getExample();
        OASContestEffectFlavorText contestEffectFlavorText2 = OASContestEffectFlavorText.getExample();
        OASContestEffectFlavorText contestEffectFlavorText3 = new OASContestEffectFlavorText();
        OASContestEffectFlavorText contestEffectFlavorText4 = new OASContestEffectFlavorText();

        System.assert(contestEffectFlavorText1.equals(contestEffectFlavorText2));
        System.assert(contestEffectFlavorText2.equals(contestEffectFlavorText1));
        System.assert(contestEffectFlavorText3.equals(contestEffectFlavorText4));
        System.assert(contestEffectFlavorText4.equals(contestEffectFlavorText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASContestEffectFlavorText contestEffectFlavorText1 = OASContestEffectFlavorText.getExample();
        OASContestEffectFlavorText contestEffectFlavorText2 = new OASContestEffectFlavorText();

        System.assertEquals(false, contestEffectFlavorText1.equals('foo'));
        System.assertEquals(false, contestEffectFlavorText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASContestEffectFlavorText contestEffectFlavorText1 = OASContestEffectFlavorText.getExample();
        OASContestEffectFlavorText contestEffectFlavorText2 = new OASContestEffectFlavorText();
        OASContestEffectFlavorText contestEffectFlavorText3;

        System.assertEquals(false, contestEffectFlavorText1.equals(contestEffectFlavorText3));
        System.assertEquals(false, contestEffectFlavorText2.equals(contestEffectFlavorText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASContestEffectFlavorText contestEffectFlavorText1 = OASContestEffectFlavorText.getExample();
        OASContestEffectFlavorText contestEffectFlavorText2 = new OASContestEffectFlavorText();

        System.assertEquals(contestEffectFlavorText1.hashCode(), contestEffectFlavorText1.hashCode());
        System.assertEquals(contestEffectFlavorText2.hashCode(), contestEffectFlavorText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASContestEffectFlavorText contestEffectFlavorText1 = OASContestEffectFlavorText.getExample();
        OASContestEffectFlavorText contestEffectFlavorText2 = OASContestEffectFlavorText.getExample();
        OASContestEffectFlavorText contestEffectFlavorText3 = new OASContestEffectFlavorText();
        OASContestEffectFlavorText contestEffectFlavorText4 = new OASContestEffectFlavorText();

        System.assert(contestEffectFlavorText1.equals(contestEffectFlavorText2));
        System.assert(contestEffectFlavorText3.equals(contestEffectFlavorText4));
        System.assertEquals(contestEffectFlavorText1.hashCode(), contestEffectFlavorText2.hashCode());
        System.assertEquals(contestEffectFlavorText3.hashCode(), contestEffectFlavorText4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASContestEffectFlavorText contestEffectFlavorText = new OASContestEffectFlavorText();
        Map<String, String> x-property-mappings = contestEffectFlavorText.getx-property-mappings();
        System.assertEquals('flavorText', x-property-mappings.get('flavor_text'));
    }
}
