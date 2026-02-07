package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.LanguageDetail
import org.openapitools.model.PaginatedLanguageSummaryList

class UtilityApi {
    String basePath = "https://pokeapi.co"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def languageList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/language/"

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
                    PaginatedLanguageSummaryList.class )

    }

    def languageRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/language/${id}/"

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
                    LanguageDetail.class )

    }

}
