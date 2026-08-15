
/*
 * MoveMetaAilmentDetail.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveMetaAilmentDetail_H_
#define TINY_CPP_CLIENT_MoveMetaAilmentDetail_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"
#include "MoveMetaAilmentName.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveMetaAilmentDetail{
public:

    /*! \brief Constructor.
	 */
    MoveMetaAilmentDetail();
    MoveMetaAilmentDetail(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveMetaAilmentDetail();


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
	std::list<AbilityDetail_pokemon_inner_pokemon> getMoves();

	/*! \brief Set 
	 */
	void setMoves(std::list <AbilityDetail_pokemon_inner_pokemon> moves);
	/*! \brief Get 
	 */
	std::list<MoveMetaAilmentName> getNames();

	/*! \brief Set 
	 */
	void setNames(std::list <MoveMetaAilmentName> names);


    private:
    int id{};
    std::string name{};
    std::list<AbilityDetail_pokemon_inner_pokemon> moves;
    std::list<MoveMetaAilmentName> names;
};
}

#endif /* TINY_CPP_CLIENT_MoveMetaAilmentDetail_H_ */
