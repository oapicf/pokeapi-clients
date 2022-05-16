namespace OpenAPI
open LocationApiHandlerParams
open LocationApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module LocationApiServiceImplementation =

    //#region Service implementation
    type LocationApiServiceImpl() =
      interface ILocationApiService with

        member this.LocationList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LocationListDefaultStatusCode { content = content }

        member this.LocationRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            LocationReadDefaultStatusCode { content = content }

      //#endregion

    let LocationApiService = LocationApiServiceImpl() :> ILocationApiService