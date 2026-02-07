@isTest
private class OASMovesApiTest {
    /**
     * List move meta ailments
     *
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     */
    @isTest
    private static void moveAilmentListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASMovesApi api;
        OASPaginatedMoveMetaAilmentSummaryLi response;
        OASPaginatedMoveMetaAilmentSummaryLi expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMovesApi(client);

        js = JSON.serialize(OASPaginatedMoveMetaAilmentSummaryLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveMetaAilmentSummaryLi.getExample();
        response = (OASPaginatedMoveMetaAilmentSummaryLi) api.moveAilmentList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMovesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedMoveMetaAilmentSummaryLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveMetaAilmentSummaryLi.getExample();
        response = (OASPaginatedMoveMetaAilmentSummaryLi) api.moveAilmentList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get move meta ailment
     *
     * Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.
     */
    @isTest
    private static void moveAilmentRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASMovesApi api;
        OASMoveMetaAilmentDetail response;
        OASMoveMetaAilmentDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMovesApi(client);

        js = JSON.serialize(OASMoveMetaAilmentDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveMetaAilmentDetail.getExample();
        response = (OASMoveMetaAilmentDetail) api.moveAilmentRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMovesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASMoveMetaAilmentDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveMetaAilmentDetail.getExample();
        response = (OASMoveMetaAilmentDetail) api.moveAilmentRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List move battle styles
     *
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     */
    @isTest
    private static void moveBattleStyleListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASMovesApi api;
        OASPaginatedMoveBattleStyleSummaryLi response;
        OASPaginatedMoveBattleStyleSummaryLi expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMovesApi(client);

        js = JSON.serialize(OASPaginatedMoveBattleStyleSummaryLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveBattleStyleSummaryLi.getExample();
        response = (OASPaginatedMoveBattleStyleSummaryLi) api.moveBattleStyleList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMovesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedMoveBattleStyleSummaryLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveBattleStyleSummaryLi.getExample();
        response = (OASPaginatedMoveBattleStyleSummaryLi) api.moveBattleStyleList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get move battle style
     *
     * Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.
     */
    @isTest
    private static void moveBattleStyleRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASMovesApi api;
        OASMoveBattleStyleDetail response;
        OASMoveBattleStyleDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMovesApi(client);

        js = JSON.serialize(OASMoveBattleStyleDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveBattleStyleDetail.getExample();
        response = (OASMoveBattleStyleDetail) api.moveBattleStyleRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMovesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASMoveBattleStyleDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveBattleStyleDetail.getExample();
        response = (OASMoveBattleStyleDetail) api.moveBattleStyleRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List move meta categories
     *
     * Very general categories that loosely group move effects.
     */
    @isTest
    private static void moveCategoryListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASMovesApi api;
        OASPaginatedMoveMetaCategorySummaryL response;
        OASPaginatedMoveMetaCategorySummaryL expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMovesApi(client);

        js = JSON.serialize(OASPaginatedMoveMetaCategorySummaryL.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveMetaCategorySummaryL.getExample();
        response = (OASPaginatedMoveMetaCategorySummaryL) api.moveCategoryList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMovesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedMoveMetaCategorySummaryL.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveMetaCategorySummaryL.getExample();
        response = (OASPaginatedMoveMetaCategorySummaryL) api.moveCategoryList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get move meta category
     *
     * Very general categories that loosely group move effects.
     */
    @isTest
    private static void moveCategoryRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASMovesApi api;
        OASMoveMetaCategoryDetail response;
        OASMoveMetaCategoryDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMovesApi(client);

        js = JSON.serialize(OASMoveMetaCategoryDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveMetaCategoryDetail.getExample();
        response = (OASMoveMetaCategoryDetail) api.moveCategoryRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMovesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASMoveMetaCategoryDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveMetaCategoryDetail.getExample();
        response = (OASMoveMetaCategoryDetail) api.moveCategoryRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List move learn methods
     *
     * Methods by which Pokémon can learn moves.
     */
    @isTest
    private static void moveLearnMethodListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASMovesApi api;
        OASPaginatedMoveLearnMethodSummaryLi response;
        OASPaginatedMoveLearnMethodSummaryLi expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMovesApi(client);

        js = JSON.serialize(OASPaginatedMoveLearnMethodSummaryLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveLearnMethodSummaryLi.getExample();
        response = (OASPaginatedMoveLearnMethodSummaryLi) api.moveLearnMethodList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMovesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedMoveLearnMethodSummaryLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveLearnMethodSummaryLi.getExample();
        response = (OASPaginatedMoveLearnMethodSummaryLi) api.moveLearnMethodList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get move learn method
     *
     * Methods by which Pokémon can learn moves.
     */
    @isTest
    private static void moveLearnMethodRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASMovesApi api;
        OASMoveLearnMethodDetail response;
        OASMoveLearnMethodDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMovesApi(client);

        js = JSON.serialize(OASMoveLearnMethodDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveLearnMethodDetail.getExample();
        response = (OASMoveLearnMethodDetail) api.moveLearnMethodRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMovesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASMoveLearnMethodDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveLearnMethodDetail.getExample();
        response = (OASMoveLearnMethodDetail) api.moveLearnMethodRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List moves
     *
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     */
    @isTest
    private static void moveListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASMovesApi api;
        OASPaginatedMoveSummaryList response;
        OASPaginatedMoveSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMovesApi(client);

        js = JSON.serialize(OASPaginatedMoveSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveSummaryList.getExample();
        response = (OASPaginatedMoveSummaryList) api.moveList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMovesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedMoveSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveSummaryList.getExample();
        response = (OASPaginatedMoveSummaryList) api.moveList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get move
     *
     * Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.
     */
    @isTest
    private static void moveRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASMovesApi api;
        OASMoveDetail response;
        OASMoveDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMovesApi(client);

        js = JSON.serialize(OASMoveDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveDetail.getExample();
        response = (OASMoveDetail) api.moveRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMovesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASMoveDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveDetail.getExample();
        response = (OASMoveDetail) api.moveRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List move targets
     *
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     */
    @isTest
    private static void moveTargetListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => '',
            'q' => 'null'
        };

        OASClient client;
        OASMovesApi api;
        OASPaginatedMoveTargetSummaryList response;
        OASPaginatedMoveTargetSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMovesApi(client);

        js = JSON.serialize(OASPaginatedMoveTargetSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveTargetSummaryList.getExample();
        response = (OASPaginatedMoveTargetSummaryList) api.moveTargetList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMovesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedMoveTargetSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMoveTargetSummaryList.getExample();
        response = (OASPaginatedMoveTargetSummaryList) api.moveTargetList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get move target
     *
     * Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.
     */
    @isTest
    private static void moveTargetRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASMovesApi api;
        OASMoveTargetDetail response;
        OASMoveTargetDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMovesApi(client);

        js = JSON.serialize(OASMoveTargetDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveTargetDetail.getExample();
        response = (OASMoveTargetDetail) api.moveTargetRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMovesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASMoveTargetDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMoveTargetDetail.getExample();
        response = (OASMoveTargetDetail) api.moveTargetRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }
}