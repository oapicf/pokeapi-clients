@isTest
private class OASLocationDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationDetail locationDetail1 = OASLocationDetail.getExample();
        OASLocationDetail locationDetail2 = locationDetail1;
        OASLocationDetail locationDetail3 = new OASLocationDetail();
        OASLocationDetail locationDetail4 = locationDetail3;

        System.assert(locationDetail1.equals(locationDetail2));
        System.assert(locationDetail2.equals(locationDetail1));
        System.assert(locationDetail1.equals(locationDetail1));
        System.assert(locationDetail3.equals(locationDetail4));
        System.assert(locationDetail4.equals(locationDetail3));
        System.assert(locationDetail3.equals(locationDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationDetail locationDetail1 = OASLocationDetail.getExample();
        OASLocationDetail locationDetail2 = OASLocationDetail.getExample();
        OASLocationDetail locationDetail3 = new OASLocationDetail();
        OASLocationDetail locationDetail4 = new OASLocationDetail();

        System.assert(locationDetail1.equals(locationDetail2));
        System.assert(locationDetail2.equals(locationDetail1));
        System.assert(locationDetail3.equals(locationDetail4));
        System.assert(locationDetail4.equals(locationDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationDetail locationDetail1 = OASLocationDetail.getExample();
        OASLocationDetail locationDetail2 = new OASLocationDetail();

        System.assertEquals(false, locationDetail1.equals('foo'));
        System.assertEquals(false, locationDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationDetail locationDetail1 = OASLocationDetail.getExample();
        OASLocationDetail locationDetail2 = new OASLocationDetail();
        OASLocationDetail locationDetail3;

        System.assertEquals(false, locationDetail1.equals(locationDetail3));
        System.assertEquals(false, locationDetail2.equals(locationDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationDetail locationDetail1 = OASLocationDetail.getExample();
        OASLocationDetail locationDetail2 = new OASLocationDetail();

        System.assertEquals(locationDetail1.hashCode(), locationDetail1.hashCode());
        System.assertEquals(locationDetail2.hashCode(), locationDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationDetail locationDetail1 = OASLocationDetail.getExample();
        OASLocationDetail locationDetail2 = OASLocationDetail.getExample();
        OASLocationDetail locationDetail3 = new OASLocationDetail();
        OASLocationDetail locationDetail4 = new OASLocationDetail();

        System.assert(locationDetail1.equals(locationDetail2));
        System.assert(locationDetail3.equals(locationDetail4));
        System.assertEquals(locationDetail1.hashCode(), locationDetail2.hashCode());
        System.assertEquals(locationDetail3.hashCode(), locationDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASLocationDetail locationDetail = new OASLocationDetail();
        Map<String, String> x-property-mappings = locationDetail.getx-property-mappings();
        System.assertEquals('gameIndices', x-property-mappings.get('game_indices'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASLocationDetail locationDetail = new OASLocationDetail();
        System.assertEquals(new List<OASLocationName>(), locationDetail.names);
        System.assertEquals(new List<OASLocationGameIndex>(), locationDetail.gameIndices);
        System.assertEquals(new List<OASLocationAreaSummary>(), locationDetail.areas);
        System.assertEquals(null, locationDetail.id);
        System.assertEquals(null, locationDetail.name);
        System.assertEquals(null, locationDetail.region);
    }
}
