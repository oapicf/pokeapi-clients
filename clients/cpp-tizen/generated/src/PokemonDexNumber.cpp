#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonDexNumber.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonDexNumber::PokemonDexNumber()
{
	//__init();
}

PokemonDexNumber::~PokemonDexNumber()
{
	//__cleanup();
}

void
PokemonDexNumber::__init()
{
	//entry_number = int(0);
	//pokemon_species = null;
}

void
PokemonDexNumber::__cleanup()
{
	//if(entry_number != NULL) {
	//
	//delete entry_number;
	//entry_number = NULL;
	//}
	//if(pokemon_species != NULL) {
	//
	//delete pokemon_species;
	//pokemon_species = NULL;
	//}
	//
}

void
PokemonDexNumber::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *entry_numberKey = "entry_number";
	node = json_object_get_member(pJsonObject, entry_numberKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&entry_number, node, "int", "");
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

PokemonDexNumber::PokemonDexNumber(char* json)
{
	this->fromJson(json);
}

char*
PokemonDexNumber::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getEntryNumber();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *entry_numberKey = "entry_number";
	json_object_set_member(pJsonObject, entry_numberKey, node);
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
PokemonDexNumber::getEntryNumber()
{
	return entry_number;
}

void
PokemonDexNumber::setEntryNumber(int  entry_number)
{
	this->entry_number = entry_number;
}

PokemonSpeciesSummary
PokemonDexNumber::getPokemonSpecies()
{
	return pokemon_species;
}

void
PokemonDexNumber::setPokemonSpecies(PokemonSpeciesSummary  pokemon_species)
{
	this->pokemon_species = pokemon_species;
}


