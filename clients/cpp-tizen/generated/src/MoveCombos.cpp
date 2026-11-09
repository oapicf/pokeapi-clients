#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveCombos.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveCombos::MoveCombos()
{
	//__init();
}

MoveCombos::~MoveCombos()
{
	//__cleanup();
}

void
MoveCombos::__init()
{
	//normal = null;
	//super = null;
}

void
MoveCombos::__cleanup()
{
	//if(normal != NULL) {
	//
	//delete normal;
	//normal = NULL;
	//}
	//if(super != NULL) {
	//
	//delete super;
	//super = NULL;
	//}
	//
}

void
MoveCombos::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *normalKey = "normal";
	node = json_object_get_member(pJsonObject, normalKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveComboUsage")) {
			jsonToValue(&normal, node, "MoveComboUsage", "MoveComboUsage");
		} else {
			
			MoveComboUsage* obj = static_cast<MoveComboUsage*> (&normal);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *superKey = "super";
	node = json_object_get_member(pJsonObject, superKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveComboUsage")) {
			jsonToValue(&super, node, "MoveComboUsage", "MoveComboUsage");
		} else {
			
			MoveComboUsage* obj = static_cast<MoveComboUsage*> (&super);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

MoveCombos::MoveCombos(char* json)
{
	this->fromJson(json);
}

char*
MoveCombos::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("MoveComboUsage")) {
		MoveComboUsage obj = getNormal();
		node = converttoJson(&obj, "MoveComboUsage", "");
	}
	else {
		
		MoveComboUsage obj = static_cast<MoveComboUsage> (getNormal());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *normalKey = "normal";
	json_object_set_member(pJsonObject, normalKey, node);
	if (isprimitive("MoveComboUsage")) {
		MoveComboUsage obj = getSuper();
		node = converttoJson(&obj, "MoveComboUsage", "");
	}
	else {
		
		MoveComboUsage obj = static_cast<MoveComboUsage> (getSuper());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *superKey = "super";
	json_object_set_member(pJsonObject, superKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

MoveComboUsage
MoveCombos::getNormal()
{
	return normal;
}

void
MoveCombos::setNormal(MoveComboUsage  normal)
{
	this->normal = normal;
}

MoveComboUsage
MoveCombos::getSuper()
{
	return super;
}

void
MoveCombos::setSuper(MoveComboUsage  super)
{
	this->super = super;
}


