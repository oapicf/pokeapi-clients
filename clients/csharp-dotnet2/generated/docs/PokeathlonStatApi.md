# Org.OpenAPITools.Api.PokeathlonStatApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokeathlonStatList**](PokeathlonStatApi.md#pokeathlonstatlist) | **GET** /api/v2/pokeathlon-stat/ | 
[**PokeathlonStatRead**](PokeathlonStatApi.md#pokeathlonstatread) | **GET** /api/v2/pokeathlon-stat/{id}/ | 


<a name="pokeathlonstatlist"></a>
# **PokeathlonStatList**
> string PokeathlonStatList (int? limit, int? offset)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PokeathlonStatListExample
    {
        public void main()
        {
            var apiInstance = new PokeathlonStatApi();
            var limit = 56;  // int? |  (optional) 
            var offset = 56;  // int? |  (optional) 

            try
            {
                string result = apiInstance.PokeathlonStatList(limit, offset);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PokeathlonStatApi.PokeathlonStatList: " + e.Message );
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

<a name="pokeathlonstatread"></a>
# **PokeathlonStatRead**
> string PokeathlonStatRead (int? id)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class PokeathlonStatReadExample
    {
        public void main()
        {
            var apiInstance = new PokeathlonStatApi();
            var id = 56;  // int? | 

            try
            {
                string result = apiInstance.PokeathlonStatRead(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling PokeathlonStatApi.PokeathlonStatRead: " + e.Message );
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

