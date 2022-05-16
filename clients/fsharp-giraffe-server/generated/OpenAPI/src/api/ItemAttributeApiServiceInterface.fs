namespace OpenAPI
open ItemAttributeApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module ItemAttributeApiServiceInterface =

    //#region Service interface
    type IItemAttributeApiService =
      abstract member ItemAttributeList:HttpContext -> ItemAttributeListArgs->ItemAttributeListResult
      abstract member ItemAttributeRead:HttpContext -> ItemAttributeReadArgs->ItemAttributeReadResult
    //#endregion