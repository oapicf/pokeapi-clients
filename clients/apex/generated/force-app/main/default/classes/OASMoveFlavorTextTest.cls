@isTest
private class OASMoveFlavorTextTest {
    @isTest
    private static void equalsSameInstance() {
        OASMoveFlavorText moveFlavorText1 = OASMoveFlavorText.getExample();
        OASMoveFlavorText moveFlavorText2 = moveFlavorText1;
        OASMoveFlavorText moveFlavorText3 = new OASMoveFlavorText();
        OASMoveFlavorText moveFlavorText4 = moveFlavorText3;

        System.assert(moveFlavorText1.equals(moveFlavorText2));
        System.assert(moveFlavorText2.equals(moveFlavorText1));
        System.assert(moveFlavorText1.equals(moveFlavorText1));
        System.assert(moveFlavorText3.equals(moveFlavorText4));
        System.assert(moveFlavorText4.equals(moveFlavorText3));
        System.assert(moveFlavorText3.equals(moveFlavorText3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASMoveFlavorText moveFlavorText1 = OASMoveFlavorText.getExample();
        OASMoveFlavorText moveFlavorText2 = OASMoveFlavorText.getExample();
        OASMoveFlavorText moveFlavorText3 = new OASMoveFlavorText();
        OASMoveFlavorText moveFlavorText4 = new OASMoveFlavorText();

        System.assert(moveFlavorText1.equals(moveFlavorText2));
        System.assert(moveFlavorText2.equals(moveFlavorText1));
        System.assert(moveFlavorText3.equals(moveFlavorText4));
        System.assert(moveFlavorText4.equals(moveFlavorText3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASMoveFlavorText moveFlavorText1 = OASMoveFlavorText.getExample();
        OASMoveFlavorText moveFlavorText2 = new OASMoveFlavorText();

        System.assertEquals(false, moveFlavorText1.equals('foo'));
        System.assertEquals(false, moveFlavorText2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASMoveFlavorText moveFlavorText1 = OASMoveFlavorText.getExample();
        OASMoveFlavorText moveFlavorText2 = new OASMoveFlavorText();
        OASMoveFlavorText moveFlavorText3;

        System.assertEquals(false, moveFlavorText1.equals(moveFlavorText3));
        System.assertEquals(false, moveFlavorText2.equals(moveFlavorText3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASMoveFlavorText moveFlavorText1 = OASMoveFlavorText.getExample();
        OASMoveFlavorText moveFlavorText2 = new OASMoveFlavorText();

        System.assertEquals(moveFlavorText1.hashCode(), moveFlavorText1.hashCode());
        System.assertEquals(moveFlavorText2.hashCode(), moveFlavorText2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASMoveFlavorText moveFlavorText1 = OASMoveFlavorText.getExample();
        OASMoveFlavorText moveFlavorText2 = OASMoveFlavorText.getExample();
        OASMoveFlavorText moveFlavorText3 = new OASMoveFlavorText();
        OASMoveFlavorText moveFlavorText4 = new OASMoveFlavorText();

        System.assert(moveFlavorText1.equals(moveFlavorText2));
        System.assert(moveFlavorText3.equals(moveFlavorText4));
        System.assertEquals(moveFlavorText1.hashCode(), moveFlavorText2.hashCode());
        System.assertEquals(moveFlavorText3.hashCode(), moveFlavorText4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASMoveFlavorText moveFlavorText = new OASMoveFlavorText();
        Map<String, String> x-property-mappings = moveFlavorText.getx-property-mappings();
        System.assertEquals('flavorText', x-property-mappings.get('flavor_text'));
        System.assertEquals('versionGroup', x-property-mappings.get('version_group'));
    }
}
