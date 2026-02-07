#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokeathlonStatDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokeathlonStatDetail::PokeathlonStatDetail()
{
	//__init();
}

PokeathlonStatDetail::~PokeathlonStatDetail()
{
	//__cleanup();
}

void
PokeathlonStatDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//affecting_natures = new PokeathlonStatDetail_affecting_natures();
	//new std::list()std::list> names;
}

void
PokeathlonStatDetail::__cleanup()
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
	//if(affecting_natures != NULL) {
	//
	//delete affecting_natures;
	//affecting_natures = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
PokeathlonStatDetail::fromJson(char* jsonStr)
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
	const gchar *affecting_naturesKey = "affecting_natures";
	node = json_object_get_member(pJsonObject, affecting_naturesKey);
	if (node !=NULL) {
	

		if (isprimitive("PokeathlonStatDetail_affecting_natures")) {
			jsonToValue(&affecting_natures, node, "PokeathlonStatDetail_affecting_natures", "PokeathlonStatDetail_affecting_natures");
		} else {
			
			PokeathlonStatDetail_affecting_natures* obj = static_cast<PokeathlonStatDetail_affecting_natures*> (&affecting_natures);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokeathlonStatName> new_list;
			PokeathlonStatName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokeathlonStatName")) {
					jsonToValue(&inst, temp_json, "PokeathlonStatName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

PokeathlonStatDetail::PokeathlonStatDetail(char* json)
{
	this->fromJson(json);
}

char*
PokeathlonStatDetail::toJson()
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
	if (isprimitive("PokeathlonStatDetail_affecting_natures")) {
		PokeathlonStatDetail_affecting_natures obj = getAffectingNatures();
		node = converttoJson(&obj, "PokeathlonStatDetail_affecting_natures", "");
	}
	else {
		
		PokeathlonStatDetail_affecting_natures obj = static_cast<PokeathlonStatDetail_affecting_natures> (getAffectingNatures());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *affecting_naturesKey = "affecting_natures";
	json_object_set_member(pJsonObject, affecting_naturesKey, node);
	if (isprimitive("PokeathlonStatName")) {
		list<PokeathlonStatName> new_list = static_cast<list <PokeathlonStatName> > (getNames());
		node = converttoJson(&new_list, "PokeathlonStatName", "array");
	} else {
		node = json_node_alloc();
		list<PokeathlonStatName> new_list = static_cast<list <PokeathlonStatName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokeathlonStatName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokeathlonStatName obj = *it;
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
PokeathlonStatDetail::getId()
{
	return id;
}

void
PokeathlonStatDetail::setId(int  id)
{
	this->id = id;
}

std::string
PokeathlonStatDetail::getName()
{
	return name;
}

void
PokeathlonStatDetail::setName(std::string  name)
{
	this->name = name;
}

PokeathlonStatDetail_affecting_natures
PokeathlonStatDetail::getAffectingNatures()
{
	return affecting_natures;
}

void
PokeathlonStatDetail::setAffectingNatures(PokeathlonStatDetail_affecting_natures  affecting_natures)
{
	this->affecting_natures = affecting_natures;
}

std::list<PokeathlonStatName>
PokeathlonStatDetail::getNames()
{
	return names;
}

void
PokeathlonStatDetail::setNames(std::list <PokeathlonStatName> names)
{
	this->names = names;
}


