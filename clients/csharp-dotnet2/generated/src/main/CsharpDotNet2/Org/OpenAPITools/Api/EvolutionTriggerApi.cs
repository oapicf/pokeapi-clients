using System;
using System.Collections.Generic;
using RestSharp;
using Org.OpenAPITools.Client;

namespace Org.OpenAPITools.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public interface IEvolutionTriggerApi
    {
        /// <summary>
        ///  
        /// </summary>
        /// <param name="limit"></param>
        /// <param name="offset"></param>
        /// <returns>string</returns>
        string EvolutionTriggerList (int? limit, int? offset);
        /// <summary>
        ///  
        /// </summary>
        /// <param name="id"></param>
        /// <returns>string</returns>
        string EvolutionTriggerRead (int? id);
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
    public class EvolutionTriggerApi : IEvolutionTriggerApi
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="EvolutionTriggerApi"/> class.
        /// </summary>
        /// <param name="apiClient"> an instance of ApiClient (optional)</param>
        /// <returns></returns>
        public EvolutionTriggerApi(ApiClient apiClient = null)
        {
            if (apiClient == null) // use the default one in Configuration
                this.ApiClient = Configuration.DefaultApiClient;
            else
                this.ApiClient = apiClient;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="EvolutionTriggerApi"/> class.
        /// </summary>
        /// <returns></returns>
        public EvolutionTriggerApi(String basePath)
        {
            this.ApiClient = new ApiClient(basePath);
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public void SetBasePath(String basePath)
        {
            this.ApiClient.BasePath = basePath;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <param name="basePath">The base path</param>
        /// <value>The base path</value>
        public String GetBasePath(String basePath)
        {
            return this.ApiClient.BasePath;
        }

        /// <summary>
        /// Gets or sets the API client.
        /// </summary>
        /// <value>An instance of the ApiClient</value>
        public ApiClient ApiClient {get; set;}

        /// <summary>
        ///  
        /// </summary>
        /// <param name="limit"></param>
        /// <param name="offset"></param>
        /// <returns>string</returns>
        public string EvolutionTriggerList (int? limit, int? offset)
        {
            

            var path = "/api/v2/evolution-trigger/";
            path = path.Replace("{format}", "json");
            
            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

             if (limit != null) queryParams.Add("limit", ApiClient.ParameterToString(limit)); // query parameter
 if (offset != null) queryParams.Add("offset", ApiClient.ParameterToString(offset)); // query parameter
                                    
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling EvolutionTriggerList: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling EvolutionTriggerList: " + response.ErrorMessage, response.ErrorMessage);

            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }

        /// <summary>
        ///  
        /// </summary>
        /// <param name="id"></param>
        /// <returns>string</returns>
        public string EvolutionTriggerRead (int? id)
        {
            
            // verify the required parameter 'id' is set
            if (id == null) throw new ApiException(400, "Missing required parameter 'id' when calling EvolutionTriggerRead");
            

            var path = "/api/v2/evolution-trigger/{id}/";
            path = path.Replace("{format}", "json");
            path = path.Replace("{" + "id" + "}", ApiClient.ParameterToString(id));

            var queryParams = new Dictionary<String, String>();
            var headerParams = new Dictionary<String, String>();
            var formParams = new Dictionary<String, String>();
            var fileParams = new Dictionary<String, FileParameter>();
            String postBody = null;

                                                
            // authentication setting, if any
            String[] authSettings = new String[] {  };

            // make the HTTP request
            IRestResponse response = (IRestResponse) ApiClient.CallApi(path, Method.GET, queryParams, postBody, headerParams, formParams, fileParams, authSettings);

            if (((int)response.StatusCode) >= 400)
                throw new ApiException ((int)response.StatusCode, "Error calling EvolutionTriggerRead: " + response.Content, response.Content);
            else if (((int)response.StatusCode) == 0)
                throw new ApiException ((int)response.StatusCode, "Error calling EvolutionTriggerRead: " + response.ErrorMessage, response.ErrorMessage);

            return (string) ApiClient.Deserialize(response.Content, typeof(string), response.Headers);
        }

    }
}
