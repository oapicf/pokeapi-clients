#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSpeciesVariety.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSpeciesVariety::PokemonSpeciesVariety()
{
	//__init();
}

PokemonSpeciesVariety::~PokemonSpeciesVariety()
{
	//__cleanup();
}

void
PokemonSpeciesVariety::__init()
{
	//is_default = bool(false);
	//pokemon = null;
}

void
PokemonSpeciesVariety::__cleanup()
{
	//if(is_default != NULL) {
	//
	//delete is_default;
	//is_default = NULL;
	//}
	//if(pokemon != NULL) {
	//
	//delete pokemon;
	//pokemon = NULL;
	//}
	//
}

void
PokemonSpeciesVariety::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *is_defaultKey = "is_default";
	node = json_object_get_member(pJsonObject, is_defaultKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_default, node, "bool", "");
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

PokemonSpeciesVariety::PokemonSpeciesVariety(char* json)
{
	this->fromJson(json);
}

char*
PokemonSpeciesVariety::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("bool")) {
		bool obj = getIsDefault();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_defaultKey = "is_default";
	json_object_set_member(pJsonObject, is_defaultKey, node);
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
PokemonSpeciesVariety::getIsDefault()
{
	return is_default;
}

void
PokemonSpeciesVariety::setIsDefault(bool  is_default)
{
	this->is_default = is_default;
}

PokemonSummary
PokemonSpeciesVariety::getPokemon()
{
	return pokemon;
}

void
PokemonSpeciesVariety::setPokemon(PokemonSummary  pokemon)
{
	this->pokemon = pokemon;
}


