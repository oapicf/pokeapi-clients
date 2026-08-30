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
    public partial class MovesApi
    { 
        [FunctionName("MovesApi_MoveAilmentList")]
        public async Task<ActionResult<PaginatedMoveMetaAilmentSummaryList>> _MoveAilmentList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-ailment/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MoveAilmentList");
            return method != null
                ? (await ((Task<PaginatedMoveMetaAilmentSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MovesApi_MoveAilmentRetrieve")]
        public async Task<ActionResult<MoveMetaAilmentDetail>> _MoveAilmentRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-ailment/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("MoveAilmentRetrieve");
            return method != null
                ? (await ((Task<MoveMetaAilmentDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MovesApi_MoveBattleStyleList")]
        public async Task<ActionResult<PaginatedMoveBattleStyleSummaryList>> _MoveBattleStyleList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-battle-style/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MoveBattleStyleList");
            return method != null
                ? (await ((Task<PaginatedMoveBattleStyleSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MovesApi_MoveBattleStyleRetrieve")]
        public async Task<ActionResult<MoveBattleStyleDetail>> _MoveBattleStyleRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-battle-style/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("MoveBattleStyleRetrieve");
            return method != null
                ? (await ((Task<MoveBattleStyleDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MovesApi_MoveCategoryList")]
        public async Task<ActionResult<PaginatedMoveMetaCategorySummaryList>> _MoveCategoryList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-category/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MoveCategoryList");
            return method != null
                ? (await ((Task<PaginatedMoveMetaCategorySummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MovesApi_MoveCategoryRetrieve")]
        public async Task<ActionResult<MoveMetaCategoryDetail>> _MoveCategoryRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-category/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("MoveCategoryRetrieve");
            return method != null
                ? (await ((Task<MoveMetaCategoryDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MovesApi_MoveLearnMethodList")]
        public async Task<ActionResult<PaginatedMoveLearnMethodSummaryList>> _MoveLearnMethodList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-learn-method/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MoveLearnMethodList");
            return method != null
                ? (await ((Task<PaginatedMoveLearnMethodSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MovesApi_MoveLearnMethodRetrieve")]
        public async Task<ActionResult<MoveLearnMethodDetail>> _MoveLearnMethodRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-learn-method/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("MoveLearnMethodRetrieve");
            return method != null
                ? (await ((Task<MoveLearnMethodDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MovesApi_MoveList")]
        public async Task<ActionResult<PaginatedMoveSummaryList>> _MoveList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MoveList");
            return method != null
                ? (await ((Task<PaginatedMoveSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MovesApi_MoveRetrieve")]
        public async Task<ActionResult<MoveDetail>> _MoveRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("MoveRetrieve");
            return method != null
                ? (await ((Task<MoveDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MovesApi_MoveTargetList")]
        public async Task<ActionResult<PaginatedMoveTargetSummaryList>> _MoveTargetList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-target/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("MoveTargetList");
            return method != null
                ? (await ((Task<PaginatedMoveTargetSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("MovesApi_MoveTargetRetrieve")]
        public async Task<ActionResult<MoveTargetDetail>> _MoveTargetRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/move-target/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("MoveTargetRetrieve");
            return method != null
                ? (await ((Task<MoveTargetDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
