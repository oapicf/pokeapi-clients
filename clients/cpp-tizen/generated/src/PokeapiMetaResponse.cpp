#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokeapiMetaResponse.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokeapiMetaResponse::PokeapiMetaResponse()
{
	//__init();
}

PokeapiMetaResponse::~PokeapiMetaResponse()
{
	//__cleanup();
}

void
PokeapiMetaResponse::__init()
{
	//deploy_date = std::string();
	//hash = std::string();
	//tag = std::string();
}

void
PokeapiMetaResponse::__cleanup()
{
	//if(deploy_date != NULL) {
	//
	//delete deploy_date;
	//deploy_date = NULL;
	//}
	//if(hash != NULL) {
	//
	//delete hash;
	//hash = NULL;
	//}
	//if(tag != NULL) {
	//
	//delete tag;
	//tag = NULL;
	//}
	//
}

void
PokeapiMetaResponse::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *deploy_dateKey = "deploy_date";
	node = json_object_get_member(pJsonObject, deploy_dateKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&deploy_date, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *hashKey = "hash";
	node = json_object_get_member(pJsonObject, hashKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&hash, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *tagKey = "tag";
	node = json_object_get_member(pJsonObject, tagKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&tag, node, "std::string", "");
		} else {
			
		}
	}
}

PokeapiMetaResponse::PokeapiMetaResponse(char* json)
{
	this->fromJson(json);
}

char*
PokeapiMetaResponse::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getDeployDate();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *deploy_dateKey = "deploy_date";
	json_object_set_member(pJsonObject, deploy_dateKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getHash();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *hashKey = "hash";
	json_object_set_member(pJsonObject, hashKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getTag();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *tagKey = "tag";
	json_object_set_member(pJsonObject, tagKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PokeapiMetaResponse::getDeployDate()
{
	return deploy_date;
}

void
PokeapiMetaResponse::setDeployDate(std::string  deploy_date)
{
	this->deploy_date = deploy_date;
}

std::string
PokeapiMetaResponse::getHash()
{
	return hash;
}

void
PokeapiMetaResponse::setHash(std::string  hash)
{
	this->hash = hash;
}

std::string
PokeapiMetaResponse::getTag()
{
	return tag;
}

void
PokeapiMetaResponse::setTag(std::string  tag)
{
	this->tag = tag;
}


