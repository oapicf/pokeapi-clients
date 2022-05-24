{-
   
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   The version of the OpenAPI document: 20220523

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Berry exposing
    ( berryList
    , berryRead
    )

import Api
import Api.Data
import Dict
import Http
import Json.Decode
import Json.Encode



berryList : Maybe Int -> Maybe Int -> Api.Request 
berryList limit_query offset_query =
    Api.request
        "GET"
        "/api/v2/berry/"
        []
        [ ( "limit", Maybe.map String.fromInt limit_query ), ( "offset", Maybe.map String.fromInt offset_query ) ]
        []
        Nothing
        



berryRead : Int -> Api.Request 
berryRead id_path =
    Api.request
        "GET"
        "/api/v2/berry/{id}/"
        [ ( "id", String.fromInt id_path ) ]
        []
        []
        Nothing
        
