{-
   
   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   The version of the OpenAPI document: 20220523
   Contact: blah+oapicf@cliffano.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.ItemFlingEffect exposing
    ( itemFlingEffectList
    , itemFlingEffectRead
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode


itemFlingEffectList : Maybe Int -> Maybe Int -> Api.Request ()
itemFlingEffectList limit_query offset_query =
    Api.request
        "GET"
        "/api/v2/item-fling-effect/"
        []
        [ ( "limit", Maybe.map String.fromInt limit_query ), ( "offset", Maybe.map String.fromInt offset_query ) ]
        []
        Nothing
        (Json.Decode.succeed ())


itemFlingEffectRead : Int -> Api.Request ()
itemFlingEffectRead id_path =
    Api.request
        "GET"
        "/api/v2/item-fling-effect/{id}/"
        [ ( "id", String.fromInt id_path ) ]
        []
        []
        Nothing
        (Json.Decode.succeed ())

