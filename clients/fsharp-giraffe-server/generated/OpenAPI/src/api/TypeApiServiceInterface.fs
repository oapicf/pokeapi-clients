namespace OpenAPI
open TypeApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module TypeApiServiceInterface =

    //#region Service interface
    type ITypeApiService =
      abstract member TypeList:HttpContext -> TypeListArgs->TypeListResult
      abstract member TypeRead:HttpContext -> TypeReadArgs->TypeReadResult
    //#endregion