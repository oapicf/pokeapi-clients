@isTest
private class OASPaginatedContestTypeSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList1 = OASPaginatedContestTypeSummaryList.getExample();
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList2 = paginatedContestTypeSummaryList1;
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList3 = new OASPaginatedContestTypeSummaryList();
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList4 = paginatedContestTypeSummaryList3;

        System.assert(paginatedContestTypeSummaryList1.equals(paginatedContestTypeSummaryList2));
        System.assert(paginatedContestTypeSummaryList2.equals(paginatedContestTypeSummaryList1));
        System.assert(paginatedContestTypeSummaryList1.equals(paginatedContestTypeSummaryList1));
        System.assert(paginatedContestTypeSummaryList3.equals(paginatedContestTypeSummaryList4));
        System.assert(paginatedContestTypeSummaryList4.equals(paginatedContestTypeSummaryList3));
        System.assert(paginatedContestTypeSummaryList3.equals(paginatedContestTypeSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList1 = OASPaginatedContestTypeSummaryList.getExample();
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList2 = OASPaginatedContestTypeSummaryList.getExample();
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList3 = new OASPaginatedContestTypeSummaryList();
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList4 = new OASPaginatedContestTypeSummaryList();

        System.assert(paginatedContestTypeSummaryList1.equals(paginatedContestTypeSummaryList2));
        System.assert(paginatedContestTypeSummaryList2.equals(paginatedContestTypeSummaryList1));
        System.assert(paginatedContestTypeSummaryList3.equals(paginatedContestTypeSummaryList4));
        System.assert(paginatedContestTypeSummaryList4.equals(paginatedContestTypeSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList1 = OASPaginatedContestTypeSummaryList.getExample();
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList2 = new OASPaginatedContestTypeSummaryList();

        System.assertEquals(false, paginatedContestTypeSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedContestTypeSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList1 = OASPaginatedContestTypeSummaryList.getExample();
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList2 = new OASPaginatedContestTypeSummaryList();
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList3;

        System.assertEquals(false, paginatedContestTypeSummaryList1.equals(paginatedContestTypeSummaryList3));
        System.assertEquals(false, paginatedContestTypeSummaryList2.equals(paginatedContestTypeSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList1 = OASPaginatedContestTypeSummaryList.getExample();
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList2 = new OASPaginatedContestTypeSummaryList();

        System.assertEquals(paginatedContestTypeSummaryList1.hashCode(), paginatedContestTypeSummaryList1.hashCode());
        System.assertEquals(paginatedContestTypeSummaryList2.hashCode(), paginatedContestTypeSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList1 = OASPaginatedContestTypeSummaryList.getExample();
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList2 = OASPaginatedContestTypeSummaryList.getExample();
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList3 = new OASPaginatedContestTypeSummaryList();
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList4 = new OASPaginatedContestTypeSummaryList();

        System.assert(paginatedContestTypeSummaryList1.equals(paginatedContestTypeSummaryList2));
        System.assert(paginatedContestTypeSummaryList3.equals(paginatedContestTypeSummaryList4));
        System.assertEquals(paginatedContestTypeSummaryList1.hashCode(), paginatedContestTypeSummaryList2.hashCode());
        System.assertEquals(paginatedContestTypeSummaryList3.hashCode(), paginatedContestTypeSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedContestTypeSummaryList paginatedContestTypeSummaryList = new OASPaginatedContestTypeSummaryList();
        System.assertEquals(new List<OASContestTypeSummary>(), paginatedContestTypeSummaryList.results);
        System.assertEquals(null, paginatedContestTypeSummaryList.count);
        System.assertEquals(null, paginatedContestTypeSummaryList.next);
        System.assertEquals(null, paginatedContestTypeSummaryList.previous);
    }
}
