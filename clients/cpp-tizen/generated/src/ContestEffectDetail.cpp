#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ContestEffectDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ContestEffectDetail::ContestEffectDetail()
{
	//__init();
}

ContestEffectDetail::~ContestEffectDetail()
{
	//__cleanup();
}

void
ContestEffectDetail::__init()
{
	//id = int(0);
	//appeal = int(0);
	//jam = int(0);
	//new std::list()std::list> effect_entries;
	//new std::list()std::list> flavor_text_entries;
}

void
ContestEffectDetail::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(appeal != NULL) {
	//
	//delete appeal;
	//appeal = NULL;
	//}
	//if(jam != NULL) {
	//
	//delete jam;
	//jam = NULL;
	//}
	//if(effect_entries != NULL) {
	//effect_entries.RemoveAll(true);
	//delete effect_entries;
	//effect_entries = NULL;
	//}
	//if(flavor_text_entries != NULL) {
	//flavor_text_entries.RemoveAll(true);
	//delete flavor_text_entries;
	//flavor_text_entries = NULL;
	//}
	//
}

void
ContestEffectDetail::fromJson(char* jsonStr)
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
	const gchar *appealKey = "appeal";
	node = json_object_get_member(pJsonObject, appealKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&appeal, node, "int", "");
		} else {
			
		}
	}
	const gchar *jamKey = "jam";
	node = json_object_get_member(pJsonObject, jamKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&jam, node, "int", "");
		} else {
			
		}
	}
	const gchar *effect_entriesKey = "effect_entries";
	node = json_object_get_member(pJsonObject, effect_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ContestEffectEffectText> new_list;
			ContestEffectEffectText inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ContestEffectEffectText")) {
					jsonToValue(&inst, temp_json, "ContestEffectEffectText", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			effect_entries = new_list;
		}
		
	}
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	node = json_object_get_member(pJsonObject, flavor_text_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ContestEffectFlavorText> new_list;
			ContestEffectFlavorText inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ContestEffectFlavorText")) {
					jsonToValue(&inst, temp_json, "ContestEffectFlavorText", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			flavor_text_entries = new_list;
		}
		
	}
}

ContestEffectDetail::ContestEffectDetail(char* json)
{
	this->fromJson(json);
}

char*
ContestEffectDetail::toJson()
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
	if (isprimitive("int")) {
		int obj = getAppeal();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *appealKey = "appeal";
	json_object_set_member(pJsonObject, appealKey, node);
	if (isprimitive("int")) {
		int obj = getJam();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *jamKey = "jam";
	json_object_set_member(pJsonObject, jamKey, node);
	if (isprimitive("ContestEffectEffectText")) {
		list<ContestEffectEffectText> new_list = static_cast<list <ContestEffectEffectText> > (getEffectEntries());
		node = converttoJson(&new_list, "ContestEffectEffectText", "array");
	} else {
		node = json_node_alloc();
		list<ContestEffectEffectText> new_list = static_cast<list <ContestEffectEffectText> > (getEffectEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ContestEffectEffectText>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ContestEffectEffectText obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *effect_entriesKey = "effect_entries";
	json_object_set_member(pJsonObject, effect_entriesKey, node);
	if (isprimitive("ContestEffectFlavorText")) {
		list<ContestEffectFlavorText> new_list = static_cast<list <ContestEffectFlavorText> > (getFlavorTextEntries());
		node = converttoJson(&new_list, "ContestEffectFlavorText", "array");
	} else {
		node = json_node_alloc();
		list<ContestEffectFlavorText> new_list = static_cast<list <ContestEffectFlavorText> > (getFlavorTextEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ContestEffectFlavorText>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ContestEffectFlavorText obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	json_object_set_member(pJsonObject, flavor_text_entriesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
ContestEffectDetail::getId()
{
	return id;
}

void
ContestEffectDetail::setId(int  id)
{
	this->id = id;
}

int
ContestEffectDetail::getAppeal()
{
	return appeal;
}

void
ContestEffectDetail::setAppeal(int  appeal)
{
	this->appeal = appeal;
}

int
ContestEffectDetail::getJam()
{
	return jam;
}

void
ContestEffectDetail::setJam(int  jam)
{
	this->jam = jam;
}

std::list<ContestEffectEffectText>
ContestEffectDetail::getEffectEntries()
{
	return effect_entries;
}

void
ContestEffectDetail::setEffectEntries(std::list <ContestEffectEffectText> effect_entries)
{
	this->effect_entries = effect_entries;
}

std::list<ContestEffectFlavorText>
ContestEffectDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
ContestEffectDetail::setFlavorTextEntries(std::list <ContestEffectFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}


