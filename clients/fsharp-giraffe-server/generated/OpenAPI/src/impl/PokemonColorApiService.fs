namespace OpenAPI
open PokemonColorApiHandlerParams
open PokemonColorApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module PokemonColorApiServiceImplementation =

    //#region Service implementation
    type PokemonColorApiServiceImpl() =
      interface IPokemonColorApiService with

        member this.PokemonColorList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonColorListDefaultStatusCode { content = content }

        member this.PokemonColorRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonColorReadDefaultStatusCode { content = content }

      //#endregion

    let PokemonColorApiService = PokemonColorApiServiceImpl() :> IPokemonColorApiService