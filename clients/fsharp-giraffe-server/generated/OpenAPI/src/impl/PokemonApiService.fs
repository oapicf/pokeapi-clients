namespace OpenAPI
open PokemonApiHandlerParams
open PokemonApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module PokemonApiServiceImplementation =

    //#region Service implementation
    type PokemonApiServiceImpl() =
      interface IPokemonApiService with

        member this.PokemonList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonListDefaultStatusCode { content = content }

        member this.PokemonRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonReadDefaultStatusCode { content = content }

      //#endregion

    let PokemonApiService = PokemonApiServiceImpl() :> IPokemonApiService