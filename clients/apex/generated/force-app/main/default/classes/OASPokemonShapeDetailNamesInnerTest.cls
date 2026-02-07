@isTest
private class OASPokemonShapeDetailNamesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner1 = OASPokemonShapeDetailNamesInner.getExample();
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner2 = pokemonShapeDetailNamesInner1;
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner3 = new OASPokemonShapeDetailNamesInner();
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner4 = pokemonShapeDetailNamesInner3;

        System.assert(pokemonShapeDetailNamesInner1.equals(pokemonShapeDetailNamesInner2));
        System.assert(pokemonShapeDetailNamesInner2.equals(pokemonShapeDetailNamesInner1));
        System.assert(pokemonShapeDetailNamesInner1.equals(pokemonShapeDetailNamesInner1));
        System.assert(pokemonShapeDetailNamesInner3.equals(pokemonShapeDetailNamesInner4));
        System.assert(pokemonShapeDetailNamesInner4.equals(pokemonShapeDetailNamesInner3));
        System.assert(pokemonShapeDetailNamesInner3.equals(pokemonShapeDetailNamesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner1 = OASPokemonShapeDetailNamesInner.getExample();
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner2 = OASPokemonShapeDetailNamesInner.getExample();
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner3 = new OASPokemonShapeDetailNamesInner();
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner4 = new OASPokemonShapeDetailNamesInner();

        System.assert(pokemonShapeDetailNamesInner1.equals(pokemonShapeDetailNamesInner2));
        System.assert(pokemonShapeDetailNamesInner2.equals(pokemonShapeDetailNamesInner1));
        System.assert(pokemonShapeDetailNamesInner3.equals(pokemonShapeDetailNamesInner4));
        System.assert(pokemonShapeDetailNamesInner4.equals(pokemonShapeDetailNamesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner1 = OASPokemonShapeDetailNamesInner.getExample();
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner2 = new OASPokemonShapeDetailNamesInner();

        System.assertEquals(false, pokemonShapeDetailNamesInner1.equals('foo'));
        System.assertEquals(false, pokemonShapeDetailNamesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner1 = OASPokemonShapeDetailNamesInner.getExample();
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner2 = new OASPokemonShapeDetailNamesInner();
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner3;

        System.assertEquals(false, pokemonShapeDetailNamesInner1.equals(pokemonShapeDetailNamesInner3));
        System.assertEquals(false, pokemonShapeDetailNamesInner2.equals(pokemonShapeDetailNamesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner1 = OASPokemonShapeDetailNamesInner.getExample();
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner2 = new OASPokemonShapeDetailNamesInner();

        System.assertEquals(pokemonShapeDetailNamesInner1.hashCode(), pokemonShapeDetailNamesInner1.hashCode());
        System.assertEquals(pokemonShapeDetailNamesInner2.hashCode(), pokemonShapeDetailNamesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner1 = OASPokemonShapeDetailNamesInner.getExample();
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner2 = OASPokemonShapeDetailNamesInner.getExample();
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner3 = new OASPokemonShapeDetailNamesInner();
        OASPokemonShapeDetailNamesInner pokemonShapeDetailNamesInner4 = new OASPokemonShapeDetailNamesInner();

        System.assert(pokemonShapeDetailNamesInner1.equals(pokemonShapeDetailNamesInner2));
        System.assert(pokemonShapeDetailNamesInner3.equals(pokemonShapeDetailNamesInner4));
        System.assertEquals(pokemonShapeDetailNamesInner1.hashCode(), pokemonShapeDetailNamesInner2.hashCode());
        System.assertEquals(pokemonShapeDetailNamesInner3.hashCode(), pokemonShapeDetailNamesInner4.hashCode());
    }
}
