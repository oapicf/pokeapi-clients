#tag Class
Protected Class TypeDetail

	#tag Property, Flags = &h0
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		damage_relations As OpenAPIClient.Models.TypeDetailDamageRelations
	#tag EndProperty


	#tag Property, Flags = &h0
		past_damage_relations() As OpenAPIClient.Models.TypeDetailPastDamageRelationsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		game_indices() As OpenAPIClient.Models.TypeGameIndex
	#tag EndProperty


	#tag Property, Flags = &h0
		generation As OpenAPIClient.Models.GenerationSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		move_damage_class As OpenAPIClient.Models.MoveDamageClassSummary
	#tag EndProperty


	#tag Property, Flags = &h0
		names() As OpenAPIClient.Models.AbilityName
	#tag EndProperty


	#tag Property, Flags = &h0
		pokemon() As OpenAPIClient.Models.TypeDetailPokemonInner
	#tag EndProperty


	#tag Property, Flags = &h0
		moves() As OpenAPIClient.Models.MoveSummary
	#tag EndProperty


	#tag Property, Flags = &h0
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
			Type="TypeDetailDamageRelations"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="past_damage_relations"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeDetailPastDamageRelationsInner"
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
			Type="AbilityName"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="pokemon"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TypeDetailPokemonInner"
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


