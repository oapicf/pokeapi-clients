namespace OpenAPI
open TypeApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module TypeApiServiceInterface =

    //#region Service interface
    type ITypeApiService =
      abstract member TypeList : unit -> TypeListResult
      abstract member TypeRead : unit -> TypeReadResult
    //#endregion