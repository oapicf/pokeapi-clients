@isTest
private class OASGenderPokemonSpeciesTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenderPokemonSpecies genderPokemonSpecies1 = OASGenderPokemonSpecies.getExample();
        OASGenderPokemonSpecies genderPokemonSpecies2 = genderPokemonSpecies1;
        OASGenderPokemonSpecies genderPokemonSpecies3 = new OASGenderPokemonSpecies();
        OASGenderPokemonSpecies genderPokemonSpecies4 = genderPokemonSpecies3;

        System.assert(genderPokemonSpecies1.equals(genderPokemonSpecies2));
        System.assert(genderPokemonSpecies2.equals(genderPokemonSpecies1));
        System.assert(genderPokemonSpecies1.equals(genderPokemonSpecies1));
        System.assert(genderPokemonSpecies3.equals(genderPokemonSpecies4));
        System.assert(genderPokemonSpecies4.equals(genderPokemonSpecies3));
        System.assert(genderPokemonSpecies3.equals(genderPokemonSpecies3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenderPokemonSpecies genderPokemonSpecies1 = OASGenderPokemonSpecies.getExample();
        OASGenderPokemonSpecies genderPokemonSpecies2 = OASGenderPokemonSpecies.getExample();
        OASGenderPokemonSpecies genderPokemonSpecies3 = new OASGenderPokemonSpecies();
        OASGenderPokemonSpecies genderPokemonSpecies4 = new OASGenderPokemonSpecies();

        System.assert(genderPokemonSpecies1.equals(genderPokemonSpecies2));
        System.assert(genderPokemonSpecies2.equals(genderPokemonSpecies1));
        System.assert(genderPokemonSpecies3.equals(genderPokemonSpecies4));
        System.assert(genderPokemonSpecies4.equals(genderPokemonSpecies3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenderPokemonSpecies genderPokemonSpecies1 = OASGenderPokemonSpecies.getExample();
        OASGenderPokemonSpecies genderPokemonSpecies2 = new OASGenderPokemonSpecies();

        System.assertEquals(false, genderPokemonSpecies1.equals('foo'));
        System.assertEquals(false, genderPokemonSpecies2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenderPokemonSpecies genderPokemonSpecies1 = OASGenderPokemonSpecies.getExample();
        OASGenderPokemonSpecies genderPokemonSpecies2 = new OASGenderPokemonSpecies();
        OASGenderPokemonSpecies genderPokemonSpecies3;

        System.assertEquals(false, genderPokemonSpecies1.equals(genderPokemonSpecies3));
        System.assertEquals(false, genderPokemonSpecies2.equals(genderPokemonSpecies3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenderPokemonSpecies genderPokemonSpecies1 = OASGenderPokemonSpecies.getExample();
        OASGenderPokemonSpecies genderPokemonSpecies2 = new OASGenderPokemonSpecies();

        System.assertEquals(genderPokemonSpecies1.hashCode(), genderPokemonSpecies1.hashCode());
        System.assertEquals(genderPokemonSpecies2.hashCode(), genderPokemonSpecies2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenderPokemonSpecies genderPokemonSpecies1 = OASGenderPokemonSpecies.getExample();
        OASGenderPokemonSpecies genderPokemonSpecies2 = OASGenderPokemonSpecies.getExample();
        OASGenderPokemonSpecies genderPokemonSpecies3 = new OASGenderPokemonSpecies();
        OASGenderPokemonSpecies genderPokemonSpecies4 = new OASGenderPokemonSpecies();

        System.assert(genderPokemonSpecies1.equals(genderPokemonSpecies2));
        System.assert(genderPokemonSpecies3.equals(genderPokemonSpecies4));
        System.assertEquals(genderPokemonSpecies1.hashCode(), genderPokemonSpecies2.hashCode());
        System.assertEquals(genderPokemonSpecies3.hashCode(), genderPokemonSpecies4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGenderPokemonSpecies genderPokemonSpecies = new OASGenderPokemonSpecies();
        Map<String, String> x-property-mappings = genderPokemonSpecies.getx-property-mappings();
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon_species'));
    }
}
