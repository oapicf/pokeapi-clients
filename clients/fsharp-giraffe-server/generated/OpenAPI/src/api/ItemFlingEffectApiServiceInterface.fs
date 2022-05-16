namespace OpenAPI
open ItemFlingEffectApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ItemFlingEffectApiServiceInterface =

    //#region Service interface
    type IItemFlingEffectApiService =
      abstract member ItemFlingEffectList:HttpContext -> ItemFlingEffectListArgs->ItemFlingEffectListResult
      abstract member ItemFlingEffectRead:HttpContext -> ItemFlingEffectReadArgs->ItemFlingEffectReadResult
    //#endregion