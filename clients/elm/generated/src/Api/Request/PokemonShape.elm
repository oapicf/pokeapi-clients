{-
   
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   The version of the OpenAPI document: 1.0.0

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.PokemonShape exposing
    ( pokemonShapeList
    , pokemonShapeRead
    )

import Api
import Api.Data
import Dict
import Http
import Json.Decode
import Json.Encode



pokemonShapeList : Maybe Int -> Maybe Int -> Api.Request 
pokemonShapeList limit_query offset_query =
    Api.request
        "GET"
        "/api/v2/pokemon-shape/"
        []
        [ ( "limit", Maybe.map String.fromInt limit_query ), ( "offset", Maybe.map String.fromInt offset_query ) ]
        []
        Nothing
        



pokemonShapeRead : Int -> Api.Request 
pokemonShapeRead id_path =
    Api.request
        "GET"
        "/api/v2/pokemon-shape/{id}/"
        [ ( "id", String.fromInt id_path ) ]
        []
        []
        Nothing
        
