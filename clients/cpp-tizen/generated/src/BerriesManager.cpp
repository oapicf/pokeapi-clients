#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "BerriesManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


BerriesManager::BerriesManager()
{

}

BerriesManager::~BerriesManager()
{

}

static gboolean __BerriesManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __BerriesManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__BerriesManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool berryFirmnessListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedBerryFirmnessSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedBerryFirmnessSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedBerryFirmnessSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedBerryFirmnessSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedBerryFirmnessSummaryList", "PaginatedBerryFirmnessSummaryList");
			json_node_free(pJson);

			if ("PaginatedBerryFirmnessSummaryList" == "std::string") {
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

static bool berryFirmnessListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerryFirmnessSummaryList, Error, void* )
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

	string url("/api/v2/berry-firmness/");
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
		NetClient::easycurl(BerriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = berryFirmnessListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BerriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), berryFirmnessListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BerriesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BerriesManager::berryFirmnessListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerryFirmnessSummaryList, Error, void* )
	, void* userData)
{
	return berryFirmnessListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool BerriesManager::berryFirmnessListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerryFirmnessSummaryList, Error, void* )
	, void* userData)
{
	return berryFirmnessListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool berryFirmnessRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BerryFirmnessDetail, Error, void* )
	= reinterpret_cast<void(*)(BerryFirmnessDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BerryFirmnessDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BerryFirmnessDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BerryFirmnessDetail", "BerryFirmnessDetail");
			json_node_free(pJson);

			if ("BerryFirmnessDetail" == "std::string") {
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

static bool berryFirmnessRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(BerryFirmnessDetail, Error, void* )
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

	string url("/api/v2/berry-firmness/{id}/");
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
		NetClient::easycurl(BerriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = berryFirmnessRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BerriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), berryFirmnessRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BerriesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BerriesManager::berryFirmnessRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(BerryFirmnessDetail, Error, void* )
	, void* userData)
{
	return berryFirmnessRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool BerriesManager::berryFirmnessRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(BerryFirmnessDetail, Error, void* )
	, void* userData)
{
	return berryFirmnessRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool berryFlavorListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedBerryFlavorSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedBerryFlavorSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedBerryFlavorSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedBerryFlavorSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedBerryFlavorSummaryList", "PaginatedBerryFlavorSummaryList");
			json_node_free(pJson);

			if ("PaginatedBerryFlavorSummaryList" == "std::string") {
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

static bool berryFlavorListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerryFlavorSummaryList, Error, void* )
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

	string url("/api/v2/berry-flavor/");
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
		NetClient::easycurl(BerriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = berryFlavorListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BerriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), berryFlavorListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BerriesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BerriesManager::berryFlavorListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerryFlavorSummaryList, Error, void* )
	, void* userData)
{
	return berryFlavorListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool BerriesManager::berryFlavorListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerryFlavorSummaryList, Error, void* )
	, void* userData)
{
	return berryFlavorListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool berryFlavorRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BerryFlavorDetail, Error, void* )
	= reinterpret_cast<void(*)(BerryFlavorDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BerryFlavorDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BerryFlavorDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BerryFlavorDetail", "BerryFlavorDetail");
			json_node_free(pJson);

			if ("BerryFlavorDetail" == "std::string") {
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

static bool berryFlavorRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(BerryFlavorDetail, Error, void* )
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

	string url("/api/v2/berry-flavor/{id}/");
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
		NetClient::easycurl(BerriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = berryFlavorRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BerriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), berryFlavorRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BerriesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BerriesManager::berryFlavorRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(BerryFlavorDetail, Error, void* )
	, void* userData)
{
	return berryFlavorRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool BerriesManager::berryFlavorRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(BerryFlavorDetail, Error, void* )
	, void* userData)
{
	return berryFlavorRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool berryListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedBerrySummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedBerrySummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedBerrySummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedBerrySummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedBerrySummaryList", "PaginatedBerrySummaryList");
			json_node_free(pJson);

			if ("PaginatedBerrySummaryList" == "std::string") {
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

static bool berryListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerrySummaryList, Error, void* )
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

	string url("/api/v2/berry/");
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
		NetClient::easycurl(BerriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = berryListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BerriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), berryListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BerriesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BerriesManager::berryListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerrySummaryList, Error, void* )
	, void* userData)
{
	return berryListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool BerriesManager::berryListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedBerrySummaryList, Error, void* )
	, void* userData)
{
	return berryListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool berryRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(BerryDetail, Error, void* )
	= reinterpret_cast<void(*)(BerryDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	BerryDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("BerryDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "BerryDetail", "BerryDetail");
			json_node_free(pJson);

			if ("BerryDetail" == "std::string") {
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

static bool berryRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(BerryDetail, Error, void* )
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

	string url("/api/v2/berry/{id}/");
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
		NetClient::easycurl(BerriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = berryRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BerriesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), berryRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BerriesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BerriesManager::berryRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(BerryDetail, Error, void* )
	, void* userData)
{
	return berryRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool BerriesManager::berryRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(BerryDetail, Error, void* )
	, void* userData)
{
	return berryRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

