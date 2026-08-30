

#include "PokemonSpeciesDetail.h"

using namespace Tiny;

PokemonSpeciesDetail::PokemonSpeciesDetail()
{
	id = int(0);
	name = std::string();
	order = int(0);
	gender_rate = int(0);
	capture_rate = int(0);
	base_happiness = int(0);
	is_baby = bool(false);
	is_legendary = bool(false);
	is_mythical = bool(false);
	hatch_counter = int(0);
	has_gender_differences = bool(false);
	forms_switchable = bool(false);
	growth_rate = GrowthRateSummary();
	pokedex_numbers = std::list<PokemonDexEntry>();
	egg_groups = std::list<AbilityDetail_pokemon_inner_pokemon>();
	color = PokemonColorSummary();
	shape = PokemonShapeSummary();
	evolves_from_species = PokemonSpeciesSummary();
	evolution_chain = EvolutionChainSummary();
	habitat = PokemonHabitatSummary();
	generation = GenerationSummary();
	names = std::list<PokemonFormDetail_form_names_inner>();
	pal_park_encounters = std::list<PokemonSpeciesDetail_pal_park_encounters_inner>();
	form_descriptions = std::list<PokemonSpeciesDescription>();
	flavor_text_entries = std::list<PokemonSpeciesFlavorText>();
	genera = std::list<PokemonSpeciesDetail_genera_inner>();
	varieties = std::list<PokemonSpeciesDetail_varieties_inner>();
}

PokemonSpeciesDetail::PokemonSpeciesDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

PokemonSpeciesDetail::~PokemonSpeciesDetail()
{

}

