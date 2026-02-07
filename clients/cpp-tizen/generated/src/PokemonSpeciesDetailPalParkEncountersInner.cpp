#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSpeciesDetail_pal_park_encounters_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSpeciesDetail_pal_park_encounters_inner::PokemonSpeciesDetail_pal_park_encounters_inner()
{
	//__init();
}

PokemonSpeciesDetail_pal_park_encounters_inner::~PokemonSpeciesDetail_pal_park_encounters_inner()
{
	//__cleanup();
}

void
PokemonSpeciesDetail_pal_park_encounters_inner::__init()
{
	//area = new AbilityDetail_pokemon_inner_pokemon();
	//base_score = int(0);
	//rate = int(0);
}

void
PokemonSpeciesDetail_pal_park_encounters_inner::__cleanup()
{
	//if(area != NULL) {
	//
	//delete area;
	//area = NULL;
	//}
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
	//
}

void
PokemonSpeciesDetail_pal_park_encounters_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *areaKey = "area";
	node = json_object_get_member(pJsonObject, areaKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&area, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&area);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
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
}

PokemonSpeciesDetail_pal_park_encounters_inner::PokemonSpeciesDetail_pal_park_encounters_inner(char* json)
{
	this->fromJson(json);
}

char*
PokemonSpeciesDetail_pal_park_encounters_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getArea();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getArea());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *areaKey = "area";
	json_object_set_member(pJsonObject, areaKey, node);
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
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

AbilityDetail_pokemon_inner_pokemon
PokemonSpeciesDetail_pal_park_encounters_inner::getArea()
{
	return area;
}

void
PokemonSpeciesDetail_pal_park_encounters_inner::setArea(AbilityDetail_pokemon_inner_pokemon  area)
{
	this->area = area;
}

int
PokemonSpeciesDetail_pal_park_encounters_inner::getBaseScore()
{
	return base_score;
}

void
PokemonSpeciesDetail_pal_park_encounters_inner::setBaseScore(int  base_score)
{
	this->base_score = base_score;
}

int
PokemonSpeciesDetail_pal_park_encounters_inner::getRate()
{
	return rate;
}

void
PokemonSpeciesDetail_pal_park_encounters_inner::setRate(int  rate)
{
	this->rate = rate;
}


