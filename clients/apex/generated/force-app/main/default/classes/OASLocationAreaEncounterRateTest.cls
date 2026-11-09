@isTest
private class OASLocationAreaEncounterRateTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationAreaEncounterRate locationAreaEncounterRate1 = OASLocationAreaEncounterRate.getExample();
        OASLocationAreaEncounterRate locationAreaEncounterRate2 = locationAreaEncounterRate1;
        OASLocationAreaEncounterRate locationAreaEncounterRate3 = new OASLocationAreaEncounterRate();
        OASLocationAreaEncounterRate locationAreaEncounterRate4 = locationAreaEncounterRate3;

        System.assert(locationAreaEncounterRate1.equals(locationAreaEncounterRate2));
        System.assert(locationAreaEncounterRate2.equals(locationAreaEncounterRate1));
        System.assert(locationAreaEncounterRate1.equals(locationAreaEncounterRate1));
        System.assert(locationAreaEncounterRate3.equals(locationAreaEncounterRate4));
        System.assert(locationAreaEncounterRate4.equals(locationAreaEncounterRate3));
        System.assert(locationAreaEncounterRate3.equals(locationAreaEncounterRate3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationAreaEncounterRate locationAreaEncounterRate1 = OASLocationAreaEncounterRate.getExample();
        OASLocationAreaEncounterRate locationAreaEncounterRate2 = OASLocationAreaEncounterRate.getExample();
        OASLocationAreaEncounterRate locationAreaEncounterRate3 = new OASLocationAreaEncounterRate();
        OASLocationAreaEncounterRate locationAreaEncounterRate4 = new OASLocationAreaEncounterRate();

        System.assert(locationAreaEncounterRate1.equals(locationAreaEncounterRate2));
        System.assert(locationAreaEncounterRate2.equals(locationAreaEncounterRate1));
        System.assert(locationAreaEncounterRate3.equals(locationAreaEncounterRate4));
        System.assert(locationAreaEncounterRate4.equals(locationAreaEncounterRate3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationAreaEncounterRate locationAreaEncounterRate1 = OASLocationAreaEncounterRate.getExample();
        OASLocationAreaEncounterRate locationAreaEncounterRate2 = new OASLocationAreaEncounterRate();

        System.assertEquals(false, locationAreaEncounterRate1.equals('foo'));
        System.assertEquals(false, locationAreaEncounterRate2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationAreaEncounterRate locationAreaEncounterRate1 = OASLocationAreaEncounterRate.getExample();
        OASLocationAreaEncounterRate locationAreaEncounterRate2 = new OASLocationAreaEncounterRate();
        OASLocationAreaEncounterRate locationAreaEncounterRate3;

        System.assertEquals(false, locationAreaEncounterRate1.equals(locationAreaEncounterRate3));
        System.assertEquals(false, locationAreaEncounterRate2.equals(locationAreaEncounterRate3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationAreaEncounterRate locationAreaEncounterRate1 = OASLocationAreaEncounterRate.getExample();
        OASLocationAreaEncounterRate locationAreaEncounterRate2 = new OASLocationAreaEncounterRate();

        System.assertEquals(locationAreaEncounterRate1.hashCode(), locationAreaEncounterRate1.hashCode());
        System.assertEquals(locationAreaEncounterRate2.hashCode(), locationAreaEncounterRate2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationAreaEncounterRate locationAreaEncounterRate1 = OASLocationAreaEncounterRate.getExample();
        OASLocationAreaEncounterRate locationAreaEncounterRate2 = OASLocationAreaEncounterRate.getExample();
        OASLocationAreaEncounterRate locationAreaEncounterRate3 = new OASLocationAreaEncounterRate();
        OASLocationAreaEncounterRate locationAreaEncounterRate4 = new OASLocationAreaEncounterRate();

        System.assert(locationAreaEncounterRate1.equals(locationAreaEncounterRate2));
        System.assert(locationAreaEncounterRate3.equals(locationAreaEncounterRate4));
        System.assertEquals(locationAreaEncounterRate1.hashCode(), locationAreaEncounterRate2.hashCode());
        System.assertEquals(locationAreaEncounterRate3.hashCode(), locationAreaEncounterRate4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLocationAreaEncounterRate locationAreaEncounterRate = new OASLocationAreaEncounterRate();
        Map<String, String> x-property-mappings = locationAreaEncounterRate.getx-property-mappings();
        System.assertEquals('encounterMethod', x-property-mappings.get('encounter_method'));
        System.assertEquals('versionDetails', x-property-mappings.get('version_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLocationAreaEncounterRate locationAreaEncounterRate = new OASLocationAreaEncounterRate();
        System.assertEquals(new List<OASLocationAreaEncounterVersionDetai>(), locationAreaEncounterRate.versionDetails);
        System.assertEquals(null, locationAreaEncounterRate.encounterMethod);
    }
}
