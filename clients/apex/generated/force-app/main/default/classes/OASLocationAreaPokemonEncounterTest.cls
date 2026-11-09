@isTest
private class OASLocationAreaPokemonEncounterTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter1 = OASLocationAreaPokemonEncounter.getExample();
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter2 = locationAreaPokemonEncounter1;
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter3 = new OASLocationAreaPokemonEncounter();
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter4 = locationAreaPokemonEncounter3;

        System.assert(locationAreaPokemonEncounter1.equals(locationAreaPokemonEncounter2));
        System.assert(locationAreaPokemonEncounter2.equals(locationAreaPokemonEncounter1));
        System.assert(locationAreaPokemonEncounter1.equals(locationAreaPokemonEncounter1));
        System.assert(locationAreaPokemonEncounter3.equals(locationAreaPokemonEncounter4));
        System.assert(locationAreaPokemonEncounter4.equals(locationAreaPokemonEncounter3));
        System.assert(locationAreaPokemonEncounter3.equals(locationAreaPokemonEncounter3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter1 = OASLocationAreaPokemonEncounter.getExample();
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter2 = OASLocationAreaPokemonEncounter.getExample();
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter3 = new OASLocationAreaPokemonEncounter();
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter4 = new OASLocationAreaPokemonEncounter();

        System.assert(locationAreaPokemonEncounter1.equals(locationAreaPokemonEncounter2));
        System.assert(locationAreaPokemonEncounter2.equals(locationAreaPokemonEncounter1));
        System.assert(locationAreaPokemonEncounter3.equals(locationAreaPokemonEncounter4));
        System.assert(locationAreaPokemonEncounter4.equals(locationAreaPokemonEncounter3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter1 = OASLocationAreaPokemonEncounter.getExample();
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter2 = new OASLocationAreaPokemonEncounter();

        System.assertEquals(false, locationAreaPokemonEncounter1.equals('foo'));
        System.assertEquals(false, locationAreaPokemonEncounter2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter1 = OASLocationAreaPokemonEncounter.getExample();
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter2 = new OASLocationAreaPokemonEncounter();
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter3;

        System.assertEquals(false, locationAreaPokemonEncounter1.equals(locationAreaPokemonEncounter3));
        System.assertEquals(false, locationAreaPokemonEncounter2.equals(locationAreaPokemonEncounter3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter1 = OASLocationAreaPokemonEncounter.getExample();
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter2 = new OASLocationAreaPokemonEncounter();

        System.assertEquals(locationAreaPokemonEncounter1.hashCode(), locationAreaPokemonEncounter1.hashCode());
        System.assertEquals(locationAreaPokemonEncounter2.hashCode(), locationAreaPokemonEncounter2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter1 = OASLocationAreaPokemonEncounter.getExample();
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter2 = OASLocationAreaPokemonEncounter.getExample();
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter3 = new OASLocationAreaPokemonEncounter();
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter4 = new OASLocationAreaPokemonEncounter();

        System.assert(locationAreaPokemonEncounter1.equals(locationAreaPokemonEncounter2));
        System.assert(locationAreaPokemonEncounter3.equals(locationAreaPokemonEncounter4));
        System.assertEquals(locationAreaPokemonEncounter1.hashCode(), locationAreaPokemonEncounter2.hashCode());
        System.assertEquals(locationAreaPokemonEncounter3.hashCode(), locationAreaPokemonEncounter4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter = new OASLocationAreaPokemonEncounter();
        Map<String, String> x-property-mappings = locationAreaPokemonEncounter.getx-property-mappings();
        System.assertEquals('versionDetails', x-property-mappings.get('version_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLocationAreaPokemonEncounter locationAreaPokemonEncounter = new OASLocationAreaPokemonEncounter();
        System.assertEquals(new List<OASLocationAreaPokemonEncounterVersi>(), locationAreaPokemonEncounter.versionDetails);
        System.assertEquals(null, locationAreaPokemonEncounter.pokemon);
    }
}
