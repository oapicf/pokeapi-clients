# OAIUtilityApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**languageList**](OAIUtilityApi.md#languagelist) | **GET** /api/v2/language/ | List languages
[**languageRetrieve**](OAIUtilityApi.md#languageretrieve) | **GET** /api/v2/language/{id}/ | Get language
[**metaRetrieve**](OAIUtilityApi.md#metaretrieve) | **GET** /api/v2/meta/ | Get API metadata


# **languageList**
```objc
-(NSURLSessionTask*) languageListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedLanguageSummaryList* output, NSError* error)) handler;
```

List languages

Languages for translations of API resource information.

### Example
```objc

NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)
NSString* q = @"q_example"; // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

OAIUtilityApi*apiInstance = [[OAIUtilityApi alloc] init];

// List languages
[apiInstance languageListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedLanguageSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUtilityApi->languageList: %@", error);
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

[**OAIPaginatedLanguageSummaryList***](OAIPaginatedLanguageSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **languageRetrieve**
```objc
-(NSURLSessionTask*) languageRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAILanguageDetail* output, NSError* error)) handler;
```

Get language

Languages for translations of API resource information.

### Example
```objc

NSString* _id = 1; // This parameter can be a string or an integer.

OAIUtilityApi*apiInstance = [[OAIUtilityApi alloc] init];

// Get language
[apiInstance languageRetrieveWithId:_id
          completionHandler: ^(OAILanguageDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUtilityApi->languageRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAILanguageDetail***](OAILanguageDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **metaRetrieve**
```objc
-(NSURLSessionTask*) metaRetrieveWithCompletionHandler: 
        (void (^)(OAIPokeapiMetaResponse* output, NSError* error)) handler;
```

Get API metadata

Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).

### Example
```objc


OAIUtilityApi*apiInstance = [[OAIUtilityApi alloc] init];

// Get API metadata
[apiInstance metaRetrieveWithCompletionHandler: 
          ^(OAIPokeapiMetaResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUtilityApi->metaRetrieve: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIPokeapiMetaResponse***](OAIPokeapiMetaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

