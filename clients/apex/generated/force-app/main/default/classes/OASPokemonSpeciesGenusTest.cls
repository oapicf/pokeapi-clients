@isTest
private class OASPokemonSpeciesGenusTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpeciesGenus pokemonSpeciesGenus1 = OASPokemonSpeciesGenus.getExample();
        OASPokemonSpeciesGenus pokemonSpeciesGenus2 = pokemonSpeciesGenus1;
        OASPokemonSpeciesGenus pokemonSpeciesGenus3 = new OASPokemonSpeciesGenus();
        OASPokemonSpeciesGenus pokemonSpeciesGenus4 = pokemonSpeciesGenus3;

        System.assert(pokemonSpeciesGenus1.equals(pokemonSpeciesGenus2));
        System.assert(pokemonSpeciesGenus2.equals(pokemonSpeciesGenus1));
        System.assert(pokemonSpeciesGenus1.equals(pokemonSpeciesGenus1));
        System.assert(pokemonSpeciesGenus3.equals(pokemonSpeciesGenus4));
        System.assert(pokemonSpeciesGenus4.equals(pokemonSpeciesGenus3));
        System.assert(pokemonSpeciesGenus3.equals(pokemonSpeciesGenus3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpeciesGenus pokemonSpeciesGenus1 = OASPokemonSpeciesGenus.getExample();
        OASPokemonSpeciesGenus pokemonSpeciesGenus2 = OASPokemonSpeciesGenus.getExample();
        OASPokemonSpeciesGenus pokemonSpeciesGenus3 = new OASPokemonSpeciesGenus();
        OASPokemonSpeciesGenus pokemonSpeciesGenus4 = new OASPokemonSpeciesGenus();

        System.assert(pokemonSpeciesGenus1.equals(pokemonSpeciesGenus2));
        System.assert(pokemonSpeciesGenus2.equals(pokemonSpeciesGenus1));
        System.assert(pokemonSpeciesGenus3.equals(pokemonSpeciesGenus4));
        System.assert(pokemonSpeciesGenus4.equals(pokemonSpeciesGenus3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpeciesGenus pokemonSpeciesGenus1 = OASPokemonSpeciesGenus.getExample();
        OASPokemonSpeciesGenus pokemonSpeciesGenus2 = new OASPokemonSpeciesGenus();

        System.assertEquals(false, pokemonSpeciesGenus1.equals('foo'));
        System.assertEquals(false, pokemonSpeciesGenus2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpeciesGenus pokemonSpeciesGenus1 = OASPokemonSpeciesGenus.getExample();
        OASPokemonSpeciesGenus pokemonSpeciesGenus2 = new OASPokemonSpeciesGenus();
        OASPokemonSpeciesGenus pokemonSpeciesGenus3;

        System.assertEquals(false, pokemonSpeciesGenus1.equals(pokemonSpeciesGenus3));
        System.assertEquals(false, pokemonSpeciesGenus2.equals(pokemonSpeciesGenus3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpeciesGenus pokemonSpeciesGenus1 = OASPokemonSpeciesGenus.getExample();
        OASPokemonSpeciesGenus pokemonSpeciesGenus2 = new OASPokemonSpeciesGenus();

        System.assertEquals(pokemonSpeciesGenus1.hashCode(), pokemonSpeciesGenus1.hashCode());
        System.assertEquals(pokemonSpeciesGenus2.hashCode(), pokemonSpeciesGenus2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpeciesGenus pokemonSpeciesGenus1 = OASPokemonSpeciesGenus.getExample();
        OASPokemonSpeciesGenus pokemonSpeciesGenus2 = OASPokemonSpeciesGenus.getExample();
        OASPokemonSpeciesGenus pokemonSpeciesGenus3 = new OASPokemonSpeciesGenus();
        OASPokemonSpeciesGenus pokemonSpeciesGenus4 = new OASPokemonSpeciesGenus();

        System.assert(pokemonSpeciesGenus1.equals(pokemonSpeciesGenus2));
        System.assert(pokemonSpeciesGenus3.equals(pokemonSpeciesGenus4));
        System.assertEquals(pokemonSpeciesGenus1.hashCode(), pokemonSpeciesGenus2.hashCode());
        System.assertEquals(pokemonSpeciesGenus3.hashCode(), pokemonSpeciesGenus4.hashCode());
    }
}
