@isTest
private class OASAbilityChangeTest {
    @isTest
    private static void equalsSameInstance() {
        OASAbilityChange abilityChange1 = OASAbilityChange.getExample();
        OASAbilityChange abilityChange2 = abilityChange1;
        OASAbilityChange abilityChange3 = new OASAbilityChange();
        OASAbilityChange abilityChange4 = abilityChange3;

        System.assert(abilityChange1.equals(abilityChange2));
        System.assert(abilityChange2.equals(abilityChange1));
        System.assert(abilityChange1.equals(abilityChange1));
        System.assert(abilityChange3.equals(abilityChange4));
        System.assert(abilityChange4.equals(abilityChange3));
        System.assert(abilityChange3.equals(abilityChange3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAbilityChange abilityChange1 = OASAbilityChange.getExample();
        OASAbilityChange abilityChange2 = OASAbilityChange.getExample();
        OASAbilityChange abilityChange3 = new OASAbilityChange();
        OASAbilityChange abilityChange4 = new OASAbilityChange();

        System.assert(abilityChange1.equals(abilityChange2));
        System.assert(abilityChange2.equals(abilityChange1));
        System.assert(abilityChange3.equals(abilityChange4));
        System.assert(abilityChange4.equals(abilityChange3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAbilityChange abilityChange1 = OASAbilityChange.getExample();
        OASAbilityChange abilityChange2 = new OASAbilityChange();

        System.assertEquals(false, abilityChange1.equals('foo'));
        System.assertEquals(false, abilityChange2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAbilityChange abilityChange1 = OASAbilityChange.getExample();
        OASAbilityChange abilityChange2 = new OASAbilityChange();
        OASAbilityChange abilityChange3;

        System.assertEquals(false, abilityChange1.equals(abilityChange3));
        System.assertEquals(false, abilityChange2.equals(abilityChange3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAbilityChange abilityChange1 = OASAbilityChange.getExample();
        OASAbilityChange abilityChange2 = new OASAbilityChange();

        System.assertEquals(abilityChange1.hashCode(), abilityChange1.hashCode());
        System.assertEquals(abilityChange2.hashCode(), abilityChange2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAbilityChange abilityChange1 = OASAbilityChange.getExample();
        OASAbilityChange abilityChange2 = OASAbilityChange.getExample();
        OASAbilityChange abilityChange3 = new OASAbilityChange();
        OASAbilityChange abilityChange4 = new OASAbilityChange();

        System.assert(abilityChange1.equals(abilityChange2));
        System.assert(abilityChange3.equals(abilityChange4));
        System.assertEquals(abilityChange1.hashCode(), abilityChange2.hashCode());
        System.assertEquals(abilityChange3.hashCode(), abilityChange4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAbilityChange abilityChange = new OASAbilityChange();
        Map<String, String> x-property-mappings = abilityChange.getx-property-mappings();
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
        System.assertEquals('effectEntries', x-property-mappings.get('effect_entries'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAbilityChange abilityChange = new OASAbilityChange();
        System.assertEquals(new List<OASAbilityChangeEffectText>(), abilityChange.effectEntries);
        System.assertEquals(null, abilityChange.versionGroup);
    }
}
