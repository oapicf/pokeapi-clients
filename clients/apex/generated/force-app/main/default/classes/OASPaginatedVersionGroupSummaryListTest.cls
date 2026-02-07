@isTest
private class OASPaginatedVersionGroupSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList1 = OASPaginatedVersionGroupSummaryList.getExample();
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList2 = paginatedVersionGroupSummaryList1;
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList3 = new OASPaginatedVersionGroupSummaryList();
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList4 = paginatedVersionGroupSummaryList3;

        System.assert(paginatedVersionGroupSummaryList1.equals(paginatedVersionGroupSummaryList2));
        System.assert(paginatedVersionGroupSummaryList2.equals(paginatedVersionGroupSummaryList1));
        System.assert(paginatedVersionGroupSummaryList1.equals(paginatedVersionGroupSummaryList1));
        System.assert(paginatedVersionGroupSummaryList3.equals(paginatedVersionGroupSummaryList4));
        System.assert(paginatedVersionGroupSummaryList4.equals(paginatedVersionGroupSummaryList3));
        System.assert(paginatedVersionGroupSummaryList3.equals(paginatedVersionGroupSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList1 = OASPaginatedVersionGroupSummaryList.getExample();
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList2 = OASPaginatedVersionGroupSummaryList.getExample();
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList3 = new OASPaginatedVersionGroupSummaryList();
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList4 = new OASPaginatedVersionGroupSummaryList();

        System.assert(paginatedVersionGroupSummaryList1.equals(paginatedVersionGroupSummaryList2));
        System.assert(paginatedVersionGroupSummaryList2.equals(paginatedVersionGroupSummaryList1));
        System.assert(paginatedVersionGroupSummaryList3.equals(paginatedVersionGroupSummaryList4));
        System.assert(paginatedVersionGroupSummaryList4.equals(paginatedVersionGroupSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList1 = OASPaginatedVersionGroupSummaryList.getExample();
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList2 = new OASPaginatedVersionGroupSummaryList();

        System.assertEquals(false, paginatedVersionGroupSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedVersionGroupSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList1 = OASPaginatedVersionGroupSummaryList.getExample();
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList2 = new OASPaginatedVersionGroupSummaryList();
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList3;

        System.assertEquals(false, paginatedVersionGroupSummaryList1.equals(paginatedVersionGroupSummaryList3));
        System.assertEquals(false, paginatedVersionGroupSummaryList2.equals(paginatedVersionGroupSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList1 = OASPaginatedVersionGroupSummaryList.getExample();
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList2 = new OASPaginatedVersionGroupSummaryList();

        System.assertEquals(paginatedVersionGroupSummaryList1.hashCode(), paginatedVersionGroupSummaryList1.hashCode());
        System.assertEquals(paginatedVersionGroupSummaryList2.hashCode(), paginatedVersionGroupSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList1 = OASPaginatedVersionGroupSummaryList.getExample();
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList2 = OASPaginatedVersionGroupSummaryList.getExample();
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList3 = new OASPaginatedVersionGroupSummaryList();
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList4 = new OASPaginatedVersionGroupSummaryList();

        System.assert(paginatedVersionGroupSummaryList1.equals(paginatedVersionGroupSummaryList2));
        System.assert(paginatedVersionGroupSummaryList3.equals(paginatedVersionGroupSummaryList4));
        System.assertEquals(paginatedVersionGroupSummaryList1.hashCode(), paginatedVersionGroupSummaryList2.hashCode());
        System.assertEquals(paginatedVersionGroupSummaryList3.hashCode(), paginatedVersionGroupSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedVersionGroupSummaryList paginatedVersionGroupSummaryList = new OASPaginatedVersionGroupSummaryList();
        System.assertEquals(new List<OASVersionGroupSummary>(), paginatedVersionGroupSummaryList.results);
        System.assertEquals(null, paginatedVersionGroupSummaryList.count);
        System.assertEquals(null, paginatedVersionGroupSummaryList.next);
        System.assertEquals(null, paginatedVersionGroupSummaryList.previous);
    }
}
