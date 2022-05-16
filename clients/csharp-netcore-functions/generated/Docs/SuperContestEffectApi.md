# Org.OpenAPITools.Apis.SuperContestEffectApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SuperContestEffectList**](SuperContestEffectApi.md#supercontesteffectlist) | **GET** /api/v2/super-contest-effect/ | 
[**SuperContestEffectRead**](SuperContestEffectApi.md#supercontesteffectread) | **GET** /api/v2/super-contest-effect/{id}/ | 


<a name="supercontesteffectlist"></a>
# **SuperContestEffectList**
> string SuperContestEffectList (int? limit = null, int? offset = null)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Apis;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Models;

namespace Example
{
    public class SuperContestEffectListExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://pokeapi.co/api/v2";
            var apiInstance = new SuperContestEffectApi(config);
            var limit = 56;  // int? |  (optional) 
            var offset = 56;  // int? |  (optional) 

            try
            {
                string result = apiInstance.SuperContestEffectList(limit, offset);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SuperContestEffectApi.SuperContestEffectList: " + e.Message );
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

<a name="supercontesteffectread"></a>
# **SuperContestEffectRead**
> string SuperContestEffectRead (int id)



### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using Org.OpenAPITools.Apis;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Models;

namespace Example
{
    public class SuperContestEffectReadExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://pokeapi.co/api/v2";
            var apiInstance = new SuperContestEffectApi(config);
            var id = 56;  // int | 

            try
            {
                string result = apiInstance.SuperContestEffectRead(id);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling SuperContestEffectApi.SuperContestEffectRead: " + e.Message );
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

