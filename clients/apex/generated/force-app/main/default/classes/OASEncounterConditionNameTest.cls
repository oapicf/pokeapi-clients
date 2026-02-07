@isTest
private class OASEncounterConditionNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASEncounterConditionName encounterConditionName1 = OASEncounterConditionName.getExample();
        OASEncounterConditionName encounterConditionName2 = encounterConditionName1;
        OASEncounterConditionName encounterConditionName3 = new OASEncounterConditionName();
        OASEncounterConditionName encounterConditionName4 = encounterConditionName3;

        System.assert(encounterConditionName1.equals(encounterConditionName2));
        System.assert(encounterConditionName2.equals(encounterConditionName1));
        System.assert(encounterConditionName1.equals(encounterConditionName1));
        System.assert(encounterConditionName3.equals(encounterConditionName4));
        System.assert(encounterConditionName4.equals(encounterConditionName3));
        System.assert(encounterConditionName3.equals(encounterConditionName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEncounterConditionName encounterConditionName1 = OASEncounterConditionName.getExample();
        OASEncounterConditionName encounterConditionName2 = OASEncounterConditionName.getExample();
        OASEncounterConditionName encounterConditionName3 = new OASEncounterConditionName();
        OASEncounterConditionName encounterConditionName4 = new OASEncounterConditionName();

        System.assert(encounterConditionName1.equals(encounterConditionName2));
        System.assert(encounterConditionName2.equals(encounterConditionName1));
        System.assert(encounterConditionName3.equals(encounterConditionName4));
        System.assert(encounterConditionName4.equals(encounterConditionName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEncounterConditionName encounterConditionName1 = OASEncounterConditionName.getExample();
        OASEncounterConditionName encounterConditionName2 = new OASEncounterConditionName();

        System.assertEquals(false, encounterConditionName1.equals('foo'));
        System.assertEquals(false, encounterConditionName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEncounterConditionName encounterConditionName1 = OASEncounterConditionName.getExample();
        OASEncounterConditionName encounterConditionName2 = new OASEncounterConditionName();
        OASEncounterConditionName encounterConditionName3;

        System.assertEquals(false, encounterConditionName1.equals(encounterConditionName3));
        System.assertEquals(false, encounterConditionName2.equals(encounterConditionName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEncounterConditionName encounterConditionName1 = OASEncounterConditionName.getExample();
        OASEncounterConditionName encounterConditionName2 = new OASEncounterConditionName();

        System.assertEquals(encounterConditionName1.hashCode(), encounterConditionName1.hashCode());
        System.assertEquals(encounterConditionName2.hashCode(), encounterConditionName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEncounterConditionName encounterConditionName1 = OASEncounterConditionName.getExample();
        OASEncounterConditionName encounterConditionName2 = OASEncounterConditionName.getExample();
        OASEncounterConditionName encounterConditionName3 = new OASEncounterConditionName();
        OASEncounterConditionName encounterConditionName4 = new OASEncounterConditionName();

        System.assert(encounterConditionName1.equals(encounterConditionName2));
        System.assert(encounterConditionName3.equals(encounterConditionName4));
        System.assertEquals(encounterConditionName1.hashCode(), encounterConditionName2.hashCode());
        System.assertEquals(encounterConditionName3.hashCode(), encounterConditionName4.hashCode());
    }
}
