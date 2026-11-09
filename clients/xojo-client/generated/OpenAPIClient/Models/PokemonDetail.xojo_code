#tag Class
Protected Class PokemonDetail

	#tag Property, Flags = &h0
		#tag Note
			The identifier for this resource.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name for this resource.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The base experience gained for defeating this Pokémon.
		#tag EndNote
		base_experience As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The height of this Pokémon in decimetres.
		#tag EndNote
		height As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set for exactly one Pokémon used as the default for each species.
		#tag EndNote
		is_default As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Order for sorting. Almost national order, except families are grouped together.
		#tag EndNote
		order As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The weight of this Pokémon in hectograms.
		#tag EndNote
		weight As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of abilities this Pokémon could potentially have.
		#tag EndNote
		abilities() As OpenAPIClient.Models.PokemonAbility
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of details showing abilities this pokémon had in previous generations
		#tag EndNote
		past_abilities() As OpenAPIClient.Models.PokemonPastAbility
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of forms this Pokémon can take on.
		#tag EndNote
		forms() As OpenAPIClient.Models.PokemonFormSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of game indices relevent to Pokémon item by generation.
		#tag EndNote
		game_indices() As OpenAPIClient.Models.PokemonGameIndex
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of items this Pokémon may be holding when encountered.
		#tag EndNote
		held_items() As OpenAPIClient.Models.PokemonHeldItemSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A link to a list of location areas, as well as encounter details pertaining to specific versions.
		#tag EndNote
		location_area_encounters As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of moves along with learn methods and level details pertaining to specific version groups.
		#tag EndNote
		moves() As OpenAPIClient.Models.PokemonMove
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The species this Pokémon belongs to.
		#tag EndNote
		species As OpenAPIClient.Models.PokemonSpeciesSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A set of sprites used to depict this Pokémon in the game. A visual representation of the various sprites can be found at <a href='https://github.com/PokeAPI/sprites#sprites'>PokeAPI/sprites</a>
		#tag EndNote
		sprites As OpenAPIClient.Models.PokemonSprites
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A set of cries used to depict this Pokémon in the game. A visual representation of the various cries can be found at <a href='https://github.com/PokeAPI/cries#cries'>PokeAPI/cries</a>
		#tag EndNote
		cries As OpenAPIClient.Models.PokemonCries
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of base stat values for this Pokémon.
		#tag EndNote
		stats() As OpenAPIClient.Models.PokemonStat
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of details showing stats this pokémon had in previous generations
		#tag EndNote
		past_stats() As OpenAPIClient.Models.PokemonPastStat
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of details showing types this Pokémon has.
		#tag EndNote
		types() As OpenAPIClient.Models.PokemonType
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of details showing types this pokémon had in previous generations
		#tag EndNote
		past_types() As OpenAPIClient.Models.PokemonPastType
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="base_experience"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="height"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
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
			Name="order"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="weight"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="abilities"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonAbility"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="past_abilities"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonPastAbility"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="forms"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonFormSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="game_indices"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonGameIndex"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="held_items"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonHeldItemSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="location_area_encounters"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="moves"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonMove"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="species"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSpeciesSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sprites"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonSprites"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonCries"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="stats"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonStat"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="past_stats"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonPastStat"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonType"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="past_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonPastType"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


