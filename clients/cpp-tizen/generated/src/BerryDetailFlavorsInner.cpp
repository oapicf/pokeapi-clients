#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BerryDetail_flavors_inner.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BerryDetail_flavors_inner::BerryDetail_flavors_inner()
{
	//__init();
}

BerryDetail_flavors_inner::~BerryDetail_flavors_inner()
{
	//__cleanup();
}

void
BerryDetail_flavors_inner::__init()
{
	//potency = int(0);
	//flavor = new BerryDetail_flavors_inner_flavor();
}

void
BerryDetail_flavors_inner::__cleanup()
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
BerryDetail_flavors_inner::fromJson(char* jsonStr)
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
	

		if (isprimitive("BerryDetail_flavors_inner_flavor")) {
			jsonToValue(&flavor, node, "BerryDetail_flavors_inner_flavor", "BerryDetail_flavors_inner_flavor");
		} else {
			
			BerryDetail_flavors_inner_flavor* obj = static_cast<BerryDetail_flavors_inner_flavor*> (&flavor);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

BerryDetail_flavors_inner::BerryDetail_flavors_inner(char* json)
{
	this->fromJson(json);
}

char*
BerryDetail_flavors_inner::toJson()
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
	if (isprimitive("BerryDetail_flavors_inner_flavor")) {
		BerryDetail_flavors_inner_flavor obj = getFlavor();
		node = converttoJson(&obj, "BerryDetail_flavors_inner_flavor", "");
	}
	else {
		
		BerryDetail_flavors_inner_flavor obj = static_cast<BerryDetail_flavors_inner_flavor> (getFlavor());
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
BerryDetail_flavors_inner::getPotency()
{
	return potency;
}

void
BerryDetail_flavors_inner::setPotency(int  potency)
{
	this->potency = potency;
}

BerryDetail_flavors_inner_flavor
BerryDetail_flavors_inner::getFlavor()
{
	return flavor;
}

void
BerryDetail_flavors_inner::setFlavor(BerryDetail_flavors_inner_flavor  flavor)
{
	this->flavor = flavor;
}


