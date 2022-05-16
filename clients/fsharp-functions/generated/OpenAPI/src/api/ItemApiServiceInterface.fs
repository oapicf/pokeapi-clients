namespace OpenAPI
open ItemApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ItemApiServiceInterface =

    //#region Service interface
    type IItemApiService =
      abstract member ItemList : unit -> ItemListResult
      abstract member ItemRead : unit -> ItemReadResult
    //#endregion