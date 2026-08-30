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
    public partial class EncountersApi
    { 
        [FunctionName("EncountersApi_EncounterConditionList")]
        public async Task<ActionResult<PaginatedEncounterConditionSummaryList>> _EncounterConditionList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/encounter-condition/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("EncounterConditionList");
            return method != null
                ? (await ((Task<PaginatedEncounterConditionSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EncountersApi_EncounterConditionRetrieve")]
        public async Task<ActionResult<EncounterConditionDetail>> _EncounterConditionRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/encounter-condition/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("EncounterConditionRetrieve");
            return method != null
                ? (await ((Task<EncounterConditionDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EncountersApi_EncounterConditionValueList")]
        public async Task<ActionResult<PaginatedEncounterConditionValueSummaryList>> _EncounterConditionValueList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/encounter-condition-value/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("EncounterConditionValueList");
            return method != null
                ? (await ((Task<PaginatedEncounterConditionValueSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EncountersApi_EncounterConditionValueRetrieve")]
        public async Task<ActionResult<EncounterConditionValueDetail>> _EncounterConditionValueRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/encounter-condition-value/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("EncounterConditionValueRetrieve");
            return method != null
                ? (await ((Task<EncounterConditionValueDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EncountersApi_EncounterMethodList")]
        public async Task<ActionResult<PaginatedEncounterMethodSummaryList>> _EncounterMethodList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/encounter-method/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("EncounterMethodList");
            return method != null
                ? (await ((Task<PaginatedEncounterMethodSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("EncountersApi_EncounterMethodRetrieve")]
        public async Task<ActionResult<EncounterMethodDetail>> _EncounterMethodRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/encounter-method/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("EncounterMethodRetrieve");
            return method != null
                ? (await ((Task<EncounterMethodDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
