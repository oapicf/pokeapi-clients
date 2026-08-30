
/*
 * ItemGameIndex.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ItemGameIndex_H_
#define TINY_CPP_CLIENT_ItemGameIndex_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "GenerationSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ItemGameIndex{
public:

    /*! \brief Constructor.
	 */
    ItemGameIndex();
    ItemGameIndex(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ItemGameIndex();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getGameIndex();

	/*! \brief Set 
	 */
	void setGameIndex(int game_index);
	/*! \brief Get 
	 */
	GenerationSummary getGeneration();

	/*! \brief Set 
	 */
	void setGeneration(GenerationSummary generation);


    private:
    int game_index{};
    GenerationSummary generation;
};
}

#endif /* TINY_CPP_CLIENT_ItemGameIndex_H_ */
