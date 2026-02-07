@isTest
private class OASLocationAreaDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationAreaDetail locationAreaDetail1 = OASLocationAreaDetail.getExample();
        OASLocationAreaDetail locationAreaDetail2 = locationAreaDetail1;
        OASLocationAreaDetail locationAreaDetail3 = new OASLocationAreaDetail();
        OASLocationAreaDetail locationAreaDetail4 = locationAreaDetail3;

        System.assert(locationAreaDetail1.equals(locationAreaDetail2));
        System.assert(locationAreaDetail2.equals(locationAreaDetail1));
        System.assert(locationAreaDetail1.equals(locationAreaDetail1));
        System.assert(locationAreaDetail3.equals(locationAreaDetail4));
        System.assert(locationAreaDetail4.equals(locationAreaDetail3));
        System.assert(locationAreaDetail3.equals(locationAreaDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationAreaDetail locationAreaDetail1 = OASLocationAreaDetail.getExample();
        OASLocationAreaDetail locationAreaDetail2 = OASLocationAreaDetail.getExample();
        OASLocationAreaDetail locationAreaDetail3 = new OASLocationAreaDetail();
        OASLocationAreaDetail locationAreaDetail4 = new OASLocationAreaDetail();

        System.assert(locationAreaDetail1.equals(locationAreaDetail2));
        System.assert(locationAreaDetail2.equals(locationAreaDetail1));
        System.assert(locationAreaDetail3.equals(locationAreaDetail4));
        System.assert(locationAreaDetail4.equals(locationAreaDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationAreaDetail locationAreaDetail1 = OASLocationAreaDetail.getExample();
        OASLocationAreaDetail locationAreaDetail2 = new OASLocationAreaDetail();

        System.assertEquals(false, locationAreaDetail1.equals('foo'));
        System.assertEquals(false, locationAreaDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationAreaDetail locationAreaDetail1 = OASLocationAreaDetail.getExample();
        OASLocationAreaDetail locationAreaDetail2 = new OASLocationAreaDetail();
        OASLocationAreaDetail locationAreaDetail3;

        System.assertEquals(false, locationAreaDetail1.equals(locationAreaDetail3));
        System.assertEquals(false, locationAreaDetail2.equals(locationAreaDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationAreaDetail locationAreaDetail1 = OASLocationAreaDetail.getExample();
        OASLocationAreaDetail locationAreaDetail2 = new OASLocationAreaDetail();

        System.assertEquals(locationAreaDetail1.hashCode(), locationAreaDetail1.hashCode());
        System.assertEquals(locationAreaDetail2.hashCode(), locationAreaDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationAreaDetail locationAreaDetail1 = OASLocationAreaDetail.getExample();
        OASLocationAreaDetail locationAreaDetail2 = OASLocationAreaDetail.getExample();
        OASLocationAreaDetail locationAreaDetail3 = new OASLocationAreaDetail();
        OASLocationAreaDetail locationAreaDetail4 = new OASLocationAreaDetail();

        System.assert(locationAreaDetail1.equals(locationAreaDetail2));
        System.assert(locationAreaDetail3.equals(locationAreaDetail4));
        System.assertEquals(locationAreaDetail1.hashCode(), locationAreaDetail2.hashCode());
        System.assertEquals(locationAreaDetail3.hashCode(), locationAreaDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLocationAreaDetail locationAreaDetail = new OASLocationAreaDetail();
        Map<String, String> x-property-mappings = locationAreaDetail.getx-property-mappings();
        System.assertEquals('gameIndex', x-property-mappings.get('game_index'));
        System.assertEquals('encounterMethodRates', x-property-mappings.get('encounter_method_rates'));
        System.assertEquals('pokemonEncounters', x-property-mappings.get('pokemon_encounters'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLocationAreaDetail locationAreaDetail = new OASLocationAreaDetail();
        System.assertEquals(new List<OASLocationAreaDetailEncounterMethod>(), locationAreaDetail.encounterMethodRates);
        System.assertEquals(new List<OASLocationAreaName>(), locationAreaDetail.names);
        System.assertEquals(new List<OASLocationAreaDetailPokemonEncounte>(), locationAreaDetail.pokemonEncounters);
        System.assertEquals(null, locationAreaDetail.id);
        System.assertEquals(null, locationAreaDetail.name);
        System.assertEquals(null, locationAreaDetail.gameIndex);
        System.assertEquals(null, locationAreaDetail.location);
    }
}
