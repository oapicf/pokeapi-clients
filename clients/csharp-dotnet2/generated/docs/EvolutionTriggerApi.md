# Org.OpenAPITools.Api.EvolutionTriggerApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EvolutionTriggerList**](EvolutionTriggerApi.md#evolutiontriggerlist) | **GET** /api/v2/evolution-trigger/ | 
[**EvolutionTriggerRead**](EvolutionTriggerApi.md#evolutiontriggerread) | **GET** /api/v2/evolution-trigger/{id}/ | 


<a name="evolutiontriggerlist"></a>
# **EvolutionTriggerList**
> string EvolutionTriggerList (int? limit, int? offset)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EvolutionTriggerListExample
    {
        public void main()
        {
            var apiInstance = new EvolutionTriggerApi();
            var limit = 56;  // int? |  (optional) 
            var offset = 56;  // int? |  (optional) 

            try
            {
                string result = apiInstance.EvolutionTriggerList(limit, offset);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EvolutionTriggerApi.EvolutionTriggerList: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="evolutiontriggerread"></a>
# **EvolutionTriggerRead**
> string EvolutionTriggerRead (int? id)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class EvolutionTriggerReadExample
    {
        public void main()
        {
            var apiInstance = new EvolutionTriggerApi();
            var id = 56;  // int? | 

            try
            {
                string result = apiInstance.EvolutionTriggerRead(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling EvolutionTriggerApi.EvolutionTriggerRead: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **int?**|  | 

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