void
PokemonSpeciesDetail::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "int");


    }

    const char *nameKey = "name";

    if(object.has_key(nameKey))
    {
        bourne::json value = object[nameKey];



        jsonToValue(&name, value, "std::string");


    }

    const char *orderKey = "order";

    if(object.has_key(orderKey))
    {
        bourne::json value = object[orderKey];



        jsonToValue(&order, value, "int");


    }

    const char *gender_rateKey = "gender_rate";

    if(object.has_key(gender_rateKey))
    {
        bourne::json value = object[gender_rateKey];



        jsonToValue(&gender_rate, value, "int");


    }

    const char *capture_rateKey = "capture_rate";

    if(object.has_key(capture_rateKey))
    {
        bourne::json value = object[capture_rateKey];



        jsonToValue(&capture_rate, value, "int");


    }

    const char *base_happinessKey = "base_happiness";

    if(object.has_key(base_happinessKey))
    {
        bourne::json value = object[base_happinessKey];



        jsonToValue(&base_happiness, value, "int");


    }

    const char *is_babyKey = "is_baby";

    if(object.has_key(is_babyKey))
    {
        bourne::json value = object[is_babyKey];



        jsonToValue(&is_baby, value, "bool");


    }

    const char *is_legendaryKey = "is_legendary";

    if(object.has_key(is_legendaryKey))
    {
        bourne::json value = object[is_legendaryKey];



        jsonToValue(&is_legendary, value, "bool");


    }

    const char *is_mythicalKey = "is_mythical";

    if(object.has_key(is_mythicalKey))
    {
        bourne::json value = object[is_mythicalKey];



        jsonToValue(&is_mythical, value, "bool");


    }

    const char *hatch_counterKey = "hatch_counter";

    if(object.has_key(hatch_counterKey))
    {
        bourne::json value = object[hatch_counterKey];



        jsonToValue(&hatch_counter, value, "int");


    }

    const char *has_gender_differencesKey = "has_gender_differences";

    if(object.has_key(has_gender_differencesKey))
    {
        bourne::json value = object[has_gender_differencesKey];



        jsonToValue(&has_gender_differences, value, "bool");


    }

    const char *forms_switchableKey = "forms_switchable";

    if(object.has_key(forms_switchableKey))
    {
        bourne::json value = object[forms_switchableKey];



        jsonToValue(&forms_switchable, value, "bool");


    }

    const char *growth_rateKey = "growth_rate";

    if(object.has_key(growth_rateKey))
    {
        bourne::json value = object[growth_rateKey];




        GrowthRateSummary* obj = &growth_rate;
		obj->fromJson(value.dump());

    }

    const char *pokedex_numbersKey = "pokedex_numbers";

    if(object.has_key(pokedex_numbersKey))
    {
        bourne::json value = object[pokedex_numbersKey];


        std::list<PokemonDexEntry> pokedex_numbers_list;
        PokemonDexEntry element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pokedex_numbers_list.push_back(element);
        }
        pokedex_numbers = pokedex_numbers_list;


    }

    const char *egg_groupsKey = "egg_groups";

    if(object.has_key(egg_groupsKey))
    {
        bourne::json value = object[egg_groupsKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> egg_groups_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            egg_groups_list.push_back(element);
        }
        egg_groups = egg_groups_list;


    }

    const char *colorKey = "color";

    if(object.has_key(colorKey))
    {
        bourne::json value = object[colorKey];




        PokemonColorSummary* obj = &color;
		obj->fromJson(value.dump());

    }

    const char *shapeKey = "shape";

    if(object.has_key(shapeKey))
    {
        bourne::json value = object[shapeKey];




        PokemonShapeSummary* obj = &shape;
		obj->fromJson(value.dump());

    }

    const char *evolves_from_speciesKey = "evolves_from_species";

    if(object.has_key(evolves_from_speciesKey))
    {
        bourne::json value = object[evolves_from_speciesKey];




        PokemonSpeciesSummary* obj = &evolves_from_species;
		obj->fromJson(value.dump());

    }

    const char *evolution_chainKey = "evolution_chain";

    if(object.has_key(evolution_chainKey))
    {
        bourne::json value = object[evolution_chainKey];




        EvolutionChainSummary* obj = &evolution_chain;
		obj->fromJson(value.dump());

    }

    const char *habitatKey = "habitat";

    if(object.has_key(habitatKey))
    {
        bourne::json value = object[habitatKey];




        PokemonHabitatSummary* obj = &habitat;
		obj->fromJson(value.dump());

    }

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        GenerationSummary* obj = &generation;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<PokemonFormDetail_form_names_inner> names_list;
        PokemonFormDetail_form_names_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *pal_park_encountersKey = "pal_park_encounters";

    if(object.has_key(pal_park_encountersKey))
    {
        bourne::json value = object[pal_park_encountersKey];


        std::list<PokemonSpeciesDetail_pal_park_encounters_inner> pal_park_encounters_list;
        PokemonSpeciesDetail_pal_park_encounters_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            pal_park_encounters_list.push_back(element);
        }
        pal_park_encounters = pal_park_encounters_list;


    }

    const char *form_descriptionsKey = "form_descriptions";

    if(object.has_key(form_descriptionsKey))
    {
        bourne::json value = object[form_descriptionsKey];


        std::list<PokemonSpeciesDescription> form_descriptions_list;
        PokemonSpeciesDescription element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            form_descriptions_list.push_back(element);
        }
        form_descriptions = form_descriptions_list;


    }

    const char *flavor_text_entriesKey = "flavor_text_entries";

    if(object.has_key(flavor_text_entriesKey))
    {
        bourne::json value = object[flavor_text_entriesKey];


        std::list<PokemonSpeciesFlavorText> flavor_text_entries_list;
        PokemonSpeciesFlavorText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            flavor_text_entries_list.push_back(element);
        }
        flavor_text_entries = flavor_text_entries_list;


    }

    const char *generaKey = "genera";

    if(object.has_key(generaKey))
    {
        bourne::json value = object[generaKey];


        std::list<PokemonSpeciesDetail_genera_inner> genera_list;
        PokemonSpeciesDetail_genera_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            genera_list.push_back(element);
        }
        genera = genera_list;


    }

    const char *varietiesKey = "varieties";

    if(object.has_key(varietiesKey))
    {
        bourne::json value = object[varietiesKey];


        std::list<PokemonSpeciesDetail_varieties_inner> varieties_list;
        PokemonSpeciesDetail_varieties_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            varieties_list.push_back(element);
        }
        varieties = varieties_list;


    }


}

