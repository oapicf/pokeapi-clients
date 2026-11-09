#tag Class
Protected Class PokemonEvolution

	#tag Property, Flags = &h0
		#tag Note
			The version group in which these evolution requirements apply.
		#tag EndNote
		version_group As OpenAPIClient.Models.VersionGroupSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether the evolution is considered as the expected evolution in a main series game. Each unique Pokémon variety of a line capable of evolution should have exactly one 'default' evolution. For example, the Meowth species has three default evolutions as there are three distinct varieties it can evolve into: Persian, Alolan Persian, and Perrserker.
		#tag EndNote
		is_default As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The item required to cause evolution this into Pokémon species.
		#tag EndNote
		item As OpenAPIClient.Models.ItemSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The type of event that triggers evolution into this Pokémon species.
		#tag EndNote
		trigger As OpenAPIClient.Models.EvolutionTriggerSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The id of the gender of the evolving Pokémon species must be in order to evolve into this Pokémon species.
		#tag EndNote
		gender As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The item the evolving Pokémon species must be holding during the evolution trigger event to evolve into this Pokémon species.
		#tag EndNote
		held_item As OpenAPIClient.Models.ItemSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		known_move As OpenAPIClient.Models.PokemonEvolutionKnownMove
	#tag EndProperty


	#tag Property, Flags = &h0
		known_move_type As OpenAPIClient.Models.PokemonEvolutionKnownMove
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The location the evolution must be triggered at.
		#tag EndNote
		location As OpenAPIClient.Models.LocationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The minimum required level of the evolving Pokémon species to evolve into this Pokémon species.
		#tag EndNote
		min_level As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The minimum required level of happiness the evolving Pokémon species to evolve into this Pokémon species.
		#tag EndNote
		min_happiness As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The minimum required level of beauty the evolving Pokémon species to evolve into this Pokémon species.
		#tag EndNote
		min_beauty As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The minimum required level of affection the evolving Pokémon species to evolve into this Pokémon species.
		#tag EndNote
		min_affection As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not you need to be near a Moss Rock or Icy Rock to evolve into this Pokémon species.
		#tag EndNote
		near_special_rock As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not multiplayer link play is needed to evolve into this Pokémon species (e.g. Union Circle).
		#tag EndNote
		needs_multiplayer As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not it must be raining in the overworld to cause evolution this Pokémon species.
		#tag EndNote
		needs_overworld_rain As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Pokémon species that must be in the players party in order for the evolving Pokémon species to evolve into this Pokémon species.
		#tag EndNote
		party_species As OpenAPIClient.Models.PokemonSpeciesSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The player must have a Pokémon of this type in their party during the evolution trigger event in order for the evolving Pokémon species to evolve into this Pokémon species.
		#tag EndNote
		party_type As OpenAPIClient.Models.TypeSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The required relation between the Pokémon's Attack and Defense stats. 1 means Attack > Defense. 0 means Attack = Defense. -1 means Attack < Defense.
		#tag EndNote
		relative_physical_stats As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The required time of day. Day or night.
		#tag EndNote
		time_of_day As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Pokémon species for which this one must be traded.
		#tag EndNote
		trade_species As OpenAPIClient.Models.PokemonSpeciesSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether or not the 3DS needs to be turned upside-down as this Pokémon levels up.
		#tag EndNote
		turn_upside_down As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The required region in which this evolution can occur.
		#tag EndNote
		region As OpenAPIClient.Models.RegionSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Pokémon form required before evolving, or null if unrestricted.
		#tag EndNote
		required_pokemon_form As OpenAPIClient.Models.PokemonFormSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Pokémon form produced by this evolution, or null if unspecified.
		#tag EndNote
		evolved_pokemon_form As OpenAPIClient.Models.PokemonFormSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The move that must be used by the evolving Pokémon species during the evolution trigger event in order to evolve into this Pokémon species.
		#tag EndNote
		used_move As OpenAPIClient.Models.MoveSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The minimum number of times a move must be used in order to evolve into this Pokémon species.
		#tag EndNote
		min_move_count As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The minimum number of steps that must be taken in order to evolve into this Pokémon species.
		#tag EndNote
		min_steps As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The minimum amount of damage taken during the evolution trigger event in order to evolve into this Pokémon species.
		#tag EndNote
		min_damage_taken As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The natures that allow this evolution, or null if unrestricted.
		#tag EndNote
		allowed_natures() As OpenAPIClient.Models.NatureSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An additional evolution condition expressed in reverse Polish notation, or null if none.
		#tag EndNote
		condition_expression As OpenAPIClient.Models.EvolutionConditionExpression
	#tag EndProperty





	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="version_group"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="VersionGroupSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="is_default"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="item"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="trigger"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EvolutionTriggerSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="gender"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="held_item"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ItemSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="known_move"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonEvolutionKnownMove"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="known_move_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonEvolutionKnownMove"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="location"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="LocationSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="min_level"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="min_happiness"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="min_beauty"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="min_affection"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="near_special_rock"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="needs_multiplayer"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="needs_overworld_rain"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="party_species"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="party_type"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="relative_physical_stats"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="time_of_day"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="trade_species"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="turn_upside_down"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="region"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RegionSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="required_pokemon_form"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonFormSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="evolved_pokemon_form"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonFormSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="used_move"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="min_move_count"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="min_steps"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="min_damage_taken"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="allowed_natures"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="NatureSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="condition_expression"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="EvolutionConditionExpression"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


