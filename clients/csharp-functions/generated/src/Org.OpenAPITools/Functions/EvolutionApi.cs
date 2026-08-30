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
    public partial class EvolutionApi
    { 
        [FunctionName("EvolutionApi_EvolutionChainList")]
        public async Task<ActionResult<PaginatedEvolutionChainSummaryList>> _EvolutionChainList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/evolution-chain/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("EvolutionChainList");
            return method != null
                ? (await ((Task<PaginatedEvolutionChainSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EvolutionApi_EvolutionChainRetrieve")]
        public async Task<ActionResult<EvolutionChainDetail>> _EvolutionChainRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/evolution-chain/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("EvolutionChainRetrieve");
            return method != null
                ? (await ((Task<EvolutionChainDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EvolutionApi_EvolutionTriggerList")]
        public async Task<ActionResult<PaginatedEvolutionTriggerSummaryList>> _EvolutionTriggerList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/evolution-trigger/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("EvolutionTriggerList");
            return method != null
                ? (await ((Task<PaginatedEvolutionTriggerSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EvolutionApi_EvolutionTriggerRetrieve")]
        public async Task<ActionResult<EvolutionTriggerDetail>> _EvolutionTriggerRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/evolution-trigger/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("EvolutionTriggerRetrieve");
            return method != null
                ? (await ((Task<EvolutionTriggerDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
