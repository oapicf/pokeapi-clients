@isTest
private class OASEvolutionChainDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionChainDetail evolutionChainDetail1 = OASEvolutionChainDetail.getExample();
        OASEvolutionChainDetail evolutionChainDetail2 = evolutionChainDetail1;
        OASEvolutionChainDetail evolutionChainDetail3 = new OASEvolutionChainDetail();
        OASEvolutionChainDetail evolutionChainDetail4 = evolutionChainDetail3;

        System.assert(evolutionChainDetail1.equals(evolutionChainDetail2));
        System.assert(evolutionChainDetail2.equals(evolutionChainDetail1));
        System.assert(evolutionChainDetail1.equals(evolutionChainDetail1));
        System.assert(evolutionChainDetail3.equals(evolutionChainDetail4));
        System.assert(evolutionChainDetail4.equals(evolutionChainDetail3));
        System.assert(evolutionChainDetail3.equals(evolutionChainDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionChainDetail evolutionChainDetail1 = OASEvolutionChainDetail.getExample();
        OASEvolutionChainDetail evolutionChainDetail2 = OASEvolutionChainDetail.getExample();
        OASEvolutionChainDetail evolutionChainDetail3 = new OASEvolutionChainDetail();
        OASEvolutionChainDetail evolutionChainDetail4 = new OASEvolutionChainDetail();

        System.assert(evolutionChainDetail1.equals(evolutionChainDetail2));
        System.assert(evolutionChainDetail2.equals(evolutionChainDetail1));
        System.assert(evolutionChainDetail3.equals(evolutionChainDetail4));
        System.assert(evolutionChainDetail4.equals(evolutionChainDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionChainDetail evolutionChainDetail1 = OASEvolutionChainDetail.getExample();
        OASEvolutionChainDetail evolutionChainDetail2 = new OASEvolutionChainDetail();

        System.assertEquals(false, evolutionChainDetail1.equals('foo'));
        System.assertEquals(false, evolutionChainDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionChainDetail evolutionChainDetail1 = OASEvolutionChainDetail.getExample();
        OASEvolutionChainDetail evolutionChainDetail2 = new OASEvolutionChainDetail();
        OASEvolutionChainDetail evolutionChainDetail3;

        System.assertEquals(false, evolutionChainDetail1.equals(evolutionChainDetail3));
        System.assertEquals(false, evolutionChainDetail2.equals(evolutionChainDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionChainDetail evolutionChainDetail1 = OASEvolutionChainDetail.getExample();
        OASEvolutionChainDetail evolutionChainDetail2 = new OASEvolutionChainDetail();

        System.assertEquals(evolutionChainDetail1.hashCode(), evolutionChainDetail1.hashCode());
        System.assertEquals(evolutionChainDetail2.hashCode(), evolutionChainDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionChainDetail evolutionChainDetail1 = OASEvolutionChainDetail.getExample();
        OASEvolutionChainDetail evolutionChainDetail2 = OASEvolutionChainDetail.getExample();
        OASEvolutionChainDetail evolutionChainDetail3 = new OASEvolutionChainDetail();
        OASEvolutionChainDetail evolutionChainDetail4 = new OASEvolutionChainDetail();

        System.assert(evolutionChainDetail1.equals(evolutionChainDetail2));
        System.assert(evolutionChainDetail3.equals(evolutionChainDetail4));
        System.assertEquals(evolutionChainDetail1.hashCode(), evolutionChainDetail2.hashCode());
        System.assertEquals(evolutionChainDetail3.hashCode(), evolutionChainDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEvolutionChainDetail evolutionChainDetail = new OASEvolutionChainDetail();
        Map<String, String> x-property-mappings = evolutionChainDetail.getx-property-mappings();
        System.assertEquals('babyTriggerItem', x-property-mappings.get('baby_trigger_item'));
    }
}
