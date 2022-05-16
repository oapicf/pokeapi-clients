namespace OpenAPI
open CharacteristicApiHandlerParams
open System
open Microsoft.AspNetCore.Http


module CharacteristicApiServiceInterface =

    //#region Service interface
    type ICharacteristicApiService =
      abstract member CharacteristicList : unit -> CharacteristicListResult
      abstract member CharacteristicRead : unit -> CharacteristicReadResult
    //#endregion