@isTest
private class OASEncounterConditionSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASEncounterConditionSummary encounterConditionSummary1 = OASEncounterConditionSummary.getExample();
        OASEncounterConditionSummary encounterConditionSummary2 = encounterConditionSummary1;
        OASEncounterConditionSummary encounterConditionSummary3 = new OASEncounterConditionSummary();
        OASEncounterConditionSummary encounterConditionSummary4 = encounterConditionSummary3;

        System.assert(encounterConditionSummary1.equals(encounterConditionSummary2));
        System.assert(encounterConditionSummary2.equals(encounterConditionSummary1));
        System.assert(encounterConditionSummary1.equals(encounterConditionSummary1));
        System.assert(encounterConditionSummary3.equals(encounterConditionSummary4));
        System.assert(encounterConditionSummary4.equals(encounterConditionSummary3));
        System.assert(encounterConditionSummary3.equals(encounterConditionSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEncounterConditionSummary encounterConditionSummary1 = OASEncounterConditionSummary.getExample();
        OASEncounterConditionSummary encounterConditionSummary2 = OASEncounterConditionSummary.getExample();
        OASEncounterConditionSummary encounterConditionSummary3 = new OASEncounterConditionSummary();
        OASEncounterConditionSummary encounterConditionSummary4 = new OASEncounterConditionSummary();

        System.assert(encounterConditionSummary1.equals(encounterConditionSummary2));
        System.assert(encounterConditionSummary2.equals(encounterConditionSummary1));
        System.assert(encounterConditionSummary3.equals(encounterConditionSummary4));
        System.assert(encounterConditionSummary4.equals(encounterConditionSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEncounterConditionSummary encounterConditionSummary1 = OASEncounterConditionSummary.getExample();
        OASEncounterConditionSummary encounterConditionSummary2 = new OASEncounterConditionSummary();

        System.assertEquals(false, encounterConditionSummary1.equals('foo'));
        System.assertEquals(false, encounterConditionSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEncounterConditionSummary encounterConditionSummary1 = OASEncounterConditionSummary.getExample();
        OASEncounterConditionSummary encounterConditionSummary2 = new OASEncounterConditionSummary();
        OASEncounterConditionSummary encounterConditionSummary3;

        System.assertEquals(false, encounterConditionSummary1.equals(encounterConditionSummary3));
        System.assertEquals(false, encounterConditionSummary2.equals(encounterConditionSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEncounterConditionSummary encounterConditionSummary1 = OASEncounterConditionSummary.getExample();
        OASEncounterConditionSummary encounterConditionSummary2 = new OASEncounterConditionSummary();

        System.assertEquals(encounterConditionSummary1.hashCode(), encounterConditionSummary1.hashCode());
        System.assertEquals(encounterConditionSummary2.hashCode(), encounterConditionSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEncounterConditionSummary encounterConditionSummary1 = OASEncounterConditionSummary.getExample();
        OASEncounterConditionSummary encounterConditionSummary2 = OASEncounterConditionSummary.getExample();
        OASEncounterConditionSummary encounterConditionSummary3 = new OASEncounterConditionSummary();
        OASEncounterConditionSummary encounterConditionSummary4 = new OASEncounterConditionSummary();

        System.assert(encounterConditionSummary1.equals(encounterConditionSummary2));
        System.assert(encounterConditionSummary3.equals(encounterConditionSummary4));
        System.assertEquals(encounterConditionSummary1.hashCode(), encounterConditionSummary2.hashCode());
        System.assertEquals(encounterConditionSummary3.hashCode(), encounterConditionSummary4.hashCode());
    }
}
