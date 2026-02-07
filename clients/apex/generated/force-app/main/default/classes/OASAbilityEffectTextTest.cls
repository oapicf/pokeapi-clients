@isTest
private class OASAbilityEffectTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASAbilityEffectText abilityEffectText1 = OASAbilityEffectText.getExample();
        OASAbilityEffectText abilityEffectText2 = abilityEffectText1;
        OASAbilityEffectText abilityEffectText3 = new OASAbilityEffectText();
        OASAbilityEffectText abilityEffectText4 = abilityEffectText3;

        System.assert(abilityEffectText1.equals(abilityEffectText2));
        System.assert(abilityEffectText2.equals(abilityEffectText1));
        System.assert(abilityEffectText1.equals(abilityEffectText1));
        System.assert(abilityEffectText3.equals(abilityEffectText4));
        System.assert(abilityEffectText4.equals(abilityEffectText3));
        System.assert(abilityEffectText3.equals(abilityEffectText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAbilityEffectText abilityEffectText1 = OASAbilityEffectText.getExample();
        OASAbilityEffectText abilityEffectText2 = OASAbilityEffectText.getExample();
        OASAbilityEffectText abilityEffectText3 = new OASAbilityEffectText();
        OASAbilityEffectText abilityEffectText4 = new OASAbilityEffectText();

        System.assert(abilityEffectText1.equals(abilityEffectText2));
        System.assert(abilityEffectText2.equals(abilityEffectText1));
        System.assert(abilityEffectText3.equals(abilityEffectText4));
        System.assert(abilityEffectText4.equals(abilityEffectText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAbilityEffectText abilityEffectText1 = OASAbilityEffectText.getExample();
        OASAbilityEffectText abilityEffectText2 = new OASAbilityEffectText();

        System.assertEquals(false, abilityEffectText1.equals('foo'));
        System.assertEquals(false, abilityEffectText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAbilityEffectText abilityEffectText1 = OASAbilityEffectText.getExample();
        OASAbilityEffectText abilityEffectText2 = new OASAbilityEffectText();
        OASAbilityEffectText abilityEffectText3;

        System.assertEquals(false, abilityEffectText1.equals(abilityEffectText3));
        System.assertEquals(false, abilityEffectText2.equals(abilityEffectText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAbilityEffectText abilityEffectText1 = OASAbilityEffectText.getExample();
        OASAbilityEffectText abilityEffectText2 = new OASAbilityEffectText();

        System.assertEquals(abilityEffectText1.hashCode(), abilityEffectText1.hashCode());
        System.assertEquals(abilityEffectText2.hashCode(), abilityEffectText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAbilityEffectText abilityEffectText1 = OASAbilityEffectText.getExample();
        OASAbilityEffectText abilityEffectText2 = OASAbilityEffectText.getExample();
        OASAbilityEffectText abilityEffectText3 = new OASAbilityEffectText();
        OASAbilityEffectText abilityEffectText4 = new OASAbilityEffectText();

        System.assert(abilityEffectText1.equals(abilityEffectText2));
        System.assert(abilityEffectText3.equals(abilityEffectText4));
        System.assertEquals(abilityEffectText1.hashCode(), abilityEffectText2.hashCode());
        System.assertEquals(abilityEffectText3.hashCode(), abilityEffectText4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAbilityEffectText abilityEffectText = new OASAbilityEffectText();
        Map<String, String> x-property-mappings = abilityEffectText.getx-property-mappings();
        System.assertEquals('shortEffect', x-property-mappings.get('short_effect'));
    }
}
