namespace OpenAPI
open MoveDamageClassApiHandlerParams
open MoveDamageClassApiServiceInterface
open System.Collections.Generic
open System
open Giraffe

module MoveDamageClassApiServiceImplementation =

    //#region Service implementation
    type MoveDamageClassApiServiceImpl() =
      interface IMoveDamageClassApiService with

        member this.MoveDamageClassList ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveDamageClassListDefaultStatusCode { content = content }

        member this.MoveDamageClassRead ctx args =
            let content = "Default response" :> obj :?> string // this cast is obviously wrong, and is only intended to allow generated project to compile   
            MoveDamageClassReadDefaultStatusCode { content = content }

      //#endregion

    let MoveDamageClassApiService = MoveDamageClassApiServiceImpl() :> IMoveDamageClassApiService