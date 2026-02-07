@isTest
private class OASPokemonDetailPastTypesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner1 = OASPokemonDetailPastTypesInner.getExample();
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner2 = pokemonDetailPastTypesInner1;
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner3 = new OASPokemonDetailPastTypesInner();
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner4 = pokemonDetailPastTypesInner3;

        System.assert(pokemonDetailPastTypesInner1.equals(pokemonDetailPastTypesInner2));
        System.assert(pokemonDetailPastTypesInner2.equals(pokemonDetailPastTypesInner1));
        System.assert(pokemonDetailPastTypesInner1.equals(pokemonDetailPastTypesInner1));
        System.assert(pokemonDetailPastTypesInner3.equals(pokemonDetailPastTypesInner4));
        System.assert(pokemonDetailPastTypesInner4.equals(pokemonDetailPastTypesInner3));
        System.assert(pokemonDetailPastTypesInner3.equals(pokemonDetailPastTypesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner1 = OASPokemonDetailPastTypesInner.getExample();
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner2 = OASPokemonDetailPastTypesInner.getExample();
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner3 = new OASPokemonDetailPastTypesInner();
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner4 = new OASPokemonDetailPastTypesInner();

        System.assert(pokemonDetailPastTypesInner1.equals(pokemonDetailPastTypesInner2));
        System.assert(pokemonDetailPastTypesInner2.equals(pokemonDetailPastTypesInner1));
        System.assert(pokemonDetailPastTypesInner3.equals(pokemonDetailPastTypesInner4));
        System.assert(pokemonDetailPastTypesInner4.equals(pokemonDetailPastTypesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner1 = OASPokemonDetailPastTypesInner.getExample();
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner2 = new OASPokemonDetailPastTypesInner();

        System.assertEquals(false, pokemonDetailPastTypesInner1.equals('foo'));
        System.assertEquals(false, pokemonDetailPastTypesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner1 = OASPokemonDetailPastTypesInner.getExample();
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner2 = new OASPokemonDetailPastTypesInner();
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner3;

        System.assertEquals(false, pokemonDetailPastTypesInner1.equals(pokemonDetailPastTypesInner3));
        System.assertEquals(false, pokemonDetailPastTypesInner2.equals(pokemonDetailPastTypesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner1 = OASPokemonDetailPastTypesInner.getExample();
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner2 = new OASPokemonDetailPastTypesInner();

        System.assertEquals(pokemonDetailPastTypesInner1.hashCode(), pokemonDetailPastTypesInner1.hashCode());
        System.assertEquals(pokemonDetailPastTypesInner2.hashCode(), pokemonDetailPastTypesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner1 = OASPokemonDetailPastTypesInner.getExample();
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner2 = OASPokemonDetailPastTypesInner.getExample();
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner3 = new OASPokemonDetailPastTypesInner();
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner4 = new OASPokemonDetailPastTypesInner();

        System.assert(pokemonDetailPastTypesInner1.equals(pokemonDetailPastTypesInner2));
        System.assert(pokemonDetailPastTypesInner3.equals(pokemonDetailPastTypesInner4));
        System.assertEquals(pokemonDetailPastTypesInner1.hashCode(), pokemonDetailPastTypesInner2.hashCode());
        System.assertEquals(pokemonDetailPastTypesInner3.hashCode(), pokemonDetailPastTypesInner4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonDetailPastTypesInner pokemonDetailPastTypesInner = new OASPokemonDetailPastTypesInner();
        System.assertEquals(new List<OASPokemonDetailTypesInner>(), pokemonDetailPastTypesInner.types);
        System.assertEquals(null, pokemonDetailPastTypesInner.generation);
    }
}
