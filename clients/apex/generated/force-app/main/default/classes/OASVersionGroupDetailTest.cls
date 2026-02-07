@isTest
private class OASVersionGroupDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASVersionGroupDetail versionGroupDetail1 = OASVersionGroupDetail.getExample();
        OASVersionGroupDetail versionGroupDetail2 = versionGroupDetail1;
        OASVersionGroupDetail versionGroupDetail3 = new OASVersionGroupDetail();
        OASVersionGroupDetail versionGroupDetail4 = versionGroupDetail3;

        System.assert(versionGroupDetail1.equals(versionGroupDetail2));
        System.assert(versionGroupDetail2.equals(versionGroupDetail1));
        System.assert(versionGroupDetail1.equals(versionGroupDetail1));
        System.assert(versionGroupDetail3.equals(versionGroupDetail4));
        System.assert(versionGroupDetail4.equals(versionGroupDetail3));
        System.assert(versionGroupDetail3.equals(versionGroupDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASVersionGroupDetail versionGroupDetail1 = OASVersionGroupDetail.getExample();
        OASVersionGroupDetail versionGroupDetail2 = OASVersionGroupDetail.getExample();
        OASVersionGroupDetail versionGroupDetail3 = new OASVersionGroupDetail();
        OASVersionGroupDetail versionGroupDetail4 = new OASVersionGroupDetail();

        System.assert(versionGroupDetail1.equals(versionGroupDetail2));
        System.assert(versionGroupDetail2.equals(versionGroupDetail1));
        System.assert(versionGroupDetail3.equals(versionGroupDetail4));
        System.assert(versionGroupDetail4.equals(versionGroupDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASVersionGroupDetail versionGroupDetail1 = OASVersionGroupDetail.getExample();
        OASVersionGroupDetail versionGroupDetail2 = new OASVersionGroupDetail();

        System.assertEquals(false, versionGroupDetail1.equals('foo'));
        System.assertEquals(false, versionGroupDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASVersionGroupDetail versionGroupDetail1 = OASVersionGroupDetail.getExample();
        OASVersionGroupDetail versionGroupDetail2 = new OASVersionGroupDetail();
        OASVersionGroupDetail versionGroupDetail3;

        System.assertEquals(false, versionGroupDetail1.equals(versionGroupDetail3));
        System.assertEquals(false, versionGroupDetail2.equals(versionGroupDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASVersionGroupDetail versionGroupDetail1 = OASVersionGroupDetail.getExample();
        OASVersionGroupDetail versionGroupDetail2 = new OASVersionGroupDetail();

        System.assertEquals(versionGroupDetail1.hashCode(), versionGroupDetail1.hashCode());
        System.assertEquals(versionGroupDetail2.hashCode(), versionGroupDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASVersionGroupDetail versionGroupDetail1 = OASVersionGroupDetail.getExample();
        OASVersionGroupDetail versionGroupDetail2 = OASVersionGroupDetail.getExample();
        OASVersionGroupDetail versionGroupDetail3 = new OASVersionGroupDetail();
        OASVersionGroupDetail versionGroupDetail4 = new OASVersionGroupDetail();

        System.assert(versionGroupDetail1.equals(versionGroupDetail2));
        System.assert(versionGroupDetail3.equals(versionGroupDetail4));
        System.assertEquals(versionGroupDetail1.hashCode(), versionGroupDetail2.hashCode());
        System.assertEquals(versionGroupDetail3.hashCode(), versionGroupDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASVersionGroupDetail versionGroupDetail = new OASVersionGroupDetail();
        Map<String, String> x-property-mappings = versionGroupDetail.getx-property-mappings();
        System.assertEquals('moveLearnMethods', x-property-mappings.get('move_learn_methods'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASVersionGroupDetail versionGroupDetail = new OASVersionGroupDetail();
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), versionGroupDetail.moveLearnMethods);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), versionGroupDetail.pokedexes);
        System.assertEquals(new List<OASAbilityDetailPokemonInnerPokemon>(), versionGroupDetail.regions);
        System.assertEquals(new List<OASVersionSummary>(), versionGroupDetail.versions);
        System.assertEquals(null, versionGroupDetail.id);
        System.assertEquals(null, versionGroupDetail.name);
        System.assertEquals(null, versionGroupDetail.order);
        System.assertEquals(null, versionGroupDetail.generation);
    }
}
