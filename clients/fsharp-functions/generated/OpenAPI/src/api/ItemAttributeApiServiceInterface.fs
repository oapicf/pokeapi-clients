namespace OpenAPI
open ItemAttributeApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module ItemAttributeApiServiceInterface =

    //#region Service interface
    type IItemAttributeApiService =
      abstract member ItemAttributeList : unit -> ItemAttributeListResult
      abstract member ItemAttributeRead : unit -> ItemAttributeReadResult
    //#endregion