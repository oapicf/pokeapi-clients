#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "BerryFlavorDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

BerryFlavorDetail::BerryFlavorDetail()
{
	//__init();
}

BerryFlavorDetail::~BerryFlavorDetail()
{
	//__cleanup();
}

void
BerryFlavorDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> berries;
	//contest_type = new ContestTypeSummary();
	//new std::list()std::list> names;
}

void
BerryFlavorDetail::__cleanup()
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
	//if(contest_type != NULL) {
	//
	//delete contest_type;
	//contest_type = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
BerryFlavorDetail::fromJson(char* jsonStr)
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
			list<BerryFlavorDetail_berries_inner> new_list;
			BerryFlavorDetail_berries_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BerryFlavorDetail_berries_inner")) {
					jsonToValue(&inst, temp_json, "BerryFlavorDetail_berries_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			berries = new_list;
		}
		
	}
	const gchar *contest_typeKey = "contest_type";
	node = json_object_get_member(pJsonObject, contest_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("ContestTypeSummary")) {
			jsonToValue(&contest_type, node, "ContestTypeSummary", "ContestTypeSummary");
		} else {
			
			ContestTypeSummary* obj = static_cast<ContestTypeSummary*> (&contest_type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<BerryFlavorName> new_list;
			BerryFlavorName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("BerryFlavorName")) {
					jsonToValue(&inst, temp_json, "BerryFlavorName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

BerryFlavorDetail::BerryFlavorDetail(char* json)
{
	this->fromJson(json);
}

char*
BerryFlavorDetail::toJson()
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
	if (isprimitive("BerryFlavorDetail_berries_inner")) {
		list<BerryFlavorDetail_berries_inner> new_list = static_cast<list <BerryFlavorDetail_berries_inner> > (getBerries());
		node = converttoJson(&new_list, "BerryFlavorDetail_berries_inner", "array");
	} else {
		node = json_node_alloc();
		list<BerryFlavorDetail_berries_inner> new_list = static_cast<list <BerryFlavorDetail_berries_inner> > (getBerries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BerryFlavorDetail_berries_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BerryFlavorDetail_berries_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *berriesKey = "berries";
	json_object_set_member(pJsonObject, berriesKey, node);
	if (isprimitive("ContestTypeSummary")) {
		ContestTypeSummary obj = getContestType();
		node = converttoJson(&obj, "ContestTypeSummary", "");
	}
	else {
		
		ContestTypeSummary obj = static_cast<ContestTypeSummary> (getContestType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contest_typeKey = "contest_type";
	json_object_set_member(pJsonObject, contest_typeKey, node);
	if (isprimitive("BerryFlavorName")) {
		list<BerryFlavorName> new_list = static_cast<list <BerryFlavorName> > (getNames());
		node = converttoJson(&new_list, "BerryFlavorName", "array");
	} else {
		node = json_node_alloc();
		list<BerryFlavorName> new_list = static_cast<list <BerryFlavorName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<BerryFlavorName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			BerryFlavorName obj = *it;
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
BerryFlavorDetail::getId()
{
	return id;
}

void
BerryFlavorDetail::setId(int  id)
{
	this->id = id;
}

std::string
BerryFlavorDetail::getName()
{
	return name;
}

void
BerryFlavorDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<BerryFlavorDetail_berries_inner>
BerryFlavorDetail::getBerries()
{
	return berries;
}

void
BerryFlavorDetail::setBerries(std::list <BerryFlavorDetail_berries_inner> berries)
{
	this->berries = berries;
}

ContestTypeSummary
BerryFlavorDetail::getContestType()
{
	return contest_type;
}

void
BerryFlavorDetail::setContestType(ContestTypeSummary  contest_type)
{
	this->contest_type = contest_type;
}

std::list<BerryFlavorName>
BerryFlavorDetail::getNames()
{
	return names;
}

void
BerryFlavorDetail::setNames(std::list <BerryFlavorName> names)
{
	this->names = names;
}


