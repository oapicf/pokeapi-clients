
/*
 * MoveChange_effect_entries_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_MoveChange_effect_entries_inner_H_
#define TINY_CPP_CLIENT_MoveChange_effect_entries_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AbilityDetail_pokemon_inner_pokemon.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class MoveChange_effect_entries_inner{
public:

    /*! \brief Constructor.
	 */
    MoveChange_effect_entries_inner();
    MoveChange_effect_entries_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~MoveChange_effect_entries_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getEffect();

	/*! \brief Set 
	 */
	void setEffect(std::string  effect);
	/*! \brief Get 
	 */
	std::string getShortEffect();

	/*! \brief Set 
	 */
	void setShortEffect(std::string  short_effect);
	/*! \brief Get 
	 */
	AbilityDetail_pokemon_inner_pokemon getLanguage();

	/*! \brief Set 
	 */
	void setLanguage(AbilityDetail_pokemon_inner_pokemon  language);


    private:
    std::string effect{};
    std::string short_effect{};
    AbilityDetail_pokemon_inner_pokemon language;
};
}

#endif /* TINY_CPP_CLIENT_MoveChange_effect_entries_inner_H_ */
