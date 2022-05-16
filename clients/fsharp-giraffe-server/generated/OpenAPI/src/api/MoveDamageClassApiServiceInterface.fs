namespace OpenAPI
open MoveDamageClassApiHandlerParams
open System
open Giraffe
open Microsoft.AspNetCore.Http


module MoveDamageClassApiServiceInterface =

    //#region Service interface
    type IMoveDamageClassApiService =
      abstract member MoveDamageClassList:HttpContext -> MoveDamageClassListArgs->MoveDamageClassListResult
      abstract member MoveDamageClassRead:HttpContext -> MoveDamageClassReadArgs->MoveDamageClassReadResult
    //#endregion