@isTest
private class OASPaginatedMoveSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedMoveSummaryList paginatedMoveSummaryList1 = OASPaginatedMoveSummaryList.getExample();
        OASPaginatedMoveSummaryList paginatedMoveSummaryList2 = paginatedMoveSummaryList1;
        OASPaginatedMoveSummaryList paginatedMoveSummaryList3 = new OASPaginatedMoveSummaryList();
        OASPaginatedMoveSummaryList paginatedMoveSummaryList4 = paginatedMoveSummaryList3;

        System.assert(paginatedMoveSummaryList1.equals(paginatedMoveSummaryList2));
        System.assert(paginatedMoveSummaryList2.equals(paginatedMoveSummaryList1));
        System.assert(paginatedMoveSummaryList1.equals(paginatedMoveSummaryList1));
        System.assert(paginatedMoveSummaryList3.equals(paginatedMoveSummaryList4));
        System.assert(paginatedMoveSummaryList4.equals(paginatedMoveSummaryList3));
        System.assert(paginatedMoveSummaryList3.equals(paginatedMoveSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedMoveSummaryList paginatedMoveSummaryList1 = OASPaginatedMoveSummaryList.getExample();
        OASPaginatedMoveSummaryList paginatedMoveSummaryList2 = OASPaginatedMoveSummaryList.getExample();
        OASPaginatedMoveSummaryList paginatedMoveSummaryList3 = new OASPaginatedMoveSummaryList();
        OASPaginatedMoveSummaryList paginatedMoveSummaryList4 = new OASPaginatedMoveSummaryList();

        System.assert(paginatedMoveSummaryList1.equals(paginatedMoveSummaryList2));
        System.assert(paginatedMoveSummaryList2.equals(paginatedMoveSummaryList1));
        System.assert(paginatedMoveSummaryList3.equals(paginatedMoveSummaryList4));
        System.assert(paginatedMoveSummaryList4.equals(paginatedMoveSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedMoveSummaryList paginatedMoveSummaryList1 = OASPaginatedMoveSummaryList.getExample();
        OASPaginatedMoveSummaryList paginatedMoveSummaryList2 = new OASPaginatedMoveSummaryList();

        System.assertEquals(false, paginatedMoveSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedMoveSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedMoveSummaryList paginatedMoveSummaryList1 = OASPaginatedMoveSummaryList.getExample();
        OASPaginatedMoveSummaryList paginatedMoveSummaryList2 = new OASPaginatedMoveSummaryList();
        OASPaginatedMoveSummaryList paginatedMoveSummaryList3;

        System.assertEquals(false, paginatedMoveSummaryList1.equals(paginatedMoveSummaryList3));
        System.assertEquals(false, paginatedMoveSummaryList2.equals(paginatedMoveSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedMoveSummaryList paginatedMoveSummaryList1 = OASPaginatedMoveSummaryList.getExample();
        OASPaginatedMoveSummaryList paginatedMoveSummaryList2 = new OASPaginatedMoveSummaryList();

        System.assertEquals(paginatedMoveSummaryList1.hashCode(), paginatedMoveSummaryList1.hashCode());
        System.assertEquals(paginatedMoveSummaryList2.hashCode(), paginatedMoveSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedMoveSummaryList paginatedMoveSummaryList1 = OASPaginatedMoveSummaryList.getExample();
        OASPaginatedMoveSummaryList paginatedMoveSummaryList2 = OASPaginatedMoveSummaryList.getExample();
        OASPaginatedMoveSummaryList paginatedMoveSummaryList3 = new OASPaginatedMoveSummaryList();
        OASPaginatedMoveSummaryList paginatedMoveSummaryList4 = new OASPaginatedMoveSummaryList();

        System.assert(paginatedMoveSummaryList1.equals(paginatedMoveSummaryList2));
        System.assert(paginatedMoveSummaryList3.equals(paginatedMoveSummaryList4));
        System.assertEquals(paginatedMoveSummaryList1.hashCode(), paginatedMoveSummaryList2.hashCode());
        System.assertEquals(paginatedMoveSummaryList3.hashCode(), paginatedMoveSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedMoveSummaryList paginatedMoveSummaryList = new OASPaginatedMoveSummaryList();
        System.assertEquals(new List<OASMoveSummary>(), paginatedMoveSummaryList.results);
        System.assertEquals(null, paginatedMoveSummaryList.count);
        System.assertEquals(null, paginatedMoveSummaryList.next);
        System.assertEquals(null, paginatedMoveSummaryList.previous);
    }
}
