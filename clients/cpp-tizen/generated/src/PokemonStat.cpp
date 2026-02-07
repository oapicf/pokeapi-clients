#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonStat.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonStat::PokemonStat()
{
	//__init();
}

PokemonStat::~PokemonStat()
{
	//__cleanup();
}

void
PokemonStat::__init()
{
	//base_stat = int(0);
	//effort = int(0);
	//stat = new StatSummary();
}

void
PokemonStat::__cleanup()
{
	//if(base_stat != NULL) {
	//
	//delete base_stat;
	//base_stat = NULL;
	//}
	//if(effort != NULL) {
	//
	//delete effort;
	//effort = NULL;
	//}
	//if(stat != NULL) {
	//
	//delete stat;
	//stat = NULL;
	//}
	//
}

void
PokemonStat::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *base_statKey = "base_stat";
	node = json_object_get_member(pJsonObject, base_statKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&base_stat, node, "int", "");
		} else {
			
		}
	}
	const gchar *effortKey = "effort";
	node = json_object_get_member(pJsonObject, effortKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&effort, node, "int", "");
		} else {
			
		}
	}
	const gchar *statKey = "stat";
	node = json_object_get_member(pJsonObject, statKey);
	if (node !=NULL) {
	

		if (isprimitive("StatSummary")) {
			jsonToValue(&stat, node, "StatSummary", "StatSummary");
		} else {
			
			StatSummary* obj = static_cast<StatSummary*> (&stat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonStat::PokemonStat(char* json)
{
	this->fromJson(json);
}

char*
PokemonStat::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getBaseStat();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *base_statKey = "base_stat";
	json_object_set_member(pJsonObject, base_statKey, node);
	if (isprimitive("int")) {
		int obj = getEffort();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *effortKey = "effort";
	json_object_set_member(pJsonObject, effortKey, node);
	if (isprimitive("StatSummary")) {
		StatSummary obj = getStat();
		node = converttoJson(&obj, "StatSummary", "");
	}
	else {
		
		StatSummary obj = static_cast<StatSummary> (getStat());
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
PokemonStat::getBaseStat()
{
	return base_stat;
}

void
PokemonStat::setBaseStat(int  base_stat)
{
	this->base_stat = base_stat;
}

int
PokemonStat::getEffort()
{
	return effort;
}

void
PokemonStat::setEffort(int  effort)
{
	this->effort = effort;
}

StatSummary
PokemonStat::getStat()
{
	return stat;
}

void
PokemonStat::setStat(StatSummary  stat)
{
	this->stat = stat;
}


