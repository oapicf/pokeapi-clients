# OAIGamesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generationList**](OAIGamesApi.md#generationlist) | **GET** /api/v2/generation/ | List genrations
[**generationRetrieve**](OAIGamesApi.md#generationretrieve) | **GET** /api/v2/generation/{id}/ | Get genration
[**pokedexList**](OAIGamesApi.md#pokedexlist) | **GET** /api/v2/pokedex/ | List pokedex
[**pokedexRetrieve**](OAIGamesApi.md#pokedexretrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
[**versionGroupList**](OAIGamesApi.md#versiongrouplist) | **GET** /api/v2/version-group/ | List version groups
[**versionGroupRetrieve**](OAIGamesApi.md#versiongroupretrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
[**versionList**](OAIGamesApi.md#versionlist) | **GET** /api/v2/version/ | List versions
[**versionRetrieve**](OAIGamesApi.md#versionretrieve) | **GET** /api/v2/version/{id}/ | Get version


# **generationList**
```objc
-(NSURLSessionTask*) generationListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedGenerationSummaryList* output, NSError* error)) handler;
```

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

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

OAIGamesApi*apiInstance = [[OAIGamesApi alloc] init];

// List genrations
[apiInstance generationListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedGenerationSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGamesApi->generationList: %@", error);
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

[**OAIPaginatedGenerationSummaryList***](OAIPaginatedGenerationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generationRetrieve**
```objc
-(NSURLSessionTask*) generationRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIGenerationDetail* output, NSError* error)) handler;
```

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

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

OAIGamesApi*apiInstance = [[OAIGamesApi alloc] init];

// Get genration
[apiInstance generationRetrieveWithId:_id
          completionHandler: ^(OAIGenerationDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGamesApi->generationRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIGenerationDetail***](OAIGenerationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokedexList**
```objc
-(NSURLSessionTask*) pokedexListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedPokedexSummaryList* output, NSError* error)) handler;
```

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

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

OAIGamesApi*apiInstance = [[OAIGamesApi alloc] init];

// List pokedex
[apiInstance pokedexListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedPokedexSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGamesApi->pokedexList: %@", error);
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

[**OAIPaginatedPokedexSummaryList***](OAIPaginatedPokedexSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokedexRetrieve**
```objc
-(NSURLSessionTask*) pokedexRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIPokedexDetail* output, NSError* error)) handler;
```

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

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

OAIGamesApi*apiInstance = [[OAIGamesApi alloc] init];

// Get pokedex
[apiInstance pokedexRetrieveWithId:_id
          completionHandler: ^(OAIPokedexDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGamesApi->pokedexRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIPokedexDetail***](OAIPokedexDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **versionGroupList**
```objc
-(NSURLSessionTask*) versionGroupListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedVersionGroupSummaryList* output, NSError* error)) handler;
```

List version groups

Version groups categorize highly similar versions of the games.

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

OAIGamesApi*apiInstance = [[OAIGamesApi alloc] init];

// List version groups
[apiInstance versionGroupListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedVersionGroupSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGamesApi->versionGroupList: %@", error);
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

[**OAIPaginatedVersionGroupSummaryList***](OAIPaginatedVersionGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **versionGroupRetrieve**
```objc
-(NSURLSessionTask*) versionGroupRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIVersionGroupDetail* output, NSError* error)) handler;
```

Get version group

Version groups categorize highly similar versions of the games.

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

OAIGamesApi*apiInstance = [[OAIGamesApi alloc] init];

// Get version group
[apiInstance versionGroupRetrieveWithId:_id
          completionHandler: ^(OAIVersionGroupDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGamesApi->versionGroupRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIVersionGroupDetail***](OAIVersionGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **versionList**
```objc
-(NSURLSessionTask*) versionListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedVersionSummaryList* output, NSError* error)) handler;
```

List versions

Versions of the games, e.g., Red, Blue or Yellow.

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

OAIGamesApi*apiInstance = [[OAIGamesApi alloc] init];

// List versions
[apiInstance versionListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedVersionSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGamesApi->versionList: %@", error);
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

[**OAIPaginatedVersionSummaryList***](OAIPaginatedVersionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **versionRetrieve**
```objc
-(NSURLSessionTask*) versionRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIVersionDetail* output, NSError* error)) handler;
```

Get version

Versions of the games, e.g., Red, Blue or Yellow.

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

OAIGamesApi*apiInstance = [[OAIGamesApi alloc] init];

// Get version
[apiInstance versionRetrieveWithId:_id
          completionHandler: ^(OAIVersionDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGamesApi->versionRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIVersionDetail***](OAIVersionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

