@isTest
private class OASPaginatedPokemonFormSummaryListTest {
    @isTest
    private static void equalsSameInstance() {
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList1 = OASPaginatedPokemonFormSummaryList.getExample();
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList2 = paginatedPokemonFormSummaryList1;
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList3 = new OASPaginatedPokemonFormSummaryList();
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList4 = paginatedPokemonFormSummaryList3;

        System.assert(paginatedPokemonFormSummaryList1.equals(paginatedPokemonFormSummaryList2));
        System.assert(paginatedPokemonFormSummaryList2.equals(paginatedPokemonFormSummaryList1));
        System.assert(paginatedPokemonFormSummaryList1.equals(paginatedPokemonFormSummaryList1));
        System.assert(paginatedPokemonFormSummaryList3.equals(paginatedPokemonFormSummaryList4));
        System.assert(paginatedPokemonFormSummaryList4.equals(paginatedPokemonFormSummaryList3));
        System.assert(paginatedPokemonFormSummaryList3.equals(paginatedPokemonFormSummaryList3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList1 = OASPaginatedPokemonFormSummaryList.getExample();
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList2 = OASPaginatedPokemonFormSummaryList.getExample();
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList3 = new OASPaginatedPokemonFormSummaryList();
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList4 = new OASPaginatedPokemonFormSummaryList();

        System.assert(paginatedPokemonFormSummaryList1.equals(paginatedPokemonFormSummaryList2));
        System.assert(paginatedPokemonFormSummaryList2.equals(paginatedPokemonFormSummaryList1));
        System.assert(paginatedPokemonFormSummaryList3.equals(paginatedPokemonFormSummaryList4));
        System.assert(paginatedPokemonFormSummaryList4.equals(paginatedPokemonFormSummaryList3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList1 = OASPaginatedPokemonFormSummaryList.getExample();
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList2 = new OASPaginatedPokemonFormSummaryList();

        System.assertEquals(false, paginatedPokemonFormSummaryList1.equals('foo'));
        System.assertEquals(false, paginatedPokemonFormSummaryList2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList1 = OASPaginatedPokemonFormSummaryList.getExample();
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList2 = new OASPaginatedPokemonFormSummaryList();
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList3;

        System.assertEquals(false, paginatedPokemonFormSummaryList1.equals(paginatedPokemonFormSummaryList3));
        System.assertEquals(false, paginatedPokemonFormSummaryList2.equals(paginatedPokemonFormSummaryList3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList1 = OASPaginatedPokemonFormSummaryList.getExample();
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList2 = new OASPaginatedPokemonFormSummaryList();

        System.assertEquals(paginatedPokemonFormSummaryList1.hashCode(), paginatedPokemonFormSummaryList1.hashCode());
        System.assertEquals(paginatedPokemonFormSummaryList2.hashCode(), paginatedPokemonFormSummaryList2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList1 = OASPaginatedPokemonFormSummaryList.getExample();
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList2 = OASPaginatedPokemonFormSummaryList.getExample();
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList3 = new OASPaginatedPokemonFormSummaryList();
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList4 = new OASPaginatedPokemonFormSummaryList();

        System.assert(paginatedPokemonFormSummaryList1.equals(paginatedPokemonFormSummaryList2));
        System.assert(paginatedPokemonFormSummaryList3.equals(paginatedPokemonFormSummaryList4));
        System.assertEquals(paginatedPokemonFormSummaryList1.hashCode(), paginatedPokemonFormSummaryList2.hashCode());
        System.assertEquals(paginatedPokemonFormSummaryList3.hashCode(), paginatedPokemonFormSummaryList4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASPaginatedPokemonFormSummaryList paginatedPokemonFormSummaryList = new OASPaginatedPokemonFormSummaryList();
        System.assertEquals(new List<OASPokemonFormSummary>(), paginatedPokemonFormSummaryList.results);
        System.assertEquals(null, paginatedPokemonFormSummaryList.count);
        System.assertEquals(null, paginatedPokemonFormSummaryList.next);
        System.assertEquals(null, paginatedPokemonFormSummaryList.previous);
    }
}
