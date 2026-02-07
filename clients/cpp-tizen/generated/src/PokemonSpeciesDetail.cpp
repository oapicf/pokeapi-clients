#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PokemonSpeciesDetail.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PokemonSpeciesDetail::PokemonSpeciesDetail()
{
	//__init();
}

PokemonSpeciesDetail::~PokemonSpeciesDetail()
{
	//__cleanup();
}

void
PokemonSpeciesDetail::__init()
{
	//id = int(0);
	//name = std::string();
	//order = int(0);
	//gender_rate = int(0);
	//capture_rate = int(0);
	//base_happiness = int(0);
	//is_baby = bool(false);
	//is_legendary = bool(false);
	//is_mythical = bool(false);
	//hatch_counter = int(0);
	//has_gender_differences = bool(false);
	//forms_switchable = bool(false);
	//growth_rate = new GrowthRateSummary();
	//new std::list()std::list> pokedex_numbers;
	//new std::list()std::list> egg_groups;
	//color = new PokemonColorSummary();
	//shape = new PokemonShapeSummary();
	//evolves_from_species = new PokemonSpeciesSummary();
	//evolution_chain = new EvolutionChainSummary();
	//habitat = new PokemonHabitatSummary();
	//generation = new GenerationSummary();
	//new std::list()std::list> names;
	//new std::list()std::list> pal_park_encounters;
	//new std::list()std::list> form_descriptions;
	//new std::list()std::list> flavor_text_entries;
	//new std::list()std::list> genera;
	//new std::list()std::list> varieties;
}

void
PokemonSpeciesDetail::__cleanup()
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
	//if(gender_rate != NULL) {
	//
	//delete gender_rate;
	//gender_rate = NULL;
	//}
	//if(capture_rate != NULL) {
	//
	//delete capture_rate;
	//capture_rate = NULL;
	//}
	//if(base_happiness != NULL) {
	//
	//delete base_happiness;
	//base_happiness = NULL;
	//}
	//if(is_baby != NULL) {
	//
	//delete is_baby;
	//is_baby = NULL;
	//}
	//if(is_legendary != NULL) {
	//
	//delete is_legendary;
	//is_legendary = NULL;
	//}
	//if(is_mythical != NULL) {
	//
	//delete is_mythical;
	//is_mythical = NULL;
	//}
	//if(hatch_counter != NULL) {
	//
	//delete hatch_counter;
	//hatch_counter = NULL;
	//}
	//if(has_gender_differences != NULL) {
	//
	//delete has_gender_differences;
	//has_gender_differences = NULL;
	//}
	//if(forms_switchable != NULL) {
	//
	//delete forms_switchable;
	//forms_switchable = NULL;
	//}
	//if(growth_rate != NULL) {
	//
	//delete growth_rate;
	//growth_rate = NULL;
	//}
	//if(pokedex_numbers != NULL) {
	//pokedex_numbers.RemoveAll(true);
	//delete pokedex_numbers;
	//pokedex_numbers = NULL;
	//}
	//if(egg_groups != NULL) {
	//egg_groups.RemoveAll(true);
	//delete egg_groups;
	//egg_groups = NULL;
	//}
	//if(color != NULL) {
	//
	//delete color;
	//color = NULL;
	//}
	//if(shape != NULL) {
	//
	//delete shape;
	//shape = NULL;
	//}
	//if(evolves_from_species != NULL) {
	//
	//delete evolves_from_species;
	//evolves_from_species = NULL;
	//}
	//if(evolution_chain != NULL) {
	//
	//delete evolution_chain;
	//evolution_chain = NULL;
	//}
	//if(habitat != NULL) {
	//
	//delete habitat;
	//habitat = NULL;
	//}
	//if(generation != NULL) {
	//
	//delete generation;
	//generation = NULL;
	//}
	//if(names != NULL) {
	//names.RemoveAll(true);
	//delete names;
	//names = NULL;
	//}
	//if(pal_park_encounters != NULL) {
	//pal_park_encounters.RemoveAll(true);
	//delete pal_park_encounters;
	//pal_park_encounters = NULL;
	//}
	//if(form_descriptions != NULL) {
	//form_descriptions.RemoveAll(true);
	//delete form_descriptions;
	//form_descriptions = NULL;
	//}
	//if(flavor_text_entries != NULL) {
	//flavor_text_entries.RemoveAll(true);
	//delete flavor_text_entries;
	//flavor_text_entries = NULL;
	//}
	//if(genera != NULL) {
	//genera.RemoveAll(true);
	//delete genera;
	//genera = NULL;
	//}
	//if(varieties != NULL) {
	//varieties.RemoveAll(true);
	//delete varieties;
	//varieties = NULL;
	//}
	//
}

