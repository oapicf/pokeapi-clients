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

#include "OpenAPIMoveLearnMethodApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI
{

FString OpenAPIMoveLearnMethodApi::MoveLearnMethodListRequest::ComputePath() const
{
	FString Path(TEXT("/api/v2/move-learn-method/"));
	TArray<FString> QueryParams;
	if(Limit.IsSet())
	{
		QueryParams.Add(FString(TEXT("limit=")) + ToUrlString(Limit.GetValue()));
	}
	if(Offset.IsSet())
	{
		QueryParams.Add(FString(TEXT("offset=")) + ToUrlString(Offset.GetValue()));
	}
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void OpenAPIMoveLearnMethodApi::MoveLearnMethodListRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("text/plain") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Form parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);
		Writer->WriteObjectStart();
		Writer->WriteObjectEnd();
		Writer->Close();
		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIMoveLearnMethodApi::MoveLearnMethodListResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 0:
	default:
		SetResponseString(TEXT("Default response"));
		break;
	}
}

bool OpenAPIMoveLearnMethodApi::MoveLearnMethodListResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIMoveLearnMethodApi::MoveLearnMethodReadRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("id"), ToStringFormatArg(Id) } };

	FString Path = FString::Format(TEXT("/api/v2/move-learn-method/{id}/"), PathParams);

	return Path;
}

void OpenAPIMoveLearnMethodApi::MoveLearnMethodReadRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("text/plain") };

	HttpRequest->SetVerb(TEXT("GET"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Form parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);
		Writer->WriteObjectStart();
		Writer->WriteObjectEnd();
		Writer->Close();
		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIMoveLearnMethodApi::MoveLearnMethodReadResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 0:
	default:
		SetResponseString(TEXT("Default response"));
		break;
	}
}

bool OpenAPIMoveLearnMethodApi::MoveLearnMethodReadResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
