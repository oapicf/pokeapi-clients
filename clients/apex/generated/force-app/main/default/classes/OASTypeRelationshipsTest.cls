@isTest
private class OASTypeRelationshipsTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypeRelationships typeRelationships1 = OASTypeRelationships.getExample();
        OASTypeRelationships typeRelationships2 = typeRelationships1;
        OASTypeRelationships typeRelationships3 = new OASTypeRelationships();
        OASTypeRelationships typeRelationships4 = typeRelationships3;

        System.assert(typeRelationships1.equals(typeRelationships2));
        System.assert(typeRelationships2.equals(typeRelationships1));
        System.assert(typeRelationships1.equals(typeRelationships1));
        System.assert(typeRelationships3.equals(typeRelationships4));
        System.assert(typeRelationships4.equals(typeRelationships3));
        System.assert(typeRelationships3.equals(typeRelationships3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypeRelationships typeRelationships1 = OASTypeRelationships.getExample();
        OASTypeRelationships typeRelationships2 = OASTypeRelationships.getExample();
        OASTypeRelationships typeRelationships3 = new OASTypeRelationships();
        OASTypeRelationships typeRelationships4 = new OASTypeRelationships();

        System.assert(typeRelationships1.equals(typeRelationships2));
        System.assert(typeRelationships2.equals(typeRelationships1));
        System.assert(typeRelationships3.equals(typeRelationships4));
        System.assert(typeRelationships4.equals(typeRelationships3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypeRelationships typeRelationships1 = OASTypeRelationships.getExample();
        OASTypeRelationships typeRelationships2 = new OASTypeRelationships();

        System.assertEquals(false, typeRelationships1.equals('foo'));
        System.assertEquals(false, typeRelationships2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypeRelationships typeRelationships1 = OASTypeRelationships.getExample();
        OASTypeRelationships typeRelationships2 = new OASTypeRelationships();
        OASTypeRelationships typeRelationships3;

        System.assertEquals(false, typeRelationships1.equals(typeRelationships3));
        System.assertEquals(false, typeRelationships2.equals(typeRelationships3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypeRelationships typeRelationships1 = OASTypeRelationships.getExample();
        OASTypeRelationships typeRelationships2 = new OASTypeRelationships();

        System.assertEquals(typeRelationships1.hashCode(), typeRelationships1.hashCode());
        System.assertEquals(typeRelationships2.hashCode(), typeRelationships2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypeRelationships typeRelationships1 = OASTypeRelationships.getExample();
        OASTypeRelationships typeRelationships2 = OASTypeRelationships.getExample();
        OASTypeRelationships typeRelationships3 = new OASTypeRelationships();
        OASTypeRelationships typeRelationships4 = new OASTypeRelationships();

        System.assert(typeRelationships1.equals(typeRelationships2));
        System.assert(typeRelationships3.equals(typeRelationships4));
        System.assertEquals(typeRelationships1.hashCode(), typeRelationships2.hashCode());
        System.assertEquals(typeRelationships3.hashCode(), typeRelationships4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTypeRelationships typeRelationships = new OASTypeRelationships();
        Map<String, String> x-property-mappings = typeRelationships.getx-property-mappings();
        System.assertEquals('noDamageTo', x-property-mappings.get('no_damage_to'));
        System.assertEquals('halfDamageTo', x-property-mappings.get('half_damage_to'));
        System.assertEquals('doubleDamageTo', x-property-mappings.get('double_damage_to'));
        System.assertEquals('noDamageFrom', x-property-mappings.get('no_damage_from'));
        System.assertEquals('halfDamageFrom', x-property-mappings.get('half_damage_from'));
        System.assertEquals('doubleDamageFrom', x-property-mappings.get('double_damage_from'));
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASTypeRelationships typeRelationships = new OASTypeRelationships();
        System.assertEquals(new List<OASTypeSummary>(), typeRelationships.noDamageTo);
        System.assertEquals(new List<OASTypeSummary>(), typeRelationships.halfDamageTo);
        System.assertEquals(new List<OASTypeSummary>(), typeRelationships.doubleDamageTo);
        System.assertEquals(new List<OASTypeSummary>(), typeRelationships.noDamageFrom);
        System.assertEquals(new List<OASTypeSummary>(), typeRelationships.halfDamageFrom);
        System.assertEquals(new List<OASTypeSummary>(), typeRelationships.doubleDamageFrom);
    }
}
