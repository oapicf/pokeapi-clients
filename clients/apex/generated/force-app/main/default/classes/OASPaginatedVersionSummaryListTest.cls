@isTest
private class OASPaginatedVersionSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedVersionSummaryList paginatedVersionSummaryList1 = OASPaginatedVersionSummaryList.getExample();
        OASPaginatedVersionSummaryList paginatedVersionSummaryList2 = paginatedVersionSummaryList1;
        OASPaginatedVersionSummaryList paginatedVersionSummaryList3 = new OASPaginatedVersionSummaryList();
        OASPaginatedVersionSummaryList paginatedVersionSummaryList4 = paginatedVersionSummaryList3;

        System.assert(paginatedVersionSummaryList1.equals(paginatedVersionSummaryList2));
        System.assert(paginatedVersionSummaryList2.equals(paginatedVersionSummaryList1));
        System.assert(paginatedVersionSummaryList1.equals(paginatedVersionSummaryList1));
        System.assert(paginatedVersionSummaryList3.equals(paginatedVersionSummaryList4));
        System.assert(paginatedVersionSummaryList4.equals(paginatedVersionSummaryList3));
        System.assert(paginatedVersionSummaryList3.equals(paginatedVersionSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedVersionSummaryList paginatedVersionSummaryList1 = OASPaginatedVersionSummaryList.getExample();
        OASPaginatedVersionSummaryList paginatedVersionSummaryList2 = OASPaginatedVersionSummaryList.getExample();
        OASPaginatedVersionSummaryList paginatedVersionSummaryList3 = new OASPaginatedVersionSummaryList();
        OASPaginatedVersionSummaryList paginatedVersionSummaryList4 = new OASPaginatedVersionSummaryList();

        System.assert(paginatedVersionSummaryList1.equals(paginatedVersionSummaryList2));
        System.assert(paginatedVersionSummaryList2.equals(paginatedVersionSummaryList1));
        System.assert(paginatedVersionSummaryList3.equals(paginatedVersionSummaryList4));
        System.assert(paginatedVersionSummaryList4.equals(paginatedVersionSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedVersionSummaryList paginatedVersionSummaryList1 = OASPaginatedVersionSummaryList.getExample();
        OASPaginatedVersionSummaryList paginatedVersionSummaryList2 = new OASPaginatedVersionSummaryList();

        System.assertEquals(false, paginatedVersionSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedVersionSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedVersionSummaryList paginatedVersionSummaryList1 = OASPaginatedVersionSummaryList.getExample();
        OASPaginatedVersionSummaryList paginatedVersionSummaryList2 = new OASPaginatedVersionSummaryList();
        OASPaginatedVersionSummaryList paginatedVersionSummaryList3;

        System.assertEquals(false, paginatedVersionSummaryList1.equals(paginatedVersionSummaryList3));
        System.assertEquals(false, paginatedVersionSummaryList2.equals(paginatedVersionSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedVersionSummaryList paginatedVersionSummaryList1 = OASPaginatedVersionSummaryList.getExample();
        OASPaginatedVersionSummaryList paginatedVersionSummaryList2 = new OASPaginatedVersionSummaryList();

        System.assertEquals(paginatedVersionSummaryList1.hashCode(), paginatedVersionSummaryList1.hashCode());
        System.assertEquals(paginatedVersionSummaryList2.hashCode(), paginatedVersionSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedVersionSummaryList paginatedVersionSummaryList1 = OASPaginatedVersionSummaryList.getExample();
        OASPaginatedVersionSummaryList paginatedVersionSummaryList2 = OASPaginatedVersionSummaryList.getExample();
        OASPaginatedVersionSummaryList paginatedVersionSummaryList3 = new OASPaginatedVersionSummaryList();
        OASPaginatedVersionSummaryList paginatedVersionSummaryList4 = new OASPaginatedVersionSummaryList();

        System.assert(paginatedVersionSummaryList1.equals(paginatedVersionSummaryList2));
        System.assert(paginatedVersionSummaryList3.equals(paginatedVersionSummaryList4));
        System.assertEquals(paginatedVersionSummaryList1.hashCode(), paginatedVersionSummaryList2.hashCode());
        System.assertEquals(paginatedVersionSummaryList3.hashCode(), paginatedVersionSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedVersionSummaryList paginatedVersionSummaryList = new OASPaginatedVersionSummaryList();
        System.assertEquals(new List<OASVersionSummary>(), paginatedVersionSummaryList.results);
        System.assertEquals(null, paginatedVersionSummaryList.count);
        System.assertEquals(null, paginatedVersionSummaryList.next);
        System.assertEquals(null, paginatedVersionSummaryList.previous);
    }
}
