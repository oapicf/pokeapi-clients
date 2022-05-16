# Org.OpenAPITools.Api.EvolutionChainApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EvolutionChainList**](EvolutionChainApi.md#evolutionchainlist) | **GET** /api/v2/evolution-chain/ | 
[**EvolutionChainRead**](EvolutionChainApi.md#evolutionchainread) | **GET** /api/v2/evolution-chain/{id}/ | 


<a name="evolutionchainlist"></a>
# **EvolutionChainList**
> string EvolutionChainList (int? limit = null, int? offset = null)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EvolutionChainListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://pokeapi.co/api/v2";
            var apiInstance = new EvolutionChainApi(config);
            var limit = 56;  // int? |  (optional) 
            var offset = 56;  // int? |  (optional) 

            try
            {
                string result = apiInstance.EvolutionChainList(limit, offset);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EvolutionChainApi.EvolutionChainList: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int?**|  | [optional] 
 **offset** | **int?**|  | [optional] 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="evolutionchainread"></a>
# **EvolutionChainRead**
> string EvolutionChainRead (int id)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EvolutionChainReadExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://pokeapi.co/api/v2";
            var apiInstance = new EvolutionChainApi(config);
            var id = 56;  // int | 

            try
            {
                string result = apiInstance.EvolutionChainRead(id);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling EvolutionChainApi.EvolutionChainRead: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int**|  | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

