@isTest
private class OASTypeDetailSpritesValueValueTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue1 = OASTypeDetailSpritesValueValue.getExample();
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue2 = typeDetailSpritesValueValue1;
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue3 = new OASTypeDetailSpritesValueValue();
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue4 = typeDetailSpritesValueValue3;

        System.assert(typeDetailSpritesValueValue1.equals(typeDetailSpritesValueValue2));
        System.assert(typeDetailSpritesValueValue2.equals(typeDetailSpritesValueValue1));
        System.assert(typeDetailSpritesValueValue1.equals(typeDetailSpritesValueValue1));
        System.assert(typeDetailSpritesValueValue3.equals(typeDetailSpritesValueValue4));
        System.assert(typeDetailSpritesValueValue4.equals(typeDetailSpritesValueValue3));
        System.assert(typeDetailSpritesValueValue3.equals(typeDetailSpritesValueValue3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue1 = OASTypeDetailSpritesValueValue.getExample();
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue2 = OASTypeDetailSpritesValueValue.getExample();
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue3 = new OASTypeDetailSpritesValueValue();
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue4 = new OASTypeDetailSpritesValueValue();

        System.assert(typeDetailSpritesValueValue1.equals(typeDetailSpritesValueValue2));
        System.assert(typeDetailSpritesValueValue2.equals(typeDetailSpritesValueValue1));
        System.assert(typeDetailSpritesValueValue3.equals(typeDetailSpritesValueValue4));
        System.assert(typeDetailSpritesValueValue4.equals(typeDetailSpritesValueValue3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue1 = OASTypeDetailSpritesValueValue.getExample();
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue2 = new OASTypeDetailSpritesValueValue();

        System.assertEquals(false, typeDetailSpritesValueValue1.equals('foo'));
        System.assertEquals(false, typeDetailSpritesValueValue2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue1 = OASTypeDetailSpritesValueValue.getExample();
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue2 = new OASTypeDetailSpritesValueValue();
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue3;

        System.assertEquals(false, typeDetailSpritesValueValue1.equals(typeDetailSpritesValueValue3));
        System.assertEquals(false, typeDetailSpritesValueValue2.equals(typeDetailSpritesValueValue3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue1 = OASTypeDetailSpritesValueValue.getExample();
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue2 = new OASTypeDetailSpritesValueValue();

        System.assertEquals(typeDetailSpritesValueValue1.hashCode(), typeDetailSpritesValueValue1.hashCode());
        System.assertEquals(typeDetailSpritesValueValue2.hashCode(), typeDetailSpritesValueValue2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue1 = OASTypeDetailSpritesValueValue.getExample();
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue2 = OASTypeDetailSpritesValueValue.getExample();
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue3 = new OASTypeDetailSpritesValueValue();
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue4 = new OASTypeDetailSpritesValueValue();

        System.assert(typeDetailSpritesValueValue1.equals(typeDetailSpritesValueValue2));
        System.assert(typeDetailSpritesValueValue3.equals(typeDetailSpritesValueValue4));
        System.assertEquals(typeDetailSpritesValueValue1.hashCode(), typeDetailSpritesValueValue2.hashCode());
        System.assertEquals(typeDetailSpritesValueValue3.hashCode(), typeDetailSpritesValueValue4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTypeDetailSpritesValueValue typeDetailSpritesValueValue = new OASTypeDetailSpritesValueValue();
        Map<String, String> x-property-mappings = typeDetailSpritesValueValue.getx-property-mappings();
        System.assertEquals('nameIcon', x-property-mappings.get('name-icon'));
    }
}
