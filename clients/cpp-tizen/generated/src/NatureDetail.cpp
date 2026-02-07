#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "NatureDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

NatureDetail::NatureDetail()
{
	//__init();
}

NatureDetail::~NatureDetail()
{
	//__cleanup();
}

void
NatureDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//decreased_stat = new StatSummary();
	//increased_stat = new StatSummary();
	//likes_flavor = new BerryFlavorSummary();
	//hates_flavor = new BerryFlavorSummary();
	//new std::list()std::list> berries;
	//new std::list()std::list> pokeathlon_stat_changes;
	//new std::list()std::list> move_battle_style_preferences;
	//new std::list()std::list> names;
}

void
NatureDetail::__cleanup()
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
	//if(decreased_stat != NULL) {
	//
	//delete decreased_stat;
	//decreased_stat = NULL;
	//}
	//if(increased_stat != NULL) {
	//
	//delete increased_stat;
	//increased_stat = NULL;
	//}
	//if(likes_flavor != NULL) {
	//
	//delete likes_flavor;
	//likes_flavor = NULL;
	//}
	//if(hates_flavor != NULL) {
	//
	//delete hates_flavor;
	//hates_flavor = NULL;
	//}
	//if(berries != NULL) {
	//berries.RemoveAll(true);
	//delete berries;
	//berries = NULL;
	//}
	//if(pokeathlon_stat_changes != NULL) {
	//pokeathlon_stat_changes.RemoveAll(true);
	//delete pokeathlon_stat_changes;
	//pokeathlon_stat_changes = NULL;
	//}
	//if(move_battle_style_preferences != NULL) {
	//move_battle_style_preferences.RemoveAll(true);
	//delete move_battle_style_preferences;
	//move_battle_style_preferences = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//
}

