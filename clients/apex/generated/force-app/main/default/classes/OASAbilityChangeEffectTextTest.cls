@isTest
private class OASAbilityChangeEffectTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASAbilityChangeEffectText abilityChangeEffectText1 = OASAbilityChangeEffectText.getExample();
        OASAbilityChangeEffectText abilityChangeEffectText2 = abilityChangeEffectText1;
        OASAbilityChangeEffectText abilityChangeEffectText3 = new OASAbilityChangeEffectText();
        OASAbilityChangeEffectText abilityChangeEffectText4 = abilityChangeEffectText3;

        System.assert(abilityChangeEffectText1.equals(abilityChangeEffectText2));
        System.assert(abilityChangeEffectText2.equals(abilityChangeEffectText1));
        System.assert(abilityChangeEffectText1.equals(abilityChangeEffectText1));
        System.assert(abilityChangeEffectText3.equals(abilityChangeEffectText4));
        System.assert(abilityChangeEffectText4.equals(abilityChangeEffectText3));
        System.assert(abilityChangeEffectText3.equals(abilityChangeEffectText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAbilityChangeEffectText abilityChangeEffectText1 = OASAbilityChangeEffectText.getExample();
        OASAbilityChangeEffectText abilityChangeEffectText2 = OASAbilityChangeEffectText.getExample();
        OASAbilityChangeEffectText abilityChangeEffectText3 = new OASAbilityChangeEffectText();
        OASAbilityChangeEffectText abilityChangeEffectText4 = new OASAbilityChangeEffectText();

        System.assert(abilityChangeEffectText1.equals(abilityChangeEffectText2));
        System.assert(abilityChangeEffectText2.equals(abilityChangeEffectText1));
        System.assert(abilityChangeEffectText3.equals(abilityChangeEffectText4));
        System.assert(abilityChangeEffectText4.equals(abilityChangeEffectText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAbilityChangeEffectText abilityChangeEffectText1 = OASAbilityChangeEffectText.getExample();
        OASAbilityChangeEffectText abilityChangeEffectText2 = new OASAbilityChangeEffectText();

        System.assertEquals(false, abilityChangeEffectText1.equals('foo'));
        System.assertEquals(false, abilityChangeEffectText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAbilityChangeEffectText abilityChangeEffectText1 = OASAbilityChangeEffectText.getExample();
        OASAbilityChangeEffectText abilityChangeEffectText2 = new OASAbilityChangeEffectText();
        OASAbilityChangeEffectText abilityChangeEffectText3;

        System.assertEquals(false, abilityChangeEffectText1.equals(abilityChangeEffectText3));
        System.assertEquals(false, abilityChangeEffectText2.equals(abilityChangeEffectText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAbilityChangeEffectText abilityChangeEffectText1 = OASAbilityChangeEffectText.getExample();
        OASAbilityChangeEffectText abilityChangeEffectText2 = new OASAbilityChangeEffectText();

        System.assertEquals(abilityChangeEffectText1.hashCode(), abilityChangeEffectText1.hashCode());
        System.assertEquals(abilityChangeEffectText2.hashCode(), abilityChangeEffectText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAbilityChangeEffectText abilityChangeEffectText1 = OASAbilityChangeEffectText.getExample();
        OASAbilityChangeEffectText abilityChangeEffectText2 = OASAbilityChangeEffectText.getExample();
        OASAbilityChangeEffectText abilityChangeEffectText3 = new OASAbilityChangeEffectText();
        OASAbilityChangeEffectText abilityChangeEffectText4 = new OASAbilityChangeEffectText();

        System.assert(abilityChangeEffectText1.equals(abilityChangeEffectText2));
        System.assert(abilityChangeEffectText3.equals(abilityChangeEffectText4));
        System.assertEquals(abilityChangeEffectText1.hashCode(), abilityChangeEffectText2.hashCode());
        System.assertEquals(abilityChangeEffectText3.hashCode(), abilityChangeEffectText4.hashCode());
    }
}
