@isTest
private class OASLocationAreaPokemonEncounterVersiTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion1 = OASLocationAreaPokemonEncounterVersi.getExample();
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion2 = locationAreaPokemonEncounterVersion1;
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion3 = new OASLocationAreaPokemonEncounterVersi();
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion4 = locationAreaPokemonEncounterVersion3;

        System.assert(locationAreaPokemonEncounterVersion1.equals(locationAreaPokemonEncounterVersion2));
        System.assert(locationAreaPokemonEncounterVersion2.equals(locationAreaPokemonEncounterVersion1));
        System.assert(locationAreaPokemonEncounterVersion1.equals(locationAreaPokemonEncounterVersion1));
        System.assert(locationAreaPokemonEncounterVersion3.equals(locationAreaPokemonEncounterVersion4));
        System.assert(locationAreaPokemonEncounterVersion4.equals(locationAreaPokemonEncounterVersion3));
        System.assert(locationAreaPokemonEncounterVersion3.equals(locationAreaPokemonEncounterVersion3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion1 = OASLocationAreaPokemonEncounterVersi.getExample();
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion2 = OASLocationAreaPokemonEncounterVersi.getExample();
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion3 = new OASLocationAreaPokemonEncounterVersi();
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion4 = new OASLocationAreaPokemonEncounterVersi();

        System.assert(locationAreaPokemonEncounterVersion1.equals(locationAreaPokemonEncounterVersion2));
        System.assert(locationAreaPokemonEncounterVersion2.equals(locationAreaPokemonEncounterVersion1));
        System.assert(locationAreaPokemonEncounterVersion3.equals(locationAreaPokemonEncounterVersion4));
        System.assert(locationAreaPokemonEncounterVersion4.equals(locationAreaPokemonEncounterVersion3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion1 = OASLocationAreaPokemonEncounterVersi.getExample();
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion2 = new OASLocationAreaPokemonEncounterVersi();

        System.assertEquals(false, locationAreaPokemonEncounterVersion1.equals('foo'));
        System.assertEquals(false, locationAreaPokemonEncounterVersion2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion1 = OASLocationAreaPokemonEncounterVersi.getExample();
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion2 = new OASLocationAreaPokemonEncounterVersi();
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion3;

        System.assertEquals(false, locationAreaPokemonEncounterVersion1.equals(locationAreaPokemonEncounterVersion3));
        System.assertEquals(false, locationAreaPokemonEncounterVersion2.equals(locationAreaPokemonEncounterVersion3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion1 = OASLocationAreaPokemonEncounterVersi.getExample();
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion2 = new OASLocationAreaPokemonEncounterVersi();

        System.assertEquals(locationAreaPokemonEncounterVersion1.hashCode(), locationAreaPokemonEncounterVersion1.hashCode());
        System.assertEquals(locationAreaPokemonEncounterVersion2.hashCode(), locationAreaPokemonEncounterVersion2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion1 = OASLocationAreaPokemonEncounterVersi.getExample();
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion2 = OASLocationAreaPokemonEncounterVersi.getExample();
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion3 = new OASLocationAreaPokemonEncounterVersi();
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion4 = new OASLocationAreaPokemonEncounterVersi();

        System.assert(locationAreaPokemonEncounterVersion1.equals(locationAreaPokemonEncounterVersion2));
        System.assert(locationAreaPokemonEncounterVersion3.equals(locationAreaPokemonEncounterVersion4));
        System.assertEquals(locationAreaPokemonEncounterVersion1.hashCode(), locationAreaPokemonEncounterVersion2.hashCode());
        System.assertEquals(locationAreaPokemonEncounterVersion3.hashCode(), locationAreaPokemonEncounterVersion4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion = new OASLocationAreaPokemonEncounterVersi();
        Map<String, String> x-property-mappings = locationAreaPokemonEncounterVersion.getx-property-mappings();
        System.assertEquals('maxChance', x-property-mappings.get('max_chance'));
        System.assertEquals('encounterDetails', x-property-mappings.get('encounter_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLocationAreaPokemonEncounterVersi locationAreaPokemonEncounterVersion = new OASLocationAreaPokemonEncounterVersi();
        System.assertEquals(new List<OASLocationAreaEncounterDetail>(), locationAreaPokemonEncounterVersion.encounterDetails);
        System.assertEquals(null, locationAreaPokemonEncounterVersion.version);
        System.assertEquals(null, locationAreaPokemonEncounterVersion.maxChance);
    }
}
