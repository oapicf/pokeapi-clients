package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AbilityDetail
import org.openapitools.model.CharacteristicDetail
import org.openapitools.model.EggGroupDetail
import org.openapitools.model.GenderDetail
import org.openapitools.model.GrowthRateDetail
import org.openapitools.model.MoveDamageClassDetail
import org.openapitools.model.NatureDetail
import org.openapitools.model.PaginatedAbilitySummaryList
import org.openapitools.model.PaginatedCharacteristicSummaryList
import org.openapitools.model.PaginatedEggGroupSummaryList
import org.openapitools.model.PaginatedGenderSummaryList
import org.openapitools.model.PaginatedGrowthRateSummaryList
import org.openapitools.model.PaginatedMoveDamageClassSummaryList
import org.openapitools.model.PaginatedNatureSummaryList
import org.openapitools.model.PaginatedPokeathlonStatSummaryList
import org.openapitools.model.PaginatedPokemonColorSummaryList
import org.openapitools.model.PaginatedPokemonFormSummaryList
import org.openapitools.model.PaginatedPokemonHabitatSummaryList
import org.openapitools.model.PaginatedPokemonShapeSummaryList
import org.openapitools.model.PaginatedPokemonSpeciesSummaryList
import org.openapitools.model.PaginatedPokemonSummaryList
import org.openapitools.model.PaginatedStatSummaryList
import org.openapitools.model.PaginatedTypeSummaryList
import org.openapitools.model.PokeathlonStatDetail
import org.openapitools.model.PokemonColorDetail
import org.openapitools.model.PokemonDetail
import org.openapitools.model.PokemonFormDetail
import org.openapitools.model.PokemonHabitatDetail
import org.openapitools.model.PokemonShapeDetail
import org.openapitools.model.PokemonSpeciesDetail
import org.openapitools.model.StatDetail
import org.openapitools.model.TypeDetail

class PokemonApi {
    String basePath = "https://pokeapi.co"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def abilityList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/ability/"

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
                    PaginatedAbilitySummaryList.class )

    }

    def abilityRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/ability/${id}/"

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
                    AbilityDetail.class )

    }

    def characteristicList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/characteristic/"

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
                    PaginatedCharacteristicSummaryList.class )

    }

    def characteristicRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/characteristic/${id}/"

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
                    CharacteristicDetail.class )

    }

    def eggGroupList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/egg-group/"

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
                    PaginatedEggGroupSummaryList.class )

    }

    def eggGroupRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/egg-group/${id}/"

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
                    EggGroupDetail.class )

    }

    def genderList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/gender/"

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
                    PaginatedGenderSummaryList.class )

    }

    def genderRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/gender/${id}/"

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
                    GenderDetail.class )

    }

    def growthRateList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/growth-rate/"

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
                    PaginatedGrowthRateSummaryList.class )

    }

    def growthRateRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/growth-rate/${id}/"

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
                    GrowthRateDetail.class )

    }

    def moveDamageClassList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move-damage-class/"

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
                    PaginatedMoveDamageClassSummaryList.class )

    }

    def moveDamageClassRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/move-damage-class/${id}/"

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
                    MoveDamageClassDetail.class )

    }

    def natureList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/nature/"

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
                    PaginatedNatureSummaryList.class )

    }

    def natureRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/nature/${id}/"

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
                    NatureDetail.class )

    }

    def pokeathlonStatList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokeathlon-stat/"

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
                    PaginatedPokeathlonStatSummaryList.class )

    }

    def pokeathlonStatRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokeathlon-stat/${id}/"

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
                    PokeathlonStatDetail.class )

    }

    def pokemonColorList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokemon-color/"

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
                    PaginatedPokemonColorSummaryList.class )

    }

    def pokemonColorRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokemon-color/${id}/"

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
                    PokemonColorDetail.class )

    }

    def pokemonFormList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokemon-form/"

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
                    PaginatedPokemonFormSummaryList.class )

    }

    def pokemonFormRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokemon-form/${id}/"

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
                    PokemonFormDetail.class )

    }

    def pokemonHabitatList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokemon-habitat/"

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
                    PaginatedPokemonHabitatSummaryList.class )

    }

    def pokemonHabitatRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokemon-habitat/${id}/"

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
                    PokemonHabitatDetail.class )

    }

    def pokemonList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokemon/"

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
                    PaginatedPokemonSummaryList.class )

    }

    def pokemonRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokemon/${id}/"

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
                    PokemonDetail.class )

    }

    def pokemonShapeList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokemon-shape/"

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
                    PaginatedPokemonShapeSummaryList.class )

    }

    def pokemonShapeRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokemon-shape/${id}/"

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
                    PokemonShapeDetail.class )

    }

    def pokemonSpeciesList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokemon-species/"

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
                    PaginatedPokemonSpeciesSummaryList.class )

    }

    def pokemonSpeciesRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/pokemon-species/${id}/"

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
                    PokemonSpeciesDetail.class )

    }

    def statList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/stat/"

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
                    PaginatedStatSummaryList.class )

    }

    def statRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/stat/${id}/"

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
                    StatDetail.class )

    }

    def typeList ( Integer limit, Integer offset, String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/type/"

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
                    PaginatedTypeSummaryList.class )

    }

    def typeRetrieve ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v2/type/${id}/"

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
                    TypeDetail.class )

    }

}
