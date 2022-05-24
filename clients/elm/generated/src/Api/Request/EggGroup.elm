{-
   
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   The version of the OpenAPI document: 20220523

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.EggGroup exposing
    ( eggGroupList
    , eggGroupRead
    )

import Api
import Api.Data
import Dict
import Http
import Json.Decode
import Json.Encode



eggGroupList : Maybe Int -> Maybe Int -> Api.Request 
eggGroupList limit_query offset_query =
    Api.request
        "GET"
        "/api/v2/egg-group/"
        []
        [ ( "limit", Maybe.map String.fromInt limit_query ), ( "offset", Maybe.map String.fromInt offset_query ) ]
        []
        Nothing
        



eggGroupRead : Int -> Api.Request 
eggGroupRead id_path =
    Api.request
        "GET"
        "/api/v2/egg-group/{id}/"
        [ ( "id", String.fromInt id_path ) ]
        []
        []
        Nothing
        
