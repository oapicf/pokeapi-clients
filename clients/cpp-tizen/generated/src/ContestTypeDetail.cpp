#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ContestTypeDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ContestTypeDetail::ContestTypeDetail()
{
	//__init();
}

ContestTypeDetail::~ContestTypeDetail()
{
	//__cleanup();
}

void
ContestTypeDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//berry_flavor = null;
	//new std::list()std::list> names;
}

void
ContestTypeDetail::__cleanup()
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
	//if(berry_flavor != NULL) {
	//
	//delete berry_flavor;
	//berry_flavor = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
ContestTypeDetail::fromJson(char* jsonStr)
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
	const gchar *berry_flavorKey = "berry_flavor";
	node = json_object_get_member(pJsonObject, berry_flavorKey);
	if (node !=NULL) {
	

		if (isprimitive("BerryFlavorSummary")) {
			jsonToValue(&berry_flavor, node, "BerryFlavorSummary", "BerryFlavorSummary");
		} else {
			
			BerryFlavorSummary* obj = static_cast<BerryFlavorSummary*> (&berry_flavor);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<ContestTypeName> new_list;
			ContestTypeName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("ContestTypeName")) {
					jsonToValue(&inst, temp_json, "ContestTypeName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

ContestTypeDetail::ContestTypeDetail(char* json)
{
	this->fromJson(json);
}

char*
ContestTypeDetail::toJson()
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
	if (isprimitive("BerryFlavorSummary")) {
		BerryFlavorSummary obj = getBerryFlavor();
		node = converttoJson(&obj, "BerryFlavorSummary", "");
	}
	else {
		
		BerryFlavorSummary obj = static_cast<BerryFlavorSummary> (getBerryFlavor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *berry_flavorKey = "berry_flavor";
	json_object_set_member(pJsonObject, berry_flavorKey, node);
	if (isprimitive("ContestTypeName")) {
		list<ContestTypeName> new_list = static_cast<list <ContestTypeName> > (getNames());
		node = converttoJson(&new_list, "ContestTypeName", "array");
	} else {
		node = json_node_alloc();
		list<ContestTypeName> new_list = static_cast<list <ContestTypeName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<ContestTypeName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			ContestTypeName obj = *it;
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
ContestTypeDetail::getId()
{
	return id;
}

void
ContestTypeDetail::setId(int  id)
{
	this->id = id;
}

std::string
ContestTypeDetail::getName()
{
	return name;
}

void
ContestTypeDetail::setName(std::string  name)
{
	this->name = name;
}

BerryFlavorSummary
ContestTypeDetail::getBerryFlavor()
{
	return berry_flavor;
}

void
ContestTypeDetail::setBerryFlavor(BerryFlavorSummary  berry_flavor)
{
	this->berry_flavor = berry_flavor;
}

std::list<ContestTypeName>
ContestTypeDetail::getNames()
{
	return names;
}

void
ContestTypeDetail::setNames(std::list <ContestTypeName> names)
{
	this->names = names;
}


