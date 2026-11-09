@isTest
private class OASPokeapiMetaResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASPokeapiMetaResponse pokeapiMetaResponse1 = OASPokeapiMetaResponse.getExample();
        OASPokeapiMetaResponse pokeapiMetaResponse2 = pokeapiMetaResponse1;
        OASPokeapiMetaResponse pokeapiMetaResponse3 = new OASPokeapiMetaResponse();
        OASPokeapiMetaResponse pokeapiMetaResponse4 = pokeapiMetaResponse3;

        System.assert(pokeapiMetaResponse1.equals(pokeapiMetaResponse2));
        System.assert(pokeapiMetaResponse2.equals(pokeapiMetaResponse1));
        System.assert(pokeapiMetaResponse1.equals(pokeapiMetaResponse1));
        System.assert(pokeapiMetaResponse3.equals(pokeapiMetaResponse4));
        System.assert(pokeapiMetaResponse4.equals(pokeapiMetaResponse3));
        System.assert(pokeapiMetaResponse3.equals(pokeapiMetaResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASPokeapiMetaResponse pokeapiMetaResponse1 = OASPokeapiMetaResponse.getExample();
        OASPokeapiMetaResponse pokeapiMetaResponse2 = OASPokeapiMetaResponse.getExample();
        OASPokeapiMetaResponse pokeapiMetaResponse3 = new OASPokeapiMetaResponse();
        OASPokeapiMetaResponse pokeapiMetaResponse4 = new OASPokeapiMetaResponse();

        System.assert(pokeapiMetaResponse1.equals(pokeapiMetaResponse2));
        System.assert(pokeapiMetaResponse2.equals(pokeapiMetaResponse1));
        System.assert(pokeapiMetaResponse3.equals(pokeapiMetaResponse4));
        System.assert(pokeapiMetaResponse4.equals(pokeapiMetaResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASPokeapiMetaResponse pokeapiMetaResponse1 = OASPokeapiMetaResponse.getExample();
        OASPokeapiMetaResponse pokeapiMetaResponse2 = new OASPokeapiMetaResponse();

        System.assertEquals(false, pokeapiMetaResponse1.equals('foo'));
        System.assertEquals(false, pokeapiMetaResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASPokeapiMetaResponse pokeapiMetaResponse1 = OASPokeapiMetaResponse.getExample();
        OASPokeapiMetaResponse pokeapiMetaResponse2 = new OASPokeapiMetaResponse();
        OASPokeapiMetaResponse pokeapiMetaResponse3;

        System.assertEquals(false, pokeapiMetaResponse1.equals(pokeapiMetaResponse3));
        System.assertEquals(false, pokeapiMetaResponse2.equals(pokeapiMetaResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASPokeapiMetaResponse pokeapiMetaResponse1 = OASPokeapiMetaResponse.getExample();
        OASPokeapiMetaResponse pokeapiMetaResponse2 = new OASPokeapiMetaResponse();

        System.assertEquals(pokeapiMetaResponse1.hashCode(), pokeapiMetaResponse1.hashCode());
        System.assertEquals(pokeapiMetaResponse2.hashCode(), pokeapiMetaResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASPokeapiMetaResponse pokeapiMetaResponse1 = OASPokeapiMetaResponse.getExample();
        OASPokeapiMetaResponse pokeapiMetaResponse2 = OASPokeapiMetaResponse.getExample();
        OASPokeapiMetaResponse pokeapiMetaResponse3 = new OASPokeapiMetaResponse();
        OASPokeapiMetaResponse pokeapiMetaResponse4 = new OASPokeapiMetaResponse();

        System.assert(pokeapiMetaResponse1.equals(pokeapiMetaResponse2));
        System.assert(pokeapiMetaResponse3.equals(pokeapiMetaResponse4));
        System.assertEquals(pokeapiMetaResponse1.hashCode(), pokeapiMetaResponse2.hashCode());
        System.assertEquals(pokeapiMetaResponse3.hashCode(), pokeapiMetaResponse4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASPokeapiMetaResponse pokeapiMetaResponse = new OASPokeapiMetaResponse();
        Map<String, String> x-property-mappings = pokeapiMetaResponse.getx-property-mappings();
        System.assertEquals('deployDate', x-property-mappings.get('deploy_date'));
    }
}
