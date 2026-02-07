#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "NatureDetail_pokeathlon_stat_changes_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

NatureDetail_pokeathlon_stat_changes_inner::NatureDetail_pokeathlon_stat_changes_inner()
{
	//__init();
}

NatureDetail_pokeathlon_stat_changes_inner::~NatureDetail_pokeathlon_stat_changes_inner()
{
	//__cleanup();
}

void
NatureDetail_pokeathlon_stat_changes_inner::__init()
{
	//max_change = int(0);
	//pokeathlon_stat = new AbilityDetail_pokemon_inner_pokemon();
}

void
NatureDetail_pokeathlon_stat_changes_inner::__cleanup()
{
	//if(max_change != NULL) {
	//
	//delete max_change;
	//max_change = NULL;
	//}
	//if(pokeathlon_stat != NULL) {
	//
	//delete pokeathlon_stat;
	//pokeathlon_stat = NULL;
	//}
	//
}

void
NatureDetail_pokeathlon_stat_changes_inner::fromJson(char* jsonStr)
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
	const gchar *pokeathlon_statKey = "pokeathlon_stat";
	node = json_object_get_member(pJsonObject, pokeathlon_statKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&pokeathlon_stat, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&pokeathlon_stat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

NatureDetail_pokeathlon_stat_changes_inner::NatureDetail_pokeathlon_stat_changes_inner(char* json)
{
	this->fromJson(json);
}

char*
NatureDetail_pokeathlon_stat_changes_inner::toJson()
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
		AbilityDetail_pokemon_inner_pokemon obj = getPokeathlonStat();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getPokeathlonStat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *pokeathlon_statKey = "pokeathlon_stat";
	json_object_set_member(pJsonObject, pokeathlon_statKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
NatureDetail_pokeathlon_stat_changes_inner::getMaxChange()
{
	return max_change;
}

void
NatureDetail_pokeathlon_stat_changes_inner::setMaxChange(int  max_change)
{
	this->max_change = max_change;
}

AbilityDetail_pokemon_inner_pokemon
NatureDetail_pokeathlon_stat_changes_inner::getPokeathlonStat()
{
	return pokeathlon_stat;
}

void
NatureDetail_pokeathlon_stat_changes_inner::setPokeathlonStat(AbilityDetail_pokemon_inner_pokemon  pokeathlon_stat)
{
	this->pokeathlon_stat = pokeathlon_stat;
}


