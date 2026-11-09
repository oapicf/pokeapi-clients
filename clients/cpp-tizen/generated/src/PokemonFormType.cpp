#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonFormType.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonFormType::PokemonFormType()
{
	//__init();
}

PokemonFormType::~PokemonFormType()
{
	//__cleanup();
}

void
PokemonFormType::__init()
{
	//slot = int(0);
	//type = null;
}

void
PokemonFormType::__cleanup()
{
	//if(slot != NULL) {
	//
	//delete slot;
	//slot = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//
}

void
PokemonFormType::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *slotKey = "slot";
	node = json_object_get_member(pJsonObject, slotKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&slot, node, "int", "");
		} else {
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("TypeSummary")) {
			jsonToValue(&type, node, "TypeSummary", "TypeSummary");
		} else {
			
			TypeSummary* obj = static_cast<TypeSummary*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PokemonFormType::PokemonFormType(char* json)
{
	this->fromJson(json);
}

char*
PokemonFormType::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getSlot();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *slotKey = "slot";
	json_object_set_member(pJsonObject, slotKey, node);
	if (isprimitive("TypeSummary")) {
		TypeSummary obj = getType();
		node = converttoJson(&obj, "TypeSummary", "");
	}
	else {
		
		TypeSummary obj = static_cast<TypeSummary> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PokemonFormType::getSlot()
{
	return slot;
}

void
PokemonFormType::setSlot(int  slot)
{
	this->slot = slot;
}

TypeSummary
PokemonFormType::getType()
{
	return type;
}

void
PokemonFormType::setType(TypeSummary  type)
{
	this->type = type;
}


