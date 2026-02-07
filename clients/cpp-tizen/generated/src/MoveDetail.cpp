#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "MoveDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

MoveDetail::MoveDetail()
{
	//__init();
}

MoveDetail::~MoveDetail()
{
	//__cleanup();
}

void
MoveDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//accuracy = int(0);
	//effect_chance = int(0);
	//pp = int(0);
	//priority = int(0);
	//power = int(0);
	//contest_combos = new MoveDetail_contest_combos();
	//contest_type = new ContestTypeSummary();
	//contest_effect = new ContestEffectSummary();
	//damage_class = new MoveDamageClassSummary();
	//new std::list()std::list> effect_entries;
	//new std::list()std::list> effect_changes;
	//generation = new GenerationSummary();
	//meta = null;
	//new std::list()std::list> names;
	//new std::list()std::list> past_values;
	//new std::list()std::list> stat_changes;
	//super_contest_effect = new SuperContestEffectSummary();
	//target = new MoveTargetSummary();
	//type = new TypeSummary();
	//new std::list()std::list> machines;
	//new std::list()std::list> flavor_text_entries;
	//new std::list()std::list> learned_by_pokemon;
}

void
MoveDetail::__cleanup()
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
	//if(accuracy != NULL) {
	//
	//delete accuracy;
	//accuracy = NULL;
	//}
	//if(effect_chance != NULL) {
	//
	//delete effect_chance;
	//effect_chance = NULL;
	//}
	//if(pp != NULL) {
	//
	//delete pp;
	//pp = NULL;
	//}
	//if(priority != NULL) {
	//
	//delete priority;
	//priority = NULL;
	//}
	//if(power != NULL) {
	//
	//delete power;
	//power = NULL;
	//}
	//if(contest_combos != NULL) {
	//
	//delete contest_combos;
	//contest_combos = NULL;
	//}
	//if(contest_type != NULL) {
	//
	//delete contest_type;
	//contest_type = NULL;
	//}
	//if(contest_effect != NULL) {
	//
	//delete contest_effect;
	//contest_effect = NULL;
	//}
	//if(damage_class != NULL) {
	//
	//delete damage_class;
	//damage_class = NULL;
	//}
	//if(effect_entries != NULL) {
	//effect_entries.RemoveAll(true);
	//delete effect_entries;
	//effect_entries = NULL;
	//}
	//if(effect_changes != NULL) {
	//effect_changes.RemoveAll(true);
	//delete effect_changes;
	//effect_changes = NULL;
	//}
	//if(generation != NULL) {
	//
	//delete generation;
	//generation = NULL;
	//}
	//if(meta != NULL) {
	//
	//delete meta;
	//meta = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//if(past_values != NULL) {
	//past_values.RemoveAll(true);
	//delete past_values;
	//past_values = NULL;
	//}
	//if(stat_changes != NULL) {
	//stat_changes.RemoveAll(true);
	//delete stat_changes;
	//stat_changes = NULL;
	//}
	//if(super_contest_effect != NULL) {
	//
	//delete super_contest_effect;
	//super_contest_effect = NULL;
	//}
	//if(target != NULL) {
	//
	//delete target;
	//target = NULL;
	//}
	//if(type != NULL) {
	//
	//delete type;
	//type = NULL;
	//}
	//if(machines != NULL) {
	//machines.RemoveAll(true);
	//delete machines;
	//machines = NULL;
	//}
	//if(flavor_text_entries != NULL) {
	//flavor_text_entries.RemoveAll(true);
	//delete flavor_text_entries;
	//flavor_text_entries = NULL;
	//}
	//if(learned_by_pokemon != NULL) {
	//learned_by_pokemon.RemoveAll(true);
	//delete learned_by_pokemon;
	//learned_by_pokemon = NULL;
	//}
	//
}

