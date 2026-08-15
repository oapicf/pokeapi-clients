

#include "ItemDetail.h"

using namespace Tiny;

ItemDetail::ItemDetail()
{
	id = int(0);
	name = std::string();
	cost = int(0);
	fling_power = int(0);
	fling_effect = ItemFlingEffectSummary();
	attributes = std::list<AbilityDetail_pokemon_inner_pokemon>();
	category = ItemCategorySummary();
	effect_entries = std::list<ItemEffectText>();
	flavor_text_entries = std::list<ItemFlavorText>();
	game_indices = std::list<ItemGameIndex>();
	names = std::list<ItemName>();
	held_by_pokemon = std::list<ItemDetail_held_by_pokemon_inner>();
	sprites = ItemDetail_sprites();
	baby_trigger_for = ItemDetail_baby_trigger_for();
	machines = std::list<ItemDetail_machines_inner>();
}

ItemDetail::ItemDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

ItemDetail::~ItemDetail()
{

}

void
ItemDetail::fromJson(std::string jsonObj)
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

    const char *costKey = "cost";

    if(object.has_key(costKey))
    {
        bourne::json value = object[costKey];



        jsonToValue(&cost, value, "int");


    }

    const char *fling_powerKey = "fling_power";

    if(object.has_key(fling_powerKey))
    {
        bourne::json value = object[fling_powerKey];



        jsonToValue(&fling_power, value, "int");


    }

    const char *fling_effectKey = "fling_effect";

    if(object.has_key(fling_effectKey))
    {
        bourne::json value = object[fling_effectKey];




        ItemFlingEffectSummary* obj = &fling_effect;
		obj->fromJson(value.dump());

    }

    const char *attributesKey = "attributes";

    if(object.has_key(attributesKey))
    {
        bourne::json value = object[attributesKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> attributes_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            attributes_list.push_back(element);
        }
        attributes = attributes_list;


    }

    const char *categoryKey = "category";

    if(object.has_key(categoryKey))
    {
        bourne::json value = object[categoryKey];




        ItemCategorySummary* obj = &category;
		obj->fromJson(value.dump());

    }

    const char *effect_entriesKey = "effect_entries";

    if(object.has_key(effect_entriesKey))
    {
        bourne::json value = object[effect_entriesKey];


        std::list<ItemEffectText> effect_entries_list;
        ItemEffectText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            effect_entries_list.push_back(element);
        }
        effect_entries = effect_entries_list;


    }

    const char *flavor_text_entriesKey = "flavor_text_entries";

    if(object.has_key(flavor_text_entriesKey))
    {
        bourne::json value = object[flavor_text_entriesKey];


        std::list<ItemFlavorText> flavor_text_entries_list;
        ItemFlavorText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            flavor_text_entries_list.push_back(element);
        }
        flavor_text_entries = flavor_text_entries_list;


    }

    const char *game_indicesKey = "game_indices";

    if(object.has_key(game_indicesKey))
    {
        bourne::json value = object[game_indicesKey];


        std::list<ItemGameIndex> game_indices_list;
        ItemGameIndex element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            game_indices_list.push_back(element);
        }
        game_indices = game_indices_list;


    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<ItemName> names_list;
        ItemName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *held_by_pokemonKey = "held_by_pokemon";

    if(object.has_key(held_by_pokemonKey))
    {
        bourne::json value = object[held_by_pokemonKey];


        std::list<ItemDetail_held_by_pokemon_inner> held_by_pokemon_list;
        ItemDetail_held_by_pokemon_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            held_by_pokemon_list.push_back(element);
        }
        held_by_pokemon = held_by_pokemon_list;


    }

    const char *spritesKey = "sprites";

    if(object.has_key(spritesKey))
    {
        bourne::json value = object[spritesKey];




        ItemDetail_sprites* obj = &sprites;
		obj->fromJson(value.dump());

    }

    const char *baby_trigger_forKey = "baby_trigger_for";

    if(object.has_key(baby_trigger_forKey))
    {
        bourne::json value = object[baby_trigger_forKey];




        ItemDetail_baby_trigger_for* obj = &baby_trigger_for;
		obj->fromJson(value.dump());

    }

    const char *machinesKey = "machines";

    if(object.has_key(machinesKey))
    {
        bourne::json value = object[machinesKey];


        std::list<ItemDetail_machines_inner> machines_list;
        ItemDetail_machines_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            machines_list.push_back(element);
        }
        machines = machines_list;


    }


}

