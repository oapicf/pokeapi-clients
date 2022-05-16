namespace OpenAPI
open PokemonFormApiHandlerParams
open PokemonFormApiServiceInterface
open System.Collections.Generic
open System

module PokemonFormApiServiceImplementation =

    //#region Service implementation
    type PokemonFormApiServiceImpl() =
      interface IPokemonFormApiService with

        member this.PokemonFormList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonFormListDefaultStatusCode { content = content }

        member this.PokemonFormRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonFormReadDefaultStatusCode { content = content }

      //#endregion

    let PokemonFormApiService = PokemonFormApiServiceImpl() :> IPokemonFormApiService