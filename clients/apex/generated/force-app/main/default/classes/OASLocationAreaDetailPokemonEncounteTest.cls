@isTest
private class OASLocationAreaDetailPokemonEncounteTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner1 = OASLocationAreaDetailPokemonEncounte.getExample();
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner2 = locationAreaDetailPokemonEncountersInner1;
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner3 = new OASLocationAreaDetailPokemonEncounte();
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner4 = locationAreaDetailPokemonEncountersInner3;

        System.assert(locationAreaDetailPokemonEncountersInner1.equals(locationAreaDetailPokemonEncountersInner2));
        System.assert(locationAreaDetailPokemonEncountersInner2.equals(locationAreaDetailPokemonEncountersInner1));
        System.assert(locationAreaDetailPokemonEncountersInner1.equals(locationAreaDetailPokemonEncountersInner1));
        System.assert(locationAreaDetailPokemonEncountersInner3.equals(locationAreaDetailPokemonEncountersInner4));
        System.assert(locationAreaDetailPokemonEncountersInner4.equals(locationAreaDetailPokemonEncountersInner3));
        System.assert(locationAreaDetailPokemonEncountersInner3.equals(locationAreaDetailPokemonEncountersInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner1 = OASLocationAreaDetailPokemonEncounte.getExample();
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner2 = OASLocationAreaDetailPokemonEncounte.getExample();
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner3 = new OASLocationAreaDetailPokemonEncounte();
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner4 = new OASLocationAreaDetailPokemonEncounte();

        System.assert(locationAreaDetailPokemonEncountersInner1.equals(locationAreaDetailPokemonEncountersInner2));
        System.assert(locationAreaDetailPokemonEncountersInner2.equals(locationAreaDetailPokemonEncountersInner1));
        System.assert(locationAreaDetailPokemonEncountersInner3.equals(locationAreaDetailPokemonEncountersInner4));
        System.assert(locationAreaDetailPokemonEncountersInner4.equals(locationAreaDetailPokemonEncountersInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner1 = OASLocationAreaDetailPokemonEncounte.getExample();
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner2 = new OASLocationAreaDetailPokemonEncounte();

        System.assertEquals(false, locationAreaDetailPokemonEncountersInner1.equals('foo'));
        System.assertEquals(false, locationAreaDetailPokemonEncountersInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner1 = OASLocationAreaDetailPokemonEncounte.getExample();
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner2 = new OASLocationAreaDetailPokemonEncounte();
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner3;

        System.assertEquals(false, locationAreaDetailPokemonEncountersInner1.equals(locationAreaDetailPokemonEncountersInner3));
        System.assertEquals(false, locationAreaDetailPokemonEncountersInner2.equals(locationAreaDetailPokemonEncountersInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner1 = OASLocationAreaDetailPokemonEncounte.getExample();
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner2 = new OASLocationAreaDetailPokemonEncounte();

        System.assertEquals(locationAreaDetailPokemonEncountersInner1.hashCode(), locationAreaDetailPokemonEncountersInner1.hashCode());
        System.assertEquals(locationAreaDetailPokemonEncountersInner2.hashCode(), locationAreaDetailPokemonEncountersInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner1 = OASLocationAreaDetailPokemonEncounte.getExample();
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner2 = OASLocationAreaDetailPokemonEncounte.getExample();
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner3 = new OASLocationAreaDetailPokemonEncounte();
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner4 = new OASLocationAreaDetailPokemonEncounte();

        System.assert(locationAreaDetailPokemonEncountersInner1.equals(locationAreaDetailPokemonEncountersInner2));
        System.assert(locationAreaDetailPokemonEncountersInner3.equals(locationAreaDetailPokemonEncountersInner4));
        System.assertEquals(locationAreaDetailPokemonEncountersInner1.hashCode(), locationAreaDetailPokemonEncountersInner2.hashCode());
        System.assertEquals(locationAreaDetailPokemonEncountersInner3.hashCode(), locationAreaDetailPokemonEncountersInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner = new OASLocationAreaDetailPokemonEncounte();
        Map<String, String> x-property-mappings = locationAreaDetailPokemonEncountersInner.getx-property-mappings();
        System.assertEquals('versionDetails', x-property-mappings.get('version_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLocationAreaDetailPokemonEncounte locationAreaDetailPokemonEncountersInner = new OASLocationAreaDetailPokemonEncounte();
        System.assertEquals(new List<OASLocationAreaDetailPokemonEncounte>(), locationAreaDetailPokemonEncountersInner.versionDetails);
        System.assertEquals(null, locationAreaDetailPokemonEncountersInner.pokemon);
    }
}
