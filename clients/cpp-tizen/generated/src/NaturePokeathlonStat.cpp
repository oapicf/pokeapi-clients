#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "NaturePokeathlonStat.h"

using namespace std;
using namespace Tizen::ArtikCloud;

NaturePokeathlonStat::NaturePokeathlonStat()
{
	//__init();
}

NaturePokeathlonStat::~NaturePokeathlonStat()
{
	//__cleanup();
}

void
NaturePokeathlonStat::__init()
{
	//max_change = int(0);
	//pokeathlon_stat = null;
}

void
NaturePokeathlonStat::__cleanup()
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
NaturePokeathlonStat::fromJson(char* jsonStr)
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
	

		if (isprimitive("PokeathlonStatSummary")) {
			jsonToValue(&pokeathlon_stat, node, "PokeathlonStatSummary", "PokeathlonStatSummary");
		} else {
			
			PokeathlonStatSummary* obj = static_cast<PokeathlonStatSummary*> (&pokeathlon_stat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

NaturePokeathlonStat::NaturePokeathlonStat(char* json)
{
	this->fromJson(json);
}

char*
NaturePokeathlonStat::toJson()
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
	if (isprimitive("PokeathlonStatSummary")) {
		PokeathlonStatSummary obj = getPokeathlonStat();
		node = converttoJson(&obj, "PokeathlonStatSummary", "");
	}
	else {
		
		PokeathlonStatSummary obj = static_cast<PokeathlonStatSummary> (getPokeathlonStat());
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
NaturePokeathlonStat::getMaxChange()
{
	return max_change;
}

void
NaturePokeathlonStat::setMaxChange(int  max_change)
{
	this->max_change = max_change;
}

PokeathlonStatSummary
NaturePokeathlonStat::getPokeathlonStat()
{
	return pokeathlon_stat;
}

void
NaturePokeathlonStat::setPokeathlonStat(PokeathlonStatSummary  pokeathlon_stat)
{
	this->pokeathlon_stat = pokeathlon_stat;
}


