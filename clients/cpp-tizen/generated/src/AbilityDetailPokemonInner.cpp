#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AbilityDetail_pokemon_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AbilityDetail_pokemon_inner::AbilityDetail_pokemon_inner()
{
	//__init();
}

AbilityDetail_pokemon_inner::~AbilityDetail_pokemon_inner()
{
	//__cleanup();
}

void
AbilityDetail_pokemon_inner::__init()
{
	//is_hidden = bool(false);
	//slot = int(0);
	//pokemon = new AbilityDetail_pokemon_inner_pokemon();
}

void
AbilityDetail_pokemon_inner::__cleanup()
{
	//if(is_hidden != NULL) {
	//
	//delete is_hidden;
	//is_hidden = NULL;
	//}
	//if(slot != NULL) {
	//
	//delete slot;
	//slot = NULL;
	//}
	//if(pokemon != NULL) {
	//
	//delete pokemon;
	//pokemon = NULL;
	//}
	//
}

void
AbilityDetail_pokemon_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *is_hiddenKey = "is_hidden";
	node = json_object_get_member(pJsonObject, is_hiddenKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_hidden, node, "bool", "");
		} else {
			
		}
	}
	const gchar *slotKey = "slot";
	node = json_object_get_member(pJsonObject, slotKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&slot, node, "int", "");
		} else {
			
		}
	}
	const gchar *pokemonKey = "pokemon";
	node = json_object_get_member(pJsonObject, pokemonKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&pokemon, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&pokemon);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AbilityDetail_pokemon_inner::AbilityDetail_pokemon_inner(char* json)
{
	this->fromJson(json);
}

char*
AbilityDetail_pokemon_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getIsHidden();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_hiddenKey = "is_hidden";
	json_object_set_member(pJsonObject, is_hiddenKey, node);
	if (isprimitive("int")) {
		int obj = getSlot();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *slotKey = "slot";
	json_object_set_member(pJsonObject, slotKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getPokemon();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getPokemon());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pokemonKey = "pokemon";
	json_object_set_member(pJsonObject, pokemonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

bool
AbilityDetail_pokemon_inner::getIsHidden()
{
	return is_hidden;
}

void
AbilityDetail_pokemon_inner::setIsHidden(bool  is_hidden)
{
	this->is_hidden = is_hidden;
}

int
AbilityDetail_pokemon_inner::getSlot()
{
	return slot;
}

void
AbilityDetail_pokemon_inner::setSlot(int  slot)
{
	this->slot = slot;
}

AbilityDetail_pokemon_inner_pokemon
AbilityDetail_pokemon_inner::getPokemon()
{
	return pokemon;
}

void
AbilityDetail_pokemon_inner::setPokemon(AbilityDetail_pokemon_inner_pokemon  pokemon)
{
	this->pokemon = pokemon;
}


