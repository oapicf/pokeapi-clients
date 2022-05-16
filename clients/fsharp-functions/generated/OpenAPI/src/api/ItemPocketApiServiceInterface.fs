namespace OpenAPI
open ItemPocketApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ItemPocketApiServiceInterface =

    //#region Service interface
    type IItemPocketApiService =
      abstract member ItemPocketList : unit -> ItemPocketListResult
      abstract member ItemPocketRead : unit -> ItemPocketReadResult
    //#endregion