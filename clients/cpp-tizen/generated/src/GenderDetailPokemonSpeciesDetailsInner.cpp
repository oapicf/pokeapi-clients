#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GenderDetail_pokemon_species_details_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GenderDetail_pokemon_species_details_inner::GenderDetail_pokemon_species_details_inner()
{
	//__init();
}

GenderDetail_pokemon_species_details_inner::~GenderDetail_pokemon_species_details_inner()
{
	//__cleanup();
}

void
GenderDetail_pokemon_species_details_inner::__init()
{
	//rate = int(0);
	//pokemon_species = new AbilityDetail_pokemon_inner_pokemon();
}

void
GenderDetail_pokemon_species_details_inner::__cleanup()
{
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
GenderDetail_pokemon_species_details_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
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
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&pokemon_species, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&pokemon_species);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

GenderDetail_pokemon_species_details_inner::GenderDetail_pokemon_species_details_inner(char* json)
{
	this->fromJson(json);
}

char*
GenderDetail_pokemon_species_details_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getRate();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *rateKey = "rate";
	json_object_set_member(pJsonObject, rateKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getPokemonSpecies();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getPokemonSpecies());
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
GenderDetail_pokemon_species_details_inner::getRate()
{
	return rate;
}

void
GenderDetail_pokemon_species_details_inner::setRate(int  rate)
{
	this->rate = rate;
}

AbilityDetail_pokemon_inner_pokemon
GenderDetail_pokemon_species_details_inner::getPokemonSpecies()
{
	return pokemon_species;
}

void
GenderDetail_pokemon_species_details_inner::setPokemonSpecies(AbilityDetail_pokemon_inner_pokemon  pokemon_species)
{
	this->pokemon_species = pokemon_species;
}


