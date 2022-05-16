namespace OpenAPI
open ItemApiHandlerParams
open ItemApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ItemApiServiceImplementation =

    //#region Service implementation
    type ItemApiServiceImpl() =
      interface IItemApiService with

        member this.ItemList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemListDefaultStatusCode { content = content }

        member this.ItemRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemReadDefaultStatusCode { content = content }

      //#endregion

    let ItemApiService = ItemApiServiceImpl() :> IItemApiService