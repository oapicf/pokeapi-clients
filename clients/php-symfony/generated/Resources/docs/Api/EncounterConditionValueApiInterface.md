# OpenAPI\Server\Api\EncounterConditionValueApiInterface

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionValueList**](EncounterConditionValueApiInterface.md#encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | 
[**encounterConditionValueRead**](EncounterConditionValueApiInterface.md#encounterConditionValueRead) | **GET** /api/v2/encounter-condition-value/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.encounterConditionValue:
        class: Acme\MyBundle\Api\EncounterConditionValueApi
        tags:
            - { name: "open_api_server.api", api: "encounterConditionValue" }
    # ...
```

## **encounterConditionValueList**
> string encounterConditionValueList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EncounterConditionValueApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EncounterConditionValueApiInterface;

class EncounterConditionValueApi implements EncounterConditionValueApiInterface
{

    // ...

    /**
     * Implementation of EncounterConditionValueApiInterface#encounterConditionValueList
     */
    public function encounterConditionValueList($limit = null, $offset = null)
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **int**|  | [optional]
 **offset** | **int**|  | [optional]

### Return type

**string**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **encounterConditionValueRead**
> string encounterConditionValueRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EncounterConditionValueApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EncounterConditionValueApiInterface;

class EncounterConditionValueApi implements EncounterConditionValueApiInterface
{

    // ...

    /**
     * Implementation of EncounterConditionValueApiInterface#encounterConditionValueRead
     */
    public function encounterConditionValueRead($id)
    {
        // Implement the operation ...
    }

    // ...
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

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

