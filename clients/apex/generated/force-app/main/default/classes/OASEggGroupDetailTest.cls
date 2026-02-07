@isTest
private class OASEggGroupDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASEggGroupDetail eggGroupDetail1 = OASEggGroupDetail.getExample();
        OASEggGroupDetail eggGroupDetail2 = eggGroupDetail1;
        OASEggGroupDetail eggGroupDetail3 = new OASEggGroupDetail();
        OASEggGroupDetail eggGroupDetail4 = eggGroupDetail3;

        System.assert(eggGroupDetail1.equals(eggGroupDetail2));
        System.assert(eggGroupDetail2.equals(eggGroupDetail1));
        System.assert(eggGroupDetail1.equals(eggGroupDetail1));
        System.assert(eggGroupDetail3.equals(eggGroupDetail4));
        System.assert(eggGroupDetail4.equals(eggGroupDetail3));
        System.assert(eggGroupDetail3.equals(eggGroupDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEggGroupDetail eggGroupDetail1 = OASEggGroupDetail.getExample();
        OASEggGroupDetail eggGroupDetail2 = OASEggGroupDetail.getExample();
        OASEggGroupDetail eggGroupDetail3 = new OASEggGroupDetail();
        OASEggGroupDetail eggGroupDetail4 = new OASEggGroupDetail();

        System.assert(eggGroupDetail1.equals(eggGroupDetail2));
        System.assert(eggGroupDetail2.equals(eggGroupDetail1));
        System.assert(eggGroupDetail3.equals(eggGroupDetail4));
        System.assert(eggGroupDetail4.equals(eggGroupDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEggGroupDetail eggGroupDetail1 = OASEggGroupDetail.getExample();
        OASEggGroupDetail eggGroupDetail2 = new OASEggGroupDetail();

        System.assertEquals(false, eggGroupDetail1.equals('foo'));
        System.assertEquals(false, eggGroupDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEggGroupDetail eggGroupDetail1 = OASEggGroupDetail.getExample();
        OASEggGroupDetail eggGroupDetail2 = new OASEggGroupDetail();
        OASEggGroupDetail eggGroupDetail3;

        System.assertEquals(false, eggGroupDetail1.equals(eggGroupDetail3));
        System.assertEquals(false, eggGroupDetail2.equals(eggGroupDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEggGroupDetail eggGroupDetail1 = OASEggGroupDetail.getExample();
        OASEggGroupDetail eggGroupDetail2 = new OASEggGroupDetail();

        System.assertEquals(eggGroupDetail1.hashCode(), eggGroupDetail1.hashCode());
        System.assertEquals(eggGroupDetail2.hashCode(), eggGroupDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEggGroupDetail eggGroupDetail1 = OASEggGroupDetail.getExample();
        OASEggGroupDetail eggGroupDetail2 = OASEggGroupDetail.getExample();
        OASEggGroupDetail eggGroupDetail3 = new OASEggGroupDetail();
        OASEggGroupDetail eggGroupDetail4 = new OASEggGroupDetail();

        System.assert(eggGroupDetail1.equals(eggGroupDetail2));
        System.assert(eggGroupDetail3.equals(eggGroupDetail4));
        System.assertEquals(eggGroupDetail1.hashCode(), eggGroupDetail2.hashCode());
        System.assertEquals(eggGroupDetail3.hashCode(), eggGroupDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEggGroupDetail eggGroupDetail = new OASEggGroupDetail();
        Map<String, String> x-property-mappings = eggGroupDetail.getx-property-mappings();
        System.assertEquals('pokemonSpecies', x-property-mappings.get('pokemon_species'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEggGroupDetail eggGroupDetail = new OASEggGroupDetail();
        System.assertEquals(new List<OASEggGroupName>(), eggGroupDetail.names);
        System.assertEquals(new List<OASEggGroupDetailPokemonSpeciesInner>(), eggGroupDetail.pokemonSpecies);
        System.assertEquals(null, eggGroupDetail.id);
        System.assertEquals(null, eggGroupDetail.name);
    }
}
