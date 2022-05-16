namespace OpenAPI
open PokemonHabitatApiHandlerParams
open PokemonHabitatApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module PokemonHabitatApiServiceImplementation =

    //#region Service implementation
    type PokemonHabitatApiServiceImpl() =
      interface IPokemonHabitatApiService with

        member this.PokemonHabitatList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonHabitatListDefaultStatusCode { content = content }

        member this.PokemonHabitatRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonHabitatReadDefaultStatusCode { content = content }

      //#endregion

    let PokemonHabitatApiService = PokemonHabitatApiServiceImpl() :> IPokemonHabitatApiService