bourne::json
PokemonSpeciesDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["order"] = getOrder();






    object["gender_rate"] = getGenderRate();






    object["capture_rate"] = getCaptureRate();






    object["base_happiness"] = getBaseHappiness();






    object["is_baby"] = isIsBaby();






    object["is_legendary"] = isIsLegendary();






    object["is_mythical"] = isIsMythical();






    object["hatch_counter"] = getHatchCounter();






    object["has_gender_differences"] = isHasGenderDifferences();






    object["forms_switchable"] = isFormsSwitchable();







	object["growth_rate"] = getGrowthRate().toJson();




    std::list<PokemonDexEntry> pokedex_numbers_list = getPokedexNumbers();
    bourne::json pokedex_numbers_arr = bourne::json::array();

    for(auto& var : pokedex_numbers_list)
    {
        PokemonDexEntry obj = var;
        pokedex_numbers_arr.append(obj.toJson());
    }
    object["pokedex_numbers"] = pokedex_numbers_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> egg_groups_list = getEggGroups();
    bourne::json egg_groups_arr = bourne::json::array();

    for(auto& var : egg_groups_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        egg_groups_arr.append(obj.toJson());
    }
    object["egg_groups"] = egg_groups_arr;








	object["color"] = getColor().toJson();






	object["shape"] = getShape().toJson();






	object["evolves_from_species"] = getEvolvesFromSpecies().toJson();






	object["evolution_chain"] = getEvolutionChain().toJson();






	object["habitat"] = getHabitat().toJson();






	object["generation"] = getGeneration().toJson();




    std::list<PokemonFormDetail_form_names_inner> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        PokemonFormDetail_form_names_inner obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<PokemonSpeciesDetail_pal_park_encounters_inner> pal_park_encounters_list = getPalParkEncounters();
    bourne::json pal_park_encounters_arr = bourne::json::array();

    for(auto& var : pal_park_encounters_list)
    {
        PokemonSpeciesDetail_pal_park_encounters_inner obj = var;
        pal_park_encounters_arr.append(obj.toJson());
    }
    object["pal_park_encounters"] = pal_park_encounters_arr;






    std::list<PokemonSpeciesDescription> form_descriptions_list = getFormDescriptions();
    bourne::json form_descriptions_arr = bourne::json::array();

    for(auto& var : form_descriptions_list)
    {
        PokemonSpeciesDescription obj = var;
        form_descriptions_arr.append(obj.toJson());
    }
    object["form_descriptions"] = form_descriptions_arr;






    std::list<PokemonSpeciesFlavorText> flavor_text_entries_list = getFlavorTextEntries();
    bourne::json flavor_text_entries_arr = bourne::json::array();

    for(auto& var : flavor_text_entries_list)
    {
        PokemonSpeciesFlavorText obj = var;
        flavor_text_entries_arr.append(obj.toJson());
    }
    object["flavor_text_entries"] = flavor_text_entries_arr;






    std::list<PokemonSpeciesDetail_genera_inner> genera_list = getGenera();
    bourne::json genera_arr = bourne::json::array();

    for(auto& var : genera_list)
    {
        PokemonSpeciesDetail_genera_inner obj = var;
        genera_arr.append(obj.toJson());
    }
    object["genera"] = genera_arr;






    std::list<PokemonSpeciesDetail_varieties_inner> varieties_list = getVarieties();
    bourne::json varieties_arr = bourne::json::array();

    for(auto& var : varieties_list)
    {
        PokemonSpeciesDetail_varieties_inner obj = var;
        varieties_arr.append(obj.toJson());
    }
    object["varieties"] = varieties_arr;




    return object;

}

int
PokemonSpeciesDetail::getId()
{
	return id;
}

void
PokemonSpeciesDetail::setId(int id)
{
	this->id = id;
}

std::string
PokemonSpeciesDetail::getName()
{
	return name;
}

void
PokemonSpeciesDetail::setName(std::string name)
{
	this->name = name;
}

int
PokemonSpeciesDetail::getOrder()
{
	return order;
}

void
PokemonSpeciesDetail::setOrder(int order)
{
	this->order = order;
}

int
PokemonSpeciesDetail::getGenderRate()
{
	return gender_rate;
}

void
PokemonSpeciesDetail::setGenderRate(int gender_rate)
{
	this->gender_rate = gender_rate;
}

int
PokemonSpeciesDetail::getCaptureRate()
{
	return capture_rate;
}

void
PokemonSpeciesDetail::setCaptureRate(int capture_rate)
{
	this->capture_rate = capture_rate;
}

int
PokemonSpeciesDetail::getBaseHappiness()
{
	return base_happiness;
}

void
PokemonSpeciesDetail::setBaseHappiness(int base_happiness)
{
	this->base_happiness = base_happiness;
}

bool
PokemonSpeciesDetail::isIsBaby()
{
	return is_baby;
}

void
PokemonSpeciesDetail::setIsBaby(bool is_baby)
{
	this->is_baby = is_baby;
}

bool
PokemonSpeciesDetail::isIsLegendary()
{
	return is_legendary;
}

void
PokemonSpeciesDetail::setIsLegendary(bool is_legendary)
{
	this->is_legendary = is_legendary;
}

bool
PokemonSpeciesDetail::isIsMythical()
{
	return is_mythical;
}

void
PokemonSpeciesDetail::setIsMythical(bool is_mythical)
{
	this->is_mythical = is_mythical;
}

int
PokemonSpeciesDetail::getHatchCounter()
{
	return hatch_counter;
}

void
PokemonSpeciesDetail::setHatchCounter(int hatch_counter)
{
	this->hatch_counter = hatch_counter;
}

