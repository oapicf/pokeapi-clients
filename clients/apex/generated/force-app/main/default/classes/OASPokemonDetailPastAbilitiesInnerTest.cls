@isTest
private class OASPokemonDetailPastAbilitiesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner1 = OASPokemonDetailPastAbilitiesInner.getExample();
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner2 = pokemonDetailPastAbilitiesInner1;
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner3 = new OASPokemonDetailPastAbilitiesInner();
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner4 = pokemonDetailPastAbilitiesInner3;

        System.assert(pokemonDetailPastAbilitiesInner1.equals(pokemonDetailPastAbilitiesInner2));
        System.assert(pokemonDetailPastAbilitiesInner2.equals(pokemonDetailPastAbilitiesInner1));
        System.assert(pokemonDetailPastAbilitiesInner1.equals(pokemonDetailPastAbilitiesInner1));
        System.assert(pokemonDetailPastAbilitiesInner3.equals(pokemonDetailPastAbilitiesInner4));
        System.assert(pokemonDetailPastAbilitiesInner4.equals(pokemonDetailPastAbilitiesInner3));
        System.assert(pokemonDetailPastAbilitiesInner3.equals(pokemonDetailPastAbilitiesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner1 = OASPokemonDetailPastAbilitiesInner.getExample();
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner2 = OASPokemonDetailPastAbilitiesInner.getExample();
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner3 = new OASPokemonDetailPastAbilitiesInner();
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner4 = new OASPokemonDetailPastAbilitiesInner();

        System.assert(pokemonDetailPastAbilitiesInner1.equals(pokemonDetailPastAbilitiesInner2));
        System.assert(pokemonDetailPastAbilitiesInner2.equals(pokemonDetailPastAbilitiesInner1));
        System.assert(pokemonDetailPastAbilitiesInner3.equals(pokemonDetailPastAbilitiesInner4));
        System.assert(pokemonDetailPastAbilitiesInner4.equals(pokemonDetailPastAbilitiesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner1 = OASPokemonDetailPastAbilitiesInner.getExample();
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner2 = new OASPokemonDetailPastAbilitiesInner();

        System.assertEquals(false, pokemonDetailPastAbilitiesInner1.equals('foo'));
        System.assertEquals(false, pokemonDetailPastAbilitiesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner1 = OASPokemonDetailPastAbilitiesInner.getExample();
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner2 = new OASPokemonDetailPastAbilitiesInner();
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner3;

        System.assertEquals(false, pokemonDetailPastAbilitiesInner1.equals(pokemonDetailPastAbilitiesInner3));
        System.assertEquals(false, pokemonDetailPastAbilitiesInner2.equals(pokemonDetailPastAbilitiesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner1 = OASPokemonDetailPastAbilitiesInner.getExample();
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner2 = new OASPokemonDetailPastAbilitiesInner();

        System.assertEquals(pokemonDetailPastAbilitiesInner1.hashCode(), pokemonDetailPastAbilitiesInner1.hashCode());
        System.assertEquals(pokemonDetailPastAbilitiesInner2.hashCode(), pokemonDetailPastAbilitiesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner1 = OASPokemonDetailPastAbilitiesInner.getExample();
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner2 = OASPokemonDetailPastAbilitiesInner.getExample();
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner3 = new OASPokemonDetailPastAbilitiesInner();
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner4 = new OASPokemonDetailPastAbilitiesInner();

        System.assert(pokemonDetailPastAbilitiesInner1.equals(pokemonDetailPastAbilitiesInner2));
        System.assert(pokemonDetailPastAbilitiesInner3.equals(pokemonDetailPastAbilitiesInner4));
        System.assertEquals(pokemonDetailPastAbilitiesInner1.hashCode(), pokemonDetailPastAbilitiesInner2.hashCode());
        System.assertEquals(pokemonDetailPastAbilitiesInner3.hashCode(), pokemonDetailPastAbilitiesInner4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonDetailPastAbilitiesInner pokemonDetailPastAbilitiesInner = new OASPokemonDetailPastAbilitiesInner();
        System.assertEquals(new List<OASPokemonDetailAbilitiesInner>(), pokemonDetailPastAbilitiesInner.abilities);
        System.assertEquals(null, pokemonDetailPastAbilitiesInner.generation);
    }
}
