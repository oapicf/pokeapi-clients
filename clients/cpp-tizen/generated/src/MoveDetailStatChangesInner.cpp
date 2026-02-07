#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveDetail_stat_changes_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveDetail_stat_changes_inner::MoveDetail_stat_changes_inner()
{
	//__init();
}

MoveDetail_stat_changes_inner::~MoveDetail_stat_changes_inner()
{
	//__cleanup();
}

void
MoveDetail_stat_changes_inner::__init()
{
	//change = int(0);
	//stat = new AbilityDetail_pokemon_inner_pokemon();
}

void
MoveDetail_stat_changes_inner::__cleanup()
{
	//if(change != NULL) {
	//
	//delete change;
	//change = NULL;
	//}
	//if(stat != NULL) {
	//
	//delete stat;
	//stat = NULL;
	//}
	//
}

void
MoveDetail_stat_changes_inner::fromJson(char* jsonStr)
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
	const gchar *statKey = "stat";
	node = json_object_get_member(pJsonObject, statKey);
	if (node !=NULL) {
	

		if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
			jsonToValue(&stat, node, "AbilityDetail_pokemon_inner_pokemon", "AbilityDetail_pokemon_inner_pokemon");
		} else {
			
			AbilityDetail_pokemon_inner_pokemon* obj = static_cast<AbilityDetail_pokemon_inner_pokemon*> (&stat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MoveDetail_stat_changes_inner::MoveDetail_stat_changes_inner(char* json)
{
	this->fromJson(json);
}

char*
MoveDetail_stat_changes_inner::toJson()
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
		AbilityDetail_pokemon_inner_pokemon obj = getStat();
		node = converttoJson(&obj, "AbilityDetail_pokemon_inner_pokemon", "");
	}
	else {
		
		AbilityDetail_pokemon_inner_pokemon obj = static_cast<AbilityDetail_pokemon_inner_pokemon> (getStat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *statKey = "stat";
	json_object_set_member(pJsonObject, statKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
MoveDetail_stat_changes_inner::getChange()
{
	return change;
}

void
MoveDetail_stat_changes_inner::setChange(int  change)
{
	this->change = change;
}

AbilityDetail_pokemon_inner_pokemon
MoveDetail_stat_changes_inner::getStat()
{
	return stat;
}

void
MoveDetail_stat_changes_inner::setStat(AbilityDetail_pokemon_inner_pokemon  stat)
{
	this->stat = stat;
}


