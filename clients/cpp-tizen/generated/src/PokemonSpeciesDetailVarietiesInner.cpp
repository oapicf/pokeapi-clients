#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSpeciesDetail_varieties_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSpeciesDetail_varieties_inner::PokemonSpeciesDetail_varieties_inner()
{
	//__init();
}

PokemonSpeciesDetail_varieties_inner::~PokemonSpeciesDetail_varieties_inner()
{
	//__cleanup();
}

void
PokemonSpeciesDetail_varieties_inner::__init()
{
	//is_default = bool(false);
	//pokemon = new AbilityDetail_pokemon_inner_pokemon();
}

void
PokemonSpeciesDetail_varieties_inner::__cleanup()
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
PokemonSpeciesDetail_varieties_inner::fromJson(char* jsonStr)
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
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&pokemon, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&pokemon);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonSpeciesDetail_varieties_inner::PokemonSpeciesDetail_varieties_inner(char* json)
{
	this->fromJson(json);
}

char*
PokemonSpeciesDetail_varieties_inner::toJson()
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
PokemonSpeciesDetail_varieties_inner::getIsDefault()
{
	return is_default;
}

void
PokemonSpeciesDetail_varieties_inner::setIsDefault(bool  is_default)
{
	this->is_default = is_default;
}

AbilityDetail_pokemon_inner_pokemon
PokemonSpeciesDetail_varieties_inner::getPokemon()
{
	return pokemon;
}

void
PokemonSpeciesDetail_varieties_inner::setPokemon(AbilityDetail_pokemon_inner_pokemon  pokemon)
{
	this->pokemon = pokemon;
}


