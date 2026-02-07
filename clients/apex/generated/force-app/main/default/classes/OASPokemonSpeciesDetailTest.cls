@isTest
private class OASPokemonSpeciesDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpeciesDetail pokemonSpeciesDetail1 = OASPokemonSpeciesDetail.getExample();
        OASPokemonSpeciesDetail pokemonSpeciesDetail2 = pokemonSpeciesDetail1;
        OASPokemonSpeciesDetail pokemonSpeciesDetail3 = new OASPokemonSpeciesDetail();
        OASPokemonSpeciesDetail pokemonSpeciesDetail4 = pokemonSpeciesDetail3;

        System.assert(pokemonSpeciesDetail1.equals(pokemonSpeciesDetail2));
        System.assert(pokemonSpeciesDetail2.equals(pokemonSpeciesDetail1));
        System.assert(pokemonSpeciesDetail1.equals(pokemonSpeciesDetail1));
        System.assert(pokemonSpeciesDetail3.equals(pokemonSpeciesDetail4));
        System.assert(pokemonSpeciesDetail4.equals(pokemonSpeciesDetail3));
        System.assert(pokemonSpeciesDetail3.equals(pokemonSpeciesDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpeciesDetail pokemonSpeciesDetail1 = OASPokemonSpeciesDetail.getExample();
        OASPokemonSpeciesDetail pokemonSpeciesDetail2 = OASPokemonSpeciesDetail.getExample();
        OASPokemonSpeciesDetail pokemonSpeciesDetail3 = new OASPokemonSpeciesDetail();
        OASPokemonSpeciesDetail pokemonSpeciesDetail4 = new OASPokemonSpeciesDetail();

        System.assert(pokemonSpeciesDetail1.equals(pokemonSpeciesDetail2));
        System.assert(pokemonSpeciesDetail2.equals(pokemonSpeciesDetail1));
        System.assert(pokemonSpeciesDetail3.equals(pokemonSpeciesDetail4));
        System.assert(pokemonSpeciesDetail4.equals(pokemonSpeciesDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpeciesDetail pokemonSpeciesDetail1 = OASPokemonSpeciesDetail.getExample();
        OASPokemonSpeciesDetail pokemonSpeciesDetail2 = new OASPokemonSpeciesDetail();

        System.assertEquals(false, pokemonSpeciesDetail1.equals('foo'));
        System.assertEquals(false, pokemonSpeciesDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpeciesDetail pokemonSpeciesDetail1 = OASPokemonSpeciesDetail.getExample();
        OASPokemonSpeciesDetail pokemonSpeciesDetail2 = new OASPokemonSpeciesDetail();
        OASPokemonSpeciesDetail pokemonSpeciesDetail3;

        System.assertEquals(false, pokemonSpeciesDetail1.equals(pokemonSpeciesDetail3));
        System.assertEquals(false, pokemonSpeciesDetail2.equals(pokemonSpeciesDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpeciesDetail pokemonSpeciesDetail1 = OASPokemonSpeciesDetail.getExample();
        OASPokemonSpeciesDetail pokemonSpeciesDetail2 = new OASPokemonSpeciesDetail();

        System.assertEquals(pokemonSpeciesDetail1.hashCode(), pokemonSpeciesDetail1.hashCode());
        System.assertEquals(pokemonSpeciesDetail2.hashCode(), pokemonSpeciesDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpeciesDetail pokemonSpeciesDetail1 = OASPokemonSpeciesDetail.getExample();
        OASPokemonSpeciesDetail pokemonSpeciesDetail2 = OASPokemonSpeciesDetail.getExample();
        OASPokemonSpeciesDetail pokemonSpeciesDetail3 = new OASPokemonSpeciesDetail();
        OASPokemonSpeciesDetail pokemonSpeciesDetail4 = new OASPokemonSpeciesDetail();

        System.assert(pokemonSpeciesDetail1.equals(pokemonSpeciesDetail2));
        System.assert(pokemonSpeciesDetail3.equals(pokemonSpeciesDetail4));
        System.assertEquals(pokemonSpeciesDetail1.hashCode(), pokemonSpeciesDetail2.hashCode());
        System.assertEquals(pokemonSpeciesDetail3.hashCode(), pokemonSpeciesDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonSpeciesDetail pokemonSpeciesDetail = new OASPokemonSpeciesDetail();
        Map<String, String> x-property-mappings = pokemonSpeciesDetail.getx-property-mappings();
        System.assertEquals('genderRate', x-property-mappings.get('gender_rate'));
        System.assertEquals('captureRate', x-property-mappings.get('capture_rate'));
        System.assertEquals('baseHappiness', x-property-mappings.get('base_happiness'));
        System.assertEquals('isBaby', x-property-mappings.get('is_baby'));
        System.assertEquals('isLegendary', x-property-mappings.get('is_legendary'));
        System.assertEquals('isMythical', x-property-mappings.get('is_mythical'));
        System.assertEquals('hatchCounter', x-property-mappings.get('hatch_counter'));
        System.assertEquals('hasGenderDifferences', x-property-mappings.get('has_gender_differences'));
        System.assertEquals('formsSwitchable', x-property-mappings.get('forms_switchable'));
        System.assertEquals('growthRate', x-property-mappings.get('growth_rate'));
        System.assertEquals('pokedexNumbers', x-property-mappings.get('pokedex_numbers'));
        System.assertEquals('eggGroups', x-property-mappings.get('egg_groups'));
        System.assertEquals('evolvesFromSpecies', x-property-mappings.get('evolves_from_species'));
        System.assertEquals('evolutionChain', x-property-mappings.get('evolution_chain'));
        System.assertEquals('palParkEncounters', x-property-mappings.get('pal_park_encounters'));
        System.assertEquals('formDescriptions', x-property-mappings.get('form_descriptions'));
        System.assertEquals('flavorTextEntries', x-property-mappings.get('flavor_text_entries'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonSpeciesDetail pokemonSpeciesDetail = new OASPokemonSpeciesDetail();
        System.assertEquals(new List<OASPokemonDexEntry>(), pokemonSpeciesDetail.pokedexNumbers);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), pokemonSpeciesDetail.eggGroups);
        System.assertEquals(new List<OASPokemonFormDetailFormNamesInner>(), pokemonSpeciesDetail.names);
        System.assertEquals(new List<OASPokemonSpeciesDetailPalParkEncoun>(), pokemonSpeciesDetail.palParkEncounters);
        System.assertEquals(new List<OASPokemonSpeciesDescription>(), pokemonSpeciesDetail.formDescriptions);
        System.assertEquals(new List<OASPokemonSpeciesFlavorText>(), pokemonSpeciesDetail.flavorTextEntries);
        System.assertEquals(new List<OASPokemonSpeciesDetailGeneraInner>(), pokemonSpeciesDetail.genera);
        System.assertEquals(new List<OASPokemonSpeciesDetailVarietiesInne>(), pokemonSpeciesDetail.varieties);
        System.assertEquals(null, pokemonSpeciesDetail.id);
        System.assertEquals(null, pokemonSpeciesDetail.name);
        System.assertEquals(null, pokemonSpeciesDetail.order);
        System.assertEquals(null, pokemonSpeciesDetail.genderRate);
        System.assertEquals(null, pokemonSpeciesDetail.captureRate);
        System.assertEquals(null, pokemonSpeciesDetail.baseHappiness);
        System.assertEquals(null, pokemonSpeciesDetail.isBaby);
        System.assertEquals(null, pokemonSpeciesDetail.isLegendary);
        System.assertEquals(null, pokemonSpeciesDetail.isMythical);
        System.assertEquals(null, pokemonSpeciesDetail.hatchCounter);
        System.assertEquals(null, pokemonSpeciesDetail.hasGenderDifferences);
        System.assertEquals(null, pokemonSpeciesDetail.formsSwitchable);
        System.assertEquals(null, pokemonSpeciesDetail.growthRate);
        System.assertEquals(null, pokemonSpeciesDetail.color);
        System.assertEquals(null, pokemonSpeciesDetail.shape);
        System.assertEquals(null, pokemonSpeciesDetail.evolvesFromSpecies);
        System.assertEquals(null, pokemonSpeciesDetail.evolutionChain);
        System.assertEquals(null, pokemonSpeciesDetail.habitat);
        System.assertEquals(null, pokemonSpeciesDetail.generation);
    }
}
