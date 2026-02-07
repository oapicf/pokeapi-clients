#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "TypeDetail_pokemon_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

TypeDetail_pokemon_inner::TypeDetail_pokemon_inner()
{
	//__init();
}

TypeDetail_pokemon_inner::~TypeDetail_pokemon_inner()
{
	//__cleanup();
}

void
TypeDetail_pokemon_inner::__init()
{
	//slot = int(0);
	//pokemon = new TypeDetail_pokemon_inner_pokemon();
}

void
TypeDetail_pokemon_inner::__cleanup()
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
TypeDetail_pokemon_inner::fromJson(char* jsonStr)
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
	

		if (isprimitive("TypeDetail_pokemon_inner_pokemon")) {
			jsonToValue(&pokemon, node, "TypeDetail_pokemon_inner_pokemon", "TypeDetail_pokemon_inner_pokemon");
		} else {
			
			TypeDetail_pokemon_inner_pokemon* obj = static_cast<TypeDetail_pokemon_inner_pokemon*> (&pokemon);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

TypeDetail_pokemon_inner::TypeDetail_pokemon_inner(char* json)
{
	this->fromJson(json);
}

char*
TypeDetail_pokemon_inner::toJson()
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
	if (isprimitive("TypeDetail_pokemon_inner_pokemon")) {
		TypeDetail_pokemon_inner_pokemon obj = getPokemon();
		node = converttoJson(&obj, "TypeDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		TypeDetail_pokemon_inner_pokemon obj = static_cast<TypeDetail_pokemon_inner_pokemon> (getPokemon());
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
TypeDetail_pokemon_inner::getSlot()
{
	return slot;
}

void
TypeDetail_pokemon_inner::setSlot(int  slot)
{
	this->slot = slot;
}

TypeDetail_pokemon_inner_pokemon
TypeDetail_pokemon_inner::getPokemon()
{
	return pokemon;
}

void
TypeDetail_pokemon_inner::setPokemon(TypeDetail_pokemon_inner_pokemon  pokemon)
{
	this->pokemon = pokemon;
}


