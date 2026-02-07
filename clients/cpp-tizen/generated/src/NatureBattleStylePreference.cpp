#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "NatureBattleStylePreference.h"

using namespace std;
using namespace Tizen::ArtikCloud;

NatureBattleStylePreference::NatureBattleStylePreference()
{
	//__init();
}

NatureBattleStylePreference::~NatureBattleStylePreference()
{
	//__cleanup();
}

void
NatureBattleStylePreference::__init()
{
	//low_hp_preference = int(0);
	//high_hp_preference = int(0);
	//move_battle_style = new MoveBattleStyleSummary();
}

void
NatureBattleStylePreference::__cleanup()
{
	//if(low_hp_preference != NULL) {
	//
	//delete low_hp_preference;
	//low_hp_preference = NULL;
	//}
	//if(high_hp_preference != NULL) {
	//
	//delete high_hp_preference;
	//high_hp_preference = NULL;
	//}
	//if(move_battle_style != NULL) {
	//
	//delete move_battle_style;
	//move_battle_style = NULL;
	//}
	//
}

void
NatureBattleStylePreference::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *low_hp_preferenceKey = "low_hp_preference";
	node = json_object_get_member(pJsonObject, low_hp_preferenceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&low_hp_preference, node, "int", "");
		} else {
			
		}
	}
	const gchar *high_hp_preferenceKey = "high_hp_preference";
	node = json_object_get_member(pJsonObject, high_hp_preferenceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&high_hp_preference, node, "int", "");
		} else {
			
		}
	}
	const gchar *move_battle_styleKey = "move_battle_style";
	node = json_object_get_member(pJsonObject, move_battle_styleKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveBattleStyleSummary")) {
			jsonToValue(&move_battle_style, node, "MoveBattleStyleSummary", "MoveBattleStyleSummary");
		} else {
			
			MoveBattleStyleSummary* obj = static_cast<MoveBattleStyleSummary*> (&move_battle_style);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

NatureBattleStylePreference::NatureBattleStylePreference(char* json)
{
	this->fromJson(json);
}

char*
NatureBattleStylePreference::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getLowHpPreference();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *low_hp_preferenceKey = "low_hp_preference";
	json_object_set_member(pJsonObject, low_hp_preferenceKey, node);
	if (isprimitive("int")) {
		int obj = getHighHpPreference();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *high_hp_preferenceKey = "high_hp_preference";
	json_object_set_member(pJsonObject, high_hp_preferenceKey, node);
	if (isprimitive("MoveBattleStyleSummary")) {
		MoveBattleStyleSummary obj = getMoveBattleStyle();
		node = converttoJson(&obj, "MoveBattleStyleSummary", "");
	}
	else {
		
		MoveBattleStyleSummary obj = static_cast<MoveBattleStyleSummary> (getMoveBattleStyle());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *move_battle_styleKey = "move_battle_style";
	json_object_set_member(pJsonObject, move_battle_styleKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
NatureBattleStylePreference::getLowHpPreference()
{
	return low_hp_preference;
}

void
NatureBattleStylePreference::setLowHpPreference(int  low_hp_preference)
{
	this->low_hp_preference = low_hp_preference;
}

int
NatureBattleStylePreference::getHighHpPreference()
{
	return high_hp_preference;
}

void
NatureBattleStylePreference::setHighHpPreference(int  high_hp_preference)
{
	this->high_hp_preference = high_hp_preference;
}

MoveBattleStyleSummary
NatureBattleStylePreference::getMoveBattleStyle()
{
	return move_battle_style;
}

void
NatureBattleStylePreference::setMoveBattleStyle(MoveBattleStyleSummary  move_battle_style)
{
	this->move_battle_style = move_battle_style;
}


