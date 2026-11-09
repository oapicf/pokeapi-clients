@isTest
private class OASPokemonAbilityPastTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonAbilityPast pokemonAbilityPast1 = OASPokemonAbilityPast.getExample();
        OASPokemonAbilityPast pokemonAbilityPast2 = pokemonAbilityPast1;
        OASPokemonAbilityPast pokemonAbilityPast3 = new OASPokemonAbilityPast();
        OASPokemonAbilityPast pokemonAbilityPast4 = pokemonAbilityPast3;

        System.assert(pokemonAbilityPast1.equals(pokemonAbilityPast2));
        System.assert(pokemonAbilityPast2.equals(pokemonAbilityPast1));
        System.assert(pokemonAbilityPast1.equals(pokemonAbilityPast1));
        System.assert(pokemonAbilityPast3.equals(pokemonAbilityPast4));
        System.assert(pokemonAbilityPast4.equals(pokemonAbilityPast3));
        System.assert(pokemonAbilityPast3.equals(pokemonAbilityPast3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonAbilityPast pokemonAbilityPast1 = OASPokemonAbilityPast.getExample();
        OASPokemonAbilityPast pokemonAbilityPast2 = OASPokemonAbilityPast.getExample();
        OASPokemonAbilityPast pokemonAbilityPast3 = new OASPokemonAbilityPast();
        OASPokemonAbilityPast pokemonAbilityPast4 = new OASPokemonAbilityPast();

        System.assert(pokemonAbilityPast1.equals(pokemonAbilityPast2));
        System.assert(pokemonAbilityPast2.equals(pokemonAbilityPast1));
        System.assert(pokemonAbilityPast3.equals(pokemonAbilityPast4));
        System.assert(pokemonAbilityPast4.equals(pokemonAbilityPast3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonAbilityPast pokemonAbilityPast1 = OASPokemonAbilityPast.getExample();
        OASPokemonAbilityPast pokemonAbilityPast2 = new OASPokemonAbilityPast();

        System.assertEquals(false, pokemonAbilityPast1.equals('foo'));
        System.assertEquals(false, pokemonAbilityPast2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonAbilityPast pokemonAbilityPast1 = OASPokemonAbilityPast.getExample();
        OASPokemonAbilityPast pokemonAbilityPast2 = new OASPokemonAbilityPast();
        OASPokemonAbilityPast pokemonAbilityPast3;

        System.assertEquals(false, pokemonAbilityPast1.equals(pokemonAbilityPast3));
        System.assertEquals(false, pokemonAbilityPast2.equals(pokemonAbilityPast3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonAbilityPast pokemonAbilityPast1 = OASPokemonAbilityPast.getExample();
        OASPokemonAbilityPast pokemonAbilityPast2 = new OASPokemonAbilityPast();

        System.assertEquals(pokemonAbilityPast1.hashCode(), pokemonAbilityPast1.hashCode());
        System.assertEquals(pokemonAbilityPast2.hashCode(), pokemonAbilityPast2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonAbilityPast pokemonAbilityPast1 = OASPokemonAbilityPast.getExample();
        OASPokemonAbilityPast pokemonAbilityPast2 = OASPokemonAbilityPast.getExample();
        OASPokemonAbilityPast pokemonAbilityPast3 = new OASPokemonAbilityPast();
        OASPokemonAbilityPast pokemonAbilityPast4 = new OASPokemonAbilityPast();

        System.assert(pokemonAbilityPast1.equals(pokemonAbilityPast2));
        System.assert(pokemonAbilityPast3.equals(pokemonAbilityPast4));
        System.assertEquals(pokemonAbilityPast1.hashCode(), pokemonAbilityPast2.hashCode());
        System.assertEquals(pokemonAbilityPast3.hashCode(), pokemonAbilityPast4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonAbilityPast pokemonAbilityPast = new OASPokemonAbilityPast();
        Map<String, String> x-property-mappings = pokemonAbilityPast.getx-property-mappings();
        System.assertEquals('isHidden', x-property-mappings.get('is_hidden'));
    }
}
