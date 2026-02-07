@isTest
private class OASPokemonDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonDetail pokemonDetail1 = OASPokemonDetail.getExample();
        OASPokemonDetail pokemonDetail2 = pokemonDetail1;
        OASPokemonDetail pokemonDetail3 = new OASPokemonDetail();
        OASPokemonDetail pokemonDetail4 = pokemonDetail3;

        System.assert(pokemonDetail1.equals(pokemonDetail2));
        System.assert(pokemonDetail2.equals(pokemonDetail1));
        System.assert(pokemonDetail1.equals(pokemonDetail1));
        System.assert(pokemonDetail3.equals(pokemonDetail4));
        System.assert(pokemonDetail4.equals(pokemonDetail3));
        System.assert(pokemonDetail3.equals(pokemonDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonDetail pokemonDetail1 = OASPokemonDetail.getExample();
        OASPokemonDetail pokemonDetail2 = OASPokemonDetail.getExample();
        OASPokemonDetail pokemonDetail3 = new OASPokemonDetail();
        OASPokemonDetail pokemonDetail4 = new OASPokemonDetail();

        System.assert(pokemonDetail1.equals(pokemonDetail2));
        System.assert(pokemonDetail2.equals(pokemonDetail1));
        System.assert(pokemonDetail3.equals(pokemonDetail4));
        System.assert(pokemonDetail4.equals(pokemonDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonDetail pokemonDetail1 = OASPokemonDetail.getExample();
        OASPokemonDetail pokemonDetail2 = new OASPokemonDetail();

        System.assertEquals(false, pokemonDetail1.equals('foo'));
        System.assertEquals(false, pokemonDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonDetail pokemonDetail1 = OASPokemonDetail.getExample();
        OASPokemonDetail pokemonDetail2 = new OASPokemonDetail();
        OASPokemonDetail pokemonDetail3;

        System.assertEquals(false, pokemonDetail1.equals(pokemonDetail3));
        System.assertEquals(false, pokemonDetail2.equals(pokemonDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonDetail pokemonDetail1 = OASPokemonDetail.getExample();
        OASPokemonDetail pokemonDetail2 = new OASPokemonDetail();

        System.assertEquals(pokemonDetail1.hashCode(), pokemonDetail1.hashCode());
        System.assertEquals(pokemonDetail2.hashCode(), pokemonDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonDetail pokemonDetail1 = OASPokemonDetail.getExample();
        OASPokemonDetail pokemonDetail2 = OASPokemonDetail.getExample();
        OASPokemonDetail pokemonDetail3 = new OASPokemonDetail();
        OASPokemonDetail pokemonDetail4 = new OASPokemonDetail();

        System.assert(pokemonDetail1.equals(pokemonDetail2));
        System.assert(pokemonDetail3.equals(pokemonDetail4));
        System.assertEquals(pokemonDetail1.hashCode(), pokemonDetail2.hashCode());
        System.assertEquals(pokemonDetail3.hashCode(), pokemonDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonDetail pokemonDetail = new OASPokemonDetail();
        Map<String, String> x-property-mappings = pokemonDetail.getx-property-mappings();
        System.assertEquals('baseExperience', x-property-mappings.get('base_experience'));
        System.assertEquals('isDefault', x-property-mappings.get('is_default'));
        System.assertEquals('pastAbilities', x-property-mappings.get('past_abilities'));
        System.assertEquals('gameIndices', x-property-mappings.get('game_indices'));
        System.assertEquals('heldItems', x-property-mappings.get('held_items'));
        System.assertEquals('locationAreaEncounters', x-property-mappings.get('location_area_encounters'));
        System.assertEquals('pastTypes', x-property-mappings.get('past_types'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonDetail pokemonDetail = new OASPokemonDetail();
        System.assertEquals(new List<OASPokemonDetailAbilitiesInner>(), pokemonDetail.abilities);
        System.assertEquals(new List<OASPokemonDetailPastAbilitiesInner>(), pokemonDetail.pastAbilities);
        System.assertEquals(new List<OASPokemonFormSummary>(), pokemonDetail.forms);
        System.assertEquals(new List<OASPokemonGameIndex>(), pokemonDetail.gameIndices);
        System.assertEquals(new List<OASPokemonDetailMovesInner>(), pokemonDetail.moves);
        System.assertEquals(new List<OASPokemonStat>(), pokemonDetail.stats);
        System.assertEquals(new List<OASPokemonDetailTypesInner>(), pokemonDetail.types);
        System.assertEquals(new List<OASPokemonDetailPastTypesInner>(), pokemonDetail.pastTypes);
        System.assertEquals(null, pokemonDetail.id);
        System.assertEquals(null, pokemonDetail.name);
        System.assertEquals(null, pokemonDetail.baseExperience);
        System.assertEquals(null, pokemonDetail.height);
        System.assertEquals(null, pokemonDetail.isDefault);
        System.assertEquals(null, pokemonDetail.order);
        System.assertEquals(null, pokemonDetail.weight);
        System.assertEquals(null, pokemonDetail.heldItems);
        System.assertEquals(null, pokemonDetail.locationAreaEncounters);
        System.assertEquals(null, pokemonDetail.species);
        System.assertEquals(null, pokemonDetail.sprites);
        System.assertEquals(null, pokemonDetail.cries);
    }
}
