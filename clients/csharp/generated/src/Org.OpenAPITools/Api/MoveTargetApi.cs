// <auto-generated>
/*
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 20220523
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

#nullable enable

using System;
using System.Collections.Generic;
using System.Net;
using System.Threading.Tasks;
using Microsoft.Extensions.Logging;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Text.Json;
using Org.OpenAPITools.Client;
using System.Diagnostics.CodeAnalysis;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// This class is registered as transient.
    /// </summary>
    public interface IMoveTargetApi : IApi
    {
        /// <summary>
        /// The class containing the events
        /// </summary>
        MoveTargetApiEvents Events { get; }

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="limit"> (optional)</param>
        /// <param name="offset"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="IMoveTargetListApiResponse"/>&gt;</returns>
        Task<IMoveTargetListApiResponse> MoveTargetListAsync(Option<int> limit = default, Option<int> offset = default, System.Threading.CancellationToken cancellationToken = default);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="limit"> (optional)</param>
        /// <param name="offset"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="IMoveTargetListApiResponse"/>?&gt;</returns>
        Task<IMoveTargetListApiResponse?> MoveTargetListOrDefaultAsync(Option<int> limit = default, Option<int> offset = default, System.Threading.CancellationToken cancellationToken = default);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="IMoveTargetReadApiResponse"/>&gt;</returns>
        Task<IMoveTargetReadApiResponse> MoveTargetReadAsync(int id, System.Threading.CancellationToken cancellationToken = default);

        /// <summary>
        /// 
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <param name="id"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="IMoveTargetReadApiResponse"/>?&gt;</returns>
        Task<IMoveTargetReadApiResponse?> MoveTargetReadOrDefaultAsync(int id, System.Threading.CancellationToken cancellationToken = default);
    }

    /// <summary>
    /// The <see cref="IMoveTargetListApiResponse"/>
    /// </summary>
    public interface IMoveTargetListApiResponse : Org.OpenAPITools.Client.IApiResponse, IDefault<string?>
    {
        /// <summary>
        /// Returns true if the response is the default response type
        /// </summary>
        /// <returns></returns>
        bool IsDefault { get; }
    }

    /// <summary>
    /// The <see cref="IMoveTargetReadApiResponse"/>
    /// </summary>
    public interface IMoveTargetReadApiResponse : Org.OpenAPITools.Client.IApiResponse, IDefault<string?>
    {
        /// <summary>
        /// Returns true if the response is the default response type
        /// </summary>
        /// <returns></returns>
        bool IsDefault { get; }
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class MoveTargetApiEvents
    {
        /// <summary>
        /// The event raised after the server response
        /// </summary>
        public event EventHandler<ApiResponseEventArgs>? OnMoveTargetList;

        /// <summary>
        /// The event raised after an error querying the server
        /// </summary>
        public event EventHandler<ExceptionEventArgs>? OnErrorMoveTargetList;

        internal void ExecuteOnMoveTargetList(MoveTargetApi.MoveTargetListApiResponse apiResponse)
        {
            OnMoveTargetList?.Invoke(this, new ApiResponseEventArgs(apiResponse));
        }

        internal void ExecuteOnErrorMoveTargetList(Exception exception)
        {
            OnErrorMoveTargetList?.Invoke(this, new ExceptionEventArgs(exception));
        }

        /// <summary>
        /// The event raised after the server response
        /// </summary>
        public event EventHandler<ApiResponseEventArgs>? OnMoveTargetRead;

        /// <summary>
        /// The event raised after an error querying the server
        /// </summary>
        public event EventHandler<ExceptionEventArgs>? OnErrorMoveTargetRead;

        internal void ExecuteOnMoveTargetRead(MoveTargetApi.MoveTargetReadApiResponse apiResponse)
        {
            OnMoveTargetRead?.Invoke(this, new ApiResponseEventArgs(apiResponse));
        }

        internal void ExecuteOnErrorMoveTargetRead(Exception exception)
        {
            OnErrorMoveTargetRead?.Invoke(this, new ExceptionEventArgs(exception));
        }
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public sealed partial class MoveTargetApi : IMoveTargetApi
    {
        private JsonSerializerOptions _jsonSerializerOptions;

        /// <summary>
        /// The logger factory
        /// </summary>
        public ILoggerFactory LoggerFactory { get; }

        /// <summary>
        /// The logger
        /// </summary>
        public ILogger<MoveTargetApi> Logger { get; }

        /// <summary>
        /// The HttpClient
        /// </summary>
        public HttpClient HttpClient { get; }

        /// <summary>
        /// The class containing the events
        /// </summary>
        public MoveTargetApiEvents Events { get; }

        /// <summary>
        /// Initializes a new instance of the <see cref="MoveTargetApi"/> class.
        /// </summary>
        /// <returns></returns>
        public MoveTargetApi(ILogger<MoveTargetApi> logger, ILoggerFactory loggerFactory, HttpClient httpClient, JsonSerializerOptionsProvider jsonSerializerOptionsProvider, MoveTargetApiEvents moveTargetApiEvents)
        {
            _jsonSerializerOptions = jsonSerializerOptionsProvider.Options;
            LoggerFactory = loggerFactory;
            Logger = LoggerFactory.CreateLogger<MoveTargetApi>();
            HttpClient = httpClient;
            Events = moveTargetApiEvents;
        }

        partial void FormatMoveTargetList(ref Option<int> limit, ref Option<int> offset);

        /// <summary>
        /// Processes the server response
        /// </summary>
        /// <param name="apiResponseLocalVar"></param>
        /// <param name="limit"></param>
        /// <param name="offset"></param>
        private void AfterMoveTargetListDefaultImplementation(IMoveTargetListApiResponse apiResponseLocalVar, Option<int> limit, Option<int> offset)
        {
            bool suppressDefaultLog = false;
            AfterMoveTargetList(ref suppressDefaultLog, apiResponseLocalVar, limit, offset);
            if (!suppressDefaultLog)
                Logger.LogInformation("{0,-9} | {1} | {3}", (apiResponseLocalVar.DownloadedAt - apiResponseLocalVar.RequestedAt).TotalSeconds, apiResponseLocalVar.StatusCode, apiResponseLocalVar.Path);
        }

        /// <summary>
        /// Processes the server response
        /// </summary>
        /// <param name="suppressDefaultLog"></param>
        /// <param name="apiResponseLocalVar"></param>
        /// <param name="limit"></param>
        /// <param name="offset"></param>
        partial void AfterMoveTargetList(ref bool suppressDefaultLog, IMoveTargetListApiResponse apiResponseLocalVar, Option<int> limit, Option<int> offset);

        /// <summary>
        /// Logs exceptions that occur while retrieving the server response
        /// </summary>
        /// <param name="exceptionLocalVar"></param>
        /// <param name="pathFormatLocalVar"></param>
        /// <param name="pathLocalVar"></param>
        /// <param name="limit"></param>
        /// <param name="offset"></param>
        private void OnErrorMoveTargetListDefaultImplementation(Exception exceptionLocalVar, string pathFormatLocalVar, string pathLocalVar, Option<int> limit, Option<int> offset)
        {
            bool suppressDefaultLogLocalVar = false;
            OnErrorMoveTargetList(ref suppressDefaultLogLocalVar, exceptionLocalVar, pathFormatLocalVar, pathLocalVar, limit, offset);
            if (!suppressDefaultLogLocalVar)
                Logger.LogError(exceptionLocalVar, "An error occurred while sending the request to the server.");
        }

        /// <summary>
        /// A partial method that gives developers a way to provide customized exception handling
        /// </summary>
        /// <param name="suppressDefaultLogLocalVar"></param>
        /// <param name="exceptionLocalVar"></param>
        /// <param name="pathFormatLocalVar"></param>
        /// <param name="pathLocalVar"></param>
        /// <param name="limit"></param>
        /// <param name="offset"></param>
        partial void OnErrorMoveTargetList(ref bool suppressDefaultLogLocalVar, Exception exceptionLocalVar, string pathFormatLocalVar, string pathLocalVar, Option<int> limit, Option<int> offset);

        /// <summary>
        ///  
        /// </summary>
        /// <param name="limit"> (optional)</param>
        /// <param name="offset"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="IMoveTargetListApiResponse"/>&gt;</returns>
        public async Task<IMoveTargetListApiResponse?> MoveTargetListOrDefaultAsync(Option<int> limit = default, Option<int> offset = default, System.Threading.CancellationToken cancellationToken = default)
        {
            try
            {
                return await MoveTargetListAsync(limit, offset, cancellationToken).ConfigureAwait(false);
            }
            catch (Exception)
            {
                return null;
            }
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="limit"> (optional)</param>
        /// <param name="offset"> (optional)</param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="IMoveTargetListApiResponse"/>&gt;</returns>
        public async Task<IMoveTargetListApiResponse> MoveTargetListAsync(Option<int> limit = default, Option<int> offset = default, System.Threading.CancellationToken cancellationToken = default)
        {
            UriBuilder uriBuilderLocalVar = new UriBuilder();

            try
            {
                FormatMoveTargetList(ref limit, ref offset);

                using (HttpRequestMessage httpRequestMessageLocalVar = new HttpRequestMessage())
                {
                    uriBuilderLocalVar.Host = HttpClient.BaseAddress!.Host;
                    uriBuilderLocalVar.Port = HttpClient.BaseAddress.Port;
                    uriBuilderLocalVar.Scheme = HttpClient.BaseAddress.Scheme;
                    uriBuilderLocalVar.Path = ClientUtils.CONTEXT_PATH + "/api/v2/move-target/";

                    System.Collections.Specialized.NameValueCollection parseQueryStringLocalVar = System.Web.HttpUtility.ParseQueryString(string.Empty);

                    if (limit.IsSet)
                        parseQueryStringLocalVar["limit"] = ClientUtils.ParameterToString(limit.Value);

                    if (offset.IsSet)
                        parseQueryStringLocalVar["offset"] = ClientUtils.ParameterToString(offset.Value);

                    uriBuilderLocalVar.Query = parseQueryStringLocalVar.ToString();

                    httpRequestMessageLocalVar.RequestUri = uriBuilderLocalVar.Uri;

                    string[] acceptLocalVars = new string[] {
                        "text/plain"
                    };

                    string? acceptLocalVar = ClientUtils.SelectHeaderAccept(acceptLocalVars);

                    if (acceptLocalVar != null)
                        httpRequestMessageLocalVar.Headers.Accept.Add(new MediaTypeWithQualityHeaderValue(acceptLocalVar));

                    httpRequestMessageLocalVar.Method = HttpMethod.Get;

                    DateTime requestedAtLocalVar = DateTime.UtcNow;

                    using (HttpResponseMessage httpResponseMessageLocalVar = await HttpClient.SendAsync(httpRequestMessageLocalVar, cancellationToken).ConfigureAwait(false))
                    {
                        string responseContentLocalVar = await httpResponseMessageLocalVar.Content.ReadAsStringAsync(cancellationToken).ConfigureAwait(false);

                        ILogger<MoveTargetListApiResponse> apiResponseLoggerLocalVar = LoggerFactory.CreateLogger<MoveTargetListApiResponse>();

                        MoveTargetListApiResponse apiResponseLocalVar = new(apiResponseLoggerLocalVar, httpRequestMessageLocalVar, httpResponseMessageLocalVar, responseContentLocalVar, "/api/v2/move-target/", requestedAtLocalVar, _jsonSerializerOptions);

                        AfterMoveTargetListDefaultImplementation(apiResponseLocalVar, limit, offset);

                        Events.ExecuteOnMoveTargetList(apiResponseLocalVar);

                        return apiResponseLocalVar;
                    }
                }
            }
            catch(Exception e)
            {
                OnErrorMoveTargetListDefaultImplementation(e, "/api/v2/move-target/", uriBuilderLocalVar.Path, limit, offset);
                Events.ExecuteOnErrorMoveTargetList(e);
                throw;
            }
        }

        /// <summary>
        /// The <see cref="MoveTargetListApiResponse"/>
        /// </summary>
        public partial class MoveTargetListApiResponse : Org.OpenAPITools.Client.ApiResponse, IMoveTargetListApiResponse
        {
            /// <summary>
            /// The logger
            /// </summary>
            public ILogger<MoveTargetListApiResponse> Logger { get; }

            /// <summary>
            /// The <see cref="MoveTargetListApiResponse"/>
            /// </summary>
            /// <param name="logger"></param>
            /// <param name="httpRequestMessage"></param>
            /// <param name="httpResponseMessage"></param>
            /// <param name="rawContent"></param>
            /// <param name="path"></param>
            /// <param name="requestedAt"></param>
            /// <param name="jsonSerializerOptions"></param>
            public MoveTargetListApiResponse(ILogger<MoveTargetListApiResponse> logger, System.Net.Http.HttpRequestMessage httpRequestMessage, System.Net.Http.HttpResponseMessage httpResponseMessage, string rawContent, string path, DateTime requestedAt, System.Text.Json.JsonSerializerOptions jsonSerializerOptions) : base(httpRequestMessage, httpResponseMessage, rawContent, path, requestedAt, jsonSerializerOptions)
            {
                Logger = logger;
                OnCreated(httpRequestMessage, httpResponseMessage);
            }

            partial void OnCreated(global::System.Net.Http.HttpRequestMessage httpRequestMessage, System.Net.Http.HttpResponseMessage httpResponseMessage);

            /// <summary>
            /// Returns true if the response is the default response type
            /// </summary>
            /// <returns></returns>
            public bool IsDefault => true;

            /// <summary>
            /// Deserializes the response if the response is 0 Default
            /// </summary>
            /// <returns></returns>
            public string? Default()
            {
                // This logic may be modified with the AsModel.mustache template
                return IsDefault
                    ? System.Text.Json.JsonSerializer.Deserialize<string>(RawContent, _jsonSerializerOptions)
                    : null;
            }

            /// <summary>
            /// Returns true if the response is 0 Default and the deserialized response is not null
            /// </summary>
            /// <param name="result"></param>
            /// <returns></returns>
            public bool TryDefault([NotNullWhen(true)]out string? result)
            {
                result = null;

                try
                {
                    result = Default();
                } catch (Exception e)
                {
                    OnDeserializationErrorDefaultImplementation(e, (HttpStatusCode)0);
                }

                return result != null;
            }

            private void OnDeserializationErrorDefaultImplementation(Exception exception, HttpStatusCode httpStatusCode)
            {
                bool suppressDefaultLog = false;
                OnDeserializationError(ref suppressDefaultLog, exception, httpStatusCode);
                if (!suppressDefaultLog)
                    Logger.LogError(exception, "An error occurred while deserializing the {code} response.", httpStatusCode);
            }

            partial void OnDeserializationError(ref bool suppressDefaultLog, Exception exception, HttpStatusCode httpStatusCode);
        }

        partial void FormatMoveTargetRead(ref int id);

        /// <summary>
        /// Processes the server response
        /// </summary>
        /// <param name="apiResponseLocalVar"></param>
        /// <param name="id"></param>
        private void AfterMoveTargetReadDefaultImplementation(IMoveTargetReadApiResponse apiResponseLocalVar, int id)
        {
            bool suppressDefaultLog = false;
            AfterMoveTargetRead(ref suppressDefaultLog, apiResponseLocalVar, id);
            if (!suppressDefaultLog)
                Logger.LogInformation("{0,-9} | {1} | {3}", (apiResponseLocalVar.DownloadedAt - apiResponseLocalVar.RequestedAt).TotalSeconds, apiResponseLocalVar.StatusCode, apiResponseLocalVar.Path);
        }

        /// <summary>
        /// Processes the server response
        /// </summary>
        /// <param name="suppressDefaultLog"></param>
        /// <param name="apiResponseLocalVar"></param>
        /// <param name="id"></param>
        partial void AfterMoveTargetRead(ref bool suppressDefaultLog, IMoveTargetReadApiResponse apiResponseLocalVar, int id);

        /// <summary>
        /// Logs exceptions that occur while retrieving the server response
        /// </summary>
        /// <param name="exceptionLocalVar"></param>
        /// <param name="pathFormatLocalVar"></param>
        /// <param name="pathLocalVar"></param>
        /// <param name="id"></param>
        private void OnErrorMoveTargetReadDefaultImplementation(Exception exceptionLocalVar, string pathFormatLocalVar, string pathLocalVar, int id)
        {
            bool suppressDefaultLogLocalVar = false;
            OnErrorMoveTargetRead(ref suppressDefaultLogLocalVar, exceptionLocalVar, pathFormatLocalVar, pathLocalVar, id);
            if (!suppressDefaultLogLocalVar)
                Logger.LogError(exceptionLocalVar, "An error occurred while sending the request to the server.");
        }

        /// <summary>
        /// A partial method that gives developers a way to provide customized exception handling
        /// </summary>
        /// <param name="suppressDefaultLogLocalVar"></param>
        /// <param name="exceptionLocalVar"></param>
        /// <param name="pathFormatLocalVar"></param>
        /// <param name="pathLocalVar"></param>
        /// <param name="id"></param>
        partial void OnErrorMoveTargetRead(ref bool suppressDefaultLogLocalVar, Exception exceptionLocalVar, string pathFormatLocalVar, string pathLocalVar, int id);

        /// <summary>
        ///  
        /// </summary>
        /// <param name="id"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="IMoveTargetReadApiResponse"/>&gt;</returns>
        public async Task<IMoveTargetReadApiResponse?> MoveTargetReadOrDefaultAsync(int id, System.Threading.CancellationToken cancellationToken = default)
        {
            try
            {
                return await MoveTargetReadAsync(id, cancellationToken).ConfigureAwait(false);
            }
            catch (Exception)
            {
                return null;
            }
        }

        /// <summary>
        ///  
        /// </summary>
        /// <exception cref="ApiException">Thrown when fails to make API call</exception>
        /// <param name="id"></param>
        /// <param name="cancellationToken">Cancellation Token to cancel the request.</param>
        /// <returns><see cref="Task"/>&lt;<see cref="IMoveTargetReadApiResponse"/>&gt;</returns>
        public async Task<IMoveTargetReadApiResponse> MoveTargetReadAsync(int id, System.Threading.CancellationToken cancellationToken = default)
        {
            UriBuilder uriBuilderLocalVar = new UriBuilder();

            try
            {
                FormatMoveTargetRead(ref id);

                using (HttpRequestMessage httpRequestMessageLocalVar = new HttpRequestMessage())
                {
                    uriBuilderLocalVar.Host = HttpClient.BaseAddress!.Host;
                    uriBuilderLocalVar.Port = HttpClient.BaseAddress.Port;
                    uriBuilderLocalVar.Scheme = HttpClient.BaseAddress.Scheme;
                    uriBuilderLocalVar.Path = ClientUtils.CONTEXT_PATH + "/api/v2/move-target/{id}/";
                    uriBuilderLocalVar.Path = uriBuilderLocalVar.Path.Replace("%7Bid%7D", Uri.EscapeDataString(id.ToString()));

                    httpRequestMessageLocalVar.RequestUri = uriBuilderLocalVar.Uri;

                    string[] acceptLocalVars = new string[] {
                        "text/plain"
                    };

                    string? acceptLocalVar = ClientUtils.SelectHeaderAccept(acceptLocalVars);

                    if (acceptLocalVar != null)
                        httpRequestMessageLocalVar.Headers.Accept.Add(new MediaTypeWithQualityHeaderValue(acceptLocalVar));

                    httpRequestMessageLocalVar.Method = HttpMethod.Get;

                    DateTime requestedAtLocalVar = DateTime.UtcNow;

                    using (HttpResponseMessage httpResponseMessageLocalVar = await HttpClient.SendAsync(httpRequestMessageLocalVar, cancellationToken).ConfigureAwait(false))
                    {
                        string responseContentLocalVar = await httpResponseMessageLocalVar.Content.ReadAsStringAsync(cancellationToken).ConfigureAwait(false);

                        ILogger<MoveTargetReadApiResponse> apiResponseLoggerLocalVar = LoggerFactory.CreateLogger<MoveTargetReadApiResponse>();

                        MoveTargetReadApiResponse apiResponseLocalVar = new(apiResponseLoggerLocalVar, httpRequestMessageLocalVar, httpResponseMessageLocalVar, responseContentLocalVar, "/api/v2/move-target/{id}/", requestedAtLocalVar, _jsonSerializerOptions);

                        AfterMoveTargetReadDefaultImplementation(apiResponseLocalVar, id);

                        Events.ExecuteOnMoveTargetRead(apiResponseLocalVar);

                        return apiResponseLocalVar;
                    }
                }
            }
            catch(Exception e)
            {
                OnErrorMoveTargetReadDefaultImplementation(e, "/api/v2/move-target/{id}/", uriBuilderLocalVar.Path, id);
                Events.ExecuteOnErrorMoveTargetRead(e);
                throw;
            }
        }

        /// <summary>
        /// The <see cref="MoveTargetReadApiResponse"/>
        /// </summary>
        public partial class MoveTargetReadApiResponse : Org.OpenAPITools.Client.ApiResponse, IMoveTargetReadApiResponse
        {
            /// <summary>
            /// The logger
            /// </summary>
            public ILogger<MoveTargetReadApiResponse> Logger { get; }

            /// <summary>
            /// The <see cref="MoveTargetReadApiResponse"/>
            /// </summary>
            /// <param name="logger"></param>
            /// <param name="httpRequestMessage"></param>
            /// <param name="httpResponseMessage"></param>
            /// <param name="rawContent"></param>
            /// <param name="path"></param>
            /// <param name="requestedAt"></param>
            /// <param name="jsonSerializerOptions"></param>
            public MoveTargetReadApiResponse(ILogger<MoveTargetReadApiResponse> logger, System.Net.Http.HttpRequestMessage httpRequestMessage, System.Net.Http.HttpResponseMessage httpResponseMessage, string rawContent, string path, DateTime requestedAt, System.Text.Json.JsonSerializerOptions jsonSerializerOptions) : base(httpRequestMessage, httpResponseMessage, rawContent, path, requestedAt, jsonSerializerOptions)
            {
                Logger = logger;
                OnCreated(httpRequestMessage, httpResponseMessage);
            }

            partial void OnCreated(global::System.Net.Http.HttpRequestMessage httpRequestMessage, System.Net.Http.HttpResponseMessage httpResponseMessage);

            /// <summary>
            /// Returns true if the response is the default response type
            /// </summary>
            /// <returns></returns>
            public bool IsDefault => true;

            /// <summary>
            /// Deserializes the response if the response is 0 Default
            /// </summary>
            /// <returns></returns>
            public string? Default()
            {
                // This logic may be modified with the AsModel.mustache template
                return IsDefault
                    ? System.Text.Json.JsonSerializer.Deserialize<string>(RawContent, _jsonSerializerOptions)
                    : null;
            }

            /// <summary>
            /// Returns true if the response is 0 Default and the deserialized response is not null
            /// </summary>
            /// <param name="result"></param>
            /// <returns></returns>
            public bool TryDefault([NotNullWhen(true)]out string? result)
            {
                result = null;

                try
                {
                    result = Default();
                } catch (Exception e)
                {
                    OnDeserializationErrorDefaultImplementation(e, (HttpStatusCode)0);
                }

                return result != null;
            }

            private void OnDeserializationErrorDefaultImplementation(Exception exception, HttpStatusCode httpStatusCode)
            {
                bool suppressDefaultLog = false;
                OnDeserializationError(ref suppressDefaultLog, exception, httpStatusCode);
                if (!suppressDefaultLog)
                    Logger.LogError(exception, "An error occurred while deserializing the {code} response.", httpStatusCode);
            }

            partial void OnDeserializationError(ref bool suppressDefaultLog, Exception exception, HttpStatusCode httpStatusCode);
        }
    }
}
