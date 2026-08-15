

#include "MoveDetail.h"

using namespace Tiny;

MoveDetail::MoveDetail()
{
	id = int(0);
	name = std::string();
	accuracy = int(0);
	effect_chance = int(0);
	pp = int(0);
	priority = int(0);
	power = int(0);
	contest_combos = MoveDetail_contest_combos();
	contest_type = ContestTypeSummary();
	contest_effect = ContestEffectSummary();
	damage_class = MoveDamageClassSummary();
	effect_entries = std::list<MoveChange_effect_entries_inner>();
	effect_changes = std::list<MoveDetail_effect_changes_inner>();
	generation = GenerationSummary();
	meta = null;
	names = std::list<MoveName>();
	past_values = std::list<MoveChange>();
	stat_changes = std::list<MoveDetail_stat_changes_inner>();
	super_contest_effect = SuperContestEffectSummary();
	target = MoveTargetSummary();
	type = TypeSummary();
	machines = std::list<MoveDetail_machines_inner>();
	flavor_text_entries = std::list<MoveFlavorText>();
	learned_by_pokemon = std::list<AbilityDetail_pokemon_inner_pokemon>();
}

MoveDetail::MoveDetail(std::string jsonString)
{
	this->fromJson(jsonString);
}

MoveDetail::~MoveDetail()
{

}

void
MoveDetail::fromJson(std::string jsonObj)
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

    const char *accuracyKey = "accuracy";

    if(object.has_key(accuracyKey))
    {
        bourne::json value = object[accuracyKey];



        jsonToValue(&accuracy, value, "int");


    }

    const char *effect_chanceKey = "effect_chance";

    if(object.has_key(effect_chanceKey))
    {
        bourne::json value = object[effect_chanceKey];



        jsonToValue(&effect_chance, value, "int");


    }

    const char *ppKey = "pp";

    if(object.has_key(ppKey))
    {
        bourne::json value = object[ppKey];



        jsonToValue(&pp, value, "int");


    }

    const char *priorityKey = "priority";

    if(object.has_key(priorityKey))
    {
        bourne::json value = object[priorityKey];



        jsonToValue(&priority, value, "int");


    }

    const char *powerKey = "power";

    if(object.has_key(powerKey))
    {
        bourne::json value = object[powerKey];



        jsonToValue(&power, value, "int");


    }

    const char *contest_combosKey = "contest_combos";

    if(object.has_key(contest_combosKey))
    {
        bourne::json value = object[contest_combosKey];




        MoveDetail_contest_combos* obj = &contest_combos;
		obj->fromJson(value.dump());

    }

    const char *contest_typeKey = "contest_type";

    if(object.has_key(contest_typeKey))
    {
        bourne::json value = object[contest_typeKey];




        ContestTypeSummary* obj = &contest_type;
		obj->fromJson(value.dump());

    }

    const char *contest_effectKey = "contest_effect";

    if(object.has_key(contest_effectKey))
    {
        bourne::json value = object[contest_effectKey];




        ContestEffectSummary* obj = &contest_effect;
		obj->fromJson(value.dump());

    }

    const char *damage_classKey = "damage_class";

    if(object.has_key(damage_classKey))
    {
        bourne::json value = object[damage_classKey];




        MoveDamageClassSummary* obj = &damage_class;
		obj->fromJson(value.dump());

    }

    const char *effect_entriesKey = "effect_entries";

    if(object.has_key(effect_entriesKey))
    {
        bourne::json value = object[effect_entriesKey];


        std::list<MoveChange_effect_entries_inner> effect_entries_list;
        MoveChange_effect_entries_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            effect_entries_list.push_back(element);
        }
        effect_entries = effect_entries_list;


    }

    const char *effect_changesKey = "effect_changes";

    if(object.has_key(effect_changesKey))
    {
        bourne::json value = object[effect_changesKey];


        std::list<MoveDetail_effect_changes_inner> effect_changes_list;
        MoveDetail_effect_changes_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            effect_changes_list.push_back(element);
        }
        effect_changes = effect_changes_list;


    }

    const char *generationKey = "generation";

    if(object.has_key(generationKey))
    {
        bourne::json value = object[generationKey];




        GenerationSummary* obj = &generation;
		obj->fromJson(value.dump());

    }

    const char *metaKey = "meta";

    if(object.has_key(metaKey))
    {
        bourne::json value = object[metaKey];




        MoveMeta* obj = &meta;
		obj->fromJson(value.dump());

    }

    const char *namesKey = "names";

    if(object.has_key(namesKey))
    {
        bourne::json value = object[namesKey];


        std::list<MoveName> names_list;
        MoveName element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            names_list.push_back(element);
        }
        names = names_list;


    }

    const char *past_valuesKey = "past_values";

    if(object.has_key(past_valuesKey))
    {
        bourne::json value = object[past_valuesKey];


        std::list<MoveChange> past_values_list;
        MoveChange element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            past_values_list.push_back(element);
        }
        past_values = past_values_list;


    }

    const char *stat_changesKey = "stat_changes";

    if(object.has_key(stat_changesKey))
    {
        bourne::json value = object[stat_changesKey];


        std::list<MoveDetail_stat_changes_inner> stat_changes_list;
        MoveDetail_stat_changes_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            stat_changes_list.push_back(element);
        }
        stat_changes = stat_changes_list;


    }

    const char *super_contest_effectKey = "super_contest_effect";

    if(object.has_key(super_contest_effectKey))
    {
        bourne::json value = object[super_contest_effectKey];




        SuperContestEffectSummary* obj = &super_contest_effect;
		obj->fromJson(value.dump());

    }

    const char *targetKey = "target";

    if(object.has_key(targetKey))
    {
        bourne::json value = object[targetKey];




        MoveTargetSummary* obj = &target;
		obj->fromJson(value.dump());

    }

    const char *typeKey = "type";

    if(object.has_key(typeKey))
    {
        bourne::json value = object[typeKey];




        TypeSummary* obj = &type;
		obj->fromJson(value.dump());

    }

    const char *machinesKey = "machines";

    if(object.has_key(machinesKey))
    {
        bourne::json value = object[machinesKey];


        std::list<MoveDetail_machines_inner> machines_list;
        MoveDetail_machines_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            machines_list.push_back(element);
        }
        machines = machines_list;


    }

    const char *flavor_text_entriesKey = "flavor_text_entries";

    if(object.has_key(flavor_text_entriesKey))
    {
        bourne::json value = object[flavor_text_entriesKey];


        std::list<MoveFlavorText> flavor_text_entries_list;
        MoveFlavorText element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            flavor_text_entries_list.push_back(element);
        }
        flavor_text_entries = flavor_text_entries_list;


    }

    const char *learned_by_pokemonKey = "learned_by_pokemon";

    if(object.has_key(learned_by_pokemonKey))
    {
        bourne::json value = object[learned_by_pokemonKey];


        std::list<AbilityDetail_pokemon_inner_pokemon> learned_by_pokemon_list;
        AbilityDetail_pokemon_inner_pokemon element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            learned_by_pokemon_list.push_back(element);
        }
        learned_by_pokemon = learned_by_pokemon_list;


    }


}

