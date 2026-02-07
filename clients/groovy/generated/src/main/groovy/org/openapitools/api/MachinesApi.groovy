package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.MachineDetail
import org.openapitools.model.PaginatedMachineSummaryList

class MachinesApi {
    String basePath = "https://pokeapi.co"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def machineList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/machine/"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType


        if (limit != null) {
            queryParams.put("limit", limit)
        }
        if (offset != null) {
            queryParams.put("offset", offset)
        }
        if (q != null) {
            queryParams.put("q", q)
        }




        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    PaginatedMachineSummaryList.class )

    }

    def machineRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/machine/${id}/"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, contentType,
                    "GET", "",
                    MachineDetail.class )

    }

}
