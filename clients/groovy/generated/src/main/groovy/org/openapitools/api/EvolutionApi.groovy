package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.EvolutionChainDetail
import org.openapitools.model.EvolutionTriggerDetail
import org.openapitools.model.PaginatedEvolutionChainSummaryList
import org.openapitools.model.PaginatedEvolutionTriggerSummaryList

class EvolutionApi {
    String basePath = "https://pokeapi.co"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def evolutionChainList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/evolution-chain/"

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
                    PaginatedEvolutionChainSummaryList.class )

    }

    def evolutionChainRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/evolution-chain/${id}/"

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
                    EvolutionChainDetail.class )

    }

    def evolutionTriggerList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/evolution-trigger/"

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
                    PaginatedEvolutionTriggerSummaryList.class )

    }

    def evolutionTriggerRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/evolution-trigger/${id}/"

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
                    EvolutionTriggerDetail.class )

    }

}
