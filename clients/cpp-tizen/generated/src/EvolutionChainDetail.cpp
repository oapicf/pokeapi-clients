#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EvolutionChainDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EvolutionChainDetail::EvolutionChainDetail()
{
	//__init();
}

EvolutionChainDetail::~EvolutionChainDetail()
{
	//__cleanup();
}

void
EvolutionChainDetail::__init()
{
	//id = int(0);
	//baby_trigger_item = new ItemSummary();
	//chain = new EvolutionChainDetail_chain();
}

void
EvolutionChainDetail::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(baby_trigger_item != NULL) {
	//
	//delete baby_trigger_item;
	//baby_trigger_item = NULL;
	//}
	//if(chain != NULL) {
	//
	//delete chain;
	//chain = NULL;
	//}
	//
}

void
EvolutionChainDetail::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
	const gchar *baby_trigger_itemKey = "baby_trigger_item";
	node = json_object_get_member(pJsonObject, baby_trigger_itemKey);
	if (node !=NULL) {
	

		if (isprimitive("ItemSummary")) {
			jsonToValue(&baby_trigger_item, node, "ItemSummary", "ItemSummary");
		} else {
			
			ItemSummary* obj = static_cast<ItemSummary*> (&baby_trigger_item);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *chainKey = "chain";
	node = json_object_get_member(pJsonObject, chainKey);
	if (node !=NULL) {
	

		if (isprimitive("EvolutionChainDetail_chain")) {
			jsonToValue(&chain, node, "EvolutionChainDetail_chain", "EvolutionChainDetail_chain");
		} else {
			
			EvolutionChainDetail_chain* obj = static_cast<EvolutionChainDetail_chain*> (&chain);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

EvolutionChainDetail::EvolutionChainDetail(char* json)
{
	this->fromJson(json);
}

char*
EvolutionChainDetail::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("ItemSummary")) {
		ItemSummary obj = getBabyTriggerItem();
		node = converttoJson(&obj, "ItemSummary", "");
	}
	else {
		
		ItemSummary obj = static_cast<ItemSummary> (getBabyTriggerItem());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *baby_trigger_itemKey = "baby_trigger_item";
	json_object_set_member(pJsonObject, baby_trigger_itemKey, node);
	if (isprimitive("EvolutionChainDetail_chain")) {
		EvolutionChainDetail_chain obj = getChain();
		node = converttoJson(&obj, "EvolutionChainDetail_chain", "");
	}
	else {
		
		EvolutionChainDetail_chain obj = static_cast<EvolutionChainDetail_chain> (getChain());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *chainKey = "chain";
	json_object_set_member(pJsonObject, chainKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
EvolutionChainDetail::getId()
{
	return id;
}

void
EvolutionChainDetail::setId(int  id)
{
	this->id = id;
}

ItemSummary
EvolutionChainDetail::getBabyTriggerItem()
{
	return baby_trigger_item;
}

void
EvolutionChainDetail::setBabyTriggerItem(ItemSummary  baby_trigger_item)
{
	this->baby_trigger_item = baby_trigger_item;
}

EvolutionChainDetail_chain
EvolutionChainDetail::getChain()
{
	return chain;
}

void
EvolutionChainDetail::setChain(EvolutionChainDetail_chain  chain)
{
	this->chain = chain;
}


