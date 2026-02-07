@isTest
private class OASPaginatedLocationSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedLocationSummaryList paginatedLocationSummaryList1 = OASPaginatedLocationSummaryList.getExample();
        OASPaginatedLocationSummaryList paginatedLocationSummaryList2 = paginatedLocationSummaryList1;
        OASPaginatedLocationSummaryList paginatedLocationSummaryList3 = new OASPaginatedLocationSummaryList();
        OASPaginatedLocationSummaryList paginatedLocationSummaryList4 = paginatedLocationSummaryList3;

        System.assert(paginatedLocationSummaryList1.equals(paginatedLocationSummaryList2));
        System.assert(paginatedLocationSummaryList2.equals(paginatedLocationSummaryList1));
        System.assert(paginatedLocationSummaryList1.equals(paginatedLocationSummaryList1));
        System.assert(paginatedLocationSummaryList3.equals(paginatedLocationSummaryList4));
        System.assert(paginatedLocationSummaryList4.equals(paginatedLocationSummaryList3));
        System.assert(paginatedLocationSummaryList3.equals(paginatedLocationSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedLocationSummaryList paginatedLocationSummaryList1 = OASPaginatedLocationSummaryList.getExample();
        OASPaginatedLocationSummaryList paginatedLocationSummaryList2 = OASPaginatedLocationSummaryList.getExample();
        OASPaginatedLocationSummaryList paginatedLocationSummaryList3 = new OASPaginatedLocationSummaryList();
        OASPaginatedLocationSummaryList paginatedLocationSummaryList4 = new OASPaginatedLocationSummaryList();

        System.assert(paginatedLocationSummaryList1.equals(paginatedLocationSummaryList2));
        System.assert(paginatedLocationSummaryList2.equals(paginatedLocationSummaryList1));
        System.assert(paginatedLocationSummaryList3.equals(paginatedLocationSummaryList4));
        System.assert(paginatedLocationSummaryList4.equals(paginatedLocationSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedLocationSummaryList paginatedLocationSummaryList1 = OASPaginatedLocationSummaryList.getExample();
        OASPaginatedLocationSummaryList paginatedLocationSummaryList2 = new OASPaginatedLocationSummaryList();

        System.assertEquals(false, paginatedLocationSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedLocationSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedLocationSummaryList paginatedLocationSummaryList1 = OASPaginatedLocationSummaryList.getExample();
        OASPaginatedLocationSummaryList paginatedLocationSummaryList2 = new OASPaginatedLocationSummaryList();
        OASPaginatedLocationSummaryList paginatedLocationSummaryList3;

        System.assertEquals(false, paginatedLocationSummaryList1.equals(paginatedLocationSummaryList3));
        System.assertEquals(false, paginatedLocationSummaryList2.equals(paginatedLocationSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedLocationSummaryList paginatedLocationSummaryList1 = OASPaginatedLocationSummaryList.getExample();
        OASPaginatedLocationSummaryList paginatedLocationSummaryList2 = new OASPaginatedLocationSummaryList();

        System.assertEquals(paginatedLocationSummaryList1.hashCode(), paginatedLocationSummaryList1.hashCode());
        System.assertEquals(paginatedLocationSummaryList2.hashCode(), paginatedLocationSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedLocationSummaryList paginatedLocationSummaryList1 = OASPaginatedLocationSummaryList.getExample();
        OASPaginatedLocationSummaryList paginatedLocationSummaryList2 = OASPaginatedLocationSummaryList.getExample();
        OASPaginatedLocationSummaryList paginatedLocationSummaryList3 = new OASPaginatedLocationSummaryList();
        OASPaginatedLocationSummaryList paginatedLocationSummaryList4 = new OASPaginatedLocationSummaryList();

        System.assert(paginatedLocationSummaryList1.equals(paginatedLocationSummaryList2));
        System.assert(paginatedLocationSummaryList3.equals(paginatedLocationSummaryList4));
        System.assertEquals(paginatedLocationSummaryList1.hashCode(), paginatedLocationSummaryList2.hashCode());
        System.assertEquals(paginatedLocationSummaryList3.hashCode(), paginatedLocationSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedLocationSummaryList paginatedLocationSummaryList = new OASPaginatedLocationSummaryList();
        System.assertEquals(new List<OASLocationSummary>(), paginatedLocationSummaryList.results);
        System.assertEquals(null, paginatedLocationSummaryList.count);
        System.assertEquals(null, paginatedLocationSummaryList.next);
        System.assertEquals(null, paginatedLocationSummaryList.previous);
    }
}
