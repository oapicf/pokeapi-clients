@isTest
private class OASPokemonColorDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonColorDetail pokemonColorDetail1 = OASPokemonColorDetail.getExample();
        OASPokemonColorDetail pokemonColorDetail2 = pokemonColorDetail1;
        OASPokemonColorDetail pokemonColorDetail3 = new OASPokemonColorDetail();
        OASPokemonColorDetail pokemonColorDetail4 = pokemonColorDetail3;

        System.assert(pokemonColorDetail1.equals(pokemonColorDetail2));
        System.assert(pokemonColorDetail2.equals(pokemonColorDetail1));
        System.assert(pokemonColorDetail1.equals(pokemonColorDetail1));
        System.assert(pokemonColorDetail3.equals(pokemonColorDetail4));
        System.assert(pokemonColorDetail4.equals(pokemonColorDetail3));
        System.assert(pokemonColorDetail3.equals(pokemonColorDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonColorDetail pokemonColorDetail1 = OASPokemonColorDetail.getExample();
        OASPokemonColorDetail pokemonColorDetail2 = OASPokemonColorDetail.getExample();
        OASPokemonColorDetail pokemonColorDetail3 = new OASPokemonColorDetail();
        OASPokemonColorDetail pokemonColorDetail4 = new OASPokemonColorDetail();

        System.assert(pokemonColorDetail1.equals(pokemonColorDetail2));
        System.assert(pokemonColorDetail2.equals(pokemonColorDetail1));
        System.assert(pokemonColorDetail3.equals(pokemonColorDetail4));
        System.assert(pokemonColorDetail4.equals(pokemonColorDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonColorDetail pokemonColorDetail1 = OASPokemonColorDetail.getExample();
        OASPokemonColorDetail pokemonColorDetail2 = new OASPokemonColorDetail();

        System.assertEquals(false, pokemonColorDetail1.equals('foo'));
        System.assertEquals(false, pokemonColorDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonColorDetail pokemonColorDetail1 = OASPokemonColorDetail.getExample();
        OASPokemonColorDetail pokemonColorDetail2 = new OASPokemonColorDetail();
        OASPokemonColorDetail pokemonColorDetail3;

        System.assertEquals(false, pokemonColorDetail1.equals(pokemonColorDetail3));
        System.assertEquals(false, pokemonColorDetail2.equals(pokemonColorDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonColorDetail pokemonColorDetail1 = OASPokemonColorDetail.getExample();
        OASPokemonColorDetail pokemonColorDetail2 = new OASPokemonColorDetail();

        System.assertEquals(pokemonColorDetail1.hashCode(), pokemonColorDetail1.hashCode());
        System.assertEquals(pokemonColorDetail2.hashCode(), pokemonColorDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonColorDetail pokemonColorDetail1 = OASPokemonColorDetail.getExample();
        OASPokemonColorDetail pokemonColorDetail2 = OASPokemonColorDetail.getExample();
        OASPokemonColorDetail pokemonColorDetail3 = new OASPokemonColorDetail();
        OASPokemonColorDetail pokemonColorDetail4 = new OASPokemonColorDetail();

        System.assert(pokemonColorDetail1.equals(pokemonColorDetail2));
        System.assert(pokemonColorDetail3.equals(pokemonColorDetail4));
        System.assertEquals(pokemonColorDetail1.hashCode(), pokemonColorDetail2.hashCode());
        System.assertEquals(pokemonColorDetail3.hashCode(), pokemonColorDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonColorDetail pokemonColorDetail = new OASPokemonColorDetail();
        Map<String, String> x-property-mappings = pokemonColorDetail.getx-property-mappings();
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon_species'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonColorDetail pokemonColorDetail = new OASPokemonColorDetail();
        System.assertEquals(new List<OASPokemonColorName>(), pokemonColorDetail.names);
        System.assertEquals(new List<OASPokemonSpeciesSummary>(), pokemonColorDetail.pokemonSpecies);
        System.assertEquals(null, pokemonColorDetail.id);
        System.assertEquals(null, pokemonColorDetail.name);
    }
}
