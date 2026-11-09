@isTest
private class OASLocationAreaEncounterVersionDetaiTest {
    @isTest
    private static void equalsSameInstance() {
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail1 = OASLocationAreaEncounterVersionDetai.getExample();
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail2 = locationAreaEncounterVersionDetail1;
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail3 = new OASLocationAreaEncounterVersionDetai();
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail4 = locationAreaEncounterVersionDetail3;

        System.assert(locationAreaEncounterVersionDetail1.equals(locationAreaEncounterVersionDetail2));
        System.assert(locationAreaEncounterVersionDetail2.equals(locationAreaEncounterVersionDetail1));
        System.assert(locationAreaEncounterVersionDetail1.equals(locationAreaEncounterVersionDetail1));
        System.assert(locationAreaEncounterVersionDetail3.equals(locationAreaEncounterVersionDetail4));
        System.assert(locationAreaEncounterVersionDetail4.equals(locationAreaEncounterVersionDetail3));
        System.assert(locationAreaEncounterVersionDetail3.equals(locationAreaEncounterVersionDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail1 = OASLocationAreaEncounterVersionDetai.getExample();
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail2 = OASLocationAreaEncounterVersionDetai.getExample();
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail3 = new OASLocationAreaEncounterVersionDetai();
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail4 = new OASLocationAreaEncounterVersionDetai();

        System.assert(locationAreaEncounterVersionDetail1.equals(locationAreaEncounterVersionDetail2));
        System.assert(locationAreaEncounterVersionDetail2.equals(locationAreaEncounterVersionDetail1));
        System.assert(locationAreaEncounterVersionDetail3.equals(locationAreaEncounterVersionDetail4));
        System.assert(locationAreaEncounterVersionDetail4.equals(locationAreaEncounterVersionDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail1 = OASLocationAreaEncounterVersionDetai.getExample();
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail2 = new OASLocationAreaEncounterVersionDetai();

        System.assertEquals(false, locationAreaEncounterVersionDetail1.equals('foo'));
        System.assertEquals(false, locationAreaEncounterVersionDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail1 = OASLocationAreaEncounterVersionDetai.getExample();
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail2 = new OASLocationAreaEncounterVersionDetai();
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail3;

        System.assertEquals(false, locationAreaEncounterVersionDetail1.equals(locationAreaEncounterVersionDetail3));
        System.assertEquals(false, locationAreaEncounterVersionDetail2.equals(locationAreaEncounterVersionDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail1 = OASLocationAreaEncounterVersionDetai.getExample();
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail2 = new OASLocationAreaEncounterVersionDetai();

        System.assertEquals(locationAreaEncounterVersionDetail1.hashCode(), locationAreaEncounterVersionDetail1.hashCode());
        System.assertEquals(locationAreaEncounterVersionDetail2.hashCode(), locationAreaEncounterVersionDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail1 = OASLocationAreaEncounterVersionDetai.getExample();
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail2 = OASLocationAreaEncounterVersionDetai.getExample();
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail3 = new OASLocationAreaEncounterVersionDetai();
        OASLocationAreaEncounterVersionDetai locationAreaEncounterVersionDetail4 = new OASLocationAreaEncounterVersionDetai();

        System.assert(locationAreaEncounterVersionDetail1.equals(locationAreaEncounterVersionDetail2));
        System.assert(locationAreaEncounterVersionDetail3.equals(locationAreaEncounterVersionDetail4));
        System.assertEquals(locationAreaEncounterVersionDetail1.hashCode(), locationAreaEncounterVersionDetail2.hashCode());
        System.assertEquals(locationAreaEncounterVersionDetail3.hashCode(), locationAreaEncounterVersionDetail4.hashCode());
    }
}
