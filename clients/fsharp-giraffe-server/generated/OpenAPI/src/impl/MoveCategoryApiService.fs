namespace OpenAPI
open MoveCategoryApiHandlerParams
open MoveCategoryApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module MoveCategoryApiServiceImplementation =

    //#region Service implementation
    type MoveCategoryApiServiceImpl() =
      interface IMoveCategoryApiService with

        member this.MoveCategoryList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveCategoryListDefaultStatusCode { content = content }

        member this.MoveCategoryRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveCategoryReadDefaultStatusCode { content = content }

      //#endregion

    let MoveCategoryApiService = MoveCategoryApiServiceImpl() :> IMoveCategoryApiService