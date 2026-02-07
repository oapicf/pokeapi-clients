@isTest
private class OASGenderDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenderDetail genderDetail1 = OASGenderDetail.getExample();
        OASGenderDetail genderDetail2 = genderDetail1;
        OASGenderDetail genderDetail3 = new OASGenderDetail();
        OASGenderDetail genderDetail4 = genderDetail3;

        System.assert(genderDetail1.equals(genderDetail2));
        System.assert(genderDetail2.equals(genderDetail1));
        System.assert(genderDetail1.equals(genderDetail1));
        System.assert(genderDetail3.equals(genderDetail4));
        System.assert(genderDetail4.equals(genderDetail3));
        System.assert(genderDetail3.equals(genderDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenderDetail genderDetail1 = OASGenderDetail.getExample();
        OASGenderDetail genderDetail2 = OASGenderDetail.getExample();
        OASGenderDetail genderDetail3 = new OASGenderDetail();
        OASGenderDetail genderDetail4 = new OASGenderDetail();

        System.assert(genderDetail1.equals(genderDetail2));
        System.assert(genderDetail2.equals(genderDetail1));
        System.assert(genderDetail3.equals(genderDetail4));
        System.assert(genderDetail4.equals(genderDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenderDetail genderDetail1 = OASGenderDetail.getExample();
        OASGenderDetail genderDetail2 = new OASGenderDetail();

        System.assertEquals(false, genderDetail1.equals('foo'));
        System.assertEquals(false, genderDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenderDetail genderDetail1 = OASGenderDetail.getExample();
        OASGenderDetail genderDetail2 = new OASGenderDetail();
        OASGenderDetail genderDetail3;

        System.assertEquals(false, genderDetail1.equals(genderDetail3));
        System.assertEquals(false, genderDetail2.equals(genderDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenderDetail genderDetail1 = OASGenderDetail.getExample();
        OASGenderDetail genderDetail2 = new OASGenderDetail();

        System.assertEquals(genderDetail1.hashCode(), genderDetail1.hashCode());
        System.assertEquals(genderDetail2.hashCode(), genderDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenderDetail genderDetail1 = OASGenderDetail.getExample();
        OASGenderDetail genderDetail2 = OASGenderDetail.getExample();
        OASGenderDetail genderDetail3 = new OASGenderDetail();
        OASGenderDetail genderDetail4 = new OASGenderDetail();

        System.assert(genderDetail1.equals(genderDetail2));
        System.assert(genderDetail3.equals(genderDetail4));
        System.assertEquals(genderDetail1.hashCode(), genderDetail2.hashCode());
        System.assertEquals(genderDetail3.hashCode(), genderDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGenderDetail genderDetail = new OASGenderDetail();
        Map<String, String> x-property-mappings = genderDetail.getx-property-mappings();
        System.assertEquals('pokemonSpeciesDetails', x-property-mappings.get('pokemon_species_details'));
        System.assertEquals('requiredForEvolution', x-property-mappings.get('required_for_evolution'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGenderDetail genderDetail = new OASGenderDetail();
        System.assertEquals(new List<OASGenderDetailPokemonSpeciesDetails>(), genderDetail.pokemonSpeciesDetails);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), genderDetail.requiredForEvolution);
        System.assertEquals(null, genderDetail.id);
        System.assertEquals(null, genderDetail.name);
    }
}
