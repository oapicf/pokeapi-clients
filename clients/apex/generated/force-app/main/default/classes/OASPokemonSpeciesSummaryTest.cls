@isTest
private class OASPokemonSpeciesSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpeciesSummary pokemonSpeciesSummary1 = OASPokemonSpeciesSummary.getExample();
        OASPokemonSpeciesSummary pokemonSpeciesSummary2 = pokemonSpeciesSummary1;
        OASPokemonSpeciesSummary pokemonSpeciesSummary3 = new OASPokemonSpeciesSummary();
        OASPokemonSpeciesSummary pokemonSpeciesSummary4 = pokemonSpeciesSummary3;

        System.assert(pokemonSpeciesSummary1.equals(pokemonSpeciesSummary2));
        System.assert(pokemonSpeciesSummary2.equals(pokemonSpeciesSummary1));
        System.assert(pokemonSpeciesSummary1.equals(pokemonSpeciesSummary1));
        System.assert(pokemonSpeciesSummary3.equals(pokemonSpeciesSummary4));
        System.assert(pokemonSpeciesSummary4.equals(pokemonSpeciesSummary3));
        System.assert(pokemonSpeciesSummary3.equals(pokemonSpeciesSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpeciesSummary pokemonSpeciesSummary1 = OASPokemonSpeciesSummary.getExample();
        OASPokemonSpeciesSummary pokemonSpeciesSummary2 = OASPokemonSpeciesSummary.getExample();
        OASPokemonSpeciesSummary pokemonSpeciesSummary3 = new OASPokemonSpeciesSummary();
        OASPokemonSpeciesSummary pokemonSpeciesSummary4 = new OASPokemonSpeciesSummary();

        System.assert(pokemonSpeciesSummary1.equals(pokemonSpeciesSummary2));
        System.assert(pokemonSpeciesSummary2.equals(pokemonSpeciesSummary1));
        System.assert(pokemonSpeciesSummary3.equals(pokemonSpeciesSummary4));
        System.assert(pokemonSpeciesSummary4.equals(pokemonSpeciesSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpeciesSummary pokemonSpeciesSummary1 = OASPokemonSpeciesSummary.getExample();
        OASPokemonSpeciesSummary pokemonSpeciesSummary2 = new OASPokemonSpeciesSummary();

        System.assertEquals(false, pokemonSpeciesSummary1.equals('foo'));
        System.assertEquals(false, pokemonSpeciesSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpeciesSummary pokemonSpeciesSummary1 = OASPokemonSpeciesSummary.getExample();
        OASPokemonSpeciesSummary pokemonSpeciesSummary2 = new OASPokemonSpeciesSummary();
        OASPokemonSpeciesSummary pokemonSpeciesSummary3;

        System.assertEquals(false, pokemonSpeciesSummary1.equals(pokemonSpeciesSummary3));
        System.assertEquals(false, pokemonSpeciesSummary2.equals(pokemonSpeciesSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpeciesSummary pokemonSpeciesSummary1 = OASPokemonSpeciesSummary.getExample();
        OASPokemonSpeciesSummary pokemonSpeciesSummary2 = new OASPokemonSpeciesSummary();

        System.assertEquals(pokemonSpeciesSummary1.hashCode(), pokemonSpeciesSummary1.hashCode());
        System.assertEquals(pokemonSpeciesSummary2.hashCode(), pokemonSpeciesSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpeciesSummary pokemonSpeciesSummary1 = OASPokemonSpeciesSummary.getExample();
        OASPokemonSpeciesSummary pokemonSpeciesSummary2 = OASPokemonSpeciesSummary.getExample();
        OASPokemonSpeciesSummary pokemonSpeciesSummary3 = new OASPokemonSpeciesSummary();
        OASPokemonSpeciesSummary pokemonSpeciesSummary4 = new OASPokemonSpeciesSummary();

        System.assert(pokemonSpeciesSummary1.equals(pokemonSpeciesSummary2));
        System.assert(pokemonSpeciesSummary3.equals(pokemonSpeciesSummary4));
        System.assertEquals(pokemonSpeciesSummary1.hashCode(), pokemonSpeciesSummary2.hashCode());
        System.assertEquals(pokemonSpeciesSummary3.hashCode(), pokemonSpeciesSummary4.hashCode());
    }
}
