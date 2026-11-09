@isTest
private class OASPokemonAbilityTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonAbility pokemonAbility1 = OASPokemonAbility.getExample();
        OASPokemonAbility pokemonAbility2 = pokemonAbility1;
        OASPokemonAbility pokemonAbility3 = new OASPokemonAbility();
        OASPokemonAbility pokemonAbility4 = pokemonAbility3;

        System.assert(pokemonAbility1.equals(pokemonAbility2));
        System.assert(pokemonAbility2.equals(pokemonAbility1));
        System.assert(pokemonAbility1.equals(pokemonAbility1));
        System.assert(pokemonAbility3.equals(pokemonAbility4));
        System.assert(pokemonAbility4.equals(pokemonAbility3));
        System.assert(pokemonAbility3.equals(pokemonAbility3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonAbility pokemonAbility1 = OASPokemonAbility.getExample();
        OASPokemonAbility pokemonAbility2 = OASPokemonAbility.getExample();
        OASPokemonAbility pokemonAbility3 = new OASPokemonAbility();
        OASPokemonAbility pokemonAbility4 = new OASPokemonAbility();

        System.assert(pokemonAbility1.equals(pokemonAbility2));
        System.assert(pokemonAbility2.equals(pokemonAbility1));
        System.assert(pokemonAbility3.equals(pokemonAbility4));
        System.assert(pokemonAbility4.equals(pokemonAbility3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonAbility pokemonAbility1 = OASPokemonAbility.getExample();
        OASPokemonAbility pokemonAbility2 = new OASPokemonAbility();

        System.assertEquals(false, pokemonAbility1.equals('foo'));
        System.assertEquals(false, pokemonAbility2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonAbility pokemonAbility1 = OASPokemonAbility.getExample();
        OASPokemonAbility pokemonAbility2 = new OASPokemonAbility();
        OASPokemonAbility pokemonAbility3;

        System.assertEquals(false, pokemonAbility1.equals(pokemonAbility3));
        System.assertEquals(false, pokemonAbility2.equals(pokemonAbility3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonAbility pokemonAbility1 = OASPokemonAbility.getExample();
        OASPokemonAbility pokemonAbility2 = new OASPokemonAbility();

        System.assertEquals(pokemonAbility1.hashCode(), pokemonAbility1.hashCode());
        System.assertEquals(pokemonAbility2.hashCode(), pokemonAbility2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonAbility pokemonAbility1 = OASPokemonAbility.getExample();
        OASPokemonAbility pokemonAbility2 = OASPokemonAbility.getExample();
        OASPokemonAbility pokemonAbility3 = new OASPokemonAbility();
        OASPokemonAbility pokemonAbility4 = new OASPokemonAbility();

        System.assert(pokemonAbility1.equals(pokemonAbility2));
        System.assert(pokemonAbility3.equals(pokemonAbility4));
        System.assertEquals(pokemonAbility1.hashCode(), pokemonAbility2.hashCode());
        System.assertEquals(pokemonAbility3.hashCode(), pokemonAbility4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonAbility pokemonAbility = new OASPokemonAbility();
        Map<String, String> x-property-mappings = pokemonAbility.getx-property-mappings();
        System.assertEquals('isHidden', x-property-mappings.get('is_hidden'));
    }
}
