@isTest
private class OASPokeathlonStatDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokeathlonStatDetail pokeathlonStatDetail1 = OASPokeathlonStatDetail.getExample();
        OASPokeathlonStatDetail pokeathlonStatDetail2 = pokeathlonStatDetail1;
        OASPokeathlonStatDetail pokeathlonStatDetail3 = new OASPokeathlonStatDetail();
        OASPokeathlonStatDetail pokeathlonStatDetail4 = pokeathlonStatDetail3;

        System.assert(pokeathlonStatDetail1.equals(pokeathlonStatDetail2));
        System.assert(pokeathlonStatDetail2.equals(pokeathlonStatDetail1));
        System.assert(pokeathlonStatDetail1.equals(pokeathlonStatDetail1));
        System.assert(pokeathlonStatDetail3.equals(pokeathlonStatDetail4));
        System.assert(pokeathlonStatDetail4.equals(pokeathlonStatDetail3));
        System.assert(pokeathlonStatDetail3.equals(pokeathlonStatDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokeathlonStatDetail pokeathlonStatDetail1 = OASPokeathlonStatDetail.getExample();
        OASPokeathlonStatDetail pokeathlonStatDetail2 = OASPokeathlonStatDetail.getExample();
        OASPokeathlonStatDetail pokeathlonStatDetail3 = new OASPokeathlonStatDetail();
        OASPokeathlonStatDetail pokeathlonStatDetail4 = new OASPokeathlonStatDetail();

        System.assert(pokeathlonStatDetail1.equals(pokeathlonStatDetail2));
        System.assert(pokeathlonStatDetail2.equals(pokeathlonStatDetail1));
        System.assert(pokeathlonStatDetail3.equals(pokeathlonStatDetail4));
        System.assert(pokeathlonStatDetail4.equals(pokeathlonStatDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokeathlonStatDetail pokeathlonStatDetail1 = OASPokeathlonStatDetail.getExample();
        OASPokeathlonStatDetail pokeathlonStatDetail2 = new OASPokeathlonStatDetail();

        System.assertEquals(false, pokeathlonStatDetail1.equals('foo'));
        System.assertEquals(false, pokeathlonStatDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokeathlonStatDetail pokeathlonStatDetail1 = OASPokeathlonStatDetail.getExample();
        OASPokeathlonStatDetail pokeathlonStatDetail2 = new OASPokeathlonStatDetail();
        OASPokeathlonStatDetail pokeathlonStatDetail3;

        System.assertEquals(false, pokeathlonStatDetail1.equals(pokeathlonStatDetail3));
        System.assertEquals(false, pokeathlonStatDetail2.equals(pokeathlonStatDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokeathlonStatDetail pokeathlonStatDetail1 = OASPokeathlonStatDetail.getExample();
        OASPokeathlonStatDetail pokeathlonStatDetail2 = new OASPokeathlonStatDetail();

        System.assertEquals(pokeathlonStatDetail1.hashCode(), pokeathlonStatDetail1.hashCode());
        System.assertEquals(pokeathlonStatDetail2.hashCode(), pokeathlonStatDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokeathlonStatDetail pokeathlonStatDetail1 = OASPokeathlonStatDetail.getExample();
        OASPokeathlonStatDetail pokeathlonStatDetail2 = OASPokeathlonStatDetail.getExample();
        OASPokeathlonStatDetail pokeathlonStatDetail3 = new OASPokeathlonStatDetail();
        OASPokeathlonStatDetail pokeathlonStatDetail4 = new OASPokeathlonStatDetail();

        System.assert(pokeathlonStatDetail1.equals(pokeathlonStatDetail2));
        System.assert(pokeathlonStatDetail3.equals(pokeathlonStatDetail4));
        System.assertEquals(pokeathlonStatDetail1.hashCode(), pokeathlonStatDetail2.hashCode());
        System.assertEquals(pokeathlonStatDetail3.hashCode(), pokeathlonStatDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokeathlonStatDetail pokeathlonStatDetail = new OASPokeathlonStatDetail();
        Map<String, String> x-property-mappings = pokeathlonStatDetail.getx-property-mappings();
        System.assertEquals('affectingNatures', x-property-mappings.get('affecting_natures'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPokeathlonStatDetail pokeathlonStatDetail = new OASPokeathlonStatDetail();
        System.assertEquals(new List<OASPokeathlonStatName>(), pokeathlonStatDetail.names);
        System.assertEquals(null, pokeathlonStatDetail.id);
        System.assertEquals(null, pokeathlonStatDetail.name);
        System.assertEquals(null, pokeathlonStatDetail.affectingNatures);
    }
}