void
PokemonSpeciesDetail::fromJson(char* jsonStr)
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
	const gchar *gender_rateKey = "gender_rate";
	node = json_object_get_member(pJsonObject, gender_rateKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&gender_rate, node, "int", "");
		} else {
			
		}
	}
	const gchar *capture_rateKey = "capture_rate";
	node = json_object_get_member(pJsonObject, capture_rateKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&capture_rate, node, "int", "");
		} else {
			
		}
	}
	const gchar *base_happinessKey = "base_happiness";
	node = json_object_get_member(pJsonObject, base_happinessKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&base_happiness, node, "int", "");
		} else {
			
		}
	}
	const gchar *is_babyKey = "is_baby";
	node = json_object_get_member(pJsonObject, is_babyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_baby, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_legendaryKey = "is_legendary";
	node = json_object_get_member(pJsonObject, is_legendaryKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_legendary, node, "bool", "");
		} else {
			
		}
	}
	const gchar *is_mythicalKey = "is_mythical";
	node = json_object_get_member(pJsonObject, is_mythicalKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&is_mythical, node, "bool", "");
		} else {
			
		}
	}
	const gchar *hatch_counterKey = "hatch_counter";
	node = json_object_get_member(pJsonObject, hatch_counterKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&hatch_counter, node, "int", "");
		} else {
			
		}
	}
	const gchar *has_gender_differencesKey = "has_gender_differences";
	node = json_object_get_member(pJsonObject, has_gender_differencesKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&has_gender_differences, node, "bool", "");
		} else {
			
		}
	}
	const gchar *forms_switchableKey = "forms_switchable";
	node = json_object_get_member(pJsonObject, forms_switchableKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&forms_switchable, node, "bool", "");
		} else {
			
		}
	}
	const gchar *growth_rateKey = "growth_rate";
	node = json_object_get_member(pJsonObject, growth_rateKey);
	if (node !=NULL) {
	

		if (isprimitive("GrowthRateSummary")) {
			jsonToValue(&growth_rate, node, "GrowthRateSummary", "GrowthRateSummary");
		} else {
			
			GrowthRateSummary* obj = static_cast<GrowthRateSummary*> (&growth_rate);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *pokedex_numbersKey = "pokedex_numbers";
	node = json_object_get_member(pJsonObject, pokedex_numbersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonDexEntry> new_list;
			PokemonDexEntry inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonDexEntry")) {
					jsonToValue(&inst, temp_json, "PokemonDexEntry", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pokedex_numbers = new_list;
		}
		
	}
	const gchar *egg_groupsKey = "egg_groups";
	node = json_object_get_member(pJsonObject, egg_groupsKey);
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
			egg_groups = new_list;
		}
		
	}
	const gchar *colorKey = "color";
	node = json_object_get_member(pJsonObject, colorKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonColorSummary")) {
			jsonToValue(&color, node, "PokemonColorSummary", "PokemonColorSummary");
		} else {
			
			PokemonColorSummary* obj = static_cast<PokemonColorSummary*> (&color);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *shapeKey = "shape";
	node = json_object_get_member(pJsonObject, shapeKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonShapeSummary")) {
			jsonToValue(&shape, node, "PokemonShapeSummary", "PokemonShapeSummary");
		} else {
			
			PokemonShapeSummary* obj = static_cast<PokemonShapeSummary*> (&shape);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *evolves_from_speciesKey = "evolves_from_species";
	node = json_object_get_member(pJsonObject, evolves_from_speciesKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonSpeciesSummary")) {
			jsonToValue(&evolves_from_species, node, "PokemonSpeciesSummary", "PokemonSpeciesSummary");
		} else {
			
			PokemonSpeciesSummary* obj = static_cast<PokemonSpeciesSummary*> (&evolves_from_species);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *evolution_chainKey = "evolution_chain";
	node = json_object_get_member(pJsonObject, evolution_chainKey);
	if (node !=NULL) {
	

		if (isprimitive("EvolutionChainSummary")) {
			jsonToValue(&evolution_chain, node, "EvolutionChainSummary", "EvolutionChainSummary");
		} else {
			
			EvolutionChainSummary* obj = static_cast<EvolutionChainSummary*> (&evolution_chain);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *habitatKey = "habitat";
	node = json_object_get_member(pJsonObject, habitatKey);
	if (node !=NULL) {
	

		if (isprimitive("PokemonHabitatSummary")) {
			jsonToValue(&habitat, node, "PokemonHabitatSummary", "PokemonHabitatSummary");
		} else {
			
			PokemonHabitatSummary* obj = static_cast<PokemonHabitatSummary*> (&habitat);
			obj->fromJson(json_to_string(node, false));
			
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
	const gchar *namesKey = "names";
	node = json_object_get_member(pJsonObject, namesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonFormDetail_form_names_inner> new_list;
			PokemonFormDetail_form_names_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonFormDetail_form_names_inner")) {
					jsonToValue(&inst, temp_json, "PokemonFormDetail_form_names_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			names = new_list;
		}
		
	}
	const gchar *pal_park_encountersKey = "pal_park_encounters";
	node = json_object_get_member(pJsonObject, pal_park_encountersKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonSpeciesDetail_pal_park_encounters_inner> new_list;
			PokemonSpeciesDetail_pal_park_encounters_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonSpeciesDetail_pal_park_encounters_inner")) {
					jsonToValue(&inst, temp_json, "PokemonSpeciesDetail_pal_park_encounters_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			pal_park_encounters = new_list;
		}
		
	}
	const gchar *form_descriptionsKey = "form_descriptions";
	node = json_object_get_member(pJsonObject, form_descriptionsKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonSpeciesDescription> new_list;
			PokemonSpeciesDescription inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonSpeciesDescription")) {
					jsonToValue(&inst, temp_json, "PokemonSpeciesDescription", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			form_descriptions = new_list;
		}
		
	}
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	node = json_object_get_member(pJsonObject, flavor_text_entriesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonSpeciesFlavorText> new_list;
			PokemonSpeciesFlavorText inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonSpeciesFlavorText")) {
					jsonToValue(&inst, temp_json, "PokemonSpeciesFlavorText", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			flavor_text_entries = new_list;
		}
		
	}
	const gchar *generaKey = "genera";
	node = json_object_get_member(pJsonObject, generaKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonSpeciesDetail_genera_inner> new_list;
			PokemonSpeciesDetail_genera_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonSpeciesDetail_genera_inner")) {
					jsonToValue(&inst, temp_json, "PokemonSpeciesDetail_genera_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			genera = new_list;
		}
		
	}
	const gchar *varietiesKey = "varieties";
	node = json_object_get_member(pJsonObject, varietiesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PokemonSpeciesDetail_varieties_inner> new_list;
			PokemonSpeciesDetail_varieties_inner inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PokemonSpeciesDetail_varieties_inner")) {
					jsonToValue(&inst, temp_json, "PokemonSpeciesDetail_varieties_inner", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			varieties = new_list;
		}
		
	}
}

PokemonSpeciesDetail::PokemonSpeciesDetail(char* json)
{
	this->fromJson(json);
}

char*
PokemonSpeciesDetail::toJson()
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
	if (isprimitive("int")) {
		int obj = getGenderRate();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *gender_rateKey = "gender_rate";
	json_object_set_member(pJsonObject, gender_rateKey, node);
	if (isprimitive("int")) {
		int obj = getCaptureRate();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *capture_rateKey = "capture_rate";
	json_object_set_member(pJsonObject, capture_rateKey, node);
	if (isprimitive("int")) {
		int obj = getBaseHappiness();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *base_happinessKey = "base_happiness";
	json_object_set_member(pJsonObject, base_happinessKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsBaby();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_babyKey = "is_baby";
	json_object_set_member(pJsonObject, is_babyKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsLegendary();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_legendaryKey = "is_legendary";
	json_object_set_member(pJsonObject, is_legendaryKey, node);
	if (isprimitive("bool")) {
		bool obj = getIsMythical();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *is_mythicalKey = "is_mythical";
	json_object_set_member(pJsonObject, is_mythicalKey, node);
	if (isprimitive("int")) {
		int obj = getHatchCounter();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *hatch_counterKey = "hatch_counter";
	json_object_set_member(pJsonObject, hatch_counterKey, node);
	if (isprimitive("bool")) {
		bool obj = getHasGenderDifferences();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *has_gender_differencesKey = "has_gender_differences";
	json_object_set_member(pJsonObject, has_gender_differencesKey, node);
	if (isprimitive("bool")) {
		bool obj = getFormsSwitchable();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *forms_switchableKey = "forms_switchable";
	json_object_set_member(pJsonObject, forms_switchableKey, node);
	if (isprimitive("GrowthRateSummary")) {
		GrowthRateSummary obj = getGrowthRate();
		node = converttoJson(&obj, "GrowthRateSummary", "");
	}
	else {
		
		GrowthRateSummary obj = static_cast<GrowthRateSummary> (getGrowthRate());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *growth_rateKey = "growth_rate";
	json_object_set_member(pJsonObject, growth_rateKey, node);
	if (isprimitive("PokemonDexEntry")) {
		list<PokemonDexEntry> new_list = static_cast<list <PokemonDexEntry> > (getPokedexNumbers());
		node = converttoJson(&new_list, "PokemonDexEntry", "array");
	} else {
		node = json_node_alloc();
		list<PokemonDexEntry> new_list = static_cast<list <PokemonDexEntry> > (getPokedexNumbers());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonDexEntry>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonDexEntry obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pokedex_numbersKey = "pokedex_numbers";
	json_object_set_member(pJsonObject, pokedex_numbersKey, node);
	if (isprimitive("AbilityDetail_pokemon_inner_pokemon")) {
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getEggGroups());
		node = converttoJson(&new_list, "AbilityDetail_pokemon_inner_pokemon", "array");
	} else {
		node = json_node_alloc();
		list<AbilityDetail_pokemon_inner_pokemon> new_list = static_cast<list <AbilityDetail_pokemon_inner_pokemon> > (getEggGroups());
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


	
	const gchar *egg_groupsKey = "egg_groups";
	json_object_set_member(pJsonObject, egg_groupsKey, node);
	if (isprimitive("PokemonColorSummary")) {
		PokemonColorSummary obj = getColor();
		node = converttoJson(&obj, "PokemonColorSummary", "");
	}
	else {
		
		PokemonColorSummary obj = static_cast<PokemonColorSummary> (getColor());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *colorKey = "color";
	json_object_set_member(pJsonObject, colorKey, node);
	if (isprimitive("PokemonShapeSummary")) {
		PokemonShapeSummary obj = getShape();
		node = converttoJson(&obj, "PokemonShapeSummary", "");
	}
	else {
		
		PokemonShapeSummary obj = static_cast<PokemonShapeSummary> (getShape());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *shapeKey = "shape";
	json_object_set_member(pJsonObject, shapeKey, node);
	if (isprimitive("PokemonSpeciesSummary")) {
		PokemonSpeciesSummary obj = getEvolvesFromSpecies();
		node = converttoJson(&obj, "PokemonSpeciesSummary", "");
	}
	else {
		
		PokemonSpeciesSummary obj = static_cast<PokemonSpeciesSummary> (getEvolvesFromSpecies());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *evolves_from_speciesKey = "evolves_from_species";
	json_object_set_member(pJsonObject, evolves_from_speciesKey, node);
	if (isprimitive("EvolutionChainSummary")) {
		EvolutionChainSummary obj = getEvolutionChain();
		node = converttoJson(&obj, "EvolutionChainSummary", "");
	}
	else {
		
		EvolutionChainSummary obj = static_cast<EvolutionChainSummary> (getEvolutionChain());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *evolution_chainKey = "evolution_chain";
	json_object_set_member(pJsonObject, evolution_chainKey, node);
	if (isprimitive("PokemonHabitatSummary")) {
		PokemonHabitatSummary obj = getHabitat();
		node = converttoJson(&obj, "PokemonHabitatSummary", "");
	}
	else {
		
		PokemonHabitatSummary obj = static_cast<PokemonHabitatSummary> (getHabitat());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *habitatKey = "habitat";
	json_object_set_member(pJsonObject, habitatKey, node);
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
	if (isprimitive("PokemonFormDetail_form_names_inner")) {
		list<PokemonFormDetail_form_names_inner> new_list = static_cast<list <PokemonFormDetail_form_names_inner> > (getNames());
		node = converttoJson(&new_list, "PokemonFormDetail_form_names_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonFormDetail_form_names_inner> new_list = static_cast<list <PokemonFormDetail_form_names_inner> > (getNames());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonFormDetail_form_names_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonFormDetail_form_names_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *namesKey = "names";
	json_object_set_member(pJsonObject, namesKey, node);
	if (isprimitive("PokemonSpeciesDetail_pal_park_encounters_inner")) {
		list<PokemonSpeciesDetail_pal_park_encounters_inner> new_list = static_cast<list <PokemonSpeciesDetail_pal_park_encounters_inner> > (getPalParkEncounters());
		node = converttoJson(&new_list, "PokemonSpeciesDetail_pal_park_encounters_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonSpeciesDetail_pal_park_encounters_inner> new_list = static_cast<list <PokemonSpeciesDetail_pal_park_encounters_inner> > (getPalParkEncounters());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonSpeciesDetail_pal_park_encounters_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonSpeciesDetail_pal_park_encounters_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *pal_park_encountersKey = "pal_park_encounters";
	json_object_set_member(pJsonObject, pal_park_encountersKey, node);
	if (isprimitive("PokemonSpeciesDescription")) {
		list<PokemonSpeciesDescription> new_list = static_cast<list <PokemonSpeciesDescription> > (getFormDescriptions());
		node = converttoJson(&new_list, "PokemonSpeciesDescription", "array");
	} else {
		node = json_node_alloc();
		list<PokemonSpeciesDescription> new_list = static_cast<list <PokemonSpeciesDescription> > (getFormDescriptions());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonSpeciesDescription>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonSpeciesDescription obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *form_descriptionsKey = "form_descriptions";
	json_object_set_member(pJsonObject, form_descriptionsKey, node);
	if (isprimitive("PokemonSpeciesFlavorText")) {
		list<PokemonSpeciesFlavorText> new_list = static_cast<list <PokemonSpeciesFlavorText> > (getFlavorTextEntries());
		node = converttoJson(&new_list, "PokemonSpeciesFlavorText", "array");
	} else {
		node = json_node_alloc();
		list<PokemonSpeciesFlavorText> new_list = static_cast<list <PokemonSpeciesFlavorText> > (getFlavorTextEntries());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonSpeciesFlavorText>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonSpeciesFlavorText obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *flavor_text_entriesKey = "flavor_text_entries";
	json_object_set_member(pJsonObject, flavor_text_entriesKey, node);
	if (isprimitive("PokemonSpeciesDetail_genera_inner")) {
		list<PokemonSpeciesDetail_genera_inner> new_list = static_cast<list <PokemonSpeciesDetail_genera_inner> > (getGenera());
		node = converttoJson(&new_list, "PokemonSpeciesDetail_genera_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonSpeciesDetail_genera_inner> new_list = static_cast<list <PokemonSpeciesDetail_genera_inner> > (getGenera());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonSpeciesDetail_genera_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonSpeciesDetail_genera_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *generaKey = "genera";
	json_object_set_member(pJsonObject, generaKey, node);
	if (isprimitive("PokemonSpeciesDetail_varieties_inner")) {
		list<PokemonSpeciesDetail_varieties_inner> new_list = static_cast<list <PokemonSpeciesDetail_varieties_inner> > (getVarieties());
		node = converttoJson(&new_list, "PokemonSpeciesDetail_varieties_inner", "array");
	} else {
		node = json_node_alloc();
		list<PokemonSpeciesDetail_varieties_inner> new_list = static_cast<list <PokemonSpeciesDetail_varieties_inner> > (getVarieties());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PokemonSpeciesDetail_varieties_inner>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PokemonSpeciesDetail_varieties_inner obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *varietiesKey = "varieties";
	json_object_set_member(pJsonObject, varietiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
PokemonSpeciesDetail::getId()
{
	return id;
}

void
PokemonSpeciesDetail::setId(int  id)
{
	this->id = id;
}

std::string
PokemonSpeciesDetail::getName()
{
	return name;
}

void
PokemonSpeciesDetail::setName(std::string  name)
{
	this->name = name;
}

int
PokemonSpeciesDetail::getOrder()
{
	return order;
}

void
PokemonSpeciesDetail::setOrder(int  order)
{
	this->order = order;
}

int
PokemonSpeciesDetail::getGenderRate()
{
	return gender_rate;
}

void
PokemonSpeciesDetail::setGenderRate(int  gender_rate)
{
	this->gender_rate = gender_rate;
}

int
PokemonSpeciesDetail::getCaptureRate()
{
	return capture_rate;
}

void
PokemonSpeciesDetail::setCaptureRate(int  capture_rate)
{
	this->capture_rate = capture_rate;
}

int
PokemonSpeciesDetail::getBaseHappiness()
{
	return base_happiness;
}

void
PokemonSpeciesDetail::setBaseHappiness(int  base_happiness)
{
	this->base_happiness = base_happiness;
}

bool
PokemonSpeciesDetail::getIsBaby()
{
	return is_baby;
}

void
PokemonSpeciesDetail::setIsBaby(bool  is_baby)
{
	this->is_baby = is_baby;
}

bool
PokemonSpeciesDetail::getIsLegendary()
{
	return is_legendary;
}

void
PokemonSpeciesDetail::setIsLegendary(bool  is_legendary)
{
	this->is_legendary = is_legendary;
}

bool
PokemonSpeciesDetail::getIsMythical()
{
	return is_mythical;
}

void
PokemonSpeciesDetail::setIsMythical(bool  is_mythical)
{
	this->is_mythical = is_mythical;
}

int
PokemonSpeciesDetail::getHatchCounter()
{
	return hatch_counter;
}

void
PokemonSpeciesDetail::setHatchCounter(int  hatch_counter)
{
	this->hatch_counter = hatch_counter;
}

bool
PokemonSpeciesDetail::getHasGenderDifferences()
{
	return has_gender_differences;
}

void
PokemonSpeciesDetail::setHasGenderDifferences(bool  has_gender_differences)
{
	this->has_gender_differences = has_gender_differences;
}

bool
PokemonSpeciesDetail::getFormsSwitchable()
{
	return forms_switchable;
}

void
PokemonSpeciesDetail::setFormsSwitchable(bool  forms_switchable)
{
	this->forms_switchable = forms_switchable;
}

GrowthRateSummary
PokemonSpeciesDetail::getGrowthRate()
{
	return growth_rate;
}

void
PokemonSpeciesDetail::setGrowthRate(GrowthRateSummary  growth_rate)
{
	this->growth_rate = growth_rate;
}

std::list<PokemonDexEntry>
PokemonSpeciesDetail::getPokedexNumbers()
{
	return pokedex_numbers;
}

void
PokemonSpeciesDetail::setPokedexNumbers(std::list <PokemonDexEntry> pokedex_numbers)
{
	this->pokedex_numbers = pokedex_numbers;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
PokemonSpeciesDetail::getEggGroups()
{
	return egg_groups;
}

void
PokemonSpeciesDetail::setEggGroups(std::list <AbilityDetail_pokemon_inner_pokemon> egg_groups)
{
	this->egg_groups = egg_groups;
}

PokemonColorSummary
PokemonSpeciesDetail::getColor()
{
	return color;
}

void
PokemonSpeciesDetail::setColor(PokemonColorSummary  color)
{
	this->color = color;
}

PokemonShapeSummary
PokemonSpeciesDetail::getShape()
{
	return shape;
}

void
PokemonSpeciesDetail::setShape(PokemonShapeSummary  shape)
{
	this->shape = shape;
}

PokemonSpeciesSummary
PokemonSpeciesDetail::getEvolvesFromSpecies()
{
	return evolves_from_species;
}

void
PokemonSpeciesDetail::setEvolvesFromSpecies(PokemonSpeciesSummary  evolves_from_species)
{
	this->evolves_from_species = evolves_from_species;
}

EvolutionChainSummary
PokemonSpeciesDetail::getEvolutionChain()
{
	return evolution_chain;
}

void
PokemonSpeciesDetail::setEvolutionChain(EvolutionChainSummary  evolution_chain)
{
	this->evolution_chain = evolution_chain;
}

PokemonHabitatSummary
PokemonSpeciesDetail::getHabitat()
{
	return habitat;
}

void
PokemonSpeciesDetail::setHabitat(PokemonHabitatSummary  habitat)
{
	this->habitat = habitat;
}

GenerationSummary
PokemonSpeciesDetail::getGeneration()
{
	return generation;
}

void
PokemonSpeciesDetail::setGeneration(GenerationSummary  generation)
{
	this->generation = generation;
}

std::list<PokemonFormDetail_form_names_inner>
PokemonSpeciesDetail::getNames()
{
	return names;
}

void
PokemonSpeciesDetail::setNames(std::list <PokemonFormDetail_form_names_inner> names)
{
	this->names = names;
}

std::list<PokemonSpeciesDetail_pal_park_encounters_inner>
PokemonSpeciesDetail::getPalParkEncounters()
{
	return pal_park_encounters;
}

void
PokemonSpeciesDetail::setPalParkEncounters(std::list <PokemonSpeciesDetail_pal_park_encounters_inner> pal_park_encounters)
{
	this->pal_park_encounters = pal_park_encounters;
}

std::list<PokemonSpeciesDescription>
PokemonSpeciesDetail::getFormDescriptions()
{
	return form_descriptions;
}

void
PokemonSpeciesDetail::setFormDescriptions(std::list <PokemonSpeciesDescription> form_descriptions)
{
	this->form_descriptions = form_descriptions;
}

std::list<PokemonSpeciesFlavorText>
PokemonSpeciesDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
PokemonSpeciesDetail::setFlavorTextEntries(std::list <PokemonSpeciesFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}

std::list<PokemonSpeciesDetail_genera_inner>
PokemonSpeciesDetail::getGenera()
{
	return genera;
}

void
PokemonSpeciesDetail::setGenera(std::list <PokemonSpeciesDetail_genera_inner> genera)
{
	this->genera = genera;
}

std::list<PokemonSpeciesDetail_varieties_inner>
PokemonSpeciesDetail::getVarieties()
{
	return varieties;
}

void
PokemonSpeciesDetail::setVarieties(std::list <PokemonSpeciesDetail_varieties_inner> varieties)
{
	this->varieties = varieties;
}


