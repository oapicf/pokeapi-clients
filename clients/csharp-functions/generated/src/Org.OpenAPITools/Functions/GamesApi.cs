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
    public partial class GamesApi
    { 
        [FunctionName("GamesApi_GenerationList")]
        public async Task<ActionResult<PaginatedGenerationSummaryList>> _GenerationList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/generation/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GenerationList");
            return method != null
                ? (await ((Task<PaginatedGenerationSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GamesApi_GenerationRetrieve")]
        public async Task<ActionResult<GenerationDetail>> _GenerationRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/generation/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("GenerationRetrieve");
            return method != null
                ? (await ((Task<GenerationDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GamesApi_PokedexList")]
        public async Task<ActionResult<PaginatedPokedexSummaryList>> _PokedexList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokedex/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("PokedexList");
            return method != null
                ? (await ((Task<PaginatedPokedexSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GamesApi_PokedexRetrieve")]
        public async Task<ActionResult<PokedexDetail>> _PokedexRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/pokedex/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("PokedexRetrieve");
            return method != null
                ? (await ((Task<PokedexDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GamesApi_VersionGroupList")]
        public async Task<ActionResult<PaginatedVersionGroupSummaryList>> _VersionGroupList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/version-group/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("VersionGroupList");
            return method != null
                ? (await ((Task<PaginatedVersionGroupSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GamesApi_VersionGroupRetrieve")]
        public async Task<ActionResult<VersionGroupDetail>> _VersionGroupRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/version-group/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("VersionGroupRetrieve");
            return method != null
                ? (await ((Task<VersionGroupDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GamesApi_VersionList")]
        public async Task<ActionResult<PaginatedVersionSummaryList>> _VersionList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/version/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("VersionList");
            return method != null
                ? (await ((Task<PaginatedVersionSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("GamesApi_VersionRetrieve")]
        public async Task<ActionResult<VersionDetail>> _VersionRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/version/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("VersionRetrieve");
            return method != null
                ? (await ((Task<VersionDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
