@isTest
private class OASPokedexDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokedexDetail pokedexDetail1 = OASPokedexDetail.getExample();
        OASPokedexDetail pokedexDetail2 = pokedexDetail1;
        OASPokedexDetail pokedexDetail3 = new OASPokedexDetail();
        OASPokedexDetail pokedexDetail4 = pokedexDetail3;

        System.assert(pokedexDetail1.equals(pokedexDetail2));
        System.assert(pokedexDetail2.equals(pokedexDetail1));
        System.assert(pokedexDetail1.equals(pokedexDetail1));
        System.assert(pokedexDetail3.equals(pokedexDetail4));
        System.assert(pokedexDetail4.equals(pokedexDetail3));
        System.assert(pokedexDetail3.equals(pokedexDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokedexDetail pokedexDetail1 = OASPokedexDetail.getExample();
        OASPokedexDetail pokedexDetail2 = OASPokedexDetail.getExample();
        OASPokedexDetail pokedexDetail3 = new OASPokedexDetail();
        OASPokedexDetail pokedexDetail4 = new OASPokedexDetail();

        System.assert(pokedexDetail1.equals(pokedexDetail2));
        System.assert(pokedexDetail2.equals(pokedexDetail1));
        System.assert(pokedexDetail3.equals(pokedexDetail4));
        System.assert(pokedexDetail4.equals(pokedexDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokedexDetail pokedexDetail1 = OASPokedexDetail.getExample();
        OASPokedexDetail pokedexDetail2 = new OASPokedexDetail();

        System.assertEquals(false, pokedexDetail1.equals('foo'));
        System.assertEquals(false, pokedexDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokedexDetail pokedexDetail1 = OASPokedexDetail.getExample();
        OASPokedexDetail pokedexDetail2 = new OASPokedexDetail();
        OASPokedexDetail pokedexDetail3;

        System.assertEquals(false, pokedexDetail1.equals(pokedexDetail3));
        System.assertEquals(false, pokedexDetail2.equals(pokedexDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokedexDetail pokedexDetail1 = OASPokedexDetail.getExample();
        OASPokedexDetail pokedexDetail2 = new OASPokedexDetail();

        System.assertEquals(pokedexDetail1.hashCode(), pokedexDetail1.hashCode());
        System.assertEquals(pokedexDetail2.hashCode(), pokedexDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokedexDetail pokedexDetail1 = OASPokedexDetail.getExample();
        OASPokedexDetail pokedexDetail2 = OASPokedexDetail.getExample();
        OASPokedexDetail pokedexDetail3 = new OASPokedexDetail();
        OASPokedexDetail pokedexDetail4 = new OASPokedexDetail();

        System.assert(pokedexDetail1.equals(pokedexDetail2));
        System.assert(pokedexDetail3.equals(pokedexDetail4));
        System.assertEquals(pokedexDetail1.hashCode(), pokedexDetail2.hashCode());
        System.assertEquals(pokedexDetail3.hashCode(), pokedexDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokedexDetail pokedexDetail = new OASPokedexDetail();
        Map<String, String> x-property-mappings = pokedexDetail.getx-property-mappings();
        System.assertEquals('isMainSeries', x-property-mappings.get('is_main_series'));
        System.assertEquals('pokemonEntries', x-property-mappings.get('pokemon_entries'));
        System.assertEquals('versionGroups', x-property-mappings.get('version_groups'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokedexDetail pokedexDetail = new OASPokedexDetail();
        System.assertEquals(new List<OASPokedexDescription>(), pokedexDetail.descriptions);
        System.assertEquals(new List<OASPokedexName>(), pokedexDetail.names);
        System.assertEquals(new List<OASPokedexDetailPokemonEntriesInner>(), pokedexDetail.pokemonEntries);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), pokedexDetail.versionGroups);
        System.assertEquals(null, pokedexDetail.id);
        System.assertEquals(null, pokedexDetail.name);
        System.assertEquals(null, pokedexDetail.isMainSeries);
        System.assertEquals(null, pokedexDetail.region);
    }
}
