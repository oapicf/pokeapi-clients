#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonHeldItemVersion.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonHeldItemVersion::PokemonHeldItemVersion()
{
	//__init();
}

PokemonHeldItemVersion::~PokemonHeldItemVersion()
{
	//__cleanup();
}

void
PokemonHeldItemVersion::__init()
{
	//rarity = int(0);
	//version = null;
}

void
PokemonHeldItemVersion::__cleanup()
{
	//if(rarity != NULL) {
	//
	//delete rarity;
	//rarity = NULL;
	//}
	//if(version != NULL) {
	//
	//delete version;
	//version = NULL;
	//}
	//
}

void
PokemonHeldItemVersion::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *rarityKey = "rarity";
	node = json_object_get_member(pJsonObject, rarityKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&rarity, node, "int", "");
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

PokemonHeldItemVersion::PokemonHeldItemVersion(char* json)
{
	this->fromJson(json);
}

char*
PokemonHeldItemVersion::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getRarity();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *rarityKey = "rarity";
	json_object_set_member(pJsonObject, rarityKey, node);
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
PokemonHeldItemVersion::getRarity()
{
	return rarity;
}

void
PokemonHeldItemVersion::setRarity(int  rarity)
{
	this->rarity = rarity;
}

VersionSummary
PokemonHeldItemVersion::getVersion()
{
	return version;
}

void
PokemonHeldItemVersion::setVersion(VersionSummary  version)
{
	this->version = version;
}


