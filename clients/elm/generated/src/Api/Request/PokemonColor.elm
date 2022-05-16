{-
   
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   The version of the OpenAPI document: 1.0.0

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.PokemonColor exposing
    ( pokemonColorList
    , pokemonColorRead
    )

import Api
import Api.Data
import Dict
import Http
import Json.Decode
import Json.Encode



pokemonColorList : Maybe Int -> Maybe Int -> Api.Request 
pokemonColorList limit_query offset_query =
    Api.request
        "GET"
        "/api/v2/pokemon-color/"
        []
        [ ( "limit", Maybe.map String.fromInt limit_query ), ( "offset", Maybe.map String.fromInt offset_query ) ]
        []
        Nothing
        



pokemonColorRead : Int -> Api.Request 
pokemonColorRead id_path =
    Api.request
        "GET"
        "/api/v2/pokemon-color/{id}/"
        [ ( "id", String.fromInt id_path ) ]
        []
        []
        Nothing
        
