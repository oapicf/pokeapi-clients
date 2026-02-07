#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokeathlonStatDetail_affecting_natures_increase_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokeathlonStatDetail_affecting_natures_increase_inner::PokeathlonStatDetail_affecting_natures_increase_inner()
{
	//__init();
}

PokeathlonStatDetail_affecting_natures_increase_inner::~PokeathlonStatDetail_affecting_natures_increase_inner()
{
	//__cleanup();
}

void
PokeathlonStatDetail_affecting_natures_increase_inner::__init()
{
	//max_change = int(0);
	//nature = new AbilityDetail_pokemon_inner_pokemon();
}

void
PokeathlonStatDetail_affecting_natures_increase_inner::__cleanup()
{
	//if(max_change != NULL) {
	//
	//delete max_change;
	//max_change = NULL;
	//}
	//if(nature != NULL) {
	//
	//delete nature;
	//nature = NULL;
	//}
	//
}

void
PokeathlonStatDetail_affecting_natures_increase_inner::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *max_changeKey = "max_change";
	node = json_object_get_member(pJsonObject, max_changeKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&max_change, node, "int", "");
		} else {
			
		}
	}
	const gchar *natureKey = "nature";
	node = json_object_get_member(pJsonObject, natureKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&nature, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&nature);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokeathlonStatDetail_affecting_natures_increase_inner::PokeathlonStatDetail_affecting_natures_increase_inner(char* json)
{
	this->fromJson(json);
}

char*
PokeathlonStatDetail_affecting_natures_increase_inner::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getMaxChange();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *max_changeKey = "max_change";
	json_object_set_member(pJsonObject, max_changeKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		AbilityDetail_pokemon_inner_pokemon obj = getNature();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getNature());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *natureKey = "nature";
	json_object_set_member(pJsonObject, natureKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PokeathlonStatDetail_affecting_natures_increase_inner::getMaxChange()
{
	return max_change;
}

void
PokeathlonStatDetail_affecting_natures_increase_inner::setMaxChange(int  max_change)
{
	this->max_change = max_change;
}

AbilityDetail_pokemon_inner_pokemon
PokeathlonStatDetail_affecting_natures_increase_inner::getNature()
{
	return nature;
}

void
PokeathlonStatDetail_affecting_natures_increase_inner::setNature(AbilityDetail_pokemon_inner_pokemon  nature)
{
	this->nature = nature;
}


