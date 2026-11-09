@isTest
private class OASCurrencyDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASCurrencyDetail currencyDetail1 = OASCurrencyDetail.getExample();
        OASCurrencyDetail currencyDetail2 = currencyDetail1;
        OASCurrencyDetail currencyDetail3 = new OASCurrencyDetail();
        OASCurrencyDetail currencyDetail4 = currencyDetail3;

        System.assert(currencyDetail1.equals(currencyDetail2));
        System.assert(currencyDetail2.equals(currencyDetail1));
        System.assert(currencyDetail1.equals(currencyDetail1));
        System.assert(currencyDetail3.equals(currencyDetail4));
        System.assert(currencyDetail4.equals(currencyDetail3));
        System.assert(currencyDetail3.equals(currencyDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCurrencyDetail currencyDetail1 = OASCurrencyDetail.getExample();
        OASCurrencyDetail currencyDetail2 = OASCurrencyDetail.getExample();
        OASCurrencyDetail currencyDetail3 = new OASCurrencyDetail();
        OASCurrencyDetail currencyDetail4 = new OASCurrencyDetail();

        System.assert(currencyDetail1.equals(currencyDetail2));
        System.assert(currencyDetail2.equals(currencyDetail1));
        System.assert(currencyDetail3.equals(currencyDetail4));
        System.assert(currencyDetail4.equals(currencyDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCurrencyDetail currencyDetail1 = OASCurrencyDetail.getExample();
        OASCurrencyDetail currencyDetail2 = new OASCurrencyDetail();

        System.assertEquals(false, currencyDetail1.equals('foo'));
        System.assertEquals(false, currencyDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCurrencyDetail currencyDetail1 = OASCurrencyDetail.getExample();
        OASCurrencyDetail currencyDetail2 = new OASCurrencyDetail();
        OASCurrencyDetail currencyDetail3;

        System.assertEquals(false, currencyDetail1.equals(currencyDetail3));
        System.assertEquals(false, currencyDetail2.equals(currencyDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCurrencyDetail currencyDetail1 = OASCurrencyDetail.getExample();
        OASCurrencyDetail currencyDetail2 = new OASCurrencyDetail();

        System.assertEquals(currencyDetail1.hashCode(), currencyDetail1.hashCode());
        System.assertEquals(currencyDetail2.hashCode(), currencyDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCurrencyDetail currencyDetail1 = OASCurrencyDetail.getExample();
        OASCurrencyDetail currencyDetail2 = OASCurrencyDetail.getExample();
        OASCurrencyDetail currencyDetail3 = new OASCurrencyDetail();
        OASCurrencyDetail currencyDetail4 = new OASCurrencyDetail();

        System.assert(currencyDetail1.equals(currencyDetail2));
        System.assert(currencyDetail3.equals(currencyDetail4));
        System.assertEquals(currencyDetail1.hashCode(), currencyDetail2.hashCode());
        System.assertEquals(currencyDetail3.hashCode(), currencyDetail4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASCurrencyDetail currencyDetail = new OASCurrencyDetail();
        System.assertEquals(new List<OASCurrencyName>(), currencyDetail.names);
        System.assertEquals(null, currencyDetail.id);
        System.assertEquals(null, currencyDetail.name);
    }
}
