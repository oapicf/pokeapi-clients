namespace OpenAPI
open ItemCategoryApiHandlerParams
open ItemCategoryApiServiceInterface
open System.Collections.Generic
open System

module ItemCategoryApiServiceImplementation =

    //#region Service implementation
    type ItemCategoryApiServiceImpl() =
      interface IItemCategoryApiService with

        member this.ItemCategoryList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemCategoryListDefaultStatusCode { content = content }

        member this.ItemCategoryRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemCategoryReadDefaultStatusCode { content = content }

      //#endregion

    let ItemCategoryApiService = ItemCategoryApiServiceImpl() :> IItemCategoryApiService