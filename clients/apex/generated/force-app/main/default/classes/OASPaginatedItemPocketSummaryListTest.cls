@isTest
private class OASPaginatedItemPocketSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList1 = OASPaginatedItemPocketSummaryList.getExample();
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList2 = paginatedItemPocketSummaryList1;
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList3 = new OASPaginatedItemPocketSummaryList();
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList4 = paginatedItemPocketSummaryList3;

        System.assert(paginatedItemPocketSummaryList1.equals(paginatedItemPocketSummaryList2));
        System.assert(paginatedItemPocketSummaryList2.equals(paginatedItemPocketSummaryList1));
        System.assert(paginatedItemPocketSummaryList1.equals(paginatedItemPocketSummaryList1));
        System.assert(paginatedItemPocketSummaryList3.equals(paginatedItemPocketSummaryList4));
        System.assert(paginatedItemPocketSummaryList4.equals(paginatedItemPocketSummaryList3));
        System.assert(paginatedItemPocketSummaryList3.equals(paginatedItemPocketSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList1 = OASPaginatedItemPocketSummaryList.getExample();
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList2 = OASPaginatedItemPocketSummaryList.getExample();
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList3 = new OASPaginatedItemPocketSummaryList();
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList4 = new OASPaginatedItemPocketSummaryList();

        System.assert(paginatedItemPocketSummaryList1.equals(paginatedItemPocketSummaryList2));
        System.assert(paginatedItemPocketSummaryList2.equals(paginatedItemPocketSummaryList1));
        System.assert(paginatedItemPocketSummaryList3.equals(paginatedItemPocketSummaryList4));
        System.assert(paginatedItemPocketSummaryList4.equals(paginatedItemPocketSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList1 = OASPaginatedItemPocketSummaryList.getExample();
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList2 = new OASPaginatedItemPocketSummaryList();

        System.assertEquals(false, paginatedItemPocketSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedItemPocketSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList1 = OASPaginatedItemPocketSummaryList.getExample();
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList2 = new OASPaginatedItemPocketSummaryList();
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList3;

        System.assertEquals(false, paginatedItemPocketSummaryList1.equals(paginatedItemPocketSummaryList3));
        System.assertEquals(false, paginatedItemPocketSummaryList2.equals(paginatedItemPocketSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList1 = OASPaginatedItemPocketSummaryList.getExample();
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList2 = new OASPaginatedItemPocketSummaryList();

        System.assertEquals(paginatedItemPocketSummaryList1.hashCode(), paginatedItemPocketSummaryList1.hashCode());
        System.assertEquals(paginatedItemPocketSummaryList2.hashCode(), paginatedItemPocketSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList1 = OASPaginatedItemPocketSummaryList.getExample();
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList2 = OASPaginatedItemPocketSummaryList.getExample();
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList3 = new OASPaginatedItemPocketSummaryList();
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList4 = new OASPaginatedItemPocketSummaryList();

        System.assert(paginatedItemPocketSummaryList1.equals(paginatedItemPocketSummaryList2));
        System.assert(paginatedItemPocketSummaryList3.equals(paginatedItemPocketSummaryList4));
        System.assertEquals(paginatedItemPocketSummaryList1.hashCode(), paginatedItemPocketSummaryList2.hashCode());
        System.assertEquals(paginatedItemPocketSummaryList3.hashCode(), paginatedItemPocketSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedItemPocketSummaryList paginatedItemPocketSummaryList = new OASPaginatedItemPocketSummaryList();
        System.assertEquals(new List<OASItemPocketSummary>(), paginatedItemPocketSummaryList.results);
        System.assertEquals(null, paginatedItemPocketSummaryList.count);
        System.assertEquals(null, paginatedItemPocketSummaryList.next);
        System.assertEquals(null, paginatedItemPocketSummaryList.previous);
    }
}
