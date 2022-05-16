namespace OpenAPI
open ItemApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ItemApiServiceInterface =

    //#region Service interface
    type IItemApiService =
      abstract member ItemList:HttpContext -> ItemListArgs->ItemListResult
      abstract member ItemRead:HttpContext -> ItemReadArgs->ItemReadResult
    //#endregion