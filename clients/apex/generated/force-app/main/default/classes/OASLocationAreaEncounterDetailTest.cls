@isTest
private class OASLocationAreaEncounterDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationAreaEncounterDetail locationAreaEncounterDetail1 = OASLocationAreaEncounterDetail.getExample();
        OASLocationAreaEncounterDetail locationAreaEncounterDetail2 = locationAreaEncounterDetail1;
        OASLocationAreaEncounterDetail locationAreaEncounterDetail3 = new OASLocationAreaEncounterDetail();
        OASLocationAreaEncounterDetail locationAreaEncounterDetail4 = locationAreaEncounterDetail3;

        System.assert(locationAreaEncounterDetail1.equals(locationAreaEncounterDetail2));
        System.assert(locationAreaEncounterDetail2.equals(locationAreaEncounterDetail1));
        System.assert(locationAreaEncounterDetail1.equals(locationAreaEncounterDetail1));
        System.assert(locationAreaEncounterDetail3.equals(locationAreaEncounterDetail4));
        System.assert(locationAreaEncounterDetail4.equals(locationAreaEncounterDetail3));
        System.assert(locationAreaEncounterDetail3.equals(locationAreaEncounterDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationAreaEncounterDetail locationAreaEncounterDetail1 = OASLocationAreaEncounterDetail.getExample();
        OASLocationAreaEncounterDetail locationAreaEncounterDetail2 = OASLocationAreaEncounterDetail.getExample();
        OASLocationAreaEncounterDetail locationAreaEncounterDetail3 = new OASLocationAreaEncounterDetail();
        OASLocationAreaEncounterDetail locationAreaEncounterDetail4 = new OASLocationAreaEncounterDetail();

        System.assert(locationAreaEncounterDetail1.equals(locationAreaEncounterDetail2));
        System.assert(locationAreaEncounterDetail2.equals(locationAreaEncounterDetail1));
        System.assert(locationAreaEncounterDetail3.equals(locationAreaEncounterDetail4));
        System.assert(locationAreaEncounterDetail4.equals(locationAreaEncounterDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationAreaEncounterDetail locationAreaEncounterDetail1 = OASLocationAreaEncounterDetail.getExample();
        OASLocationAreaEncounterDetail locationAreaEncounterDetail2 = new OASLocationAreaEncounterDetail();

        System.assertEquals(false, locationAreaEncounterDetail1.equals('foo'));
        System.assertEquals(false, locationAreaEncounterDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationAreaEncounterDetail locationAreaEncounterDetail1 = OASLocationAreaEncounterDetail.getExample();
        OASLocationAreaEncounterDetail locationAreaEncounterDetail2 = new OASLocationAreaEncounterDetail();
        OASLocationAreaEncounterDetail locationAreaEncounterDetail3;

        System.assertEquals(false, locationAreaEncounterDetail1.equals(locationAreaEncounterDetail3));
        System.assertEquals(false, locationAreaEncounterDetail2.equals(locationAreaEncounterDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationAreaEncounterDetail locationAreaEncounterDetail1 = OASLocationAreaEncounterDetail.getExample();
        OASLocationAreaEncounterDetail locationAreaEncounterDetail2 = new OASLocationAreaEncounterDetail();

        System.assertEquals(locationAreaEncounterDetail1.hashCode(), locationAreaEncounterDetail1.hashCode());
        System.assertEquals(locationAreaEncounterDetail2.hashCode(), locationAreaEncounterDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationAreaEncounterDetail locationAreaEncounterDetail1 = OASLocationAreaEncounterDetail.getExample();
        OASLocationAreaEncounterDetail locationAreaEncounterDetail2 = OASLocationAreaEncounterDetail.getExample();
        OASLocationAreaEncounterDetail locationAreaEncounterDetail3 = new OASLocationAreaEncounterDetail();
        OASLocationAreaEncounterDetail locationAreaEncounterDetail4 = new OASLocationAreaEncounterDetail();

        System.assert(locationAreaEncounterDetail1.equals(locationAreaEncounterDetail2));
        System.assert(locationAreaEncounterDetail3.equals(locationAreaEncounterDetail4));
        System.assertEquals(locationAreaEncounterDetail1.hashCode(), locationAreaEncounterDetail2.hashCode());
        System.assertEquals(locationAreaEncounterDetail3.hashCode(), locationAreaEncounterDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLocationAreaEncounterDetail locationAreaEncounterDetail = new OASLocationAreaEncounterDetail();
        Map<String, String> x-property-mappings = locationAreaEncounterDetail.getx-property-mappings();
        System.assertEquals('minLevel', x-property-mappings.get('min_level'));
        System.assertEquals('maxLevel', x-property-mappings.get('max_level'));
        System.assertEquals('conditionValues', x-property-mappings.get('condition_values'));
        System.assertEquals('pokemonDetails', x-property-mappings.get('pokemon_details'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLocationAreaEncounterDetail locationAreaEncounterDetail = new OASLocationAreaEncounterDetail();
        System.assertEquals(0, locationAreaEncounterDetail.chance);
        System.assertEquals(new List<OASEncounterConditionValueSummary>(), locationAreaEncounterDetail.conditionValues);
        System.assertEquals(null, locationAreaEncounterDetail.minLevel);
        System.assertEquals(null, locationAreaEncounterDetail.maxLevel);
        System.assertEquals(null, locationAreaEncounterDetail.method);
        System.assertEquals(null, locationAreaEncounterDetail.pokemonDetails);
    }
}
