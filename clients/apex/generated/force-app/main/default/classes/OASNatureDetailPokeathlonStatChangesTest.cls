@isTest
private class OASNatureDetailPokeathlonStatChangesTest {
    @isTest
    private static void equalsSameInstance() {
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner1 = OASNatureDetailPokeathlonStatChanges.getExample();
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner2 = natureDetailPokeathlonStatChangesInner1;
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner3 = new OASNatureDetailPokeathlonStatChanges();
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner4 = natureDetailPokeathlonStatChangesInner3;

        System.assert(natureDetailPokeathlonStatChangesInner1.equals(natureDetailPokeathlonStatChangesInner2));
        System.assert(natureDetailPokeathlonStatChangesInner2.equals(natureDetailPokeathlonStatChangesInner1));
        System.assert(natureDetailPokeathlonStatChangesInner1.equals(natureDetailPokeathlonStatChangesInner1));
        System.assert(natureDetailPokeathlonStatChangesInner3.equals(natureDetailPokeathlonStatChangesInner4));
        System.assert(natureDetailPokeathlonStatChangesInner4.equals(natureDetailPokeathlonStatChangesInner3));
        System.assert(natureDetailPokeathlonStatChangesInner3.equals(natureDetailPokeathlonStatChangesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner1 = OASNatureDetailPokeathlonStatChanges.getExample();
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner2 = OASNatureDetailPokeathlonStatChanges.getExample();
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner3 = new OASNatureDetailPokeathlonStatChanges();
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner4 = new OASNatureDetailPokeathlonStatChanges();

        System.assert(natureDetailPokeathlonStatChangesInner1.equals(natureDetailPokeathlonStatChangesInner2));
        System.assert(natureDetailPokeathlonStatChangesInner2.equals(natureDetailPokeathlonStatChangesInner1));
        System.assert(natureDetailPokeathlonStatChangesInner3.equals(natureDetailPokeathlonStatChangesInner4));
        System.assert(natureDetailPokeathlonStatChangesInner4.equals(natureDetailPokeathlonStatChangesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner1 = OASNatureDetailPokeathlonStatChanges.getExample();
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner2 = new OASNatureDetailPokeathlonStatChanges();

        System.assertEquals(false, natureDetailPokeathlonStatChangesInner1.equals('foo'));
        System.assertEquals(false, natureDetailPokeathlonStatChangesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner1 = OASNatureDetailPokeathlonStatChanges.getExample();
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner2 = new OASNatureDetailPokeathlonStatChanges();
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner3;

        System.assertEquals(false, natureDetailPokeathlonStatChangesInner1.equals(natureDetailPokeathlonStatChangesInner3));
        System.assertEquals(false, natureDetailPokeathlonStatChangesInner2.equals(natureDetailPokeathlonStatChangesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner1 = OASNatureDetailPokeathlonStatChanges.getExample();
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner2 = new OASNatureDetailPokeathlonStatChanges();

        System.assertEquals(natureDetailPokeathlonStatChangesInner1.hashCode(), natureDetailPokeathlonStatChangesInner1.hashCode());
        System.assertEquals(natureDetailPokeathlonStatChangesInner2.hashCode(), natureDetailPokeathlonStatChangesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner1 = OASNatureDetailPokeathlonStatChanges.getExample();
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner2 = OASNatureDetailPokeathlonStatChanges.getExample();
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner3 = new OASNatureDetailPokeathlonStatChanges();
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner4 = new OASNatureDetailPokeathlonStatChanges();

        System.assert(natureDetailPokeathlonStatChangesInner1.equals(natureDetailPokeathlonStatChangesInner2));
        System.assert(natureDetailPokeathlonStatChangesInner3.equals(natureDetailPokeathlonStatChangesInner4));
        System.assertEquals(natureDetailPokeathlonStatChangesInner1.hashCode(), natureDetailPokeathlonStatChangesInner2.hashCode());
        System.assertEquals(natureDetailPokeathlonStatChangesInner3.hashCode(), natureDetailPokeathlonStatChangesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASNatureDetailPokeathlonStatChanges natureDetailPokeathlonStatChangesInner = new OASNatureDetailPokeathlonStatChanges();
        Map<String, String> x-property-mappings = natureDetailPokeathlonStatChangesInner.getx-property-mappings();
        System.assertEquals('maxChange', x-property-mappings.get('max_change'));
        System.assertEquals('pokeathlonStat', x-property-mappings.get('pokeathlon_stat'));
    }
}
