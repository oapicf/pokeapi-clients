#tag Class
Protected Class TypeDetail

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
			A detail of how effective this type is toward others and vice versa.
		#tag EndNote
		damage_relations As OpenAPIClient.Models.TypeRelationships
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of details of how effective this type was toward others and vice versa in previous generations
		#tag EndNote
		past_damage_relations() As OpenAPIClient.Models.TypePastRelationships
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of game indices relevent to this item by generation.
		#tag EndNote
		game_indices() As OpenAPIClient.Models.TypeGameIndex
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The generation this type was introduced in.
		#tag EndNote
		generation As OpenAPIClient.Models.GenerationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The class of damage inflicted by this type.
		#tag EndNote
		move_damage_class As OpenAPIClient.Models.MoveDamageClassSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of this resource listed in different languages.
		#tag EndNote
		names() As OpenAPIClient.Models.TypeName
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of details of Pokémon that have this type.
		#tag EndNote
		pokemon() As OpenAPIClient.Models.TypePokemon
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of moves that have this type.
		#tag EndNote
		moves() As OpenAPIClient.Models.MoveSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null.
		#tag EndNote
		sprites As Dictionary
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
			Name="damage_relations"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeRelationships"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="past_damage_relations"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypePastRelationships"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="game_indices"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeGameIndex"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="generation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="GenerationSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="move_damage_class"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveDamageClassSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="names"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokemon"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypePokemon"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="moves"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MoveSummary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sprites"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


