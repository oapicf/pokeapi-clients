#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "VersionGroupDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

VersionGroupDetail::VersionGroupDetail()
{
	//__init();
}

VersionGroupDetail::~VersionGroupDetail()
{
	//__cleanup();
}

void
VersionGroupDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//order = int(0);
	//generation = new GenerationSummary();
	//new std::list()std::list> move_learn_methods;
	//new std::list()std::list> pokedexes;
	//new std::list()std::list> regions;
	//new std::list()std::list> versions;
}

void
VersionGroupDetail::__cleanup()
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
	//if(order != NULL) {
	//
	//delete order;
	//order = NULL;
	//}
	//if(generation != NULL) {
	//
	//delete generation;
	//generation = NULL;
	//}
	//if(move_learn_methods != NULL) {
	//move_learn_methods.RemoveAll(true);
	//delete move_learn_methods;
	//move_learn_methods = NULL;
	//}
	//if(pokedexes != NULL) {
	//pokedexes.RemoveAll(true);
	//delete pokedexes;
	//pokedexes = NULL;
	//}
	//if(regions != NULL) {
	//regions.RemoveAll(true);
	//delete regions;
	//regions = NULL;
	//}
	//if(versions != NULL) {
	//versions.RemoveAll(true);
	//delete versions;
	//versions = NULL;
	//}
	//
}

void
VersionGroupDetail::fromJson(char* jsonStr)
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
	const gchar *orderKey = "order";
	node = json_object_get_member(pJsonObject, orderKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&order, node, "int", "");
		} else {
			
		}
	}
	const gchar *generationKey = "generation";
	node = json_object_get_member(pJsonObject, generationKey);
	if (node !=NULL) {
	

		if (isprimitive("GenerationSummary")) {
			jsonToValue(&generation, node, "GenerationSummary", "GenerationSummary");
		} else {
			
			GenerationSummary* obj = static_cast<GenerationSummary*> (&generation);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *move_learn_methodsKey = "move_learn_methods";
	node = json_object_get_member(pJsonObject, move_learn_methodsKey);
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
			move_learn_methods = new_list;
		}
		
	}
	const gchar *pokedexesKey = "pokedexes";
	node = json_object_get_member(pJsonObject, pokedexesKey);
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
			pokedexes = new_list;
		}
		
	}
	const gchar *regionsKey = "regions";
	node = json_object_get_member(pJsonObject, regionsKey);
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
			regions = new_list;
		}
		
	}
	const gchar *versionsKey = "versions";
	node = json_object_get_member(pJsonObject, versionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<VersionSummary> new_list;
			VersionSummary inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("VersionSummary")) {
					jsonToValue(&inst, temp_json, "VersionSummary", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			versions = new_list;
		}
		
	}
}

VersionGroupDetail::VersionGroupDetail(char* json)
{
	this->fromJson(json);
}

char*
VersionGroupDetail::toJson()
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
	if (isprimitive("int")) {
		int obj = getOrder();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *orderKey = "order";
	json_object_set_member(pJsonObject, orderKey, node);
	if (isprimitive("GenerationSummary")) {
		GenerationSummary obj = getGeneration();
		node = converttoJson(&obj, "GenerationSummary", "");
	}
	else {
		
		GenerationSummary obj = static_cast<GenerationSummary> (getGeneration());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *generationKey = "generation";
	json_object_set_member(pJsonObject, generationKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getMoveLearnMethods());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getMoveLearnMethods());
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


	
	const gchar *move_learn_methodsKey = "move_learn_methods";
	json_object_set_member(pJsonObject, move_learn_methodsKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getPokedexes());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getPokedexes());
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


	
	const gchar *pokedexesKey = "pokedexes";
	json_object_set_member(pJsonObject, pokedexesKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getRegions());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getRegions());
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


	
	const gchar *regionsKey = "regions";
	json_object_set_member(pJsonObject, regionsKey, node);
	if (isprimitive("VersionSummary")) {
		list<VersionSummary> new_list = static_cast<list <VersionSummary> > (getVersions());
		node = converttoJson(&new_list, "VersionSummary", "array");
	} else {
		node = json_node_alloc();
		list<VersionSummary> new_list = static_cast<list <VersionSummary> > (getVersions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<VersionSummary>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			VersionSummary obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *versionsKey = "versions";
	json_object_set_member(pJsonObject, versionsKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
VersionGroupDetail::getId()
{
	return id;
}

void
VersionGroupDetail::setId(int  id)
{
	this->id = id;
}

std::string
VersionGroupDetail::getName()
{
	return name;
}

void
VersionGroupDetail::setName(std::string  name)
{
	this->name = name;
}

int
VersionGroupDetail::getOrder()
{
	return order;
}

void
VersionGroupDetail::setOrder(int  order)
{
	this->order = order;
}

GenerationSummary
VersionGroupDetail::getGeneration()
{
	return generation;
}

void
VersionGroupDetail::setGeneration(GenerationSummary  generation)
{
	this->generation = generation;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
VersionGroupDetail::getMoveLearnMethods()
{
	return move_learn_methods;
}

void
VersionGroupDetail::setMoveLearnMethods(std::list <AbilityDetail_pokemon_inner_pokemon> move_learn_methods)
{
	this->move_learn_methods = move_learn_methods;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
VersionGroupDetail::getPokedexes()
{
	return pokedexes;
}

void
VersionGroupDetail::setPokedexes(std::list <AbilityDetail_pokemon_inner_pokemon> pokedexes)
{
	this->pokedexes = pokedexes;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
VersionGroupDetail::getRegions()
{
	return regions;
}

void
VersionGroupDetail::setRegions(std::list <AbilityDetail_pokemon_inner_pokemon> regions)
{
	this->regions = regions;
}

std::list<VersionSummary>
VersionGroupDetail::getVersions()
{
	return versions;
}

void
VersionGroupDetail::setVersions(std::list <VersionSummary> versions)
{
	this->versions = versions;
}


