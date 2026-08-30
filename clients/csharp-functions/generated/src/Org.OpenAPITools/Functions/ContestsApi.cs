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
    public partial class ContestsApi
    { 
        [FunctionName("ContestsApi_ContestEffectList")]
        public async Task<ActionResult<PaginatedContestEffectSummaryList>> _ContestEffectList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/contest-effect/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ContestEffectList");
            return method != null
                ? (await ((Task<PaginatedContestEffectSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContestsApi_ContestEffectRetrieve")]
        public async Task<ActionResult<ContestEffectDetail>> _ContestEffectRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/contest-effect/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("ContestEffectRetrieve");
            return method != null
                ? (await ((Task<ContestEffectDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContestsApi_ContestTypeList")]
        public async Task<ActionResult<PaginatedContestTypeSummaryList>> _ContestTypeList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/contest-type/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("ContestTypeList");
            return method != null
                ? (await ((Task<PaginatedContestTypeSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContestsApi_ContestTypeRetrieve")]
        public async Task<ActionResult<ContestTypeDetail>> _ContestTypeRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/contest-type/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("ContestTypeRetrieve");
            return method != null
                ? (await ((Task<ContestTypeDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContestsApi_SuperContestEffectList")]
        public async Task<ActionResult<PaginatedSuperContestEffectSummaryList>> _SuperContestEffectList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/super-contest-effect/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("SuperContestEffectList");
            return method != null
                ? (await ((Task<PaginatedSuperContestEffectSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("ContestsApi_SuperContestEffectRetrieve")]
        public async Task<ActionResult<SuperContestEffectDetail>> _SuperContestEffectRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/super-contest-effect/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("SuperContestEffectRetrieve");
            return method != null
                ? (await ((Task<SuperContestEffectDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
