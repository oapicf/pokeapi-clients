@isTest
private class OASPokemonDetailTypesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonDetailTypesInner pokemonDetailTypesInner1 = OASPokemonDetailTypesInner.getExample();
        OASPokemonDetailTypesInner pokemonDetailTypesInner2 = pokemonDetailTypesInner1;
        OASPokemonDetailTypesInner pokemonDetailTypesInner3 = new OASPokemonDetailTypesInner();
        OASPokemonDetailTypesInner pokemonDetailTypesInner4 = pokemonDetailTypesInner3;

        System.assert(pokemonDetailTypesInner1.equals(pokemonDetailTypesInner2));
        System.assert(pokemonDetailTypesInner2.equals(pokemonDetailTypesInner1));
        System.assert(pokemonDetailTypesInner1.equals(pokemonDetailTypesInner1));
        System.assert(pokemonDetailTypesInner3.equals(pokemonDetailTypesInner4));
        System.assert(pokemonDetailTypesInner4.equals(pokemonDetailTypesInner3));
        System.assert(pokemonDetailTypesInner3.equals(pokemonDetailTypesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonDetailTypesInner pokemonDetailTypesInner1 = OASPokemonDetailTypesInner.getExample();
        OASPokemonDetailTypesInner pokemonDetailTypesInner2 = OASPokemonDetailTypesInner.getExample();
        OASPokemonDetailTypesInner pokemonDetailTypesInner3 = new OASPokemonDetailTypesInner();
        OASPokemonDetailTypesInner pokemonDetailTypesInner4 = new OASPokemonDetailTypesInner();

        System.assert(pokemonDetailTypesInner1.equals(pokemonDetailTypesInner2));
        System.assert(pokemonDetailTypesInner2.equals(pokemonDetailTypesInner1));
        System.assert(pokemonDetailTypesInner3.equals(pokemonDetailTypesInner4));
        System.assert(pokemonDetailTypesInner4.equals(pokemonDetailTypesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonDetailTypesInner pokemonDetailTypesInner1 = OASPokemonDetailTypesInner.getExample();
        OASPokemonDetailTypesInner pokemonDetailTypesInner2 = new OASPokemonDetailTypesInner();

        System.assertEquals(false, pokemonDetailTypesInner1.equals('foo'));
        System.assertEquals(false, pokemonDetailTypesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonDetailTypesInner pokemonDetailTypesInner1 = OASPokemonDetailTypesInner.getExample();
        OASPokemonDetailTypesInner pokemonDetailTypesInner2 = new OASPokemonDetailTypesInner();
        OASPokemonDetailTypesInner pokemonDetailTypesInner3;

        System.assertEquals(false, pokemonDetailTypesInner1.equals(pokemonDetailTypesInner3));
        System.assertEquals(false, pokemonDetailTypesInner2.equals(pokemonDetailTypesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonDetailTypesInner pokemonDetailTypesInner1 = OASPokemonDetailTypesInner.getExample();
        OASPokemonDetailTypesInner pokemonDetailTypesInner2 = new OASPokemonDetailTypesInner();

        System.assertEquals(pokemonDetailTypesInner1.hashCode(), pokemonDetailTypesInner1.hashCode());
        System.assertEquals(pokemonDetailTypesInner2.hashCode(), pokemonDetailTypesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonDetailTypesInner pokemonDetailTypesInner1 = OASPokemonDetailTypesInner.getExample();
        OASPokemonDetailTypesInner pokemonDetailTypesInner2 = OASPokemonDetailTypesInner.getExample();
        OASPokemonDetailTypesInner pokemonDetailTypesInner3 = new OASPokemonDetailTypesInner();
        OASPokemonDetailTypesInner pokemonDetailTypesInner4 = new OASPokemonDetailTypesInner();

        System.assert(pokemonDetailTypesInner1.equals(pokemonDetailTypesInner2));
        System.assert(pokemonDetailTypesInner3.equals(pokemonDetailTypesInner4));
        System.assertEquals(pokemonDetailTypesInner1.hashCode(), pokemonDetailTypesInner2.hashCode());
        System.assertEquals(pokemonDetailTypesInner3.hashCode(), pokemonDetailTypesInner4.hashCode());
    }
}
