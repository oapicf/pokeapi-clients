namespace OpenAPI
open ItemPocketApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ItemPocketApiServiceInterface =

    //#region Service interface
    type IItemPocketApiService =
      abstract member ItemPocketList:HttpContext -> ItemPocketListArgs->ItemPocketListResult
      abstract member ItemPocketRead:HttpContext -> ItemPocketReadArgs->ItemPocketReadResult
    //#endregion