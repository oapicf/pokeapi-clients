

#include "PaginatedPokeathlonStatSummaryList.h"

using namespace Tiny;

PaginatedPokeathlonStatSummaryList::PaginatedPokeathlonStatSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<PokeathlonStatSummary>();
}

PaginatedPokeathlonStatSummaryList::PaginatedPokeathlonStatSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedPokeathlonStatSummaryList::~PaginatedPokeathlonStatSummaryList()
{

}

void
PaginatedPokeathlonStatSummaryList::fromJson(std::string jsonObj)
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


        std::list<PokeathlonStatSummary> results_list;
        PokeathlonStatSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedPokeathlonStatSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<PokeathlonStatSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        PokeathlonStatSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedPokeathlonStatSummaryList::getCount()
{
	return count;
}

void
PaginatedPokeathlonStatSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedPokeathlonStatSummaryList::getNext()
{
	return next;
}

void
PaginatedPokeathlonStatSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedPokeathlonStatSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedPokeathlonStatSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<PokeathlonStatSummary>
PaginatedPokeathlonStatSummaryList::getResults()
{
	return results;
}

void
PaginatedPokeathlonStatSummaryList::setResults(std::list <PokeathlonStatSummary> results)
{
	this->results = results;
}



