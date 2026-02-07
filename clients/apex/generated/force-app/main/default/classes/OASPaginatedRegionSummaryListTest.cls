@isTest
private class OASPaginatedRegionSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedRegionSummaryList paginatedRegionSummaryList1 = OASPaginatedRegionSummaryList.getExample();
        OASPaginatedRegionSummaryList paginatedRegionSummaryList2 = paginatedRegionSummaryList1;
        OASPaginatedRegionSummaryList paginatedRegionSummaryList3 = new OASPaginatedRegionSummaryList();
        OASPaginatedRegionSummaryList paginatedRegionSummaryList4 = paginatedRegionSummaryList3;

        System.assert(paginatedRegionSummaryList1.equals(paginatedRegionSummaryList2));
        System.assert(paginatedRegionSummaryList2.equals(paginatedRegionSummaryList1));
        System.assert(paginatedRegionSummaryList1.equals(paginatedRegionSummaryList1));
        System.assert(paginatedRegionSummaryList3.equals(paginatedRegionSummaryList4));
        System.assert(paginatedRegionSummaryList4.equals(paginatedRegionSummaryList3));
        System.assert(paginatedRegionSummaryList3.equals(paginatedRegionSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedRegionSummaryList paginatedRegionSummaryList1 = OASPaginatedRegionSummaryList.getExample();
        OASPaginatedRegionSummaryList paginatedRegionSummaryList2 = OASPaginatedRegionSummaryList.getExample();
        OASPaginatedRegionSummaryList paginatedRegionSummaryList3 = new OASPaginatedRegionSummaryList();
        OASPaginatedRegionSummaryList paginatedRegionSummaryList4 = new OASPaginatedRegionSummaryList();

        System.assert(paginatedRegionSummaryList1.equals(paginatedRegionSummaryList2));
        System.assert(paginatedRegionSummaryList2.equals(paginatedRegionSummaryList1));
        System.assert(paginatedRegionSummaryList3.equals(paginatedRegionSummaryList4));
        System.assert(paginatedRegionSummaryList4.equals(paginatedRegionSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedRegionSummaryList paginatedRegionSummaryList1 = OASPaginatedRegionSummaryList.getExample();
        OASPaginatedRegionSummaryList paginatedRegionSummaryList2 = new OASPaginatedRegionSummaryList();

        System.assertEquals(false, paginatedRegionSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedRegionSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedRegionSummaryList paginatedRegionSummaryList1 = OASPaginatedRegionSummaryList.getExample();
        OASPaginatedRegionSummaryList paginatedRegionSummaryList2 = new OASPaginatedRegionSummaryList();
        OASPaginatedRegionSummaryList paginatedRegionSummaryList3;

        System.assertEquals(false, paginatedRegionSummaryList1.equals(paginatedRegionSummaryList3));
        System.assertEquals(false, paginatedRegionSummaryList2.equals(paginatedRegionSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedRegionSummaryList paginatedRegionSummaryList1 = OASPaginatedRegionSummaryList.getExample();
        OASPaginatedRegionSummaryList paginatedRegionSummaryList2 = new OASPaginatedRegionSummaryList();

        System.assertEquals(paginatedRegionSummaryList1.hashCode(), paginatedRegionSummaryList1.hashCode());
        System.assertEquals(paginatedRegionSummaryList2.hashCode(), paginatedRegionSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedRegionSummaryList paginatedRegionSummaryList1 = OASPaginatedRegionSummaryList.getExample();
        OASPaginatedRegionSummaryList paginatedRegionSummaryList2 = OASPaginatedRegionSummaryList.getExample();
        OASPaginatedRegionSummaryList paginatedRegionSummaryList3 = new OASPaginatedRegionSummaryList();
        OASPaginatedRegionSummaryList paginatedRegionSummaryList4 = new OASPaginatedRegionSummaryList();

        System.assert(paginatedRegionSummaryList1.equals(paginatedRegionSummaryList2));
        System.assert(paginatedRegionSummaryList3.equals(paginatedRegionSummaryList4));
        System.assertEquals(paginatedRegionSummaryList1.hashCode(), paginatedRegionSummaryList2.hashCode());
        System.assertEquals(paginatedRegionSummaryList3.hashCode(), paginatedRegionSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedRegionSummaryList paginatedRegionSummaryList = new OASPaginatedRegionSummaryList();
        System.assertEquals(new List<OASRegionSummary>(), paginatedRegionSummaryList.results);
        System.assertEquals(null, paginatedRegionSummaryList.count);
        System.assertEquals(null, paginatedRegionSummaryList.next);
        System.assertEquals(null, paginatedRegionSummaryList.previous);
    }
}
