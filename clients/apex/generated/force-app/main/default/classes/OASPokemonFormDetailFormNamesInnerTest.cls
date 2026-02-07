@isTest
private class OASPokemonFormDetailFormNamesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner1 = OASPokemonFormDetailFormNamesInner.getExample();
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner2 = pokemonFormDetailFormNamesInner1;
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner3 = new OASPokemonFormDetailFormNamesInner();
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner4 = pokemonFormDetailFormNamesInner3;

        System.assert(pokemonFormDetailFormNamesInner1.equals(pokemonFormDetailFormNamesInner2));
        System.assert(pokemonFormDetailFormNamesInner2.equals(pokemonFormDetailFormNamesInner1));
        System.assert(pokemonFormDetailFormNamesInner1.equals(pokemonFormDetailFormNamesInner1));
        System.assert(pokemonFormDetailFormNamesInner3.equals(pokemonFormDetailFormNamesInner4));
        System.assert(pokemonFormDetailFormNamesInner4.equals(pokemonFormDetailFormNamesInner3));
        System.assert(pokemonFormDetailFormNamesInner3.equals(pokemonFormDetailFormNamesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner1 = OASPokemonFormDetailFormNamesInner.getExample();
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner2 = OASPokemonFormDetailFormNamesInner.getExample();
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner3 = new OASPokemonFormDetailFormNamesInner();
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner4 = new OASPokemonFormDetailFormNamesInner();

        System.assert(pokemonFormDetailFormNamesInner1.equals(pokemonFormDetailFormNamesInner2));
        System.assert(pokemonFormDetailFormNamesInner2.equals(pokemonFormDetailFormNamesInner1));
        System.assert(pokemonFormDetailFormNamesInner3.equals(pokemonFormDetailFormNamesInner4));
        System.assert(pokemonFormDetailFormNamesInner4.equals(pokemonFormDetailFormNamesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner1 = OASPokemonFormDetailFormNamesInner.getExample();
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner2 = new OASPokemonFormDetailFormNamesInner();

        System.assertEquals(false, pokemonFormDetailFormNamesInner1.equals('foo'));
        System.assertEquals(false, pokemonFormDetailFormNamesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner1 = OASPokemonFormDetailFormNamesInner.getExample();
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner2 = new OASPokemonFormDetailFormNamesInner();
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner3;

        System.assertEquals(false, pokemonFormDetailFormNamesInner1.equals(pokemonFormDetailFormNamesInner3));
        System.assertEquals(false, pokemonFormDetailFormNamesInner2.equals(pokemonFormDetailFormNamesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner1 = OASPokemonFormDetailFormNamesInner.getExample();
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner2 = new OASPokemonFormDetailFormNamesInner();

        System.assertEquals(pokemonFormDetailFormNamesInner1.hashCode(), pokemonFormDetailFormNamesInner1.hashCode());
        System.assertEquals(pokemonFormDetailFormNamesInner2.hashCode(), pokemonFormDetailFormNamesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner1 = OASPokemonFormDetailFormNamesInner.getExample();
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner2 = OASPokemonFormDetailFormNamesInner.getExample();
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner3 = new OASPokemonFormDetailFormNamesInner();
        OASPokemonFormDetailFormNamesInner pokemonFormDetailFormNamesInner4 = new OASPokemonFormDetailFormNamesInner();

        System.assert(pokemonFormDetailFormNamesInner1.equals(pokemonFormDetailFormNamesInner2));
        System.assert(pokemonFormDetailFormNamesInner3.equals(pokemonFormDetailFormNamesInner4));
        System.assertEquals(pokemonFormDetailFormNamesInner1.hashCode(), pokemonFormDetailFormNamesInner2.hashCode());
        System.assertEquals(pokemonFormDetailFormNamesInner3.hashCode(), pokemonFormDetailFormNamesInner4.hashCode());
    }
}
