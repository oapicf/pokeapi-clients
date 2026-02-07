@isTest
private class OASLocationAreaDetailEncounterMethodTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner1 = OASLocationAreaDetailEncounterMethod.getExample();
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner2 = locationAreaDetailEncounterMethodRatesInner1;
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner3 = new OASLocationAreaDetailEncounterMethod();
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner4 = locationAreaDetailEncounterMethodRatesInner3;

        System.assert(locationAreaDetailEncounterMethodRatesInner1.equals(locationAreaDetailEncounterMethodRatesInner2));
        System.assert(locationAreaDetailEncounterMethodRatesInner2.equals(locationAreaDetailEncounterMethodRatesInner1));
        System.assert(locationAreaDetailEncounterMethodRatesInner1.equals(locationAreaDetailEncounterMethodRatesInner1));
        System.assert(locationAreaDetailEncounterMethodRatesInner3.equals(locationAreaDetailEncounterMethodRatesInner4));
        System.assert(locationAreaDetailEncounterMethodRatesInner4.equals(locationAreaDetailEncounterMethodRatesInner3));
        System.assert(locationAreaDetailEncounterMethodRatesInner3.equals(locationAreaDetailEncounterMethodRatesInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner1 = OASLocationAreaDetailEncounterMethod.getExample();
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner2 = OASLocationAreaDetailEncounterMethod.getExample();
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner3 = new OASLocationAreaDetailEncounterMethod();
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner4 = new OASLocationAreaDetailEncounterMethod();

        System.assert(locationAreaDetailEncounterMethodRatesInner1.equals(locationAreaDetailEncounterMethodRatesInner2));
        System.assert(locationAreaDetailEncounterMethodRatesInner2.equals(locationAreaDetailEncounterMethodRatesInner1));
        System.assert(locationAreaDetailEncounterMethodRatesInner3.equals(locationAreaDetailEncounterMethodRatesInner4));
        System.assert(locationAreaDetailEncounterMethodRatesInner4.equals(locationAreaDetailEncounterMethodRatesInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner1 = OASLocationAreaDetailEncounterMethod.getExample();
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner2 = new OASLocationAreaDetailEncounterMethod();

        System.assertEquals(false, locationAreaDetailEncounterMethodRatesInner1.equals('foo'));
        System.assertEquals(false, locationAreaDetailEncounterMethodRatesInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner1 = OASLocationAreaDetailEncounterMethod.getExample();
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner2 = new OASLocationAreaDetailEncounterMethod();
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner3;

        System.assertEquals(false, locationAreaDetailEncounterMethodRatesInner1.equals(locationAreaDetailEncounterMethodRatesInner3));
        System.assertEquals(false, locationAreaDetailEncounterMethodRatesInner2.equals(locationAreaDetailEncounterMethodRatesInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner1 = OASLocationAreaDetailEncounterMethod.getExample();
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner2 = new OASLocationAreaDetailEncounterMethod();

        System.assertEquals(locationAreaDetailEncounterMethodRatesInner1.hashCode(), locationAreaDetailEncounterMethodRatesInner1.hashCode());
        System.assertEquals(locationAreaDetailEncounterMethodRatesInner2.hashCode(), locationAreaDetailEncounterMethodRatesInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner1 = OASLocationAreaDetailEncounterMethod.getExample();
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner2 = OASLocationAreaDetailEncounterMethod.getExample();
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner3 = new OASLocationAreaDetailEncounterMethod();
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner4 = new OASLocationAreaDetailEncounterMethod();

        System.assert(locationAreaDetailEncounterMethodRatesInner1.equals(locationAreaDetailEncounterMethodRatesInner2));
        System.assert(locationAreaDetailEncounterMethodRatesInner3.equals(locationAreaDetailEncounterMethodRatesInner4));
        System.assertEquals(locationAreaDetailEncounterMethodRatesInner1.hashCode(), locationAreaDetailEncounterMethodRatesInner2.hashCode());
        System.assertEquals(locationAreaDetailEncounterMethodRatesInner3.hashCode(), locationAreaDetailEncounterMethodRatesInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner = new OASLocationAreaDetailEncounterMethod();
        Map<String, String> x-property-mappings = locationAreaDetailEncounterMethodRatesInner.getx-property-mappings();
        System.assertEquals('encounterMethod', x-property-mappings.get('encounter_method'));
        System.assertEquals('versionDetails', x-property-mappings.get('version_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLocationAreaDetailEncounterMethod locationAreaDetailEncounterMethodRatesInner = new OASLocationAreaDetailEncounterMethod();
        System.assertEquals(new List<OASLocationAreaDetailEncounterMethod>(), locationAreaDetailEncounterMethodRatesInner.versionDetails);
        System.assertEquals(null, locationAreaDetailEncounterMethodRatesInner.encounterMethod);
    }
}
