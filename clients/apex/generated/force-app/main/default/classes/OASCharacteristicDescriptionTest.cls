@isTest
private class OASCharacteristicDescriptionTest {
    @isTest
    private static void equalsSameInstance() {
        OASCharacteristicDescription characteristicDescription1 = OASCharacteristicDescription.getExample();
        OASCharacteristicDescription characteristicDescription2 = characteristicDescription1;
        OASCharacteristicDescription characteristicDescription3 = new OASCharacteristicDescription();
        OASCharacteristicDescription characteristicDescription4 = characteristicDescription3;

        System.assert(characteristicDescription1.equals(characteristicDescription2));
        System.assert(characteristicDescription2.equals(characteristicDescription1));
        System.assert(characteristicDescription1.equals(characteristicDescription1));
        System.assert(characteristicDescription3.equals(characteristicDescription4));
        System.assert(characteristicDescription4.equals(characteristicDescription3));
        System.assert(characteristicDescription3.equals(characteristicDescription3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCharacteristicDescription characteristicDescription1 = OASCharacteristicDescription.getExample();
        OASCharacteristicDescription characteristicDescription2 = OASCharacteristicDescription.getExample();
        OASCharacteristicDescription characteristicDescription3 = new OASCharacteristicDescription();
        OASCharacteristicDescription characteristicDescription4 = new OASCharacteristicDescription();

        System.assert(characteristicDescription1.equals(characteristicDescription2));
        System.assert(characteristicDescription2.equals(characteristicDescription1));
        System.assert(characteristicDescription3.equals(characteristicDescription4));
        System.assert(characteristicDescription4.equals(characteristicDescription3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCharacteristicDescription characteristicDescription1 = OASCharacteristicDescription.getExample();
        OASCharacteristicDescription characteristicDescription2 = new OASCharacteristicDescription();

        System.assertEquals(false, characteristicDescription1.equals('foo'));
        System.assertEquals(false, characteristicDescription2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCharacteristicDescription characteristicDescription1 = OASCharacteristicDescription.getExample();
        OASCharacteristicDescription characteristicDescription2 = new OASCharacteristicDescription();
        OASCharacteristicDescription characteristicDescription3;

        System.assertEquals(false, characteristicDescription1.equals(characteristicDescription3));
        System.assertEquals(false, characteristicDescription2.equals(characteristicDescription3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCharacteristicDescription characteristicDescription1 = OASCharacteristicDescription.getExample();
        OASCharacteristicDescription characteristicDescription2 = new OASCharacteristicDescription();

        System.assertEquals(characteristicDescription1.hashCode(), characteristicDescription1.hashCode());
        System.assertEquals(characteristicDescription2.hashCode(), characteristicDescription2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCharacteristicDescription characteristicDescription1 = OASCharacteristicDescription.getExample();
        OASCharacteristicDescription characteristicDescription2 = OASCharacteristicDescription.getExample();
        OASCharacteristicDescription characteristicDescription3 = new OASCharacteristicDescription();
        OASCharacteristicDescription characteristicDescription4 = new OASCharacteristicDescription();

        System.assert(characteristicDescription1.equals(characteristicDescription2));
        System.assert(characteristicDescription3.equals(characteristicDescription4));
        System.assertEquals(characteristicDescription1.hashCode(), characteristicDescription2.hashCode());
        System.assertEquals(characteristicDescription3.hashCode(), characteristicDescription4.hashCode());
    }
}
