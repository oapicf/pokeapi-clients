@isTest
private class OASSuperContestEffectFlavorTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASSuperContestEffectFlavorText superContestEffectFlavorText1 = OASSuperContestEffectFlavorText.getExample();
        OASSuperContestEffectFlavorText superContestEffectFlavorText2 = superContestEffectFlavorText1;
        OASSuperContestEffectFlavorText superContestEffectFlavorText3 = new OASSuperContestEffectFlavorText();
        OASSuperContestEffectFlavorText superContestEffectFlavorText4 = superContestEffectFlavorText3;

        System.assert(superContestEffectFlavorText1.equals(superContestEffectFlavorText2));
        System.assert(superContestEffectFlavorText2.equals(superContestEffectFlavorText1));
        System.assert(superContestEffectFlavorText1.equals(superContestEffectFlavorText1));
        System.assert(superContestEffectFlavorText3.equals(superContestEffectFlavorText4));
        System.assert(superContestEffectFlavorText4.equals(superContestEffectFlavorText3));
        System.assert(superContestEffectFlavorText3.equals(superContestEffectFlavorText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASSuperContestEffectFlavorText superContestEffectFlavorText1 = OASSuperContestEffectFlavorText.getExample();
        OASSuperContestEffectFlavorText superContestEffectFlavorText2 = OASSuperContestEffectFlavorText.getExample();
        OASSuperContestEffectFlavorText superContestEffectFlavorText3 = new OASSuperContestEffectFlavorText();
        OASSuperContestEffectFlavorText superContestEffectFlavorText4 = new OASSuperContestEffectFlavorText();

        System.assert(superContestEffectFlavorText1.equals(superContestEffectFlavorText2));
        System.assert(superContestEffectFlavorText2.equals(superContestEffectFlavorText1));
        System.assert(superContestEffectFlavorText3.equals(superContestEffectFlavorText4));
        System.assert(superContestEffectFlavorText4.equals(superContestEffectFlavorText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASSuperContestEffectFlavorText superContestEffectFlavorText1 = OASSuperContestEffectFlavorText.getExample();
        OASSuperContestEffectFlavorText superContestEffectFlavorText2 = new OASSuperContestEffectFlavorText();

        System.assertEquals(false, superContestEffectFlavorText1.equals('foo'));
        System.assertEquals(false, superContestEffectFlavorText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASSuperContestEffectFlavorText superContestEffectFlavorText1 = OASSuperContestEffectFlavorText.getExample();
        OASSuperContestEffectFlavorText superContestEffectFlavorText2 = new OASSuperContestEffectFlavorText();
        OASSuperContestEffectFlavorText superContestEffectFlavorText3;

        System.assertEquals(false, superContestEffectFlavorText1.equals(superContestEffectFlavorText3));
        System.assertEquals(false, superContestEffectFlavorText2.equals(superContestEffectFlavorText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASSuperContestEffectFlavorText superContestEffectFlavorText1 = OASSuperContestEffectFlavorText.getExample();
        OASSuperContestEffectFlavorText superContestEffectFlavorText2 = new OASSuperContestEffectFlavorText();

        System.assertEquals(superContestEffectFlavorText1.hashCode(), superContestEffectFlavorText1.hashCode());
        System.assertEquals(superContestEffectFlavorText2.hashCode(), superContestEffectFlavorText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASSuperContestEffectFlavorText superContestEffectFlavorText1 = OASSuperContestEffectFlavorText.getExample();
        OASSuperContestEffectFlavorText superContestEffectFlavorText2 = OASSuperContestEffectFlavorText.getExample();
        OASSuperContestEffectFlavorText superContestEffectFlavorText3 = new OASSuperContestEffectFlavorText();
        OASSuperContestEffectFlavorText superContestEffectFlavorText4 = new OASSuperContestEffectFlavorText();

        System.assert(superContestEffectFlavorText1.equals(superContestEffectFlavorText2));
        System.assert(superContestEffectFlavorText3.equals(superContestEffectFlavorText4));
        System.assertEquals(superContestEffectFlavorText1.hashCode(), superContestEffectFlavorText2.hashCode());
        System.assertEquals(superContestEffectFlavorText3.hashCode(), superContestEffectFlavorText4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASSuperContestEffectFlavorText superContestEffectFlavorText = new OASSuperContestEffectFlavorText();
        Map<String, String> x-property-mappings = superContestEffectFlavorText.getx-property-mappings();
        System.assertEquals('flavorText', x-property-mappings.get('flavor_text'));
    }
}
