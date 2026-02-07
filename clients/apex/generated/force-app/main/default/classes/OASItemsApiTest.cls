@isTest
private class OASItemsApiTest {
    /**
     * List item attributes
     *
     * Item attributes define particular aspects of items, e.g.&quot;usable in battle&quot; or &quot;consumable&quot;.
     */
    @isTest
    private static void itemAttributeListTest() {
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
        OASItemsApi api;
        OASPaginatedItemAttributeSummaryList response;
        OASPaginatedItemAttributeSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASItemsApi(client);

        js = JSON.serialize(OASPaginatedItemAttributeSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedItemAttributeSummaryList.getExample();
        response = (OASPaginatedItemAttributeSummaryList) api.itemAttributeList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASItemsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedItemAttributeSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedItemAttributeSummaryList.getExample();
        response = (OASPaginatedItemAttributeSummaryList) api.itemAttributeList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get item attribute
     *
     * Item attributes define particular aspects of items, e.g.&quot;usable in battle&quot; or &quot;consumable&quot;.
     */
    @isTest
    private static void itemAttributeRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASItemsApi api;
        OASItemAttributeDetail response;
        OASItemAttributeDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASItemsApi(client);

        js = JSON.serialize(OASItemAttributeDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemAttributeDetail.getExample();
        response = (OASItemAttributeDetail) api.itemAttributeRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASItemsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASItemAttributeDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemAttributeDetail.getExample();
        response = (OASItemAttributeDetail) api.itemAttributeRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List item categories
     *
     * Item categories determine where items will be placed in the players bag.
     */
    @isTest
    private static void itemCategoryListTest() {
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
        OASItemsApi api;
        OASPaginatedItemCategorySummaryList response;
        OASPaginatedItemCategorySummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASItemsApi(client);

        js = JSON.serialize(OASPaginatedItemCategorySummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedItemCategorySummaryList.getExample();
        response = (OASPaginatedItemCategorySummaryList) api.itemCategoryList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASItemsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedItemCategorySummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedItemCategorySummaryList.getExample();
        response = (OASPaginatedItemCategorySummaryList) api.itemCategoryList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get item category
     *
     * Item categories determine where items will be placed in the players bag.
     */
    @isTest
    private static void itemCategoryRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASItemsApi api;
        OASItemCategoryDetail response;
        OASItemCategoryDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASItemsApi(client);

        js = JSON.serialize(OASItemCategoryDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemCategoryDetail.getExample();
        response = (OASItemCategoryDetail) api.itemCategoryRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASItemsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASItemCategoryDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemCategoryDetail.getExample();
        response = (OASItemCategoryDetail) api.itemCategoryRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List item fling effects
     *
     * The various effects of the move&quot;Fling&quot; when used with different items.
     */
    @isTest
    private static void itemFlingEffectListTest() {
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
        OASItemsApi api;
        OASPaginatedItemFlingEffectSummaryLi response;
        OASPaginatedItemFlingEffectSummaryLi expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASItemsApi(client);

        js = JSON.serialize(OASPaginatedItemFlingEffectSummaryLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedItemFlingEffectSummaryLi.getExample();
        response = (OASPaginatedItemFlingEffectSummaryLi) api.itemFlingEffectList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASItemsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedItemFlingEffectSummaryLi.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedItemFlingEffectSummaryLi.getExample();
        response = (OASPaginatedItemFlingEffectSummaryLi) api.itemFlingEffectList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get item fling effect
     *
     * The various effects of the move&quot;Fling&quot; when used with different items.
     */
    @isTest
    private static void itemFlingEffectRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASItemsApi api;
        OASItemFlingEffectDetail response;
        OASItemFlingEffectDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASItemsApi(client);

        js = JSON.serialize(OASItemFlingEffectDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemFlingEffectDetail.getExample();
        response = (OASItemFlingEffectDetail) api.itemFlingEffectRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASItemsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASItemFlingEffectDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemFlingEffectDetail.getExample();
        response = (OASItemFlingEffectDetail) api.itemFlingEffectRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List items
     *
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     */
    @isTest
    private static void itemListTest() {
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
        OASItemsApi api;
        OASPaginatedItemSummaryList response;
        OASPaginatedItemSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASItemsApi(client);

        js = JSON.serialize(OASPaginatedItemSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedItemSummaryList.getExample();
        response = (OASPaginatedItemSummaryList) api.itemList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASItemsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedItemSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedItemSummaryList.getExample();
        response = (OASPaginatedItemSummaryList) api.itemList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * List item pockets
     *
     * Pockets within the players bag used for storing items by category.
     */
    @isTest
    private static void itemPocketListTest() {
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
        OASItemsApi api;
        OASPaginatedItemPocketSummaryList response;
        OASPaginatedItemPocketSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASItemsApi(client);

        js = JSON.serialize(OASPaginatedItemPocketSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedItemPocketSummaryList.getExample();
        response = (OASPaginatedItemPocketSummaryList) api.itemPocketList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASItemsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedItemPocketSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedItemPocketSummaryList.getExample();
        response = (OASPaginatedItemPocketSummaryList) api.itemPocketList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get item pocket
     *
     * Pockets within the players bag used for storing items by category.
     */
    @isTest
    private static void itemPocketRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASItemsApi api;
        OASItemPocketDetail response;
        OASItemPocketDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASItemsApi(client);

        js = JSON.serialize(OASItemPocketDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemPocketDetail.getExample();
        response = (OASItemPocketDetail) api.itemPocketRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASItemsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASItemPocketDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemPocketDetail.getExample();
        response = (OASItemPocketDetail) api.itemPocketRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get item
     *
     * An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.
     */
    @isTest
    private static void itemRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASItemsApi api;
        OASItemDetail response;
        OASItemDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASItemsApi(client);

        js = JSON.serialize(OASItemDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemDetail.getExample();
        response = (OASItemDetail) api.itemRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASItemsApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASItemDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASItemDetail.getExample();
        response = (OASItemDetail) api.itemRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }
}