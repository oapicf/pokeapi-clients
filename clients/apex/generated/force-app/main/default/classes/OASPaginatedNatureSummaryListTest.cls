@isTest
private class OASPaginatedNatureSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedNatureSummaryList paginatedNatureSummaryList1 = OASPaginatedNatureSummaryList.getExample();
        OASPaginatedNatureSummaryList paginatedNatureSummaryList2 = paginatedNatureSummaryList1;
        OASPaginatedNatureSummaryList paginatedNatureSummaryList3 = new OASPaginatedNatureSummaryList();
        OASPaginatedNatureSummaryList paginatedNatureSummaryList4 = paginatedNatureSummaryList3;

        System.assert(paginatedNatureSummaryList1.equals(paginatedNatureSummaryList2));
        System.assert(paginatedNatureSummaryList2.equals(paginatedNatureSummaryList1));
        System.assert(paginatedNatureSummaryList1.equals(paginatedNatureSummaryList1));
        System.assert(paginatedNatureSummaryList3.equals(paginatedNatureSummaryList4));
        System.assert(paginatedNatureSummaryList4.equals(paginatedNatureSummaryList3));
        System.assert(paginatedNatureSummaryList3.equals(paginatedNatureSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedNatureSummaryList paginatedNatureSummaryList1 = OASPaginatedNatureSummaryList.getExample();
        OASPaginatedNatureSummaryList paginatedNatureSummaryList2 = OASPaginatedNatureSummaryList.getExample();
        OASPaginatedNatureSummaryList paginatedNatureSummaryList3 = new OASPaginatedNatureSummaryList();
        OASPaginatedNatureSummaryList paginatedNatureSummaryList4 = new OASPaginatedNatureSummaryList();

        System.assert(paginatedNatureSummaryList1.equals(paginatedNatureSummaryList2));
        System.assert(paginatedNatureSummaryList2.equals(paginatedNatureSummaryList1));
        System.assert(paginatedNatureSummaryList3.equals(paginatedNatureSummaryList4));
        System.assert(paginatedNatureSummaryList4.equals(paginatedNatureSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedNatureSummaryList paginatedNatureSummaryList1 = OASPaginatedNatureSummaryList.getExample();
        OASPaginatedNatureSummaryList paginatedNatureSummaryList2 = new OASPaginatedNatureSummaryList();

        System.assertEquals(false, paginatedNatureSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedNatureSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedNatureSummaryList paginatedNatureSummaryList1 = OASPaginatedNatureSummaryList.getExample();
        OASPaginatedNatureSummaryList paginatedNatureSummaryList2 = new OASPaginatedNatureSummaryList();
        OASPaginatedNatureSummaryList paginatedNatureSummaryList3;

        System.assertEquals(false, paginatedNatureSummaryList1.equals(paginatedNatureSummaryList3));
        System.assertEquals(false, paginatedNatureSummaryList2.equals(paginatedNatureSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedNatureSummaryList paginatedNatureSummaryList1 = OASPaginatedNatureSummaryList.getExample();
        OASPaginatedNatureSummaryList paginatedNatureSummaryList2 = new OASPaginatedNatureSummaryList();

        System.assertEquals(paginatedNatureSummaryList1.hashCode(), paginatedNatureSummaryList1.hashCode());
        System.assertEquals(paginatedNatureSummaryList2.hashCode(), paginatedNatureSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedNatureSummaryList paginatedNatureSummaryList1 = OASPaginatedNatureSummaryList.getExample();
        OASPaginatedNatureSummaryList paginatedNatureSummaryList2 = OASPaginatedNatureSummaryList.getExample();
        OASPaginatedNatureSummaryList paginatedNatureSummaryList3 = new OASPaginatedNatureSummaryList();
        OASPaginatedNatureSummaryList paginatedNatureSummaryList4 = new OASPaginatedNatureSummaryList();

        System.assert(paginatedNatureSummaryList1.equals(paginatedNatureSummaryList2));
        System.assert(paginatedNatureSummaryList3.equals(paginatedNatureSummaryList4));
        System.assertEquals(paginatedNatureSummaryList1.hashCode(), paginatedNatureSummaryList2.hashCode());
        System.assertEquals(paginatedNatureSummaryList3.hashCode(), paginatedNatureSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedNatureSummaryList paginatedNatureSummaryList = new OASPaginatedNatureSummaryList();
        System.assertEquals(new List<OASNatureSummary>(), paginatedNatureSummaryList.results);
        System.assertEquals(null, paginatedNatureSummaryList.count);
        System.assertEquals(null, paginatedNatureSummaryList.next);
        System.assertEquals(null, paginatedNatureSummaryList.previous);
    }
}
