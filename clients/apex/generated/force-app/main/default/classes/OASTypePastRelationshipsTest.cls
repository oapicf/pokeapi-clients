@isTest
private class OASTypePastRelationshipsTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypePastRelationships typePastRelationships1 = OASTypePastRelationships.getExample();
        OASTypePastRelationships typePastRelationships2 = typePastRelationships1;
        OASTypePastRelationships typePastRelationships3 = new OASTypePastRelationships();
        OASTypePastRelationships typePastRelationships4 = typePastRelationships3;

        System.assert(typePastRelationships1.equals(typePastRelationships2));
        System.assert(typePastRelationships2.equals(typePastRelationships1));
        System.assert(typePastRelationships1.equals(typePastRelationships1));
        System.assert(typePastRelationships3.equals(typePastRelationships4));
        System.assert(typePastRelationships4.equals(typePastRelationships3));
        System.assert(typePastRelationships3.equals(typePastRelationships3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypePastRelationships typePastRelationships1 = OASTypePastRelationships.getExample();
        OASTypePastRelationships typePastRelationships2 = OASTypePastRelationships.getExample();
        OASTypePastRelationships typePastRelationships3 = new OASTypePastRelationships();
        OASTypePastRelationships typePastRelationships4 = new OASTypePastRelationships();

        System.assert(typePastRelationships1.equals(typePastRelationships2));
        System.assert(typePastRelationships2.equals(typePastRelationships1));
        System.assert(typePastRelationships3.equals(typePastRelationships4));
        System.assert(typePastRelationships4.equals(typePastRelationships3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypePastRelationships typePastRelationships1 = OASTypePastRelationships.getExample();
        OASTypePastRelationships typePastRelationships2 = new OASTypePastRelationships();

        System.assertEquals(false, typePastRelationships1.equals('foo'));
        System.assertEquals(false, typePastRelationships2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypePastRelationships typePastRelationships1 = OASTypePastRelationships.getExample();
        OASTypePastRelationships typePastRelationships2 = new OASTypePastRelationships();
        OASTypePastRelationships typePastRelationships3;

        System.assertEquals(false, typePastRelationships1.equals(typePastRelationships3));
        System.assertEquals(false, typePastRelationships2.equals(typePastRelationships3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypePastRelationships typePastRelationships1 = OASTypePastRelationships.getExample();
        OASTypePastRelationships typePastRelationships2 = new OASTypePastRelationships();

        System.assertEquals(typePastRelationships1.hashCode(), typePastRelationships1.hashCode());
        System.assertEquals(typePastRelationships2.hashCode(), typePastRelationships2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypePastRelationships typePastRelationships1 = OASTypePastRelationships.getExample();
        OASTypePastRelationships typePastRelationships2 = OASTypePastRelationships.getExample();
        OASTypePastRelationships typePastRelationships3 = new OASTypePastRelationships();
        OASTypePastRelationships typePastRelationships4 = new OASTypePastRelationships();

        System.assert(typePastRelationships1.equals(typePastRelationships2));
        System.assert(typePastRelationships3.equals(typePastRelationships4));
        System.assertEquals(typePastRelationships1.hashCode(), typePastRelationships2.hashCode());
        System.assertEquals(typePastRelationships3.hashCode(), typePastRelationships4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTypePastRelationships typePastRelationships = new OASTypePastRelationships();
        Map<String, String> x-property-mappings = typePastRelationships.getx-property-mappings();
        System.assertEquals('damageRelations', x-property-mappings.get('damage_relations'));
    }
}