bourne::json
ItemDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["cost"] = getCost();






    object["fling_power"] = getFlingPower();







	object["fling_effect"] = getFlingEffect().toJson();




    std::list<AbilityDetail_pokemon_inner_pokemon> attributes_list = getAttributes();
    bourne::json attributes_arr = bourne::json::array();

    for(auto& var : attributes_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        attributes_arr.append(obj.toJson());
    }
    object["attributes"] = attributes_arr;








	object["category"] = getCategory().toJson();




    std::list<ItemEffectText> effect_entries_list = getEffectEntries();
    bourne::json effect_entries_arr = bourne::json::array();

    for(auto& var : effect_entries_list)
    {
        ItemEffectText obj = var;
        effect_entries_arr.append(obj.toJson());
    }
    object["effect_entries"] = effect_entries_arr;






    std::list<ItemFlavorText> flavor_text_entries_list = getFlavorTextEntries();
    bourne::json flavor_text_entries_arr = bourne::json::array();

    for(auto& var : flavor_text_entries_list)
    {
        ItemFlavorText obj = var;
        flavor_text_entries_arr.append(obj.toJson());
    }
    object["flavor_text_entries"] = flavor_text_entries_arr;






    std::list<ItemGameIndex> game_indices_list = getGameIndices();
    bourne::json game_indices_arr = bourne::json::array();

    for(auto& var : game_indices_list)
    {
        ItemGameIndex obj = var;
        game_indices_arr.append(obj.toJson());
    }
    object["game_indices"] = game_indices_arr;






    std::list<ItemName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        ItemName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<ItemDetail_held_by_pokemon_inner> held_by_pokemon_list = getHeldByPokemon();
    bourne::json held_by_pokemon_arr = bourne::json::array();

    for(auto& var : held_by_pokemon_list)
    {
        ItemDetail_held_by_pokemon_inner obj = var;
        held_by_pokemon_arr.append(obj.toJson());
    }
    object["held_by_pokemon"] = held_by_pokemon_arr;








	object["sprites"] = getSprites().toJson();






	object["baby_trigger_for"] = getBabyTriggerFor().toJson();




    std::list<ItemDetail_machines_inner> machines_list = getMachines();
    bourne::json machines_arr = bourne::json::array();

    for(auto& var : machines_list)
    {
        ItemDetail_machines_inner obj = var;
        machines_arr.append(obj.toJson());
    }
    object["machines"] = machines_arr;




    return object;

}

int
ItemDetail::getId()
{
	return id;
}

void
ItemDetail::setId(int  id)
{
	this->id = id;
}

std::string
ItemDetail::getName()
{
	return name;
}

void
ItemDetail::setName(std::string  name)
{
	this->name = name;
}

int
ItemDetail::getCost()
{
	return cost;
}

void
ItemDetail::setCost(int  cost)
{
	this->cost = cost;
}

int
ItemDetail::getFlingPower()
{
	return fling_power;
}

void
ItemDetail::setFlingPower(int  fling_power)
{
	this->fling_power = fling_power;
}

ItemFlingEffectSummary
ItemDetail::getFlingEffect()
{
	return fling_effect;
}

void
ItemDetail::setFlingEffect(ItemFlingEffectSummary  fling_effect)
{
	this->fling_effect = fling_effect;
}

std::list<AbilityDetail_pokemon_inner_pokemon>
ItemDetail::getAttributes()
{
	return attributes;
}

void
ItemDetail::setAttributes(std::list <AbilityDetail_pokemon_inner_pokemon> attributes)
{
	this->attributes = attributes;
}

ItemCategorySummary
ItemDetail::getCategory()
{
	return category;
}

void
ItemDetail::setCategory(ItemCategorySummary  category)
{
	this->category = category;
}

std::list<ItemEffectText>
ItemDetail::getEffectEntries()
{
	return effect_entries;
}

void
ItemDetail::setEffectEntries(std::list <ItemEffectText> effect_entries)
{
	this->effect_entries = effect_entries;
}

std::list<ItemFlavorText>
ItemDetail::getFlavorTextEntries()
{
	return flavor_text_entries;
}

void
ItemDetail::setFlavorTextEntries(std::list <ItemFlavorText> flavor_text_entries)
{
	this->flavor_text_entries = flavor_text_entries;
}

std::list<ItemGameIndex>
ItemDetail::getGameIndices()
{
	return game_indices;
}

void
ItemDetail::setGameIndices(std::list <ItemGameIndex> game_indices)
{
	this->game_indices = game_indices;
}

std::list<ItemName>
ItemDetail::getNames()
{
	return names;
}

void
ItemDetail::setNames(std::list <ItemName> names)
{
	this->names = names;
}

std::list<ItemDetail_held_by_pokemon_inner>
ItemDetail::getHeldByPokemon()
{
	return held_by_pokemon;
}

void
ItemDetail::setHeldByPokemon(std::list <ItemDetail_held_by_pokemon_inner> held_by_pokemon)
{
	this->held_by_pokemon = held_by_pokemon;
}

ItemDetail_sprites
ItemDetail::getSprites()
{
	return sprites;
}

void
ItemDetail::setSprites(ItemDetail_sprites  sprites)
{
	this->sprites = sprites;
}

ItemDetail_baby_trigger_for
ItemDetail::getBabyTriggerFor()
{
	return baby_trigger_for;
}

void
ItemDetail::setBabyTriggerFor(ItemDetail_baby_trigger_for  baby_trigger_for)
{
	this->baby_trigger_for = baby_trigger_for;
}

std::list<ItemDetail_machines_inner>
ItemDetail::getMachines()
{
	return machines;
}

void
ItemDetail::setMachines(std::list <ItemDetail_machines_inner> machines)
{
	this->machines = machines;
}



