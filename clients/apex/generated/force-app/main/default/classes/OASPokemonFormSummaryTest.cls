@isTest
private class OASPokemonFormSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonFormSummary pokemonFormSummary1 = OASPokemonFormSummary.getExample();
        OASPokemonFormSummary pokemonFormSummary2 = pokemonFormSummary1;
        OASPokemonFormSummary pokemonFormSummary3 = new OASPokemonFormSummary();
        OASPokemonFormSummary pokemonFormSummary4 = pokemonFormSummary3;

        System.assert(pokemonFormSummary1.equals(pokemonFormSummary2));
        System.assert(pokemonFormSummary2.equals(pokemonFormSummary1));
        System.assert(pokemonFormSummary1.equals(pokemonFormSummary1));
        System.assert(pokemonFormSummary3.equals(pokemonFormSummary4));
        System.assert(pokemonFormSummary4.equals(pokemonFormSummary3));
        System.assert(pokemonFormSummary3.equals(pokemonFormSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonFormSummary pokemonFormSummary1 = OASPokemonFormSummary.getExample();
        OASPokemonFormSummary pokemonFormSummary2 = OASPokemonFormSummary.getExample();
        OASPokemonFormSummary pokemonFormSummary3 = new OASPokemonFormSummary();
        OASPokemonFormSummary pokemonFormSummary4 = new OASPokemonFormSummary();

        System.assert(pokemonFormSummary1.equals(pokemonFormSummary2));
        System.assert(pokemonFormSummary2.equals(pokemonFormSummary1));
        System.assert(pokemonFormSummary3.equals(pokemonFormSummary4));
        System.assert(pokemonFormSummary4.equals(pokemonFormSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonFormSummary pokemonFormSummary1 = OASPokemonFormSummary.getExample();
        OASPokemonFormSummary pokemonFormSummary2 = new OASPokemonFormSummary();

        System.assertEquals(false, pokemonFormSummary1.equals('foo'));
        System.assertEquals(false, pokemonFormSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonFormSummary pokemonFormSummary1 = OASPokemonFormSummary.getExample();
        OASPokemonFormSummary pokemonFormSummary2 = new OASPokemonFormSummary();
        OASPokemonFormSummary pokemonFormSummary3;

        System.assertEquals(false, pokemonFormSummary1.equals(pokemonFormSummary3));
        System.assertEquals(false, pokemonFormSummary2.equals(pokemonFormSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonFormSummary pokemonFormSummary1 = OASPokemonFormSummary.getExample();
        OASPokemonFormSummary pokemonFormSummary2 = new OASPokemonFormSummary();

        System.assertEquals(pokemonFormSummary1.hashCode(), pokemonFormSummary1.hashCode());
        System.assertEquals(pokemonFormSummary2.hashCode(), pokemonFormSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonFormSummary pokemonFormSummary1 = OASPokemonFormSummary.getExample();
        OASPokemonFormSummary pokemonFormSummary2 = OASPokemonFormSummary.getExample();
        OASPokemonFormSummary pokemonFormSummary3 = new OASPokemonFormSummary();
        OASPokemonFormSummary pokemonFormSummary4 = new OASPokemonFormSummary();

        System.assert(pokemonFormSummary1.equals(pokemonFormSummary2));
        System.assert(pokemonFormSummary3.equals(pokemonFormSummary4));
        System.assertEquals(pokemonFormSummary1.hashCode(), pokemonFormSummary2.hashCode());
        System.assertEquals(pokemonFormSummary3.hashCode(), pokemonFormSummary4.hashCode());
    }
}
