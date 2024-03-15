# ContestEffectApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**contestEffectList**](ContestEffectApi.md#contestEffectList) | **GET** /api/v2/contest-effect/ |  |
| [**contestEffectRead**](ContestEffectApi.md#contestEffectRead) | **GET** /api/v2/contest-effect/{id}/ |  |


<a id="contestEffectList"></a>
# **contestEffectList**
> String contestEffectList(limit, offset)



### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.ContestEffectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    ContestEffectApi apiInstance = new ContestEffectApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      String result = apiInstance.contestEffectList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContestEffectApi#contestEffectList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |

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
| **0** | Default response |  -  |

<a id="contestEffectRead"></a>
# **contestEffectRead**
> String contestEffectRead(id)



### Example
```java
// Import classes:
import com.github.oapicf.pokeapiclient.ApiClient;
import com.github.oapicf.pokeapiclient.ApiException;
import com.github.oapicf.pokeapiclient.Configuration;
import com.github.oapicf.pokeapiclient.models.*;
import com.github.oapicf.pokeapiclient.api.ContestEffectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    ContestEffectApi apiInstance = new ContestEffectApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      String result = apiInstance.contestEffectRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContestEffectApi#contestEffectRead");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **Integer**|  | |

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
| **0** | Default response |  -  |

