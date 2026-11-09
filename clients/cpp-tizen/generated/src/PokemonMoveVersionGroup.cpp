#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonMoveVersionGroup.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonMoveVersionGroup::PokemonMoveVersionGroup()
{
	//__init();
}

PokemonMoveVersionGroup::~PokemonMoveVersionGroup()
{
	//__cleanup();
}

void
PokemonMoveVersionGroup::__init()
{
	//level_learned_at = int(0);
	//move_learn_method = null;
	//version_group = null;
	//order = int(0);
}

void
PokemonMoveVersionGroup::__cleanup()
{
	//if(level_learned_at != NULL) {
	//
	//delete level_learned_at;
	//level_learned_at = NULL;
	//}
	//if(move_learn_method != NULL) {
	//
	//delete move_learn_method;
	//move_learn_method = NULL;
	//}
	//if(version_group != NULL) {
	//
	//delete version_group;
	//version_group = NULL;
	//}
	//if(order != NULL) {
	//
	//delete order;
	//order = NULL;
	//}
	//
}

void
PokemonMoveVersionGroup::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *level_learned_atKey = "level_learned_at";
	node = json_object_get_member(pJsonObject, level_learned_atKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&level_learned_at, node, "int", "");
		} else {
			
		}
	}
	const gchar *move_learn_methodKey = "move_learn_method";
	node = json_object_get_member(pJsonObject, move_learn_methodKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveLearnMethodSummary")) {
			jsonToValue(&move_learn_method, node, "MoveLearnMethodSummary", "MoveLearnMethodSummary");
		} else {
			
			MoveLearnMethodSummary* obj = static_cast<MoveLearnMethodSummary*> (&move_learn_method);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *version_groupKey = "version_group";
	node = json_object_get_member(pJsonObject, version_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("VersionGroupSummary")) {
			jsonToValue(&version_group, node, "VersionGroupSummary", "VersionGroupSummary");
		} else {
			
			VersionGroupSummary* obj = static_cast<VersionGroupSummary*> (&version_group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *orderKey = "order";
	node = json_object_get_member(pJsonObject, orderKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&order, node, "int", "");
		} else {
			
		}
	}
}

PokemonMoveVersionGroup::PokemonMoveVersionGroup(char* json)
{
	this->fromJson(json);
}

char*
PokemonMoveVersionGroup::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getLevelLearnedAt();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *level_learned_atKey = "level_learned_at";
	json_object_set_member(pJsonObject, level_learned_atKey, node);
	if (isprimitive("MoveLearnMethodSummary")) {
		MoveLearnMethodSummary obj = getMoveLearnMethod();
		node = converttoJson(&obj, "MoveLearnMethodSummary", "");
	}
	else {
		
		MoveLearnMethodSummary obj = static_cast<MoveLearnMethodSummary> (getMoveLearnMethod());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *move_learn_methodKey = "move_learn_method";
	json_object_set_member(pJsonObject, move_learn_methodKey, node);
	if (isprimitive("VersionGroupSummary")) {
		VersionGroupSummary obj = getVersionGroup();
		node = converttoJson(&obj, "VersionGroupSummary", "");
	}
	else {
		
		VersionGroupSummary obj = static_cast<VersionGroupSummary> (getVersionGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *version_groupKey = "version_group";
	json_object_set_member(pJsonObject, version_groupKey, node);
	if (isprimitive("int")) {
		int obj = getOrder();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *orderKey = "order";
	json_object_set_member(pJsonObject, orderKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PokemonMoveVersionGroup::getLevelLearnedAt()
{
	return level_learned_at;
}

void
PokemonMoveVersionGroup::setLevelLearnedAt(int  level_learned_at)
{
	this->level_learned_at = level_learned_at;
}

MoveLearnMethodSummary
PokemonMoveVersionGroup::getMoveLearnMethod()
{
	return move_learn_method;
}

void
PokemonMoveVersionGroup::setMoveLearnMethod(MoveLearnMethodSummary  move_learn_method)
{
	this->move_learn_method = move_learn_method;
}

VersionGroupSummary
PokemonMoveVersionGroup::getVersionGroup()
{
	return version_group;
}

void
PokemonMoveVersionGroup::setVersionGroup(VersionGroupSummary  version_group)
{
	this->version_group = version_group;
}

int
PokemonMoveVersionGroup::getOrder()
{
	return order;
}

void
PokemonMoveVersionGroup::setOrder(int  order)
{
	this->order = order;
}


