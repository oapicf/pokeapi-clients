@isTest
private class OASPokemonShapeDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonShapeDetail pokemonShapeDetail1 = OASPokemonShapeDetail.getExample();
        OASPokemonShapeDetail pokemonShapeDetail2 = pokemonShapeDetail1;
        OASPokemonShapeDetail pokemonShapeDetail3 = new OASPokemonShapeDetail();
        OASPokemonShapeDetail pokemonShapeDetail4 = pokemonShapeDetail3;

        System.assert(pokemonShapeDetail1.equals(pokemonShapeDetail2));
        System.assert(pokemonShapeDetail2.equals(pokemonShapeDetail1));
        System.assert(pokemonShapeDetail1.equals(pokemonShapeDetail1));
        System.assert(pokemonShapeDetail3.equals(pokemonShapeDetail4));
        System.assert(pokemonShapeDetail4.equals(pokemonShapeDetail3));
        System.assert(pokemonShapeDetail3.equals(pokemonShapeDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonShapeDetail pokemonShapeDetail1 = OASPokemonShapeDetail.getExample();
        OASPokemonShapeDetail pokemonShapeDetail2 = OASPokemonShapeDetail.getExample();
        OASPokemonShapeDetail pokemonShapeDetail3 = new OASPokemonShapeDetail();
        OASPokemonShapeDetail pokemonShapeDetail4 = new OASPokemonShapeDetail();

        System.assert(pokemonShapeDetail1.equals(pokemonShapeDetail2));
        System.assert(pokemonShapeDetail2.equals(pokemonShapeDetail1));
        System.assert(pokemonShapeDetail3.equals(pokemonShapeDetail4));
        System.assert(pokemonShapeDetail4.equals(pokemonShapeDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonShapeDetail pokemonShapeDetail1 = OASPokemonShapeDetail.getExample();
        OASPokemonShapeDetail pokemonShapeDetail2 = new OASPokemonShapeDetail();

        System.assertEquals(false, pokemonShapeDetail1.equals('foo'));
        System.assertEquals(false, pokemonShapeDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonShapeDetail pokemonShapeDetail1 = OASPokemonShapeDetail.getExample();
        OASPokemonShapeDetail pokemonShapeDetail2 = new OASPokemonShapeDetail();
        OASPokemonShapeDetail pokemonShapeDetail3;

        System.assertEquals(false, pokemonShapeDetail1.equals(pokemonShapeDetail3));
        System.assertEquals(false, pokemonShapeDetail2.equals(pokemonShapeDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonShapeDetail pokemonShapeDetail1 = OASPokemonShapeDetail.getExample();
        OASPokemonShapeDetail pokemonShapeDetail2 = new OASPokemonShapeDetail();

        System.assertEquals(pokemonShapeDetail1.hashCode(), pokemonShapeDetail1.hashCode());
        System.assertEquals(pokemonShapeDetail2.hashCode(), pokemonShapeDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonShapeDetail pokemonShapeDetail1 = OASPokemonShapeDetail.getExample();
        OASPokemonShapeDetail pokemonShapeDetail2 = OASPokemonShapeDetail.getExample();
        OASPokemonShapeDetail pokemonShapeDetail3 = new OASPokemonShapeDetail();
        OASPokemonShapeDetail pokemonShapeDetail4 = new OASPokemonShapeDetail();

        System.assert(pokemonShapeDetail1.equals(pokemonShapeDetail2));
        System.assert(pokemonShapeDetail3.equals(pokemonShapeDetail4));
        System.assertEquals(pokemonShapeDetail1.hashCode(), pokemonShapeDetail2.hashCode());
        System.assertEquals(pokemonShapeDetail3.hashCode(), pokemonShapeDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonShapeDetail pokemonShapeDetail = new OASPokemonShapeDetail();
        Map<String, String> x-property-mappings = pokemonShapeDetail.getx-property-mappings();
        System.assertEquals('awesomeNames', x-property-mappings.get('awesome_names'));
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon_species'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonShapeDetail pokemonShapeDetail = new OASPokemonShapeDetail();
        System.assertEquals(new List<OASPokemonShapeDetailAwesomeNamesInn>(), pokemonShapeDetail.awesomeNames);
        System.assertEquals(new List<OASPokemonShapeDetailNamesInner>(), pokemonShapeDetail.names);
        System.assertEquals(new List<OASPokemonSpeciesSummary>(), pokemonShapeDetail.pokemonSpecies);
        System.assertEquals(null, pokemonShapeDetail.id);
        System.assertEquals(null, pokemonShapeDetail.name);
    }
}
