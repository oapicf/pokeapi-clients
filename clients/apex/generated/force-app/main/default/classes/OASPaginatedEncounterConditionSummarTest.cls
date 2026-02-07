@isTest
private class OASPaginatedEncounterConditionSummarTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList1 = OASPaginatedEncounterConditionSummar.getExample();
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList2 = paginatedEncounterConditionSummaryList1;
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList3 = new OASPaginatedEncounterConditionSummar();
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList4 = paginatedEncounterConditionSummaryList3;

        System.assert(paginatedEncounterConditionSummaryList1.equals(paginatedEncounterConditionSummaryList2));
        System.assert(paginatedEncounterConditionSummaryList2.equals(paginatedEncounterConditionSummaryList1));
        System.assert(paginatedEncounterConditionSummaryList1.equals(paginatedEncounterConditionSummaryList1));
        System.assert(paginatedEncounterConditionSummaryList3.equals(paginatedEncounterConditionSummaryList4));
        System.assert(paginatedEncounterConditionSummaryList4.equals(paginatedEncounterConditionSummaryList3));
        System.assert(paginatedEncounterConditionSummaryList3.equals(paginatedEncounterConditionSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList1 = OASPaginatedEncounterConditionSummar.getExample();
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList2 = OASPaginatedEncounterConditionSummar.getExample();
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList3 = new OASPaginatedEncounterConditionSummar();
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList4 = new OASPaginatedEncounterConditionSummar();

        System.assert(paginatedEncounterConditionSummaryList1.equals(paginatedEncounterConditionSummaryList2));
        System.assert(paginatedEncounterConditionSummaryList2.equals(paginatedEncounterConditionSummaryList1));
        System.assert(paginatedEncounterConditionSummaryList3.equals(paginatedEncounterConditionSummaryList4));
        System.assert(paginatedEncounterConditionSummaryList4.equals(paginatedEncounterConditionSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList1 = OASPaginatedEncounterConditionSummar.getExample();
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList2 = new OASPaginatedEncounterConditionSummar();

        System.assertEquals(false, paginatedEncounterConditionSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedEncounterConditionSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList1 = OASPaginatedEncounterConditionSummar.getExample();
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList2 = new OASPaginatedEncounterConditionSummar();
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList3;

        System.assertEquals(false, paginatedEncounterConditionSummaryList1.equals(paginatedEncounterConditionSummaryList3));
        System.assertEquals(false, paginatedEncounterConditionSummaryList2.equals(paginatedEncounterConditionSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList1 = OASPaginatedEncounterConditionSummar.getExample();
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList2 = new OASPaginatedEncounterConditionSummar();

        System.assertEquals(paginatedEncounterConditionSummaryList1.hashCode(), paginatedEncounterConditionSummaryList1.hashCode());
        System.assertEquals(paginatedEncounterConditionSummaryList2.hashCode(), paginatedEncounterConditionSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList1 = OASPaginatedEncounterConditionSummar.getExample();
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList2 = OASPaginatedEncounterConditionSummar.getExample();
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList3 = new OASPaginatedEncounterConditionSummar();
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList4 = new OASPaginatedEncounterConditionSummar();

        System.assert(paginatedEncounterConditionSummaryList1.equals(paginatedEncounterConditionSummaryList2));
        System.assert(paginatedEncounterConditionSummaryList3.equals(paginatedEncounterConditionSummaryList4));
        System.assertEquals(paginatedEncounterConditionSummaryList1.hashCode(), paginatedEncounterConditionSummaryList2.hashCode());
        System.assertEquals(paginatedEncounterConditionSummaryList3.hashCode(), paginatedEncounterConditionSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedEncounterConditionSummar paginatedEncounterConditionSummaryList = new OASPaginatedEncounterConditionSummar();
        System.assertEquals(new List<OASEncounterConditionSummary>(), paginatedEncounterConditionSummaryList.results);
        System.assertEquals(null, paginatedEncounterConditionSummaryList.count);
        System.assertEquals(null, paginatedEncounterConditionSummaryList.next);
        System.assertEquals(null, paginatedEncounterConditionSummaryList.previous);
    }
}
