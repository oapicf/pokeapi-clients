@isTest
private class OASPaginatedStatSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedStatSummaryList paginatedStatSummaryList1 = OASPaginatedStatSummaryList.getExample();
        OASPaginatedStatSummaryList paginatedStatSummaryList2 = paginatedStatSummaryList1;
        OASPaginatedStatSummaryList paginatedStatSummaryList3 = new OASPaginatedStatSummaryList();
        OASPaginatedStatSummaryList paginatedStatSummaryList4 = paginatedStatSummaryList3;

        System.assert(paginatedStatSummaryList1.equals(paginatedStatSummaryList2));
        System.assert(paginatedStatSummaryList2.equals(paginatedStatSummaryList1));
        System.assert(paginatedStatSummaryList1.equals(paginatedStatSummaryList1));
        System.assert(paginatedStatSummaryList3.equals(paginatedStatSummaryList4));
        System.assert(paginatedStatSummaryList4.equals(paginatedStatSummaryList3));
        System.assert(paginatedStatSummaryList3.equals(paginatedStatSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedStatSummaryList paginatedStatSummaryList1 = OASPaginatedStatSummaryList.getExample();
        OASPaginatedStatSummaryList paginatedStatSummaryList2 = OASPaginatedStatSummaryList.getExample();
        OASPaginatedStatSummaryList paginatedStatSummaryList3 = new OASPaginatedStatSummaryList();
        OASPaginatedStatSummaryList paginatedStatSummaryList4 = new OASPaginatedStatSummaryList();

        System.assert(paginatedStatSummaryList1.equals(paginatedStatSummaryList2));
        System.assert(paginatedStatSummaryList2.equals(paginatedStatSummaryList1));
        System.assert(paginatedStatSummaryList3.equals(paginatedStatSummaryList4));
        System.assert(paginatedStatSummaryList4.equals(paginatedStatSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedStatSummaryList paginatedStatSummaryList1 = OASPaginatedStatSummaryList.getExample();
        OASPaginatedStatSummaryList paginatedStatSummaryList2 = new OASPaginatedStatSummaryList();

        System.assertEquals(false, paginatedStatSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedStatSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedStatSummaryList paginatedStatSummaryList1 = OASPaginatedStatSummaryList.getExample();
        OASPaginatedStatSummaryList paginatedStatSummaryList2 = new OASPaginatedStatSummaryList();
        OASPaginatedStatSummaryList paginatedStatSummaryList3;

        System.assertEquals(false, paginatedStatSummaryList1.equals(paginatedStatSummaryList3));
        System.assertEquals(false, paginatedStatSummaryList2.equals(paginatedStatSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedStatSummaryList paginatedStatSummaryList1 = OASPaginatedStatSummaryList.getExample();
        OASPaginatedStatSummaryList paginatedStatSummaryList2 = new OASPaginatedStatSummaryList();

        System.assertEquals(paginatedStatSummaryList1.hashCode(), paginatedStatSummaryList1.hashCode());
        System.assertEquals(paginatedStatSummaryList2.hashCode(), paginatedStatSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedStatSummaryList paginatedStatSummaryList1 = OASPaginatedStatSummaryList.getExample();
        OASPaginatedStatSummaryList paginatedStatSummaryList2 = OASPaginatedStatSummaryList.getExample();
        OASPaginatedStatSummaryList paginatedStatSummaryList3 = new OASPaginatedStatSummaryList();
        OASPaginatedStatSummaryList paginatedStatSummaryList4 = new OASPaginatedStatSummaryList();

        System.assert(paginatedStatSummaryList1.equals(paginatedStatSummaryList2));
        System.assert(paginatedStatSummaryList3.equals(paginatedStatSummaryList4));
        System.assertEquals(paginatedStatSummaryList1.hashCode(), paginatedStatSummaryList2.hashCode());
        System.assertEquals(paginatedStatSummaryList3.hashCode(), paginatedStatSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedStatSummaryList paginatedStatSummaryList = new OASPaginatedStatSummaryList();
        System.assertEquals(new List<OASStatSummary>(), paginatedStatSummaryList.results);
        System.assertEquals(null, paginatedStatSummaryList.count);
        System.assertEquals(null, paginatedStatSummaryList.next);
        System.assertEquals(null, paginatedStatSummaryList.previous);
    }
}
