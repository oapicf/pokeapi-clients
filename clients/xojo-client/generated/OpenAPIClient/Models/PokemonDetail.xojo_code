#tag Class
Protected Class PokemonDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		base_experience As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		height As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		is_default As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		order As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		weight As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		abilities() As OpenAPIClient.Models.PokemonDetailAbilitiesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		past_abilities() As OpenAPIClient.Models.PokemonDetailPastAbilitiesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		forms() As OpenAPIClient.Models.PokemonFormSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		game_indices() As OpenAPIClient.Models.PokemonGameIndex
	#tag EndProperty


	#tag Property, Flags = &h0
		held_items As OpenAPIClient.Models.PokemonDetailHeldItems
	#tag EndProperty


	#tag Property, Flags = &h0
		location_area_encounters As String
	#tag EndProperty


	#tag Property, Flags = &h0
		moves() As OpenAPIClient.Models.PokemonDetailMovesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		species As OpenAPIClient.Models.PokemonSpeciesSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		sprites As PokemonDetailSprites
	#tag EndProperty


	#tag Property, Flags = &h0
		cries As OpenAPIClient.Models.PokemonDetailCries
	#tag EndProperty


	#tag Property, Flags = &h0
		stats() As OpenAPIClient.Models.PokemonStat
	#tag EndProperty


	#tag Property, Flags = &h0
		types() As OpenAPIClient.Models.PokemonDetailTypesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		past_types() As OpenAPIClient.Models.PokemonDetailPastTypesInner
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
			Type="PokemonDetailAbilitiesInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="past_abilities"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonDetailPastAbilitiesInner"
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
			Type="PokemonDetailHeldItems"
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
			Type="PokemonDetailMovesInner"
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
			Type="PokemonDetailSprites"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cries"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonDetailCries"
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
			Name="types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonDetailTypesInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="past_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="PokemonDetailPastTypesInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


