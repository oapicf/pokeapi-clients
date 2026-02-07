@isTest
private class OASPokemonHabitatDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonHabitatDetail pokemonHabitatDetail1 = OASPokemonHabitatDetail.getExample();
        OASPokemonHabitatDetail pokemonHabitatDetail2 = pokemonHabitatDetail1;
        OASPokemonHabitatDetail pokemonHabitatDetail3 = new OASPokemonHabitatDetail();
        OASPokemonHabitatDetail pokemonHabitatDetail4 = pokemonHabitatDetail3;

        System.assert(pokemonHabitatDetail1.equals(pokemonHabitatDetail2));
        System.assert(pokemonHabitatDetail2.equals(pokemonHabitatDetail1));
        System.assert(pokemonHabitatDetail1.equals(pokemonHabitatDetail1));
        System.assert(pokemonHabitatDetail3.equals(pokemonHabitatDetail4));
        System.assert(pokemonHabitatDetail4.equals(pokemonHabitatDetail3));
        System.assert(pokemonHabitatDetail3.equals(pokemonHabitatDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonHabitatDetail pokemonHabitatDetail1 = OASPokemonHabitatDetail.getExample();
        OASPokemonHabitatDetail pokemonHabitatDetail2 = OASPokemonHabitatDetail.getExample();
        OASPokemonHabitatDetail pokemonHabitatDetail3 = new OASPokemonHabitatDetail();
        OASPokemonHabitatDetail pokemonHabitatDetail4 = new OASPokemonHabitatDetail();

        System.assert(pokemonHabitatDetail1.equals(pokemonHabitatDetail2));
        System.assert(pokemonHabitatDetail2.equals(pokemonHabitatDetail1));
        System.assert(pokemonHabitatDetail3.equals(pokemonHabitatDetail4));
        System.assert(pokemonHabitatDetail4.equals(pokemonHabitatDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonHabitatDetail pokemonHabitatDetail1 = OASPokemonHabitatDetail.getExample();
        OASPokemonHabitatDetail pokemonHabitatDetail2 = new OASPokemonHabitatDetail();

        System.assertEquals(false, pokemonHabitatDetail1.equals('foo'));
        System.assertEquals(false, pokemonHabitatDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonHabitatDetail pokemonHabitatDetail1 = OASPokemonHabitatDetail.getExample();
        OASPokemonHabitatDetail pokemonHabitatDetail2 = new OASPokemonHabitatDetail();
        OASPokemonHabitatDetail pokemonHabitatDetail3;

        System.assertEquals(false, pokemonHabitatDetail1.equals(pokemonHabitatDetail3));
        System.assertEquals(false, pokemonHabitatDetail2.equals(pokemonHabitatDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonHabitatDetail pokemonHabitatDetail1 = OASPokemonHabitatDetail.getExample();
        OASPokemonHabitatDetail pokemonHabitatDetail2 = new OASPokemonHabitatDetail();

        System.assertEquals(pokemonHabitatDetail1.hashCode(), pokemonHabitatDetail1.hashCode());
        System.assertEquals(pokemonHabitatDetail2.hashCode(), pokemonHabitatDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonHabitatDetail pokemonHabitatDetail1 = OASPokemonHabitatDetail.getExample();
        OASPokemonHabitatDetail pokemonHabitatDetail2 = OASPokemonHabitatDetail.getExample();
        OASPokemonHabitatDetail pokemonHabitatDetail3 = new OASPokemonHabitatDetail();
        OASPokemonHabitatDetail pokemonHabitatDetail4 = new OASPokemonHabitatDetail();

        System.assert(pokemonHabitatDetail1.equals(pokemonHabitatDetail2));
        System.assert(pokemonHabitatDetail3.equals(pokemonHabitatDetail4));
        System.assertEquals(pokemonHabitatDetail1.hashCode(), pokemonHabitatDetail2.hashCode());
        System.assertEquals(pokemonHabitatDetail3.hashCode(), pokemonHabitatDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonHabitatDetail pokemonHabitatDetail = new OASPokemonHabitatDetail();
        Map<String, String> x-property-mappings = pokemonHabitatDetail.getx-property-mappings();
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon_species'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonHabitatDetail pokemonHabitatDetail = new OASPokemonHabitatDetail();
        System.assertEquals(new List<OASPokemonHabitatName>(), pokemonHabitatDetail.names);
        System.assertEquals(new List<OASPokemonSpeciesSummary>(), pokemonHabitatDetail.pokemonSpecies);
        System.assertEquals(null, pokemonHabitatDetail.id);
        System.assertEquals(null, pokemonHabitatDetail.name);
    }
}
