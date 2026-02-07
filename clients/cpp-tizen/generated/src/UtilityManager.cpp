#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "UtilityManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


UtilityManager::UtilityManager()
{

}

UtilityManager::~UtilityManager()
{

}

static gboolean __UtilityManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __UtilityManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__UtilityManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool languageListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedLanguageSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedLanguageSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedLanguageSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedLanguageSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedLanguageSummaryList", "PaginatedLanguageSummaryList");
			json_node_free(pJson);

			if ("PaginatedLanguageSummaryList" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool languageListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedLanguageSummaryList, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&offset, "int");
	queryParams.insert(pair<string, string>("offset", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("offset");
	}


	itemAtq = stringify(&q, "std::string");
	queryParams.insert(pair<string, string>("q", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("q");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/v2/language/");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(UtilityManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = languageListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (UtilityManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), languageListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UtilityManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UtilityManager::languageListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedLanguageSummaryList, Error, void* )
	, void* userData)
{
	return languageListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool UtilityManager::languageListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedLanguageSummaryList, Error, void* )
	, void* userData)
{
	return languageListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool languageRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(LanguageDetail, Error, void* )
	= reinterpret_cast<void(*)(LanguageDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	LanguageDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("LanguageDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "LanguageDetail", "LanguageDetail");
			json_node_free(pJson);

			if ("LanguageDetail" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool languageRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(LanguageDetail, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/v2/language/{id}/");
	int pos;

	string s_id("{");
	s_id.append("id");
	s_id.append("}");
	pos = url.find(s_id);
	url.erase(pos, s_id.length());
	url.insert(pos, stringify(&id, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(UtilityManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = languageRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (UtilityManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), languageRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UtilityManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UtilityManager::languageRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(LanguageDetail, Error, void* )
	, void* userData)
{
	return languageRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool UtilityManager::languageRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(LanguageDetail, Error, void* )
	, void* userData)
{
	return languageRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

