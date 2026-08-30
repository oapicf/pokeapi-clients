using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class PokemonApi
    { 
        [FunctionName("PokemonApi_AbilityList")]
        public async Task<ActionResult<PaginatedAbilitySummaryList>> _AbilityList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/ability/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("AbilityList");
            return method != null
                ? (await ((Task<PaginatedAbilitySummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_AbilityRetrieve")]
        public async Task<ActionResult<AbilityDetail>> _AbilityRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/ability/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("AbilityRetrieve");
            return method != null
                ? (await ((Task<AbilityDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_CharacteristicList")]
        public async Task<ActionResult<PaginatedCharacteristicSummaryList>> _CharacteristicList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/characteristic/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("CharacteristicList");
            return method != null
                ? (await ((Task<PaginatedCharacteristicSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_CharacteristicRetrieve")]
        public async Task<ActionResult<CharacteristicDetail>> _CharacteristicRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/characteristic/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("CharacteristicRetrieve");
            return method != null
                ? (await ((Task<CharacteristicDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_EggGroupList")]
        public async Task<ActionResult<PaginatedEggGroupSummaryList>> _EggGroupList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/egg-group/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("EggGroupList");
            return method != null
                ? (await ((Task<PaginatedEggGroupSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_EggGroupRetrieve")]
        public async Task<ActionResult<EggGroupDetail>> _EggGroupRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/egg-group/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("EggGroupRetrieve");
            return method != null
                ? (await ((Task<EggGroupDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_GenderList")]
        public async Task<ActionResult<PaginatedGenderSummaryList>> _GenderList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/gender/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenderList");
            return method != null
                ? (await ((Task<PaginatedGenderSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_GenderRetrieve")]
        public async Task<ActionResult<GenderDetail>> _GenderRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/gender/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("GenderRetrieve");
            return method != null
                ? (await ((Task<GenderDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_GrowthRateList")]
        public async Task<ActionResult<PaginatedGrowthRateSummaryList>> _GrowthRateList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/growth-rate/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GrowthRateList");
            return method != null
                ? (await ((Task<PaginatedGrowthRateSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_GrowthRateRetrieve")]
        public async Task<ActionResult<GrowthRateDetail>> _GrowthRateRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/growth-rate/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("GrowthRateRetrieve");
            return method != null
                ? (await ((Task<GrowthRateDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_MoveDamageClassList")]
        public async Task<ActionResult<PaginatedMoveDamageClassSummaryList>> _MoveDamageClassList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-damage-class/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MoveDamageClassList");
            return method != null
                ? (await ((Task<PaginatedMoveDamageClassSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_MoveDamageClassRetrieve")]
        public async Task<ActionResult<MoveDamageClassDetail>> _MoveDamageClassRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-damage-class/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("MoveDamageClassRetrieve");
            return method != null
                ? (await ((Task<MoveDamageClassDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_NatureList")]
        public async Task<ActionResult<PaginatedNatureSummaryList>> _NatureList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/nature/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("NatureList");
            return method != null
                ? (await ((Task<PaginatedNatureSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_NatureRetrieve")]
        public async Task<ActionResult<NatureDetail>> _NatureRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/nature/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("NatureRetrieve");
            return method != null
                ? (await ((Task<NatureDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokeathlonStatList")]
        public async Task<ActionResult<PaginatedPokeathlonStatSummaryList>> _PokeathlonStatList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokeathlon-stat/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PokeathlonStatList");
            return method != null
                ? (await ((Task<PaginatedPokeathlonStatSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokeathlonStatRetrieve")]
        public async Task<ActionResult<PokeathlonStatDetail>> _PokeathlonStatRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokeathlon-stat/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("PokeathlonStatRetrieve");
            return method != null
                ? (await ((Task<PokeathlonStatDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokemonColorList")]
        public async Task<ActionResult<PaginatedPokemonColorSummaryList>> _PokemonColorList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-color/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PokemonColorList");
            return method != null
                ? (await ((Task<PaginatedPokemonColorSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokemonColorRetrieve")]
        public async Task<ActionResult<PokemonColorDetail>> _PokemonColorRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-color/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("PokemonColorRetrieve");
            return method != null
                ? (await ((Task<PokemonColorDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokemonFormList")]
        public async Task<ActionResult<PaginatedPokemonFormSummaryList>> _PokemonFormList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-form/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PokemonFormList");
            return method != null
                ? (await ((Task<PaginatedPokemonFormSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokemonFormRetrieve")]
        public async Task<ActionResult<PokemonFormDetail>> _PokemonFormRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-form/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("PokemonFormRetrieve");
            return method != null
                ? (await ((Task<PokemonFormDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokemonHabitatList")]
        public async Task<ActionResult<PaginatedPokemonHabitatSummaryList>> _PokemonHabitatList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-habitat/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PokemonHabitatList");
            return method != null
                ? (await ((Task<PaginatedPokemonHabitatSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokemonHabitatRetrieve")]
        public async Task<ActionResult<PokemonHabitatDetail>> _PokemonHabitatRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-habitat/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("PokemonHabitatRetrieve");
            return method != null
                ? (await ((Task<PokemonHabitatDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokemonList")]
        public async Task<ActionResult<PaginatedPokemonSummaryList>> _PokemonList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PokemonList");
            return method != null
                ? (await ((Task<PaginatedPokemonSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokemonRetrieve")]
        public async Task<ActionResult<PokemonDetail>> _PokemonRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("PokemonRetrieve");
            return method != null
                ? (await ((Task<PokemonDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokemonShapeList")]
        public async Task<ActionResult<PaginatedPokemonShapeSummaryList>> _PokemonShapeList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-shape/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PokemonShapeList");
            return method != null
                ? (await ((Task<PaginatedPokemonShapeSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokemonShapeRetrieve")]
        public async Task<ActionResult<PokemonShapeDetail>> _PokemonShapeRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-shape/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("PokemonShapeRetrieve");
            return method != null
                ? (await ((Task<PokemonShapeDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokemonSpeciesList")]
        public async Task<ActionResult<PaginatedPokemonSpeciesSummaryList>> _PokemonSpeciesList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-species/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PokemonSpeciesList");
            return method != null
                ? (await ((Task<PaginatedPokemonSpeciesSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_PokemonSpeciesRetrieve")]
        public async Task<ActionResult<PokemonSpeciesDetail>> _PokemonSpeciesRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokemon-species/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("PokemonSpeciesRetrieve");
            return method != null
                ? (await ((Task<PokemonSpeciesDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_StatList")]
        public async Task<ActionResult<PaginatedStatSummaryList>> _StatList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/stat/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("StatList");
            return method != null
                ? (await ((Task<PaginatedStatSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_StatRetrieve")]
        public async Task<ActionResult<StatDetail>> _StatRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/stat/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("StatRetrieve");
            return method != null
                ? (await ((Task<StatDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_TypeList")]
        public async Task<ActionResult<PaginatedTypeSummaryList>> _TypeList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/type/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("TypeList");
            return method != null
                ? (await ((Task<PaginatedTypeSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("PokemonApi_TypeRetrieve")]
        public async Task<ActionResult<TypeDetail>> _TypeRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/type/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("TypeRetrieve");
            return method != null
                ? (await ((Task<TypeDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
