/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 20220523
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#pragma once

#include "CoreMinimal.h"
#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

class OPENAPI_API OpenAPIPokemonShapeApi
{
public:
	OpenAPIPokemonShapeApi();
	~OpenAPIPokemonShapeApi();

	/* Sets the URL Endpoint.
	* Note: several fallback endpoints can be configured in request retry policies, see Request::SetShouldRetry */
	void SetURL(const FString& Url);

	/* Adds global header params to all requests */
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();

	/* Sets the retry manager to the user-defined retry manager. User must manage the lifetime of the retry manager.
	* If no retry manager is specified and a request needs retries, a default retry manager will be used.
	* See also: Request::SetShouldRetry */
	void SetHttpRetryManager(FHttpRetrySystem::FManager& RetryManager);
	FHttpRetrySystem::FManager& GetHttpRetryManager();

	class PokemonShapeListRequest;
	class PokemonShapeListResponse;
	class PokemonShapeReadRequest;
	class PokemonShapeReadResponse;
	
    DECLARE_DELEGATE_OneParam(FPokemonShapeListDelegate, const PokemonShapeListResponse&);
    DECLARE_DELEGATE_OneParam(FPokemonShapeReadDelegate, const PokemonShapeReadResponse&);
    
    FHttpRequestPtr PokemonShapeList(const PokemonShapeListRequest& Request, const FPokemonShapeListDelegate& Delegate = FPokemonShapeListDelegate()) const;
    FHttpRequestPtr PokemonShapeRead(const PokemonShapeReadRequest& Request, const FPokemonShapeReadDelegate& Delegate = FPokemonShapeReadDelegate()) const;
    
private:
    void OnPokemonShapeListResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FPokemonShapeListDelegate Delegate) const;
    void OnPokemonShapeReadResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FPokemonShapeReadDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}
