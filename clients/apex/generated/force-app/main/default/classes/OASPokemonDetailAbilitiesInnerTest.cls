@isTest
private class OASPokemonDetailAbilitiesInnerTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner1 = OASPokemonDetailAbilitiesInner.getExample();
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner2 = pokemonDetailAbilitiesInner1;
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner3 = new OASPokemonDetailAbilitiesInner();
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner4 = pokemonDetailAbilitiesInner3;

        System.assert(pokemonDetailAbilitiesInner1.equals(pokemonDetailAbilitiesInner2));
        System.assert(pokemonDetailAbilitiesInner2.equals(pokemonDetailAbilitiesInner1));
        System.assert(pokemonDetailAbilitiesInner1.equals(pokemonDetailAbilitiesInner1));
        System.assert(pokemonDetailAbilitiesInner3.equals(pokemonDetailAbilitiesInner4));
        System.assert(pokemonDetailAbilitiesInner4.equals(pokemonDetailAbilitiesInner3));
        System.assert(pokemonDetailAbilitiesInner3.equals(pokemonDetailAbilitiesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner1 = OASPokemonDetailAbilitiesInner.getExample();
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner2 = OASPokemonDetailAbilitiesInner.getExample();
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner3 = new OASPokemonDetailAbilitiesInner();
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner4 = new OASPokemonDetailAbilitiesInner();

        System.assert(pokemonDetailAbilitiesInner1.equals(pokemonDetailAbilitiesInner2));
        System.assert(pokemonDetailAbilitiesInner2.equals(pokemonDetailAbilitiesInner1));
        System.assert(pokemonDetailAbilitiesInner3.equals(pokemonDetailAbilitiesInner4));
        System.assert(pokemonDetailAbilitiesInner4.equals(pokemonDetailAbilitiesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner1 = OASPokemonDetailAbilitiesInner.getExample();
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner2 = new OASPokemonDetailAbilitiesInner();

        System.assertEquals(false, pokemonDetailAbilitiesInner1.equals('foo'));
        System.assertEquals(false, pokemonDetailAbilitiesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner1 = OASPokemonDetailAbilitiesInner.getExample();
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner2 = new OASPokemonDetailAbilitiesInner();
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner3;

        System.assertEquals(false, pokemonDetailAbilitiesInner1.equals(pokemonDetailAbilitiesInner3));
        System.assertEquals(false, pokemonDetailAbilitiesInner2.equals(pokemonDetailAbilitiesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner1 = OASPokemonDetailAbilitiesInner.getExample();
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner2 = new OASPokemonDetailAbilitiesInner();

        System.assertEquals(pokemonDetailAbilitiesInner1.hashCode(), pokemonDetailAbilitiesInner1.hashCode());
        System.assertEquals(pokemonDetailAbilitiesInner2.hashCode(), pokemonDetailAbilitiesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner1 = OASPokemonDetailAbilitiesInner.getExample();
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner2 = OASPokemonDetailAbilitiesInner.getExample();
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner3 = new OASPokemonDetailAbilitiesInner();
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner4 = new OASPokemonDetailAbilitiesInner();

        System.assert(pokemonDetailAbilitiesInner1.equals(pokemonDetailAbilitiesInner2));
        System.assert(pokemonDetailAbilitiesInner3.equals(pokemonDetailAbilitiesInner4));
        System.assertEquals(pokemonDetailAbilitiesInner1.hashCode(), pokemonDetailAbilitiesInner2.hashCode());
        System.assertEquals(pokemonDetailAbilitiesInner3.hashCode(), pokemonDetailAbilitiesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonDetailAbilitiesInner pokemonDetailAbilitiesInner = new OASPokemonDetailAbilitiesInner();
        Map<String, String> x-property-mappings = pokemonDetailAbilitiesInner.getx-property-mappings();
        System.assertEquals('isHidden', x-property-mappings.get('is_hidden'));
    }
}
