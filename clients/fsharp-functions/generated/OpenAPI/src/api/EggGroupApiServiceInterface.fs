namespace OpenAPI
open EggGroupApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module EggGroupApiServiceInterface =

    //#region Service interface
    type IEggGroupApiService =
      abstract member EggGroupList : unit -> EggGroupListResult
      abstract member EggGroupRead : unit -> EggGroupReadResult
    //#endregion