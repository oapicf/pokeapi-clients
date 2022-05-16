namespace OpenAPI
open CharacteristicApiHandlerParams
open CharacteristicApiServiceInterface
open System.Collections.Generic
open System

module CharacteristicApiServiceImplementation =

    //#region Service implementation
    type CharacteristicApiServiceImpl() =
      interface ICharacteristicApiService with

        member this.CharacteristicList () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CharacteristicListDefaultStatusCode { content = content }

        member this.CharacteristicRead () =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            CharacteristicReadDefaultStatusCode { content = content }

      //#endregion

    let CharacteristicApiService = CharacteristicApiServiceImpl() :> ICharacteristicApiService