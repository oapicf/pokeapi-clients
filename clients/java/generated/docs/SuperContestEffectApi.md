# SuperContestEffectApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**superContestEffectList**](SuperContestEffectApi.md#superContestEffectList) | **GET** /api/v2/super-contest-effect/ |  |
| [**superContestEffectRead**](SuperContestEffectApi.md#superContestEffectRead) | **GET** /api/v2/super-contest-effect/{id}/ |  |


<a id="superContestEffectList"></a>
# **superContestEffectList**
> String superContestEffectList(limit, offset)



### Example
```java
// Import classes:
import com.cliffano.pokeapiclient.ApiClient;
import com.cliffano.pokeapiclient.ApiException;
import com.cliffano.pokeapiclient.Configuration;
import com.cliffano.pokeapiclient.models.*;
import com.cliffano.pokeapiclient.api.SuperContestEffectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    SuperContestEffectApi apiInstance = new SuperContestEffectApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    try {
      String result = apiInstance.superContestEffectList(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuperContestEffectApi#superContestEffectList");
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

<a id="superContestEffectRead"></a>
# **superContestEffectRead**
> String superContestEffectRead(id)



### Example
```java
// Import classes:
import com.cliffano.pokeapiclient.ApiClient;
import com.cliffano.pokeapiclient.ApiException;
import com.cliffano.pokeapiclient.Configuration;
import com.cliffano.pokeapiclient.models.*;
import com.cliffano.pokeapiclient.api.SuperContestEffectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://pokeapi.co");

    SuperContestEffectApi apiInstance = new SuperContestEffectApi(defaultClient);
    Integer id = 56; // Integer | 
    try {
      String result = apiInstance.superContestEffectRead(id);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SuperContestEffectApi#superContestEffectRead");
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

