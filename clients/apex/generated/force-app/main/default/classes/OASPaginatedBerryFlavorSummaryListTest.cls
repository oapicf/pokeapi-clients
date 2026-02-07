@isTest
private class OASPaginatedBerryFlavorSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList1 = OASPaginatedBerryFlavorSummaryList.getExample();
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList2 = paginatedBerryFlavorSummaryList1;
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList3 = new OASPaginatedBerryFlavorSummaryList();
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList4 = paginatedBerryFlavorSummaryList3;

        System.assert(paginatedBerryFlavorSummaryList1.equals(paginatedBerryFlavorSummaryList2));
        System.assert(paginatedBerryFlavorSummaryList2.equals(paginatedBerryFlavorSummaryList1));
        System.assert(paginatedBerryFlavorSummaryList1.equals(paginatedBerryFlavorSummaryList1));
        System.assert(paginatedBerryFlavorSummaryList3.equals(paginatedBerryFlavorSummaryList4));
        System.assert(paginatedBerryFlavorSummaryList4.equals(paginatedBerryFlavorSummaryList3));
        System.assert(paginatedBerryFlavorSummaryList3.equals(paginatedBerryFlavorSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList1 = OASPaginatedBerryFlavorSummaryList.getExample();
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList2 = OASPaginatedBerryFlavorSummaryList.getExample();
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList3 = new OASPaginatedBerryFlavorSummaryList();
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList4 = new OASPaginatedBerryFlavorSummaryList();

        System.assert(paginatedBerryFlavorSummaryList1.equals(paginatedBerryFlavorSummaryList2));
        System.assert(paginatedBerryFlavorSummaryList2.equals(paginatedBerryFlavorSummaryList1));
        System.assert(paginatedBerryFlavorSummaryList3.equals(paginatedBerryFlavorSummaryList4));
        System.assert(paginatedBerryFlavorSummaryList4.equals(paginatedBerryFlavorSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList1 = OASPaginatedBerryFlavorSummaryList.getExample();
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList2 = new OASPaginatedBerryFlavorSummaryList();

        System.assertEquals(false, paginatedBerryFlavorSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedBerryFlavorSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList1 = OASPaginatedBerryFlavorSummaryList.getExample();
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList2 = new OASPaginatedBerryFlavorSummaryList();
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList3;

        System.assertEquals(false, paginatedBerryFlavorSummaryList1.equals(paginatedBerryFlavorSummaryList3));
        System.assertEquals(false, paginatedBerryFlavorSummaryList2.equals(paginatedBerryFlavorSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList1 = OASPaginatedBerryFlavorSummaryList.getExample();
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList2 = new OASPaginatedBerryFlavorSummaryList();

        System.assertEquals(paginatedBerryFlavorSummaryList1.hashCode(), paginatedBerryFlavorSummaryList1.hashCode());
        System.assertEquals(paginatedBerryFlavorSummaryList2.hashCode(), paginatedBerryFlavorSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList1 = OASPaginatedBerryFlavorSummaryList.getExample();
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList2 = OASPaginatedBerryFlavorSummaryList.getExample();
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList3 = new OASPaginatedBerryFlavorSummaryList();
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList4 = new OASPaginatedBerryFlavorSummaryList();

        System.assert(paginatedBerryFlavorSummaryList1.equals(paginatedBerryFlavorSummaryList2));
        System.assert(paginatedBerryFlavorSummaryList3.equals(paginatedBerryFlavorSummaryList4));
        System.assertEquals(paginatedBerryFlavorSummaryList1.hashCode(), paginatedBerryFlavorSummaryList2.hashCode());
        System.assertEquals(paginatedBerryFlavorSummaryList3.hashCode(), paginatedBerryFlavorSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedBerryFlavorSummaryList paginatedBerryFlavorSummaryList = new OASPaginatedBerryFlavorSummaryList();
        System.assertEquals(new List<OASBerryFlavorSummary>(), paginatedBerryFlavorSummaryList.results);
        System.assertEquals(null, paginatedBerryFlavorSummaryList.count);
        System.assertEquals(null, paginatedBerryFlavorSummaryList.next);
        System.assertEquals(null, paginatedBerryFlavorSummaryList.previous);
    }
}
