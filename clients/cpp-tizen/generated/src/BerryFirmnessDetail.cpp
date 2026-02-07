#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BerryFirmnessDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BerryFirmnessDetail::BerryFirmnessDetail()
{
	//__init();
}

BerryFirmnessDetail::~BerryFirmnessDetail()
{
	//__cleanup();
}

void
BerryFirmnessDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> berries;
	//new std::list()std::list> names;
}

void
BerryFirmnessDetail::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(berries != NULL) {
	//berries.RemoveAll(true);
	//delete berries;
	//berries = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
BerryFirmnessDetail::fromJson(char* jsonStr)
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
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *berriesKey = "berries";
	node = json_object_get_member(pJsonObject, berriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BerrySummary> new_list;
			BerrySummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BerrySummary")) {
					jsonToValue(&inst, temp_json, "BerrySummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			berries = new_list;
		}
		
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BerryFirmnessName> new_list;
			BerryFirmnessName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BerryFirmnessName")) {
					jsonToValue(&inst, temp_json, "BerryFirmnessName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

BerryFirmnessDetail::BerryFirmnessDetail(char* json)
{
	this->fromJson(json);
}

char*
BerryFirmnessDetail::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("BerrySummary")) {
		list<BerrySummary> new_list = static_cast<list <BerrySummary> > (getBerries());
		node = converttoJson(&new_list, "BerrySummary", "array");
	} else {
		node = json_node_alloc();
		list<BerrySummary> new_list = static_cast<list <BerrySummary> > (getBerries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BerrySummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BerrySummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *berriesKey = "berries";
	json_object_set_member(pJsonObject, berriesKey, node);
	if (isprimitive("BerryFirmnessName")) {
		list<BerryFirmnessName> new_list = static_cast<list <BerryFirmnessName> > (getNames());
		node = converttoJson(&new_list, "BerryFirmnessName", "array");
	} else {
		node = json_node_alloc();
		list<BerryFirmnessName> new_list = static_cast<list <BerryFirmnessName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BerryFirmnessName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BerryFirmnessName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
BerryFirmnessDetail::getId()
{
	return id;
}

void
BerryFirmnessDetail::setId(int  id)
{
	this->id = id;
}

std::string
BerryFirmnessDetail::getName()
{
	return name;
}

void
BerryFirmnessDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<BerrySummary>
BerryFirmnessDetail::getBerries()
{
	return berries;
}

void
BerryFirmnessDetail::setBerries(std::list <BerrySummary> berries)
{
	this->berries = berries;
}

std::list<BerryFirmnessName>
BerryFirmnessDetail::getNames()
{
	return names;
}

void
BerryFirmnessDetail::setNames(std::list <BerryFirmnessName> names)
{
	this->names = names;
}


