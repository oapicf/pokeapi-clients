namespace OpenAPI
open ItemPocketApiHandlerParams
open ItemPocketApiServiceInterface
open System.Collections.Generic
open System

module ItemPocketApiServiceImplementation =

    //#region Service implementation
    type ItemPocketApiServiceImpl() =
      interface IItemPocketApiService with

        member this.ItemPocketList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemPocketListDefaultStatusCode { content = content }

        member this.ItemPocketRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemPocketReadDefaultStatusCode { content = content }

      //#endregion

    let ItemPocketApiService = ItemPocketApiServiceImpl() :> IItemPocketApiService