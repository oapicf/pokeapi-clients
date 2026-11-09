@isTest
private class OASPokemonHeldItemSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonHeldItemSummary pokemonHeldItemSummary1 = OASPokemonHeldItemSummary.getExample();
        OASPokemonHeldItemSummary pokemonHeldItemSummary2 = pokemonHeldItemSummary1;
        OASPokemonHeldItemSummary pokemonHeldItemSummary3 = new OASPokemonHeldItemSummary();
        OASPokemonHeldItemSummary pokemonHeldItemSummary4 = pokemonHeldItemSummary3;

        System.assert(pokemonHeldItemSummary1.equals(pokemonHeldItemSummary2));
        System.assert(pokemonHeldItemSummary2.equals(pokemonHeldItemSummary1));
        System.assert(pokemonHeldItemSummary1.equals(pokemonHeldItemSummary1));
        System.assert(pokemonHeldItemSummary3.equals(pokemonHeldItemSummary4));
        System.assert(pokemonHeldItemSummary4.equals(pokemonHeldItemSummary3));
        System.assert(pokemonHeldItemSummary3.equals(pokemonHeldItemSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonHeldItemSummary pokemonHeldItemSummary1 = OASPokemonHeldItemSummary.getExample();
        OASPokemonHeldItemSummary pokemonHeldItemSummary2 = OASPokemonHeldItemSummary.getExample();
        OASPokemonHeldItemSummary pokemonHeldItemSummary3 = new OASPokemonHeldItemSummary();
        OASPokemonHeldItemSummary pokemonHeldItemSummary4 = new OASPokemonHeldItemSummary();

        System.assert(pokemonHeldItemSummary1.equals(pokemonHeldItemSummary2));
        System.assert(pokemonHeldItemSummary2.equals(pokemonHeldItemSummary1));
        System.assert(pokemonHeldItemSummary3.equals(pokemonHeldItemSummary4));
        System.assert(pokemonHeldItemSummary4.equals(pokemonHeldItemSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonHeldItemSummary pokemonHeldItemSummary1 = OASPokemonHeldItemSummary.getExample();
        OASPokemonHeldItemSummary pokemonHeldItemSummary2 = new OASPokemonHeldItemSummary();

        System.assertEquals(false, pokemonHeldItemSummary1.equals('foo'));
        System.assertEquals(false, pokemonHeldItemSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonHeldItemSummary pokemonHeldItemSummary1 = OASPokemonHeldItemSummary.getExample();
        OASPokemonHeldItemSummary pokemonHeldItemSummary2 = new OASPokemonHeldItemSummary();
        OASPokemonHeldItemSummary pokemonHeldItemSummary3;

        System.assertEquals(false, pokemonHeldItemSummary1.equals(pokemonHeldItemSummary3));
        System.assertEquals(false, pokemonHeldItemSummary2.equals(pokemonHeldItemSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonHeldItemSummary pokemonHeldItemSummary1 = OASPokemonHeldItemSummary.getExample();
        OASPokemonHeldItemSummary pokemonHeldItemSummary2 = new OASPokemonHeldItemSummary();

        System.assertEquals(pokemonHeldItemSummary1.hashCode(), pokemonHeldItemSummary1.hashCode());
        System.assertEquals(pokemonHeldItemSummary2.hashCode(), pokemonHeldItemSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonHeldItemSummary pokemonHeldItemSummary1 = OASPokemonHeldItemSummary.getExample();
        OASPokemonHeldItemSummary pokemonHeldItemSummary2 = OASPokemonHeldItemSummary.getExample();
        OASPokemonHeldItemSummary pokemonHeldItemSummary3 = new OASPokemonHeldItemSummary();
        OASPokemonHeldItemSummary pokemonHeldItemSummary4 = new OASPokemonHeldItemSummary();

        System.assert(pokemonHeldItemSummary1.equals(pokemonHeldItemSummary2));
        System.assert(pokemonHeldItemSummary3.equals(pokemonHeldItemSummary4));
        System.assertEquals(pokemonHeldItemSummary1.hashCode(), pokemonHeldItemSummary2.hashCode());
        System.assertEquals(pokemonHeldItemSummary3.hashCode(), pokemonHeldItemSummary4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonHeldItemSummary pokemonHeldItemSummary = new OASPokemonHeldItemSummary();
        Map<String, String> x-property-mappings = pokemonHeldItemSummary.getx-property-mappings();
        System.assertEquals('versionDetails', x-property-mappings.get('version_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonHeldItemSummary pokemonHeldItemSummary = new OASPokemonHeldItemSummary();
        System.assertEquals(new List<OASPokemonHeldItemVersion>(), pokemonHeldItemSummary.versionDetails);
        System.assertEquals(null, pokemonHeldItemSummary.item);
    }
}
