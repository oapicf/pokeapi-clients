#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PalParkEncounter.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PalParkEncounter::PalParkEncounter()
{
	//__init();
}

PalParkEncounter::~PalParkEncounter()
{
	//__cleanup();
}

void
PalParkEncounter::__init()
{
	//base_score = int(0);
	//rate = int(0);
	//pokemon_species = null;
}

void
PalParkEncounter::__cleanup()
{
	//if(base_score != NULL) {
	//
	//delete base_score;
	//base_score = NULL;
	//}
	//if(rate != NULL) {
	//
	//delete rate;
	//rate = NULL;
	//}
	//if(pokemon_species != NULL) {
	//
	//delete pokemon_species;
	//pokemon_species = NULL;
	//}
	//
}

void
PalParkEncounter::fromJson(char* jsonStr)
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
	const gchar *rateKey = "rate";
	node = json_object_get_member(pJsonObject, rateKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&rate, node, "int", "");
		} else {
			
		}
	}
	const gchar *pokemon_speciesKey = "pokemon_species";
	node = json_object_get_member(pJsonObject, pokemon_speciesKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonSpeciesSummary")) {
			jsonToValue(&pokemon_species, node, "PokemonSpeciesSummary", "PokemonSpeciesSummary");
		} else {
			
			PokemonSpeciesSummary* obj = static_cast<PokemonSpeciesSummary*> (&pokemon_species);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PalParkEncounter::PalParkEncounter(char* json)
{
	this->fromJson(json);
}

char*
PalParkEncounter::toJson()
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
	if (isprimitive("int")) {
		int obj = getRate();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *rateKey = "rate";
	json_object_set_member(pJsonObject, rateKey, node);
	if (isprimitive("PokemonSpeciesSummary")) {
		PokemonSpeciesSummary obj = getPokemonSpecies();
		node = converttoJson(&obj, "PokemonSpeciesSummary", "");
	}
	else {
		
		PokemonSpeciesSummary obj = static_cast<PokemonSpeciesSummary> (getPokemonSpecies());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pokemon_speciesKey = "pokemon_species";
	json_object_set_member(pJsonObject, pokemon_speciesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PalParkEncounter::getBaseScore()
{
	return base_score;
}

void
PalParkEncounter::setBaseScore(int  base_score)
{
	this->base_score = base_score;
}

int
PalParkEncounter::getRate()
{
	return rate;
}

void
PalParkEncounter::setRate(int  rate)
{
	this->rate = rate;
}

PokemonSpeciesSummary
PalParkEncounter::getPokemonSpecies()
{
	return pokemon_species;
}

void
PalParkEncounter::setPokemonSpecies(PokemonSpeciesSummary  pokemon_species)
{
	this->pokemon_species = pokemon_species;
}


