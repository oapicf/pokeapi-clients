@isTest
private class OASItemDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASItemDetail itemDetail1 = OASItemDetail.getExample();
        OASItemDetail itemDetail2 = itemDetail1;
        OASItemDetail itemDetail3 = new OASItemDetail();
        OASItemDetail itemDetail4 = itemDetail3;

        System.assert(itemDetail1.equals(itemDetail2));
        System.assert(itemDetail2.equals(itemDetail1));
        System.assert(itemDetail1.equals(itemDetail1));
        System.assert(itemDetail3.equals(itemDetail4));
        System.assert(itemDetail4.equals(itemDetail3));
        System.assert(itemDetail3.equals(itemDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASItemDetail itemDetail1 = OASItemDetail.getExample();
        OASItemDetail itemDetail2 = OASItemDetail.getExample();
        OASItemDetail itemDetail3 = new OASItemDetail();
        OASItemDetail itemDetail4 = new OASItemDetail();

        System.assert(itemDetail1.equals(itemDetail2));
        System.assert(itemDetail2.equals(itemDetail1));
        System.assert(itemDetail3.equals(itemDetail4));
        System.assert(itemDetail4.equals(itemDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASItemDetail itemDetail1 = OASItemDetail.getExample();
        OASItemDetail itemDetail2 = new OASItemDetail();

        System.assertEquals(false, itemDetail1.equals('foo'));
        System.assertEquals(false, itemDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASItemDetail itemDetail1 = OASItemDetail.getExample();
        OASItemDetail itemDetail2 = new OASItemDetail();
        OASItemDetail itemDetail3;

        System.assertEquals(false, itemDetail1.equals(itemDetail3));
        System.assertEquals(false, itemDetail2.equals(itemDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASItemDetail itemDetail1 = OASItemDetail.getExample();
        OASItemDetail itemDetail2 = new OASItemDetail();

        System.assertEquals(itemDetail1.hashCode(), itemDetail1.hashCode());
        System.assertEquals(itemDetail2.hashCode(), itemDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASItemDetail itemDetail1 = OASItemDetail.getExample();
        OASItemDetail itemDetail2 = OASItemDetail.getExample();
        OASItemDetail itemDetail3 = new OASItemDetail();
        OASItemDetail itemDetail4 = new OASItemDetail();

        System.assert(itemDetail1.equals(itemDetail2));
        System.assert(itemDetail3.equals(itemDetail4));
        System.assertEquals(itemDetail1.hashCode(), itemDetail2.hashCode());
        System.assertEquals(itemDetail3.hashCode(), itemDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASItemDetail itemDetail = new OASItemDetail();
        Map<String, String> x-property-mappings = itemDetail.getx-property-mappings();
        System.assertEquals('flingPower', x-property-mappings.get('fling_power'));
        System.assertEquals('flingEffect', x-property-mappings.get('fling_effect'));
        System.assertEquals('effectEntries', x-property-mappings.get('effect_entries'));
        System.assertEquals('flavorTextEntries', x-property-mappings.get('flavor_text_entries'));
        System.assertEquals('gameIndices', x-property-mappings.get('game_indices'));
        System.assertEquals('heldByPokemon', x-property-mappings.get('held_by_pokemon'));
        System.assertEquals('babyTriggerFor', x-property-mappings.get('baby_trigger_for'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASItemDetail itemDetail = new OASItemDetail();
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), itemDetail.attributes);
        System.assertEquals(new List<OASItemEffectText>(), itemDetail.effectEntries);
        System.assertEquals(new List<OASItemFlavorText>(), itemDetail.flavorTextEntries);
        System.assertEquals(new List<OASItemGameIndex>(), itemDetail.gameIndices);
        System.assertEquals(new List<OASItemName>(), itemDetail.names);
        System.assertEquals(new List<OASItemDetailHeldByPokemonInner>(), itemDetail.heldByPokemon);
        System.assertEquals(new List<OASItemDetailMachinesInner>(), itemDetail.machines);
        System.assertEquals(null, itemDetail.id);
        System.assertEquals(null, itemDetail.name);
        System.assertEquals(null, itemDetail.cost);
        System.assertEquals(null, itemDetail.flingPower);
        System.assertEquals(null, itemDetail.flingEffect);
        System.assertEquals(null, itemDetail.category);
        System.assertEquals(null, itemDetail.sprites);
        System.assertEquals(null, itemDetail.babyTriggerFor);
    }
}
