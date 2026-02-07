@isTest
private class OASEncounterMethodDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASEncounterMethodDetail encounterMethodDetail1 = OASEncounterMethodDetail.getExample();
        OASEncounterMethodDetail encounterMethodDetail2 = encounterMethodDetail1;
        OASEncounterMethodDetail encounterMethodDetail3 = new OASEncounterMethodDetail();
        OASEncounterMethodDetail encounterMethodDetail4 = encounterMethodDetail3;

        System.assert(encounterMethodDetail1.equals(encounterMethodDetail2));
        System.assert(encounterMethodDetail2.equals(encounterMethodDetail1));
        System.assert(encounterMethodDetail1.equals(encounterMethodDetail1));
        System.assert(encounterMethodDetail3.equals(encounterMethodDetail4));
        System.assert(encounterMethodDetail4.equals(encounterMethodDetail3));
        System.assert(encounterMethodDetail3.equals(encounterMethodDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEncounterMethodDetail encounterMethodDetail1 = OASEncounterMethodDetail.getExample();
        OASEncounterMethodDetail encounterMethodDetail2 = OASEncounterMethodDetail.getExample();
        OASEncounterMethodDetail encounterMethodDetail3 = new OASEncounterMethodDetail();
        OASEncounterMethodDetail encounterMethodDetail4 = new OASEncounterMethodDetail();

        System.assert(encounterMethodDetail1.equals(encounterMethodDetail2));
        System.assert(encounterMethodDetail2.equals(encounterMethodDetail1));
        System.assert(encounterMethodDetail3.equals(encounterMethodDetail4));
        System.assert(encounterMethodDetail4.equals(encounterMethodDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEncounterMethodDetail encounterMethodDetail1 = OASEncounterMethodDetail.getExample();
        OASEncounterMethodDetail encounterMethodDetail2 = new OASEncounterMethodDetail();

        System.assertEquals(false, encounterMethodDetail1.equals('foo'));
        System.assertEquals(false, encounterMethodDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEncounterMethodDetail encounterMethodDetail1 = OASEncounterMethodDetail.getExample();
        OASEncounterMethodDetail encounterMethodDetail2 = new OASEncounterMethodDetail();
        OASEncounterMethodDetail encounterMethodDetail3;

        System.assertEquals(false, encounterMethodDetail1.equals(encounterMethodDetail3));
        System.assertEquals(false, encounterMethodDetail2.equals(encounterMethodDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEncounterMethodDetail encounterMethodDetail1 = OASEncounterMethodDetail.getExample();
        OASEncounterMethodDetail encounterMethodDetail2 = new OASEncounterMethodDetail();

        System.assertEquals(encounterMethodDetail1.hashCode(), encounterMethodDetail1.hashCode());
        System.assertEquals(encounterMethodDetail2.hashCode(), encounterMethodDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEncounterMethodDetail encounterMethodDetail1 = OASEncounterMethodDetail.getExample();
        OASEncounterMethodDetail encounterMethodDetail2 = OASEncounterMethodDetail.getExample();
        OASEncounterMethodDetail encounterMethodDetail3 = new OASEncounterMethodDetail();
        OASEncounterMethodDetail encounterMethodDetail4 = new OASEncounterMethodDetail();

        System.assert(encounterMethodDetail1.equals(encounterMethodDetail2));
        System.assert(encounterMethodDetail3.equals(encounterMethodDetail4));
        System.assertEquals(encounterMethodDetail1.hashCode(), encounterMethodDetail2.hashCode());
        System.assertEquals(encounterMethodDetail3.hashCode(), encounterMethodDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEncounterMethodDetail encounterMethodDetail = new OASEncounterMethodDetail();
        System.assertEquals(new List<OASEncounterMethodName>(), encounterMethodDetail.names);
        System.assertEquals(null, encounterMethodDetail.id);
        System.assertEquals(null, encounterMethodDetail.name);
        System.assertEquals(null, encounterMethodDetail.order);
    }
}
