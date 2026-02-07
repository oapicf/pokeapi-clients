@isTest
private class OASPaginatedBerrySummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedBerrySummaryList paginatedBerrySummaryList1 = OASPaginatedBerrySummaryList.getExample();
        OASPaginatedBerrySummaryList paginatedBerrySummaryList2 = paginatedBerrySummaryList1;
        OASPaginatedBerrySummaryList paginatedBerrySummaryList3 = new OASPaginatedBerrySummaryList();
        OASPaginatedBerrySummaryList paginatedBerrySummaryList4 = paginatedBerrySummaryList3;

        System.assert(paginatedBerrySummaryList1.equals(paginatedBerrySummaryList2));
        System.assert(paginatedBerrySummaryList2.equals(paginatedBerrySummaryList1));
        System.assert(paginatedBerrySummaryList1.equals(paginatedBerrySummaryList1));
        System.assert(paginatedBerrySummaryList3.equals(paginatedBerrySummaryList4));
        System.assert(paginatedBerrySummaryList4.equals(paginatedBerrySummaryList3));
        System.assert(paginatedBerrySummaryList3.equals(paginatedBerrySummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedBerrySummaryList paginatedBerrySummaryList1 = OASPaginatedBerrySummaryList.getExample();
        OASPaginatedBerrySummaryList paginatedBerrySummaryList2 = OASPaginatedBerrySummaryList.getExample();
        OASPaginatedBerrySummaryList paginatedBerrySummaryList3 = new OASPaginatedBerrySummaryList();
        OASPaginatedBerrySummaryList paginatedBerrySummaryList4 = new OASPaginatedBerrySummaryList();

        System.assert(paginatedBerrySummaryList1.equals(paginatedBerrySummaryList2));
        System.assert(paginatedBerrySummaryList2.equals(paginatedBerrySummaryList1));
        System.assert(paginatedBerrySummaryList3.equals(paginatedBerrySummaryList4));
        System.assert(paginatedBerrySummaryList4.equals(paginatedBerrySummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedBerrySummaryList paginatedBerrySummaryList1 = OASPaginatedBerrySummaryList.getExample();
        OASPaginatedBerrySummaryList paginatedBerrySummaryList2 = new OASPaginatedBerrySummaryList();

        System.assertEquals(false, paginatedBerrySummaryList1.equals('foo'));
        System.assertEquals(false, paginatedBerrySummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedBerrySummaryList paginatedBerrySummaryList1 = OASPaginatedBerrySummaryList.getExample();
        OASPaginatedBerrySummaryList paginatedBerrySummaryList2 = new OASPaginatedBerrySummaryList();
        OASPaginatedBerrySummaryList paginatedBerrySummaryList3;

        System.assertEquals(false, paginatedBerrySummaryList1.equals(paginatedBerrySummaryList3));
        System.assertEquals(false, paginatedBerrySummaryList2.equals(paginatedBerrySummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedBerrySummaryList paginatedBerrySummaryList1 = OASPaginatedBerrySummaryList.getExample();
        OASPaginatedBerrySummaryList paginatedBerrySummaryList2 = new OASPaginatedBerrySummaryList();

        System.assertEquals(paginatedBerrySummaryList1.hashCode(), paginatedBerrySummaryList1.hashCode());
        System.assertEquals(paginatedBerrySummaryList2.hashCode(), paginatedBerrySummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedBerrySummaryList paginatedBerrySummaryList1 = OASPaginatedBerrySummaryList.getExample();
        OASPaginatedBerrySummaryList paginatedBerrySummaryList2 = OASPaginatedBerrySummaryList.getExample();
        OASPaginatedBerrySummaryList paginatedBerrySummaryList3 = new OASPaginatedBerrySummaryList();
        OASPaginatedBerrySummaryList paginatedBerrySummaryList4 = new OASPaginatedBerrySummaryList();

        System.assert(paginatedBerrySummaryList1.equals(paginatedBerrySummaryList2));
        System.assert(paginatedBerrySummaryList3.equals(paginatedBerrySummaryList4));
        System.assertEquals(paginatedBerrySummaryList1.hashCode(), paginatedBerrySummaryList2.hashCode());
        System.assertEquals(paginatedBerrySummaryList3.hashCode(), paginatedBerrySummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedBerrySummaryList paginatedBerrySummaryList = new OASPaginatedBerrySummaryList();
        System.assertEquals(new List<OASBerrySummary>(), paginatedBerrySummaryList.results);
        System.assertEquals(null, paginatedBerrySummaryList.count);
        System.assertEquals(null, paginatedBerrySummaryList.next);
        System.assertEquals(null, paginatedBerrySummaryList.previous);
    }
}
