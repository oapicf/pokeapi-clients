@isTest
private class OASPokemonSpeciesVarietyTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpeciesVariety pokemonSpeciesVariety1 = OASPokemonSpeciesVariety.getExample();
        OASPokemonSpeciesVariety pokemonSpeciesVariety2 = pokemonSpeciesVariety1;
        OASPokemonSpeciesVariety pokemonSpeciesVariety3 = new OASPokemonSpeciesVariety();
        OASPokemonSpeciesVariety pokemonSpeciesVariety4 = pokemonSpeciesVariety3;

        System.assert(pokemonSpeciesVariety1.equals(pokemonSpeciesVariety2));
        System.assert(pokemonSpeciesVariety2.equals(pokemonSpeciesVariety1));
        System.assert(pokemonSpeciesVariety1.equals(pokemonSpeciesVariety1));
        System.assert(pokemonSpeciesVariety3.equals(pokemonSpeciesVariety4));
        System.assert(pokemonSpeciesVariety4.equals(pokemonSpeciesVariety3));
        System.assert(pokemonSpeciesVariety3.equals(pokemonSpeciesVariety3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpeciesVariety pokemonSpeciesVariety1 = OASPokemonSpeciesVariety.getExample();
        OASPokemonSpeciesVariety pokemonSpeciesVariety2 = OASPokemonSpeciesVariety.getExample();
        OASPokemonSpeciesVariety pokemonSpeciesVariety3 = new OASPokemonSpeciesVariety();
        OASPokemonSpeciesVariety pokemonSpeciesVariety4 = new OASPokemonSpeciesVariety();

        System.assert(pokemonSpeciesVariety1.equals(pokemonSpeciesVariety2));
        System.assert(pokemonSpeciesVariety2.equals(pokemonSpeciesVariety1));
        System.assert(pokemonSpeciesVariety3.equals(pokemonSpeciesVariety4));
        System.assert(pokemonSpeciesVariety4.equals(pokemonSpeciesVariety3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpeciesVariety pokemonSpeciesVariety1 = OASPokemonSpeciesVariety.getExample();
        OASPokemonSpeciesVariety pokemonSpeciesVariety2 = new OASPokemonSpeciesVariety();

        System.assertEquals(false, pokemonSpeciesVariety1.equals('foo'));
        System.assertEquals(false, pokemonSpeciesVariety2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpeciesVariety pokemonSpeciesVariety1 = OASPokemonSpeciesVariety.getExample();
        OASPokemonSpeciesVariety pokemonSpeciesVariety2 = new OASPokemonSpeciesVariety();
        OASPokemonSpeciesVariety pokemonSpeciesVariety3;

        System.assertEquals(false, pokemonSpeciesVariety1.equals(pokemonSpeciesVariety3));
        System.assertEquals(false, pokemonSpeciesVariety2.equals(pokemonSpeciesVariety3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpeciesVariety pokemonSpeciesVariety1 = OASPokemonSpeciesVariety.getExample();
        OASPokemonSpeciesVariety pokemonSpeciesVariety2 = new OASPokemonSpeciesVariety();

        System.assertEquals(pokemonSpeciesVariety1.hashCode(), pokemonSpeciesVariety1.hashCode());
        System.assertEquals(pokemonSpeciesVariety2.hashCode(), pokemonSpeciesVariety2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpeciesVariety pokemonSpeciesVariety1 = OASPokemonSpeciesVariety.getExample();
        OASPokemonSpeciesVariety pokemonSpeciesVariety2 = OASPokemonSpeciesVariety.getExample();
        OASPokemonSpeciesVariety pokemonSpeciesVariety3 = new OASPokemonSpeciesVariety();
        OASPokemonSpeciesVariety pokemonSpeciesVariety4 = new OASPokemonSpeciesVariety();

        System.assert(pokemonSpeciesVariety1.equals(pokemonSpeciesVariety2));
        System.assert(pokemonSpeciesVariety3.equals(pokemonSpeciesVariety4));
        System.assertEquals(pokemonSpeciesVariety1.hashCode(), pokemonSpeciesVariety2.hashCode());
        System.assertEquals(pokemonSpeciesVariety3.hashCode(), pokemonSpeciesVariety4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokemonSpeciesVariety pokemonSpeciesVariety = new OASPokemonSpeciesVariety();
        Map<String, String> x-property-mappings = pokemonSpeciesVariety.getx-property-mappings();
        System.assertEquals('isDefault', x-property-mappings.get('is_default'));
    }
}
