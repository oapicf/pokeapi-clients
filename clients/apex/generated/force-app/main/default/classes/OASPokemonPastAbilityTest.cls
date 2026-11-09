@isTest
private class OASPokemonPastAbilityTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonPastAbility pokemonPastAbility1 = OASPokemonPastAbility.getExample();
        OASPokemonPastAbility pokemonPastAbility2 = pokemonPastAbility1;
        OASPokemonPastAbility pokemonPastAbility3 = new OASPokemonPastAbility();
        OASPokemonPastAbility pokemonPastAbility4 = pokemonPastAbility3;

        System.assert(pokemonPastAbility1.equals(pokemonPastAbility2));
        System.assert(pokemonPastAbility2.equals(pokemonPastAbility1));
        System.assert(pokemonPastAbility1.equals(pokemonPastAbility1));
        System.assert(pokemonPastAbility3.equals(pokemonPastAbility4));
        System.assert(pokemonPastAbility4.equals(pokemonPastAbility3));
        System.assert(pokemonPastAbility3.equals(pokemonPastAbility3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonPastAbility pokemonPastAbility1 = OASPokemonPastAbility.getExample();
        OASPokemonPastAbility pokemonPastAbility2 = OASPokemonPastAbility.getExample();
        OASPokemonPastAbility pokemonPastAbility3 = new OASPokemonPastAbility();
        OASPokemonPastAbility pokemonPastAbility4 = new OASPokemonPastAbility();

        System.assert(pokemonPastAbility1.equals(pokemonPastAbility2));
        System.assert(pokemonPastAbility2.equals(pokemonPastAbility1));
        System.assert(pokemonPastAbility3.equals(pokemonPastAbility4));
        System.assert(pokemonPastAbility4.equals(pokemonPastAbility3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonPastAbility pokemonPastAbility1 = OASPokemonPastAbility.getExample();
        OASPokemonPastAbility pokemonPastAbility2 = new OASPokemonPastAbility();

        System.assertEquals(false, pokemonPastAbility1.equals('foo'));
        System.assertEquals(false, pokemonPastAbility2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonPastAbility pokemonPastAbility1 = OASPokemonPastAbility.getExample();
        OASPokemonPastAbility pokemonPastAbility2 = new OASPokemonPastAbility();
        OASPokemonPastAbility pokemonPastAbility3;

        System.assertEquals(false, pokemonPastAbility1.equals(pokemonPastAbility3));
        System.assertEquals(false, pokemonPastAbility2.equals(pokemonPastAbility3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonPastAbility pokemonPastAbility1 = OASPokemonPastAbility.getExample();
        OASPokemonPastAbility pokemonPastAbility2 = new OASPokemonPastAbility();

        System.assertEquals(pokemonPastAbility1.hashCode(), pokemonPastAbility1.hashCode());
        System.assertEquals(pokemonPastAbility2.hashCode(), pokemonPastAbility2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonPastAbility pokemonPastAbility1 = OASPokemonPastAbility.getExample();
        OASPokemonPastAbility pokemonPastAbility2 = OASPokemonPastAbility.getExample();
        OASPokemonPastAbility pokemonPastAbility3 = new OASPokemonPastAbility();
        OASPokemonPastAbility pokemonPastAbility4 = new OASPokemonPastAbility();

        System.assert(pokemonPastAbility1.equals(pokemonPastAbility2));
        System.assert(pokemonPastAbility3.equals(pokemonPastAbility4));
        System.assertEquals(pokemonPastAbility1.hashCode(), pokemonPastAbility2.hashCode());
        System.assertEquals(pokemonPastAbility3.hashCode(), pokemonPastAbility4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokemonPastAbility pokemonPastAbility = new OASPokemonPastAbility();
        System.assertEquals(new List<OASPokemonAbilityPast>(), pokemonPastAbility.abilities);
        System.assertEquals(null, pokemonPastAbility.generation);
    }
}
