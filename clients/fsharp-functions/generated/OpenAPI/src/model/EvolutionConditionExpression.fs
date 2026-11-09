namespace OpenAPI.Model

open System
open System.Collections.Generic
open Newtonsoft.Json
open OpenAPI.Model.EvolutionVariableSummary
open OpenAPI.Model.double option

module EvolutionConditionExpression =

  //#region EvolutionConditionExpression

  [<CLIMutable>]
  type EvolutionConditionExpression = {
    [<JsonProperty(PropertyName = "expression")>]
    Expression : string;
    [<JsonProperty(PropertyName = "percentage_chance")>]
    PercentageChance : double option;
    [<JsonProperty(PropertyName = "variables")>]
    Variables : EvolutionVariableSummary[];
  }

  //#endregion
