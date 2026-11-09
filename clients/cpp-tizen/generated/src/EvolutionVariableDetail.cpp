#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "EvolutionVariableDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

EvolutionVariableDetail::EvolutionVariableDetail()
{
	//__init();
}

EvolutionVariableDetail::~EvolutionVariableDetail()
{
	//__cleanup();
}

void
EvolutionVariableDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//symbol = std::string();
	//data_type = std::string();
	//source = std::string();
	//version_group = null;
	//new std::list()std::list> names;
	//new std::list()std::list> descriptions;
}

void
EvolutionVariableDetail::__cleanup()
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
	//if(symbol != NULL) {
	//
	//delete symbol;
	//symbol = NULL;
	//}
	//if(data_type != NULL) {
	//
	//delete data_type;
	//data_type = NULL;
	//}
	//if(source != NULL) {
	//
	//delete source;
	//source = NULL;
	//}
	//if(version_group != NULL) {
	//
	//delete version_group;
	//version_group = NULL;
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
	//
}

void
EvolutionVariableDetail::fromJson(char* jsonStr)
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
	const gchar *symbolKey = "symbol";
	node = json_object_get_member(pJsonObject, symbolKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&symbol, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *data_typeKey = "data_type";
	node = json_object_get_member(pJsonObject, data_typeKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&data_type, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *sourceKey = "source";
	node = json_object_get_member(pJsonObject, sourceKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&source, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *version_groupKey = "version_group";
	node = json_object_get_member(pJsonObject, version_groupKey);
	if (node !=NULL) {
	

		if (isprimitive("VersionGroupSummary")) {
			jsonToValue(&version_group, node, "VersionGroupSummary", "VersionGroupSummary");
		} else {
			
			VersionGroupSummary* obj = static_cast<VersionGroupSummary*> (&version_group);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<EvolutionVariableName> new_list;
			EvolutionVariableName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EvolutionVariableName")) {
					jsonToValue(&inst, temp_json, "EvolutionVariableName", "");
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
			list<EvolutionVariableDescription> new_list;
			EvolutionVariableDescription inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("EvolutionVariableDescription")) {
					jsonToValue(&inst, temp_json, "EvolutionVariableDescription", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			descriptions = new_list;
		}
		
	}
}

EvolutionVariableDetail::EvolutionVariableDetail(char* json)
{
	this->fromJson(json);
}

char*
EvolutionVariableDetail::toJson()
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
	if (isprimitive("std::string")) {
		std::string obj = getSymbol();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *symbolKey = "symbol";
	json_object_set_member(pJsonObject, symbolKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getDataType();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *data_typeKey = "data_type";
	json_object_set_member(pJsonObject, data_typeKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getSource();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *sourceKey = "source";
	json_object_set_member(pJsonObject, sourceKey, node);
	if (isprimitive("VersionGroupSummary")) {
		VersionGroupSummary obj = getVersionGroup();
		node = converttoJson(&obj, "VersionGroupSummary", "");
	}
	else {
		
		VersionGroupSummary obj = static_cast<VersionGroupSummary> (getVersionGroup());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *version_groupKey = "version_group";
	json_object_set_member(pJsonObject, version_groupKey, node);
	if (isprimitive("EvolutionVariableName")) {
		list<EvolutionVariableName> new_list = static_cast<list <EvolutionVariableName> > (getNames());
		node = converttoJson(&new_list, "EvolutionVariableName", "array");
	} else {
		node = json_node_alloc();
		list<EvolutionVariableName> new_list = static_cast<list <EvolutionVariableName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EvolutionVariableName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EvolutionVariableName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("EvolutionVariableDescription")) {
		list<EvolutionVariableDescription> new_list = static_cast<list <EvolutionVariableDescription> > (getDescriptions());
		node = converttoJson(&new_list, "EvolutionVariableDescription", "array");
	} else {
		node = json_node_alloc();
		list<EvolutionVariableDescription> new_list = static_cast<list <EvolutionVariableDescription> > (getDescriptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<EvolutionVariableDescription>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			EvolutionVariableDescription obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *descriptionsKey = "descriptions";
	json_object_set_member(pJsonObject, descriptionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
EvolutionVariableDetail::getId()
{
	return id;
}

void
EvolutionVariableDetail::setId(int  id)
{
	this->id = id;
}

std::string
EvolutionVariableDetail::getName()
{
	return name;
}

void
EvolutionVariableDetail::setName(std::string  name)
{
	this->name = name;
}

std::string
EvolutionVariableDetail::getSymbol()
{
	return symbol;
}

void
EvolutionVariableDetail::setSymbol(std::string  symbol)
{
	this->symbol = symbol;
}

std::string
EvolutionVariableDetail::getDataType()
{
	return data_type;
}

void
EvolutionVariableDetail::setDataType(std::string  data_type)
{
	this->data_type = data_type;
}

std::string
EvolutionVariableDetail::getSource()
{
	return source;
}

void
EvolutionVariableDetail::setSource(std::string  source)
{
	this->source = source;
}

VersionGroupSummary
EvolutionVariableDetail::getVersionGroup()
{
	return version_group;
}

void
EvolutionVariableDetail::setVersionGroup(VersionGroupSummary  version_group)
{
	this->version_group = version_group;
}

std::list<EvolutionVariableName>
EvolutionVariableDetail::getNames()
{
	return names;
}

void
EvolutionVariableDetail::setNames(std::list <EvolutionVariableName> names)
{
	this->names = names;
}

std::list<EvolutionVariableDescription>
EvolutionVariableDetail::getDescriptions()
{
	return descriptions;
}

void
EvolutionVariableDetail::setDescriptions(std::list <EvolutionVariableDescription> descriptions)
{
	this->descriptions = descriptions;
}


