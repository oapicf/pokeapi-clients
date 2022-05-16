namespace OpenAPI

open System.Collections.Generic
open System

module EvolutionTriggerApiHandlerParams =


    //#region Query parameters
    [<CLIMutable>]
    type EvolutionTriggerListQueryParams = {
      limit : int option;


      offset : int option;

    }
    //#endregion


    type EvolutionTriggerListDefaultStatusCodeResponse = {
      content:string;
      
    }
    type EvolutionTriggerListResult = EvolutionTriggerListDefaultStatusCode of EvolutionTriggerListDefaultStatusCodeResponse

    type EvolutionTriggerListArgs = {
      queryParams:Result<EvolutionTriggerListQueryParams,string>;
    }
    //#region Path parameters
    [<CLIMutable>]
    type EvolutionTriggerReadPathParams = {
      id : int ;
    }
    //#endregion


    type EvolutionTriggerReadDefaultStatusCodeResponse = {
      content:string;
      
    }
    type EvolutionTriggerReadResult = EvolutionTriggerReadDefaultStatusCode of EvolutionTriggerReadDefaultStatusCodeResponse

    type EvolutionTriggerReadArgs = {
      pathParams:EvolutionTriggerReadPathParams;
    }
