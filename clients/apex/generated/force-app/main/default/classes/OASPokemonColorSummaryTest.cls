@isTest
private class OASPokemonColorSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonColorSummary pokemonColorSummary1 = OASPokemonColorSummary.getExample();
        OASPokemonColorSummary pokemonColorSummary2 = pokemonColorSummary1;
        OASPokemonColorSummary pokemonColorSummary3 = new OASPokemonColorSummary();
        OASPokemonColorSummary pokemonColorSummary4 = pokemonColorSummary3;

        System.assert(pokemonColorSummary1.equals(pokemonColorSummary2));
        System.assert(pokemonColorSummary2.equals(pokemonColorSummary1));
        System.assert(pokemonColorSummary1.equals(pokemonColorSummary1));
        System.assert(pokemonColorSummary3.equals(pokemonColorSummary4));
        System.assert(pokemonColorSummary4.equals(pokemonColorSummary3));
        System.assert(pokemonColorSummary3.equals(pokemonColorSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonColorSummary pokemonColorSummary1 = OASPokemonColorSummary.getExample();
        OASPokemonColorSummary pokemonColorSummary2 = OASPokemonColorSummary.getExample();
        OASPokemonColorSummary pokemonColorSummary3 = new OASPokemonColorSummary();
        OASPokemonColorSummary pokemonColorSummary4 = new OASPokemonColorSummary();

        System.assert(pokemonColorSummary1.equals(pokemonColorSummary2));
        System.assert(pokemonColorSummary2.equals(pokemonColorSummary1));
        System.assert(pokemonColorSummary3.equals(pokemonColorSummary4));
        System.assert(pokemonColorSummary4.equals(pokemonColorSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonColorSummary pokemonColorSummary1 = OASPokemonColorSummary.getExample();
        OASPokemonColorSummary pokemonColorSummary2 = new OASPokemonColorSummary();

        System.assertEquals(false, pokemonColorSummary1.equals('foo'));
        System.assertEquals(false, pokemonColorSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonColorSummary pokemonColorSummary1 = OASPokemonColorSummary.getExample();
        OASPokemonColorSummary pokemonColorSummary2 = new OASPokemonColorSummary();
        OASPokemonColorSummary pokemonColorSummary3;

        System.assertEquals(false, pokemonColorSummary1.equals(pokemonColorSummary3));
        System.assertEquals(false, pokemonColorSummary2.equals(pokemonColorSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonColorSummary pokemonColorSummary1 = OASPokemonColorSummary.getExample();
        OASPokemonColorSummary pokemonColorSummary2 = new OASPokemonColorSummary();

        System.assertEquals(pokemonColorSummary1.hashCode(), pokemonColorSummary1.hashCode());
        System.assertEquals(pokemonColorSummary2.hashCode(), pokemonColorSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonColorSummary pokemonColorSummary1 = OASPokemonColorSummary.getExample();
        OASPokemonColorSummary pokemonColorSummary2 = OASPokemonColorSummary.getExample();
        OASPokemonColorSummary pokemonColorSummary3 = new OASPokemonColorSummary();
        OASPokemonColorSummary pokemonColorSummary4 = new OASPokemonColorSummary();

        System.assert(pokemonColorSummary1.equals(pokemonColorSummary2));
        System.assert(pokemonColorSummary3.equals(pokemonColorSummary4));
        System.assertEquals(pokemonColorSummary1.hashCode(), pokemonColorSummary2.hashCode());
        System.assertEquals(pokemonColorSummary3.hashCode(), pokemonColorSummary4.hashCode());
    }
}
