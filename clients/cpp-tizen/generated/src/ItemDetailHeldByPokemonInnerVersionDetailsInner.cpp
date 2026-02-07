#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ItemDetail_held_by_pokemon_inner_version_details_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ItemDetail_held_by_pokemon_inner_version_details_inner::ItemDetail_held_by_pokemon_inner_version_details_inner()
{
	//__init();
}

ItemDetail_held_by_pokemon_inner_version_details_inner::~ItemDetail_held_by_pokemon_inner_version_details_inner()
{
	//__cleanup();
}

void
ItemDetail_held_by_pokemon_inner_version_details_inner::__init()
{
	//rarity = int(0);
	//version = new AbilityDetail_pokemon_inner_pokemon();
}

void
ItemDetail_held_by_pokemon_inner_version_details_inner::__cleanup()
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
ItemDetail_held_by_pokemon_inner_version_details_inner::fromJson(char* jsonStr)
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
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&version, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&version);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

ItemDetail_held_by_pokemon_inner_version_details_inner::ItemDetail_held_by_pokemon_inner_version_details_inner(char* json)
{
	this->fromJson(json);
}

char*
ItemDetail_held_by_pokemon_inner_version_details_inner::toJson()
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
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getVersion();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getVersion());
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
ItemDetail_held_by_pokemon_inner_version_details_inner::getRarity()
{
	return rarity;
}

void
ItemDetail_held_by_pokemon_inner_version_details_inner::setRarity(int  rarity)
{
	this->rarity = rarity;
}

AbilityDetail_pokemon_inner_pokemon
ItemDetail_held_by_pokemon_inner_version_details_inner::getVersion()
{
	return version;
}

void
ItemDetail_held_by_pokemon_inner_version_details_inner::setVersion(AbilityDetail_pokemon_inner_pokemon  version)
{
	this->version = version;
}


