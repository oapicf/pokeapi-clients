#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonDetail_types_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonDetail_types_inner::PokemonDetail_types_inner()
{
	//__init();
}

PokemonDetail_types_inner::~PokemonDetail_types_inner()
{
	//__cleanup();
}

void
PokemonDetail_types_inner::__init()
{
	//slot = int(0);
	//type = new AbilityDetail_pokemon_inner_pokemon();
}

void
PokemonDetail_types_inner::__cleanup()
{
	//if(slot != NULL) {
	//
	//delete slot;
	//slot = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
PokemonDetail_types_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slotKey = "slot";
	node = json_object_get_member(pJsonObject, slotKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&slot, node, "int", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&type, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonDetail_types_inner::PokemonDetail_types_inner(char* json)
{
	this->fromJson(json);
}

char*
PokemonDetail_types_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getSlot();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *slotKey = "slot";
	json_object_set_member(pJsonObject, slotKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getType();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PokemonDetail_types_inner::getSlot()
{
	return slot;
}

void
PokemonDetail_types_inner::setSlot(int  slot)
{
	this->slot = slot;
}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_types_inner::getType()
{
	return type;
}

void
PokemonDetail_types_inner::setType(AbilityDetail_pokemon_inner_pokemon  type)
{
	this->type = type;
}