void
MoveDetail::fromJson(char* jsonStr)
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
	const gchar *accuracyKey = "accuracy";
	node = json_object_get_member(pJsonObject, accuracyKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&accuracy, node, "int", "");
		} else {
			
		}
	}
	const gchar *effect_chanceKey = "effect_chance";
	node = json_object_get_member(pJsonObject, effect_chanceKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&effect_chance, node, "int", "");
		} else {
			
		}
	}
	const gchar *ppKey = "pp";
	node = json_object_get_member(pJsonObject, ppKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&pp, node, "int", "");
		} else {
			
		}
	}
	const gchar *priorityKey = "priority";
	node = json_object_get_member(pJsonObject, priorityKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&priority, node, "int", "");
		} else {
			
		}
	}
	const gchar *powerKey = "power";
	node = json_object_get_member(pJsonObject, powerKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&power, node, "int", "");
		} else {
			
		}
	}
	const gchar *contest_combosKey = "contest_combos";
	node = json_object_get_member(pJsonObject, contest_combosKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveDetail_contest_combos")) {
			jsonToValue(&contest_combos, node, "MoveDetail_contest_combos", "MoveDetail_contest_combos");
		} else {
			
			MoveDetail_contest_combos* obj = static_cast<MoveDetail_contest_combos*> (&contest_combos);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *contest_effectKey = "contest_effect";
	node = json_object_get_member(pJsonObject, contest_effectKey);
	if (node !=NULL) {
	

		if (isprimitive("ContestEffectSummary")) {
			jsonToValue(&contest_effect, node, "ContestEffectSummary", "ContestEffectSummary");
		} else {
			
			ContestEffectSummary* obj = static_cast<ContestEffectSummary*> (&contest_effect);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *damage_classKey = "damage_class";
	node = json_object_get_member(pJsonObject, damage_classKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveDamageClassSummary")) {
			jsonToValue(&damage_class, node, "MoveDamageClassSummary", "MoveDamageClassSummary");
		} else {
			
			MoveDamageClassSummary* obj = static_cast<MoveDamageClassSummary*> (&damage_class);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *effect_entriesKey = "effect_entries";
	node = json_object_get_member(pJsonObject, effect_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveChange_effect_entries_inner> new_list;
			MoveChange_effect_entries_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveChange_effect_entries_inner")) {
					jsonToValue(&inst, temp_json, "MoveChange_effect_entries_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			effect_entries = new_list;
		}
		
	}
	const gchar *effect_changesKey = "effect_changes";
	node = json_object_get_member(pJsonObject, effect_changesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveDetail_effect_changes_inner> new_list;
			MoveDetail_effect_changes_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveDetail_effect_changes_inner")) {
					jsonToValue(&inst, temp_json, "MoveDetail_effect_changes_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			effect_changes = new_list;
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
	const gchar *metaKey = "meta";
	node = json_object_get_member(pJsonObject, metaKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveMeta")) {
			jsonToValue(&meta, node, "MoveMeta", "MoveMeta");
		} else {
			
			MoveMeta* obj = static_cast<MoveMeta*> (&meta);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveName> new_list;
			MoveName inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveName")) {
					jsonToValue(&inst, temp_json, "MoveName", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *past_valuesKey = "past_values";
	node = json_object_get_member(pJsonObject, past_valuesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveChange> new_list;
			MoveChange inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveChange")) {
					jsonToValue(&inst, temp_json, "MoveChange", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			past_values = new_list;
		}
		
	}
	const gchar *stat_changesKey = "stat_changes";
	node = json_object_get_member(pJsonObject, stat_changesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveDetail_stat_changes_inner> new_list;
			MoveDetail_stat_changes_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveDetail_stat_changes_inner")) {
					jsonToValue(&inst, temp_json, "MoveDetail_stat_changes_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			stat_changes = new_list;
		}
		
	}
	const gchar *super_contest_effectKey = "super_contest_effect";
	node = json_object_get_member(pJsonObject, super_contest_effectKey);
	if (node !=NULL) {
	

		if (isprimitive("SuperContestEffectSummary")) {
			jsonToValue(&super_contest_effect, node, "SuperContestEffectSummary", "SuperContestEffectSummary");
		} else {
			
			SuperContestEffectSummary* obj = static_cast<SuperContestEffectSummary*> (&super_contest_effect);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *targetKey = "target";
	node = json_object_get_member(pJsonObject, targetKey);
	if (node !=NULL) {
	

		if (isprimitive("MoveTargetSummary")) {
			jsonToValue(&target, node, "MoveTargetSummary", "MoveTargetSummary");
		} else {
			
			MoveTargetSummary* obj = static_cast<MoveTargetSummary*> (&target);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *typeKey = "type";
	node = json_object_get_member(pJsonObject, typeKey);
	if (node !=NULL) {
	

		if (isprimitive("TypeSummary")) {
			jsonToValue(&type, node, "TypeSummary", "TypeSummary");
		} else {
			
			TypeSummary* obj = static_cast<TypeSummary*> (&type);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *machinesKey = "machines";
	node = json_object_get_member(pJsonObject, machinesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveDetail_machines_inner> new_list;
			MoveDetail_machines_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveDetail_machines_inner")) {
					jsonToValue(&inst, temp_json, "MoveDetail_machines_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			machines = new_list;
		}
		
	}
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	node = json_object_get_member(pJsonObject, flavor_text_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<MoveFlavorText> new_list;
			MoveFlavorText inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("MoveFlavorText")) {
					jsonToValue(&inst, temp_json, "MoveFlavorText", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			flavor_text_entries = new_list;
		}
		
	}
	const gchar *learned_by_pokemonKey = "learned_by_pokemon";
	node = json_object_get_member(pJsonObject, learned_by_pokemonKey);
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
			learned_by_pokemon = new_list;
		}
		
	}
}

MoveDetail::MoveDetail(char* json)
{
	this->fromJson(json);
}

char*
MoveDetail::toJson()
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
		int obj = getAccuracy();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *accuracyKey = "accuracy";
	json_object_set_member(pJsonObject, accuracyKey, node);
	if (isprimitive("int")) {
		int obj = getEffectChance();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *effect_chanceKey = "effect_chance";
	json_object_set_member(pJsonObject, effect_chanceKey, node);
	if (isprimitive("int")) {
		int obj = getPp();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *ppKey = "pp";
	json_object_set_member(pJsonObject, ppKey, node);
	if (isprimitive("int")) {
		int obj = getPriority();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *priorityKey = "priority";
	json_object_set_member(pJsonObject, priorityKey, node);
	if (isprimitive("int")) {
		int obj = getPower();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *powerKey = "power";
	json_object_set_member(pJsonObject, powerKey, node);
	if (isprimitive("MoveDetail_contest_combos")) {
		MoveDetail_contest_combos obj = getContestCombos();
		node = converttoJson(&obj, "MoveDetail_contest_combos", "");
	}
	else {
		
		MoveDetail_contest_combos obj = static_cast<MoveDetail_contest_combos> (getContestCombos());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contest_combosKey = "contest_combos";
	json_object_set_member(pJsonObject, contest_combosKey, node);
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
	if (isprimitive("ContestEffectSummary")) {
		ContestEffectSummary obj = getContestEffect();
		node = converttoJson(&obj, "ContestEffectSummary", "");
	}
	else {
		
		ContestEffectSummary obj = static_cast<ContestEffectSummary> (getContestEffect());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *contest_effectKey = "contest_effect";
	json_object_set_member(pJsonObject, contest_effectKey, node);
	if (isprimitive("MoveDamageClassSummary")) {
		MoveDamageClassSummary obj = getDamageClass();
		node = converttoJson(&obj, "MoveDamageClassSummary", "");
	}
	else {
		
		MoveDamageClassSummary obj = static_cast<MoveDamageClassSummary> (getDamageClass());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *damage_classKey = "damage_class";
	json_object_set_member(pJsonObject, damage_classKey, node);
	if (isprimitive("MoveChange_effect_entries_inner")) {
		list<MoveChange_effect_entries_inner> new_list = static_cast<list <MoveChange_effect_entries_inner> > (getEffectEntries());
		node = converttoJson(&new_list, "MoveChange_effect_entries_inner", "array");
	} else {
		node = json_node_alloc();
		list<MoveChange_effect_entries_inner> new_list = static_cast<list <MoveChange_effect_entries_inner> > (getEffectEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveChange_effect_entries_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveChange_effect_entries_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *effect_entriesKey = "effect_entries";
	json_object_set_member(pJsonObject, effect_entriesKey, node);
	if (isprimitive("MoveDetail_effect_changes_inner")) {
		list<MoveDetail_effect_changes_inner> new_list = static_cast<list <MoveDetail_effect_changes_inner> > (getEffectChanges());
		node = converttoJson(&new_list, "MoveDetail_effect_changes_inner", "array");
	} else {
		node = json_node_alloc();
		list<MoveDetail_effect_changes_inner> new_list = static_cast<list <MoveDetail_effect_changes_inner> > (getEffectChanges());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveDetail_effect_changes_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveDetail_effect_changes_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *effect_changesKey = "effect_changes";
	json_object_set_member(pJsonObject, effect_changesKey, node);
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
	if (isprimitive("MoveMeta")) {
		MoveMeta obj = getMeta();
		node = converttoJson(&obj, "MoveMeta", "");
	}
	else {
		
		MoveMeta obj = static_cast<MoveMeta> (getMeta());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *metaKey = "meta";
	json_object_set_member(pJsonObject, metaKey, node);
	if (isprimitive("MoveName")) {
		list<MoveName> new_list = static_cast<list <MoveName> > (getNames());
		node = converttoJson(&new_list, "MoveName", "array");
	} else {
		node = json_node_alloc();
		list<MoveName> new_list = static_cast<list <MoveName> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveName>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveName obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("MoveChange")) {
		list<MoveChange> new_list = static_cast<list <MoveChange> > (getPastValues());
		node = converttoJson(&new_list, "MoveChange", "array");
	} else {
		node = json_node_alloc();
		list<MoveChange> new_list = static_cast<list <MoveChange> > (getPastValues());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveChange>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveChange obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *past_valuesKey = "past_values";
	json_object_set_member(pJsonObject, past_valuesKey, node);
	if (isprimitive("MoveDetail_stat_changes_inner")) {
		list<MoveDetail_stat_changes_inner> new_list = static_cast<list <MoveDetail_stat_changes_inner> > (getStatChanges());
		node = converttoJson(&new_list, "MoveDetail_stat_changes_inner", "array");
	} else {
		node = json_node_alloc();
		list<MoveDetail_stat_changes_inner> new_list = static_cast<list <MoveDetail_stat_changes_inner> > (getStatChanges());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveDetail_stat_changes_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveDetail_stat_changes_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *stat_changesKey = "stat_changes";
	json_object_set_member(pJsonObject, stat_changesKey, node);
	if (isprimitive("SuperContestEffectSummary")) {
		SuperContestEffectSummary obj = getSuperContestEffect();
		node = converttoJson(&obj, "SuperContestEffectSummary", "");
	}
	else {
		
		SuperContestEffectSummary obj = static_cast<SuperContestEffectSummary> (getSuperContestEffect());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *super_contest_effectKey = "super_contest_effect";
	json_object_set_member(pJsonObject, super_contest_effectKey, node);
	if (isprimitive("MoveTargetSummary")) {
		MoveTargetSummary obj = getTarget();
		node = converttoJson(&obj, "MoveTargetSummary", "");
	}
	else {
		
		MoveTargetSummary obj = static_cast<MoveTargetSummary> (getTarget());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *targetKey = "target";
	json_object_set_member(pJsonObject, targetKey, node);
	if (isprimitive("TypeSummary")) {
		TypeSummary obj = getType();
		node = converttoJson(&obj, "TypeSummary", "");
	}
	else {
		
		TypeSummary obj = static_cast<TypeSummary> (getType());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *typeKey = "type";
	json_object_set_member(pJsonObject, typeKey, node);
	if (isprimitive("MoveDetail_machines_inner")) {
		list<MoveDetail_machines_inner> new_list = static_cast<list <MoveDetail_machines_inner> > (getMachines());
		node = converttoJson(&new_list, "MoveDetail_machines_inner", "array");
	} else {
		node = json_node_alloc();
		list<MoveDetail_machines_inner> new_list = static_cast<list <MoveDetail_machines_inner> > (getMachines());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveDetail_machines_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveDetail_machines_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *machinesKey = "machines";
	json_object_set_member(pJsonObject, machinesKey, node);
	if (isprimitive("MoveFlavorText")) {
		list<MoveFlavorText> new_list = static_cast<list <MoveFlavorText> > (getFlavorTextEntries());
		node = converttoJson(&new_list, "MoveFlavorText", "array");
	} else {
		node = json_node_alloc();
		list<MoveFlavorText> new_list = static_cast<list <MoveFlavorText> > (getFlavorTextEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<MoveFlavorText>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			MoveFlavorText obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	json_object_set_member(pJsonObject, flavor_text_entriesKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getLearnedByPokemon());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getLearnedByPokemon());
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


	
	const gchar *learned_by_pokemonKey = "learned_by_pokemon";
	json_object_set_member(pJsonObject, learned_by_pokemonKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
MoveDetail::getId()
{
	return id;
}

void
MoveDetail::setId(int  id)
{
	this->id = id;
}

std::string
MoveDetail::getName()
{
	return name;
}

void
MoveDetail::setName(std::string  name)
{
	this->name = name;
}

int
MoveDetail::getAccuracy()
{
	return accuracy;
}

void
MoveDetail::setAccuracy(int  accuracy)
{
	this->accuracy = accuracy;
}

int
MoveDetail::getEffectChance()
{
	return effect_chance;
}

void
MoveDetail::setEffectChance(int  effect_chance)
{
	this->effect_chance = effect_chance;
}

int
MoveDetail::getPp()
{
	return pp;
}

void
MoveDetail::setPp(int  pp)
{
	this->pp = pp;
}

int
MoveDetail::getPriority()
{
	return priority;
}

void
MoveDetail::setPriority(int  priority)
{
	this->priority = priority;
}

int
MoveDetail::getPower()
{
	return power;
}

void
MoveDetail::setPower(int  power)
{
	this->power = power;
}

MoveDetail_contest_combos
MoveDetail::getContestCombos()
{
	return contest_combos;
}

void
MoveDetail::setContestCombos(MoveDetail_contest_combos  contest_combos)
{
	this->contest_combos = contest_combos;
}

ContestTypeSummary
MoveDetail::getContestType()
{
	return contest_type;
}

void
MoveDetail::setContestType(ContestTypeSummary  contest_type)
{
	this->contest_type = contest_type;
}

ContestEffectSummary
MoveDetail::getContestEffect()
{
	return contest_effect;
}

void
MoveDetail::setContestEffect(ContestEffectSummary  contest_effect)
{
	this->contest_effect = contest_effect;
}

MoveDamageClassSummary
MoveDetail::getDamageClass()
{
	return damage_class;
}

void
MoveDetail::setDamageClass(MoveDamageClassSummary  damage_class)
{
	this->damage_class = damage_class;
}

std::list<MoveChange_effect_entries_inner>
MoveDetail::getEffectEntries()
{
	return effect_entries;
}

void
MoveDetail::setEffectEntries(std::list <MoveChange_effect_entries_inner> effect_entries)
{
	this->effect_entries = effect_entries;
}

std::list<MoveDetail_effect_changes_inner>
MoveDetail::getEffectChanges()
{
	return effect_changes;
}

void
MoveDetail::setEffectChanges(std::list <MoveDetail_effect_changes_inner> effect_changes)
{
	this->effect_changes = effect_changes;
}

GenerationSummary
MoveDetail::getGeneration()
{
	return generation;
}

void
MoveDetail::setGeneration(GenerationSummary  generation)
{
	this->generation = generation;
}

MoveMeta
MoveDetail::getMeta()
{
	return meta;
}

void
MoveDetail::setMeta(MoveMeta  meta)
{
	this->meta = meta;
}

std::list<MoveName>
MoveDetail::getNames()
{
	return names;
}

void
MoveDetail::setNames(std::list <MoveName> names)
{
	this->names = names;
}

std::list<MoveChange>
MoveDetail::getPastValues()
{
	return past_values;
}

void
MoveDetail::setPastValues(std::list <MoveChange> past_values)
{
	this->past_values = past_values;
}

std::list<MoveDetail_stat_changes_inner>
MoveDetail::getStatChanges()
{
	return stat_changes;
}

void
MoveDetail::setStatChanges(std::list <MoveDetail_stat_changes_inner> stat_changes)
{
	this->stat_changes = stat_changes;
}

SuperContestEffectSummary
MoveDetail::getSuperContestEffect()
{
	return super_contest_effect;
}

void
MoveDetail::setSuperContestEffect(SuperContestEffectSummary  super_contest_effect)
{
	this->super_contest_effect = super_contest_effect;
}

MoveTargetSummary
MoveDetail::getTarget()
{
	return target;
}

void
MoveDetail::setTarget(MoveTargetSummary  target)
{
	this->target = target;
}

TypeSummary
MoveDetail::getType()
{
	return type;
}

void
MoveDetail::setType(TypeSummary  type)
{
	this->type = type;
}

std::list<MoveDetail_machines_inner>
MoveDetail::getMachines()
{
	return machines;
}

void
MoveDetail::setMachines(std::list <MoveDetail_machines_inner> machines)
{
	this->machines = machines;
}

std::list<MoveFlavorText>
MoveDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
MoveDetail::setFlavorTextEntries(std::list <MoveFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
MoveDetail::getLearnedByPokemon()
{
	return learned_by_pokemon;
}

void
MoveDetail::setLearnedByPokemon(std::list <AbilityDetail_pokemon_inner_pokemon> learned_by_pokemon)
{
	this->learned_by_pokemon = learned_by_pokemon;
}


