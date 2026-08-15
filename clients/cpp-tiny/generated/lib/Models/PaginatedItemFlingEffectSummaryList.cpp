

#include "PaginatedItemFlingEffectSummaryList.h"

using namespace Tiny;

PaginatedItemFlingEffectSummaryList::PaginatedItemFlingEffectSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<ItemFlingEffectSummary>();
}

PaginatedItemFlingEffectSummaryList::PaginatedItemFlingEffectSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedItemFlingEffectSummaryList::~PaginatedItemFlingEffectSummaryList()
{

}

void
PaginatedItemFlingEffectSummaryList::fromJson(std::string jsonObj)
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


        std::list<ItemFlingEffectSummary> results_list;
        ItemFlingEffectSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedItemFlingEffectSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<ItemFlingEffectSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        ItemFlingEffectSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedItemFlingEffectSummaryList::getCount()
{
	return count;
}

void
PaginatedItemFlingEffectSummaryList::setCount(int  count)
{
	this->count = count;
}

std::string
PaginatedItemFlingEffectSummaryList::getNext()
{
	return next;
}

void
PaginatedItemFlingEffectSummaryList::setNext(std::string  next)
{
	this->next = next;
}

std::string
PaginatedItemFlingEffectSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedItemFlingEffectSummaryList::setPrevious(std::string  previous)
{
	this->previous = previous;
}

std::list<ItemFlingEffectSummary>
PaginatedItemFlingEffectSummaryList::getResults()
{
	return results;
}

void
PaginatedItemFlingEffectSummaryList::setResults(std::list <ItemFlingEffectSummary> results)
{
	this->results = results;
}



