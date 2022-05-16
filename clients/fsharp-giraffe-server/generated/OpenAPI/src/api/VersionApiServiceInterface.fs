namespace OpenAPI
open VersionApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module VersionApiServiceInterface =

    //#region Service interface
    type IVersionApiService =
      abstract member VersionList:HttpContext -> VersionListArgs->VersionListResult
      abstract member VersionRead:HttpContext -> VersionReadArgs->VersionReadResult
    //#endregion