#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BerryFlavorMap.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BerryFlavorMap::BerryFlavorMap()
{
	//__init();
}

BerryFlavorMap::~BerryFlavorMap()
{
	//__cleanup();
}

void
BerryFlavorMap::__init()
{
	//potency = int(0);
	//flavor = null;
}

void
BerryFlavorMap::__cleanup()
{
	//if(potency != NULL) {
	//
	//delete potency;
	//potency = NULL;
	//}
	//if(flavor != NULL) {
	//
	//delete flavor;
	//flavor = NULL;
	//}
	//
}

void
BerryFlavorMap::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *potencyKey = "potency";
	node = json_object_get_member(pJsonObject, potencyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&potency, node, "int", "");
		} else {
			
		}
	}
	const gchar *flavorKey = "flavor";
	node = json_object_get_member(pJsonObject, flavorKey);
	if (node !=NULL) {
	

		if (isprimitive("BerryFlavorSummary")) {
			jsonToValue(&flavor, node, "BerryFlavorSummary", "BerryFlavorSummary");
		} else {
			
			BerryFlavorSummary* obj = static_cast<BerryFlavorSummary*> (&flavor);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BerryFlavorMap::BerryFlavorMap(char* json)
{
	this->fromJson(json);
}

char*
BerryFlavorMap::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getPotency();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *potencyKey = "potency";
	json_object_set_member(pJsonObject, potencyKey, node);
	if (isprimitive("BerryFlavorSummary")) {
		BerryFlavorSummary obj = getFlavor();
		node = converttoJson(&obj, "BerryFlavorSummary", "");
	}
	else {
		
		BerryFlavorSummary obj = static_cast<BerryFlavorSummary> (getFlavor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *flavorKey = "flavor";
	json_object_set_member(pJsonObject, flavorKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
BerryFlavorMap::getPotency()
{
	return potency;
}

void
BerryFlavorMap::setPotency(int  potency)
{
	this->potency = potency;
}

BerryFlavorSummary
BerryFlavorMap::getFlavor()
{
	return flavor;
}

void
BerryFlavorMap::setFlavor(BerryFlavorSummary  flavor)
{
	this->flavor = flavor;
}


