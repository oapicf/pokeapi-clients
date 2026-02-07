@isTest
private class OASPaginatedAbilitySummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList1 = OASPaginatedAbilitySummaryList.getExample();
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList2 = paginatedAbilitySummaryList1;
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList3 = new OASPaginatedAbilitySummaryList();
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList4 = paginatedAbilitySummaryList3;

        System.assert(paginatedAbilitySummaryList1.equals(paginatedAbilitySummaryList2));
        System.assert(paginatedAbilitySummaryList2.equals(paginatedAbilitySummaryList1));
        System.assert(paginatedAbilitySummaryList1.equals(paginatedAbilitySummaryList1));
        System.assert(paginatedAbilitySummaryList3.equals(paginatedAbilitySummaryList4));
        System.assert(paginatedAbilitySummaryList4.equals(paginatedAbilitySummaryList3));
        System.assert(paginatedAbilitySummaryList3.equals(paginatedAbilitySummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList1 = OASPaginatedAbilitySummaryList.getExample();
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList2 = OASPaginatedAbilitySummaryList.getExample();
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList3 = new OASPaginatedAbilitySummaryList();
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList4 = new OASPaginatedAbilitySummaryList();

        System.assert(paginatedAbilitySummaryList1.equals(paginatedAbilitySummaryList2));
        System.assert(paginatedAbilitySummaryList2.equals(paginatedAbilitySummaryList1));
        System.assert(paginatedAbilitySummaryList3.equals(paginatedAbilitySummaryList4));
        System.assert(paginatedAbilitySummaryList4.equals(paginatedAbilitySummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList1 = OASPaginatedAbilitySummaryList.getExample();
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList2 = new OASPaginatedAbilitySummaryList();

        System.assertEquals(false, paginatedAbilitySummaryList1.equals('foo'));
        System.assertEquals(false, paginatedAbilitySummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList1 = OASPaginatedAbilitySummaryList.getExample();
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList2 = new OASPaginatedAbilitySummaryList();
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList3;

        System.assertEquals(false, paginatedAbilitySummaryList1.equals(paginatedAbilitySummaryList3));
        System.assertEquals(false, paginatedAbilitySummaryList2.equals(paginatedAbilitySummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList1 = OASPaginatedAbilitySummaryList.getExample();
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList2 = new OASPaginatedAbilitySummaryList();

        System.assertEquals(paginatedAbilitySummaryList1.hashCode(), paginatedAbilitySummaryList1.hashCode());
        System.assertEquals(paginatedAbilitySummaryList2.hashCode(), paginatedAbilitySummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList1 = OASPaginatedAbilitySummaryList.getExample();
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList2 = OASPaginatedAbilitySummaryList.getExample();
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList3 = new OASPaginatedAbilitySummaryList();
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList4 = new OASPaginatedAbilitySummaryList();

        System.assert(paginatedAbilitySummaryList1.equals(paginatedAbilitySummaryList2));
        System.assert(paginatedAbilitySummaryList3.equals(paginatedAbilitySummaryList4));
        System.assertEquals(paginatedAbilitySummaryList1.hashCode(), paginatedAbilitySummaryList2.hashCode());
        System.assertEquals(paginatedAbilitySummaryList3.hashCode(), paginatedAbilitySummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedAbilitySummaryList paginatedAbilitySummaryList = new OASPaginatedAbilitySummaryList();
        System.assertEquals(new List<OASAbilitySummary>(), paginatedAbilitySummaryList.results);
        System.assertEquals(null, paginatedAbilitySummaryList.count);
        System.assertEquals(null, paginatedAbilitySummaryList.next);
        System.assertEquals(null, paginatedAbilitySummaryList.previous);
    }
}
