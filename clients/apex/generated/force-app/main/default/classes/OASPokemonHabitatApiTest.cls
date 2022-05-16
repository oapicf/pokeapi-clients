@isTest
private class OASPokemonHabitatApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void pokemonHabitatListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASPokemonHabitatApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPokemonHabitatApi(new OASClient());

        api.pokemonHabitatList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void pokemonHabitatReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASPokemonHabitatApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPokemonHabitatApi(new OASClient());

        api.pokemonHabitatRead(params);
    }
}