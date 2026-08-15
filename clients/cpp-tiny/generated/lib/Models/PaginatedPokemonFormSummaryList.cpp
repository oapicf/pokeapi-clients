

#include "PaginatedPokemonFormSummaryList.h"

using namespace Tiny;

PaginatedPokemonFormSummaryList::PaginatedPokemonFormSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<PokemonFormSummary>();
}

PaginatedPokemonFormSummaryList::PaginatedPokemonFormSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedPokemonFormSummaryList::~PaginatedPokemonFormSummaryList()
{

}

void
PaginatedPokemonFormSummaryList::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *countKey = "count";

    if(object.has_key(countKey))
    {
        bourne::json value = object[countKey];



        jsonToValue(&count, value, "int");


    }

    const char *nextKey = "next";

    if(object.has_key(nextKey))
    {
        bourne::json value = object[nextKey];



        jsonToValue(&next, value, "std::string");


    }

    const char *previousKey = "previous";

    if(object.has_key(previousKey))
    {
        bourne::json value = object[previousKey];



        jsonToValue(&previous, value, "std::string");


    }

    const char *resultsKey = "results";

    if(object.has_key(resultsKey))
    {
        bourne::json value = object[resultsKey];


        std::list<PokemonFormSummary> results_list;
        PokemonFormSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedPokemonFormSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<PokemonFormSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        PokemonFormSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedPokemonFormSummaryList::getCount()
{
	return count;
}

void
PaginatedPokemonFormSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedPokemonFormSummaryList::getNext()
{
	return next;
}

void
PaginatedPokemonFormSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedPokemonFormSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedPokemonFormSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<PokemonFormSummary>
PaginatedPokemonFormSummaryList::getResults()
{
	return results;
}

void
PaginatedPokemonFormSummaryList::setResults(std::list <PokemonFormSummary> results)
{
	this->results = results;
}



