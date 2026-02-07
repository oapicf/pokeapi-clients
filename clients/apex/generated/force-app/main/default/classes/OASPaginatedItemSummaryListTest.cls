@isTest
private class OASPaginatedItemSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedItemSummaryList paginatedItemSummaryList1 = OASPaginatedItemSummaryList.getExample();
        OASPaginatedItemSummaryList paginatedItemSummaryList2 = paginatedItemSummaryList1;
        OASPaginatedItemSummaryList paginatedItemSummaryList3 = new OASPaginatedItemSummaryList();
        OASPaginatedItemSummaryList paginatedItemSummaryList4 = paginatedItemSummaryList3;

        System.assert(paginatedItemSummaryList1.equals(paginatedItemSummaryList2));
        System.assert(paginatedItemSummaryList2.equals(paginatedItemSummaryList1));
        System.assert(paginatedItemSummaryList1.equals(paginatedItemSummaryList1));
        System.assert(paginatedItemSummaryList3.equals(paginatedItemSummaryList4));
        System.assert(paginatedItemSummaryList4.equals(paginatedItemSummaryList3));
        System.assert(paginatedItemSummaryList3.equals(paginatedItemSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedItemSummaryList paginatedItemSummaryList1 = OASPaginatedItemSummaryList.getExample();
        OASPaginatedItemSummaryList paginatedItemSummaryList2 = OASPaginatedItemSummaryList.getExample();
        OASPaginatedItemSummaryList paginatedItemSummaryList3 = new OASPaginatedItemSummaryList();
        OASPaginatedItemSummaryList paginatedItemSummaryList4 = new OASPaginatedItemSummaryList();

        System.assert(paginatedItemSummaryList1.equals(paginatedItemSummaryList2));
        System.assert(paginatedItemSummaryList2.equals(paginatedItemSummaryList1));
        System.assert(paginatedItemSummaryList3.equals(paginatedItemSummaryList4));
        System.assert(paginatedItemSummaryList4.equals(paginatedItemSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedItemSummaryList paginatedItemSummaryList1 = OASPaginatedItemSummaryList.getExample();
        OASPaginatedItemSummaryList paginatedItemSummaryList2 = new OASPaginatedItemSummaryList();

        System.assertEquals(false, paginatedItemSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedItemSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedItemSummaryList paginatedItemSummaryList1 = OASPaginatedItemSummaryList.getExample();
        OASPaginatedItemSummaryList paginatedItemSummaryList2 = new OASPaginatedItemSummaryList();
        OASPaginatedItemSummaryList paginatedItemSummaryList3;

        System.assertEquals(false, paginatedItemSummaryList1.equals(paginatedItemSummaryList3));
        System.assertEquals(false, paginatedItemSummaryList2.equals(paginatedItemSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedItemSummaryList paginatedItemSummaryList1 = OASPaginatedItemSummaryList.getExample();
        OASPaginatedItemSummaryList paginatedItemSummaryList2 = new OASPaginatedItemSummaryList();

        System.assertEquals(paginatedItemSummaryList1.hashCode(), paginatedItemSummaryList1.hashCode());
        System.assertEquals(paginatedItemSummaryList2.hashCode(), paginatedItemSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedItemSummaryList paginatedItemSummaryList1 = OASPaginatedItemSummaryList.getExample();
        OASPaginatedItemSummaryList paginatedItemSummaryList2 = OASPaginatedItemSummaryList.getExample();
        OASPaginatedItemSummaryList paginatedItemSummaryList3 = new OASPaginatedItemSummaryList();
        OASPaginatedItemSummaryList paginatedItemSummaryList4 = new OASPaginatedItemSummaryList();

        System.assert(paginatedItemSummaryList1.equals(paginatedItemSummaryList2));
        System.assert(paginatedItemSummaryList3.equals(paginatedItemSummaryList4));
        System.assertEquals(paginatedItemSummaryList1.hashCode(), paginatedItemSummaryList2.hashCode());
        System.assertEquals(paginatedItemSummaryList3.hashCode(), paginatedItemSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedItemSummaryList paginatedItemSummaryList = new OASPaginatedItemSummaryList();
        System.assertEquals(new List<OASItemSummary>(), paginatedItemSummaryList.results);
        System.assertEquals(null, paginatedItemSummaryList.count);
        System.assertEquals(null, paginatedItemSummaryList.next);
        System.assertEquals(null, paginatedItemSummaryList.previous);
    }
}
