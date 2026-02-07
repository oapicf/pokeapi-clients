@isTest
private class OASCharacteristicSummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASCharacteristicSummary characteristicSummary1 = OASCharacteristicSummary.getExample();
        OASCharacteristicSummary characteristicSummary2 = characteristicSummary1;
        OASCharacteristicSummary characteristicSummary3 = new OASCharacteristicSummary();
        OASCharacteristicSummary characteristicSummary4 = characteristicSummary3;

        System.assert(characteristicSummary1.equals(characteristicSummary2));
        System.assert(characteristicSummary2.equals(characteristicSummary1));
        System.assert(characteristicSummary1.equals(characteristicSummary1));
        System.assert(characteristicSummary3.equals(characteristicSummary4));
        System.assert(characteristicSummary4.equals(characteristicSummary3));
        System.assert(characteristicSummary3.equals(characteristicSummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCharacteristicSummary characteristicSummary1 = OASCharacteristicSummary.getExample();
        OASCharacteristicSummary characteristicSummary2 = OASCharacteristicSummary.getExample();
        OASCharacteristicSummary characteristicSummary3 = new OASCharacteristicSummary();
        OASCharacteristicSummary characteristicSummary4 = new OASCharacteristicSummary();

        System.assert(characteristicSummary1.equals(characteristicSummary2));
        System.assert(characteristicSummary2.equals(characteristicSummary1));
        System.assert(characteristicSummary3.equals(characteristicSummary4));
        System.assert(characteristicSummary4.equals(characteristicSummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCharacteristicSummary characteristicSummary1 = OASCharacteristicSummary.getExample();
        OASCharacteristicSummary characteristicSummary2 = new OASCharacteristicSummary();

        System.assertEquals(false, characteristicSummary1.equals('foo'));
        System.assertEquals(false, characteristicSummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCharacteristicSummary characteristicSummary1 = OASCharacteristicSummary.getExample();
        OASCharacteristicSummary characteristicSummary2 = new OASCharacteristicSummary();
        OASCharacteristicSummary characteristicSummary3;

        System.assertEquals(false, characteristicSummary1.equals(characteristicSummary3));
        System.assertEquals(false, characteristicSummary2.equals(characteristicSummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCharacteristicSummary characteristicSummary1 = OASCharacteristicSummary.getExample();
        OASCharacteristicSummary characteristicSummary2 = new OASCharacteristicSummary();

        System.assertEquals(characteristicSummary1.hashCode(), characteristicSummary1.hashCode());
        System.assertEquals(characteristicSummary2.hashCode(), characteristicSummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCharacteristicSummary characteristicSummary1 = OASCharacteristicSummary.getExample();
        OASCharacteristicSummary characteristicSummary2 = OASCharacteristicSummary.getExample();
        OASCharacteristicSummary characteristicSummary3 = new OASCharacteristicSummary();
        OASCharacteristicSummary characteristicSummary4 = new OASCharacteristicSummary();

        System.assert(characteristicSummary1.equals(characteristicSummary2));
        System.assert(characteristicSummary3.equals(characteristicSummary4));
        System.assertEquals(characteristicSummary1.hashCode(), characteristicSummary2.hashCode());
        System.assertEquals(characteristicSummary3.hashCode(), characteristicSummary4.hashCode());
    }
}
