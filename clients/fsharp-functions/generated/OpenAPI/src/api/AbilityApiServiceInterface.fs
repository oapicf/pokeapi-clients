namespace OpenAPI
open AbilityApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module AbilityApiServiceInterface =

    //#region Service interface
    type IAbilityApiService =
      abstract member AbilityList : unit -> AbilityListResult
      abstract member AbilityRead : unit -> AbilityReadResult
    //#endregion