@isTest
private class OASPaginatedEncounterMethodSummaryLiTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList1 = OASPaginatedEncounterMethodSummaryLi.getExample();
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList2 = paginatedEncounterMethodSummaryList1;
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList3 = new OASPaginatedEncounterMethodSummaryLi();
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList4 = paginatedEncounterMethodSummaryList3;

        System.assert(paginatedEncounterMethodSummaryList1.equals(paginatedEncounterMethodSummaryList2));
        System.assert(paginatedEncounterMethodSummaryList2.equals(paginatedEncounterMethodSummaryList1));
        System.assert(paginatedEncounterMethodSummaryList1.equals(paginatedEncounterMethodSummaryList1));
        System.assert(paginatedEncounterMethodSummaryList3.equals(paginatedEncounterMethodSummaryList4));
        System.assert(paginatedEncounterMethodSummaryList4.equals(paginatedEncounterMethodSummaryList3));
        System.assert(paginatedEncounterMethodSummaryList3.equals(paginatedEncounterMethodSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList1 = OASPaginatedEncounterMethodSummaryLi.getExample();
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList2 = OASPaginatedEncounterMethodSummaryLi.getExample();
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList3 = new OASPaginatedEncounterMethodSummaryLi();
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList4 = new OASPaginatedEncounterMethodSummaryLi();

        System.assert(paginatedEncounterMethodSummaryList1.equals(paginatedEncounterMethodSummaryList2));
        System.assert(paginatedEncounterMethodSummaryList2.equals(paginatedEncounterMethodSummaryList1));
        System.assert(paginatedEncounterMethodSummaryList3.equals(paginatedEncounterMethodSummaryList4));
        System.assert(paginatedEncounterMethodSummaryList4.equals(paginatedEncounterMethodSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList1 = OASPaginatedEncounterMethodSummaryLi.getExample();
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList2 = new OASPaginatedEncounterMethodSummaryLi();

        System.assertEquals(false, paginatedEncounterMethodSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedEncounterMethodSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList1 = OASPaginatedEncounterMethodSummaryLi.getExample();
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList2 = new OASPaginatedEncounterMethodSummaryLi();
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList3;

        System.assertEquals(false, paginatedEncounterMethodSummaryList1.equals(paginatedEncounterMethodSummaryList3));
        System.assertEquals(false, paginatedEncounterMethodSummaryList2.equals(paginatedEncounterMethodSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList1 = OASPaginatedEncounterMethodSummaryLi.getExample();
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList2 = new OASPaginatedEncounterMethodSummaryLi();

        System.assertEquals(paginatedEncounterMethodSummaryList1.hashCode(), paginatedEncounterMethodSummaryList1.hashCode());
        System.assertEquals(paginatedEncounterMethodSummaryList2.hashCode(), paginatedEncounterMethodSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList1 = OASPaginatedEncounterMethodSummaryLi.getExample();
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList2 = OASPaginatedEncounterMethodSummaryLi.getExample();
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList3 = new OASPaginatedEncounterMethodSummaryLi();
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList4 = new OASPaginatedEncounterMethodSummaryLi();

        System.assert(paginatedEncounterMethodSummaryList1.equals(paginatedEncounterMethodSummaryList2));
        System.assert(paginatedEncounterMethodSummaryList3.equals(paginatedEncounterMethodSummaryList4));
        System.assertEquals(paginatedEncounterMethodSummaryList1.hashCode(), paginatedEncounterMethodSummaryList2.hashCode());
        System.assertEquals(paginatedEncounterMethodSummaryList3.hashCode(), paginatedEncounterMethodSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedEncounterMethodSummaryLi paginatedEncounterMethodSummaryList = new OASPaginatedEncounterMethodSummaryLi();
        System.assertEquals(new List<OASEncounterMethodSummary>(), paginatedEncounterMethodSummaryList.results);
        System.assertEquals(null, paginatedEncounterMethodSummaryList.count);
        System.assertEquals(null, paginatedEncounterMethodSummaryList.next);
        System.assertEquals(null, paginatedEncounterMethodSummaryList.previous);
    }
}
