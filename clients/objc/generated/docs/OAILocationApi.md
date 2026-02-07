# OAILocationApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationAreaList**](OAILocationApi.md#locationarealist) | **GET** /api/v2/location-area/ | List location areas
[**locationAreaRetrieve**](OAILocationApi.md#locationarearetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
[**locationList**](OAILocationApi.md#locationlist) | **GET** /api/v2/location/ | List locations
[**locationRetrieve**](OAILocationApi.md#locationretrieve) | **GET** /api/v2/location/{id}/ | Get location
[**palParkAreaList**](OAILocationApi.md#palparkarealist) | **GET** /api/v2/pal-park-area/ | List pal park areas
[**palParkAreaRetrieve**](OAILocationApi.md#palparkarearetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
[**regionList**](OAILocationApi.md#regionlist) | **GET** /api/v2/region/ | List regions
[**regionRetrieve**](OAILocationApi.md#regionretrieve) | **GET** /api/v2/region/{id}/ | Get region


# **locationAreaList**
```objc
-(NSURLSessionTask*) locationAreaListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
        completionHandler: (void (^)(OAIPaginatedLocationAreaSummaryList* output, NSError* error)) handler;
```

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)

OAILocationApi*apiInstance = [[OAILocationApi alloc] init];

// List location areas
[apiInstance locationAreaListWithLimit:limit
              offset:offset
          completionHandler: ^(OAIPaginatedLocationAreaSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILocationApi->locationAreaList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 

### Return type

[**OAIPaginatedLocationAreaSummaryList***](OAIPaginatedLocationAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **locationAreaRetrieve**
```objc
-(NSURLSessionTask*) locationAreaRetrieveWithId: (NSNumber*) _id
        completionHandler: (void (^)(OAILocationAreaDetail* output, NSError* error)) handler;
```

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSNumber* _id = @56; // A unique integer value identifying this location area.

OAILocationApi*apiInstance = [[OAILocationApi alloc] init];

// Get location area
[apiInstance locationAreaRetrieveWithId:_id
          completionHandler: ^(OAILocationAreaDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILocationApi->locationAreaRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSNumber***| A unique integer value identifying this location area. | 

### Return type

[**OAILocationAreaDetail***](OAILocationAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **locationList**
```objc
-(NSURLSessionTask*) locationListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedLocationSummaryList* output, NSError* error)) handler;
```

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)
NSString* q = @"q_example"; // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

OAILocationApi*apiInstance = [[OAILocationApi alloc] init];

// List locations
[apiInstance locationListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedLocationSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILocationApi->locationList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 
 **q** | **NSString***| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**OAIPaginatedLocationSummaryList***](OAIPaginatedLocationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **locationRetrieve**
```objc
-(NSURLSessionTask*) locationRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAILocationDetail* output, NSError* error)) handler;
```

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSString* _id = @"_id_example"; // This parameter can be a string or an integer.

OAILocationApi*apiInstance = [[OAILocationApi alloc] init];

// Get location
[apiInstance locationRetrieveWithId:_id
          completionHandler: ^(OAILocationDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILocationApi->locationRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAILocationDetail***](OAILocationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **palParkAreaList**
```objc
-(NSURLSessionTask*) palParkAreaListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedPalParkAreaSummaryList* output, NSError* error)) handler;
```

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)
NSString* q = @"q_example"; // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

OAILocationApi*apiInstance = [[OAILocationApi alloc] init];

// List pal park areas
[apiInstance palParkAreaListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedPalParkAreaSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILocationApi->palParkAreaList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 
 **q** | **NSString***| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**OAIPaginatedPalParkAreaSummaryList***](OAIPaginatedPalParkAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **palParkAreaRetrieve**
```objc
-(NSURLSessionTask*) palParkAreaRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIPalParkAreaDetail* output, NSError* error)) handler;
```

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSString* _id = @"_id_example"; // This parameter can be a string or an integer.

OAILocationApi*apiInstance = [[OAILocationApi alloc] init];

// Get pal park area
[apiInstance palParkAreaRetrieveWithId:_id
          completionHandler: ^(OAIPalParkAreaDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILocationApi->palParkAreaRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIPalParkAreaDetail***](OAIPalParkAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **regionList**
```objc
-(NSURLSessionTask*) regionListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedRegionSummaryList* output, NSError* error)) handler;
```

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)
NSString* q = @"q_example"; // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

OAILocationApi*apiInstance = [[OAILocationApi alloc] init];

// List regions
[apiInstance regionListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedRegionSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILocationApi->regionList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 
 **q** | **NSString***| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**OAIPaginatedRegionSummaryList***](OAIPaginatedRegionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **regionRetrieve**
```objc
-(NSURLSessionTask*) regionRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIRegionDetail* output, NSError* error)) handler;
```

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];
// Configure HTTP basic authorization (authentication scheme: basicAuth)
[apiConfig setUsername:@"YOUR_USERNAME"];
[apiConfig setPassword:@"YOUR_PASSWORD"];

// Configure API key authorization: (authentication scheme: cookieAuth)
[apiConfig setApiKey:@"YOUR_API_KEY" forApiKeyIdentifier:@"sessionid"];
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
//[apiConfig setApiKeyPrefix:@"Bearer" forApiKeyIdentifier:@"sessionid"];


NSString* _id = @"_id_example"; // This parameter can be a string or an integer.

OAILocationApi*apiInstance = [[OAILocationApi alloc] init];

// Get region
[apiInstance regionRetrieveWithId:_id
          completionHandler: ^(OAIRegionDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAILocationApi->regionRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIRegionDetail***](OAIRegionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

