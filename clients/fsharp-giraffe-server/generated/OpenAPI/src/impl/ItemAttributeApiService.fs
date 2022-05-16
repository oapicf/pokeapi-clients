namespace OpenAPI
open ItemAttributeApiHandlerParams
open ItemAttributeApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module ItemAttributeApiServiceImplementation =

    //#region Service implementation
    type ItemAttributeApiServiceImpl() =
      interface IItemAttributeApiService with

        member this.ItemAttributeList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemAttributeListDefaultStatusCode { content = content }

        member this.ItemAttributeRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemAttributeReadDefaultStatusCode { content = content }

      //#endregion

    let ItemAttributeApiService = ItemAttributeApiServiceImpl() :> IItemAttributeApiService