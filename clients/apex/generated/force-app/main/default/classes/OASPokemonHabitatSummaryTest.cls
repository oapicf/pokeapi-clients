@isTest
private class OASPokemonHabitatSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonHabitatSummary pokemonHabitatSummary1 = OASPokemonHabitatSummary.getExample();
        OASPokemonHabitatSummary pokemonHabitatSummary2 = pokemonHabitatSummary1;
        OASPokemonHabitatSummary pokemonHabitatSummary3 = new OASPokemonHabitatSummary();
        OASPokemonHabitatSummary pokemonHabitatSummary4 = pokemonHabitatSummary3;

        System.assert(pokemonHabitatSummary1.equals(pokemonHabitatSummary2));
        System.assert(pokemonHabitatSummary2.equals(pokemonHabitatSummary1));
        System.assert(pokemonHabitatSummary1.equals(pokemonHabitatSummary1));
        System.assert(pokemonHabitatSummary3.equals(pokemonHabitatSummary4));
        System.assert(pokemonHabitatSummary4.equals(pokemonHabitatSummary3));
        System.assert(pokemonHabitatSummary3.equals(pokemonHabitatSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonHabitatSummary pokemonHabitatSummary1 = OASPokemonHabitatSummary.getExample();
        OASPokemonHabitatSummary pokemonHabitatSummary2 = OASPokemonHabitatSummary.getExample();
        OASPokemonHabitatSummary pokemonHabitatSummary3 = new OASPokemonHabitatSummary();
        OASPokemonHabitatSummary pokemonHabitatSummary4 = new OASPokemonHabitatSummary();

        System.assert(pokemonHabitatSummary1.equals(pokemonHabitatSummary2));
        System.assert(pokemonHabitatSummary2.equals(pokemonHabitatSummary1));
        System.assert(pokemonHabitatSummary3.equals(pokemonHabitatSummary4));
        System.assert(pokemonHabitatSummary4.equals(pokemonHabitatSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonHabitatSummary pokemonHabitatSummary1 = OASPokemonHabitatSummary.getExample();
        OASPokemonHabitatSummary pokemonHabitatSummary2 = new OASPokemonHabitatSummary();

        System.assertEquals(false, pokemonHabitatSummary1.equals('foo'));
        System.assertEquals(false, pokemonHabitatSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonHabitatSummary pokemonHabitatSummary1 = OASPokemonHabitatSummary.getExample();
        OASPokemonHabitatSummary pokemonHabitatSummary2 = new OASPokemonHabitatSummary();
        OASPokemonHabitatSummary pokemonHabitatSummary3;

        System.assertEquals(false, pokemonHabitatSummary1.equals(pokemonHabitatSummary3));
        System.assertEquals(false, pokemonHabitatSummary2.equals(pokemonHabitatSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonHabitatSummary pokemonHabitatSummary1 = OASPokemonHabitatSummary.getExample();
        OASPokemonHabitatSummary pokemonHabitatSummary2 = new OASPokemonHabitatSummary();

        System.assertEquals(pokemonHabitatSummary1.hashCode(), pokemonHabitatSummary1.hashCode());
        System.assertEquals(pokemonHabitatSummary2.hashCode(), pokemonHabitatSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonHabitatSummary pokemonHabitatSummary1 = OASPokemonHabitatSummary.getExample();
        OASPokemonHabitatSummary pokemonHabitatSummary2 = OASPokemonHabitatSummary.getExample();
        OASPokemonHabitatSummary pokemonHabitatSummary3 = new OASPokemonHabitatSummary();
        OASPokemonHabitatSummary pokemonHabitatSummary4 = new OASPokemonHabitatSummary();

        System.assert(pokemonHabitatSummary1.equals(pokemonHabitatSummary2));
        System.assert(pokemonHabitatSummary3.equals(pokemonHabitatSummary4));
        System.assertEquals(pokemonHabitatSummary1.hashCode(), pokemonHabitatSummary2.hashCode());
        System.assertEquals(pokemonHabitatSummary3.hashCode(), pokemonHabitatSummary4.hashCode());
    }
}
