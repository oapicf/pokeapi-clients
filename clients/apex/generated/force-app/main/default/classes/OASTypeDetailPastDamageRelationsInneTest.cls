@isTest
private class OASTypeDetailPastDamageRelationsInneTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner1 = OASTypeDetailPastDamageRelationsInne.getExample();
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner2 = typeDetailPastDamageRelationsInner1;
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner3 = new OASTypeDetailPastDamageRelationsInne();
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner4 = typeDetailPastDamageRelationsInner3;

        System.assert(typeDetailPastDamageRelationsInner1.equals(typeDetailPastDamageRelationsInner2));
        System.assert(typeDetailPastDamageRelationsInner2.equals(typeDetailPastDamageRelationsInner1));
        System.assert(typeDetailPastDamageRelationsInner1.equals(typeDetailPastDamageRelationsInner1));
        System.assert(typeDetailPastDamageRelationsInner3.equals(typeDetailPastDamageRelationsInner4));
        System.assert(typeDetailPastDamageRelationsInner4.equals(typeDetailPastDamageRelationsInner3));
        System.assert(typeDetailPastDamageRelationsInner3.equals(typeDetailPastDamageRelationsInner3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner1 = OASTypeDetailPastDamageRelationsInne.getExample();
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner2 = OASTypeDetailPastDamageRelationsInne.getExample();
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner3 = new OASTypeDetailPastDamageRelationsInne();
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner4 = new OASTypeDetailPastDamageRelationsInne();

        System.assert(typeDetailPastDamageRelationsInner1.equals(typeDetailPastDamageRelationsInner2));
        System.assert(typeDetailPastDamageRelationsInner2.equals(typeDetailPastDamageRelationsInner1));
        System.assert(typeDetailPastDamageRelationsInner3.equals(typeDetailPastDamageRelationsInner4));
        System.assert(typeDetailPastDamageRelationsInner4.equals(typeDetailPastDamageRelationsInner3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner1 = OASTypeDetailPastDamageRelationsInne.getExample();
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner2 = new OASTypeDetailPastDamageRelationsInne();

        System.assertEquals(false, typeDetailPastDamageRelationsInner1.equals('foo'));
        System.assertEquals(false, typeDetailPastDamageRelationsInner2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner1 = OASTypeDetailPastDamageRelationsInne.getExample();
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner2 = new OASTypeDetailPastDamageRelationsInne();
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner3;

        System.assertEquals(false, typeDetailPastDamageRelationsInner1.equals(typeDetailPastDamageRelationsInner3));
        System.assertEquals(false, typeDetailPastDamageRelationsInner2.equals(typeDetailPastDamageRelationsInner3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner1 = OASTypeDetailPastDamageRelationsInne.getExample();
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner2 = new OASTypeDetailPastDamageRelationsInne();

        System.assertEquals(typeDetailPastDamageRelationsInner1.hashCode(), typeDetailPastDamageRelationsInner1.hashCode());
        System.assertEquals(typeDetailPastDamageRelationsInner2.hashCode(), typeDetailPastDamageRelationsInner2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner1 = OASTypeDetailPastDamageRelationsInne.getExample();
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner2 = OASTypeDetailPastDamageRelationsInne.getExample();
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner3 = new OASTypeDetailPastDamageRelationsInne();
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner4 = new OASTypeDetailPastDamageRelationsInne();

        System.assert(typeDetailPastDamageRelationsInner1.equals(typeDetailPastDamageRelationsInner2));
        System.assert(typeDetailPastDamageRelationsInner3.equals(typeDetailPastDamageRelationsInner4));
        System.assertEquals(typeDetailPastDamageRelationsInner1.hashCode(), typeDetailPastDamageRelationsInner2.hashCode());
        System.assertEquals(typeDetailPastDamageRelationsInner3.hashCode(), typeDetailPastDamageRelationsInner4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTypeDetailPastDamageRelationsInne typeDetailPastDamageRelationsInner = new OASTypeDetailPastDamageRelationsInne();
        Map<String, String> x-property-mappings = typeDetailPastDamageRelationsInner.getx-property-mappings();
        System.assertEquals('damageRelations', x-property-mappings.get('damage_relations'));
    }
}
