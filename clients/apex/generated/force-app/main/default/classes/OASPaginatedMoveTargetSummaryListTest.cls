@isTest
private class OASPaginatedMoveTargetSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList1 = OASPaginatedMoveTargetSummaryList.getExample();
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList2 = paginatedMoveTargetSummaryList1;
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList3 = new OASPaginatedMoveTargetSummaryList();
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList4 = paginatedMoveTargetSummaryList3;

        System.assert(paginatedMoveTargetSummaryList1.equals(paginatedMoveTargetSummaryList2));
        System.assert(paginatedMoveTargetSummaryList2.equals(paginatedMoveTargetSummaryList1));
        System.assert(paginatedMoveTargetSummaryList1.equals(paginatedMoveTargetSummaryList1));
        System.assert(paginatedMoveTargetSummaryList3.equals(paginatedMoveTargetSummaryList4));
        System.assert(paginatedMoveTargetSummaryList4.equals(paginatedMoveTargetSummaryList3));
        System.assert(paginatedMoveTargetSummaryList3.equals(paginatedMoveTargetSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList1 = OASPaginatedMoveTargetSummaryList.getExample();
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList2 = OASPaginatedMoveTargetSummaryList.getExample();
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList3 = new OASPaginatedMoveTargetSummaryList();
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList4 = new OASPaginatedMoveTargetSummaryList();

        System.assert(paginatedMoveTargetSummaryList1.equals(paginatedMoveTargetSummaryList2));
        System.assert(paginatedMoveTargetSummaryList2.equals(paginatedMoveTargetSummaryList1));
        System.assert(paginatedMoveTargetSummaryList3.equals(paginatedMoveTargetSummaryList4));
        System.assert(paginatedMoveTargetSummaryList4.equals(paginatedMoveTargetSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList1 = OASPaginatedMoveTargetSummaryList.getExample();
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList2 = new OASPaginatedMoveTargetSummaryList();

        System.assertEquals(false, paginatedMoveTargetSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedMoveTargetSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList1 = OASPaginatedMoveTargetSummaryList.getExample();
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList2 = new OASPaginatedMoveTargetSummaryList();
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList3;

        System.assertEquals(false, paginatedMoveTargetSummaryList1.equals(paginatedMoveTargetSummaryList3));
        System.assertEquals(false, paginatedMoveTargetSummaryList2.equals(paginatedMoveTargetSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList1 = OASPaginatedMoveTargetSummaryList.getExample();
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList2 = new OASPaginatedMoveTargetSummaryList();

        System.assertEquals(paginatedMoveTargetSummaryList1.hashCode(), paginatedMoveTargetSummaryList1.hashCode());
        System.assertEquals(paginatedMoveTargetSummaryList2.hashCode(), paginatedMoveTargetSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList1 = OASPaginatedMoveTargetSummaryList.getExample();
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList2 = OASPaginatedMoveTargetSummaryList.getExample();
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList3 = new OASPaginatedMoveTargetSummaryList();
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList4 = new OASPaginatedMoveTargetSummaryList();

        System.assert(paginatedMoveTargetSummaryList1.equals(paginatedMoveTargetSummaryList2));
        System.assert(paginatedMoveTargetSummaryList3.equals(paginatedMoveTargetSummaryList4));
        System.assertEquals(paginatedMoveTargetSummaryList1.hashCode(), paginatedMoveTargetSummaryList2.hashCode());
        System.assertEquals(paginatedMoveTargetSummaryList3.hashCode(), paginatedMoveTargetSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedMoveTargetSummaryList paginatedMoveTargetSummaryList = new OASPaginatedMoveTargetSummaryList();
        System.assertEquals(new List<OASMoveTargetSummary>(), paginatedMoveTargetSummaryList.results);
        System.assertEquals(null, paginatedMoveTargetSummaryList.count);
        System.assertEquals(null, paginatedMoveTargetSummaryList.next);
        System.assertEquals(null, paginatedMoveTargetSummaryList.previous);
    }
}
