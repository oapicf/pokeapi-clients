@isTest
private class OASCurrencySummaryTest {
    @isTest
    private static void equalsSameInstance() {
        OASCurrencySummary currencySummary1 = OASCurrencySummary.getExample();
        OASCurrencySummary currencySummary2 = currencySummary1;
        OASCurrencySummary currencySummary3 = new OASCurrencySummary();
        OASCurrencySummary currencySummary4 = currencySummary3;

        System.assert(currencySummary1.equals(currencySummary2));
        System.assert(currencySummary2.equals(currencySummary1));
        System.assert(currencySummary1.equals(currencySummary1));
        System.assert(currencySummary3.equals(currencySummary4));
        System.assert(currencySummary4.equals(currencySummary3));
        System.assert(currencySummary3.equals(currencySummary3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASCurrencySummary currencySummary1 = OASCurrencySummary.getExample();
        OASCurrencySummary currencySummary2 = OASCurrencySummary.getExample();
        OASCurrencySummary currencySummary3 = new OASCurrencySummary();
        OASCurrencySummary currencySummary4 = new OASCurrencySummary();

        System.assert(currencySummary1.equals(currencySummary2));
        System.assert(currencySummary2.equals(currencySummary1));
        System.assert(currencySummary3.equals(currencySummary4));
        System.assert(currencySummary4.equals(currencySummary3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASCurrencySummary currencySummary1 = OASCurrencySummary.getExample();
        OASCurrencySummary currencySummary2 = new OASCurrencySummary();

        System.assertEquals(false, currencySummary1.equals('foo'));
        System.assertEquals(false, currencySummary2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASCurrencySummary currencySummary1 = OASCurrencySummary.getExample();
        OASCurrencySummary currencySummary2 = new OASCurrencySummary();
        OASCurrencySummary currencySummary3;

        System.assertEquals(false, currencySummary1.equals(currencySummary3));
        System.assertEquals(false, currencySummary2.equals(currencySummary3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASCurrencySummary currencySummary1 = OASCurrencySummary.getExample();
        OASCurrencySummary currencySummary2 = new OASCurrencySummary();

        System.assertEquals(currencySummary1.hashCode(), currencySummary1.hashCode());
        System.assertEquals(currencySummary2.hashCode(), currencySummary2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASCurrencySummary currencySummary1 = OASCurrencySummary.getExample();
        OASCurrencySummary currencySummary2 = OASCurrencySummary.getExample();
        OASCurrencySummary currencySummary3 = new OASCurrencySummary();
        OASCurrencySummary currencySummary4 = new OASCurrencySummary();

        System.assert(currencySummary1.equals(currencySummary2));
        System.assert(currencySummary3.equals(currencySummary4));
        System.assertEquals(currencySummary1.hashCode(), currencySummary2.hashCode());
        System.assertEquals(currencySummary3.hashCode(), currencySummary4.hashCode());
    }
}
