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
    public partial class UtilityApi
    { 
        [FunctionName("UtilityApi_LanguageList")]
        public async Task<ActionResult<PaginatedLanguageSummaryList>> _LanguageList([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/language/")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("LanguageList");
            return method != null
                ? (await ((Task<PaginatedLanguageSummaryList>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("UtilityApi_LanguageRetrieve")]
        public async Task<ActionResult<LanguageDetail>> _LanguageRetrieve([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "api/v2/language/{id}/")]HttpRequest req, ExecutionContext context, string id)
        {
            var method = this.GetType().GetMethod("LanguageRetrieve");
            return method != null
                ? (await ((Task<LanguageDetail>)method.Invoke(this, new object[] { req, context, id })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}
