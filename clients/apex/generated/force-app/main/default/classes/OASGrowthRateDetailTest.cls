@isTest
private class OASGrowthRateDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASGrowthRateDetail growthRateDetail1 = OASGrowthRateDetail.getExample();
        OASGrowthRateDetail growthRateDetail2 = growthRateDetail1;
        OASGrowthRateDetail growthRateDetail3 = new OASGrowthRateDetail();
        OASGrowthRateDetail growthRateDetail4 = growthRateDetail3;

        System.assert(growthRateDetail1.equals(growthRateDetail2));
        System.assert(growthRateDetail2.equals(growthRateDetail1));
        System.assert(growthRateDetail1.equals(growthRateDetail1));
        System.assert(growthRateDetail3.equals(growthRateDetail4));
        System.assert(growthRateDetail4.equals(growthRateDetail3));
        System.assert(growthRateDetail3.equals(growthRateDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASGrowthRateDetail growthRateDetail1 = OASGrowthRateDetail.getExample();
        OASGrowthRateDetail growthRateDetail2 = OASGrowthRateDetail.getExample();
        OASGrowthRateDetail growthRateDetail3 = new OASGrowthRateDetail();
        OASGrowthRateDetail growthRateDetail4 = new OASGrowthRateDetail();

        System.assert(growthRateDetail1.equals(growthRateDetail2));
        System.assert(growthRateDetail2.equals(growthRateDetail1));
        System.assert(growthRateDetail3.equals(growthRateDetail4));
        System.assert(growthRateDetail4.equals(growthRateDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASGrowthRateDetail growthRateDetail1 = OASGrowthRateDetail.getExample();
        OASGrowthRateDetail growthRateDetail2 = new OASGrowthRateDetail();

        System.assertEquals(false, growthRateDetail1.equals('foo'));
        System.assertEquals(false, growthRateDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASGrowthRateDetail growthRateDetail1 = OASGrowthRateDetail.getExample();
        OASGrowthRateDetail growthRateDetail2 = new OASGrowthRateDetail();
        OASGrowthRateDetail growthRateDetail3;

        System.assertEquals(false, growthRateDetail1.equals(growthRateDetail3));
        System.assertEquals(false, growthRateDetail2.equals(growthRateDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASGrowthRateDetail growthRateDetail1 = OASGrowthRateDetail.getExample();
        OASGrowthRateDetail growthRateDetail2 = new OASGrowthRateDetail();

        System.assertEquals(growthRateDetail1.hashCode(), growthRateDetail1.hashCode());
        System.assertEquals(growthRateDetail2.hashCode(), growthRateDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASGrowthRateDetail growthRateDetail1 = OASGrowthRateDetail.getExample();
        OASGrowthRateDetail growthRateDetail2 = OASGrowthRateDetail.getExample();
        OASGrowthRateDetail growthRateDetail3 = new OASGrowthRateDetail();
        OASGrowthRateDetail growthRateDetail4 = new OASGrowthRateDetail();

        System.assert(growthRateDetail1.equals(growthRateDetail2));
        System.assert(growthRateDetail3.equals(growthRateDetail4));
        System.assertEquals(growthRateDetail1.hashCode(), growthRateDetail2.hashCode());
        System.assertEquals(growthRateDetail3.hashCode(), growthRateDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASGrowthRateDetail growthRateDetail = new OASGrowthRateDetail();
        Map<String, String> x-property-mappings = growthRateDetail.getx-property-mappings();
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon_species'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASGrowthRateDetail growthRateDetail = new OASGrowthRateDetail();
        System.assertEquals(new List<OASGrowthRateDescription>(), growthRateDetail.descriptions);
        System.assertEquals(new List<OASExperience>(), growthRateDetail.levels);
        System.assertEquals(new List<OASPokemonSpeciesSummary>(), growthRateDetail.pokemonSpecies);
        System.assertEquals(null, growthRateDetail.id);
        System.assertEquals(null, growthRateDetail.name);
        System.assertEquals(null, growthRateDetail.formula);
    }
}
