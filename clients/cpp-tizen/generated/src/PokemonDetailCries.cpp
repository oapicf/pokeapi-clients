#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonDetail_cries.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonDetail_cries::PokemonDetail_cries()
{
	//__init();
}

PokemonDetail_cries::~PokemonDetail_cries()
{
	//__cleanup();
}

void
PokemonDetail_cries::__init()
{
	//latest = std::string();
	//legacy = std::string();
}

void
PokemonDetail_cries::__cleanup()
{
	//if(latest != NULL) {
	//
	//delete latest;
	//latest = NULL;
	//}
	//if(legacy != NULL) {
	//
	//delete legacy;
	//legacy = NULL;
	//}
	//
}

void
PokemonDetail_cries::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *latestKey = "latest";
	node = json_object_get_member(pJsonObject, latestKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&latest, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *legacyKey = "legacy";
	node = json_object_get_member(pJsonObject, legacyKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&legacy, node, "std::string", "");
		} else {
			
		}
	}
}

PokemonDetail_cries::PokemonDetail_cries(char* json)
{
	this->fromJson(json);
}

char*
PokemonDetail_cries::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getLatest();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *latestKey = "latest";
	json_object_set_member(pJsonObject, latestKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getLegacy();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *legacyKey = "legacy";
	json_object_set_member(pJsonObject, legacyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PokemonDetail_cries::getLatest()
{
	return latest;
}

void
PokemonDetail_cries::setLatest(std::string  latest)
{
	this->latest = latest;
}

std::string
PokemonDetail_cries::getLegacy()
{
	return legacy;
}

void
PokemonDetail_cries::setLegacy(std::string  legacy)
{
	this->legacy = legacy;
}


