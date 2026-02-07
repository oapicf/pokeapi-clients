#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonDexEntry.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonDexEntry::PokemonDexEntry()
{
	//__init();
}

PokemonDexEntry::~PokemonDexEntry()
{
	//__cleanup();
}

void
PokemonDexEntry::__init()
{
	//entry_number = int(0);
	//pokedex = new PokedexSummary();
}

void
PokemonDexEntry::__cleanup()
{
	//if(entry_number != NULL) {
	//
	//delete entry_number;
	//entry_number = NULL;
	//}
	//if(pokedex != NULL) {
	//
	//delete pokedex;
	//pokedex = NULL;
	//}
	//
}

void
PokemonDexEntry::fromJson(char* jsonStr)
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
	const gchar *pokedexKey = "pokedex";
	node = json_object_get_member(pJsonObject, pokedexKey);
	if (node !=NULL) {
	

		if (isprimitive("PokedexSummary")) {
			jsonToValue(&pokedex, node, "PokedexSummary", "PokedexSummary");
		} else {
			
			PokedexSummary* obj = static_cast<PokedexSummary*> (&pokedex);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonDexEntry::PokemonDexEntry(char* json)
{
	this->fromJson(json);
}

char*
PokemonDexEntry::toJson()
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
	if (isprimitive("PokedexSummary")) {
		PokedexSummary obj = getPokedex();
		node = converttoJson(&obj, "PokedexSummary", "");
	}
	else {
		
		PokedexSummary obj = static_cast<PokedexSummary> (getPokedex());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pokedexKey = "pokedex";
	json_object_set_member(pJsonObject, pokedexKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PokemonDexEntry::getEntryNumber()
{
	return entry_number;
}

void
PokemonDexEntry::setEntryNumber(int  entry_number)
{
	this->entry_number = entry_number;
}

PokedexSummary
PokemonDexEntry::getPokedex()
{
	return pokedex;
}

void
PokemonDexEntry::setPokedex(PokedexSummary  pokedex)
{
	this->pokedex = pokedex;
}


