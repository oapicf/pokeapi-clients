#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonDetail_abilities_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonDetail_abilities_inner::PokemonDetail_abilities_inner()
{
	//__init();
}

PokemonDetail_abilities_inner::~PokemonDetail_abilities_inner()
{
	//__cleanup();
}

void
PokemonDetail_abilities_inner::__init()
{
	//ability = new AbilityDetail_pokemon_inner_pokemon();
	//is_hidden = bool(false);
	//slot = int(0);
}

void
PokemonDetail_abilities_inner::__cleanup()
{
	//if(ability != NULL) {
	//
	//delete ability;
	//ability = NULL;
	//}
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
	//
}

void
PokemonDetail_abilities_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *abilityKey = "ability";
	node = json_object_get_member(pJsonObject, abilityKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&ability, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&ability);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
}

PokemonDetail_abilities_inner::PokemonDetail_abilities_inner(char* json)
{
	this->fromJson(json);
}

char*
PokemonDetail_abilities_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getAbility();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getAbility());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *abilityKey = "ability";
	json_object_set_member(pJsonObject, abilityKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AbilityDetail_pokemon_inner_pokemon
PokemonDetail_abilities_inner::getAbility()
{
	return ability;
}

void
PokemonDetail_abilities_inner::setAbility(AbilityDetail_pokemon_inner_pokemon  ability)
{
	this->ability = ability;
}

bool
PokemonDetail_abilities_inner::getIsHidden()
{
	return is_hidden;
}

void
PokemonDetail_abilities_inner::setIsHidden(bool  is_hidden)
{
	this->is_hidden = is_hidden;
}

int
PokemonDetail_abilities_inner::getSlot()
{
	return slot;
}

void
PokemonDetail_abilities_inner::setSlot(int  slot)
{
	this->slot = slot;
}


