namespace OpenAPI
open ItemFlingEffectApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ItemFlingEffectApiServiceInterface =

    //#region Service interface
    type IItemFlingEffectApiService =
      abstract member ItemFlingEffectList : unit -> ItemFlingEffectListResult
      abstract member ItemFlingEffectRead : unit -> ItemFlingEffectReadResult
    //#endregion