bool
PokemonSpeciesDetail::isHasGenderDifferences()
{
	return has_gender_differences;
}

void
PokemonSpeciesDetail::setHasGenderDifferences(bool has_gender_differences)
{
	this->has_gender_differences = has_gender_differences;
}

bool
PokemonSpeciesDetail::isFormsSwitchable()
{
	return forms_switchable;
}

void
PokemonSpeciesDetail::setFormsSwitchable(bool forms_switchable)
{
	this->forms_switchable = forms_switchable;
}

GrowthRateSummary
PokemonSpeciesDetail::getGrowthRate()
{
	return growth_rate;
}

void
PokemonSpeciesDetail::setGrowthRate(GrowthRateSummary growth_rate)
{
	this->growth_rate = growth_rate;
}

std::list<PokemonDexEntry>
PokemonSpeciesDetail::getPokedexNumbers()
{
	return pokedex_numbers;
}

void
PokemonSpeciesDetail::setPokedexNumbers(std::list<PokemonDexEntry> pokedex_numbers)
{
	this->pokedex_numbers = pokedex_numbers;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
PokemonSpeciesDetail::getEggGroups()
{
	return egg_groups;
}

void
PokemonSpeciesDetail::setEggGroups(std::list<AbilityDetail_pokemon_inner_pokemon> egg_groups)
{
	this->egg_groups = egg_groups;
}

PokemonColorSummary
PokemonSpeciesDetail::getColor()
{
	return color;
}

void
PokemonSpeciesDetail::setColor(PokemonColorSummary color)
{
	this->color = color;
}

PokemonShapeSummary
PokemonSpeciesDetail::getShape()
{
	return shape;
}

void
PokemonSpeciesDetail::setShape(PokemonShapeSummary shape)
{
	this->shape = shape;
}

PokemonSpeciesSummary
PokemonSpeciesDetail::getEvolvesFromSpecies()
{
	return evolves_from_species;
}

void
PokemonSpeciesDetail::setEvolvesFromSpecies(PokemonSpeciesSummary evolves_from_species)
{
	this->evolves_from_species = evolves_from_species;
}

EvolutionChainSummary
PokemonSpeciesDetail::getEvolutionChain()
{
	return evolution_chain;
}

void
PokemonSpeciesDetail::setEvolutionChain(EvolutionChainSummary evolution_chain)
{
	this->evolution_chain = evolution_chain;
}

PokemonHabitatSummary
PokemonSpeciesDetail::getHabitat()
{
	return habitat;
}

void
PokemonSpeciesDetail::setHabitat(PokemonHabitatSummary habitat)
{
	this->habitat = habitat;
}

GenerationSummary
PokemonSpeciesDetail::getGeneration()
{
	return generation;
}

void
PokemonSpeciesDetail::setGeneration(GenerationSummary generation)
{
	this->generation = generation;
}

std::list<PokemonFormDetail_form_names_inner>
PokemonSpeciesDetail::getNames()
{
	return names;
}

void
PokemonSpeciesDetail::setNames(std::list<PokemonFormDetail_form_names_inner> names)
{
	this->names = names;
}

std::list<PokemonSpeciesDetail_pal_park_encounters_inner>
PokemonSpeciesDetail::getPalParkEncounters()
{
	return pal_park_encounters;
}

void
PokemonSpeciesDetail::setPalParkEncounters(std::list<PokemonSpeciesDetail_pal_park_encounters_inner> pal_park_encounters)
{
	this->pal_park_encounters = pal_park_encounters;
}

std::list<PokemonSpeciesDescription>
PokemonSpeciesDetail::getFormDescriptions()
{
	return form_descriptions;
}

void
PokemonSpeciesDetail::setFormDescriptions(std::list<PokemonSpeciesDescription> form_descriptions)
{
	this->form_descriptions = form_descriptions;
}

std::list<PokemonSpeciesFlavorText>
PokemonSpeciesDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
PokemonSpeciesDetail::setFlavorTextEntries(std::list<PokemonSpeciesFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}

std::list<PokemonSpeciesDetail_genera_inner>
PokemonSpeciesDetail::getGenera()
{
	return genera;
}

void
PokemonSpeciesDetail::setGenera(std::list<PokemonSpeciesDetail_genera_inner> genera)
{
	this->genera = genera;
}

std::list<PokemonSpeciesDetail_varieties_inner>
PokemonSpeciesDetail::getVarieties()
{
	return varieties;
}

void
PokemonSpeciesDetail::setVarieties(std::list<PokemonSpeciesDetail_varieties_inner> varieties)
{
	this->varieties = varieties;
}



