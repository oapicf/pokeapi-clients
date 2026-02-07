@isTest
private class OASGenerationDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASGenerationDetail generationDetail1 = OASGenerationDetail.getExample();
        OASGenerationDetail generationDetail2 = generationDetail1;
        OASGenerationDetail generationDetail3 = new OASGenerationDetail();
        OASGenerationDetail generationDetail4 = generationDetail3;

        System.assert(generationDetail1.equals(generationDetail2));
        System.assert(generationDetail2.equals(generationDetail1));
        System.assert(generationDetail1.equals(generationDetail1));
        System.assert(generationDetail3.equals(generationDetail4));
        System.assert(generationDetail4.equals(generationDetail3));
        System.assert(generationDetail3.equals(generationDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGenerationDetail generationDetail1 = OASGenerationDetail.getExample();
        OASGenerationDetail generationDetail2 = OASGenerationDetail.getExample();
        OASGenerationDetail generationDetail3 = new OASGenerationDetail();
        OASGenerationDetail generationDetail4 = new OASGenerationDetail();

        System.assert(generationDetail1.equals(generationDetail2));
        System.assert(generationDetail2.equals(generationDetail1));
        System.assert(generationDetail3.equals(generationDetail4));
        System.assert(generationDetail4.equals(generationDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGenerationDetail generationDetail1 = OASGenerationDetail.getExample();
        OASGenerationDetail generationDetail2 = new OASGenerationDetail();

        System.assertEquals(false, generationDetail1.equals('foo'));
        System.assertEquals(false, generationDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGenerationDetail generationDetail1 = OASGenerationDetail.getExample();
        OASGenerationDetail generationDetail2 = new OASGenerationDetail();
        OASGenerationDetail generationDetail3;

        System.assertEquals(false, generationDetail1.equals(generationDetail3));
        System.assertEquals(false, generationDetail2.equals(generationDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGenerationDetail generationDetail1 = OASGenerationDetail.getExample();
        OASGenerationDetail generationDetail2 = new OASGenerationDetail();

        System.assertEquals(generationDetail1.hashCode(), generationDetail1.hashCode());
        System.assertEquals(generationDetail2.hashCode(), generationDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGenerationDetail generationDetail1 = OASGenerationDetail.getExample();
        OASGenerationDetail generationDetail2 = OASGenerationDetail.getExample();
        OASGenerationDetail generationDetail3 = new OASGenerationDetail();
        OASGenerationDetail generationDetail4 = new OASGenerationDetail();

        System.assert(generationDetail1.equals(generationDetail2));
        System.assert(generationDetail3.equals(generationDetail4));
        System.assertEquals(generationDetail1.hashCode(), generationDetail2.hashCode());
        System.assertEquals(generationDetail3.hashCode(), generationDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGenerationDetail generationDetail = new OASGenerationDetail();
        Map<String, String> x-property-mappings = generationDetail.getx-property-mappings();
        System.assertEquals('mainRegion', x-property-mappings.get('main_region'));
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon_species'));
        System.assertEquals('versionGroups', x-property-mappings.get('version_groups'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGenerationDetail generationDetail = new OASGenerationDetail();
        System.assertEquals(new List<OASAbilitySummary>(), generationDetail.abilities);
        System.assertEquals(new List<OASMoveSummary>(), generationDetail.moves);
        System.assertEquals(new List<OASGenerationName>(), generationDetail.names);
        System.assertEquals(new List<OASPokemonSpeciesSummary>(), generationDetail.pokemonSpecies);
        System.assertEquals(new List<OASTypeSummary>(), generationDetail.types);
        System.assertEquals(new List<OASVersionGroupSummary>(), generationDetail.versionGroups);
        System.assertEquals(null, generationDetail.id);
        System.assertEquals(null, generationDetail.name);
        System.assertEquals(null, generationDetail.mainRegion);
    }
}
