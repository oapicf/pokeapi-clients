# Org.OpenAPITools.Api.MoveLearnMethodApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveLearnMethodList**](MoveLearnMethodApi.md#movelearnmethodlist) | **GET** /api/v2/move-learn-method/ | 
[**MoveLearnMethodRead**](MoveLearnMethodApi.md#movelearnmethodread) | **GET** /api/v2/move-learn-method/{id}/ | 


<a name="movelearnmethodlist"></a>
# **MoveLearnMethodList**
> string MoveLearnMethodList (int? limit, int? offset)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MoveLearnMethodListExample
    {
        public void main()
        {
            var apiInstance = new MoveLearnMethodApi();
            var limit = 56;  // int? |  (optional) 
            var offset = 56;  // int? |  (optional) 

            try
            {
                string result = apiInstance.MoveLearnMethodList(limit, offset);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MoveLearnMethodApi.MoveLearnMethodList: " + e.Message );
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

<a name="movelearnmethodread"></a>
# **MoveLearnMethodRead**
> string MoveLearnMethodRead (int? id)



### Example
```csharp
using System;
using System.Diagnostics;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Client;
using Org.OpenAPITools.Model;

namespace Example
{
    public class MoveLearnMethodReadExample
    {
        public void main()
        {
            var apiInstance = new MoveLearnMethodApi();
            var id = 56;  // int? | 

            try
            {
                string result = apiInstance.MoveLearnMethodRead(id);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling MoveLearnMethodApi.MoveLearnMethodRead: " + e.Message );
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

