@isTest
private class OASPokemonSpeciesDescriptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokemonSpeciesDescription pokemonSpeciesDescription1 = OASPokemonSpeciesDescription.getExample();
        OASPokemonSpeciesDescription pokemonSpeciesDescription2 = pokemonSpeciesDescription1;
        OASPokemonSpeciesDescription pokemonSpeciesDescription3 = new OASPokemonSpeciesDescription();
        OASPokemonSpeciesDescription pokemonSpeciesDescription4 = pokemonSpeciesDescription3;

        System.assert(pokemonSpeciesDescription1.equals(pokemonSpeciesDescription2));
        System.assert(pokemonSpeciesDescription2.equals(pokemonSpeciesDescription1));
        System.assert(pokemonSpeciesDescription1.equals(pokemonSpeciesDescription1));
        System.assert(pokemonSpeciesDescription3.equals(pokemonSpeciesDescription4));
        System.assert(pokemonSpeciesDescription4.equals(pokemonSpeciesDescription3));
        System.assert(pokemonSpeciesDescription3.equals(pokemonSpeciesDescription3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokemonSpeciesDescription pokemonSpeciesDescription1 = OASPokemonSpeciesDescription.getExample();
        OASPokemonSpeciesDescription pokemonSpeciesDescription2 = OASPokemonSpeciesDescription.getExample();
        OASPokemonSpeciesDescription pokemonSpeciesDescription3 = new OASPokemonSpeciesDescription();
        OASPokemonSpeciesDescription pokemonSpeciesDescription4 = new OASPokemonSpeciesDescription();

        System.assert(pokemonSpeciesDescription1.equals(pokemonSpeciesDescription2));
        System.assert(pokemonSpeciesDescription2.equals(pokemonSpeciesDescription1));
        System.assert(pokemonSpeciesDescription3.equals(pokemonSpeciesDescription4));
        System.assert(pokemonSpeciesDescription4.equals(pokemonSpeciesDescription3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokemonSpeciesDescription pokemonSpeciesDescription1 = OASPokemonSpeciesDescription.getExample();
        OASPokemonSpeciesDescription pokemonSpeciesDescription2 = new OASPokemonSpeciesDescription();

        System.assertEquals(false, pokemonSpeciesDescription1.equals('foo'));
        System.assertEquals(false, pokemonSpeciesDescription2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokemonSpeciesDescription pokemonSpeciesDescription1 = OASPokemonSpeciesDescription.getExample();
        OASPokemonSpeciesDescription pokemonSpeciesDescription2 = new OASPokemonSpeciesDescription();
        OASPokemonSpeciesDescription pokemonSpeciesDescription3;

        System.assertEquals(false, pokemonSpeciesDescription1.equals(pokemonSpeciesDescription3));
        System.assertEquals(false, pokemonSpeciesDescription2.equals(pokemonSpeciesDescription3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokemonSpeciesDescription pokemonSpeciesDescription1 = OASPokemonSpeciesDescription.getExample();
        OASPokemonSpeciesDescription pokemonSpeciesDescription2 = new OASPokemonSpeciesDescription();

        System.assertEquals(pokemonSpeciesDescription1.hashCode(), pokemonSpeciesDescription1.hashCode());
        System.assertEquals(pokemonSpeciesDescription2.hashCode(), pokemonSpeciesDescription2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokemonSpeciesDescription pokemonSpeciesDescription1 = OASPokemonSpeciesDescription.getExample();
        OASPokemonSpeciesDescription pokemonSpeciesDescription2 = OASPokemonSpeciesDescription.getExample();
        OASPokemonSpeciesDescription pokemonSpeciesDescription3 = new OASPokemonSpeciesDescription();
        OASPokemonSpeciesDescription pokemonSpeciesDescription4 = new OASPokemonSpeciesDescription();

        System.assert(pokemonSpeciesDescription1.equals(pokemonSpeciesDescription2));
        System.assert(pokemonSpeciesDescription3.equals(pokemonSpeciesDescription4));
        System.assertEquals(pokemonSpeciesDescription1.hashCode(), pokemonSpeciesDescription2.hashCode());
        System.assertEquals(pokemonSpeciesDescription3.hashCode(), pokemonSpeciesDescription4.hashCode());
    }
}
