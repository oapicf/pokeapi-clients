namespace OpenAPI
open PokemonShapeApiHandlerParams
open PokemonShapeApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module PokemonShapeApiServiceImplementation =

    //#region Service implementation
    type PokemonShapeApiServiceImpl() =
      interface IPokemonShapeApiService with

        member this.PokemonShapeList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonShapeListDefaultStatusCode { content = content }

        member this.PokemonShapeRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonShapeReadDefaultStatusCode { content = content }

      //#endregion

    let PokemonShapeApiService = PokemonShapeApiServiceImpl() :> IPokemonShapeApiService