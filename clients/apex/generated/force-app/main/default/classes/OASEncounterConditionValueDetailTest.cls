@isTest
private class OASEncounterConditionValueDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASEncounterConditionValueDetail encounterConditionValueDetail1 = OASEncounterConditionValueDetail.getExample();
        OASEncounterConditionValueDetail encounterConditionValueDetail2 = encounterConditionValueDetail1;
        OASEncounterConditionValueDetail encounterConditionValueDetail3 = new OASEncounterConditionValueDetail();
        OASEncounterConditionValueDetail encounterConditionValueDetail4 = encounterConditionValueDetail3;

        System.assert(encounterConditionValueDetail1.equals(encounterConditionValueDetail2));
        System.assert(encounterConditionValueDetail2.equals(encounterConditionValueDetail1));
        System.assert(encounterConditionValueDetail1.equals(encounterConditionValueDetail1));
        System.assert(encounterConditionValueDetail3.equals(encounterConditionValueDetail4));
        System.assert(encounterConditionValueDetail4.equals(encounterConditionValueDetail3));
        System.assert(encounterConditionValueDetail3.equals(encounterConditionValueDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEncounterConditionValueDetail encounterConditionValueDetail1 = OASEncounterConditionValueDetail.getExample();
        OASEncounterConditionValueDetail encounterConditionValueDetail2 = OASEncounterConditionValueDetail.getExample();
        OASEncounterConditionValueDetail encounterConditionValueDetail3 = new OASEncounterConditionValueDetail();
        OASEncounterConditionValueDetail encounterConditionValueDetail4 = new OASEncounterConditionValueDetail();

        System.assert(encounterConditionValueDetail1.equals(encounterConditionValueDetail2));
        System.assert(encounterConditionValueDetail2.equals(encounterConditionValueDetail1));
        System.assert(encounterConditionValueDetail3.equals(encounterConditionValueDetail4));
        System.assert(encounterConditionValueDetail4.equals(encounterConditionValueDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEncounterConditionValueDetail encounterConditionValueDetail1 = OASEncounterConditionValueDetail.getExample();
        OASEncounterConditionValueDetail encounterConditionValueDetail2 = new OASEncounterConditionValueDetail();

        System.assertEquals(false, encounterConditionValueDetail1.equals('foo'));
        System.assertEquals(false, encounterConditionValueDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEncounterConditionValueDetail encounterConditionValueDetail1 = OASEncounterConditionValueDetail.getExample();
        OASEncounterConditionValueDetail encounterConditionValueDetail2 = new OASEncounterConditionValueDetail();
        OASEncounterConditionValueDetail encounterConditionValueDetail3;

        System.assertEquals(false, encounterConditionValueDetail1.equals(encounterConditionValueDetail3));
        System.assertEquals(false, encounterConditionValueDetail2.equals(encounterConditionValueDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEncounterConditionValueDetail encounterConditionValueDetail1 = OASEncounterConditionValueDetail.getExample();
        OASEncounterConditionValueDetail encounterConditionValueDetail2 = new OASEncounterConditionValueDetail();

        System.assertEquals(encounterConditionValueDetail1.hashCode(), encounterConditionValueDetail1.hashCode());
        System.assertEquals(encounterConditionValueDetail2.hashCode(), encounterConditionValueDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEncounterConditionValueDetail encounterConditionValueDetail1 = OASEncounterConditionValueDetail.getExample();
        OASEncounterConditionValueDetail encounterConditionValueDetail2 = OASEncounterConditionValueDetail.getExample();
        OASEncounterConditionValueDetail encounterConditionValueDetail3 = new OASEncounterConditionValueDetail();
        OASEncounterConditionValueDetail encounterConditionValueDetail4 = new OASEncounterConditionValueDetail();

        System.assert(encounterConditionValueDetail1.equals(encounterConditionValueDetail2));
        System.assert(encounterConditionValueDetail3.equals(encounterConditionValueDetail4));
        System.assertEquals(encounterConditionValueDetail1.hashCode(), encounterConditionValueDetail2.hashCode());
        System.assertEquals(encounterConditionValueDetail3.hashCode(), encounterConditionValueDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEncounterConditionValueDetail encounterConditionValueDetail = new OASEncounterConditionValueDetail();
        System.assertEquals(new List<OASEncounterConditionValueName>(), encounterConditionValueDetail.names);
        System.assertEquals(null, encounterConditionValueDetail.id);
        System.assertEquals(null, encounterConditionValueDetail.name);
        System.assertEquals(null, encounterConditionValueDetail.condition);
    }
}
