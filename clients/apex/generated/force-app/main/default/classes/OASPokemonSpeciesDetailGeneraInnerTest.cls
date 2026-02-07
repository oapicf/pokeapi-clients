@isTest
private class OASPokemonSpeciesDetailGeneraInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner1 = OASPokemonSpeciesDetailGeneraInner.getExample();
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner2 = pokemonSpeciesDetailGeneraInner1;
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner3 = new OASPokemonSpeciesDetailGeneraInner();
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner4 = pokemonSpeciesDetailGeneraInner3;

        System.assert(pokemonSpeciesDetailGeneraInner1.equals(pokemonSpeciesDetailGeneraInner2));
        System.assert(pokemonSpeciesDetailGeneraInner2.equals(pokemonSpeciesDetailGeneraInner1));
        System.assert(pokemonSpeciesDetailGeneraInner1.equals(pokemonSpeciesDetailGeneraInner1));
        System.assert(pokemonSpeciesDetailGeneraInner3.equals(pokemonSpeciesDetailGeneraInner4));
        System.assert(pokemonSpeciesDetailGeneraInner4.equals(pokemonSpeciesDetailGeneraInner3));
        System.assert(pokemonSpeciesDetailGeneraInner3.equals(pokemonSpeciesDetailGeneraInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner1 = OASPokemonSpeciesDetailGeneraInner.getExample();
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner2 = OASPokemonSpeciesDetailGeneraInner.getExample();
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner3 = new OASPokemonSpeciesDetailGeneraInner();
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner4 = new OASPokemonSpeciesDetailGeneraInner();

        System.assert(pokemonSpeciesDetailGeneraInner1.equals(pokemonSpeciesDetailGeneraInner2));
        System.assert(pokemonSpeciesDetailGeneraInner2.equals(pokemonSpeciesDetailGeneraInner1));
        System.assert(pokemonSpeciesDetailGeneraInner3.equals(pokemonSpeciesDetailGeneraInner4));
        System.assert(pokemonSpeciesDetailGeneraInner4.equals(pokemonSpeciesDetailGeneraInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner1 = OASPokemonSpeciesDetailGeneraInner.getExample();
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner2 = new OASPokemonSpeciesDetailGeneraInner();

        System.assertEquals(false, pokemonSpeciesDetailGeneraInner1.equals('foo'));
        System.assertEquals(false, pokemonSpeciesDetailGeneraInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner1 = OASPokemonSpeciesDetailGeneraInner.getExample();
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner2 = new OASPokemonSpeciesDetailGeneraInner();
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner3;

        System.assertEquals(false, pokemonSpeciesDetailGeneraInner1.equals(pokemonSpeciesDetailGeneraInner3));
        System.assertEquals(false, pokemonSpeciesDetailGeneraInner2.equals(pokemonSpeciesDetailGeneraInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner1 = OASPokemonSpeciesDetailGeneraInner.getExample();
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner2 = new OASPokemonSpeciesDetailGeneraInner();

        System.assertEquals(pokemonSpeciesDetailGeneraInner1.hashCode(), pokemonSpeciesDetailGeneraInner1.hashCode());
        System.assertEquals(pokemonSpeciesDetailGeneraInner2.hashCode(), pokemonSpeciesDetailGeneraInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner1 = OASPokemonSpeciesDetailGeneraInner.getExample();
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner2 = OASPokemonSpeciesDetailGeneraInner.getExample();
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner3 = new OASPokemonSpeciesDetailGeneraInner();
        OASPokemonSpeciesDetailGeneraInner pokemonSpeciesDetailGeneraInner4 = new OASPokemonSpeciesDetailGeneraInner();

        System.assert(pokemonSpeciesDetailGeneraInner1.equals(pokemonSpeciesDetailGeneraInner2));
        System.assert(pokemonSpeciesDetailGeneraInner3.equals(pokemonSpeciesDetailGeneraInner4));
        System.assertEquals(pokemonSpeciesDetailGeneraInner1.hashCode(), pokemonSpeciesDetailGeneraInner2.hashCode());
        System.assertEquals(pokemonSpeciesDetailGeneraInner3.hashCode(), pokemonSpeciesDetailGeneraInner4.hashCode());
    }
}
