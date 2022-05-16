namespace OpenAPI
open VersionGroupApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module VersionGroupApiServiceInterface =

    //#region Service interface
    type IVersionGroupApiService =
      abstract member VersionGroupList : unit -> VersionGroupListResult
      abstract member VersionGroupRead : unit -> VersionGroupReadResult
    //#endregion