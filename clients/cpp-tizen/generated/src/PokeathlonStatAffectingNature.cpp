#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokeathlonStatAffectingNature.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokeathlonStatAffectingNature::PokeathlonStatAffectingNature()
{
	//__init();
}

PokeathlonStatAffectingNature::~PokeathlonStatAffectingNature()
{
	//__cleanup();
}

void
PokeathlonStatAffectingNature::__init()
{
	//max_change = int(0);
	//nature = null;
}

void
PokeathlonStatAffectingNature::__cleanup()
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
PokeathlonStatAffectingNature::fromJson(char* jsonStr)
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
	

		if (isprimitive("NatureSummary")) {
			jsonToValue(&nature, node, "NatureSummary", "NatureSummary");
		} else {
			
			NatureSummary* obj = static_cast<NatureSummary*> (&nature);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokeathlonStatAffectingNature::PokeathlonStatAffectingNature(char* json)
{
	this->fromJson(json);
}

char*
PokeathlonStatAffectingNature::toJson()
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
	if (isprimitive("NatureSummary")) {
		NatureSummary obj = getNature();
		node = converttoJson(&obj, "NatureSummary", "");
	}
	else {
		
		NatureSummary obj = static_cast<NatureSummary> (getNature());
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
PokeathlonStatAffectingNature::getMaxChange()
{
	return max_change;
}

void
PokeathlonStatAffectingNature::setMaxChange(int  max_change)
{
	this->max_change = max_change;
}

NatureSummary
PokeathlonStatAffectingNature::getNature()
{
	return nature;
}

void
PokeathlonStatAffectingNature::setNature(NatureSummary  nature)
{
	this->nature = nature;
}


