@isTest
private class OASAbilityFlavorTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASAbilityFlavorText abilityFlavorText1 = OASAbilityFlavorText.getExample();
        OASAbilityFlavorText abilityFlavorText2 = abilityFlavorText1;
        OASAbilityFlavorText abilityFlavorText3 = new OASAbilityFlavorText();
        OASAbilityFlavorText abilityFlavorText4 = abilityFlavorText3;

        System.assert(abilityFlavorText1.equals(abilityFlavorText2));
        System.assert(abilityFlavorText2.equals(abilityFlavorText1));
        System.assert(abilityFlavorText1.equals(abilityFlavorText1));
        System.assert(abilityFlavorText3.equals(abilityFlavorText4));
        System.assert(abilityFlavorText4.equals(abilityFlavorText3));
        System.assert(abilityFlavorText3.equals(abilityFlavorText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAbilityFlavorText abilityFlavorText1 = OASAbilityFlavorText.getExample();
        OASAbilityFlavorText abilityFlavorText2 = OASAbilityFlavorText.getExample();
        OASAbilityFlavorText abilityFlavorText3 = new OASAbilityFlavorText();
        OASAbilityFlavorText abilityFlavorText4 = new OASAbilityFlavorText();

        System.assert(abilityFlavorText1.equals(abilityFlavorText2));
        System.assert(abilityFlavorText2.equals(abilityFlavorText1));
        System.assert(abilityFlavorText3.equals(abilityFlavorText4));
        System.assert(abilityFlavorText4.equals(abilityFlavorText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAbilityFlavorText abilityFlavorText1 = OASAbilityFlavorText.getExample();
        OASAbilityFlavorText abilityFlavorText2 = new OASAbilityFlavorText();

        System.assertEquals(false, abilityFlavorText1.equals('foo'));
        System.assertEquals(false, abilityFlavorText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAbilityFlavorText abilityFlavorText1 = OASAbilityFlavorText.getExample();
        OASAbilityFlavorText abilityFlavorText2 = new OASAbilityFlavorText();
        OASAbilityFlavorText abilityFlavorText3;

        System.assertEquals(false, abilityFlavorText1.equals(abilityFlavorText3));
        System.assertEquals(false, abilityFlavorText2.equals(abilityFlavorText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAbilityFlavorText abilityFlavorText1 = OASAbilityFlavorText.getExample();
        OASAbilityFlavorText abilityFlavorText2 = new OASAbilityFlavorText();

        System.assertEquals(abilityFlavorText1.hashCode(), abilityFlavorText1.hashCode());
        System.assertEquals(abilityFlavorText2.hashCode(), abilityFlavorText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAbilityFlavorText abilityFlavorText1 = OASAbilityFlavorText.getExample();
        OASAbilityFlavorText abilityFlavorText2 = OASAbilityFlavorText.getExample();
        OASAbilityFlavorText abilityFlavorText3 = new OASAbilityFlavorText();
        OASAbilityFlavorText abilityFlavorText4 = new OASAbilityFlavorText();

        System.assert(abilityFlavorText1.equals(abilityFlavorText2));
        System.assert(abilityFlavorText3.equals(abilityFlavorText4));
        System.assertEquals(abilityFlavorText1.hashCode(), abilityFlavorText2.hashCode());
        System.assertEquals(abilityFlavorText3.hashCode(), abilityFlavorText4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAbilityFlavorText abilityFlavorText = new OASAbilityFlavorText();
        Map<String, String> x-property-mappings = abilityFlavorText.getx-property-mappings();
        System.assertEquals('flavorText', x-property-mappings.get('flavor_text'));
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }
}
