namespace OpenAPI
open ItemApiHandlerParams
open ItemApiServiceInterface
open System.Collections.Generic
open System

module ItemApiServiceImplementation =

    //#region Service implementation
    type ItemApiServiceImpl() =
      interface IItemApiService with

        member this.ItemList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemListDefaultStatusCode { content = content }

        member this.ItemRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemReadDefaultStatusCode { content = content }

      //#endregion

    let ItemApiService = ItemApiServiceImpl() :> IItemApiService