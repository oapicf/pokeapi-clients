#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "LocationManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


LocationManager::LocationManager()
{

}

LocationManager::~LocationManager()
{

}

static gboolean __LocationManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __LocationManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__LocationManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool locationAreaListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedLocationAreaSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedLocationAreaSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedLocationAreaSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedLocationAreaSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedLocationAreaSummaryList", "PaginatedLocationAreaSummaryList");
			json_node_free(pJson);

			if ("PaginatedLocationAreaSummaryList" == "std::string") {
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

static bool locationAreaListHelper(char * accessToken,
	int limit, int offset, 
	void(* handler)(PaginatedLocationAreaSummaryList, Error, void* )
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

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/api/v2/location-area/");
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
		NetClient::easycurl(LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = locationAreaListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), locationAreaListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LocationManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LocationManager::locationAreaListAsync(char * accessToken,
	int limit, int offset, 
	void(* handler)(PaginatedLocationAreaSummaryList, Error, void* )
	, void* userData)
{
	return locationAreaListHelper(accessToken,
	limit, offset, 
	handler, userData, true);
}

bool LocationManager::locationAreaListSync(char * accessToken,
	int limit, int offset, 
	void(* handler)(PaginatedLocationAreaSummaryList, Error, void* )
	, void* userData)
{
	return locationAreaListHelper(accessToken,
	limit, offset, 
	handler, userData, false);
}

static bool locationAreaRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(LocationAreaDetail, Error, void* )
	= reinterpret_cast<void(*)(LocationAreaDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	LocationAreaDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("LocationAreaDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "LocationAreaDetail", "LocationAreaDetail");
			json_node_free(pJson);

			if ("LocationAreaDetail" == "std::string") {
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

static bool locationAreaRetrieveHelper(char * accessToken,
	int id, 
	void(* handler)(LocationAreaDetail, Error, void* )
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

	string url("/api/v2/location-area/{id}/");
	int pos;

	string s_id("{");
	s_id.append("id");
	s_id.append("}");
	pos = url.find(s_id);
	url.erase(pos, s_id.length());
	url.insert(pos, stringify(&id, "int"));

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
		NetClient::easycurl(LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = locationAreaRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), locationAreaRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LocationManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LocationManager::locationAreaRetrieveAsync(char * accessToken,
	int id, 
	void(* handler)(LocationAreaDetail, Error, void* )
	, void* userData)
{
	return locationAreaRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool LocationManager::locationAreaRetrieveSync(char * accessToken,
	int id, 
	void(* handler)(LocationAreaDetail, Error, void* )
	, void* userData)
{
	return locationAreaRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool locationListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedLocationSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedLocationSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedLocationSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedLocationSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedLocationSummaryList", "PaginatedLocationSummaryList");
			json_node_free(pJson);

			if ("PaginatedLocationSummaryList" == "std::string") {
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

static bool locationListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedLocationSummaryList, Error, void* )
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

	string url("/api/v2/location/");
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
		NetClient::easycurl(LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = locationListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), locationListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LocationManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LocationManager::locationListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedLocationSummaryList, Error, void* )
	, void* userData)
{
	return locationListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool LocationManager::locationListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedLocationSummaryList, Error, void* )
	, void* userData)
{
	return locationListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool locationRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(LocationDetail, Error, void* )
	= reinterpret_cast<void(*)(LocationDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	LocationDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("LocationDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "LocationDetail", "LocationDetail");
			json_node_free(pJson);

			if ("LocationDetail" == "std::string") {
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

static bool locationRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(LocationDetail, Error, void* )
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

	string url("/api/v2/location/{id}/");
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
		NetClient::easycurl(LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = locationRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), locationRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LocationManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LocationManager::locationRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(LocationDetail, Error, void* )
	, void* userData)
{
	return locationRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool LocationManager::locationRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(LocationDetail, Error, void* )
	, void* userData)
{
	return locationRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool palParkAreaListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedPalParkAreaSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedPalParkAreaSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedPalParkAreaSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedPalParkAreaSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedPalParkAreaSummaryList", "PaginatedPalParkAreaSummaryList");
			json_node_free(pJson);

			if ("PaginatedPalParkAreaSummaryList" == "std::string") {
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

static bool palParkAreaListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPalParkAreaSummaryList, Error, void* )
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

	string url("/api/v2/pal-park-area/");
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
		NetClient::easycurl(LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = palParkAreaListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), palParkAreaListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LocationManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LocationManager::palParkAreaListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPalParkAreaSummaryList, Error, void* )
	, void* userData)
{
	return palParkAreaListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool LocationManager::palParkAreaListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPalParkAreaSummaryList, Error, void* )
	, void* userData)
{
	return palParkAreaListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool palParkAreaRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PalParkAreaDetail, Error, void* )
	= reinterpret_cast<void(*)(PalParkAreaDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PalParkAreaDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PalParkAreaDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PalParkAreaDetail", "PalParkAreaDetail");
			json_node_free(pJson);

			if ("PalParkAreaDetail" == "std::string") {
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

static bool palParkAreaRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(PalParkAreaDetail, Error, void* )
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

	string url("/api/v2/pal-park-area/{id}/");
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
		NetClient::easycurl(LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = palParkAreaRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), palParkAreaRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LocationManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LocationManager::palParkAreaRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PalParkAreaDetail, Error, void* )
	, void* userData)
{
	return palParkAreaRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool LocationManager::palParkAreaRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PalParkAreaDetail, Error, void* )
	, void* userData)
{
	return palParkAreaRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool regionListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedRegionSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedRegionSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedRegionSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedRegionSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedRegionSummaryList", "PaginatedRegionSummaryList");
			json_node_free(pJson);

			if ("PaginatedRegionSummaryList" == "std::string") {
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

static bool regionListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedRegionSummaryList, Error, void* )
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

	string url("/api/v2/region/");
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
		NetClient::easycurl(LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = regionListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), regionListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LocationManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LocationManager::regionListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedRegionSummaryList, Error, void* )
	, void* userData)
{
	return regionListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool LocationManager::regionListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedRegionSummaryList, Error, void* )
	, void* userData)
{
	return regionListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool regionRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(RegionDetail, Error, void* )
	= reinterpret_cast<void(*)(RegionDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	RegionDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("RegionDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "RegionDetail", "RegionDetail");
			json_node_free(pJson);

			if ("RegionDetail" == "std::string") {
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

static bool regionRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(RegionDetail, Error, void* )
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

	string url("/api/v2/region/{id}/");
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
		NetClient::easycurl(LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = regionRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (LocationManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), regionRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __LocationManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool LocationManager::regionRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(RegionDetail, Error, void* )
	, void* userData)
{
	return regionRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool LocationManager::regionRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(RegionDetail, Error, void* )
	, void* userData)
{
	return regionRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

