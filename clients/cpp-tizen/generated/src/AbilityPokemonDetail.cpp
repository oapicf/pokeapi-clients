#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AbilityPokemonDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AbilityPokemonDetail::AbilityPokemonDetail()
{
	//__init();
}

AbilityPokemonDetail::~AbilityPokemonDetail()
{
	//__cleanup();
}

void
AbilityPokemonDetail::__init()
{
	//is_hidden = bool(false);
	//slot = int(0);
	//pokemon = null;
}

void
AbilityPokemonDetail::__cleanup()
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
AbilityPokemonDetail::fromJson(char* jsonStr)
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
	

		if (isprimitive("PokemonSummary")) {
			jsonToValue(&pokemon, node, "PokemonSummary", "PokemonSummary");
		} else {
			
			PokemonSummary* obj = static_cast<PokemonSummary*> (&pokemon);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

AbilityPokemonDetail::AbilityPokemonDetail(char* json)
{
	this->fromJson(json);
}

char*
AbilityPokemonDetail::toJson()
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
	if (isprimitive("PokemonSummary")) {
		PokemonSummary obj = getPokemon();
		node = converttoJson(&obj, "PokemonSummary", "");
	}
	else {
		
		PokemonSummary obj = static_cast<PokemonSummary> (getPokemon());
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
AbilityPokemonDetail::getIsHidden()
{
	return is_hidden;
}

void
AbilityPokemonDetail::setIsHidden(bool  is_hidden)
{
	this->is_hidden = is_hidden;
}

int
AbilityPokemonDetail::getSlot()
{
	return slot;
}

void
AbilityPokemonDetail::setSlot(int  slot)
{
	this->slot = slot;
}

PokemonSummary
AbilityPokemonDetail::getPokemon()
{
	return pokemon;
}

void
AbilityPokemonDetail::setPokemon(PokemonSummary  pokemon)
{
	this->pokemon = pokemon;
}


