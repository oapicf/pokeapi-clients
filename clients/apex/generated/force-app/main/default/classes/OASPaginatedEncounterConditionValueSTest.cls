@isTest
private class OASPaginatedEncounterConditionValueSTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList1 = OASPaginatedEncounterConditionValueS.getExample();
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList2 = paginatedEncounterConditionValueSummaryList1;
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList3 = new OASPaginatedEncounterConditionValueS();
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList4 = paginatedEncounterConditionValueSummaryList3;

        System.assert(paginatedEncounterConditionValueSummaryList1.equals(paginatedEncounterConditionValueSummaryList2));
        System.assert(paginatedEncounterConditionValueSummaryList2.equals(paginatedEncounterConditionValueSummaryList1));
        System.assert(paginatedEncounterConditionValueSummaryList1.equals(paginatedEncounterConditionValueSummaryList1));
        System.assert(paginatedEncounterConditionValueSummaryList3.equals(paginatedEncounterConditionValueSummaryList4));
        System.assert(paginatedEncounterConditionValueSummaryList4.equals(paginatedEncounterConditionValueSummaryList3));
        System.assert(paginatedEncounterConditionValueSummaryList3.equals(paginatedEncounterConditionValueSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList1 = OASPaginatedEncounterConditionValueS.getExample();
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList2 = OASPaginatedEncounterConditionValueS.getExample();
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList3 = new OASPaginatedEncounterConditionValueS();
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList4 = new OASPaginatedEncounterConditionValueS();

        System.assert(paginatedEncounterConditionValueSummaryList1.equals(paginatedEncounterConditionValueSummaryList2));
        System.assert(paginatedEncounterConditionValueSummaryList2.equals(paginatedEncounterConditionValueSummaryList1));
        System.assert(paginatedEncounterConditionValueSummaryList3.equals(paginatedEncounterConditionValueSummaryList4));
        System.assert(paginatedEncounterConditionValueSummaryList4.equals(paginatedEncounterConditionValueSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList1 = OASPaginatedEncounterConditionValueS.getExample();
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList2 = new OASPaginatedEncounterConditionValueS();

        System.assertEquals(false, paginatedEncounterConditionValueSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedEncounterConditionValueSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList1 = OASPaginatedEncounterConditionValueS.getExample();
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList2 = new OASPaginatedEncounterConditionValueS();
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList3;

        System.assertEquals(false, paginatedEncounterConditionValueSummaryList1.equals(paginatedEncounterConditionValueSummaryList3));
        System.assertEquals(false, paginatedEncounterConditionValueSummaryList2.equals(paginatedEncounterConditionValueSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList1 = OASPaginatedEncounterConditionValueS.getExample();
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList2 = new OASPaginatedEncounterConditionValueS();

        System.assertEquals(paginatedEncounterConditionValueSummaryList1.hashCode(), paginatedEncounterConditionValueSummaryList1.hashCode());
        System.assertEquals(paginatedEncounterConditionValueSummaryList2.hashCode(), paginatedEncounterConditionValueSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList1 = OASPaginatedEncounterConditionValueS.getExample();
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList2 = OASPaginatedEncounterConditionValueS.getExample();
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList3 = new OASPaginatedEncounterConditionValueS();
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList4 = new OASPaginatedEncounterConditionValueS();

        System.assert(paginatedEncounterConditionValueSummaryList1.equals(paginatedEncounterConditionValueSummaryList2));
        System.assert(paginatedEncounterConditionValueSummaryList3.equals(paginatedEncounterConditionValueSummaryList4));
        System.assertEquals(paginatedEncounterConditionValueSummaryList1.hashCode(), paginatedEncounterConditionValueSummaryList2.hashCode());
        System.assertEquals(paginatedEncounterConditionValueSummaryList3.hashCode(), paginatedEncounterConditionValueSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedEncounterConditionValueS paginatedEncounterConditionValueSummaryList = new OASPaginatedEncounterConditionValueS();
        System.assertEquals(new List<OASEncounterConditionValueSummary>(), paginatedEncounterConditionValueSummaryList.results);
        System.assertEquals(null, paginatedEncounterConditionValueSummaryList.count);
        System.assertEquals(null, paginatedEncounterConditionValueSummaryList.next);
        System.assertEquals(null, paginatedEncounterConditionValueSummaryList.previous);
    }
}
