namespace OpenAPI.Model

open System
open System.Collections.Generic
open OpenAPI.Model.EvolutionVariableSummary
open OpenAPI.Model.double option

module EvolutionConditionExpression =

  //#region EvolutionConditionExpression


  type EvolutionConditionExpression = {
    Expression : string;
    PercentageChance : double option;
    Variables : EvolutionVariableSummary[];
  }
  //#endregion
