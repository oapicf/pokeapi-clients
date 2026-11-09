@isTest
private class OASCurrencyNameTest {
    @isTest
    private static void equalsSameInstance() {
        OASCurrencyName currencyName1 = OASCurrencyName.getExample();
        OASCurrencyName currencyName2 = currencyName1;
        OASCurrencyName currencyName3 = new OASCurrencyName();
        OASCurrencyName currencyName4 = currencyName3;

        System.assert(currencyName1.equals(currencyName2));
        System.assert(currencyName2.equals(currencyName1));
        System.assert(currencyName1.equals(currencyName1));
        System.assert(currencyName3.equals(currencyName4));
        System.assert(currencyName4.equals(currencyName3));
        System.assert(currencyName3.equals(currencyName3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCurrencyName currencyName1 = OASCurrencyName.getExample();
        OASCurrencyName currencyName2 = OASCurrencyName.getExample();
        OASCurrencyName currencyName3 = new OASCurrencyName();
        OASCurrencyName currencyName4 = new OASCurrencyName();

        System.assert(currencyName1.equals(currencyName2));
        System.assert(currencyName2.equals(currencyName1));
        System.assert(currencyName3.equals(currencyName4));
        System.assert(currencyName4.equals(currencyName3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCurrencyName currencyName1 = OASCurrencyName.getExample();
        OASCurrencyName currencyName2 = new OASCurrencyName();

        System.assertEquals(false, currencyName1.equals('foo'));
        System.assertEquals(false, currencyName2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCurrencyName currencyName1 = OASCurrencyName.getExample();
        OASCurrencyName currencyName2 = new OASCurrencyName();
        OASCurrencyName currencyName3;

        System.assertEquals(false, currencyName1.equals(currencyName3));
        System.assertEquals(false, currencyName2.equals(currencyName3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCurrencyName currencyName1 = OASCurrencyName.getExample();
        OASCurrencyName currencyName2 = new OASCurrencyName();

        System.assertEquals(currencyName1.hashCode(), currencyName1.hashCode());
        System.assertEquals(currencyName2.hashCode(), currencyName2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCurrencyName currencyName1 = OASCurrencyName.getExample();
        OASCurrencyName currencyName2 = OASCurrencyName.getExample();
        OASCurrencyName currencyName3 = new OASCurrencyName();
        OASCurrencyName currencyName4 = new OASCurrencyName();

        System.assert(currencyName1.equals(currencyName2));
        System.assert(currencyName3.equals(currencyName4));
        System.assertEquals(currencyName1.hashCode(), currencyName2.hashCode());
        System.assertEquals(currencyName3.hashCode(), currencyName4.hashCode());
    }
}
