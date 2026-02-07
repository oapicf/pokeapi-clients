@isTest
private class OASEncounterMethodSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASEncounterMethodSummary encounterMethodSummary1 = OASEncounterMethodSummary.getExample();
        OASEncounterMethodSummary encounterMethodSummary2 = encounterMethodSummary1;
        OASEncounterMethodSummary encounterMethodSummary3 = new OASEncounterMethodSummary();
        OASEncounterMethodSummary encounterMethodSummary4 = encounterMethodSummary3;

        System.assert(encounterMethodSummary1.equals(encounterMethodSummary2));
        System.assert(encounterMethodSummary2.equals(encounterMethodSummary1));
        System.assert(encounterMethodSummary1.equals(encounterMethodSummary1));
        System.assert(encounterMethodSummary3.equals(encounterMethodSummary4));
        System.assert(encounterMethodSummary4.equals(encounterMethodSummary3));
        System.assert(encounterMethodSummary3.equals(encounterMethodSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEncounterMethodSummary encounterMethodSummary1 = OASEncounterMethodSummary.getExample();
        OASEncounterMethodSummary encounterMethodSummary2 = OASEncounterMethodSummary.getExample();
        OASEncounterMethodSummary encounterMethodSummary3 = new OASEncounterMethodSummary();
        OASEncounterMethodSummary encounterMethodSummary4 = new OASEncounterMethodSummary();

        System.assert(encounterMethodSummary1.equals(encounterMethodSummary2));
        System.assert(encounterMethodSummary2.equals(encounterMethodSummary1));
        System.assert(encounterMethodSummary3.equals(encounterMethodSummary4));
        System.assert(encounterMethodSummary4.equals(encounterMethodSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEncounterMethodSummary encounterMethodSummary1 = OASEncounterMethodSummary.getExample();
        OASEncounterMethodSummary encounterMethodSummary2 = new OASEncounterMethodSummary();

        System.assertEquals(false, encounterMethodSummary1.equals('foo'));
        System.assertEquals(false, encounterMethodSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEncounterMethodSummary encounterMethodSummary1 = OASEncounterMethodSummary.getExample();
        OASEncounterMethodSummary encounterMethodSummary2 = new OASEncounterMethodSummary();
        OASEncounterMethodSummary encounterMethodSummary3;

        System.assertEquals(false, encounterMethodSummary1.equals(encounterMethodSummary3));
        System.assertEquals(false, encounterMethodSummary2.equals(encounterMethodSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEncounterMethodSummary encounterMethodSummary1 = OASEncounterMethodSummary.getExample();
        OASEncounterMethodSummary encounterMethodSummary2 = new OASEncounterMethodSummary();

        System.assertEquals(encounterMethodSummary1.hashCode(), encounterMethodSummary1.hashCode());
        System.assertEquals(encounterMethodSummary2.hashCode(), encounterMethodSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEncounterMethodSummary encounterMethodSummary1 = OASEncounterMethodSummary.getExample();
        OASEncounterMethodSummary encounterMethodSummary2 = OASEncounterMethodSummary.getExample();
        OASEncounterMethodSummary encounterMethodSummary3 = new OASEncounterMethodSummary();
        OASEncounterMethodSummary encounterMethodSummary4 = new OASEncounterMethodSummary();

        System.assert(encounterMethodSummary1.equals(encounterMethodSummary2));
        System.assert(encounterMethodSummary3.equals(encounterMethodSummary4));
        System.assertEquals(encounterMethodSummary1.hashCode(), encounterMethodSummary2.hashCode());
        System.assertEquals(encounterMethodSummary3.hashCode(), encounterMethodSummary4.hashCode());
    }
}
