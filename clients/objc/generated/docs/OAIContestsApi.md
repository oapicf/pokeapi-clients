# OAIContestsApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestEffectList**](OAIContestsApi.md#contesteffectlist) | **GET** /api/v2/contest-effect/ | List contest effects
[**contestEffectRetrieve**](OAIContestsApi.md#contesteffectretrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect
[**contestTypeList**](OAIContestsApi.md#contesttypelist) | **GET** /api/v2/contest-type/ | List contest types
[**contestTypeRetrieve**](OAIContestsApi.md#contesttyperetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type
[**superContestEffectList**](OAIContestsApi.md#supercontesteffectlist) | **GET** /api/v2/super-contest-effect/ | List super contest effects
[**superContestEffectRetrieve**](OAIContestsApi.md#supercontesteffectretrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect


# **contestEffectList**
```objc
-(NSURLSessionTask*) contestEffectListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
        completionHandler: (void (^)(OAIPaginatedContestEffectSummaryList* output, NSError* error)) handler;
```

List contest effects

Contest effects refer to the effects of moves when used in contests.

### Example
```objc

NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)

OAIContestsApi*apiInstance = [[OAIContestsApi alloc] init];

// List contest effects
[apiInstance contestEffectListWithLimit:limit
              offset:offset
          completionHandler: ^(OAIPaginatedContestEffectSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIContestsApi->contestEffectList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 

### Return type

[**OAIPaginatedContestEffectSummaryList***](OAIPaginatedContestEffectSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contestEffectRetrieve**
```objc
-(NSURLSessionTask*) contestEffectRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIContestEffectDetail* output, NSError* error)) handler;
```

Get contest effect

Contest effects refer to the effects of moves when used in contests.

### Example
```objc

NSString* _id = 1; // This parameter can be a string or an integer.

OAIContestsApi*apiInstance = [[OAIContestsApi alloc] init];

// Get contest effect
[apiInstance contestEffectRetrieveWithId:_id
          completionHandler: ^(OAIContestEffectDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIContestsApi->contestEffectRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIContestEffectDetail***](OAIContestEffectDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contestTypeList**
```objc
-(NSURLSessionTask*) contestTypeListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
    q: (NSString*) q
        completionHandler: (void (^)(OAIPaginatedContestTypeSummaryList* output, NSError* error)) handler;
```

List contest types

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example
```objc

NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)
NSString* q = @"q_example"; // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)

OAIContestsApi*apiInstance = [[OAIContestsApi alloc] init];

// List contest types
[apiInstance contestTypeListWithLimit:limit
              offset:offset
              q:q
          completionHandler: ^(OAIPaginatedContestTypeSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIContestsApi->contestTypeList: %@", error);
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

[**OAIPaginatedContestTypeSummaryList***](OAIPaginatedContestTypeSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contestTypeRetrieve**
```objc
-(NSURLSessionTask*) contestTypeRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAIContestTypeDetail* output, NSError* error)) handler;
```

Get contest type

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example
```objc

NSString* _id = 1; // This parameter can be a string or an integer.

OAIContestsApi*apiInstance = [[OAIContestsApi alloc] init];

// Get contest type
[apiInstance contestTypeRetrieveWithId:_id
          completionHandler: ^(OAIContestTypeDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIContestsApi->contestTypeRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAIContestTypeDetail***](OAIContestTypeDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **superContestEffectList**
```objc
-(NSURLSessionTask*) superContestEffectListWithLimit: (NSNumber*) limit
    offset: (NSNumber*) offset
        completionHandler: (void (^)(OAIPaginatedSuperContestEffectSummaryList* output, NSError* error)) handler;
```

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.

### Example
```objc

NSNumber* limit = @56; // Number of results to return per page. (optional)
NSNumber* offset = @56; // The initial index from which to return the results. (optional)

OAIContestsApi*apiInstance = [[OAIContestsApi alloc] init];

// List super contest effects
[apiInstance superContestEffectListWithLimit:limit
              offset:offset
          completionHandler: ^(OAIPaginatedSuperContestEffectSummaryList* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIContestsApi->superContestEffectList: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **NSNumber***| Number of results to return per page. | [optional] 
 **offset** | **NSNumber***| The initial index from which to return the results. | [optional] 

### Return type

[**OAIPaginatedSuperContestEffectSummaryList***](OAIPaginatedSuperContestEffectSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **superContestEffectRetrieve**
```objc
-(NSURLSessionTask*) superContestEffectRetrieveWithId: (NSString*) _id
        completionHandler: (void (^)(OAISuperContestEffectDetail* output, NSError* error)) handler;
```

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.

### Example
```objc

NSString* _id = 1; // This parameter can be a string or an integer.

OAIContestsApi*apiInstance = [[OAIContestsApi alloc] init];

// Get super contest effect
[apiInstance superContestEffectRetrieveWithId:_id
          completionHandler: ^(OAISuperContestEffectDetail* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIContestsApi->superContestEffectRetrieve: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_id** | **NSString***| This parameter can be a string or an integer. | 

### Return type

[**OAISuperContestEffectDetail***](OAISuperContestEffectDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

