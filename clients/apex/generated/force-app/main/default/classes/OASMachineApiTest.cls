@isTest
private class OASMachineApiTest {
    /**
     * 
     *
     * 
     */
    @isTest
    private static void machineListTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'r_limit' => '',
            'offset' => ''
        };

        OASClient client;
        OASMachineApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMachineApi(new OASClient());

        api.machineList(params);
    }

    /**
     * 
     *
     * 
     */
    @isTest
    private static void machineReadTest() {
        HttpResponse res = new HttpResponse();
        res.setStatusCode(200);
        res.setStatus('OK');
        Test.setMock(HttpCalloutMock.class, new OASResponseMock(res));

        Map<String, Object> params = new Map<String, Object>{
            'id' => ''
        };

        OASClient client;
        OASMachineApi api;
        String response;
        String expectedResponse;
        String js = '';

        api = new OASMachineApi(new OASClient());

        api.machineRead(params);
    }
}