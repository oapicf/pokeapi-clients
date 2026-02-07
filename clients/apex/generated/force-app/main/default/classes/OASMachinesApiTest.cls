@isTest
private class OASMachinesApiTest {
    /**
     * List machines
     *
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     */
    @isTest
    private static void machineListTest() {
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
        OASMachinesApi api;
        OASPaginatedMachineSummaryList response;
        OASPaginatedMachineSummaryList expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMachinesApi(client);

        js = JSON.serialize(OASPaginatedMachineSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMachineSummaryList.getExample();
        response = (OASPaginatedMachineSummaryList) api.machineList(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMachinesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASPaginatedMachineSummaryList.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASPaginatedMachineSummaryList.getExample();
        response = (OASPaginatedMachineSummaryList) api.machineList(params);
        System.assertEquals(expectedResponse, response);
    }

    /**
     * Get machine
     *
     * Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.
     */
    @isTest
    private static void machineRetrieveTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => 'null'
        };

        OASClient client;
        OASMachinesApi api;
        OASMachineDetail response;
        OASMachineDetail expectedResponse;
        String js = '';

        client = new OASClient();
        api = new OASMachinesApi(client);

        js = JSON.serialize(OASMachineDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMachineDetail.getExample();
        response = (OASMachineDetail) api.machineRetrieve(params);
        System.assertEquals(expectedResponse, response);
        client = new OASClient();
        api = new OASMachinesApi(client);
        ((OAS.ApiKeyAuth)client.getAuthentication('cookieAuth')).setApiKey('foo-bar-api-key');


        js = JSON.serialize(OASMachineDetail.getExample());
        res.setHeader('Content-Type', 'application/json');
        res.setBody(js);
        expectedResponse = OASMachineDetail.getExample();
        response = (OASMachineDetail) api.machineRetrieve(params);
        System.assertEquals(expectedResponse, response);
    }
}