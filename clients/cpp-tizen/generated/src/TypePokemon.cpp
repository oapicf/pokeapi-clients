#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TypePokemon.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TypePokemon::TypePokemon()
{
	//__init();
}

TypePokemon::~TypePokemon()
{
	//__cleanup();
}

void
TypePokemon::__init()
{
	//slot = int(0);
	//pokemon = null;
}

void
TypePokemon::__cleanup()
{
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
TypePokemon::fromJson(char* jsonStr)
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

TypePokemon::TypePokemon(char* json)
{
	this->fromJson(json);
}

char*
TypePokemon::toJson()
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

int
TypePokemon::getSlot()
{
	return slot;
}

void
TypePokemon::setSlot(int  slot)
{
	this->slot = slot;
}

PokemonSummary
TypePokemon::getPokemon()
{
	return pokemon;
}

void
TypePokemon::setPokemon(PokemonSummary  pokemon)
{
	this->pokemon = pokemon;
}


