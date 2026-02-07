#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PalParkAreaDetail_pokemon_encounters_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PalParkAreaDetail_pokemon_encounters_inner::PalParkAreaDetail_pokemon_encounters_inner()
{
	//__init();
}

PalParkAreaDetail_pokemon_encounters_inner::~PalParkAreaDetail_pokemon_encounters_inner()
{
	//__cleanup();
}

void
PalParkAreaDetail_pokemon_encounters_inner::__init()
{
	//base_score = int(0);
	//pokemonspecies = new AbilityDetail_pokemon_inner_pokemon();
	//rate = int(0);
}

void
PalParkAreaDetail_pokemon_encounters_inner::__cleanup()
{
	//if(base_score != NULL) {
	//
	//delete base_score;
	//base_score = NULL;
	//}
	//if(pokemonspecies != NULL) {
	//
	//delete pokemonspecies;
	//pokemonspecies = NULL;
	//}
	//if(rate != NULL) {
	//
	//delete rate;
	//rate = NULL;
	//}
	//
}

void
PalParkAreaDetail_pokemon_encounters_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *base_scoreKey = "base_score";
	node = json_object_get_member(pJsonObject, base_scoreKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&base_score, node, "int", "");
		} else {
			
		}
	}
	const gchar *pokemonspeciesKey = "pokemon-species";
	node = json_object_get_member(pJsonObject, pokemonspeciesKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&pokemonspecies, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&pokemonspecies);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *rateKey = "rate";
	node = json_object_get_member(pJsonObject, rateKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&rate, node, "int", "");
		} else {
			
		}
	}
}

PalParkAreaDetail_pokemon_encounters_inner::PalParkAreaDetail_pokemon_encounters_inner(char* json)
{
	this->fromJson(json);
}

char*
PalParkAreaDetail_pokemon_encounters_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getBaseScore();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *base_scoreKey = "base_score";
	json_object_set_member(pJsonObject, base_scoreKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getPokemonspecies();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getPokemonspecies());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pokemonspeciesKey = "pokemon-species";
	json_object_set_member(pJsonObject, pokemonspeciesKey, node);
	if (isprimitive("int")) {
		int obj = getRate();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *rateKey = "rate";
	json_object_set_member(pJsonObject, rateKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PalParkAreaDetail_pokemon_encounters_inner::getBaseScore()
{
	return base_score;
}

void
PalParkAreaDetail_pokemon_encounters_inner::setBaseScore(int  base_score)
{
	this->base_score = base_score;
}

AbilityDetail_pokemon_inner_pokemon
PalParkAreaDetail_pokemon_encounters_inner::getPokemonspecies()
{
	return pokemonspecies;
}

void
PalParkAreaDetail_pokemon_encounters_inner::setPokemonspecies(AbilityDetail_pokemon_inner_pokemon  pokemonspecies)
{
	this->pokemonspecies = pokemonspecies;
}

int
PalParkAreaDetail_pokemon_encounters_inner::getRate()
{
	return rate;
}

void
PalParkAreaDetail_pokemon_encounters_inner::setRate(int  rate)
{
	this->rate = rate;
}


