#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "EncountersManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


EncountersManager::EncountersManager()
{

}

EncountersManager::~EncountersManager()
{

}

static gboolean __EncountersManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __EncountersManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__EncountersManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool encounterConditionListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedEncounterConditionSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedEncounterConditionSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedEncounterConditionSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedEncounterConditionSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedEncounterConditionSummaryList", "PaginatedEncounterConditionSummaryList");
			json_node_free(pJson);

			if ("PaginatedEncounterConditionSummaryList" == "std::string") {
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

static bool encounterConditionListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterConditionSummaryList, Error, void* )
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

	string url("/api/v2/encounter-condition/");
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
		NetClient::easycurl(EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = encounterConditionListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), encounterConditionListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __EncountersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool EncountersManager::encounterConditionListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterConditionSummaryList, Error, void* )
	, void* userData)
{
	return encounterConditionListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool EncountersManager::encounterConditionListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterConditionSummaryList, Error, void* )
	, void* userData)
{
	return encounterConditionListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool encounterConditionRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(EncounterConditionDetail, Error, void* )
	= reinterpret_cast<void(*)(EncounterConditionDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	EncounterConditionDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("EncounterConditionDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "EncounterConditionDetail", "EncounterConditionDetail");
			json_node_free(pJson);

			if ("EncounterConditionDetail" == "std::string") {
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

static bool encounterConditionRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(EncounterConditionDetail, Error, void* )
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

	string url("/api/v2/encounter-condition/{id}/");
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
		NetClient::easycurl(EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = encounterConditionRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), encounterConditionRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __EncountersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool EncountersManager::encounterConditionRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(EncounterConditionDetail, Error, void* )
	, void* userData)
{
	return encounterConditionRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool EncountersManager::encounterConditionRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(EncounterConditionDetail, Error, void* )
	, void* userData)
{
	return encounterConditionRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool encounterConditionValueListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedEncounterConditionValueSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedEncounterConditionValueSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedEncounterConditionValueSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedEncounterConditionValueSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedEncounterConditionValueSummaryList", "PaginatedEncounterConditionValueSummaryList");
			json_node_free(pJson);

			if ("PaginatedEncounterConditionValueSummaryList" == "std::string") {
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

static bool encounterConditionValueListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterConditionValueSummaryList, Error, void* )
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

	string url("/api/v2/encounter-condition-value/");
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
		NetClient::easycurl(EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = encounterConditionValueListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), encounterConditionValueListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __EncountersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool EncountersManager::encounterConditionValueListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterConditionValueSummaryList, Error, void* )
	, void* userData)
{
	return encounterConditionValueListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool EncountersManager::encounterConditionValueListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterConditionValueSummaryList, Error, void* )
	, void* userData)
{
	return encounterConditionValueListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool encounterConditionValueRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(EncounterConditionValueDetail, Error, void* )
	= reinterpret_cast<void(*)(EncounterConditionValueDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	EncounterConditionValueDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("EncounterConditionValueDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "EncounterConditionValueDetail", "EncounterConditionValueDetail");
			json_node_free(pJson);

			if ("EncounterConditionValueDetail" == "std::string") {
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

static bool encounterConditionValueRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(EncounterConditionValueDetail, Error, void* )
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

	string url("/api/v2/encounter-condition-value/{id}/");
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
		NetClient::easycurl(EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = encounterConditionValueRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), encounterConditionValueRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __EncountersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool EncountersManager::encounterConditionValueRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(EncounterConditionValueDetail, Error, void* )
	, void* userData)
{
	return encounterConditionValueRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool EncountersManager::encounterConditionValueRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(EncounterConditionValueDetail, Error, void* )
	, void* userData)
{
	return encounterConditionValueRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool encounterMethodListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedEncounterMethodSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedEncounterMethodSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedEncounterMethodSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedEncounterMethodSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedEncounterMethodSummaryList", "PaginatedEncounterMethodSummaryList");
			json_node_free(pJson);

			if ("PaginatedEncounterMethodSummaryList" == "std::string") {
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

static bool encounterMethodListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterMethodSummaryList, Error, void* )
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

	string url("/api/v2/encounter-method/");
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
		NetClient::easycurl(EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = encounterMethodListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), encounterMethodListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __EncountersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool EncountersManager::encounterMethodListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterMethodSummaryList, Error, void* )
	, void* userData)
{
	return encounterMethodListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool EncountersManager::encounterMethodListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEncounterMethodSummaryList, Error, void* )
	, void* userData)
{
	return encounterMethodListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool encounterMethodRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(EncounterMethodDetail, Error, void* )
	= reinterpret_cast<void(*)(EncounterMethodDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	EncounterMethodDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("EncounterMethodDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "EncounterMethodDetail", "EncounterMethodDetail");
			json_node_free(pJson);

			if ("EncounterMethodDetail" == "std::string") {
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

static bool encounterMethodRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(EncounterMethodDetail, Error, void* )
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

	string url("/api/v2/encounter-method/{id}/");
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
		NetClient::easycurl(EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = encounterMethodRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), encounterMethodRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __EncountersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool EncountersManager::encounterMethodRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(EncounterMethodDetail, Error, void* )
	, void* userData)
{
	return encounterMethodRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool EncountersManager::encounterMethodRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(EncounterMethodDetail, Error, void* )
	, void* userData)
{
	return encounterMethodRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool pokemonEncountersRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::list<Pokemon_encounters_retrieve_200_response_inner>, Error, void* )
	= reinterpret_cast<void(*)(std::list<Pokemon_encounters_retrieve_200_response_inner>, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	std::list<Pokemon_encounters_retrieve_200_response_inner> out;
	

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));



		pJson = json_from_string(data, NULL);
		JsonArray * jsonarray = json_node_get_array (pJson);
		guint length = json_array_get_length (jsonarray);
		for(guint i = 0; i < length; i++){
			JsonNode* myJson = json_array_get_element (jsonarray, i);
			char * singlenodestr = json_to_string(myJson, false);
			Pokemon_encounters_retrieve_200_response_inner singlemodel;
			singlemodel.fromJson(singlenodestr);
			out.push_front(singlemodel);
			g_free(static_cast<gpointer>(singlenodestr));
			json_node_free(myJson);
		}
		json_array_unref (jsonarray);
		json_node_free(pJson);


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

static bool pokemonEncountersRetrieveHelper(char * accessToken,
	std::string pokemonId, 
	void(* handler)(std::list<Pokemon_encounters_retrieve_200_response_inner>, Error, void* )
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

	string url("/api/v2/pokemon/{pokemon_id}/encounters");
	int pos;

	string s_pokemonId("{");
	s_pokemonId.append("pokemon_id");
	s_pokemonId.append("}");
	pos = url.find(s_pokemonId);
	url.erase(pos, s_pokemonId.length());
	url.insert(pos, stringify(&pokemonId, "std::string"));

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
		NetClient::easycurl(EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonEncountersRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (EncountersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonEncountersRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __EncountersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool EncountersManager::pokemonEncountersRetrieveAsync(char * accessToken,
	std::string pokemonId, 
	void(* handler)(std::list<Pokemon_encounters_retrieve_200_response_inner>, Error, void* )
	, void* userData)
{
	return pokemonEncountersRetrieveHelper(accessToken,
	pokemonId, 
	handler, userData, true);
}

bool EncountersManager::pokemonEncountersRetrieveSync(char * accessToken,
	std::string pokemonId, 
	void(* handler)(std::list<Pokemon_encounters_retrieve_200_response_inner>, Error, void* )
	, void* userData)
{
	return pokemonEncountersRetrieveHelper(accessToken,
	pokemonId, 
	handler, userData, false);
}

