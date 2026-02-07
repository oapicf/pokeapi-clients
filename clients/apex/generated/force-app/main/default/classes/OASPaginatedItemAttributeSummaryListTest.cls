@isTest
private class OASPaginatedItemAttributeSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList1 = OASPaginatedItemAttributeSummaryList.getExample();
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList2 = paginatedItemAttributeSummaryList1;
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList3 = new OASPaginatedItemAttributeSummaryList();
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList4 = paginatedItemAttributeSummaryList3;

        System.assert(paginatedItemAttributeSummaryList1.equals(paginatedItemAttributeSummaryList2));
        System.assert(paginatedItemAttributeSummaryList2.equals(paginatedItemAttributeSummaryList1));
        System.assert(paginatedItemAttributeSummaryList1.equals(paginatedItemAttributeSummaryList1));
        System.assert(paginatedItemAttributeSummaryList3.equals(paginatedItemAttributeSummaryList4));
        System.assert(paginatedItemAttributeSummaryList4.equals(paginatedItemAttributeSummaryList3));
        System.assert(paginatedItemAttributeSummaryList3.equals(paginatedItemAttributeSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList1 = OASPaginatedItemAttributeSummaryList.getExample();
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList2 = OASPaginatedItemAttributeSummaryList.getExample();
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList3 = new OASPaginatedItemAttributeSummaryList();
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList4 = new OASPaginatedItemAttributeSummaryList();

        System.assert(paginatedItemAttributeSummaryList1.equals(paginatedItemAttributeSummaryList2));
        System.assert(paginatedItemAttributeSummaryList2.equals(paginatedItemAttributeSummaryList1));
        System.assert(paginatedItemAttributeSummaryList3.equals(paginatedItemAttributeSummaryList4));
        System.assert(paginatedItemAttributeSummaryList4.equals(paginatedItemAttributeSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList1 = OASPaginatedItemAttributeSummaryList.getExample();
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList2 = new OASPaginatedItemAttributeSummaryList();

        System.assertEquals(false, paginatedItemAttributeSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedItemAttributeSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList1 = OASPaginatedItemAttributeSummaryList.getExample();
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList2 = new OASPaginatedItemAttributeSummaryList();
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList3;

        System.assertEquals(false, paginatedItemAttributeSummaryList1.equals(paginatedItemAttributeSummaryList3));
        System.assertEquals(false, paginatedItemAttributeSummaryList2.equals(paginatedItemAttributeSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList1 = OASPaginatedItemAttributeSummaryList.getExample();
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList2 = new OASPaginatedItemAttributeSummaryList();

        System.assertEquals(paginatedItemAttributeSummaryList1.hashCode(), paginatedItemAttributeSummaryList1.hashCode());
        System.assertEquals(paginatedItemAttributeSummaryList2.hashCode(), paginatedItemAttributeSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList1 = OASPaginatedItemAttributeSummaryList.getExample();
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList2 = OASPaginatedItemAttributeSummaryList.getExample();
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList3 = new OASPaginatedItemAttributeSummaryList();
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList4 = new OASPaginatedItemAttributeSummaryList();

        System.assert(paginatedItemAttributeSummaryList1.equals(paginatedItemAttributeSummaryList2));
        System.assert(paginatedItemAttributeSummaryList3.equals(paginatedItemAttributeSummaryList4));
        System.assertEquals(paginatedItemAttributeSummaryList1.hashCode(), paginatedItemAttributeSummaryList2.hashCode());
        System.assertEquals(paginatedItemAttributeSummaryList3.hashCode(), paginatedItemAttributeSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedItemAttributeSummaryList paginatedItemAttributeSummaryList = new OASPaginatedItemAttributeSummaryList();
        System.assertEquals(new List<OASItemAttributeSummary>(), paginatedItemAttributeSummaryList.results);
        System.assertEquals(null, paginatedItemAttributeSummaryList.count);
        System.assertEquals(null, paginatedItemAttributeSummaryList.next);
        System.assertEquals(null, paginatedItemAttributeSummaryList.previous);
    }
}
