namespace OpenAPI
open PokedexApiHandlerParams
open PokedexApiServiceInterface
open System.Collections.Generic
open System

module PokedexApiServiceImplementation =

    //#region Service implementation
    type PokedexApiServiceImpl() =
      interface IPokedexApiService with

        member this.PokedexList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokedexListDefaultStatusCode { content = content }

        member this.PokedexRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            PokedexReadDefaultStatusCode { content = content }

      //#endregion

    let PokedexApiService = PokedexApiServiceImpl() :> IPokedexApiService