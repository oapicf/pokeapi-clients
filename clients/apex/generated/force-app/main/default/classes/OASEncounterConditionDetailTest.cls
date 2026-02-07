@isTest
private class OASEncounterConditionDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASEncounterConditionDetail encounterConditionDetail1 = OASEncounterConditionDetail.getExample();
        OASEncounterConditionDetail encounterConditionDetail2 = encounterConditionDetail1;
        OASEncounterConditionDetail encounterConditionDetail3 = new OASEncounterConditionDetail();
        OASEncounterConditionDetail encounterConditionDetail4 = encounterConditionDetail3;

        System.assert(encounterConditionDetail1.equals(encounterConditionDetail2));
        System.assert(encounterConditionDetail2.equals(encounterConditionDetail1));
        System.assert(encounterConditionDetail1.equals(encounterConditionDetail1));
        System.assert(encounterConditionDetail3.equals(encounterConditionDetail4));
        System.assert(encounterConditionDetail4.equals(encounterConditionDetail3));
        System.assert(encounterConditionDetail3.equals(encounterConditionDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEncounterConditionDetail encounterConditionDetail1 = OASEncounterConditionDetail.getExample();
        OASEncounterConditionDetail encounterConditionDetail2 = OASEncounterConditionDetail.getExample();
        OASEncounterConditionDetail encounterConditionDetail3 = new OASEncounterConditionDetail();
        OASEncounterConditionDetail encounterConditionDetail4 = new OASEncounterConditionDetail();

        System.assert(encounterConditionDetail1.equals(encounterConditionDetail2));
        System.assert(encounterConditionDetail2.equals(encounterConditionDetail1));
        System.assert(encounterConditionDetail3.equals(encounterConditionDetail4));
        System.assert(encounterConditionDetail4.equals(encounterConditionDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEncounterConditionDetail encounterConditionDetail1 = OASEncounterConditionDetail.getExample();
        OASEncounterConditionDetail encounterConditionDetail2 = new OASEncounterConditionDetail();

        System.assertEquals(false, encounterConditionDetail1.equals('foo'));
        System.assertEquals(false, encounterConditionDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEncounterConditionDetail encounterConditionDetail1 = OASEncounterConditionDetail.getExample();
        OASEncounterConditionDetail encounterConditionDetail2 = new OASEncounterConditionDetail();
        OASEncounterConditionDetail encounterConditionDetail3;

        System.assertEquals(false, encounterConditionDetail1.equals(encounterConditionDetail3));
        System.assertEquals(false, encounterConditionDetail2.equals(encounterConditionDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEncounterConditionDetail encounterConditionDetail1 = OASEncounterConditionDetail.getExample();
        OASEncounterConditionDetail encounterConditionDetail2 = new OASEncounterConditionDetail();

        System.assertEquals(encounterConditionDetail1.hashCode(), encounterConditionDetail1.hashCode());
        System.assertEquals(encounterConditionDetail2.hashCode(), encounterConditionDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEncounterConditionDetail encounterConditionDetail1 = OASEncounterConditionDetail.getExample();
        OASEncounterConditionDetail encounterConditionDetail2 = OASEncounterConditionDetail.getExample();
        OASEncounterConditionDetail encounterConditionDetail3 = new OASEncounterConditionDetail();
        OASEncounterConditionDetail encounterConditionDetail4 = new OASEncounterConditionDetail();

        System.assert(encounterConditionDetail1.equals(encounterConditionDetail2));
        System.assert(encounterConditionDetail3.equals(encounterConditionDetail4));
        System.assertEquals(encounterConditionDetail1.hashCode(), encounterConditionDetail2.hashCode());
        System.assertEquals(encounterConditionDetail3.hashCode(), encounterConditionDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEncounterConditionDetail encounterConditionDetail = new OASEncounterConditionDetail();
        System.assertEquals(new List<OASEncounterConditionValueSummary>(), encounterConditionDetail.values);
        System.assertEquals(new List<OASEncounterConditionName>(), encounterConditionDetail.names);
        System.assertEquals(null, encounterConditionDetail.id);
        System.assertEquals(null, encounterConditionDetail.name);
    }
}
