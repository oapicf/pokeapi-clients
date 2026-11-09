@isTest
private class OASPaginatedCurrencySummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList1 = OASPaginatedCurrencySummaryList.getExample();
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList2 = paginatedCurrencySummaryList1;
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList3 = new OASPaginatedCurrencySummaryList();
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList4 = paginatedCurrencySummaryList3;

        System.assert(paginatedCurrencySummaryList1.equals(paginatedCurrencySummaryList2));
        System.assert(paginatedCurrencySummaryList2.equals(paginatedCurrencySummaryList1));
        System.assert(paginatedCurrencySummaryList1.equals(paginatedCurrencySummaryList1));
        System.assert(paginatedCurrencySummaryList3.equals(paginatedCurrencySummaryList4));
        System.assert(paginatedCurrencySummaryList4.equals(paginatedCurrencySummaryList3));
        System.assert(paginatedCurrencySummaryList3.equals(paginatedCurrencySummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList1 = OASPaginatedCurrencySummaryList.getExample();
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList2 = OASPaginatedCurrencySummaryList.getExample();
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList3 = new OASPaginatedCurrencySummaryList();
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList4 = new OASPaginatedCurrencySummaryList();

        System.assert(paginatedCurrencySummaryList1.equals(paginatedCurrencySummaryList2));
        System.assert(paginatedCurrencySummaryList2.equals(paginatedCurrencySummaryList1));
        System.assert(paginatedCurrencySummaryList3.equals(paginatedCurrencySummaryList4));
        System.assert(paginatedCurrencySummaryList4.equals(paginatedCurrencySummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList1 = OASPaginatedCurrencySummaryList.getExample();
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList2 = new OASPaginatedCurrencySummaryList();

        System.assertEquals(false, paginatedCurrencySummaryList1.equals('foo'));
        System.assertEquals(false, paginatedCurrencySummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList1 = OASPaginatedCurrencySummaryList.getExample();
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList2 = new OASPaginatedCurrencySummaryList();
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList3;

        System.assertEquals(false, paginatedCurrencySummaryList1.equals(paginatedCurrencySummaryList3));
        System.assertEquals(false, paginatedCurrencySummaryList2.equals(paginatedCurrencySummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList1 = OASPaginatedCurrencySummaryList.getExample();
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList2 = new OASPaginatedCurrencySummaryList();

        System.assertEquals(paginatedCurrencySummaryList1.hashCode(), paginatedCurrencySummaryList1.hashCode());
        System.assertEquals(paginatedCurrencySummaryList2.hashCode(), paginatedCurrencySummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList1 = OASPaginatedCurrencySummaryList.getExample();
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList2 = OASPaginatedCurrencySummaryList.getExample();
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList3 = new OASPaginatedCurrencySummaryList();
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList4 = new OASPaginatedCurrencySummaryList();

        System.assert(paginatedCurrencySummaryList1.equals(paginatedCurrencySummaryList2));
        System.assert(paginatedCurrencySummaryList3.equals(paginatedCurrencySummaryList4));
        System.assertEquals(paginatedCurrencySummaryList1.hashCode(), paginatedCurrencySummaryList2.hashCode());
        System.assertEquals(paginatedCurrencySummaryList3.hashCode(), paginatedCurrencySummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedCurrencySummaryList paginatedCurrencySummaryList = new OASPaginatedCurrencySummaryList();
        System.assertEquals(new List<OASCurrencySummary>(), paginatedCurrencySummaryList.results);
        System.assertEquals(null, paginatedCurrencySummaryList.count);
        System.assertEquals(null, paginatedCurrencySummaryList.next);
        System.assertEquals(null, paginatedCurrencySummaryList.previous);
    }
}
