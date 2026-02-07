@isTest
private class OASEncounterConditionValueSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASEncounterConditionValueSummary encounterConditionValueSummary1 = OASEncounterConditionValueSummary.getExample();
        OASEncounterConditionValueSummary encounterConditionValueSummary2 = encounterConditionValueSummary1;
        OASEncounterConditionValueSummary encounterConditionValueSummary3 = new OASEncounterConditionValueSummary();
        OASEncounterConditionValueSummary encounterConditionValueSummary4 = encounterConditionValueSummary3;

        System.assert(encounterConditionValueSummary1.equals(encounterConditionValueSummary2));
        System.assert(encounterConditionValueSummary2.equals(encounterConditionValueSummary1));
        System.assert(encounterConditionValueSummary1.equals(encounterConditionValueSummary1));
        System.assert(encounterConditionValueSummary3.equals(encounterConditionValueSummary4));
        System.assert(encounterConditionValueSummary4.equals(encounterConditionValueSummary3));
        System.assert(encounterConditionValueSummary3.equals(encounterConditionValueSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEncounterConditionValueSummary encounterConditionValueSummary1 = OASEncounterConditionValueSummary.getExample();
        OASEncounterConditionValueSummary encounterConditionValueSummary2 = OASEncounterConditionValueSummary.getExample();
        OASEncounterConditionValueSummary encounterConditionValueSummary3 = new OASEncounterConditionValueSummary();
        OASEncounterConditionValueSummary encounterConditionValueSummary4 = new OASEncounterConditionValueSummary();

        System.assert(encounterConditionValueSummary1.equals(encounterConditionValueSummary2));
        System.assert(encounterConditionValueSummary2.equals(encounterConditionValueSummary1));
        System.assert(encounterConditionValueSummary3.equals(encounterConditionValueSummary4));
        System.assert(encounterConditionValueSummary4.equals(encounterConditionValueSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEncounterConditionValueSummary encounterConditionValueSummary1 = OASEncounterConditionValueSummary.getExample();
        OASEncounterConditionValueSummary encounterConditionValueSummary2 = new OASEncounterConditionValueSummary();

        System.assertEquals(false, encounterConditionValueSummary1.equals('foo'));
        System.assertEquals(false, encounterConditionValueSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEncounterConditionValueSummary encounterConditionValueSummary1 = OASEncounterConditionValueSummary.getExample();
        OASEncounterConditionValueSummary encounterConditionValueSummary2 = new OASEncounterConditionValueSummary();
        OASEncounterConditionValueSummary encounterConditionValueSummary3;

        System.assertEquals(false, encounterConditionValueSummary1.equals(encounterConditionValueSummary3));
        System.assertEquals(false, encounterConditionValueSummary2.equals(encounterConditionValueSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEncounterConditionValueSummary encounterConditionValueSummary1 = OASEncounterConditionValueSummary.getExample();
        OASEncounterConditionValueSummary encounterConditionValueSummary2 = new OASEncounterConditionValueSummary();

        System.assertEquals(encounterConditionValueSummary1.hashCode(), encounterConditionValueSummary1.hashCode());
        System.assertEquals(encounterConditionValueSummary2.hashCode(), encounterConditionValueSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEncounterConditionValueSummary encounterConditionValueSummary1 = OASEncounterConditionValueSummary.getExample();
        OASEncounterConditionValueSummary encounterConditionValueSummary2 = OASEncounterConditionValueSummary.getExample();
        OASEncounterConditionValueSummary encounterConditionValueSummary3 = new OASEncounterConditionValueSummary();
        OASEncounterConditionValueSummary encounterConditionValueSummary4 = new OASEncounterConditionValueSummary();

        System.assert(encounterConditionValueSummary1.equals(encounterConditionValueSummary2));
        System.assert(encounterConditionValueSummary3.equals(encounterConditionValueSummary4));
        System.assertEquals(encounterConditionValueSummary1.hashCode(), encounterConditionValueSummary2.hashCode());
        System.assertEquals(encounterConditionValueSummary3.hashCode(), encounterConditionValueSummary4.hashCode());
    }
}
