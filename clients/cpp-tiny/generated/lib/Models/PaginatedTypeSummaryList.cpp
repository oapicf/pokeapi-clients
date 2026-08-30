

#include "PaginatedTypeSummaryList.h"

using namespace Tiny;

PaginatedTypeSummaryList::PaginatedTypeSummaryList()
{
	count = int(0);
	next = std::string();
	previous = std::string();
	results = std::list<TypeSummary>();
}

PaginatedTypeSummaryList::PaginatedTypeSummaryList(std::string jsonString)
{
	this->fromJson(jsonString);
}

PaginatedTypeSummaryList::~PaginatedTypeSummaryList()
{

}

void
PaginatedTypeSummaryList::fromJson(std::string jsonObj)
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


        std::list<TypeSummary> results_list;
        TypeSummary element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            results_list.push_back(element);
        }
        results = results_list;


    }


}

bourne::json
PaginatedTypeSummaryList::toJson()
{
    bourne::json object = bourne::json::object();





    object["count"] = getCount();






    object["next"] = getNext();






    object["previous"] = getPrevious();





    std::list<TypeSummary> results_list = getResults();
    bourne::json results_arr = bourne::json::array();

    for(auto& var : results_list)
    {
        TypeSummary obj = var;
        results_arr.append(obj.toJson());
    }
    object["results"] = results_arr;




    return object;

}

int
PaginatedTypeSummaryList::getCount()
{
	return count;
}

void
PaginatedTypeSummaryList::setCount(int count)
{
	this->count = count;
}

std::string
PaginatedTypeSummaryList::getNext()
{
	return next;
}

void
PaginatedTypeSummaryList::setNext(std::string next)
{
	this->next = next;
}

std::string
PaginatedTypeSummaryList::getPrevious()
{
	return previous;
}

void
PaginatedTypeSummaryList::setPrevious(std::string previous)
{
	this->previous = previous;
}

std::list<TypeSummary>
PaginatedTypeSummaryList::getResults()
{
	return results;
}

void
PaginatedTypeSummaryList::setResults(std::list<TypeSummary> results)
{
	this->results = results;
}



