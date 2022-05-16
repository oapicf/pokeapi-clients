# Org.OpenAPITools.Api.ItemFlingEffectApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemFlingEffectList**](ItemFlingEffectApi.md#itemflingeffectlist) | **GET** /api/v2/item-fling-effect/ | 
[**ItemFlingEffectRead**](ItemFlingEffectApi.md#itemflingeffectread) | **GET** /api/v2/item-fling-effect/{id}/ | 


<a name="itemflingeffectlist"></a>
# **ItemFlingEffectList**
> string ItemFlingEffectList (int? limit, int? offset)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ItemFlingEffectListExample
    {
        public void main()
        {
            var apiInstance = new ItemFlingEffectApi();
            var limit = 56;  // int? |  (optional) 
            var offset = 56;  // int? |  (optional) 

            try
            {
                string result = apiInstance.ItemFlingEffectList(limit, offset);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ItemFlingEffectApi.ItemFlingEffectList: " + e.Message );
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

<a name="itemflingeffectread"></a>
# **ItemFlingEffectRead**
> string ItemFlingEffectRead (int? id)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class ItemFlingEffectReadExample
    {
        public void main()
        {
            var apiInstance = new ItemFlingEffectApi();
            var id = 56;  // int? | 

            try
            {
                string result = apiInstance.ItemFlingEffectRead(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ItemFlingEffectApi.ItemFlingEffectRead: " + e.Message );
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

