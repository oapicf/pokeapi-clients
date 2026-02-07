@isTest
private class OASCharacteristicDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASCharacteristicDetail characteristicDetail1 = OASCharacteristicDetail.getExample();
        OASCharacteristicDetail characteristicDetail2 = characteristicDetail1;
        OASCharacteristicDetail characteristicDetail3 = new OASCharacteristicDetail();
        OASCharacteristicDetail characteristicDetail4 = characteristicDetail3;

        System.assert(characteristicDetail1.equals(characteristicDetail2));
        System.assert(characteristicDetail2.equals(characteristicDetail1));
        System.assert(characteristicDetail1.equals(characteristicDetail1));
        System.assert(characteristicDetail3.equals(characteristicDetail4));
        System.assert(characteristicDetail4.equals(characteristicDetail3));
        System.assert(characteristicDetail3.equals(characteristicDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCharacteristicDetail characteristicDetail1 = OASCharacteristicDetail.getExample();
        OASCharacteristicDetail characteristicDetail2 = OASCharacteristicDetail.getExample();
        OASCharacteristicDetail characteristicDetail3 = new OASCharacteristicDetail();
        OASCharacteristicDetail characteristicDetail4 = new OASCharacteristicDetail();

        System.assert(characteristicDetail1.equals(characteristicDetail2));
        System.assert(characteristicDetail2.equals(characteristicDetail1));
        System.assert(characteristicDetail3.equals(characteristicDetail4));
        System.assert(characteristicDetail4.equals(characteristicDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCharacteristicDetail characteristicDetail1 = OASCharacteristicDetail.getExample();
        OASCharacteristicDetail characteristicDetail2 = new OASCharacteristicDetail();

        System.assertEquals(false, characteristicDetail1.equals('foo'));
        System.assertEquals(false, characteristicDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCharacteristicDetail characteristicDetail1 = OASCharacteristicDetail.getExample();
        OASCharacteristicDetail characteristicDetail2 = new OASCharacteristicDetail();
        OASCharacteristicDetail characteristicDetail3;

        System.assertEquals(false, characteristicDetail1.equals(characteristicDetail3));
        System.assertEquals(false, characteristicDetail2.equals(characteristicDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCharacteristicDetail characteristicDetail1 = OASCharacteristicDetail.getExample();
        OASCharacteristicDetail characteristicDetail2 = new OASCharacteristicDetail();

        System.assertEquals(characteristicDetail1.hashCode(), characteristicDetail1.hashCode());
        System.assertEquals(characteristicDetail2.hashCode(), characteristicDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCharacteristicDetail characteristicDetail1 = OASCharacteristicDetail.getExample();
        OASCharacteristicDetail characteristicDetail2 = OASCharacteristicDetail.getExample();
        OASCharacteristicDetail characteristicDetail3 = new OASCharacteristicDetail();
        OASCharacteristicDetail characteristicDetail4 = new OASCharacteristicDetail();

        System.assert(characteristicDetail1.equals(characteristicDetail2));
        System.assert(characteristicDetail3.equals(characteristicDetail4));
        System.assertEquals(characteristicDetail1.hashCode(), characteristicDetail2.hashCode());
        System.assertEquals(characteristicDetail3.hashCode(), characteristicDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASCharacteristicDetail characteristicDetail = new OASCharacteristicDetail();
        Map<String, String> x-property-mappings = characteristicDetail.getx-property-mappings();
        System.assertEquals('geneModulo', x-property-mappings.get('gene_modulo'));
        System.assertEquals('possibleValues', x-property-mappings.get('possible_values'));
        System.assertEquals('highestStat', x-property-mappings.get('highest_stat'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCharacteristicDetail characteristicDetail = new OASCharacteristicDetail();
        System.assertEquals(new List<Integer>(), characteristicDetail.possibleValues);
        System.assertEquals(new List<OASCharacteristicDescription>(), characteristicDetail.descriptions);
        System.assertEquals(null, characteristicDetail.id);
        System.assertEquals(null, characteristicDetail.geneModulo);
        System.assertEquals(null, characteristicDetail.highestStat);
    }
}
