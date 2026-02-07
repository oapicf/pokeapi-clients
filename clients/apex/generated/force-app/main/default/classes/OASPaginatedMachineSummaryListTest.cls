@isTest
private class OASPaginatedMachineSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedMachineSummaryList paginatedMachineSummaryList1 = OASPaginatedMachineSummaryList.getExample();
        OASPaginatedMachineSummaryList paginatedMachineSummaryList2 = paginatedMachineSummaryList1;
        OASPaginatedMachineSummaryList paginatedMachineSummaryList3 = new OASPaginatedMachineSummaryList();
        OASPaginatedMachineSummaryList paginatedMachineSummaryList4 = paginatedMachineSummaryList3;

        System.assert(paginatedMachineSummaryList1.equals(paginatedMachineSummaryList2));
        System.assert(paginatedMachineSummaryList2.equals(paginatedMachineSummaryList1));
        System.assert(paginatedMachineSummaryList1.equals(paginatedMachineSummaryList1));
        System.assert(paginatedMachineSummaryList3.equals(paginatedMachineSummaryList4));
        System.assert(paginatedMachineSummaryList4.equals(paginatedMachineSummaryList3));
        System.assert(paginatedMachineSummaryList3.equals(paginatedMachineSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedMachineSummaryList paginatedMachineSummaryList1 = OASPaginatedMachineSummaryList.getExample();
        OASPaginatedMachineSummaryList paginatedMachineSummaryList2 = OASPaginatedMachineSummaryList.getExample();
        OASPaginatedMachineSummaryList paginatedMachineSummaryList3 = new OASPaginatedMachineSummaryList();
        OASPaginatedMachineSummaryList paginatedMachineSummaryList4 = new OASPaginatedMachineSummaryList();

        System.assert(paginatedMachineSummaryList1.equals(paginatedMachineSummaryList2));
        System.assert(paginatedMachineSummaryList2.equals(paginatedMachineSummaryList1));
        System.assert(paginatedMachineSummaryList3.equals(paginatedMachineSummaryList4));
        System.assert(paginatedMachineSummaryList4.equals(paginatedMachineSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedMachineSummaryList paginatedMachineSummaryList1 = OASPaginatedMachineSummaryList.getExample();
        OASPaginatedMachineSummaryList paginatedMachineSummaryList2 = new OASPaginatedMachineSummaryList();

        System.assertEquals(false, paginatedMachineSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedMachineSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedMachineSummaryList paginatedMachineSummaryList1 = OASPaginatedMachineSummaryList.getExample();
        OASPaginatedMachineSummaryList paginatedMachineSummaryList2 = new OASPaginatedMachineSummaryList();
        OASPaginatedMachineSummaryList paginatedMachineSummaryList3;

        System.assertEquals(false, paginatedMachineSummaryList1.equals(paginatedMachineSummaryList3));
        System.assertEquals(false, paginatedMachineSummaryList2.equals(paginatedMachineSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedMachineSummaryList paginatedMachineSummaryList1 = OASPaginatedMachineSummaryList.getExample();
        OASPaginatedMachineSummaryList paginatedMachineSummaryList2 = new OASPaginatedMachineSummaryList();

        System.assertEquals(paginatedMachineSummaryList1.hashCode(), paginatedMachineSummaryList1.hashCode());
        System.assertEquals(paginatedMachineSummaryList2.hashCode(), paginatedMachineSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedMachineSummaryList paginatedMachineSummaryList1 = OASPaginatedMachineSummaryList.getExample();
        OASPaginatedMachineSummaryList paginatedMachineSummaryList2 = OASPaginatedMachineSummaryList.getExample();
        OASPaginatedMachineSummaryList paginatedMachineSummaryList3 = new OASPaginatedMachineSummaryList();
        OASPaginatedMachineSummaryList paginatedMachineSummaryList4 = new OASPaginatedMachineSummaryList();

        System.assert(paginatedMachineSummaryList1.equals(paginatedMachineSummaryList2));
        System.assert(paginatedMachineSummaryList3.equals(paginatedMachineSummaryList4));
        System.assertEquals(paginatedMachineSummaryList1.hashCode(), paginatedMachineSummaryList2.hashCode());
        System.assertEquals(paginatedMachineSummaryList3.hashCode(), paginatedMachineSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedMachineSummaryList paginatedMachineSummaryList = new OASPaginatedMachineSummaryList();
        System.assertEquals(new List<OASMachineSummary>(), paginatedMachineSummaryList.results);
        System.assertEquals(null, paginatedMachineSummaryList.count);
        System.assertEquals(null, paginatedMachineSummaryList.next);
        System.assertEquals(null, paginatedMachineSummaryList.previous);
    }
}
