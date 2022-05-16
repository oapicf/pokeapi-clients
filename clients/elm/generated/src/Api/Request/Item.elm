{-
   
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   The version of the OpenAPI document: 1.0.0

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Item exposing
    ( itemList
    , itemRead
    )

import Api
import Api.Data
import Dict
import Http
import Json.Decode
import Json.Encode



itemList : Maybe Int -> Maybe Int -> Api.Request 
itemList limit_query offset_query =
    Api.request
        "GET"
        "/api/v2/item/"
        []
        [ ( "limit", Maybe.map String.fromInt limit_query ), ( "offset", Maybe.map String.fromInt offset_query ) ]
        []
        Nothing
        



itemRead : Int -> Api.Request 
itemRead id_path =
    Api.request
        "GET"
        "/api/v2/item/{id}/"
        [ ( "id", String.fromInt id_path ) ]
        []
        []
        Nothing
        
