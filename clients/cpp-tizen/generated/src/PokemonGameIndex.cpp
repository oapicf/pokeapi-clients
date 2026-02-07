#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonGameIndex.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonGameIndex::PokemonGameIndex()
{
	//__init();
}

PokemonGameIndex::~PokemonGameIndex()
{
	//__cleanup();
}

void
PokemonGameIndex::__init()
{
	//game_index = int(0);
	//version = new VersionSummary();
}

void
PokemonGameIndex::__cleanup()
{
	//if(game_index != NULL) {
	//
	//delete game_index;
	//game_index = NULL;
	//}
	//if(version != NULL) {
	//
	//delete version;
	//version = NULL;
	//}
	//
}

void
PokemonGameIndex::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *game_indexKey = "game_index";
	node = json_object_get_member(pJsonObject, game_indexKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&game_index, node, "int", "");
		} else {
			
		}
	}
	const gchar *versionKey = "version";
	node = json_object_get_member(pJsonObject, versionKey);
	if (node !=NULL) {
	

		if (isprimitive("VersionSummary")) {
			jsonToValue(&version, node, "VersionSummary", "VersionSummary");
		} else {
			
			VersionSummary* obj = static_cast<VersionSummary*> (&version);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonGameIndex::PokemonGameIndex(char* json)
{
	this->fromJson(json);
}

char*
PokemonGameIndex::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getGameIndex();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *game_indexKey = "game_index";
	json_object_set_member(pJsonObject, game_indexKey, node);
	if (isprimitive("VersionSummary")) {
		VersionSummary obj = getVersion();
		node = converttoJson(&obj, "VersionSummary", "");
	}
	else {
		
		VersionSummary obj = static_cast<VersionSummary> (getVersion());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *versionKey = "version";
	json_object_set_member(pJsonObject, versionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PokemonGameIndex::getGameIndex()
{
	return game_index;
}

void
PokemonGameIndex::setGameIndex(int  game_index)
{
	this->game_index = game_index;
}

VersionSummary
PokemonGameIndex::getVersion()
{
	return version;
}

void
PokemonGameIndex::setVersion(VersionSummary  version)
{
	this->version = version;
}


