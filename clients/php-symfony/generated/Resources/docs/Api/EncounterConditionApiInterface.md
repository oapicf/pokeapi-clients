# OpenAPI\Server\Api\EncounterConditionApiInterface

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionList**](EncounterConditionApiInterface.md#encounterConditionList) | **GET** /api/v2/encounter-condition/ | 
[**encounterConditionRead**](EncounterConditionApiInterface.md#encounterConditionRead) | **GET** /api/v2/encounter-condition/{id}/ | 


## Service Declaration
```yaml
# src/Acme/MyBundle/Resources/services.yml
services:
    # ...
    acme.my_bundle.api.encounterCondition:
        class: Acme\MyBundle\Api\EncounterConditionApi
        tags:
            - { name: "open_api_server.api", api: "encounterCondition" }
    # ...
```

## **encounterConditionList**
> string encounterConditionList($limit, $offset)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EncounterConditionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EncounterConditionApiInterface;

class EncounterConditionApi implements EncounterConditionApiInterface
{

    // ...

    /**
     * Implementation of EncounterConditionApiInterface#encounterConditionList
     */
    public function encounterConditionList($limit = null, $offset = null)
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

## **encounterConditionRead**
> string encounterConditionRead($id)



### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/EncounterConditionApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\EncounterConditionApiInterface;

class EncounterConditionApi implements EncounterConditionApiInterface
{

    // ...

    /**
     * Implementation of EncounterConditionApiInterface#encounterConditionRead
     */
    public function encounterConditionRead($id)
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

