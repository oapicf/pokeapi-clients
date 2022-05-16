namespace OpenAPI
open VersionGroupApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module VersionGroupApiServiceInterface =

    //#region Service interface
    type IVersionGroupApiService =
      abstract member VersionGroupList:HttpContext -> VersionGroupListArgs->VersionGroupListResult
      abstract member VersionGroupRead:HttpContext -> VersionGroupReadArgs->VersionGroupReadResult
    //#endregion