@isTest
private class OASPaginatedMoveLearnMethodSummaryLiTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList1 = OASPaginatedMoveLearnMethodSummaryLi.getExample();
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList2 = paginatedMoveLearnMethodSummaryList1;
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList3 = new OASPaginatedMoveLearnMethodSummaryLi();
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList4 = paginatedMoveLearnMethodSummaryList3;

        System.assert(paginatedMoveLearnMethodSummaryList1.equals(paginatedMoveLearnMethodSummaryList2));
        System.assert(paginatedMoveLearnMethodSummaryList2.equals(paginatedMoveLearnMethodSummaryList1));
        System.assert(paginatedMoveLearnMethodSummaryList1.equals(paginatedMoveLearnMethodSummaryList1));
        System.assert(paginatedMoveLearnMethodSummaryList3.equals(paginatedMoveLearnMethodSummaryList4));
        System.assert(paginatedMoveLearnMethodSummaryList4.equals(paginatedMoveLearnMethodSummaryList3));
        System.assert(paginatedMoveLearnMethodSummaryList3.equals(paginatedMoveLearnMethodSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList1 = OASPaginatedMoveLearnMethodSummaryLi.getExample();
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList2 = OASPaginatedMoveLearnMethodSummaryLi.getExample();
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList3 = new OASPaginatedMoveLearnMethodSummaryLi();
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList4 = new OASPaginatedMoveLearnMethodSummaryLi();

        System.assert(paginatedMoveLearnMethodSummaryList1.equals(paginatedMoveLearnMethodSummaryList2));
        System.assert(paginatedMoveLearnMethodSummaryList2.equals(paginatedMoveLearnMethodSummaryList1));
        System.assert(paginatedMoveLearnMethodSummaryList3.equals(paginatedMoveLearnMethodSummaryList4));
        System.assert(paginatedMoveLearnMethodSummaryList4.equals(paginatedMoveLearnMethodSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList1 = OASPaginatedMoveLearnMethodSummaryLi.getExample();
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList2 = new OASPaginatedMoveLearnMethodSummaryLi();

        System.assertEquals(false, paginatedMoveLearnMethodSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedMoveLearnMethodSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList1 = OASPaginatedMoveLearnMethodSummaryLi.getExample();
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList2 = new OASPaginatedMoveLearnMethodSummaryLi();
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList3;

        System.assertEquals(false, paginatedMoveLearnMethodSummaryList1.equals(paginatedMoveLearnMethodSummaryList3));
        System.assertEquals(false, paginatedMoveLearnMethodSummaryList2.equals(paginatedMoveLearnMethodSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList1 = OASPaginatedMoveLearnMethodSummaryLi.getExample();
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList2 = new OASPaginatedMoveLearnMethodSummaryLi();

        System.assertEquals(paginatedMoveLearnMethodSummaryList1.hashCode(), paginatedMoveLearnMethodSummaryList1.hashCode());
        System.assertEquals(paginatedMoveLearnMethodSummaryList2.hashCode(), paginatedMoveLearnMethodSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList1 = OASPaginatedMoveLearnMethodSummaryLi.getExample();
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList2 = OASPaginatedMoveLearnMethodSummaryLi.getExample();
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList3 = new OASPaginatedMoveLearnMethodSummaryLi();
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList4 = new OASPaginatedMoveLearnMethodSummaryLi();

        System.assert(paginatedMoveLearnMethodSummaryList1.equals(paginatedMoveLearnMethodSummaryList2));
        System.assert(paginatedMoveLearnMethodSummaryList3.equals(paginatedMoveLearnMethodSummaryList4));
        System.assertEquals(paginatedMoveLearnMethodSummaryList1.hashCode(), paginatedMoveLearnMethodSummaryList2.hashCode());
        System.assertEquals(paginatedMoveLearnMethodSummaryList3.hashCode(), paginatedMoveLearnMethodSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedMoveLearnMethodSummaryLi paginatedMoveLearnMethodSummaryList = new OASPaginatedMoveLearnMethodSummaryLi();
        System.assertEquals(new List<OASMoveLearnMethodSummary>(), paginatedMoveLearnMethodSummaryList.results);
        System.assertEquals(null, paginatedMoveLearnMethodSummaryList.count);
        System.assertEquals(null, paginatedMoveLearnMethodSummaryList.next);
        System.assertEquals(null, paginatedMoveLearnMethodSummaryList.previous);
    }
}
