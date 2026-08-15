
/*
 * MoveMetaCategoryDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveMetaCategoryDetail_H_
#define TINY_CPP_CLIENT_MoveMetaCategoryDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "MoveMetaCategoryDescription.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveMetaCategoryDetail{
public:

    /*! \brief Constructor.
	 */
    MoveMetaCategoryDetail();
    MoveMetaCategoryDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveMetaCategoryDetail();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getId();

	/*! \brief Set 
	 */
	void setId(int  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::list<MoveMetaCategoryDescription> getDescriptions();

	/*! \brief Set 
	 */
	void setDescriptions(std::list <MoveMetaCategoryDescription> descriptions);
	/*! \brief Get 
	 */
	std::list<AbilityDetail_pokemon_inner_pokemon> getMoves();

	/*! \brief Set 
	 */
	void setMoves(std::list <AbilityDetail_pokemon_inner_pokemon> moves);


    private:
    int id{};
    std::string name{};
    std::list<MoveMetaCategoryDescription> descriptions;
    std::list<AbilityDetail_pokemon_inner_pokemon> moves;
};
}

#endif /* TINY_CPP_CLIENT_MoveMetaCategoryDetail_H_ */
