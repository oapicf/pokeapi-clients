@isTest
private class OASRegionDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASRegionDetail regionDetail1 = OASRegionDetail.getExample();
        OASRegionDetail regionDetail2 = regionDetail1;
        OASRegionDetail regionDetail3 = new OASRegionDetail();
        OASRegionDetail regionDetail4 = regionDetail3;

        System.assert(regionDetail1.equals(regionDetail2));
        System.assert(regionDetail2.equals(regionDetail1));
        System.assert(regionDetail1.equals(regionDetail1));
        System.assert(regionDetail3.equals(regionDetail4));
        System.assert(regionDetail4.equals(regionDetail3));
        System.assert(regionDetail3.equals(regionDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASRegionDetail regionDetail1 = OASRegionDetail.getExample();
        OASRegionDetail regionDetail2 = OASRegionDetail.getExample();
        OASRegionDetail regionDetail3 = new OASRegionDetail();
        OASRegionDetail regionDetail4 = new OASRegionDetail();

        System.assert(regionDetail1.equals(regionDetail2));
        System.assert(regionDetail2.equals(regionDetail1));
        System.assert(regionDetail3.equals(regionDetail4));
        System.assert(regionDetail4.equals(regionDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASRegionDetail regionDetail1 = OASRegionDetail.getExample();
        OASRegionDetail regionDetail2 = new OASRegionDetail();

        System.assertEquals(false, regionDetail1.equals('foo'));
        System.assertEquals(false, regionDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASRegionDetail regionDetail1 = OASRegionDetail.getExample();
        OASRegionDetail regionDetail2 = new OASRegionDetail();
        OASRegionDetail regionDetail3;

        System.assertEquals(false, regionDetail1.equals(regionDetail3));
        System.assertEquals(false, regionDetail2.equals(regionDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASRegionDetail regionDetail1 = OASRegionDetail.getExample();
        OASRegionDetail regionDetail2 = new OASRegionDetail();

        System.assertEquals(regionDetail1.hashCode(), regionDetail1.hashCode());
        System.assertEquals(regionDetail2.hashCode(), regionDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASRegionDetail regionDetail1 = OASRegionDetail.getExample();
        OASRegionDetail regionDetail2 = OASRegionDetail.getExample();
        OASRegionDetail regionDetail3 = new OASRegionDetail();
        OASRegionDetail regionDetail4 = new OASRegionDetail();

        System.assert(regionDetail1.equals(regionDetail2));
        System.assert(regionDetail3.equals(regionDetail4));
        System.assertEquals(regionDetail1.hashCode(), regionDetail2.hashCode());
        System.assertEquals(regionDetail3.hashCode(), regionDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASRegionDetail regionDetail = new OASRegionDetail();
        Map<String, String> x-property-mappings = regionDetail.getx-property-mappings();
        System.assertEquals('mainGeneration', x-property-mappings.get('main_generation'));
        System.assertEquals('versionGroups', x-property-mappings.get('version_groups'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASRegionDetail regionDetail = new OASRegionDetail();
        System.assertEquals(new List<OASLocationSummary>(), regionDetail.locations);
        System.assertEquals(new List<OASRegionName>(), regionDetail.names);
        System.assertEquals(new List<OASPokedexSummary>(), regionDetail.pokedexes);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), regionDetail.versionGroups);
        System.assertEquals(null, regionDetail.id);
        System.assertEquals(null, regionDetail.name);
        System.assertEquals(null, regionDetail.mainGeneration);
    }
}
