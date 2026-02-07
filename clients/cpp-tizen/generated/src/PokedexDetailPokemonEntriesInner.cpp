#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokedexDetail_pokemon_entries_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokedexDetail_pokemon_entries_inner::PokedexDetail_pokemon_entries_inner()
{
	//__init();
}

PokedexDetail_pokemon_entries_inner::~PokedexDetail_pokemon_entries_inner()
{
	//__cleanup();
}

void
PokedexDetail_pokemon_entries_inner::__init()
{
	//entry_number = int(0);
	//pokemon_species = new AbilityDetail_pokemon_inner_pokemon();
}

void
PokedexDetail_pokemon_entries_inner::__cleanup()
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
PokedexDetail_pokemon_entries_inner::fromJson(char* jsonStr)
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
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&pokemon_species, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&pokemon_species);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokedexDetail_pokemon_entries_inner::PokedexDetail_pokemon_entries_inner(char* json)
{
	this->fromJson(json);
}

char*
PokedexDetail_pokemon_entries_inner::toJson()
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
PokedexDetail_pokemon_entries_inner::getEntryNumber()
{
	return entry_number;
}

void
PokedexDetail_pokemon_entries_inner::setEntryNumber(int  entry_number)
{
	this->entry_number = entry_number;
}

AbilityDetail_pokemon_inner_pokemon
PokedexDetail_pokemon_entries_inner::getPokemonSpecies()
{
	return pokemon_species;
}

void
PokedexDetail_pokemon_entries_inner::setPokemonSpecies(AbilityDetail_pokemon_inner_pokemon  pokemon_species)
{
	this->pokemon_species = pokemon_species;
}


