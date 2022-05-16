namespace OpenAPI
open PokemonApiHandlerParams
open PokemonApiServiceInterface
open System.Collections.Generic
open System

module PokemonApiServiceImplementation =

    //#region Service implementation
    type PokemonApiServiceImpl() =
      interface IPokemonApiService with

        member this.PokemonList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonListDefaultStatusCode { content = content }

        member this.PokemonRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonReadDefaultStatusCode { content = content }

      //#endregion

    let PokemonApiService = PokemonApiServiceImpl() :> IPokemonApiService