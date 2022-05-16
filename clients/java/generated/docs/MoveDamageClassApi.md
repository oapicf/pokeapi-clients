# MoveDamageClassApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveDamageClassList**](MoveDamageClassApi.md#moveDamageClassList) | **GET** /api/v2/move-damage-class/ | 
[**moveDamageClassRead**](MoveDamageClassApi.md#moveDamageClassRead) | **GET** /api/v2/move-damage-class/{id}/ | 


<a name="moveDamageClassList"></a>
# **moveDamageClassList**
> String moveDamageClassList(limit, offset)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MoveDamageClassApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co/api/v2");

    MoveDamageClassApi apiInstance = new MoveDamageClassApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      String result = apiInstance.moveDamageClassList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MoveDamageClassApi#moveDamageClassList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**|  | [optional]
 **offset** | **Integer**|  | [optional]

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

<a name="moveDamageClassRead"></a>
# **moveDamageClassRead**
> String moveDamageClassRead(id)



### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MoveDamageClassApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co/api/v2");

    MoveDamageClassApi apiInstance = new MoveDamageClassApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      String result = apiInstance.moveDamageClassRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MoveDamageClassApi#moveDamageClassRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **Integer**|  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**0** | Default response |  -  |

