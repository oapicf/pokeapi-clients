namespace OpenAPI
open VersionApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module VersionApiServiceInterface =

    //#region Service interface
    type IVersionApiService =
      abstract member VersionList : unit -> VersionListResult
      abstract member VersionRead : unit -> VersionReadResult
    //#endregion