bourne::json
MoveDetail::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["name"] = getName();






    object["accuracy"] = getAccuracy();






    object["effect_chance"] = getEffectChance();






    object["pp"] = getPp();






    object["priority"] = getPriority();






    object["power"] = getPower();







	object["contest_combos"] = getContestCombos().toJson();






	object["contest_type"] = getContestType().toJson();






	object["contest_effect"] = getContestEffect().toJson();






	object["damage_class"] = getDamageClass().toJson();




    std::list<MoveChange_effect_entries_inner> effect_entries_list = getEffectEntries();
    bourne::json effect_entries_arr = bourne::json::array();

    for(auto& var : effect_entries_list)
    {
        MoveChange_effect_entries_inner obj = var;
        effect_entries_arr.append(obj.toJson());
    }
    object["effect_entries"] = effect_entries_arr;






    std::list<MoveDetail_effect_changes_inner> effect_changes_list = getEffectChanges();
    bourne::json effect_changes_arr = bourne::json::array();

    for(auto& var : effect_changes_list)
    {
        MoveDetail_effect_changes_inner obj = var;
        effect_changes_arr.append(obj.toJson());
    }
    object["effect_changes"] = effect_changes_arr;








	object["generation"] = getGeneration().toJson();






	object["meta"] = getMeta().toJson();




    std::list<MoveName> names_list = getNames();
    bourne::json names_arr = bourne::json::array();

    for(auto& var : names_list)
    {
        MoveName obj = var;
        names_arr.append(obj.toJson());
    }
    object["names"] = names_arr;






    std::list<MoveChange> past_values_list = getPastValues();
    bourne::json past_values_arr = bourne::json::array();

    for(auto& var : past_values_list)
    {
        MoveChange obj = var;
        past_values_arr.append(obj.toJson());
    }
    object["past_values"] = past_values_arr;






    std::list<MoveDetail_stat_changes_inner> stat_changes_list = getStatChanges();
    bourne::json stat_changes_arr = bourne::json::array();

    for(auto& var : stat_changes_list)
    {
        MoveDetail_stat_changes_inner obj = var;
        stat_changes_arr.append(obj.toJson());
    }
    object["stat_changes"] = stat_changes_arr;








	object["super_contest_effect"] = getSuperContestEffect().toJson();






	object["target"] = getTarget().toJson();






	object["type"] = getType().toJson();




    std::list<MoveDetail_machines_inner> machines_list = getMachines();
    bourne::json machines_arr = bourne::json::array();

    for(auto& var : machines_list)
    {
        MoveDetail_machines_inner obj = var;
        machines_arr.append(obj.toJson());
    }
    object["machines"] = machines_arr;






    std::list<MoveFlavorText> flavor_text_entries_list = getFlavorTextEntries();
    bourne::json flavor_text_entries_arr = bourne::json::array();

    for(auto& var : flavor_text_entries_list)
    {
        MoveFlavorText obj = var;
        flavor_text_entries_arr.append(obj.toJson());
    }
    object["flavor_text_entries"] = flavor_text_entries_arr;






    std::list<AbilityDetail_pokemon_inner_pokemon> learned_by_pokemon_list = getLearnedByPokemon();
    bourne::json learned_by_pokemon_arr = bourne::json::array();

    for(auto& var : learned_by_pokemon_list)
    {
        AbilityDetail_pokemon_inner_pokemon obj = var;
        learned_by_pokemon_arr.append(obj.toJson());
    }
    object["learned_by_pokemon"] = learned_by_pokemon_arr;




    return object;

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



