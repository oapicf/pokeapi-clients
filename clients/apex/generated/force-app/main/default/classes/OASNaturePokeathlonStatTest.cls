@isTest
private class OASNaturePokeathlonStatTest {
    @isTest
    private static void equalsSameInstance() {
        OASNaturePokeathlonStat naturePokeathlonStat1 = OASNaturePokeathlonStat.getExample();
        OASNaturePokeathlonStat naturePokeathlonStat2 = naturePokeathlonStat1;
        OASNaturePokeathlonStat naturePokeathlonStat3 = new OASNaturePokeathlonStat();
        OASNaturePokeathlonStat naturePokeathlonStat4 = naturePokeathlonStat3;

        System.assert(naturePokeathlonStat1.equals(naturePokeathlonStat2));
        System.assert(naturePokeathlonStat2.equals(naturePokeathlonStat1));
        System.assert(naturePokeathlonStat1.equals(naturePokeathlonStat1));
        System.assert(naturePokeathlonStat3.equals(naturePokeathlonStat4));
        System.assert(naturePokeathlonStat4.equals(naturePokeathlonStat3));
        System.assert(naturePokeathlonStat3.equals(naturePokeathlonStat3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNaturePokeathlonStat naturePokeathlonStat1 = OASNaturePokeathlonStat.getExample();
        OASNaturePokeathlonStat naturePokeathlonStat2 = OASNaturePokeathlonStat.getExample();
        OASNaturePokeathlonStat naturePokeathlonStat3 = new OASNaturePokeathlonStat();
        OASNaturePokeathlonStat naturePokeathlonStat4 = new OASNaturePokeathlonStat();

        System.assert(naturePokeathlonStat1.equals(naturePokeathlonStat2));
        System.assert(naturePokeathlonStat2.equals(naturePokeathlonStat1));
        System.assert(naturePokeathlonStat3.equals(naturePokeathlonStat4));
        System.assert(naturePokeathlonStat4.equals(naturePokeathlonStat3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNaturePokeathlonStat naturePokeathlonStat1 = OASNaturePokeathlonStat.getExample();
        OASNaturePokeathlonStat naturePokeathlonStat2 = new OASNaturePokeathlonStat();

        System.assertEquals(false, naturePokeathlonStat1.equals('foo'));
        System.assertEquals(false, naturePokeathlonStat2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNaturePokeathlonStat naturePokeathlonStat1 = OASNaturePokeathlonStat.getExample();
        OASNaturePokeathlonStat naturePokeathlonStat2 = new OASNaturePokeathlonStat();
        OASNaturePokeathlonStat naturePokeathlonStat3;

        System.assertEquals(false, naturePokeathlonStat1.equals(naturePokeathlonStat3));
        System.assertEquals(false, naturePokeathlonStat2.equals(naturePokeathlonStat3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNaturePokeathlonStat naturePokeathlonStat1 = OASNaturePokeathlonStat.getExample();
        OASNaturePokeathlonStat naturePokeathlonStat2 = new OASNaturePokeathlonStat();

        System.assertEquals(naturePokeathlonStat1.hashCode(), naturePokeathlonStat1.hashCode());
        System.assertEquals(naturePokeathlonStat2.hashCode(), naturePokeathlonStat2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNaturePokeathlonStat naturePokeathlonStat1 = OASNaturePokeathlonStat.getExample();
        OASNaturePokeathlonStat naturePokeathlonStat2 = OASNaturePokeathlonStat.getExample();
        OASNaturePokeathlonStat naturePokeathlonStat3 = new OASNaturePokeathlonStat();
        OASNaturePokeathlonStat naturePokeathlonStat4 = new OASNaturePokeathlonStat();

        System.assert(naturePokeathlonStat1.equals(naturePokeathlonStat2));
        System.assert(naturePokeathlonStat3.equals(naturePokeathlonStat4));
        System.assertEquals(naturePokeathlonStat1.hashCode(), naturePokeathlonStat2.hashCode());
        System.assertEquals(naturePokeathlonStat3.hashCode(), naturePokeathlonStat4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASNaturePokeathlonStat naturePokeathlonStat = new OASNaturePokeathlonStat();
        Map<String, String> x-property-mappings = naturePokeathlonStat.getx-property-mappings();
        System.assertEquals('maxChange', x-property-mappings.get('max_change'));
        System.assertEquals('pokeathlonStat', x-property-mappings.get('pokeathlon_stat'));
    }
}
