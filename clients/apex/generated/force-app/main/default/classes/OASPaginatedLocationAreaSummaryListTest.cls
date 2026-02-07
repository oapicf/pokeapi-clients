@isTest
private class OASPaginatedLocationAreaSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList1 = OASPaginatedLocationAreaSummaryList.getExample();
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList2 = paginatedLocationAreaSummaryList1;
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList3 = new OASPaginatedLocationAreaSummaryList();
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList4 = paginatedLocationAreaSummaryList3;

        System.assert(paginatedLocationAreaSummaryList1.equals(paginatedLocationAreaSummaryList2));
        System.assert(paginatedLocationAreaSummaryList2.equals(paginatedLocationAreaSummaryList1));
        System.assert(paginatedLocationAreaSummaryList1.equals(paginatedLocationAreaSummaryList1));
        System.assert(paginatedLocationAreaSummaryList3.equals(paginatedLocationAreaSummaryList4));
        System.assert(paginatedLocationAreaSummaryList4.equals(paginatedLocationAreaSummaryList3));
        System.assert(paginatedLocationAreaSummaryList3.equals(paginatedLocationAreaSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList1 = OASPaginatedLocationAreaSummaryList.getExample();
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList2 = OASPaginatedLocationAreaSummaryList.getExample();
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList3 = new OASPaginatedLocationAreaSummaryList();
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList4 = new OASPaginatedLocationAreaSummaryList();

        System.assert(paginatedLocationAreaSummaryList1.equals(paginatedLocationAreaSummaryList2));
        System.assert(paginatedLocationAreaSummaryList2.equals(paginatedLocationAreaSummaryList1));
        System.assert(paginatedLocationAreaSummaryList3.equals(paginatedLocationAreaSummaryList4));
        System.assert(paginatedLocationAreaSummaryList4.equals(paginatedLocationAreaSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList1 = OASPaginatedLocationAreaSummaryList.getExample();
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList2 = new OASPaginatedLocationAreaSummaryList();

        System.assertEquals(false, paginatedLocationAreaSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedLocationAreaSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList1 = OASPaginatedLocationAreaSummaryList.getExample();
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList2 = new OASPaginatedLocationAreaSummaryList();
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList3;

        System.assertEquals(false, paginatedLocationAreaSummaryList1.equals(paginatedLocationAreaSummaryList3));
        System.assertEquals(false, paginatedLocationAreaSummaryList2.equals(paginatedLocationAreaSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList1 = OASPaginatedLocationAreaSummaryList.getExample();
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList2 = new OASPaginatedLocationAreaSummaryList();

        System.assertEquals(paginatedLocationAreaSummaryList1.hashCode(), paginatedLocationAreaSummaryList1.hashCode());
        System.assertEquals(paginatedLocationAreaSummaryList2.hashCode(), paginatedLocationAreaSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList1 = OASPaginatedLocationAreaSummaryList.getExample();
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList2 = OASPaginatedLocationAreaSummaryList.getExample();
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList3 = new OASPaginatedLocationAreaSummaryList();
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList4 = new OASPaginatedLocationAreaSummaryList();

        System.assert(paginatedLocationAreaSummaryList1.equals(paginatedLocationAreaSummaryList2));
        System.assert(paginatedLocationAreaSummaryList3.equals(paginatedLocationAreaSummaryList4));
        System.assertEquals(paginatedLocationAreaSummaryList1.hashCode(), paginatedLocationAreaSummaryList2.hashCode());
        System.assertEquals(paginatedLocationAreaSummaryList3.hashCode(), paginatedLocationAreaSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedLocationAreaSummaryList paginatedLocationAreaSummaryList = new OASPaginatedLocationAreaSummaryList();
        System.assertEquals(new List<OASLocationAreaSummary>(), paginatedLocationAreaSummaryList.results);
        System.assertEquals(null, paginatedLocationAreaSummaryList.count);
        System.assertEquals(null, paginatedLocationAreaSummaryList.next);
        System.assertEquals(null, paginatedLocationAreaSummaryList.previous);
    }
}
