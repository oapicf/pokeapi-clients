@isTest
private class OASEvolutionVariableDetailTest {
    @isTest
    private static void equalsSameInstance() {
        OASEvolutionVariableDetail evolutionVariableDetail1 = OASEvolutionVariableDetail.getExample();
        OASEvolutionVariableDetail evolutionVariableDetail2 = evolutionVariableDetail1;
        OASEvolutionVariableDetail evolutionVariableDetail3 = new OASEvolutionVariableDetail();
        OASEvolutionVariableDetail evolutionVariableDetail4 = evolutionVariableDetail3;

        System.assert(evolutionVariableDetail1.equals(evolutionVariableDetail2));
        System.assert(evolutionVariableDetail2.equals(evolutionVariableDetail1));
        System.assert(evolutionVariableDetail1.equals(evolutionVariableDetail1));
        System.assert(evolutionVariableDetail3.equals(evolutionVariableDetail4));
        System.assert(evolutionVariableDetail4.equals(evolutionVariableDetail3));
        System.assert(evolutionVariableDetail3.equals(evolutionVariableDetail3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASEvolutionVariableDetail evolutionVariableDetail1 = OASEvolutionVariableDetail.getExample();
        OASEvolutionVariableDetail evolutionVariableDetail2 = OASEvolutionVariableDetail.getExample();
        OASEvolutionVariableDetail evolutionVariableDetail3 = new OASEvolutionVariableDetail();
        OASEvolutionVariableDetail evolutionVariableDetail4 = new OASEvolutionVariableDetail();

        System.assert(evolutionVariableDetail1.equals(evolutionVariableDetail2));
        System.assert(evolutionVariableDetail2.equals(evolutionVariableDetail1));
        System.assert(evolutionVariableDetail3.equals(evolutionVariableDetail4));
        System.assert(evolutionVariableDetail4.equals(evolutionVariableDetail3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASEvolutionVariableDetail evolutionVariableDetail1 = OASEvolutionVariableDetail.getExample();
        OASEvolutionVariableDetail evolutionVariableDetail2 = new OASEvolutionVariableDetail();

        System.assertEquals(false, evolutionVariableDetail1.equals('foo'));
        System.assertEquals(false, evolutionVariableDetail2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASEvolutionVariableDetail evolutionVariableDetail1 = OASEvolutionVariableDetail.getExample();
        OASEvolutionVariableDetail evolutionVariableDetail2 = new OASEvolutionVariableDetail();
        OASEvolutionVariableDetail evolutionVariableDetail3;

        System.assertEquals(false, evolutionVariableDetail1.equals(evolutionVariableDetail3));
        System.assertEquals(false, evolutionVariableDetail2.equals(evolutionVariableDetail3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASEvolutionVariableDetail evolutionVariableDetail1 = OASEvolutionVariableDetail.getExample();
        OASEvolutionVariableDetail evolutionVariableDetail2 = new OASEvolutionVariableDetail();

        System.assertEquals(evolutionVariableDetail1.hashCode(), evolutionVariableDetail1.hashCode());
        System.assertEquals(evolutionVariableDetail2.hashCode(), evolutionVariableDetail2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASEvolutionVariableDetail evolutionVariableDetail1 = OASEvolutionVariableDetail.getExample();
        OASEvolutionVariableDetail evolutionVariableDetail2 = OASEvolutionVariableDetail.getExample();
        OASEvolutionVariableDetail evolutionVariableDetail3 = new OASEvolutionVariableDetail();
        OASEvolutionVariableDetail evolutionVariableDetail4 = new OASEvolutionVariableDetail();

        System.assert(evolutionVariableDetail1.equals(evolutionVariableDetail2));
        System.assert(evolutionVariableDetail3.equals(evolutionVariableDetail4));
        System.assertEquals(evolutionVariableDetail1.hashCode(), evolutionVariableDetail2.hashCode());
        System.assertEquals(evolutionVariableDetail3.hashCode(), evolutionVariableDetail4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASEvolutionVariableDetail evolutionVariableDetail = new OASEvolutionVariableDetail();
        Map<String, String> x-property-mappings = evolutionVariableDetail.getx-property-mappings();
        System.assertEquals('dataType', x-property-mappings.get('data_type'));
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASEvolutionVariableDetail evolutionVariableDetail = new OASEvolutionVariableDetail();
        System.assertEquals(new List<OASEvolutionVariableName>(), evolutionVariableDetail.names);
        System.assertEquals(new List<OASEvolutionVariableDescription>(), evolutionVariableDetail.descriptions);
        System.assertEquals(null, evolutionVariableDetail.id);
        System.assertEquals(null, evolutionVariableDetail.name);
        System.assertEquals(null, evolutionVariableDetail.symbol);
        System.assertEquals(null, evolutionVariableDetail.dataType);
        System.assertEquals(null, evolutionVariableDetail.source);
        System.assertEquals(null, evolutionVariableDetail.versionGroup);
    }
}
