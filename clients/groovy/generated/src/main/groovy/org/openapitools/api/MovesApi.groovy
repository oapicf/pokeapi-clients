package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.MoveBattleStyleDetail
import org.openapitools.model.MoveDetail
import org.openapitools.model.MoveLearnMethodDetail
import org.openapitools.model.MoveMetaAilmentDetail
import org.openapitools.model.MoveMetaCategoryDetail
import org.openapitools.model.MoveTargetDetail
import org.openapitools.model.PaginatedMoveBattleStyleSummaryList
import org.openapitools.model.PaginatedMoveLearnMethodSummaryList
import org.openapitools.model.PaginatedMoveMetaAilmentSummaryList
import org.openapitools.model.PaginatedMoveMetaCategorySummaryList
import org.openapitools.model.PaginatedMoveSummaryList
import org.openapitools.model.PaginatedMoveTargetSummaryList

class MovesApi {
    String basePath = "https://pokeapi.co"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def moveAilmentList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move-ailment/"

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
                    PaginatedMoveMetaAilmentSummaryList.class )

    }

    def moveAilmentRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move-ailment/${id}/"

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
                    MoveMetaAilmentDetail.class )

    }

    def moveBattleStyleList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move-battle-style/"

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
                    PaginatedMoveBattleStyleSummaryList.class )

    }

    def moveBattleStyleRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move-battle-style/${id}/"

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
                    MoveBattleStyleDetail.class )

    }

    def moveCategoryList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move-category/"

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
                    PaginatedMoveMetaCategorySummaryList.class )

    }

    def moveCategoryRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move-category/${id}/"

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
                    MoveMetaCategoryDetail.class )

    }

    def moveLearnMethodList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move-learn-method/"

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
                    PaginatedMoveLearnMethodSummaryList.class )

    }

    def moveLearnMethodRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move-learn-method/${id}/"

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
                    MoveLearnMethodDetail.class )

    }

    def moveList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move/"

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
                    PaginatedMoveSummaryList.class )

    }

    def moveRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move/${id}/"

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
                    MoveDetail.class )

    }

    def moveTargetList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move-target/"

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
                    PaginatedMoveTargetSummaryList.class )

    }

    def moveTargetRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move-target/${id}/"

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
                    MoveTargetDetail.class )

    }

}