void
NatureDetail::fromJson(char* jsonStr)
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
	const gchar *decreased_statKey = "decreased_stat";
	node = json_object_get_member(pJsonObject, decreased_statKey);
	if (node !=NULL) {
	

		if (isprimitive("StatSummary")) {
			jsonToValue(&decreased_stat, node, "StatSummary", "StatSummary");
		} else {
			
			StatSummary* obj = static_cast<StatSummary*> (&decreased_stat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *increased_statKey = "increased_stat";
	node = json_object_get_member(pJsonObject, increased_statKey);
	if (node !=NULL) {
	

		if (isprimitive("StatSummary")) {
			jsonToValue(&increased_stat, node, "StatSummary", "StatSummary");
		} else {
			
			StatSummary* obj = static_cast<StatSummary*> (&increased_stat);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *likes_flavorKey = "likes_flavor";
	node = json_object_get_member(pJsonObject, likes_flavorKey);
	if (node !=NULL) {
	

		if (isprimitive("BerryFlavorSummary")) {
			jsonToValue(&likes_flavor, node, "BerryFlavorSummary", "BerryFlavorSummary");
		} else {
			
			BerryFlavorSummary* obj = static_cast<BerryFlavorSummary*> (&likes_flavor);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *hates_flavorKey = "hates_flavor";
	node = json_object_get_member(pJsonObject, hates_flavorKey);
	if (node !=NULL) {
	

		if (isprimitive("BerryFlavorSummary")) {
			jsonToValue(&hates_flavor, node, "BerryFlavorSummary", "BerryFlavorSummary");
		} else {
			
			BerryFlavorSummary* obj = static_cast<BerryFlavorSummary*> (&hates_flavor);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *pokeathlon_stat_changesKey = "pokeathlon_stat_changes";
	node = json_object_get_member(pJsonObject, pokeathlon_stat_changesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<NatureDetail_pokeathlon_stat_changes_inner> new_list;
			NatureDetail_pokeathlon_stat_changes_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("NatureDetail_pokeathlon_stat_changes_inner")) {
					jsonToValue(&inst, temp_json, "NatureDetail_pokeathlon_stat_changes_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pokeathlon_stat_changes = new_list;
		}
		
	}
	const gchar *move_battle_style_preferencesKey = "move_battle_style_preferences";
	node = json_object_get_member(pJsonObject, move_battle_style_preferencesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<NatureBattleStylePreference> new_list;
			NatureBattleStylePreference inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("NatureBattleStylePreference")) {
					jsonToValue(&inst, temp_json, "NatureBattleStylePreference", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			move_battle_style_preferences = new_list;
		}
		
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<NatureName> new_list;
			NatureName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("NatureName")) {
					jsonToValue(&inst, temp_json, "NatureName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
}

NatureDetail::NatureDetail(char* json)
{
	this->fromJson(json);
}

char*
NatureDetail::toJson()
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
	if (isprimitive("StatSummary")) {
		StatSummary obj = getDecreasedStat();
		node = converttoJson(&obj, "StatSummary", "");
	}
	else {
		
		StatSummary obj = static_cast<StatSummary> (getDecreasedStat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *decreased_statKey = "decreased_stat";
	json_object_set_member(pJsonObject, decreased_statKey, node);
	if (isprimitive("StatSummary")) {
		StatSummary obj = getIncreasedStat();
		node = converttoJson(&obj, "StatSummary", "");
	}
	else {
		
		StatSummary obj = static_cast<StatSummary> (getIncreasedStat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *increased_statKey = "increased_stat";
	json_object_set_member(pJsonObject, increased_statKey, node);
	if (isprimitive("BerryFlavorSummary")) {
		BerryFlavorSummary obj = getLikesFlavor();
		node = converttoJson(&obj, "BerryFlavorSummary", "");
	}
	else {
		
		BerryFlavorSummary obj = static_cast<BerryFlavorSummary> (getLikesFlavor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *likes_flavorKey = "likes_flavor";
	json_object_set_member(pJsonObject, likes_flavorKey, node);
	if (isprimitive("BerryFlavorSummary")) {
		BerryFlavorSummary obj = getHatesFlavor();
		node = converttoJson(&obj, "BerryFlavorSummary", "");
	}
	else {
		
		BerryFlavorSummary obj = static_cast<BerryFlavorSummary> (getHatesFlavor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *hates_flavorKey = "hates_flavor";
	json_object_set_member(pJsonObject, hates_flavorKey, node);
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
	if (isprimitive("NatureDetail_pokeathlon_stat_changes_inner")) {
		list<NatureDetail_pokeathlon_stat_changes_inner> new_list = static_cast<list <NatureDetail_pokeathlon_stat_changes_inner> > (getPokeathlonStatChanges());
		node = converttoJson(&new_list, "NatureDetail_pokeathlon_stat_changes_inner", "array");
	} else {
		node = json_node_alloc();
		list<NatureDetail_pokeathlon_stat_changes_inner> new_list = static_cast<list <NatureDetail_pokeathlon_stat_changes_inner> > (getPokeathlonStatChanges());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<NatureDetail_pokeathlon_stat_changes_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			NatureDetail_pokeathlon_stat_changes_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pokeathlon_stat_changesKey = "pokeathlon_stat_changes";
	json_object_set_member(pJsonObject, pokeathlon_stat_changesKey, node);
	if (isprimitive("NatureBattleStylePreference")) {
		list<NatureBattleStylePreference> new_list = static_cast<list <NatureBattleStylePreference> > (getMoveBattleStylePreferences());
		node = converttoJson(&new_list, "NatureBattleStylePreference", "array");
	} else {
		node = json_node_alloc();
		list<NatureBattleStylePreference> new_list = static_cast<list <NatureBattleStylePreference> > (getMoveBattleStylePreferences());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<NatureBattleStylePreference>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			NatureBattleStylePreference obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *move_battle_style_preferencesKey = "move_battle_style_preferences";
	json_object_set_member(pJsonObject, move_battle_style_preferencesKey, node);
	if (isprimitive("NatureName")) {
		list<NatureName> new_list = static_cast<list <NatureName> > (getNames());
		node = converttoJson(&new_list, "NatureName", "array");
	} else {
		node = json_node_alloc();
		list<NatureName> new_list = static_cast<list <NatureName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<NatureName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			NatureName obj = *it;
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
NatureDetail::getId()
{
	return id;
}

void
NatureDetail::setId(int  id)
{
	this->id = id;
}

std::string
NatureDetail::getName()
{
	return name;
}

void
NatureDetail::setName(std::string  name)
{
	this->name = name;
}

StatSummary
NatureDetail::getDecreasedStat()
{
	return decreased_stat;
}

void
NatureDetail::setDecreasedStat(StatSummary  decreased_stat)
{
	this->decreased_stat = decreased_stat;
}

StatSummary
NatureDetail::getIncreasedStat()
{
	return increased_stat;
}

void
NatureDetail::setIncreasedStat(StatSummary  increased_stat)
{
	this->increased_stat = increased_stat;
}

BerryFlavorSummary
NatureDetail::getLikesFlavor()
{
	return likes_flavor;
}

void
NatureDetail::setLikesFlavor(BerryFlavorSummary  likes_flavor)
{
	this->likes_flavor = likes_flavor;
}

BerryFlavorSummary
NatureDetail::getHatesFlavor()
{
	return hates_flavor;
}

void
NatureDetail::setHatesFlavor(BerryFlavorSummary  hates_flavor)
{
	this->hates_flavor = hates_flavor;
}

std::list<BerrySummary>
NatureDetail::getBerries()
{
	return berries;
}

void
NatureDetail::setBerries(std::list <BerrySummary> berries)
{
	this->berries = berries;
}

std::list<NatureDetail_pokeathlon_stat_changes_inner>
NatureDetail::getPokeathlonStatChanges()
{
	return pokeathlon_stat_changes;
}

void
NatureDetail::setPokeathlonStatChanges(std::list <NatureDetail_pokeathlon_stat_changes_inner> pokeathlon_stat_changes)
{
	this->pokeathlon_stat_changes = pokeathlon_stat_changes;
}

std::list<NatureBattleStylePreference>
NatureDetail::getMoveBattleStylePreferences()
{
	return move_battle_style_preferences;
}

void
NatureDetail::setMoveBattleStylePreferences(std::list <NatureBattleStylePreference> move_battle_style_preferences)
{
	this->move_battle_style_preferences = move_battle_style_preferences;
}

std::list<NatureName>
NatureDetail::getNames()
{
	return names;
}

void
NatureDetail::setNames(std::list <NatureName> names)
{
	this->names = names;
}


