@isTest
private class OASPaginatedTypeSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedTypeSummaryList paginatedTypeSummaryList1 = OASPaginatedTypeSummaryList.getExample();
        OASPaginatedTypeSummaryList paginatedTypeSummaryList2 = paginatedTypeSummaryList1;
        OASPaginatedTypeSummaryList paginatedTypeSummaryList3 = new OASPaginatedTypeSummaryList();
        OASPaginatedTypeSummaryList paginatedTypeSummaryList4 = paginatedTypeSummaryList3;

        System.assert(paginatedTypeSummaryList1.equals(paginatedTypeSummaryList2));
        System.assert(paginatedTypeSummaryList2.equals(paginatedTypeSummaryList1));
        System.assert(paginatedTypeSummaryList1.equals(paginatedTypeSummaryList1));
        System.assert(paginatedTypeSummaryList3.equals(paginatedTypeSummaryList4));
        System.assert(paginatedTypeSummaryList4.equals(paginatedTypeSummaryList3));
        System.assert(paginatedTypeSummaryList3.equals(paginatedTypeSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedTypeSummaryList paginatedTypeSummaryList1 = OASPaginatedTypeSummaryList.getExample();
        OASPaginatedTypeSummaryList paginatedTypeSummaryList2 = OASPaginatedTypeSummaryList.getExample();
        OASPaginatedTypeSummaryList paginatedTypeSummaryList3 = new OASPaginatedTypeSummaryList();
        OASPaginatedTypeSummaryList paginatedTypeSummaryList4 = new OASPaginatedTypeSummaryList();

        System.assert(paginatedTypeSummaryList1.equals(paginatedTypeSummaryList2));
        System.assert(paginatedTypeSummaryList2.equals(paginatedTypeSummaryList1));
        System.assert(paginatedTypeSummaryList3.equals(paginatedTypeSummaryList4));
        System.assert(paginatedTypeSummaryList4.equals(paginatedTypeSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedTypeSummaryList paginatedTypeSummaryList1 = OASPaginatedTypeSummaryList.getExample();
        OASPaginatedTypeSummaryList paginatedTypeSummaryList2 = new OASPaginatedTypeSummaryList();

        System.assertEquals(false, paginatedTypeSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedTypeSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedTypeSummaryList paginatedTypeSummaryList1 = OASPaginatedTypeSummaryList.getExample();
        OASPaginatedTypeSummaryList paginatedTypeSummaryList2 = new OASPaginatedTypeSummaryList();
        OASPaginatedTypeSummaryList paginatedTypeSummaryList3;

        System.assertEquals(false, paginatedTypeSummaryList1.equals(paginatedTypeSummaryList3));
        System.assertEquals(false, paginatedTypeSummaryList2.equals(paginatedTypeSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedTypeSummaryList paginatedTypeSummaryList1 = OASPaginatedTypeSummaryList.getExample();
        OASPaginatedTypeSummaryList paginatedTypeSummaryList2 = new OASPaginatedTypeSummaryList();

        System.assertEquals(paginatedTypeSummaryList1.hashCode(), paginatedTypeSummaryList1.hashCode());
        System.assertEquals(paginatedTypeSummaryList2.hashCode(), paginatedTypeSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedTypeSummaryList paginatedTypeSummaryList1 = OASPaginatedTypeSummaryList.getExample();
        OASPaginatedTypeSummaryList paginatedTypeSummaryList2 = OASPaginatedTypeSummaryList.getExample();
        OASPaginatedTypeSummaryList paginatedTypeSummaryList3 = new OASPaginatedTypeSummaryList();
        OASPaginatedTypeSummaryList paginatedTypeSummaryList4 = new OASPaginatedTypeSummaryList();

        System.assert(paginatedTypeSummaryList1.equals(paginatedTypeSummaryList2));
        System.assert(paginatedTypeSummaryList3.equals(paginatedTypeSummaryList4));
        System.assertEquals(paginatedTypeSummaryList1.hashCode(), paginatedTypeSummaryList2.hashCode());
        System.assertEquals(paginatedTypeSummaryList3.hashCode(), paginatedTypeSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedTypeSummaryList paginatedTypeSummaryList = new OASPaginatedTypeSummaryList();
        System.assertEquals(new List<OASTypeSummary>(), paginatedTypeSummaryList.results);
        System.assertEquals(null, paginatedTypeSummaryList.count);
        System.assertEquals(null, paginatedTypeSummaryList.next);
        System.assertEquals(null, paginatedTypeSummaryList.previous);
    }
}
