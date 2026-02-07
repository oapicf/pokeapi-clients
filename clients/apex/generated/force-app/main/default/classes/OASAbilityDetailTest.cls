@isTest
private class OASAbilityDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASAbilityDetail abilityDetail1 = OASAbilityDetail.getExample();
        OASAbilityDetail abilityDetail2 = abilityDetail1;
        OASAbilityDetail abilityDetail3 = new OASAbilityDetail();
        OASAbilityDetail abilityDetail4 = abilityDetail3;

        System.assert(abilityDetail1.equals(abilityDetail2));
        System.assert(abilityDetail2.equals(abilityDetail1));
        System.assert(abilityDetail1.equals(abilityDetail1));
        System.assert(abilityDetail3.equals(abilityDetail4));
        System.assert(abilityDetail4.equals(abilityDetail3));
        System.assert(abilityDetail3.equals(abilityDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASAbilityDetail abilityDetail1 = OASAbilityDetail.getExample();
        OASAbilityDetail abilityDetail2 = OASAbilityDetail.getExample();
        OASAbilityDetail abilityDetail3 = new OASAbilityDetail();
        OASAbilityDetail abilityDetail4 = new OASAbilityDetail();

        System.assert(abilityDetail1.equals(abilityDetail2));
        System.assert(abilityDetail2.equals(abilityDetail1));
        System.assert(abilityDetail3.equals(abilityDetail4));
        System.assert(abilityDetail4.equals(abilityDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASAbilityDetail abilityDetail1 = OASAbilityDetail.getExample();
        OASAbilityDetail abilityDetail2 = new OASAbilityDetail();

        System.assertEquals(false, abilityDetail1.equals('foo'));
        System.assertEquals(false, abilityDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASAbilityDetail abilityDetail1 = OASAbilityDetail.getExample();
        OASAbilityDetail abilityDetail2 = new OASAbilityDetail();
        OASAbilityDetail abilityDetail3;

        System.assertEquals(false, abilityDetail1.equals(abilityDetail3));
        System.assertEquals(false, abilityDetail2.equals(abilityDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASAbilityDetail abilityDetail1 = OASAbilityDetail.getExample();
        OASAbilityDetail abilityDetail2 = new OASAbilityDetail();

        System.assertEquals(abilityDetail1.hashCode(), abilityDetail1.hashCode());
        System.assertEquals(abilityDetail2.hashCode(), abilityDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASAbilityDetail abilityDetail1 = OASAbilityDetail.getExample();
        OASAbilityDetail abilityDetail2 = OASAbilityDetail.getExample();
        OASAbilityDetail abilityDetail3 = new OASAbilityDetail();
        OASAbilityDetail abilityDetail4 = new OASAbilityDetail();

        System.assert(abilityDetail1.equals(abilityDetail2));
        System.assert(abilityDetail3.equals(abilityDetail4));
        System.assertEquals(abilityDetail1.hashCode(), abilityDetail2.hashCode());
        System.assertEquals(abilityDetail3.hashCode(), abilityDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASAbilityDetail abilityDetail = new OASAbilityDetail();
        Map<String, String> x-property-mappings = abilityDetail.getx-property-mappings();
        System.assertEquals('isMainSeries', x-property-mappings.get('is_main_series'));
        System.assertEquals('effectEntries', x-property-mappings.get('effect_entries'));
        System.assertEquals('effectChanges', x-property-mappings.get('effect_changes'));
        System.assertEquals('flavorTextEntries', x-property-mappings.get('flavor_text_entries'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASAbilityDetail abilityDetail = new OASAbilityDetail();
        System.assertEquals(new List<OASAbilityName>(), abilityDetail.names);
        System.assertEquals(new List<OASAbilityEffectText>(), abilityDetail.effectEntries);
        System.assertEquals(new List<OASAbilityChange>(), abilityDetail.effectChanges);
        System.assertEquals(new List<OASAbilityFlavorText>(), abilityDetail.flavorTextEntries);
        System.assertEquals(new List<OASAbilityDetailPokemonInner>(), abilityDetail.pokemon);
        System.assertEquals(null, abilityDetail.id);
        System.assertEquals(null, abilityDetail.name);
        System.assertEquals(null, abilityDetail.isMainSeries);
        System.assertEquals(null, abilityDetail.generation);
    }
}
