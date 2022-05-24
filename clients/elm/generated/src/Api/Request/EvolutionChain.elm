{-
   
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   The version of the OpenAPI document: 20220523

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.EvolutionChain exposing
    ( evolutionChainList
    , evolutionChainRead
    )

import Api
import Api.Data
import Dict
import Http
import Json.Decode
import Json.Encode



evolutionChainList : Maybe Int -> Maybe Int -> Api.Request 
evolutionChainList limit_query offset_query =
    Api.request
        "GET"
        "/api/v2/evolution-chain/"
        []
        [ ( "limit", Maybe.map String.fromInt limit_query ), ( "offset", Maybe.map String.fromInt offset_query ) ]
        []
        Nothing
        



evolutionChainRead : Int -> Api.Request 
evolutionChainRead id_path =
    Api.request
        "GET"
        "/api/v2/evolution-chain/{id}/"
        [ ( "id", String.fromInt id_path ) ]
        []
        []
        Nothing
        
