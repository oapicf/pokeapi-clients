#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "PokemonManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


PokemonManager::PokemonManager()
{

}

PokemonManager::~PokemonManager()
{

}

static gboolean __PokemonManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __PokemonManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__PokemonManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool abilityListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedAbilitySummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedAbilitySummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedAbilitySummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedAbilitySummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedAbilitySummaryList", "PaginatedAbilitySummaryList");
			json_node_free(pJson);

			if ("PaginatedAbilitySummaryList" == "std::string") {
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

static bool abilityListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedAbilitySummaryList, Error, void* )
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

	string url("/api/v2/ability/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = abilityListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), abilityListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::abilityListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedAbilitySummaryList, Error, void* )
	, void* userData)
{
	return abilityListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::abilityListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedAbilitySummaryList, Error, void* )
	, void* userData)
{
	return abilityListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool abilityRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AbilityDetail, Error, void* )
	= reinterpret_cast<void(*)(AbilityDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AbilityDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AbilityDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AbilityDetail", "AbilityDetail");
			json_node_free(pJson);

			if ("AbilityDetail" == "std::string") {
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

static bool abilityRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(AbilityDetail, Error, void* )
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

	string url("/api/v2/ability/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = abilityRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), abilityRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::abilityRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(AbilityDetail, Error, void* )
	, void* userData)
{
	return abilityRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::abilityRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(AbilityDetail, Error, void* )
	, void* userData)
{
	return abilityRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool characteristicListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedCharacteristicSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedCharacteristicSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedCharacteristicSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedCharacteristicSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedCharacteristicSummaryList", "PaginatedCharacteristicSummaryList");
			json_node_free(pJson);

			if ("PaginatedCharacteristicSummaryList" == "std::string") {
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

static bool characteristicListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedCharacteristicSummaryList, Error, void* )
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

	string url("/api/v2/characteristic/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = characteristicListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), characteristicListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::characteristicListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedCharacteristicSummaryList, Error, void* )
	, void* userData)
{
	return characteristicListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::characteristicListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedCharacteristicSummaryList, Error, void* )
	, void* userData)
{
	return characteristicListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool characteristicRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CharacteristicDetail, Error, void* )
	= reinterpret_cast<void(*)(CharacteristicDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CharacteristicDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CharacteristicDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CharacteristicDetail", "CharacteristicDetail");
			json_node_free(pJson);

			if ("CharacteristicDetail" == "std::string") {
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

static bool characteristicRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(CharacteristicDetail, Error, void* )
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

	string url("/api/v2/characteristic/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = characteristicRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), characteristicRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::characteristicRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(CharacteristicDetail, Error, void* )
	, void* userData)
{
	return characteristicRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::characteristicRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(CharacteristicDetail, Error, void* )
	, void* userData)
{
	return characteristicRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool eggGroupListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedEggGroupSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedEggGroupSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedEggGroupSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedEggGroupSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedEggGroupSummaryList", "PaginatedEggGroupSummaryList");
			json_node_free(pJson);

			if ("PaginatedEggGroupSummaryList" == "std::string") {
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

static bool eggGroupListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEggGroupSummaryList, Error, void* )
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

	string url("/api/v2/egg-group/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = eggGroupListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), eggGroupListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::eggGroupListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEggGroupSummaryList, Error, void* )
	, void* userData)
{
	return eggGroupListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::eggGroupListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedEggGroupSummaryList, Error, void* )
	, void* userData)
{
	return eggGroupListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool eggGroupRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(EggGroupDetail, Error, void* )
	= reinterpret_cast<void(*)(EggGroupDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	EggGroupDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("EggGroupDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "EggGroupDetail", "EggGroupDetail");
			json_node_free(pJson);

			if ("EggGroupDetail" == "std::string") {
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

static bool eggGroupRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(EggGroupDetail, Error, void* )
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

	string url("/api/v2/egg-group/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = eggGroupRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), eggGroupRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::eggGroupRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(EggGroupDetail, Error, void* )
	, void* userData)
{
	return eggGroupRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::eggGroupRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(EggGroupDetail, Error, void* )
	, void* userData)
{
	return eggGroupRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool genderListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedGenderSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedGenderSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedGenderSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedGenderSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedGenderSummaryList", "PaginatedGenderSummaryList");
			json_node_free(pJson);

			if ("PaginatedGenderSummaryList" == "std::string") {
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

static bool genderListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedGenderSummaryList, Error, void* )
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

	string url("/api/v2/gender/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = genderListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), genderListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::genderListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedGenderSummaryList, Error, void* )
	, void* userData)
{
	return genderListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::genderListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedGenderSummaryList, Error, void* )
	, void* userData)
{
	return genderListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool genderRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GenderDetail, Error, void* )
	= reinterpret_cast<void(*)(GenderDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GenderDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GenderDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GenderDetail", "GenderDetail");
			json_node_free(pJson);

			if ("GenderDetail" == "std::string") {
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

static bool genderRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(GenderDetail, Error, void* )
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

	string url("/api/v2/gender/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = genderRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), genderRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::genderRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(GenderDetail, Error, void* )
	, void* userData)
{
	return genderRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::genderRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(GenderDetail, Error, void* )
	, void* userData)
{
	return genderRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool growthRateListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedGrowthRateSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedGrowthRateSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedGrowthRateSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedGrowthRateSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedGrowthRateSummaryList", "PaginatedGrowthRateSummaryList");
			json_node_free(pJson);

			if ("PaginatedGrowthRateSummaryList" == "std::string") {
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

static bool growthRateListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedGrowthRateSummaryList, Error, void* )
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

	string url("/api/v2/growth-rate/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = growthRateListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), growthRateListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::growthRateListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedGrowthRateSummaryList, Error, void* )
	, void* userData)
{
	return growthRateListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::growthRateListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedGrowthRateSummaryList, Error, void* )
	, void* userData)
{
	return growthRateListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool growthRateRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(GrowthRateDetail, Error, void* )
	= reinterpret_cast<void(*)(GrowthRateDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	GrowthRateDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("GrowthRateDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "GrowthRateDetail", "GrowthRateDetail");
			json_node_free(pJson);

			if ("GrowthRateDetail" == "std::string") {
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

static bool growthRateRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(GrowthRateDetail, Error, void* )
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

	string url("/api/v2/growth-rate/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = growthRateRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), growthRateRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::growthRateRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(GrowthRateDetail, Error, void* )
	, void* userData)
{
	return growthRateRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::growthRateRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(GrowthRateDetail, Error, void* )
	, void* userData)
{
	return growthRateRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool moveDamageClassListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedMoveDamageClassSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedMoveDamageClassSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedMoveDamageClassSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedMoveDamageClassSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedMoveDamageClassSummaryList", "PaginatedMoveDamageClassSummaryList");
			json_node_free(pJson);

			if ("PaginatedMoveDamageClassSummaryList" == "std::string") {
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

static bool moveDamageClassListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveDamageClassSummaryList, Error, void* )
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

	string url("/api/v2/move-damage-class/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = moveDamageClassListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), moveDamageClassListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::moveDamageClassListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveDamageClassSummaryList, Error, void* )
	, void* userData)
{
	return moveDamageClassListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::moveDamageClassListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedMoveDamageClassSummaryList, Error, void* )
	, void* userData)
{
	return moveDamageClassListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool moveDamageClassRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(MoveDamageClassDetail, Error, void* )
	= reinterpret_cast<void(*)(MoveDamageClassDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	MoveDamageClassDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("MoveDamageClassDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "MoveDamageClassDetail", "MoveDamageClassDetail");
			json_node_free(pJson);

			if ("MoveDamageClassDetail" == "std::string") {
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

static bool moveDamageClassRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(MoveDamageClassDetail, Error, void* )
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

	string url("/api/v2/move-damage-class/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = moveDamageClassRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), moveDamageClassRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::moveDamageClassRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(MoveDamageClassDetail, Error, void* )
	, void* userData)
{
	return moveDamageClassRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::moveDamageClassRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(MoveDamageClassDetail, Error, void* )
	, void* userData)
{
	return moveDamageClassRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool natureListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedNatureSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedNatureSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedNatureSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedNatureSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedNatureSummaryList", "PaginatedNatureSummaryList");
			json_node_free(pJson);

			if ("PaginatedNatureSummaryList" == "std::string") {
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

static bool natureListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedNatureSummaryList, Error, void* )
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

	string url("/api/v2/nature/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = natureListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), natureListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::natureListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedNatureSummaryList, Error, void* )
	, void* userData)
{
	return natureListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::natureListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedNatureSummaryList, Error, void* )
	, void* userData)
{
	return natureListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool natureRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(NatureDetail, Error, void* )
	= reinterpret_cast<void(*)(NatureDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	NatureDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("NatureDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "NatureDetail", "NatureDetail");
			json_node_free(pJson);

			if ("NatureDetail" == "std::string") {
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

static bool natureRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(NatureDetail, Error, void* )
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

	string url("/api/v2/nature/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = natureRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), natureRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::natureRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(NatureDetail, Error, void* )
	, void* userData)
{
	return natureRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::natureRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(NatureDetail, Error, void* )
	, void* userData)
{
	return natureRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool pokeathlonStatListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedPokeathlonStatSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedPokeathlonStatSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedPokeathlonStatSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedPokeathlonStatSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedPokeathlonStatSummaryList", "PaginatedPokeathlonStatSummaryList");
			json_node_free(pJson);

			if ("PaginatedPokeathlonStatSummaryList" == "std::string") {
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

static bool pokeathlonStatListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokeathlonStatSummaryList, Error, void* )
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

	string url("/api/v2/pokeathlon-stat/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokeathlonStatListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokeathlonStatListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokeathlonStatListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokeathlonStatSummaryList, Error, void* )
	, void* userData)
{
	return pokeathlonStatListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::pokeathlonStatListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokeathlonStatSummaryList, Error, void* )
	, void* userData)
{
	return pokeathlonStatListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool pokeathlonStatRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PokeathlonStatDetail, Error, void* )
	= reinterpret_cast<void(*)(PokeathlonStatDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PokeathlonStatDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PokeathlonStatDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PokeathlonStatDetail", "PokeathlonStatDetail");
			json_node_free(pJson);

			if ("PokeathlonStatDetail" == "std::string") {
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

static bool pokeathlonStatRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(PokeathlonStatDetail, Error, void* )
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

	string url("/api/v2/pokeathlon-stat/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokeathlonStatRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokeathlonStatRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokeathlonStatRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokeathlonStatDetail, Error, void* )
	, void* userData)
{
	return pokeathlonStatRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::pokeathlonStatRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokeathlonStatDetail, Error, void* )
	, void* userData)
{
	return pokeathlonStatRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool pokemonColorListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedPokemonColorSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedPokemonColorSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedPokemonColorSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedPokemonColorSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedPokemonColorSummaryList", "PaginatedPokemonColorSummaryList");
			json_node_free(pJson);

			if ("PaginatedPokemonColorSummaryList" == "std::string") {
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

static bool pokemonColorListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonColorSummaryList, Error, void* )
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

	string url("/api/v2/pokemon-color/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonColorListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonColorListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokemonColorListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonColorSummaryList, Error, void* )
	, void* userData)
{
	return pokemonColorListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::pokemonColorListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonColorSummaryList, Error, void* )
	, void* userData)
{
	return pokemonColorListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool pokemonColorRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PokemonColorDetail, Error, void* )
	= reinterpret_cast<void(*)(PokemonColorDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PokemonColorDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PokemonColorDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PokemonColorDetail", "PokemonColorDetail");
			json_node_free(pJson);

			if ("PokemonColorDetail" == "std::string") {
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

static bool pokemonColorRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(PokemonColorDetail, Error, void* )
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

	string url("/api/v2/pokemon-color/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonColorRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonColorRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokemonColorRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonColorDetail, Error, void* )
	, void* userData)
{
	return pokemonColorRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::pokemonColorRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonColorDetail, Error, void* )
	, void* userData)
{
	return pokemonColorRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool pokemonFormListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedPokemonFormSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedPokemonFormSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedPokemonFormSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedPokemonFormSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedPokemonFormSummaryList", "PaginatedPokemonFormSummaryList");
			json_node_free(pJson);

			if ("PaginatedPokemonFormSummaryList" == "std::string") {
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

static bool pokemonFormListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonFormSummaryList, Error, void* )
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

	string url("/api/v2/pokemon-form/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonFormListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonFormListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokemonFormListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonFormSummaryList, Error, void* )
	, void* userData)
{
	return pokemonFormListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::pokemonFormListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonFormSummaryList, Error, void* )
	, void* userData)
{
	return pokemonFormListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool pokemonFormRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PokemonFormDetail, Error, void* )
	= reinterpret_cast<void(*)(PokemonFormDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PokemonFormDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PokemonFormDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PokemonFormDetail", "PokemonFormDetail");
			json_node_free(pJson);

			if ("PokemonFormDetail" == "std::string") {
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

static bool pokemonFormRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(PokemonFormDetail, Error, void* )
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

	string url("/api/v2/pokemon-form/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonFormRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonFormRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokemonFormRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonFormDetail, Error, void* )
	, void* userData)
{
	return pokemonFormRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::pokemonFormRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonFormDetail, Error, void* )
	, void* userData)
{
	return pokemonFormRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool pokemonHabitatListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedPokemonHabitatSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedPokemonHabitatSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedPokemonHabitatSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedPokemonHabitatSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedPokemonHabitatSummaryList", "PaginatedPokemonHabitatSummaryList");
			json_node_free(pJson);

			if ("PaginatedPokemonHabitatSummaryList" == "std::string") {
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

static bool pokemonHabitatListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonHabitatSummaryList, Error, void* )
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

	string url("/api/v2/pokemon-habitat/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonHabitatListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonHabitatListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokemonHabitatListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonHabitatSummaryList, Error, void* )
	, void* userData)
{
	return pokemonHabitatListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::pokemonHabitatListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonHabitatSummaryList, Error, void* )
	, void* userData)
{
	return pokemonHabitatListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool pokemonHabitatRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PokemonHabitatDetail, Error, void* )
	= reinterpret_cast<void(*)(PokemonHabitatDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PokemonHabitatDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PokemonHabitatDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PokemonHabitatDetail", "PokemonHabitatDetail");
			json_node_free(pJson);

			if ("PokemonHabitatDetail" == "std::string") {
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

static bool pokemonHabitatRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(PokemonHabitatDetail, Error, void* )
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

	string url("/api/v2/pokemon-habitat/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonHabitatRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonHabitatRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokemonHabitatRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonHabitatDetail, Error, void* )
	, void* userData)
{
	return pokemonHabitatRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::pokemonHabitatRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonHabitatDetail, Error, void* )
	, void* userData)
{
	return pokemonHabitatRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool pokemonListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedPokemonSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedPokemonSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedPokemonSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedPokemonSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedPokemonSummaryList", "PaginatedPokemonSummaryList");
			json_node_free(pJson);

			if ("PaginatedPokemonSummaryList" == "std::string") {
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

static bool pokemonListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonSummaryList, Error, void* )
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

	string url("/api/v2/pokemon/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokemonListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonSummaryList, Error, void* )
	, void* userData)
{
	return pokemonListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::pokemonListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonSummaryList, Error, void* )
	, void* userData)
{
	return pokemonListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool pokemonRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PokemonDetail, Error, void* )
	= reinterpret_cast<void(*)(PokemonDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PokemonDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PokemonDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PokemonDetail", "PokemonDetail");
			json_node_free(pJson);

			if ("PokemonDetail" == "std::string") {
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

static bool pokemonRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(PokemonDetail, Error, void* )
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

	string url("/api/v2/pokemon/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokemonRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonDetail, Error, void* )
	, void* userData)
{
	return pokemonRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::pokemonRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonDetail, Error, void* )
	, void* userData)
{
	return pokemonRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool pokemonShapeListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedPokemonShapeSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedPokemonShapeSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedPokemonShapeSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedPokemonShapeSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedPokemonShapeSummaryList", "PaginatedPokemonShapeSummaryList");
			json_node_free(pJson);

			if ("PaginatedPokemonShapeSummaryList" == "std::string") {
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

static bool pokemonShapeListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonShapeSummaryList, Error, void* )
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

	string url("/api/v2/pokemon-shape/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonShapeListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonShapeListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokemonShapeListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonShapeSummaryList, Error, void* )
	, void* userData)
{
	return pokemonShapeListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::pokemonShapeListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonShapeSummaryList, Error, void* )
	, void* userData)
{
	return pokemonShapeListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool pokemonShapeRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PokemonShapeDetail, Error, void* )
	= reinterpret_cast<void(*)(PokemonShapeDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PokemonShapeDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PokemonShapeDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PokemonShapeDetail", "PokemonShapeDetail");
			json_node_free(pJson);

			if ("PokemonShapeDetail" == "std::string") {
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

static bool pokemonShapeRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(PokemonShapeDetail, Error, void* )
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

	string url("/api/v2/pokemon-shape/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonShapeRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonShapeRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokemonShapeRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonShapeDetail, Error, void* )
	, void* userData)
{
	return pokemonShapeRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::pokemonShapeRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonShapeDetail, Error, void* )
	, void* userData)
{
	return pokemonShapeRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool pokemonSpeciesListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedPokemonSpeciesSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedPokemonSpeciesSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedPokemonSpeciesSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedPokemonSpeciesSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedPokemonSpeciesSummaryList", "PaginatedPokemonSpeciesSummaryList");
			json_node_free(pJson);

			if ("PaginatedPokemonSpeciesSummaryList" == "std::string") {
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

static bool pokemonSpeciesListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonSpeciesSummaryList, Error, void* )
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

	string url("/api/v2/pokemon-species/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonSpeciesListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonSpeciesListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokemonSpeciesListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonSpeciesSummaryList, Error, void* )
	, void* userData)
{
	return pokemonSpeciesListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::pokemonSpeciesListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedPokemonSpeciesSummaryList, Error, void* )
	, void* userData)
{
	return pokemonSpeciesListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool pokemonSpeciesRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PokemonSpeciesDetail, Error, void* )
	= reinterpret_cast<void(*)(PokemonSpeciesDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PokemonSpeciesDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PokemonSpeciesDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PokemonSpeciesDetail", "PokemonSpeciesDetail");
			json_node_free(pJson);

			if ("PokemonSpeciesDetail" == "std::string") {
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

static bool pokemonSpeciesRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(PokemonSpeciesDetail, Error, void* )
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

	string url("/api/v2/pokemon-species/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = pokemonSpeciesRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), pokemonSpeciesRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::pokemonSpeciesRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonSpeciesDetail, Error, void* )
	, void* userData)
{
	return pokemonSpeciesRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::pokemonSpeciesRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(PokemonSpeciesDetail, Error, void* )
	, void* userData)
{
	return pokemonSpeciesRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool statListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedStatSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedStatSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedStatSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedStatSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedStatSummaryList", "PaginatedStatSummaryList");
			json_node_free(pJson);

			if ("PaginatedStatSummaryList" == "std::string") {
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

static bool statListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedStatSummaryList, Error, void* )
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

	string url("/api/v2/stat/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = statListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), statListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::statListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedStatSummaryList, Error, void* )
	, void* userData)
{
	return statListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::statListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedStatSummaryList, Error, void* )
	, void* userData)
{
	return statListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool statRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(StatDetail, Error, void* )
	= reinterpret_cast<void(*)(StatDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	StatDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("StatDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "StatDetail", "StatDetail");
			json_node_free(pJson);

			if ("StatDetail" == "std::string") {
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

static bool statRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(StatDetail, Error, void* )
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

	string url("/api/v2/stat/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = statRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), statRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::statRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(StatDetail, Error, void* )
	, void* userData)
{
	return statRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::statRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(StatDetail, Error, void* )
	, void* userData)
{
	return statRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

static bool typeListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(PaginatedTypeSummaryList, Error, void* )
	= reinterpret_cast<void(*)(PaginatedTypeSummaryList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	PaginatedTypeSummaryList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("PaginatedTypeSummaryList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "PaginatedTypeSummaryList", "PaginatedTypeSummaryList");
			json_node_free(pJson);

			if ("PaginatedTypeSummaryList" == "std::string") {
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

static bool typeListHelper(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedTypeSummaryList, Error, void* )
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

	string url("/api/v2/type/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = typeListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), typeListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::typeListAsync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedTypeSummaryList, Error, void* )
	, void* userData)
{
	return typeListHelper(accessToken,
	limit, offset, q, 
	handler, userData, true);
}

bool PokemonManager::typeListSync(char * accessToken,
	int limit, int offset, std::string q, 
	void(* handler)(PaginatedTypeSummaryList, Error, void* )
	, void* userData)
{
	return typeListHelper(accessToken,
	limit, offset, q, 
	handler, userData, false);
}

static bool typeRetrieveProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(TypeDetail, Error, void* )
	= reinterpret_cast<void(*)(TypeDetail, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	TypeDetail out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("TypeDetail")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "TypeDetail", "TypeDetail");
			json_node_free(pJson);

			if ("TypeDetail" == "std::string") {
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

static bool typeRetrieveHelper(char * accessToken,
	std::string id, 
	void(* handler)(TypeDetail, Error, void* )
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

	string url("/api/v2/type/{id}/");
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
		NetClient::easycurl(PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = typeRetrieveProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (PokemonManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), typeRetrieveProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __PokemonManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool PokemonManager::typeRetrieveAsync(char * accessToken,
	std::string id, 
	void(* handler)(TypeDetail, Error, void* )
	, void* userData)
{
	return typeRetrieveHelper(accessToken,
	id, 
	handler, userData, true);
}

bool PokemonManager::typeRetrieveSync(char * accessToken,
	std::string id, 
	void(* handler)(TypeDetail, Error, void* )
	, void* userData)
{
	return typeRetrieveHelper(accessToken,
	id, 
	handler, userData, false);
}

