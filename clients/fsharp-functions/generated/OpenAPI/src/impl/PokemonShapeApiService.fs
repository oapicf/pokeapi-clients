namespace OpenAPI
open PokemonShapeApiHandlerParams
open PokemonShapeApiServiceInterface
open System.Collections.Generic
open System

module PokemonShapeApiServiceImplementation =

    //#region Service implementation
    type PokemonShapeApiServiceImpl() =
      interface IPokemonShapeApiService with

        member this.PokemonShapeList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonShapeListDefaultStatusCode { content = content }

        member this.PokemonShapeRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokemonShapeReadDefaultStatusCode { content = content }

      //#endregion

    let PokemonShapeApiService = PokemonShapeApiServiceImpl() :> IPokemonShapeApiService