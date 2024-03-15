{-

   No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

   The version of the OpenAPI document: 20220523
   Contact: blah+oapicf@cliffano.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Move exposing
    ( moveList
    , moveRead
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

moveList : Maybe Int -> Maybe Int -> Api.Request ()
moveList limit_query offset_query =
    Api.request
        "GET"
        "/api/v2/move/"
        []
        [ ( "limit", Maybe.map String.fromInt limit_query ), ( "offset", Maybe.map String.fromInt offset_query ) ]
        []
        Nothing
        (Json.Decode.succeed ())


moveRead : Int -> Api.Request ()
moveRead id_path =
    Api.request
        "GET"
        "/api/v2/move/{id}/"
        [ ( "id", String.fromInt id_path ) ]
        []
        []
        Nothing
        (Json.Decode.succeed ())

