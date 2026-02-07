@isTest
private class OASPokemonShapeSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonShapeSummary pokemonShapeSummary1 = OASPokemonShapeSummary.getExample();
        OASPokemonShapeSummary pokemonShapeSummary2 = pokemonShapeSummary1;
        OASPokemonShapeSummary pokemonShapeSummary3 = new OASPokemonShapeSummary();
        OASPokemonShapeSummary pokemonShapeSummary4 = pokemonShapeSummary3;

        System.assert(pokemonShapeSummary1.equals(pokemonShapeSummary2));
        System.assert(pokemonShapeSummary2.equals(pokemonShapeSummary1));
        System.assert(pokemonShapeSummary1.equals(pokemonShapeSummary1));
        System.assert(pokemonShapeSummary3.equals(pokemonShapeSummary4));
        System.assert(pokemonShapeSummary4.equals(pokemonShapeSummary3));
        System.assert(pokemonShapeSummary3.equals(pokemonShapeSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonShapeSummary pokemonShapeSummary1 = OASPokemonShapeSummary.getExample();
        OASPokemonShapeSummary pokemonShapeSummary2 = OASPokemonShapeSummary.getExample();
        OASPokemonShapeSummary pokemonShapeSummary3 = new OASPokemonShapeSummary();
        OASPokemonShapeSummary pokemonShapeSummary4 = new OASPokemonShapeSummary();

        System.assert(pokemonShapeSummary1.equals(pokemonShapeSummary2));
        System.assert(pokemonShapeSummary2.equals(pokemonShapeSummary1));
        System.assert(pokemonShapeSummary3.equals(pokemonShapeSummary4));
        System.assert(pokemonShapeSummary4.equals(pokemonShapeSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonShapeSummary pokemonShapeSummary1 = OASPokemonShapeSummary.getExample();
        OASPokemonShapeSummary pokemonShapeSummary2 = new OASPokemonShapeSummary();

        System.assertEquals(false, pokemonShapeSummary1.equals('foo'));
        System.assertEquals(false, pokemonShapeSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonShapeSummary pokemonShapeSummary1 = OASPokemonShapeSummary.getExample();
        OASPokemonShapeSummary pokemonShapeSummary2 = new OASPokemonShapeSummary();
        OASPokemonShapeSummary pokemonShapeSummary3;

        System.assertEquals(false, pokemonShapeSummary1.equals(pokemonShapeSummary3));
        System.assertEquals(false, pokemonShapeSummary2.equals(pokemonShapeSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonShapeSummary pokemonShapeSummary1 = OASPokemonShapeSummary.getExample();
        OASPokemonShapeSummary pokemonShapeSummary2 = new OASPokemonShapeSummary();

        System.assertEquals(pokemonShapeSummary1.hashCode(), pokemonShapeSummary1.hashCode());
        System.assertEquals(pokemonShapeSummary2.hashCode(), pokemonShapeSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonShapeSummary pokemonShapeSummary1 = OASPokemonShapeSummary.getExample();
        OASPokemonShapeSummary pokemonShapeSummary2 = OASPokemonShapeSummary.getExample();
        OASPokemonShapeSummary pokemonShapeSummary3 = new OASPokemonShapeSummary();
        OASPokemonShapeSummary pokemonShapeSummary4 = new OASPokemonShapeSummary();

        System.assert(pokemonShapeSummary1.equals(pokemonShapeSummary2));
        System.assert(pokemonShapeSummary3.equals(pokemonShapeSummary4));
        System.assertEquals(pokemonShapeSummary1.hashCode(), pokemonShapeSummary2.hashCode());
        System.assertEquals(pokemonShapeSummary3.hashCode(), pokemonShapeSummary4.hashCode());
    }
}
