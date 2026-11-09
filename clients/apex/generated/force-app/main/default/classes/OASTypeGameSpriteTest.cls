@isTest
private class OASTypeGameSpriteTest {
    @isTest
    private static void equalsSameInstance() {
        OASTypeGameSprite typeGameSprite1 = OASTypeGameSprite.getExample();
        OASTypeGameSprite typeGameSprite2 = typeGameSprite1;
        OASTypeGameSprite typeGameSprite3 = new OASTypeGameSprite();
        OASTypeGameSprite typeGameSprite4 = typeGameSprite3;

        System.assert(typeGameSprite1.equals(typeGameSprite2));
        System.assert(typeGameSprite2.equals(typeGameSprite1));
        System.assert(typeGameSprite1.equals(typeGameSprite1));
        System.assert(typeGameSprite3.equals(typeGameSprite4));
        System.assert(typeGameSprite4.equals(typeGameSprite3));
        System.assert(typeGameSprite3.equals(typeGameSprite3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASTypeGameSprite typeGameSprite1 = OASTypeGameSprite.getExample();
        OASTypeGameSprite typeGameSprite2 = OASTypeGameSprite.getExample();
        OASTypeGameSprite typeGameSprite3 = new OASTypeGameSprite();
        OASTypeGameSprite typeGameSprite4 = new OASTypeGameSprite();

        System.assert(typeGameSprite1.equals(typeGameSprite2));
        System.assert(typeGameSprite2.equals(typeGameSprite1));
        System.assert(typeGameSprite3.equals(typeGameSprite4));
        System.assert(typeGameSprite4.equals(typeGameSprite3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASTypeGameSprite typeGameSprite1 = OASTypeGameSprite.getExample();
        OASTypeGameSprite typeGameSprite2 = new OASTypeGameSprite();

        System.assertEquals(false, typeGameSprite1.equals('foo'));
        System.assertEquals(false, typeGameSprite2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASTypeGameSprite typeGameSprite1 = OASTypeGameSprite.getExample();
        OASTypeGameSprite typeGameSprite2 = new OASTypeGameSprite();
        OASTypeGameSprite typeGameSprite3;

        System.assertEquals(false, typeGameSprite1.equals(typeGameSprite3));
        System.assertEquals(false, typeGameSprite2.equals(typeGameSprite3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASTypeGameSprite typeGameSprite1 = OASTypeGameSprite.getExample();
        OASTypeGameSprite typeGameSprite2 = new OASTypeGameSprite();

        System.assertEquals(typeGameSprite1.hashCode(), typeGameSprite1.hashCode());
        System.assertEquals(typeGameSprite2.hashCode(), typeGameSprite2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASTypeGameSprite typeGameSprite1 = OASTypeGameSprite.getExample();
        OASTypeGameSprite typeGameSprite2 = OASTypeGameSprite.getExample();
        OASTypeGameSprite typeGameSprite3 = new OASTypeGameSprite();
        OASTypeGameSprite typeGameSprite4 = new OASTypeGameSprite();

        System.assert(typeGameSprite1.equals(typeGameSprite2));
        System.assert(typeGameSprite3.equals(typeGameSprite4));
        System.assertEquals(typeGameSprite1.hashCode(), typeGameSprite2.hashCode());
        System.assertEquals(typeGameSprite3.hashCode(), typeGameSprite4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASTypeGameSprite typeGameSprite = new OASTypeGameSprite();
        Map<String, String> x-property-mappings = typeGameSprite.getx-property-mappings();
        System.assertEquals('nameIcon', x-property-mappings.get('name_icon'));
        System.assertEquals('symbolIcon', x-property-mappings.get('symbol_icon'));
    }
}
