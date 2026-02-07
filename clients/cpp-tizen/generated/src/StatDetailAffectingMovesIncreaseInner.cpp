#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "StatDetail_affecting_moves_increase_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

StatDetail_affecting_moves_increase_inner::StatDetail_affecting_moves_increase_inner()
{
	//__init();
}

StatDetail_affecting_moves_increase_inner::~StatDetail_affecting_moves_increase_inner()
{
	//__cleanup();
}

void
StatDetail_affecting_moves_increase_inner::__init()
{
	//change = int(0);
	//move = new AbilityDetail_pokemon_inner_pokemon();
}

void
StatDetail_affecting_moves_increase_inner::__cleanup()
{
	//if(change != NULL) {
	//
	//delete change;
	//change = NULL;
	//}
	//if(move != NULL) {
	//
	//delete move;
	//move = NULL;
	//}
	//
}

void
StatDetail_affecting_moves_increase_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *changeKey = "change";
	node = json_object_get_member(pJsonObject, changeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&change, node, "int", "");
		} else {
			
		}
	}
	const gchar *moveKey = "move";
	node = json_object_get_member(pJsonObject, moveKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&move, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&move);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

StatDetail_affecting_moves_increase_inner::StatDetail_affecting_moves_increase_inner(char* json)
{
	this->fromJson(json);
}

char*
StatDetail_affecting_moves_increase_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getChange();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *changeKey = "change";
	json_object_set_member(pJsonObject, changeKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getMove();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getMove());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *moveKey = "move";
	json_object_set_member(pJsonObject, moveKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
StatDetail_affecting_moves_increase_inner::getChange()
{
	return change;
}

void
StatDetail_affecting_moves_increase_inner::setChange(int  change)
{
	this->change = change;
}

AbilityDetail_pokemon_inner_pokemon
StatDetail_affecting_moves_increase_inner::getMove()
{
	return move;
}

void
StatDetail_affecting_moves_increase_inner::setMove(AbilityDetail_pokemon_inner_pokemon  move)
{
	this->move = move;
}


