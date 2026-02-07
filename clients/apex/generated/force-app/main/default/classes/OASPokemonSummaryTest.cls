@isTest
private class OASPokemonSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSummary pokemonSummary1 = OASPokemonSummary.getExample();
        OASPokemonSummary pokemonSummary2 = pokemonSummary1;
        OASPokemonSummary pokemonSummary3 = new OASPokemonSummary();
        OASPokemonSummary pokemonSummary4 = pokemonSummary3;

        System.assert(pokemonSummary1.equals(pokemonSummary2));
        System.assert(pokemonSummary2.equals(pokemonSummary1));
        System.assert(pokemonSummary1.equals(pokemonSummary1));
        System.assert(pokemonSummary3.equals(pokemonSummary4));
        System.assert(pokemonSummary4.equals(pokemonSummary3));
        System.assert(pokemonSummary3.equals(pokemonSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSummary pokemonSummary1 = OASPokemonSummary.getExample();
        OASPokemonSummary pokemonSummary2 = OASPokemonSummary.getExample();
        OASPokemonSummary pokemonSummary3 = new OASPokemonSummary();
        OASPokemonSummary pokemonSummary4 = new OASPokemonSummary();

        System.assert(pokemonSummary1.equals(pokemonSummary2));
        System.assert(pokemonSummary2.equals(pokemonSummary1));
        System.assert(pokemonSummary3.equals(pokemonSummary4));
        System.assert(pokemonSummary4.equals(pokemonSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSummary pokemonSummary1 = OASPokemonSummary.getExample();
        OASPokemonSummary pokemonSummary2 = new OASPokemonSummary();

        System.assertEquals(false, pokemonSummary1.equals('foo'));
        System.assertEquals(false, pokemonSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSummary pokemonSummary1 = OASPokemonSummary.getExample();
        OASPokemonSummary pokemonSummary2 = new OASPokemonSummary();
        OASPokemonSummary pokemonSummary3;

        System.assertEquals(false, pokemonSummary1.equals(pokemonSummary3));
        System.assertEquals(false, pokemonSummary2.equals(pokemonSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSummary pokemonSummary1 = OASPokemonSummary.getExample();
        OASPokemonSummary pokemonSummary2 = new OASPokemonSummary();

        System.assertEquals(pokemonSummary1.hashCode(), pokemonSummary1.hashCode());
        System.assertEquals(pokemonSummary2.hashCode(), pokemonSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSummary pokemonSummary1 = OASPokemonSummary.getExample();
        OASPokemonSummary pokemonSummary2 = OASPokemonSummary.getExample();
        OASPokemonSummary pokemonSummary3 = new OASPokemonSummary();
        OASPokemonSummary pokemonSummary4 = new OASPokemonSummary();

        System.assert(pokemonSummary1.equals(pokemonSummary2));
        System.assert(pokemonSummary3.equals(pokemonSummary4));
        System.assertEquals(pokemonSummary1.hashCode(), pokemonSummary2.hashCode());
        System.assertEquals(pokemonSummary3.hashCode(), pokemonSummary4.hashCode());
    }
}
