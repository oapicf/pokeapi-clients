@isTest
private class OASGenderDetailPokemonSpeciesDetailsTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner1 = OASGenderDetailPokemonSpeciesDetails.getExample();
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner2 = genderDetailPokemonSpeciesDetailsInner1;
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner3 = new OASGenderDetailPokemonSpeciesDetails();
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner4 = genderDetailPokemonSpeciesDetailsInner3;

        System.assert(genderDetailPokemonSpeciesDetailsInner1.equals(genderDetailPokemonSpeciesDetailsInner2));
        System.assert(genderDetailPokemonSpeciesDetailsInner2.equals(genderDetailPokemonSpeciesDetailsInner1));
        System.assert(genderDetailPokemonSpeciesDetailsInner1.equals(genderDetailPokemonSpeciesDetailsInner1));
        System.assert(genderDetailPokemonSpeciesDetailsInner3.equals(genderDetailPokemonSpeciesDetailsInner4));
        System.assert(genderDetailPokemonSpeciesDetailsInner4.equals(genderDetailPokemonSpeciesDetailsInner3));
        System.assert(genderDetailPokemonSpeciesDetailsInner3.equals(genderDetailPokemonSpeciesDetailsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner1 = OASGenderDetailPokemonSpeciesDetails.getExample();
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner2 = OASGenderDetailPokemonSpeciesDetails.getExample();
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner3 = new OASGenderDetailPokemonSpeciesDetails();
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner4 = new OASGenderDetailPokemonSpeciesDetails();

        System.assert(genderDetailPokemonSpeciesDetailsInner1.equals(genderDetailPokemonSpeciesDetailsInner2));
        System.assert(genderDetailPokemonSpeciesDetailsInner2.equals(genderDetailPokemonSpeciesDetailsInner1));
        System.assert(genderDetailPokemonSpeciesDetailsInner3.equals(genderDetailPokemonSpeciesDetailsInner4));
        System.assert(genderDetailPokemonSpeciesDetailsInner4.equals(genderDetailPokemonSpeciesDetailsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner1 = OASGenderDetailPokemonSpeciesDetails.getExample();
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner2 = new OASGenderDetailPokemonSpeciesDetails();

        System.assertEquals(false, genderDetailPokemonSpeciesDetailsInner1.equals('foo'));
        System.assertEquals(false, genderDetailPokemonSpeciesDetailsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner1 = OASGenderDetailPokemonSpeciesDetails.getExample();
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner2 = new OASGenderDetailPokemonSpeciesDetails();
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner3;

        System.assertEquals(false, genderDetailPokemonSpeciesDetailsInner1.equals(genderDetailPokemonSpeciesDetailsInner3));
        System.assertEquals(false, genderDetailPokemonSpeciesDetailsInner2.equals(genderDetailPokemonSpeciesDetailsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner1 = OASGenderDetailPokemonSpeciesDetails.getExample();
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner2 = new OASGenderDetailPokemonSpeciesDetails();

        System.assertEquals(genderDetailPokemonSpeciesDetailsInner1.hashCode(), genderDetailPokemonSpeciesDetailsInner1.hashCode());
        System.assertEquals(genderDetailPokemonSpeciesDetailsInner2.hashCode(), genderDetailPokemonSpeciesDetailsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner1 = OASGenderDetailPokemonSpeciesDetails.getExample();
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner2 = OASGenderDetailPokemonSpeciesDetails.getExample();
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner3 = new OASGenderDetailPokemonSpeciesDetails();
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner4 = new OASGenderDetailPokemonSpeciesDetails();

        System.assert(genderDetailPokemonSpeciesDetailsInner1.equals(genderDetailPokemonSpeciesDetailsInner2));
        System.assert(genderDetailPokemonSpeciesDetailsInner3.equals(genderDetailPokemonSpeciesDetailsInner4));
        System.assertEquals(genderDetailPokemonSpeciesDetailsInner1.hashCode(), genderDetailPokemonSpeciesDetailsInner2.hashCode());
        System.assertEquals(genderDetailPokemonSpeciesDetailsInner3.hashCode(), genderDetailPokemonSpeciesDetailsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGenderDetailPokemonSpeciesDetails genderDetailPokemonSpeciesDetailsInner = new OASGenderDetailPokemonSpeciesDetails();
        Map<String, String> x-property-mappings = genderDetailPokemonSpeciesDetailsInner.getx-property-mappings();
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon_species'));
    }
}
