#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveLearnMethodDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveLearnMethodDetail::MoveLearnMethodDetail()
{
	//__init();
}

MoveLearnMethodDetail::~MoveLearnMethodDetail()
{
	//__cleanup();
}

void
MoveLearnMethodDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//new std::list()std::list> names;
	//new std::list()std::list> descriptions;
	//new std::list()std::list> version_groups;
}

void
MoveLearnMethodDetail::__cleanup()
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
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//if(descriptions != NULL) {
	//descriptions.RemoveAll(true);
	//delete descriptions;
	//descriptions = NULL;
	//}
	//if(version_groups != NULL) {
	//version_groups.RemoveAll(true);
	//delete version_groups;
	//version_groups = NULL;
	//}
	//
}

void
MoveLearnMethodDetail::fromJson(char* jsonStr)
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
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveLearnMethodName> new_list;
			MoveLearnMethodName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveLearnMethodName")) {
					jsonToValue(&inst, temp_json, "MoveLearnMethodName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *descriptionsKey = "descriptions";
	node = json_object_get_member(pJsonObject, descriptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveLearnMethodDescription> new_list;
			MoveLearnMethodDescription inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveLearnMethodDescription")) {
					jsonToValue(&inst, temp_json, "MoveLearnMethodDescription", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			descriptions = new_list;
		}
		
	}
	const gchar *version_groupsKey = "version_groups";
	node = json_object_get_member(pJsonObject, version_groupsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<AbilityDetail_pokemon_inner_pokemon> new_list;
			AbilityDetail_pokemon_inner_pokemon inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
					jsonToValue(&inst, temp_json, "AbilityDetail_pokemon_inner_pokemon", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			version_groups = new_list;
		}
		
	}
}

MoveLearnMethodDetail::MoveLearnMethodDetail(char* json)
{
	this->fromJson(json);
}

char*
MoveLearnMethodDetail::toJson()
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
	if (isprimitive("MoveLearnMethodName")) {
		list<MoveLearnMethodName> new_list = static_cast<list <MoveLearnMethodName> > (getNames());
		node = converttoJson(&new_list, "MoveLearnMethodName", "array");
	} else {
		node = json_node_alloc();
		list<MoveLearnMethodName> new_list = static_cast<list <MoveLearnMethodName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveLearnMethodName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveLearnMethodName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("MoveLearnMethodDescription")) {
		list<MoveLearnMethodDescription> new_list = static_cast<list <MoveLearnMethodDescription> > (getDescriptions());
		node = converttoJson(&new_list, "MoveLearnMethodDescription", "array");
	} else {
		node = json_node_alloc();
		list<MoveLearnMethodDescription> new_list = static_cast<list <MoveLearnMethodDescription> > (getDescriptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveLearnMethodDescription>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveLearnMethodDescription obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *descriptionsKey = "descriptions";
	json_object_set_member(pJsonObject, descriptionsKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getVersionGroups());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getVersionGroups());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<AbilityDetail_pokemon_inner_pokemon>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			AbilityDetail_pokemon_inner_pokemon obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *version_groupsKey = "version_groups";
	json_object_set_member(pJsonObject, version_groupsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
MoveLearnMethodDetail::getId()
{
	return id;
}

void
MoveLearnMethodDetail::setId(int  id)
{
	this->id = id;
}

std::string
MoveLearnMethodDetail::getName()
{
	return name;
}

void
MoveLearnMethodDetail::setName(std::string  name)
{
	this->name = name;
}

std::list<MoveLearnMethodName>
MoveLearnMethodDetail::getNames()
{
	return names;
}

void
MoveLearnMethodDetail::setNames(std::list <MoveLearnMethodName> names)
{
	this->names = names;
}

std::list<MoveLearnMethodDescription>
MoveLearnMethodDetail::getDescriptions()
{
	return descriptions;
}

void
MoveLearnMethodDetail::setDescriptions(std::list <MoveLearnMethodDescription> descriptions)
{
	this->descriptions = descriptions;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
MoveLearnMethodDetail::getVersionGroups()
{
	return version_groups;
}

void
MoveLearnMethodDetail::setVersionGroups(std::list <AbilityDetail_pokemon_inner_pokemon> version_groups)
{
	this->version_groups = version_groups;
}


