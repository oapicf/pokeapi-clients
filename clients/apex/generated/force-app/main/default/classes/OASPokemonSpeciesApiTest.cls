@isTest
private class OASPokemonSpeciesApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void pokemonSpeciesListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASPokemonSpeciesApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPokemonSpeciesApi(new OASClient());

        api.pokemonSpeciesList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void pokemonSpeciesReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASPokemonSpeciesApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASPokemonSpeciesApi(new OASClient());

        api.pokemonSpeciesRead(params);
    }
}