
/*
 * NatureBattleStylePreference.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_NatureBattleStylePreference_H_
#define TINY_CPP_CLIENT_NatureBattleStylePreference_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "MoveBattleStyleSummary.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class NatureBattleStylePreference{
public:

    /*! \brief Constructor.
	 */
    NatureBattleStylePreference();
    NatureBattleStylePreference(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~NatureBattleStylePreference();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Chance of using the move, in percent, if HP is under one half.
	 */
	int getLowHpPreference();

	/*! \brief Set Chance of using the move, in percent, if HP is under one half.
	 */
	void setLowHpPreference(int low_hp_preference);
	/*! \brief Get Chance of using the move, in percent, if HP is over one half.
	 */
	int getHighHpPreference();

	/*! \brief Set Chance of using the move, in percent, if HP is over one half.
	 */
	void setHighHpPreference(int high_hp_preference);
	/*! \brief Get The move battle style.
	 */
	MoveBattleStyleSummary getMoveBattleStyle();

	/*! \brief Set The move battle style.
	 */
	void setMoveBattleStyle(MoveBattleStyleSummary move_battle_style);


    private:
    int low_hp_preference{};
    int high_hp_preference{};
    MoveBattleStyleSummary move_battle_style;
};
}

#endif /* TINY_CPP_CLIENT_NatureBattleStylePreference_H_ */
