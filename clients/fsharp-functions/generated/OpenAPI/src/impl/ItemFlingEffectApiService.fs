namespace OpenAPI
open ItemFlingEffectApiHandlerParams
open ItemFlingEffectApiServiceInterface
open System.Collections.Generic
open System

module ItemFlingEffectApiServiceImplementation =

    //#region Service implementation
    type ItemFlingEffectApiServiceImpl() =
      interface IItemFlingEffectApiService with

        member this.ItemFlingEffectList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemFlingEffectListDefaultStatusCode { content = content }

        member this.ItemFlingEffectRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            ItemFlingEffectReadDefaultStatusCode { content = content }

      //#endregion

    let ItemFlingEffectApiService = ItemFlingEffectApiServiceImpl() :> IItemFlingEffectApiService